package com.skyhigh.storeapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InventoryGrpItemDto
 */

@Builder
@Getter
@Setter
public class InventoryGrpItemDto {

  @JsonProperty("category")
  private String category;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("product")
  private String product;

  @JsonProperty("productId")
  private Long productId;

  @JsonProperty("stockQuantity")
  private Long stockQuantity;

  @JsonProperty("lastInboundDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastInboundDate;

  public InventoryGrpItemDto(String category, String brand, String product, Long productId, Long stockQuantity, OffsetDateTime lastInboundDate) {
    this.category = category;
    this.brand = brand;
    this.product = product;
    this.productId = productId;
    this.stockQuantity = stockQuantity;
    this.lastInboundDate = lastInboundDate;
  }
}

