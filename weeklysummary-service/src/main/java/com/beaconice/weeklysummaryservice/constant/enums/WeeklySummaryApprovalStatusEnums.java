package com.beaconice.weeklysummaryservice.constant.enums;

import lombok.Getter;

@Getter
public enum WeeklySummaryApprovalStatusEnums {

    NOT_APPROVED(0, "NOT_APPROVED"),
    APPROVED(1, "APPROVED");

    private int value;
    private String str;

    WeeklySummaryApprovalStatusEnums(int value, String str){
        this.value = value;
        this.str = str;
    }

}
