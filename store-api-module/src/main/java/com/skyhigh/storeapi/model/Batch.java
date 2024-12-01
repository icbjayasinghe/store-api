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

  public Batch(Long batchId, String batchNumber, String photoUrl, Sku sku, OffsetDateTime manufactureDate, OffsetDateTime expireDate, BatchStatus status, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.batchId = batchId;
    this.batchNumber = batchNumber;
    this.photoUrl = photoUrl;
    this.sku = sku;
    this.manufactureDate = manufactureDate;
    this.expireDate = expireDate;
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

  @JsonProperty("photoUrl")
  private String photoUrl;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "sku_id", nullable = false)
  @JsonIgnore
  private Sku sku;

  @JsonProperty("manufactureDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime manufactureDate;

  @JsonProperty("expireDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expireDate;

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

  public Batch manufactureDate(OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * Get manufactureDate
   * @return manufactureDate
   */
  @Valid
  @Schema(name = "manufactureDate", example = "2024-07-21T17:32:28Z", required = false)
  public OffsetDateTime getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public Batch expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
   */
  @Valid
  @Schema(name = "expireDate", example = "2024-07-21T17:32:28Z", required = false)
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
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
            Objects.equals(this.photoUrl, batchDto.photoUrl) &&
            Objects.equals(this.sku, batchDto.sku) &&
            Objects.equals(this.manufactureDate, batchDto.manufactureDate) &&
            Objects.equals(this.expireDate, batchDto.expireDate) &&
            Objects.equals(this.status, batchDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchNumber, photoUrl, sku, manufactureDate, expireDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchName: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
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

