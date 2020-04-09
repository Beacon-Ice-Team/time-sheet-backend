package com.beaconice.weeklysummaryservice.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeeklySummaryRecord {

    private String weekEnding;

    private int hours;

    private String submissionStatus;

    private String approvalStatus;

    private String comment;

}
