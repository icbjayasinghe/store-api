package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.ProductBrandStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 * ProductBrandDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "ProductBrand")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class ProductBrand {

  public ProductBrand() {
  }

  public ProductBrand(Long brandId, String brandName, String photoUrl, ProductBrandStatus status) {
    this.brandId = brandId;
    this.brandName = brandName;
    this.photoUrl = photoUrl;
    this.status = status;
  }

  @JsonProperty("brandId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long brandId;

  @JsonProperty("brandName")
  private String brandName;

  @JsonProperty("photoUrl")
  @Lob
  private String photoUrl;

  @JsonProperty("status")
  private ProductBrandStatus status;

  public ProductBrand brandId(Long brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  
  @Schema(name = "brandId", example = "10", required = false)
  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public ProductBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Get brandName
   * @return brandName
  */
  @NotNull 
  @Schema(name = "brandName", example = "Lubricants", required = true)
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public ProductBrand photoUrl(String photoUrl) {
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

  public ProductBrand status(ProductBrandStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Product Brand status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "Product Brand status in the app", required = false)
  public ProductBrandStatus getStatus() {
    return status;
  }

  public void setStatus(ProductBrandStatus status) {
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
    ProductBrand productBrandDto = (ProductBrand) o;
    return Objects.equals(this.brandId, productBrandDto.brandId) &&
        Objects.equals(this.brandName, productBrandDto.brandName) &&
        Objects.equals(this.photoUrl, productBrandDto.photoUrl) &&
        Objects.equals(this.status, productBrandDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, brandName, photoUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBrandDto {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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

