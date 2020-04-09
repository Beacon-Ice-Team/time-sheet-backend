package com.beaconice.timesheetservice.service.impl;

import com.beaconice.timesheetservice.client.SummaryClient;
import com.beaconice.timesheetservice.domain.*;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import com.beaconice.timesheetservice.entity.mongodoc.WeeklySummary;
import com.beaconice.timesheetservice.repository.TimeSheetRepository;
import com.beaconice.timesheetservice.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeSheetServiceImp implements TimeSheetService {
    TimeSheetRepository repository;

    SummaryClient client;

    @Autowired
    public void setRepository(TimeSheetRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setClient(SummaryClient client) {
        this.client = client;
    }

    @Override
    public ToWeeklySummaryPostResponse getDefaultTimeSheet(FromWeeklySummaryPostRequest fromWeeklySummaryPostRequest) {
        ToWeeklySummaryPostResponse response = new ToWeeklySummaryPostResponse();
        TimeSheetManagement user = repository.findByUsername(fromWeeklySummaryPostRequest.getUsername()).orElse(null);
        response.setTimeSheet(user.getTimeSheet());
        return response;
    }

    @Override
    public List<Day> showWeeklyTimeSheet(String username) {
        ToWeeklySummaryPostRequest weeklySummaryPostRequest = ToWeeklySummaryPostRequest.builder().username(username).build();
        FromWeeklySummaryPostResponse response = client.getTimeSheetWeek(weeklySummaryPostRequest);
        List<Day> timeSheet = response.getTimeSheet();
        System.out.println(timeSheet);
        return timeSheet;
    }

    @Override
    public TimeSheet getWeek(String username, String weekEnding) {
        System.out.println("in service");
        TimeSheetManagement user = repository.findByUsername(username).orElse(null);//fails here
        System.out.println("got user");
        List<WeeklySummary> weeklySummaries = user.getWeeklySummary();
        System.out.println("got summaries");
        TimeSheet timeSheet = new TimeSheet();
        List<Day> dayList = new ArrayList<>();
        for(int i = 0; i < weeklySummaries.size(); i++) {
//            System.out.println(weeklySummaries.get(i).getWeekEnding());
            if(weeklySummaries.get(i).getWeekEnding().equals(weekEnding)) {
                dayList = weeklySummaries.get(i).getTimeSheet();
            }
        }
        timeSheet.setTimeSheet(dayList);
        return timeSheet;
    }

    @Override
    public void submitWeek(String username, String weekEnding, List<Day> timeSheet) {
        TimeSheetManagement user = repository.findByUsername(username).orElse(null);
        List<WeeklySummary> weeklySummaries = user.getWeeklySummary();
        for(int i = 0; i < weeklySummaries.size(); i++) {
            if(weeklySummaries.get(i).getWeekEnding().equals(weekEnding)) {
                weeklySummaries.get(i).setTimeSheet(timeSheet);
            }
        }
        user.setWeeklySummary(weeklySummaries);
        repository.save(user);
    }

    @Override
    public List<WeeklySummary> getWeeks(String username) {
        TimeSheetManagement user = repository.findByUsername(username).orElse(null);
        System.out.println(user.getWeeklySummary());
        return user.getWeeklySummary();
    }
}
