package com.beaconice.timesheetservice.domain;

import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import com.beaconice.timesheetservice.entity.mongodoc.WeeklySummary;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TimeSheetGetResponse {
    private List<Day> timeSheet;
    private List<WeeklySummary> weeklySummary;
}
