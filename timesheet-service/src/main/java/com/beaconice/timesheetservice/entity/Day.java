package com.beaconice.timesheetservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Day {
    private String day;
    private String startTime;
    private String endTime;
    private int hours;
    private int vacation;
    private int floatDay;
    private int holiday;
}
