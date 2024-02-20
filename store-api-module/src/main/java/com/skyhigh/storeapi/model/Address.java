package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * AddressDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Address")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Address implements Serializable {

  public Address() {
  }

  public Address(Long addressId, String addresLine1, String addresLine2, String city, String state, String zip, String country) {
    this.addressId = addressId;
    this.addresLine1 = addresLine1;
    this.addresLine2 = addresLine2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("addressId")
  private Long addressId;

  @JsonProperty("addresLine1")
  private String addresLine1;

  @JsonProperty("addresLine2")
  private String addresLine2;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("zip")
  private String zip;

  @JsonProperty("country")
  private String country;

  public Address addressId(Long addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * Get addressId
   * @return addressId
  */
  
  @Schema(name = "addressId", example = "10", required = false)
  public Long getAddressId() {
    return addressId;
  }

  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  public Address addresLine1(String addresLine1) {
    this.addresLine1 = addresLine1;
    return this;
  }

  /**
   * Get addresLine1
   * @return addresLine1
  */
  
  @Schema(name = "addresLine1", example = "437 Lytton", required = false)
  public String getAddresLine1() {
    return addresLine1;
  }

  public void setAddresLine1(String addresLine1) {
    this.addresLine1 = addresLine1;
  }

  public Address addresLine2(String addresLine2) {
    this.addresLine2 = addresLine2;
    return this;
  }

  /**
   * Get addresLine2
   * @return addresLine2
  */
  
  @Schema(name = "addresLine2", example = "437 Lytton", required = false)
  public String getAddresLine2() {
    return addresLine2;
  }

  public void setAddresLine2(String addresLine2) {
    this.addresLine2 = addresLine2;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", example = "Palo Alto", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", example = "CA", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
  */
  
  @Schema(name = "zip", example = "94301", required = false)
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  
  @Schema(name = "country", example = "Canada", required = false)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address addressDto = (Address) o;
    return Objects.equals(this.addressId, addressDto.addressId) &&
        Objects.equals(this.addresLine1, addressDto.addresLine1) &&
        Objects.equals(this.addresLine2, addressDto.addresLine2) &&
        Objects.equals(this.city, addressDto.city) &&
        Objects.equals(this.state, addressDto.state) &&
        Objects.equals(this.zip, addressDto.zip) &&
        Objects.equals(this.country, addressDto.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, addresLine1, addresLine2, city, state, zip, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    addresLine1: ").append(toIndentedString(addresLine1)).append("\n");
    sb.append("    addresLine2: ").append(toIndentedString(addresLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

