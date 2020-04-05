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
@Document
public class WeeklySummary {
    //@ApiModelProperty(notes = "Weekly summery", required = true)
    private List<EachWeek> weeklySummery;
}
