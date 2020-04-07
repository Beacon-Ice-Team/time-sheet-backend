package com.beaconice.weeklysummaryservice.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeeklySummaryGetResponse {

    private List<WeeklySummaryRecord> weeklySummaryRecordList;

}
