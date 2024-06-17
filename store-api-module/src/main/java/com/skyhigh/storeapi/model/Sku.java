package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.SkuStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * SkuDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-11T14:48:48.168372+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Sku")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Sku implements Serializable {

  public Sku() {
  }

  public Sku(Long skuId, String skuName, String concatProductName, String photoUrl, Product product, SkuStatus status) {
    this.skuId = skuId;
    this.skuName = skuName;
    this.concatProductName = concatProductName;
    this.photoUrl = photoUrl;
    this.product = product;
    this.status = status;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("skuId")
  private Long skuId;

  @JsonProperty("skuName")
  private String skuName;

  @JsonProperty("concatProductName")
  private String concatProductName;

  @Lob
  @JsonProperty("photoUrl")
  private String photoUrl;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "productId", nullable = false)
  @JsonIgnore
  private Product product;

  @JsonProperty("status")
  private SkuStatus status;

  public Sku skuId(Long skuId) {
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

  public Sku skuName(String skuName) {
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

  public Sku concatProductName(String concatProductName) {
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

  public Sku photoUrl(String photoUrl) {
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

  public Sku product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Sku status(SkuStatus status) {
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
    Sku skuDto = (Sku) o;
    return Objects.equals(this.skuId, skuDto.skuId) &&
            Objects.equals(this.skuName, skuDto.skuName) &&
            Objects.equals(this.concatProductName, skuDto.concatProductName) &&
            Objects.equals(this.photoUrl, skuDto.photoUrl) &&
            Objects.equals(this.product, skuDto.product) &&
            Objects.equals(this.status, skuDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, skuName, concatProductName, photoUrl, product, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuDto {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuName: ").append(toIndentedString(skuName)).append("\n");
    sb.append("    concatProductName: ").append(toIndentedString(concatProductName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    product: ").append(toIndentedString(product.toString())).append("\n");
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

