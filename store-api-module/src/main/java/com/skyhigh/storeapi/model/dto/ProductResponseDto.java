package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.ProductStatus;
import lombok.Builder;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;


/**
 * ProductResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
public class ProductResponseDto {

  @JsonProperty("productId")
  private Long productId;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("brand")
  private ProductBrandDto brand;

  @JsonProperty("category")
  private CategoryDto category;

  @JsonProperty("status")
  private ProductStatus status;

  public ProductResponseDto productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", example = "10", required = false)
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public ProductResponseDto productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  @NotNull 
  @Schema(name = "productName", example = "Dot 3, Dot 4", required = true)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductResponseDto photoUrl(String photoUrl) {
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

  public ProductResponseDto brand(ProductBrandDto brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  @Valid 
  @Schema(name = "brand", required = false)
  public ProductBrandDto getBrand() {
    return brand;
  }

  public void setBrand(ProductBrandDto brand) {
    this.brand = brand;
  }

  public ProductResponseDto category(CategoryDto category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", required = false)
  public CategoryDto getCategory() {
    return category;
  }

  public void setCategory(CategoryDto category) {
    this.category = category;
  }

  public ProductResponseDto status(ProductStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Product status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "Product status in the app", required = false)
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
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
    ProductResponseDto productResponseDto = (ProductResponseDto) o;
    return Objects.equals(this.productId, productResponseDto.productId) &&
        Objects.equals(this.productName, productResponseDto.productName) &&
        Objects.equals(this.photoUrl, productResponseDto.photoUrl) &&
        Objects.equals(this.brand, productResponseDto.brand) &&
        Objects.equals(this.category, productResponseDto.category) &&
        Objects.equals(this.status, productResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, photoUrl, brand, category, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponseDto {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

