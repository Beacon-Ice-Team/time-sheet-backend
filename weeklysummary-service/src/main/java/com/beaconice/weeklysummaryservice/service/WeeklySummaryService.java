package com.beaconice.weeklysummaryservice.service;

import com.beaconice.weeklysummaryservice.domain.WeeklySummaryRecord;

import java.util.List;

public interface WeeklySummaryService {

    List<WeeklySummaryRecord> getWeeklySummary(String username);

}
