package com.beaconice.weeklysummaryservice.client;

import com.beaconice.weeklysummaryservice.domain.TimeSheetRequest;
import com.beaconice.weeklysummaryservice.domain.mongodoc.TimeSheet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "timesheet")
public interface TimeSheetServiceClient {

//    @RequestLine("POST")
    @PostMapping(value = "/time-sheet/default", consumes = "application/json", produces = "application/json")
    TimeSheet getTimeSheets(@RequestBody TimeSheetRequest timeSheetRequest);

}
