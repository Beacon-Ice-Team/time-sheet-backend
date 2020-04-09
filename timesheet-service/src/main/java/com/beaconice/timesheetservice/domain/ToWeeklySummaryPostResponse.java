package com.beaconice.timesheetservice.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ToWeeklySummaryPostResponse {
    private List<Day> timeSheet;
}
