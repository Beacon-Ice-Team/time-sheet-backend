package com.beaconice.weeklysummaryservice.entity;

import lombok.*;

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

}
