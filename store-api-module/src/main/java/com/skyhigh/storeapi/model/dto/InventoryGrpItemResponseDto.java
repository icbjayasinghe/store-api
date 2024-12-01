package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * InventoryGrpItemResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-30T00:29:02.649288+05:30[Asia/Colombo]")
@Builder
public class InventoryGrpItemResponseDto {

  public InventoryGrpItemResponseDto(String category, String brand, String product, Long stockQuantity, OffsetDateTime lastInboundDate, List<InventoryItemResponseDto> inventoryItems) {
    this.category = category;
    this.brand = brand;
    this.product = product;
    this.stockQuantity = stockQuantity;
    this.lastInboundDate = lastInboundDate;
    this.inventoryItems = inventoryItems;
  }

  @JsonProperty("category")
  private String category;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("product")
  private String product;

  @JsonProperty("stockQuantity")
  private Long stockQuantity;

  @JsonProperty("lastInboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastInboundDate;

  @JsonProperty("inventoryItems")
  @Valid
  private List<InventoryItemResponseDto> inventoryItems = null;

  public InventoryGrpItemResponseDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", required = false)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public InventoryGrpItemResponseDto brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  
  @Schema(name = "brand", required = false)
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public InventoryGrpItemResponseDto product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  
  @Schema(name = "product", required = false)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public InventoryGrpItemResponseDto stockQuantity(Long stockQuantity) {
    this.stockQuantity = stockQuantity;
    return this;
  }

  /**
   * Get stockQuantity
   * @return stockQuantity
  */
  
  @Schema(name = "stockQuantity", example = "10", required = false)
  public Long getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(Long stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  public InventoryGrpItemResponseDto lastInboundDate(OffsetDateTime lastInboundDate) {
    this.lastInboundDate = lastInboundDate;
    return this;
  }

  /**
   * Get lastInboundDate
   * @return lastInboundDate
  */
  @Valid 
  @Schema(name = "lastInboundDate", example = "2024-06-21T17:32:28Z", required = false)
  public OffsetDateTime getLastInboundDate() {
    return lastInboundDate;
  }

  public void setLastInboundDate(OffsetDateTime lastInboundDate) {
    this.lastInboundDate = lastInboundDate;
  }

  public InventoryGrpItemResponseDto inventoryItems(List<InventoryItemResponseDto> inventoryItems) {
    this.inventoryItems = inventoryItems;
    return this;
  }

  public InventoryGrpItemResponseDto addInventoryItemsItem(InventoryItemResponseDto inventoryItemsItem) {
    if (this.inventoryItems == null) {
      this.inventoryItems = new ArrayList<>();
    }
    this.inventoryItems.add(inventoryItemsItem);
    return this;
  }

  /**
   * Get inventoryItems
   * @return inventoryItems
  */
  @Valid 
  @Schema(name = "inventoryItems", required = false)
  public List<InventoryItemResponseDto> getInventoryItems() {
    return inventoryItems;
  }

  public void setInventoryItems(List<InventoryItemResponseDto> inventoryItems) {
    this.inventoryItems = inventoryItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryGrpItemResponseDto inventoryGrpItemResponseDto = (InventoryGrpItemResponseDto) o;
    return Objects.equals(this.category, inventoryGrpItemResponseDto.category) &&
        Objects.equals(this.brand, inventoryGrpItemResponseDto.brand) &&
        Objects.equals(this.product, inventoryGrpItemResponseDto.product) &&
        Objects.equals(this.stockQuantity, inventoryGrpItemResponseDto.stockQuantity) &&
        Objects.equals(this.lastInboundDate, inventoryGrpItemResponseDto.lastInboundDate) &&
        Objects.equals(this.inventoryItems, inventoryGrpItemResponseDto.inventoryItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, brand, product, stockQuantity, lastInboundDate, inventoryItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryGrpItemResponseDto {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    lastInboundDate: ").append(toIndentedString(lastInboundDate)).append("\n");
    sb.append("    inventoryItems: ").append(toIndentedString(inventoryItems)).append("\n");
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

