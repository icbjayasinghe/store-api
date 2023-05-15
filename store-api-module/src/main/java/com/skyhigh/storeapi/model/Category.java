package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


/**
 * Category
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Category")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Category implements Serializable {

  public Category() {
  }

  public Category(Long categoryId, String categoryName, String photoUrl, ParentCategory parentCategory, Status status) {
    this.categoryId = categoryId;
    this.categoryName = categoryName;
    this.photoUrl = photoUrl;
    this.parentCategory = parentCategory;
    this.status = status;
  }

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("categoryName")
  private String categoryName;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "parent_category_id", nullable = false)
  @JsonIgnore
  private ParentCategory parentCategory;

  @Enumerated(EnumType.STRING)
  @JsonProperty("status")
  private Status status;

  public Category categoryId(Long categoryId) {
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

  public Category categoryName(String categoryName) {
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

  public Category photoUrl(String photoUrl) {
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

  public Category perentCategory(ParentCategory parentCategory) {
    this.parentCategory = parentCategory;
    return this;
  }

  /**
   * Get parentCategory
   * @return parentCategory
  */

  @Schema(name = "parentCategory", required = false)
  public ParentCategory getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(ParentCategory parentCategory) {
    this.parentCategory = parentCategory;
  }

  public Category status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Category status in the store
   * @return status
  */
  
  @Schema(name = "status", description = "Category status in the store", required = false)
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Category category = (Category) o;
    return categoryId.equals(category.categoryId) &&
            categoryName.equals(category.categoryName) &&
            Objects.equals(photoUrl, category.photoUrl) &&
            Objects.equals(parentCategory, category.parentCategory) &&
            status == category.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, photoUrl, parentCategory, status);
  }

  @Override
  public String toString() {
    return "Category{" +
            "categoryId=" + categoryId +
            ", categoryName='" + categoryName + '\'' +
            ", photoUrl='" + photoUrl + '\'' +
            ", parentCategory=" + parentCategory +
            ", status=" + status +
            '}';
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

