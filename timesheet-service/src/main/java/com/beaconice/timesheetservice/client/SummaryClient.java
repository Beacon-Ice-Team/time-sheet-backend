package com.beaconice.timesheetservice.client;

import com.beaconice.timesheetservice.domain.ToWeeklySummaryPostRequest;
import com.beaconice.timesheetservice.domain.FromWeeklySummaryPostResponse;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "summary")
public interface SummaryClient {

    @RequestLine("POST")
    @RequestMapping(value = "/weekly-summary/feign-time-sheet", consumes = "application/json", produces = "application/json")//need to add request sent object is (SaveSummaryRequest saveSummaryRequest)
    FromWeeklySummaryPostResponse getTimeSheetWeek(@RequestBody ToWeeklySummaryPostRequest toWeeklySummaryPostRequest);
}
