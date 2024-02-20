package com.skyhigh.storeapi.model;

import com.fasterxml.jackson.annotation.*;
import com.skyhigh.storeapi.model.dto.AddressDto;
import com.skyhigh.storeapi.model.dto.BranchDto;
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
@Table(name = "Branch")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Branch implements Serializable {
    public Branch() {
    }

    public Branch(Long branchId, Long storeId, String branchName, Address address, String photoUrl, BranchStatus status) {
        this.branchId = branchId;
        this.storeId = storeId;
        this.branchName = branchName;
        this.address = address;
        this.photoUrl = photoUrl;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("branchId")
    private Long branchId;

    @JsonProperty("storeId")
    private Long storeId;

    @JsonProperty("branchName")
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    @JsonIgnore
    private Address address;

    @JsonProperty("photoUrl")
    private String photoUrl;



    @JsonProperty("status")
    private BranchStatus status;

    public Branch branchId(Long branchId) {
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

    public Branch storeId(Long storeId) {
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

    public Branch branchName(String branchName) {
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

    public Branch address(Address address) {
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

    public Branch photoUrl(String photoUrl) {
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

    public Branch status(BranchStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Branch status in the app
     * @return status
     */

    @Schema(name = "status", description = "Branch status in the app", required = false)
    public BranchStatus getStatus() {
        return status;
    }

    public void setStatus(BranchStatus status) {
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
        Branch branch = (Branch) o;
        return Objects.equals(this.branchId, branch.branchId) &&
                Objects.equals(this.storeId, branch.storeId) &&
                Objects.equals(this.branchName, branch.branchName) &&
                Objects.equals(this.address, branch.address) &&
                Objects.equals(this.photoUrl, branch.photoUrl) &&
                Objects.equals(this.status, branch.status);
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
