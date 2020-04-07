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
public class Thursday implements Day {
    private String startTime = "9:00 AM";
    private String endTime = "6:00 PM";
    private int hours = 8;
    private int vacation = 0;
    private int floatDay = 0;
    private int holiday = 0;
}
