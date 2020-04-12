package com.beaconice.timesheetservice.entity.mongodoc;

import com.beaconice.timesheetservice.domain.Day;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

@Data
@Document(collection = "TimeSheetManagement")
public class TimeSheetManagement {

    @Id
    private String id;

    private String username;

    private String password;

    private String name;

    private List<WeeklySummary> weeklySummary;

//    private TimeSheet timeSheet;
    private List<Day> timeSheet;

    private Object contact;

    private Object emergency;

    private DaysOff daysOff;





}
