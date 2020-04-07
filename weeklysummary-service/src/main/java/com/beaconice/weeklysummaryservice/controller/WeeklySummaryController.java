package com.beaconice.weeklysummaryservice.controller;

import com.beaconice.weeklysummaryservice.domain.WeeklySummaryGetResponse;
import com.beaconice.weeklysummaryservice.domain.WeeklySummaryRecord;
import com.beaconice.weeklysummaryservice.service.WeeklySummaryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController(value = "/time-sheet")
@Api("Weekly Summary Controller")
public class WeeklySummaryController {

    private WeeklySummaryService weeklySummaryService;

    @Autowired
    public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService) {
        this.weeklySummaryService = weeklySummaryService;
    }

    @GetMapping(value = "/weekly-summary")
    public ResponseEntity<Object> getWeeklySummary(HttpServletRequest httpServletRequest){
        ResponseEntity<Object> responseEntity;
        WeeklySummaryGetResponse weeklySummaryGetResponse = new WeeklySummaryGetResponse();
        String username = "test";

        List<WeeklySummaryRecord> weeklySummaryRecordList = weeklySummaryService.getWeeklySummary(username);
        weeklySummaryGetResponse.setWeeklySummaryRecordList(weeklySummaryRecordList);

        responseEntity = ResponseEntity.ok()
        .body(weeklySummaryGetResponse);

        return responseEntity;
    }

}
