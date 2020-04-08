package com.beaconice.timesheetservice.domain;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class SubmitTimeSheetRequest {

    private String weekEnding;

    private List<Day> timeSheet;
}
