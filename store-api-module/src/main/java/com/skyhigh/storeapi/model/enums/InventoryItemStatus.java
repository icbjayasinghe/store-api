package com.skyhigh.storeapi.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;


import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets InventoryItemStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
public enum InventoryItemStatus {
  
  ACTIVE("ACTIVE"),
  
  DEACTIVE("DEACTIVE"),
  
  DELETED("DELETED");

  private String value;

  InventoryItemStatus(String value) {
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
  public static InventoryItemStatus fromValue(String value) {
    for (InventoryItemStatus b : InventoryItemStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

