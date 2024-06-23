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

  @JsonProperty("buyingPrice")
  private Double buyingPrice;

  @JsonProperty("sellingPrice")
  private Double sellingPrice;

  @JsonProperty("photoUrl")
  private String photoUrl;

  @JsonProperty("sku")
  private SkuDto sku;

  @JsonProperty("branch")
  private BranchDto branch;

  @JsonProperty("inboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inboundDate;

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

  public BatchResponseDto buyingPrice(Double buyingPrice) {
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

  public BatchResponseDto sellingPrice(Double sellingPrice) {
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

  public BatchResponseDto branch(BranchDto branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   */
  @Valid
  @Schema(name = "branch", required = false)
  public BranchDto getBranch() {
    return branch;
  }

  public void setBranch(BranchDto branch) {
    this.branch = branch;
  }

  public BatchResponseDto inboundDate(OffsetDateTime inboundDate) {
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
            Objects.equals(this.buyingPrice, batchResponseDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, batchResponseDto.sellingPrice) &&
            Objects.equals(this.photoUrl, batchResponseDto.photoUrl) &&
            Objects.equals(this.sku, batchResponseDto.sku) &&
            Objects.equals(this.branch, batchResponseDto.branch) &&
            Objects.equals(this.inboundDate, batchResponseDto.inboundDate) &&
            Objects.equals(this.status, batchResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, batchNumber, buyingPrice, sellingPrice, photoUrl, sku, branch, inboundDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseDto {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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