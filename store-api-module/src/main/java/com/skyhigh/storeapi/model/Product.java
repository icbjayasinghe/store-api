package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 * ProductDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Product")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Product {

  public Product() {
  }

  public Product(Long productId, String productName, String photoUrl, ProductBrand productBrand, Category category, ProductStatus status) {
    this.productId = productId;
    this.productName = productName;
    this.photoUrl = photoUrl;
    this.productBrand = productBrand;
    this.category = category;
    this.status = status;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("productId")
  private Long productId;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("photoUrl")
  @Lob
  private String photoUrl;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "brand_id", nullable = false)
  @JsonIgnore
  private ProductBrand productBrand;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "category_id", nullable = false)
  @JsonIgnore
  private Category category;

  @JsonProperty("status")
  private ProductStatus status;

  public Product productId(Long productId) {
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

  public Product productName(String productName) {
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

  public Product photoUrl(String photoUrl) {
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


  public Product(ProductBrand productBrand) {
    this.productBrand = productBrand;
  }

  @Schema(name = "productBrand", required = false)
  public ProductBrand getProductBrand() {
    return productBrand;
  }

  public void setProductBrand(ProductBrand productBrand) {
    this.productBrand = productBrand;
  }

  public Product categoryId(Category categoryId) {
    this.category = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "category", required = false)
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category categoryId) {
    this.category = categoryId;
  }

  public Product status(ProductStatus status) {
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
    Product productDto = (Product) o;
    return Objects.equals(this.productId, productDto.productId) &&
        Objects.equals(this.productName, productDto.productName) &&
        Objects.equals(this.photoUrl, productDto.photoUrl) &&
        Objects.equals(this.productBrand, productDto.productBrand) &&
        Objects.equals(this.category, productDto.category) &&
        Objects.equals(this.status, productDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, photoUrl, productBrand, category, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    brand: ").append(toIndentedString(productBrand.toString())).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(category.toString())).append("\n");
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

