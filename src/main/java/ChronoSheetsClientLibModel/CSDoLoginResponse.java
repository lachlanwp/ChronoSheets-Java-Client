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
import ChronoSheetsClientLibModel.CSClientSideUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A Response object containing important information that can be used after the user has logged in
 */
@ApiModel(description = "A Response object containing important information that can be used after the user has logged in")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T22:54:32.605+11:00")
public class CSDoLoginResponse {
  @SerializedName("CSAuthToken")
  private String csAuthToken = null;

  @SerializedName("LoggedInUser")
  private CSClientSideUser loggedInUser = null;

  public CSDoLoginResponse csAuthToken(String csAuthToken) {
    this.csAuthToken = csAuthToken;
    return this;
  }

   /**
   * The ChronoSheets Auth Token.  Use this token for all subsequent requests to the API.  The Auth Token does these things: holds your session and gives you appropraite authorisation to access API endpoints based on your UserRoles
   * @return csAuthToken
  **/
  @ApiModelProperty(value = "The ChronoSheets Auth Token.  Use this token for all subsequent requests to the API.  The Auth Token does these things: holds your session and gives you appropraite authorisation to access API endpoints based on your UserRoles")
  public String getCsAuthToken() {
    return csAuthToken;
  }

  public void setCsAuthToken(String csAuthToken) {
    this.csAuthToken = csAuthToken;
  }

  public CSDoLoginResponse loggedInUser(CSClientSideUser loggedInUser) {
    this.loggedInUser = loggedInUser;
    return this;
  }

   /**
   * An object containg all your account information
   * @return loggedInUser
  **/
  @ApiModelProperty(value = "An object containg all your account information")
  public CSClientSideUser getLoggedInUser() {
    return loggedInUser;
  }

  public void setLoggedInUser(CSClientSideUser loggedInUser) {
    this.loggedInUser = loggedInUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSDoLoginResponse doLoginResponse = (CSDoLoginResponse) o;
    return Objects.equals(this.csAuthToken, doLoginResponse.csAuthToken) &&
        Objects.equals(this.loggedInUser, doLoginResponse.loggedInUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csAuthToken, loggedInUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSDoLoginResponse {\n");
    
    sb.append("    csAuthToken: ").append(toIndentedString(csAuthToken)).append("\n");
    sb.append("    loggedInUser: ").append(toIndentedString(loggedInUser)).append("\n");
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

