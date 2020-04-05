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

public class Contact {

    //@ApiModelProperty(notes = "Contact -phone", required = true)
    private String phone;

    //@ApiModelProperty(notes = "Contact -email", required = true)
    private String email;

    //@ApiModelProperty(notes = "Contact -address", required = true)
    private String address;

}
