package com.beaconice.weeklysummaryservice.entity;

import com.beaconice.weeklysummaryservice.domain.common.Day;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeeklySummary {

    private String weekEnding;

    private int hours;

    private String submissionStatus;

    private String approvalStatus;

    private String comment;

    private List<Day> timeSheet;

}
