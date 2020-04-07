package com.beaconice.weeklysummaryservice.domain.days;

import com.beaconice.weeklysummaryservice.domain.Day;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Sunday implements Day {
    private String startTime = "N/A";
    private String endTime = "N/A";
    private int hours = 0;
    private int vacation = 0;
    private int floatDay = 0;
    private int holiday = 0;
}
