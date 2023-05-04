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
 * BranchDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
public class BranchDto {

  @JsonProperty("branchId")
  private Long branchId;

  @JsonProperty("storeId")
  private Long storeId;

  @JsonProperty("branchName")
  private String branchName;

  @JsonProperty("address")
  private AddressDto address;

  @JsonProperty("photoUrl")
  private String photoUrl;

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

  public BranchDto branchId(Long branchId) {
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

  public BranchDto storeId(Long storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  */
  @NotNull 
  @Schema(name = "storeId", example = "10", required = true)
  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public BranchDto branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Get branchName
   * @return branchName
  */
  @NotNull 
  @Schema(name = "branchName", example = "Branch Toronto", required = true)
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public BranchDto address(AddressDto address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) {
    this.address = address;
  }

  public BranchDto photoUrl(String photoUrl) {
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

  public BranchDto status(StatusEnum status) {
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
    BranchDto branchDto = (BranchDto) o;
    return Objects.equals(this.branchId, branchDto.branchId) &&
        Objects.equals(this.storeId, branchDto.storeId) &&
        Objects.equals(this.branchName, branchDto.branchName) &&
        Objects.equals(this.address, branchDto.address) &&
        Objects.equals(this.photoUrl, branchDto.photoUrl) &&
        Objects.equals(this.status, branchDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, storeId, branchName, address, photoUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchDto {\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
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

