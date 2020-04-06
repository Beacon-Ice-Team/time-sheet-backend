package com.beaconice.timesheetservice.entity.mongodoc;

import com.beaconice.timesheetservice.entity.days.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class TimeSheet {
    private Sunday sunday;
    private Monday monday;
    private Tuesday tuesday;
    private Wednesday wednesday;
    private Thursday thursday;
    private Friday friday;
    private Saturday saturday;
}
