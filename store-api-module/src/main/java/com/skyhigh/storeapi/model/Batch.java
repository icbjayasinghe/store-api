package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.enums.BatchStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;


/**
 * BatchDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Batch")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Batch implements Serializable {

  public Batch() {
  }

  public Batch(Long batchId, String batchNumber, Double buyingPrice, Double sellingPrice, String photoUrl, Sku sku, Branch branch, OffsetDateTime inboundDate, BatchStatus status, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.batchId = batchId;
    this.batchNumber = batchNumber;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.photoUrl = photoUrl;
    this.sku = sku;
    this.branch = branch;
    this.inboundDate = inboundDate;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("batchId")
  private Long batchId;

  @JsonProperty("batchNumber")
  private String batchNumber;

  @JsonProperty("buyingPrice")
  private Double buyingPrice;

  @JsonProperty("sellingPrice")
  private Double sellingPrice;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "sku_id", nullable = false)
  @JsonIgnore
  private Sku sku;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "branch_id", nullable = false)
  @JsonIgnore
  private Branch branch;

  @JsonProperty("createdDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inboundDate;

  @JsonProperty("status")
  private BatchStatus status;

  @CreatedDate
  @Column(name = "created_at", nullable = false, updatable = false)
  private OffsetDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private OffsetDateTime updatedAt;

  public Batch batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */

  @Schema(name = "batchId", example = "10", required = false)
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public Batch batchName(String batchName) {
    this.batchNumber = batchName;
    return this;
  }

  /**
   * Get batchName
   * @return batchName
   */
  @NotNull
  @Schema(name = "batchName", example = "1st batch, 2nd batch", required = true)
  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchName) {
    this.batchNumber = batchName;
  }

  public Batch buyingPrice(Double buyingPrice) {
    this.buyingPrice = buyingPrice;
    return this;
  }

  /**
   * Get buyingPrice
   * @return buyingPrice
   */

  @Schema(name = "buyingPrice", example = "100.0", required = false)
  public Double getBuyingPrice() {
    return buyingPrice;
  }

  public void setBuyingPrice(Double buyingPrice) {
    this.buyingPrice = buyingPrice;
  }

  public Batch sellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * Get sellingPrice
   * @return sellingPrice
   */
  @NotNull
  @Schema(name = "sellingPrice", example = "100.0", required = true)
  public Double getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public Batch photoUrl(String photoUrl) {
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

  public Batch sku(Sku sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
   */
  @Schema(name = "sku", example = "10", required = true)
  public Sku getSku() {
    return sku;
  }

  public void setSku(Sku sku) {
    this.sku = sku;
  }

  public Batch branch(Branch branch) {
    this.branch = branch;
    return this;
  }

  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Batch createdDate(OffsetDateTime createdDate) {
    this.inboundDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @Valid
  @Schema(name = "createdDate", example = "2017-07-21T17:32:28Z", required = false)
  public OffsetDateTime getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(OffsetDateTime createdDate) {
    this.inboundDate = createdDate;
  }

  public Batch status(BatchStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid
  @Schema(name = "status", required = false)
  public BatchStatus getStatus() {
    return status;
  }

  public void setStatus(BatchStatus status) {
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
    Batch batchDto = (Batch) o;
    return Objects.equals(this.batchId, batchDto.batchId) &&
            Objects.equals(this.batchNumber, batchDto.batchNumber) &&
            Objects.equals(this.buyingPrice, batchDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, batchDto.sellingPrice) &&
            Objects.equals(this.photoUrl, batchDto.photoUrl) &&
            Objects.equals(this.sku, batchDto.sku) &&
            Objects.equals(this.inboundDate, batchDto.inboundDate) &&
            Objects.equals(this.status, batchDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchNumber, buyingPrice, sellingPrice, photoUrl, sku, inboundDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(inboundDate)).append("\n");
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

