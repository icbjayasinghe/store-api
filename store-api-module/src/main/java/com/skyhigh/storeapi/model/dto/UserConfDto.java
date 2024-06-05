package com.skyhigh.storeapi.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;


import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * UserConfDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-30T13:54:53.903585+05:30[Asia/Colombo]")
@AllArgsConstructor
public class UserConfDto {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("role")
  @Valid
  private List<String> role = null;

  public UserConfDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */

  @Schema(name = "firstName", example = "Asela", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserConfDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */

  @Schema(name = "lastName", example = "Bandara", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserConfDto role(List<String> role) {
    this.role = role;
    return this;
  }

  public UserConfDto addRoleItem(String roleItem) {
    if (this.role == null) {
      this.role = new ArrayList<>();
    }
    this.role.add(roleItem);
    return this;
  }

  /**
   * Get role
   * @return role
   */

  @Schema(name = "role", required = false)
  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserConfDto userConfDto = (UserConfDto) o;
    return Objects.equals(this.firstName, userConfDto.firstName) &&
            Objects.equals(this.lastName, userConfDto.lastName) &&
            Objects.equals(this.role, userConfDto.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserConfDto {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

