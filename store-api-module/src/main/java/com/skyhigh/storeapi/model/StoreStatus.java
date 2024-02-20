package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.skyhigh.storeapi.model.dto.StoreDto;

public enum StoreStatus {
    ACTIVE("ACTIVE"),

    DEACTIVE("DEACTIVE");

    private String value;

    StoreStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StoreStatus fromValue(String value) {
        for (StoreStatus b : StoreStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
