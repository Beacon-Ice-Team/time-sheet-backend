package com.beaconice.weeklysummaryservice.client;

import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.TimeSheetPostRequest;
import com.beaconice.weeklysummaryservice.domain.TimeSheetServiceDomain.TimeSheetPostResponse;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "timesheet")
public interface TimeSheetServiceClient {

    @RequestLine("POST")
    @RequestMapping(value = "/time-sheet/default", consumes = "application/json", produces = "application/json")
    TimeSheetPostResponse getTimeSheets(@RequestBody TimeSheetPostRequest timeSheetPostRequest);

}
