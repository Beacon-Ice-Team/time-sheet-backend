package com.beaconice.timesheetservice.controller;


import com.beaconice.timesheetservice.entity.mongodoc.TimeSheet;
import com.beaconice.timesheetservice.entity.mongodoc.TimeSheetManagement;
import com.beaconice.timesheetservice.repository.TimeSheetRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/time-sheet")
@Api("time sheet controller")
public class timeSheetController {

    private TimeSheetRepository timeSheetRepository;

    @Autowired
    public void setTimeSheetRepository(TimeSheetRepository timeSheetRepository) {
        this.timeSheetRepository = timeSheetRepository;
    }

    @PostMapping("/default")
    public TimeSheet getDefaultWeekByUsername(@RequestBody TimeSheetManagement timeSheetManagement) { //testing get from backend
        System.out.println("going to mongo");
        TimeSheetManagement user = timeSheetRepository.findByUsername(timeSheetManagement.getUsername()).orElse(null);
        TimeSheet defaultWeek = user.getTimeSheet();
        return defaultWeek;
    }

    @PostMapping("/update")
    public TimeSheet changeDefaultWeekByUsername(@RequestBody TimeSheetManagement timeSheetManagement) { //testing get from backend
        System.out.println("updating mongo");
        TimeSheetManagement user = timeSheetRepository.findByUsername(timeSheetManagement.getUsername()).orElse(null);
        user.setTimeSheet(timeSheetManagement.getTimeSheet());
        timeSheetRepository.save(user);
        TimeSheet newDefaultWeek = user.getTimeSheet();
        return newDefaultWeek;
    }
}