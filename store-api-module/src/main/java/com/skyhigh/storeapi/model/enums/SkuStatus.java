package com.skyhigh.storeapi.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets SkuStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-11T14:48:48.168372+05:30[Asia/Colombo]")
public enum SkuStatus {
  
  ACTIVE("ACTIVE"),
  
  DEACTIVE("DEACTIVE"),
  
  DELETED("DELETED");

  private String value;

  SkuStatus(String value) {
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
  public static SkuStatus fromValue(String value) {
    for (SkuStatus b : SkuStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

