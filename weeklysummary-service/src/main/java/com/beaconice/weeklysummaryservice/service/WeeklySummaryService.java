package com.beaconice.weeklysummaryservice.service;

import com.beaconice.weeklysummaryservice.domain.WeeklySummaryRecord;
import com.beaconice.weeklysummaryservice.domain.common.Day;

import java.util.List;

public interface WeeklySummaryService {

    List<WeeklySummaryRecord> getWeeklySummary(String username);

    List<Day> postFeignTimeSheet(String username);

}
