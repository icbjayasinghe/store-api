package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * PropertyObjectDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-06T20:24:01.476679+05:30[Asia/Colombo]")
public class PropertyObjectDto {

  @JsonProperty("property")
  private String property;

  @JsonProperty("value")
  private Boolean value;

  public PropertyObjectDto property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  
  @Schema(name = "property", required = false)
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public PropertyObjectDto value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", required = false)
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyObjectDto propertyObjectDto = (PropertyObjectDto) o;
    return Objects.equals(this.property, propertyObjectDto.property) &&
        Objects.equals(this.value, propertyObjectDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyObjectDto {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

