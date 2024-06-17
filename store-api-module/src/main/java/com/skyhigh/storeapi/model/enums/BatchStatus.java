package com.skyhigh.storeapi.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets BatchStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-13T23:48:51.877588+05:30[Asia/Colombo]")
public enum BatchStatus {
  
  ACTIVE("ACTIVE"),
  
  DEACTIVE("DEACTIVE"),
  
  DELETED("DELETED");

  private String value;

  BatchStatus(String value) {
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
  public static BatchStatus fromValue(String value) {
    for (BatchStatus b : BatchStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

