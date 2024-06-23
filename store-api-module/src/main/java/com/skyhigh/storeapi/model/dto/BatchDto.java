package com.skyhigh.storeapi.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;

import com.skyhigh.storeapi.model.enums.BatchStatus;
import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BatchDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
@Builder
public class BatchDto {

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

  @JsonProperty("skuId")
  private Long skuId;

  @JsonProperty("branchId")
  private Long branchId;

  @JsonProperty("inboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inboundDate;

  @JsonProperty("status")
  private BatchStatus status;

  public BatchDto batchId(Long batchId) {
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

  public BatchDto batchNumber(String batchNumber) {
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

  public BatchDto buyingPrice(Double buyingPrice) {
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

  public BatchDto sellingPrice(Double sellingPrice) {
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

  public BatchDto photoUrl(String photoUrl) {
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

  public BatchDto skuId(Long skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Get skuId
   * @return skuId
   */
  @NotNull
  @Schema(name = "skuId", example = "10", required = true)
  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public BatchDto branchId(Long branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * Get branchId
   * @return branchId
   */

  @Schema(name = "branchId", example = "10", required = false)
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public BatchDto inboundDate(OffsetDateTime inboundDate) {
    this.inboundDate = inboundDate;
    return this;
  }

  /**
   * Get inboundDate
   * @return inboundDate
   */
  @Valid
  @Schema(name = "inboundDate", example = "2017-07-21T17:32:28Z", required = false)
  public OffsetDateTime getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(OffsetDateTime inboundDate) {
    this.inboundDate = inboundDate;
  }

  public BatchDto status(BatchStatus status) {
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
    BatchDto batchDto = (BatchDto) o;
    return Objects.equals(this.batchId, batchDto.batchId) &&
            Objects.equals(this.batchNumber, batchDto.batchNumber) &&
            Objects.equals(this.buyingPrice, batchDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, batchDto.sellingPrice) &&
            Objects.equals(this.photoUrl, batchDto.photoUrl) &&
            Objects.equals(this.skuId, batchDto.skuId) &&
            Objects.equals(this.branchId, batchDto.branchId) &&
            Objects.equals(this.inboundDate, batchDto.inboundDate) &&
            Objects.equals(this.status, batchDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchNumber, buyingPrice, sellingPrice, photoUrl, skuId, branchId, inboundDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    inboundDate: ").append(toIndentedString(inboundDate)).append("\n");
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

