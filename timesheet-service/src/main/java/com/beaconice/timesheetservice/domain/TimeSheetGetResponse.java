package com.beaconice.timesheetservice.domain;

import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TimeSheetGetResponse {
    private TimeSheet timeSheet;
}
