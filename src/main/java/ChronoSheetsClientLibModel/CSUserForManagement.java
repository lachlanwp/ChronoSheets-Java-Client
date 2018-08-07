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
import ChronoSheetsClientLibModel.CSOrganisation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSUserForManagement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T01:15:39.652+10:00")
public class CSUserForManagement {
  @SerializedName("IsAccountActive")
  private Boolean isAccountActive = null;

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

  @SerializedName("Roles")
  private Long roles = null;

  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  @SerializedName("SetupWizardRequired")
  private Boolean setupWizardRequired = null;

  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;

  @SerializedName("Organisation")
  private CSOrganisation organisation = null;

  public CSUserForManagement isAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
    return this;
  }

   /**
   * Get isAccountActive
   * @return isAccountActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAccountActive() {
    return isAccountActive;
  }

  public void setIsAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
  }

  public CSUserForManagement id(Integer id) {
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

  public CSUserForManagement organisationId(Integer organisationId) {
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

  public CSUserForManagement userName(String userName) {
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

  public CSUserForManagement firstName(String firstName) {
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

  public CSUserForManagement lastName(String lastName) {
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

  public CSUserForManagement emailAddress(String emailAddress) {
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

  public CSUserForManagement roles(Long roles) {
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

  public CSUserForManagement alertSettings(Long alertSettings) {
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

  public CSUserForManagement setupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
    return this;
  }

   /**
   * Get setupWizardRequired
   * @return setupWizardRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isSetupWizardRequired() {
    return setupWizardRequired;
  }

  public void setSetupWizardRequired(Boolean setupWizardRequired) {
    this.setupWizardRequired = setupWizardRequired;
  }

  public CSUserForManagement isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
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

  public CSUserForManagement organisation(CSOrganisation organisation) {
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")
  public CSOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(CSOrganisation organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUserForManagement userForManagement = (CSUserForManagement) o;
    return Objects.equals(this.isAccountActive, userForManagement.isAccountActive) &&
        Objects.equals(this.id, userForManagement.id) &&
        Objects.equals(this.organisationId, userForManagement.organisationId) &&
        Objects.equals(this.userName, userForManagement.userName) &&
        Objects.equals(this.firstName, userForManagement.firstName) &&
        Objects.equals(this.lastName, userForManagement.lastName) &&
        Objects.equals(this.emailAddress, userForManagement.emailAddress) &&
        Objects.equals(this.roles, userForManagement.roles) &&
        Objects.equals(this.alertSettings, userForManagement.alertSettings) &&
        Objects.equals(this.setupWizardRequired, userForManagement.setupWizardRequired) &&
        Objects.equals(this.isSubscribedToNewsletter, userForManagement.isSubscribedToNewsletter) &&
        Objects.equals(this.organisation, userForManagement.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAccountActive, id, organisationId, userName, firstName, lastName, emailAddress, roles, alertSettings, setupWizardRequired, isSubscribedToNewsletter, organisation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUserForManagement {\n");
    
    sb.append("    isAccountActive: ").append(toIndentedString(isAccountActive)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    setupWizardRequired: ").append(toIndentedString(setupWizardRequired)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

