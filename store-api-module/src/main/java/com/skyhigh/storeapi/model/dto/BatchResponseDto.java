package com.skyhigh.storeapi.model.dto;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.enums.BatchStatus;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;


/**
 * BatchResponseDto
 */

@Builder
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
public class BatchResponseDto {

  @JsonProperty("batchId")
  private Long batchId;

  @JsonProperty("batchNumber")
  private String batchNumber;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("sku")
  private SkuDto sku;

  @JsonProperty("manufactureDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime manufactureDate;

  @JsonProperty("expireDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expireDate;

  @JsonProperty("status")
  private BatchStatus status;

  public BatchResponseDto batchId(Long batchId) {
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

  public BatchResponseDto batchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

  /**
   * Get batchNumber
   * @return batchNumber
   */

  @Schema(name = "batchNumber", example = "LOT34LJ", required = false)
  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }

  public BatchResponseDto photoUrl(String photoUrl) {
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

  public BatchResponseDto sku(SkuDto sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
   */
  @Valid
  @Schema(name = "sku", required = false)
  public SkuDto getSku() {
    return sku;
  }

  public void setSku(SkuDto sku) {
    this.sku = sku;
  }

  public BatchResponseDto manufactureDate(OffsetDateTime manufactureDate) {
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

  public BatchResponseDto expireDate(OffsetDateTime expireDate) {
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

  public BatchResponseDto status(BatchStatus status) {
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
    BatchResponseDto batchResponseDto = (BatchResponseDto) o;
    return Objects.equals(this.batchId, batchResponseDto.batchId) &&
            Objects.equals(this.batchNumber, batchResponseDto.batchNumber) &&
            Objects.equals(this.photoUrl, batchResponseDto.photoUrl) &&
            Objects.equals(this.sku, batchResponseDto.sku) &&
            Objects.equals(this.manufactureDate, batchResponseDto.manufactureDate) &&
            Objects.equals(this.expireDate, batchResponseDto.expireDate) &&
            Objects.equals(this.status, batchResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchNumber, photoUrl, sku, manufactureDate, expireDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
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