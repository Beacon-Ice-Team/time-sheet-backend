package com.beaconice.timesheetservice.entity;

import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class SaveSummaryRequest {

    private String username;

    private String weekEnding;

    private TimeSheet timeSheet;
}
