package com.beaconice.timesheetservice.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ToWeeklySummaryPostRequest {
    private String username;
}
