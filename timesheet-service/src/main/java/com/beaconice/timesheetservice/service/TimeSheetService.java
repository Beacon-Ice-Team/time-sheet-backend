package com.beaconice.timesheetservice.service;

import com.beaconice.timesheetservice.domain.Day;
import com.beaconice.timesheetservice.domain.FromWeeklySummaryPostRequest;
import com.beaconice.timesheetservice.domain.ToWeeklySummaryPostResponse;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;

import java.util.List;

public interface TimeSheetService {

    ToWeeklySummaryPostResponse getDefaultTimeSheet(FromWeeklySummaryPostRequest fromWeeklySummaryPostRequest);

    TimeSheet showWeeklyTimeSheet(String username);

    TimeSheet getWeek(String username, String weekEnding);

    void submitWeek(String username, String weekEnding, List<Day> timeSheet);
}
