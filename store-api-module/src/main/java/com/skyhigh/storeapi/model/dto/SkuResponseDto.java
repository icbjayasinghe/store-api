package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.SkuStatus;
import lombok.Builder;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;



/**
 * SkuResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-11T14:48:48.168372+05:30[Asia/Colombo]")
@Builder
public class SkuResponseDto {

  @JsonProperty("skuId")
  private Long skuId;

  @JsonProperty("skuName")
  private String skuName;

  @JsonProperty("concatProductName")
  private String concatProductName;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("product")
  private ProductDto product;

  @JsonProperty("status")
  private SkuStatus status;

  public SkuResponseDto skuId(Long skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId
   * @return skuId
   */

  @Schema(name = "skuId", example = "10", required = false)
  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public SkuResponseDto skuName(String skuName) {
    this.skuName = skuName;
    return this;
  }

  /**
   * Get skuName
   * @return skuName
   */
  @NotNull
  @Schema(name = "skuName", example = "2L, 4L", required = true)
  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public SkuResponseDto concatProductName(String concatProductName) {
    this.concatProductName = concatProductName;
    return this;
  }

  /**
   * Get concatProductName
   * @return concatProductName
   */

  @Schema(name = "concatProductName", example = "Toyota Motor Oil 10W-30sp 4L", required = false)
  public String getConcatProductName() {
    return concatProductName;
  }

  public void setConcatProductName(String concatProductName) {
    this.concatProductName = concatProductName;
  }

  public SkuResponseDto photoUrl(String photoUrl) {
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

  public SkuResponseDto product(ProductDto product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @Valid
  @Schema(name = "product", required = false)
  public ProductDto getProduct() {
    return product;
  }

  public void setProduct(ProductDto product) {
    this.product = product;
  }

  public SkuResponseDto status(SkuStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid
  @Schema(name = "status", required = false)
  public SkuStatus getStatus() {
    return status;
  }

  public void setStatus(SkuStatus status) {
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
    SkuResponseDto skuResponseDto = (SkuResponseDto) o;
    return Objects.equals(this.skuId, skuResponseDto.skuId) &&
            Objects.equals(this.skuName, skuResponseDto.skuName) &&
            Objects.equals(this.concatProductName, skuResponseDto.concatProductName) &&
            Objects.equals(this.photoUrl, skuResponseDto.photoUrl) &&
            Objects.equals(this.product, skuResponseDto.product) &&
            Objects.equals(this.status, skuResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, skuName, concatProductName, photoUrl, product, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuResponseDto {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuName: ").append(toIndentedString(skuName)).append("\n");
    sb.append("    concatProductName: ").append(toIndentedString(concatProductName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

