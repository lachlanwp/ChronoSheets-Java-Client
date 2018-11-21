/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
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
 * Fields used to save a Client
 */
@ApiModel(description = "Fields used to save a Client")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T23:48:25.710+11:00")
public class CSSaveClientRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ClientName")
  private String clientName = null;

  @SerializedName("ClientAddressLine1")
  private String clientAddressLine1 = null;

  @SerializedName("ClientAddressLine2")
  private String clientAddressLine2 = null;

  @SerializedName("ClientSuburb")
  private String clientSuburb = null;

  @SerializedName("ClientState")
  private String clientState = null;

  @SerializedName("ClientPostCode")
  private String clientPostCode = null;

  @SerializedName("PersonOfContact")
  private String personOfContact = null;

  @SerializedName("ClientPhoneNumber")
  private String clientPhoneNumber = null;

  @SerializedName("ClientMobileNumber")
  private String clientMobileNumber = null;

  @SerializedName("ClientEmailAddress")
  private String clientEmailAddress = null;

  @SerializedName("ClientWebURL")
  private String clientWebURL = null;

  public CSSaveClientRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Client
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Client")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSSaveClientRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * The name of the Client
   * @return clientName
  **/
  @ApiModelProperty(value = "The name of the Client")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CSSaveClientRequest clientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
    return this;
  }

   /**
   * Address line 1 of the Client
   * @return clientAddressLine1
  **/
  @ApiModelProperty(value = "Address line 1 of the Client")
  public String getClientAddressLine1() {
    return clientAddressLine1;
  }

  public void setClientAddressLine1(String clientAddressLine1) {
    this.clientAddressLine1 = clientAddressLine1;
  }

  public CSSaveClientRequest clientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
    return this;
  }

   /**
   * Address line 2 of the Client
   * @return clientAddressLine2
  **/
  @ApiModelProperty(value = "Address line 2 of the Client")
  public String getClientAddressLine2() {
    return clientAddressLine2;
  }

  public void setClientAddressLine2(String clientAddressLine2) {
    this.clientAddressLine2 = clientAddressLine2;
  }

  public CSSaveClientRequest clientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
    return this;
  }

   /**
   * The suburb of the Client&#39;s address
   * @return clientSuburb
  **/
  @ApiModelProperty(value = "The suburb of the Client's address")
  public String getClientSuburb() {
    return clientSuburb;
  }

  public void setClientSuburb(String clientSuburb) {
    this.clientSuburb = clientSuburb;
  }

  public CSSaveClientRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * The state of the Client&#39;s address
   * @return clientState
  **/
  @ApiModelProperty(value = "The state of the Client's address")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public CSSaveClientRequest clientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
    return this;
  }

   /**
   * The post code of the Client&#39;s address
   * @return clientPostCode
  **/
  @ApiModelProperty(value = "The post code of the Client's address")
  public String getClientPostCode() {
    return clientPostCode;
  }

  public void setClientPostCode(String clientPostCode) {
    this.clientPostCode = clientPostCode;
  }

  public CSSaveClientRequest personOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
    return this;
  }

   /**
   * The name of the contact working with the Client
   * @return personOfContact
  **/
  @ApiModelProperty(value = "The name of the contact working with the Client")
  public String getPersonOfContact() {
    return personOfContact;
  }

  public void setPersonOfContact(String personOfContact) {
    this.personOfContact = personOfContact;
  }

  public CSSaveClientRequest clientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
    return this;
  }

   /**
   * The phone number of the Client
   * @return clientPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the Client")
  public String getClientPhoneNumber() {
    return clientPhoneNumber;
  }

  public void setClientPhoneNumber(String clientPhoneNumber) {
    this.clientPhoneNumber = clientPhoneNumber;
  }

  public CSSaveClientRequest clientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
    return this;
  }

   /**
   * The mobile phone number of the Client
   * @return clientMobileNumber
  **/
  @ApiModelProperty(value = "The mobile phone number of the Client")
  public String getClientMobileNumber() {
    return clientMobileNumber;
  }

  public void setClientMobileNumber(String clientMobileNumber) {
    this.clientMobileNumber = clientMobileNumber;
  }

  public CSSaveClientRequest clientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
    return this;
  }

   /**
   * The email address of the Client
   * @return clientEmailAddress
  **/
  @ApiModelProperty(value = "The email address of the Client")
  public String getClientEmailAddress() {
    return clientEmailAddress;
  }

  public void setClientEmailAddress(String clientEmailAddress) {
    this.clientEmailAddress = clientEmailAddress;
  }

  public CSSaveClientRequest clientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
    return this;
  }

   /**
   * The Client&#39;s website URL
   * @return clientWebURL
  **/
  @ApiModelProperty(value = "The Client's website URL")
  public String getClientWebURL() {
    return clientWebURL;
  }

  public void setClientWebURL(String clientWebURL) {
    this.clientWebURL = clientWebURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSSaveClientRequest saveClientRequest = (CSSaveClientRequest) o;
    return Objects.equals(this.id, saveClientRequest.id) &&
        Objects.equals(this.clientName, saveClientRequest.clientName) &&
        Objects.equals(this.clientAddressLine1, saveClientRequest.clientAddressLine1) &&
        Objects.equals(this.clientAddressLine2, saveClientRequest.clientAddressLine2) &&
        Objects.equals(this.clientSuburb, saveClientRequest.clientSuburb) &&
        Objects.equals(this.clientState, saveClientRequest.clientState) &&
        Objects.equals(this.clientPostCode, saveClientRequest.clientPostCode) &&
        Objects.equals(this.personOfContact, saveClientRequest.personOfContact) &&
        Objects.equals(this.clientPhoneNumber, saveClientRequest.clientPhoneNumber) &&
        Objects.equals(this.clientMobileNumber, saveClientRequest.clientMobileNumber) &&
        Objects.equals(this.clientEmailAddress, saveClientRequest.clientEmailAddress) &&
        Objects.equals(this.clientWebURL, saveClientRequest.clientWebURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientName, clientAddressLine1, clientAddressLine2, clientSuburb, clientState, clientPostCode, personOfContact, clientPhoneNumber, clientMobileNumber, clientEmailAddress, clientWebURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSSaveClientRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientAddressLine1: ").append(toIndentedString(clientAddressLine1)).append("\n");
    sb.append("    clientAddressLine2: ").append(toIndentedString(clientAddressLine2)).append("\n");
    sb.append("    clientSuburb: ").append(toIndentedString(clientSuburb)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    clientPostCode: ").append(toIndentedString(clientPostCode)).append("\n");
    sb.append("    personOfContact: ").append(toIndentedString(personOfContact)).append("\n");
    sb.append("    clientPhoneNumber: ").append(toIndentedString(clientPhoneNumber)).append("\n");
    sb.append("    clientMobileNumber: ").append(toIndentedString(clientMobileNumber)).append("\n");
    sb.append("    clientEmailAddress: ").append(toIndentedString(clientEmailAddress)).append("\n");
    sb.append("    clientWebURL: ").append(toIndentedString(clientWebURL)).append("\n");
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

