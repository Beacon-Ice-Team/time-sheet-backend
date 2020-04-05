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

public class Emergency {
    //@ApiModelProperty(notes = "Emergency contact -first contact", required = true)
    private EmergencyContact emergencyContact1;
    //@ApiModelProperty(notes = "Emergency contact -second contact")
    private EmergencyContact emergencyContact2;
}
