package com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain;

import com.beaconice.weeklysummaryservice.domain.common.Day;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendTimeSheetPostResponse {

    private List<Day> timeSheet;

}
