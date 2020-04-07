package com.beaconice.timesheetservice.entity.mongodoc;

import com.beaconice.timesheetservice.entity.Day;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class TimeSheet {
//    private Sunday sunday;
//    private Monday monday;
//    private Tuesday tuesday;
//    private Wednesday wednesday;
//    private Thursday thursday;
//    private Friday friday;
//    private Saturday saturday;

    private List<Day> timeSheet;
}
