package com.beaconice.timesheetservice.entity.mongodoc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class DaysOff {

    private int floatDay;

    private int vacation;
}
