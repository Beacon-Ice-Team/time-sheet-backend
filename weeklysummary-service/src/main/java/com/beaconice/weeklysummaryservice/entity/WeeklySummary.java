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

    private String submission;

    private String approval;

    private String comment;

    private String submissionTag;

    private String commentTag;

    private List<Day> timeSheet;

}
