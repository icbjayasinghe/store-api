package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.Status;
import lombok.Builder;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;


/**
 * ParentCategoryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
public class ParentCategoryDto {

  @JsonProperty("parentCategoryId")
  private Long parentCategoryId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("status")
  private Status status;

  public ParentCategoryDto parentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    return this;
  }

  /**
   * Get parentCategoryId
   * @return parentCategoryId
  */
  
  @Schema(name = "parentCategoryId", example = "10", required = false)
  public Long getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  public ParentCategoryDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Lubricants", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ParentCategoryDto photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
  */
  
  @Schema(name = "photoUrl", example = "Lubricants", required = false)
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public ParentCategoryDto status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Parent Category status in the store
   * @return status
  */
  
  @Schema(name = "status", description = "Parent Category status in the store", required = false)
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentCategoryDto parentCategoryDto = (ParentCategoryDto) o;
    return Objects.equals(this.parentCategoryId, parentCategoryDto.parentCategoryId) &&
        Objects.equals(this.name, parentCategoryDto.name) &&
        Objects.equals(this.photoUrl, parentCategoryDto.photoUrl) &&
        Objects.equals(this.status, parentCategoryDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentCategoryId, name, photoUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentCategoryDto {\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

