/*
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CsApiUpdateOrganisationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T17:51:45.139+10:00")
public class CsApiUpdateOrganisationRequest {
  @SerializedName("OrgansationId")
  private Integer organsationId = null;

  @SerializedName("OrganisationName")
  private String organisationName = null;

  @SerializedName("AddressLine01")
  private String addressLine01 = null;

  @SerializedName("AddressLine02")
  private String addressLine02 = null;

  @SerializedName("OrganisationSuburb")
  private String organisationSuburb = null;

  @SerializedName("OrganisationState")
  private String organisationState = null;

  @SerializedName("OrganisationPostcode")
  private String organisationPostcode = null;

  @SerializedName("OrganisationCountry")
  private String organisationCountry = null;

  @SerializedName("OrganisationPhone")
  private String organisationPhone = null;

  @SerializedName("OrganisationEmailAddress")
  private String organisationEmailAddress = null;

  public CsApiUpdateOrganisationRequest organsationId(Integer organsationId) {
    this.organsationId = organsationId;
    return this;
  }

   /**
   * Get organsationId
   * @return organsationId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrgansationId() {
    return organsationId;
  }

  public void setOrgansationId(Integer organsationId) {
    this.organsationId = organsationId;
  }

  public CsApiUpdateOrganisationRequest organisationName(String organisationName) {
    this.organisationName = organisationName;
    return this;
  }

   /**
   * Get organisationName
   * @return organisationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationName() {
    return organisationName;
  }

  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  public CsApiUpdateOrganisationRequest addressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
    return this;
  }

   /**
   * Get addressLine01
   * @return addressLine01
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine01() {
    return addressLine01;
  }

  public void setAddressLine01(String addressLine01) {
    this.addressLine01 = addressLine01;
  }

  public CsApiUpdateOrganisationRequest addressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
    return this;
  }

   /**
   * Get addressLine02
   * @return addressLine02
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine02() {
    return addressLine02;
  }

  public void setAddressLine02(String addressLine02) {
    this.addressLine02 = addressLine02;
  }

  public CsApiUpdateOrganisationRequest organisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
    return this;
  }

   /**
   * Get organisationSuburb
   * @return organisationSuburb
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationSuburb() {
    return organisationSuburb;
  }

  public void setOrganisationSuburb(String organisationSuburb) {
    this.organisationSuburb = organisationSuburb;
  }

  public CsApiUpdateOrganisationRequest organisationState(String organisationState) {
    this.organisationState = organisationState;
    return this;
  }

   /**
   * Get organisationState
   * @return organisationState
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationState() {
    return organisationState;
  }

  public void setOrganisationState(String organisationState) {
    this.organisationState = organisationState;
  }

  public CsApiUpdateOrganisationRequest organisationPostcode(String organisationPostcode) {
    this.organisationPostcode = organisationPostcode;
    return this;
  }

   /**
   * Get organisationPostcode
   * @return organisationPostcode
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationPostcode() {
    return organisationPostcode;
  }

  public void setOrganisationPostcode(String organisationPostcode) {
    this.organisationPostcode = organisationPostcode;
  }

  public CsApiUpdateOrganisationRequest organisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
    return this;
  }

   /**
   * Get organisationCountry
   * @return organisationCountry
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationCountry() {
    return organisationCountry;
  }

  public void setOrganisationCountry(String organisationCountry) {
    this.organisationCountry = organisationCountry;
  }

  public CsApiUpdateOrganisationRequest organisationPhone(String organisationPhone) {
    this.organisationPhone = organisationPhone;
    return this;
  }

   /**
   * Get organisationPhone
   * @return organisationPhone
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationPhone() {
    return organisationPhone;
  }

  public void setOrganisationPhone(String organisationPhone) {
    this.organisationPhone = organisationPhone;
  }

  public CsApiUpdateOrganisationRequest organisationEmailAddress(String organisationEmailAddress) {
    this.organisationEmailAddress = organisationEmailAddress;
    return this;
  }

   /**
   * Get organisationEmailAddress
   * @return organisationEmailAddress
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationEmailAddress() {
    return organisationEmailAddress;
  }

  public void setOrganisationEmailAddress(String organisationEmailAddress) {
    this.organisationEmailAddress = organisationEmailAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiUpdateOrganisationRequest updateOrganisationRequest = (CsApiUpdateOrganisationRequest) o;
    return Objects.equals(this.organsationId, updateOrganisationRequest.organsationId) &&
        Objects.equals(this.organisationName, updateOrganisationRequest.organisationName) &&
        Objects.equals(this.addressLine01, updateOrganisationRequest.addressLine01) &&
        Objects.equals(this.addressLine02, updateOrganisationRequest.addressLine02) &&
        Objects.equals(this.organisationSuburb, updateOrganisationRequest.organisationSuburb) &&
        Objects.equals(this.organisationState, updateOrganisationRequest.organisationState) &&
        Objects.equals(this.organisationPostcode, updateOrganisationRequest.organisationPostcode) &&
        Objects.equals(this.organisationCountry, updateOrganisationRequest.organisationCountry) &&
        Objects.equals(this.organisationPhone, updateOrganisationRequest.organisationPhone) &&
        Objects.equals(this.organisationEmailAddress, updateOrganisationRequest.organisationEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organsationId, organisationName, addressLine01, addressLine02, organisationSuburb, organisationState, organisationPostcode, organisationCountry, organisationPhone, organisationEmailAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiUpdateOrganisationRequest {\n");
    
    sb.append("    organsationId: ").append(toIndentedString(organsationId)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    addressLine01: ").append(toIndentedString(addressLine01)).append("\n");
    sb.append("    addressLine02: ").append(toIndentedString(addressLine02)).append("\n");
    sb.append("    organisationSuburb: ").append(toIndentedString(organisationSuburb)).append("\n");
    sb.append("    organisationState: ").append(toIndentedString(organisationState)).append("\n");
    sb.append("    organisationPostcode: ").append(toIndentedString(organisationPostcode)).append("\n");
    sb.append("    organisationCountry: ").append(toIndentedString(organisationCountry)).append("\n");
    sb.append("    organisationPhone: ").append(toIndentedString(organisationPhone)).append("\n");
    sb.append("    organisationEmailAddress: ").append(toIndentedString(organisationEmailAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

