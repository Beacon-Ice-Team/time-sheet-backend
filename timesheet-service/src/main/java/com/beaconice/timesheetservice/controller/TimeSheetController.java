package com.beaconice.timesheetservice.controller;


import com.beaconice.timesheetservice.client.SummaryClient;
import com.beaconice.timesheetservice.domain.*;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import com.beaconice.timesheetservice.entity.mongodoc.WeeklySummary;
import com.beaconice.timesheetservice.repository.TimeSheetRepository;
import com.beaconice.timesheetservice.service.TimeSheetService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/time-sheet")
@Api("time sheet controller")
public class TimeSheetController {

    private TimeSheetRepository timeSheetRepository;
    private SummaryClient summaryClient;
    private TimeSheetService timeSheetServiceImpl;

    @Autowired
    public void setTimeSheetRepository(TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    @Autowired
    public void setSummaryClient(SummaryClient summaryClient) {
        this.summaryClient = summaryClient;
    }

    @Autowired
    public void setTimeSheetServiceImpl(TimeSheetService timeSheetServiceImpl) {
        this.timeSheetServiceImpl = timeSheetServiceImpl;
    }

    @PostMapping(value = "/default")
    public ToWeeklySummaryPostResponse getDefaultWeekByUsername(@RequestBody FromWeeklySummaryPostRequest fromWeeklySummaryPostRequest) { //testing get from backend
        System.out.println("going to mongo");

        return timeSheetServiceImpl.getDefaultTimeSheet(fromWeeklySummaryPostRequest);
    }

    @PostMapping(value = "/update")
    public TimeSheet changeDefaultWeekByUsername(@RequestBody SubmitTimeSheetRequest submitTimeSheetRequest) { //testing get from backend
        System.out.println("updating mongo");
        String username = "test";
        TimeSheetManagement user = timeSheetRepository.findByUsername(username).orElse(null);
        user.setTimeSheet(submitTimeSheetRequest.getTimeSheet());
        timeSheetRepository.save(user);
        TimeSheet newDefaultWeek = new TimeSheet(user.getTimeSheet());
        return newDefaultWeek;
    }


    @GetMapping(value = "/view")
    public ResponseEntity<Object> viewWeek(HttpServletRequest httpServletRequest) {
        ResponseEntity<Object> responseEntity = null;
        String username = "test";

        TimeSheetGetResponse timeSheetGetResponse = new TimeSheetGetResponse();

        List<Day> timeSheet = timeSheetServiceImpl.showWeeklyTimeSheet(username);
        System.out.println(timeSheet);
        timeSheetGetResponse.setTimeSheet(timeSheet);

        return responseEntity.ok().body(timeSheetGetResponse);
    }

    @PostMapping(value = "/view")
    public TimeSheet chooseWeek(@RequestBody Request req) {
        String username = "test";
        System.out.println("getting new week");
        System.out.println(req.getWeekEnding());
        TimeSheet timeSheet = timeSheetServiceImpl.getWeek(username, req.getWeekEnding());
        return timeSheet;
    }

    @PostMapping(value = "/submit")
    public String submitWeek(@RequestBody SubmitTimeSheetRequest req) {
        String username = "test";
        System.out.println(req.getWeekEnding());
        System.out.println(req.getTimeSheet());
        timeSheetServiceImpl.submitWeek(username, req.getWeekEnding(), req.getTimeSheet());
        return "submitted";
    }

    @GetMapping(value = "/weeks")
    public ResponseEntity<Object> getWeeks(HttpServletRequest httpServletRequest) {
        System.out.println("getting weeks");
        ResponseEntity<Object> responseEntity = null;

        TimeSheetGetResponse timeSheetGetResponse = new TimeSheetGetResponse();
        String username = "test";

        List<WeeklySummary> weeklySummary = timeSheetServiceImpl.getWeeks(username);
        timeSheetGetResponse.setWeeklySummary(weeklySummary);

        return responseEntity.ok().body(timeSheetGetResponse);
    }
}