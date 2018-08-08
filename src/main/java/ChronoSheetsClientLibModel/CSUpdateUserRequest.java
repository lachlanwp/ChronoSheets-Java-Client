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
 * Fields for updating an employee User Account
 */
@ApiModel(description = "Fields for updating an employee User Account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T20:20:15.013+10:00")
public class CSUpdateUserRequest {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("EmailAddress")
  private String emailAddress = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("IsSubscribedToNewsletter")
  private Boolean isSubscribedToNewsletter = null;

  @SerializedName("IsAccountActive")
  private Boolean isAccountActive = null;

  @SerializedName("Roles")
  private Long roles = null;

  @SerializedName("AlertSettings")
  private Long alertSettings = null;

  public CSUpdateUserRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The Id of the User that is to be updated
   * @return userId
  **/
  @ApiModelProperty(value = "The Id of the User that is to be updated")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CSUpdateUserRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The Email Address of the employee
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The Email Address of the employee")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public CSUpdateUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The First Name of the employee
   * @return firstName
  **/
  @ApiModelProperty(value = "The First Name of the employee")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CSUpdateUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The Last Name of the employee
   * @return lastName
  **/
  @ApiModelProperty(value = "The Last Name of the employee")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CSUpdateUserRequest isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
    return this;
  }

   /**
   * Whether or not the employee is subscribed to ChronoSheets newsletters
   * @return isSubscribedToNewsletter
  **/
  @ApiModelProperty(value = "Whether or not the employee is subscribed to ChronoSheets newsletters")
  public Boolean isIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }

  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }

  public CSUpdateUserRequest isAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
    return this;
  }

   /**
   * Whether or not the employee account is active
   * @return isAccountActive
  **/
  @ApiModelProperty(value = "Whether or not the employee account is active")
  public Boolean isIsAccountActive() {
    return isAccountActive;
  }

  public void setIsAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
  }

  public CSUpdateUserRequest roles(Long roles) {
    this.roles = roles;
    return this;
  }

   /**
   * A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details
   * @return roles
  **/
  @ApiModelProperty(value = "A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details")
  public Long getRoles() {
    return roles;
  }

  public void setRoles(Long roles) {
    this.roles = roles;
  }

  public CSUpdateUserRequest alertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details
   * @return alertSettings
  **/
  @ApiModelProperty(value = "A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details")
  public Long getAlertSettings() {
    return alertSettings;
  }

  public void setAlertSettings(Long alertSettings) {
    this.alertSettings = alertSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateUserRequest updateUserRequest = (CSUpdateUserRequest) o;
    return Objects.equals(this.userId, updateUserRequest.userId) &&
        Objects.equals(this.emailAddress, updateUserRequest.emailAddress) &&
        Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.isSubscribedToNewsletter, updateUserRequest.isSubscribedToNewsletter) &&
        Objects.equals(this.isAccountActive, updateUserRequest.isAccountActive) &&
        Objects.equals(this.roles, updateUserRequest.roles) &&
        Objects.equals(this.alertSettings, updateUserRequest.alertSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, emailAddress, firstName, lastName, isSubscribedToNewsletter, isAccountActive, roles, alertSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateUserRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isSubscribedToNewsletter: ").append(toIndentedString(isSubscribedToNewsletter)).append("\n");
    sb.append("    isAccountActive: ").append(toIndentedString(isAccountActive)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
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

