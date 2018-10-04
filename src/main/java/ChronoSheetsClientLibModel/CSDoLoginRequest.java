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
 * An API Request object for logging into ChronoSheets
 */
@ApiModel(description = "An API Request object for logging into ChronoSheets")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T19:12:08.464+10:00")
public class CSDoLoginRequest {
  @SerializedName("UsernameOrEmail")
  private String usernameOrEmail = null;

  @SerializedName("Password")
  private String password = null;

  public CSDoLoginRequest usernameOrEmail(String usernameOrEmail) {
    this.usernameOrEmail = usernameOrEmail;
    return this;
  }

   /**
   * Your ChronoSheets username or registered email address
   * @return usernameOrEmail
  **/
  @ApiModelProperty(value = "Your ChronoSheets username or registered email address")
  public String getUsernameOrEmail() {
    return usernameOrEmail;
  }

  public void setUsernameOrEmail(String usernameOrEmail) {
    this.usernameOrEmail = usernameOrEmail;
  }

  public CSDoLoginRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your ChronoSheets password
   * @return password
  **/
  @ApiModelProperty(value = "Your ChronoSheets password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSDoLoginRequest doLoginRequest = (CSDoLoginRequest) o;
    return Objects.equals(this.usernameOrEmail, doLoginRequest.usernameOrEmail) &&
        Objects.equals(this.password, doLoginRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usernameOrEmail, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSDoLoginRequest {\n");
    
    sb.append("    usernameOrEmail: ").append(toIndentedString(usernameOrEmail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

