package com.beaconice.timesheetservice.entity.days;

import com.beaconice.timesheetservice.entity.Day;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Saturday implements Day {
    private String startTime = "N/A";
    private String endTime = "N/A";
    private int hours = 0;
    private int vacation = 0;
    private int floatDay = 0;
    private int holiday = 0;
}
