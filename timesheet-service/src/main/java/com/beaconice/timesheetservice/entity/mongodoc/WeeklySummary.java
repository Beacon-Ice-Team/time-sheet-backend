package com.beaconice.timesheetservice.entity.mongodoc;

import com.beaconice.timesheetservice.domain.Day;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class WeeklySummary {

    private String weekEnding;

    private int hours;

    private String submissionStatus;

    private String approvalStatus;

    private String comment;

    private List<Day> timeSheet;
//    private TimeSheet timeSheet;
}
