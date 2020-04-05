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
@ToString

public class TimeSheet {

    //@ApiModelProperty(notes = "time sheet each day", required = true)
    private EachDay sunday;
    private EachDay monday;
    private EachDay tuesday;
    private EachDay wednesday;
    private EachDay thursday;
    private EachDay friday;
    private EachDay saturday;

}
