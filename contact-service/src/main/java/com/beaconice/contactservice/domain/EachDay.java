package com.beaconice.contactservice.domain;

import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Document
public class EachDay {

    //@ApiModelProperty(notes = "Each day - start time", required = true)
    private String startTime;

    //@ApiModelProperty(notes = "Each day - end time", required = true)
    private String endTime;

    //@ApiModelProperty(notes = "Each day - hours", required = true)
    private Integer hours;

    //@ApiModelProperty(notes = "Each day - vacation", required = true)
    private Integer vacation;

    //@ApiModelProperty(notes = "Each day - floatDay", required = true)
    private Integer floatDay;

    //@ApiModelProperty(notes = "Each day - holiday", required = true)
    private Integer holiday;
}
