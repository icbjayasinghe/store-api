package com.skyhigh.storeapi.model.dto;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;


/**
 * InventoryItemDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
public class InventoryItemDto {

  @JsonProperty("inventoryItemId")
  private Long inventoryItemId;

  @JsonProperty("batchId")
  private Long batchId;

  @JsonProperty("branchId")
  private Long branchId;

  @JsonProperty("buyingPrice")
  private Double buyingPrice;

  @JsonProperty("sellingPrice")
  private Double sellingPrice;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("inboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inboundDate;

  @JsonProperty("status")
  private InventoryItemStatus status;

  public InventoryItemDto inventoryItemId(Long inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
    return this;
  }

  /**
   * Get inventoryItemId
   * @return inventoryItemId
   */

  @Schema(name = "inventoryItemId", example = "10", required = false)
  public Long getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(Long inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  public InventoryItemDto batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
   */
  @NotNull
  @Schema(name = "batchId", example = "10", required = true)
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  /**
   * Get branchId
   * @return branchId
   */
  @NotNull
  @Schema(name = "branchId", example = "10", required = true)
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public InventoryItemDto buyingPrice(Double buyingPrice) {
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

  public InventoryItemDto sellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
    return this;
  }

  /**
   * Get sellingPrice
   * @return sellingPrice
   */

  @Schema(name = "sellingPrice", example = "100.0", required = false)
  public Double getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public InventoryItemDto quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */

  @Schema(name = "quantity", example = "10", required = false)
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public InventoryItemDto inboundDate(OffsetDateTime inboundDate) {
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

  public InventoryItemDto status(InventoryItemStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid
  @Schema(name = "status", required = false)
  public InventoryItemStatus getStatus() {
    return status;
  }

  public void setStatus(InventoryItemStatus status) {
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
    InventoryItemDto inventoryItemDto = (InventoryItemDto) o;
    return Objects.equals(this.inventoryItemId, inventoryItemDto.inventoryItemId) &&
            Objects.equals(this.batchId, inventoryItemDto.batchId) &&
            Objects.equals(this.branchId, inventoryItemDto.branchId) &&
            Objects.equals(this.buyingPrice, inventoryItemDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, inventoryItemDto.sellingPrice) &&
            Objects.equals(this.quantity, inventoryItemDto.quantity) &&
            Objects.equals(this.inboundDate, inventoryItemDto.inboundDate) &&
            Objects.equals(this.status, inventoryItemDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, batchId, branchId, buyingPrice, sellingPrice, quantity, inboundDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItemDto {\n");
    sb.append("    inventoryItemId: ").append(toIndentedString(inventoryItemId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
    sb.append("    sellingPrice: ").append(toIndentedString(sellingPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

