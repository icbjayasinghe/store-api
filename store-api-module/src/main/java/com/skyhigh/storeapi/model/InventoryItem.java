package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.*;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;


/**
 * InventoryItemDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "InventoryItem")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class InventoryItem {

  public InventoryItem() {
  }

  public InventoryItem(Long inventoryItemId, Batch batch, Branch branch, Double buyingPrice, Double sellingPrice, Long quantity, InventoryItemStatus status, OffsetDateTime inboundDate, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.inventoryItemId = inventoryItemId;
    this.batch = batch;
    this.branch = branch;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.quantity = quantity;
    this.status = status;
    this.inboundDate = inboundDate;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("inventoryItemId")
  private Long inventoryItemId;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "batchId", nullable = false)
  @JsonIgnore
  private Batch batch;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "branchId", nullable = false)
  @JsonIgnore
  private Branch branch;

  @JsonProperty("buyingPrice")
  private Double buyingPrice;

  @JsonProperty("sellingPrice")
  private Double sellingPrice;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("status")
  private InventoryItemStatus status;

  @JsonProperty("inboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inboundDate;

  @CreatedDate
  @Column(name = "created_at", nullable = false, updatable = false)
  private OffsetDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private OffsetDateTime updatedAt;

  public InventoryItem inventoryItemId(Long inventoryItemId) {
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

  public InventoryItem batchId(Batch batchId) {
    this.batch = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
  */
  @Schema(name = "batchId", example = "10", required = true)
  public Batch getBatch() {
    return batch;
  }

  public void setBatch(Batch batchId) {
    this.batch = batchId;
  }

  public InventoryItem branchId(Branch branchId) {
    this.branch = branchId;
    return this;
  }

  /**
   * Get branchId
   * @return branchId
   */
  @NotNull
  @Schema(name = "branchId", example = "10", required = true)
  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }

  public InventoryItem buyingPrice(Double buyingPrice) {
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

  public InventoryItem sellingPrice(Double sellingPrice) {
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

  public InventoryItem quantity(Long quantity) {
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

  public InventoryItem status(InventoryItemStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Branch status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "Branch status in the app", required = false)
  public InventoryItemStatus getStatus() {
    return status;
  }

  public void setStatus(InventoryItemStatus status) {
    this.status = status;
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

  public OffsetDateTime getInboundDate() {
    return inboundDate;
  }

  public void setInboundDate(OffsetDateTime inboundDate) {
    this.inboundDate = inboundDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItem inventoryItemDto = (InventoryItem) o;
    return Objects.equals(this.inventoryItemId, inventoryItemDto.inventoryItemId) &&
            Objects.equals(this.batch, inventoryItemDto.batch) &&
            Objects.equals(this.branch, inventoryItemDto.branch) &&
            Objects.equals(this.buyingPrice, inventoryItemDto.buyingPrice) &&
            Objects.equals(this.sellingPrice, inventoryItemDto.sellingPrice) &&
            Objects.equals(this.quantity, inventoryItemDto.quantity) &&
            Objects.equals(this.inboundDate, inventoryItemDto.inboundDate) &&
            Objects.equals(this.status, inventoryItemDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, batch, branch, buyingPrice, sellingPrice, quantity, inboundDate, status);
  }



  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItemDto {\n");
    sb.append("    inventoryItemId: ").append(toIndentedString(inventoryItemId)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

