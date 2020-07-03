/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibModel;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T21:12:18.282+10:00[Australia/Sydney]")
public class UpdateUserRequest {
  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER = "IsSubscribedToNewsletter";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_NEWSLETTER)
  private Boolean isSubscribedToNewsletter;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_ACTIVE = "IsAccountActive";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_ACTIVE)
  private Boolean isAccountActive;

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Long roles;

  public static final String SERIALIZED_NAME_ALERT_SETTINGS = "AlertSettings";
  @SerializedName(SERIALIZED_NAME_ALERT_SETTINGS)
  private Long alertSettings;


  public UpdateUserRequest userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The Id of the User that is to be updated
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Id of the User that is to be updated")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public UpdateUserRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The Email Address of the employee
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Email Address of the employee")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UpdateUserRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The First Name of the employee
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The First Name of the employee")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UpdateUserRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The Last Name of the employee
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Last Name of the employee")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UpdateUserRequest isSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
    return this;
  }

   /**
   * Whether or not the employee is subscribed to ChronoSheets newsletters
   * @return isSubscribedToNewsletter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the employee is subscribed to ChronoSheets newsletters")

  public Boolean getIsSubscribedToNewsletter() {
    return isSubscribedToNewsletter;
  }


  public void setIsSubscribedToNewsletter(Boolean isSubscribedToNewsletter) {
    this.isSubscribedToNewsletter = isSubscribedToNewsletter;
  }


  public UpdateUserRequest isAccountActive(Boolean isAccountActive) {
    
    this.isAccountActive = isAccountActive;
    return this;
  }

   /**
   * Whether or not the employee account is active
   * @return isAccountActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the employee account is active")

  public Boolean getIsAccountActive() {
    return isAccountActive;
  }


  public void setIsAccountActive(Boolean isAccountActive) {
    this.isAccountActive = isAccountActive;
  }


  public UpdateUserRequest roles(Long roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A BIT field designating which Roles/Permissions the employee will have when they sign in.  See the {timesheets.types.Enums.UserRoles} Enum for more details")

  public Long getRoles() {
    return roles;
  }


  public void setRoles(Long roles) {
    this.roles = roles;
  }


  public UpdateUserRequest alertSettings(Long alertSettings) {
    
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * A BIT field designating which Alerts the employee will receive.  See the {timesheets.types.Enums.AlertSettings} Enum for more details
   * @return alertSettings
  **/
  @javax.annotation.Nullable
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
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
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
    sb.append("class UpdateUserRequest {\n");
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

