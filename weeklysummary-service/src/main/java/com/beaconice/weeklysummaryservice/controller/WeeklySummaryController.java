package com.beaconice.weeklysummaryservice.controller;

import com.beaconice.weeklysummaryservice.service.WeeklySummaryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value = "/time-sheet")
@Api("Weekly Summary Controller")
public class WeeklySummaryController {

    private WeeklySummaryService weeklySummaryService;

    @Autowired
    public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService) {
        this.weeklySummaryService = weeklySummaryService;
    }

    @GetMapping(value = "/weekly-summary")
    public ResponseEntity<Object> getWeeklySummary(){
        ResponseEntity<Object> responseEntity;

        weeklySummaryService.getWeeklySummary();

        responseEntity = ResponseEntity.ok()
        .body("success");

        return responseEntity;
    }

}
