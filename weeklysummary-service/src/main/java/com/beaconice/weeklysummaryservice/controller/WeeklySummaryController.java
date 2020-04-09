package com.beaconice.weeklysummaryservice.controller;

import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.SendTimeSheetPostRequest;
import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.SendTimeSheetPostResponse;
import com.beaconice.weeklysummaryservice.domain.WeeklySummaryGetResponse;
import com.beaconice.weeklysummaryservice.domain.WeeklySummaryRecord;
import com.beaconice.weeklysummaryservice.domain.common.Day;
import com.beaconice.weeklysummaryservice.service.WeeklySummaryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/weekly-summary")
@Api("Weekly Summary Controller")
public class WeeklySummaryController {

    private WeeklySummaryService weeklySummaryService;

    @Autowired
    public void setWeeklySummaryService(WeeklySummaryService weeklySummaryService) {
        this.weeklySummaryService = weeklySummaryService;
    }

    @GetMapping(value = "/default")
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

    @PostMapping(value = "/feign-time-sheet")
    public SendTimeSheetPostResponse postFeignTimeSheet(@RequestBody SendTimeSheetPostRequest sendTimeSheetPostRequest){
        SendTimeSheetPostResponse sendTimeSheetPostResponse = new SendTimeSheetPostResponse();
        String username = sendTimeSheetPostRequest.getUsername();
        List<Day> dayList = weeklySummaryService.postFeignTimeSheet(username);
        sendTimeSheetPostResponse.setTimeSheet(dayList);
        return sendTimeSheetPostResponse;
    }

}
