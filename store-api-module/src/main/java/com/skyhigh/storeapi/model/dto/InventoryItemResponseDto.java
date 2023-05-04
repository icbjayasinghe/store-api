package com.skyhigh.storeapi.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;


/**
 * InventoryItemResponseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
public class InventoryItemResponseDto {

  @JsonProperty("inventoryItemId")
  private Long inventoryItemId;

  @JsonProperty("branch")
  private BranchDto branch;

  @JsonProperty("batch")
  private BatchDto batch;

  @JsonProperty("quantity")
  private Long quantity;

  /**
   * Branch status in the app
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DEACTIVE("DEACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

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

  public InventoryItemResponseDto branch(BranchDto branch) {
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

  public InventoryItemResponseDto batch(BatchDto batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Get batch
   * @return batch
  */
  @Valid 
  @Schema(name = "batch", required = false)
  public BatchDto getBatch() {
    return batch;
  }

  public void setBatch(BatchDto batch) {
    this.batch = batch;
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

  public InventoryItemResponseDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Branch status in the app
   * @return status
  */
  
  @Schema(name = "status", description = "Branch status in the app", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
        Objects.equals(this.branch, inventoryItemResponseDto.branch) &&
        Objects.equals(this.batch, inventoryItemResponseDto.batch) &&
        Objects.equals(this.quantity, inventoryItemResponseDto.quantity) &&
        Objects.equals(this.status, inventoryItemResponseDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, branch, batch, quantity, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItemResponseDto {\n");
    sb.append("    inventoryItemId: ").append(toIndentedString(inventoryItemId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

