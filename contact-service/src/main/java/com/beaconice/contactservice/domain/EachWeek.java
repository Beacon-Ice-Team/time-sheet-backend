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
public class EachWeek {
    //@ApiModelProperty(notes = "Each week -hours", required = true)
    private Integer hours;

    //@ApiModelProperty(notes = "Each week -submission status", required = true)
    private String submissionStatus;

    //@ApiModelProperty(notes = "Each week -approval Status", required = true)
    private String approvalStatus;

    //@ApiModelProperty(notes = "Each week -comment", required = true)
    private String comment;
}
