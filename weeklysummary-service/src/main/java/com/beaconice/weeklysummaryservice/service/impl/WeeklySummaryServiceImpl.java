package com.beaconice.weeklysummaryservice.service.impl;

import com.beaconice.weeklysummaryservice.client.TimeSheetServiceClient;
import com.beaconice.weeklysummaryservice.domain.TimeSheetRequest;
import com.beaconice.weeklysummaryservice.domain.mongodoc.TimeSheetManagement;
import com.beaconice.weeklysummaryservice.repository.TimeSheetManagementRepository;
import com.beaconice.weeklysummaryservice.service.WeeklySummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void getWeeklySummary() {
        System.out.println("get");
        TimeSheetRequest timeSheetRequest = TimeSheetRequest.builder()
                .username("test").build();
        timeSheetServiceClient.getTimeSheets(timeSheetRequest);
        System.out.println(timeSheetManagementRepository.findByUsername("test"));
    }

}
