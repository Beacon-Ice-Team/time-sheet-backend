package com.beaconice.timesheetservice.entity.mongodoc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

    private TimeSheet timeSheet;
}
