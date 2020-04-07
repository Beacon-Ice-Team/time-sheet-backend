package com.beaconice.weeklysummaryservice.constant.enums;

import lombok.Getter;

@Getter
public enum WeeklySummarySubmissionStatusEnums {

    NOT_STARTED(0, "NOT_STARTED"),
    INCOMPLETE(1, "INCOMPLETE"),
    COMPLETED(2, "COMPLETED");

    private int value;
    private String str;

    WeeklySummarySubmissionStatusEnums(int value, String str){
        this.value = value;
        this.str = str;
    }

}
