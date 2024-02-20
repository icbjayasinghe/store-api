package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyhigh.storeapi.model.dto.AddressDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Builder
@Entity
@Table(name = "Store")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Store implements Serializable {
    public Store() {
    }

    public Store(Long storeId, String storeName, Address address, String photoUrl, StoreStatus status) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.address = address;
        this.photoUrl = photoUrl;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("storeId")
    private Long storeId;

    @JsonProperty("storeName")
    private String storeName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    @JsonIgnore
    private Address address;

    @JsonProperty("photoUrl")
    private String photoUrl;

    @JsonProperty("status")
    private StoreStatus status;

    public Store storeId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Get storeId
     * @return storeId
     */

    @Schema(name = "storeId", example = "10", required = false)
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Store storeName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * Get storeName
     * @return storeName
     */
    @NotNull
    @Schema(name = "storeName", example = "Auto Range, MagCity", required = true)
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Store address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     */
    @Valid
    @Schema(name = "address", required = false)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Store photoUrl(String photoUrl) {
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

    public Store status(StoreStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Store status in the app
     * @return status
     */

    @Schema(name = "status", description = "Store status in the app", required = false)
    public StoreStatus getStatus() {
        return status;
    }

    public void setStatus(StoreStatus status) {
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
        Store store = (Store) o;
        return Objects.equals(this.storeId, store.storeId) &&
                Objects.equals(this.storeName, store.storeName) &&
                Objects.equals(this.address, store.address) &&
                Objects.equals(this.photoUrl, store.photoUrl) &&
                Objects.equals(this.status, store.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeName, address, photoUrl, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Store {\n");
        sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
        sb.append("    storeStatus: ").append(toIndentedString(status)).append("\n");
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
