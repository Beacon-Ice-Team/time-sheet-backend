package com.beaconice.timesheetservice.entity.mongodoc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Emergency {
    private EmergencyContact contact1;
    private EmergencyContact contact2;
}
