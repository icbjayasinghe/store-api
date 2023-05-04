package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;



/**
 * SkuDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
public class SkuDto {

  @JsonProperty("skuId")
  private Long skuId;

  @JsonProperty("skuName")
  private String skuName;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("productId")
  private Long productId;

  /**
   * SKU status in the app
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

  public SkuDto skuId(Long skuId) {
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

  public SkuDto skuName(String skuName) {
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

  public SkuDto photoUrl(String photoUrl) {
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

  public SkuDto productId(Long productId) {
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

  public SkuDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * SKU status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "SKU status in the app", required = false)
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
    SkuDto skuDto = (SkuDto) o;
    return Objects.equals(this.skuId, skuDto.skuId) &&
        Objects.equals(this.skuName, skuDto.skuName) &&
        Objects.equals(this.photoUrl, skuDto.photoUrl) &&
        Objects.equals(this.productId, skuDto.productId) &&
        Objects.equals(this.status, skuDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, skuName, photoUrl, productId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuDto {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuName: ").append(toIndentedString(skuName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

