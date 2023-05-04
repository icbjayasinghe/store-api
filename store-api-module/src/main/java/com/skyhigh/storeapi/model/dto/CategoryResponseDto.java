package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;


/**
 * CategoryResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
public class CategoryResponseDto {

  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("categoryName")
  private String categoryName;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("parentCategory")
  private ParentCategoryDto parentCategory;

  /**
   * category status in the app
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DEACTIVE("DEACTIVE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public CategoryResponseDto categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", example = "10", required = false)
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryResponseDto categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  @NotNull 
  @Schema(name = "categoryName", example = "Engine Oil, Break Oil", required = true)
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public CategoryResponseDto photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  /**
   * Get photoUrl
   * @return photoUrl
  */
  
  @Schema(name = "photoUrl", required = false)
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public CategoryResponseDto parentCategory(ParentCategoryDto parentCategory) {
    this.parentCategory = parentCategory;
    return this;
  }

  /**
   * Get parentCategory
   * @return parentCategory
  */
  @Valid 
  @Schema(name = "parentCategory", required = false)
  public ParentCategoryDto getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(ParentCategoryDto parentCategory) {
    this.parentCategory = parentCategory;
  }

  public CategoryResponseDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * category status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "category status in the app", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    CategoryResponseDto categoryResponseDto = (CategoryResponseDto) o;
    return Objects.equals(this.categoryId, categoryResponseDto.categoryId) &&
        Objects.equals(this.categoryName, categoryResponseDto.categoryName) &&
        Objects.equals(this.photoUrl, categoryResponseDto.photoUrl) &&
        Objects.equals(this.parentCategory, categoryResponseDto.parentCategory) &&
        Objects.equals(this.status, categoryResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, photoUrl, parentCategory, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResponseDto {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
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

