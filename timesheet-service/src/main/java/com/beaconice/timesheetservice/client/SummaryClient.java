package com.beaconice.timesheetservice.client;

import com.beaconice.timesheetservice.entity.SaveSummaryRequest;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "summary")
public interface SummaryClient {

    @RequestLine("GET")
    @RequestMapping("/time-sheet-management/test")//need to add request sent object is (SaveSummaryRequest saveSummaryRequest)
    void saveTimeSheetWeek();
}
