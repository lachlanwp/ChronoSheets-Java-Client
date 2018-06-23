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
 * CsApiUserProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T16:22:21.296+10:00")
public class CsApiUserProfile {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;

  @SerializedName("Roles")
  private Long roles = null;

  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  @SerializedName("OrganisationName")
  private String organisationName = null;

  @SerializedName("OrganisationSuburb")
  private String organisationSuburb = null;

  @SerializedName("OrganisationCountry")
  private String organisationCountry = null;

  public CsApiUserProfile id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CsApiUserProfile organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CsApiUserProfile userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CsApiUserProfile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CsApiUserProfile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CsApiUserProfile emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CsApiUserProfile isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
    return this;
  }

   /**
   * Get isSubscribedToNewsletter
   * @return isSubscribedToNewsletter
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }

  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  public CsApiUserProfile roles(Long roles) {
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public Long getRoles() {
    return roles;
  }

  public void setRoles(Long roles) {
    this.roles = roles;
  }

  public CsApiUserProfile alertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * Get alertSettings
   * @return alertSettings
  **/
  @ApiModelProperty(value = "")
  public Long getAlertSettings() {
    return alertSettings;
  }

  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }

  public CsApiUserProfile organisationName(String organisationName) {
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

  public CsApiUserProfile organisationSuburb(String organisationSuburb) {
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

  public CsApiUserProfile organisationCountry(String organisationCountry) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiUserProfile userProfile = (CsApiUserProfile) o;
    return Objects.equals(this.id, userProfile.id) &&
        Objects.equals(this.organisationId, userProfile.organisationId) &&
        Objects.equals(this.userName, userProfile.userName) &&
        Objects.equals(this.firstName, userProfile.firstName) &&
        Objects.equals(this.lastName, userProfile.lastName) &&
        Objects.equals(this.emailAddress, userProfile.emailAddress) &&
        Objects.equals(this.isSubscribedToNewsletter, userProfile.isSubscribedToNewsletter) &&
        Objects.equals(this.roles, userProfile.roles) &&
        Objects.equals(this.alertSettings, userProfile.alertSettings) &&
        Objects.equals(this.organisationName, userProfile.organisationName) &&
        Objects.equals(this.organisationSuburb, userProfile.organisationSuburb) &&
        Objects.equals(this.organisationCountry, userProfile.organisationCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, userName, firstName, lastName, emailAddress, isSubscribedToNewsletter, roles, alertSettings, organisationName, organisationSuburb, organisationCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiUserProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    organisationSuburb: ").append(toIndentedString(organisationSuburb)).append("\n");
    sb.append("    organisationCountry: ").append(toIndentedString(organisationCountry)).append("\n");
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

