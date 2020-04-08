package com.beaconice.contactservice.domain;

import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Data
@Document(collection = "TimeSheetManagement")
public class User {
    @Id
    //@ApiModelProperty(notes = "The database generated user ID")
    private String id;

    //@ApiModelProperty(notes = "User -username", required = true)
    private String username;
    //@ApiModelProperty(notes = "User -password", required = true)
    private String password;
    //@ApiModelProperty(notes = "User -name", required = true)
    private String name;
    //@ApiModelProperty(notes = "User -weekly summary", required = true)
    private List<Object> weeklySummary;
    //@ApiModelProperty(notes = "User -time sheet", required = true)
    private List<Object> timeSheet;
    //@ApiModelProperty(notes = "User -contact", required = true)
    private Contact contact;
    //@ApiModelProperty(notes = "User -emergency", required = true)
    private Emergency emergency;
    //@ApiModelProperty(notes = "User -days off", required = true)
    private DaysOff daysOff;


}
