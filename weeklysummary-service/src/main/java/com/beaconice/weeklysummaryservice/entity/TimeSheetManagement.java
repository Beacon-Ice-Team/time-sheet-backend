package com.beaconice.weeklysummaryservice.entity;

import com.beaconice.weeklysummaryservice.domain.common.Day;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "TimeSheetManagement")
public class TimeSheetManagement {

    @Id
    private String id;

    private String username;

    private String password;

    private String name;

    private List<WeeklySummary> weeklySummaryList;

    private List<Day> timeSheet;

    private Object contact;

    private Object emergency;

    private Object daysOff;

}
