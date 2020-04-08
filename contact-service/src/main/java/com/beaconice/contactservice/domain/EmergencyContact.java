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
@ToString

public class EmergencyContact {
    //@ApiModelProperty(notes = "Emergency Contact -name", required = true)
    private String name;

    //@ApiModelProperty(notes = "Emergency Contact -phone", required = true)
    private String phone;


}
