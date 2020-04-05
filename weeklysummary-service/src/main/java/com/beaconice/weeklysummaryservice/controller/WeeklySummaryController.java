package com.beaconice.weeklysummaryservice.controller;

import com.beaconice.weeklysummaryservice.entity.TimeSheetManagement;
import com.beaconice.weeklysummaryservice.repository.TimeSheetManagementRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController(value = "/time-sheet-management")
@Api("Weekly Summary Controller")
public class WeeklySummaryController {

    private TimeSheetManagementRepository timeSheetManagementRepository;

    @Autowired
    public void setTimeSheetManagementRepository(TimeSheetManagementRepository timeSheetManagementRepository) {
        this.timeSheetManagementRepository = timeSheetManagementRepository;
    }

    @GetMapping(value = "/weekly-summary")
    public ResponseEntity<Object> getWeeklySummary(HttpServletRequest httpServletRequest){
        ResponseEntity<Object> responseEntity;

        String username = "test";

        TimeSheetManagement timeSheetManagement = timeSheetManagementRepository.findByUsername(username).orElse(null);

        responseEntity = ResponseEntity.ok()
        .body(timeSheetManagement);

        return responseEntity;
    }

}
