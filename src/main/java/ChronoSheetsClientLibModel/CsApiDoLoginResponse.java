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
import ChronoSheetsClientLibModel.CsApiClientSideUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CsApiDoLoginResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T16:22:21.296+10:00")
public class CsApiDoLoginResponse {
  @SerializedName("CSAuthToken")
  private String csAuthToken = null;

  @SerializedName("LoggedInUser")
  private CsApiClientSideUser loggedInUser = null;

  public CsApiDoLoginResponse csAuthToken(String csAuthToken) {
    this.csAuthToken = csAuthToken;
    return this;
  }

   /**
   * Get csAuthToken
   * @return csAuthToken
  **/
  @ApiModelProperty(value = "")
  public String getCsAuthToken() {
    return csAuthToken;
  }

  public void setCsAuthToken(String csAuthToken) {
    this.csAuthToken = csAuthToken;
  }

  public CsApiDoLoginResponse loggedInUser(CsApiClientSideUser loggedInUser) {
    this.loggedInUser = loggedInUser;
    return this;
  }

   /**
   * Get loggedInUser
   * @return loggedInUser
  **/
  @ApiModelProperty(value = "")
  public CsApiClientSideUser getLoggedInUser() {
    return loggedInUser;
  }

  public void setLoggedInUser(CsApiClientSideUser loggedInUser) {
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
    CsApiDoLoginResponse doLoginResponse = (CsApiDoLoginResponse) o;
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
    sb.append("class CsApiDoLoginResponse {\n");
    
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

