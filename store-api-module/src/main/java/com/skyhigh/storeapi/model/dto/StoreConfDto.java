package com.skyhigh.storeapi.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StoreConfDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-30T13:54:53.903585+05:30[Asia/Colombo]")
public class StoreConfDto {

  @JsonProperty("store")
  private StoreDto store;

  @JsonProperty("branch")
  private BranchDto branch;

  @JsonProperty("user")
  private UserConfDto user;

  @JsonProperty("additionalConf")
  @Valid
  private Map<String, PropertyObjectDto> additionalConf = null;

  public StoreConfDto store(StoreDto store) {
    this.store = store;
    return this;
  }

  /**
   * Get store
   * @return store
   */
  @Valid
  @Schema(name = "store", required = false)
  public StoreDto getStore() {
    return store;
  }

  public void setStore(StoreDto store) {
    this.store = store;
  }

  public StoreConfDto branch(BranchDto branch) {
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

  public StoreConfDto user(UserConfDto user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid
  @Schema(name = "user", required = false)
  public UserConfDto getUser() {
    return user;
  }

  public void setUser(UserConfDto user) {
    this.user = user;
  }

  public StoreConfDto additionalConf(Map<String, PropertyObjectDto> additionalConf) {
    this.additionalConf = additionalConf;
    return this;
  }

  public StoreConfDto putAdditionalConfItem(String key, PropertyObjectDto additionalConfItem) {
    if (this.additionalConf == null) {
      this.additionalConf = new HashMap<>();
    }
    this.additionalConf.put(key, additionalConfItem);
    return this;
  }

  /**
   * Get additionalConf
   * @return additionalConf
   */
  @Valid
  @Schema(name = "additionalConf", required = false)
  public Map<String, PropertyObjectDto> getAdditionalConf() {
    return additionalConf;
  }

  public void setAdditionalConf(Map<String, PropertyObjectDto> additionalConf) {
    this.additionalConf = additionalConf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreConfDto storeConfDto = (StoreConfDto) o;
    return Objects.equals(this.store, storeConfDto.store) &&
            Objects.equals(this.branch, storeConfDto.branch) &&
            Objects.equals(this.user, storeConfDto.user) &&
            Objects.equals(this.additionalConf, storeConfDto.additionalConf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(store, branch, user, additionalConf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreConfDto {\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    additionalConf: ").append(toIndentedString(additionalConf)).append("\n");
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

