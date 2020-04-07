package com.beaconice.weeklysummaryservice.domain.mongodoc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Contact {

    private String phone;

    private String email;

    private String address;
}
