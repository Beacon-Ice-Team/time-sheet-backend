package com.beaconice.weeklysummaryservice.domain.common;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Day {

    private String day;

    private String startTime;

    private String endTime;

    private int hours;

    private int vacation;

    private int floatDay;

    private int holiday;

}
