package com.beaconice.timesheetservice.entity.mongodoc;

import com.beaconice.timesheetservice.domain.Day;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
