package com.beaconice.timesheetservice.controller;


import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import com.beaconice.timesheetservice.repository.TimeSheetRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("time sheet controller")
public class timeSheetController {

    private TimeSheetRepository timeSheetRepository;

    @Autowired
    public void setTimeSheetRepository(TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    @GetMapping("/time-sheet")
    public List<TimeSheetManagement> getDefaultWeek() { //testing get from backend
        System.out.println("going to mongo");
        List<TimeSheetManagement> employeeList = timeSheetRepository.findAll();
        return employeeList;
    }
}