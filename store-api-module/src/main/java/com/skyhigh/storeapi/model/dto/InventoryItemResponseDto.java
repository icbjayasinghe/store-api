package com.skyhigh.storeapi.model.dto;

import java.time.OffsetDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import lombok.Builder;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;


/**
 * InventoryItemResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-22T22:08:37.998448+05:30[Asia/Colombo]")
@Builder
public class InventoryItemResponseDto {

  @JsonProperty("inventoryItemId")
  private Long inventoryItemId;

  @JsonProperty("batchNumber")
  private String batchNumber;

  @JsonProperty("skuName")
  private String skuName;

  @JsonProperty("manufactureDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime manufactureDate;

  @JsonProperty("expireDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expireDate;

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

  public InventoryItemResponseDto inventoryItemId(Long inventoryItemId) {
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

  public InventoryItemResponseDto batchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
    return this;
  }

  /**
   * Get batchNumber
   * @return batchNumber
   */

  @Schema(name = "batchNumber", example = "batch10", required = false)
  public String getBatchNumber() {
    return batchNumber;
  }

  public void setBatchNumber(String batchNumber) {
    this.batchNumber = batchNumber;
  }

  public InventoryItemResponseDto skuName(String skuName) {
    this.skuName = skuName;
    return this;
  }

  /**
   * Get skuName
   * @return skuName
   */

  @Schema(name = "skuName", example = "4L", required = false)
  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public InventoryItemResponseDto manufactureDate(OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * Get manufactureDate
   * @return manufactureDate
   */
  @Valid
  @Schema(name = "manufactureDate", example = "2017-07-21T17:32:28Z", required = false)
  public OffsetDateTime getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public InventoryItemResponseDto expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
   */
  @Valid
  @Schema(name = "expireDate", example = "2017-07-21T17:32:28Z", required = false)
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }

  public InventoryItemResponseDto buyingPrice(Double buyingPrice) {
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

  public InventoryItemResponseDto sellingPrice(Double sellingPrice) {
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

  public InventoryItemResponseDto quantity(Long quantity) {
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

  public InventoryItemResponseDto inboundDate(OffsetDateTime inboundDate) {
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

  public InventoryItemResponseDto status(InventoryItemStatus status) {
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
    InventoryItemResponseDto inventoryItemResponseDto = (InventoryItemResponseDto) o;
    return Objects.equals(this.inventoryItemId, inventoryItemResponseDto.inventoryItemId) &&
            Objects.equals(this.batchNumber, inventoryItemResponseDto.batchNumber) &&
            Objects.equals(this.skuName, inventoryItemResponseDto.skuName) &&
            Objects.equals(this.manufactureDate, inventoryItemResponseDto.manufactureDate) &&
            Objects.equals(this.expireDate, inventoryItemResponseDto.expireDate) &&
            Objects.equals(this.buyingPrice, inventoryItemResponseDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, inventoryItemResponseDto.sellingPrice) &&
            Objects.equals(this.quantity, inventoryItemResponseDto.quantity) &&
            Objects.equals(this.inboundDate, inventoryItemResponseDto.inboundDate) &&
            Objects.equals(this.status, inventoryItemResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, batchNumber, skuName, manufactureDate, expireDate, buyingPrice, sellingPrice, quantity, inboundDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItemResponseDto {\n");
    sb.append("    inventoryItemId: ").append(toIndentedString(inventoryItemId)).append("\n");
    sb.append("    batchNumber: ").append(toIndentedString(batchNumber)).append("\n");
    sb.append("    skuName: ").append(toIndentedString(skuName)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
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


