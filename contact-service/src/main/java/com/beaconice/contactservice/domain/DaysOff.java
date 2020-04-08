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

public class DaysOff {

    //@ApiModelProperty(notes = "Days Off - vacation", required = true)
    private Integer vacation;

    //@ApiModelProperty(notes = "Days Off - float", required = true)
    private Integer floatDay;
}
