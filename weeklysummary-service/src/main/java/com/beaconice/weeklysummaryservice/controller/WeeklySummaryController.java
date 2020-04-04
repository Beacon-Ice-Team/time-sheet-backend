package com.beaconice.weeklysummaryservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController(value = "/time-sheet")
public class WeeklySummaryController {

    @GetMapping(value = "/weekly-summary")
    public ResponseEntity<Object> getWeeklySummary(HttpServletRequest httpServletRequest){
        ResponseEntity<Object> responseEntity;

        responseEntity = ResponseEntity.ok()
        .body("Everything is good");

        return responseEntity;
    }

}
