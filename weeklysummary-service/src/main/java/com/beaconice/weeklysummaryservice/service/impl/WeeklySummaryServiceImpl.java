package com.beaconice.weeklysummaryservice.service.impl;

import com.beaconice.weeklysummaryservice.client.TimeSheetServiceClient;
import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.TimeSheetPostRequest;
import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.TimeSheetPostResponse;
import com.beaconice.weeklysummaryservice.domain.WeeklySummaryRecord;
import com.beaconice.weeklysummaryservice.domain.common.Day;
import com.beaconice.weeklysummaryservice.entity.TimeSheetManagement;
import com.beaconice.weeklysummaryservice.entity.WeeklySummary;
import com.beaconice.weeklysummaryservice.repository.TimeSheetManagementRepository;
import com.beaconice.weeklysummaryservice.service.WeeklySummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import static com.beaconice.weeklysummaryservice.constant.enums.WeeklySummaryApprovalStatusEnums.NOT_APPROVED;
import static com.beaconice.weeklysummaryservice.constant.enums.WeeklySummarySubmissionStatusEnums.INCOMPLETE;
import static com.beaconice.weeklysummaryservice.constant.enums.WeeklySummarySubmissionStatusEnums.NOT_STARTED;

@Service
public class WeeklySummaryServiceImpl implements WeeklySummaryService {

    private TimeSheetServiceClient timeSheetServiceClient;

    private TimeSheetManagementRepository timeSheetManagementRepository;

    @Autowired
    public void setTimeSheetServiceClient(TimeSheetServiceClient timeSheetServiceClient) {
        this.timeSheetServiceClient = timeSheetServiceClient;
    }

    @Autowired
    public void setTimeSheetManagementRepository(TimeSheetManagementRepository timeSheetManagementRepository) {
        this.timeSheetManagementRepository = timeSheetManagementRepository;
    }

    @Override
    public List<WeeklySummaryRecord> getWeeklySummary(String username) {
        List<WeeklySummaryRecord> weeklySummaryRecordList = new ArrayList<>();
        TimeSheetManagement timeSheetManagement = timeSheetManagementRepository.findByUsername(username).orElse(null);

        TimeSheetPostRequest timeSheetPostRequest = TimeSheetPostRequest.builder()
                .username(username)
                .build();
        TimeSheetPostResponse timeSheetPostResponse = timeSheetServiceClient.getTimeSheets(timeSheetPostRequest);
        List<Day> dayList = timeSheetPostResponse.getDayList();

        if (timeSheetManagement != null) {
            List<WeeklySummary> weeklySummaryList = timeSheetManagement.getWeeklySummaryList();

            for (WeeklySummary weeklySummary : weeklySummaryList){
                WeeklySummaryRecord weeklySummaryRecord = WeeklySummaryRecord.builder()
                        .weekEnding(weeklySummary.getWeekEnding())
                        .totalHours(weeklySummary.getHours())
                        .submissionStatus(weeklySummary.getSubmission())
                        .approvalStatus(weeklySummary.getApproval())
                        .comment(weeklySummary.getComment())
                        .build();
                weeklySummaryRecordList.add(weeklySummaryRecord);
            }
        }

        WeeklySummaryRecord weeklySummaryRecord = weeklySummaryRecordList.get(weeklySummaryRecordList.size()-1);
        if (weeklySummaryRecord.getSubmissionStatus() != NOT_STARTED.getStr()) {
            String weekEnding = weeklySummaryRecord.getWeekEnding();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate weekEndingLocalDate = LocalDate.parse(weekEnding, dateTimeFormatter);
            LocalDate nextWeekEnding = weekEndingLocalDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

            int totalHour = 0;
            String submissionStatus = NOT_STARTED.getStr();
            for (Day day : dayList) {
                totalHour += day.getHours();
                if (day.getHoliday() == 1 || day.getFloatDay() == 1 || day.getVacation() == 1) {
                    submissionStatus = INCOMPLETE.getStr();
                }
            }

            WeeklySummaryRecord newRecord = WeeklySummaryRecord.builder()
                    .weekEnding(nextWeekEnding.toString())
                    .totalHours(totalHour)
                    .submissionStatus(submissionStatus)
                    .approvalStatus(NOT_APPROVED.getStr())
                    .comment("")
                    .build();
            weeklySummaryRecordList.add(newRecord);
        }

        return weeklySummaryRecordList;
    }

}
