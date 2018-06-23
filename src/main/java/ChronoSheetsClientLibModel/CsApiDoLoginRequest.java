/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * CsApiDoLoginRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:28:39.852+10:00")
public class CsApiDoLoginRequest {
  @SerializedName("UsernameOrEmail")
  private String usernameOrEmail = null;

  @SerializedName("Password")
  private String password = null;

  public CsApiDoLoginRequest usernameOrEmail(String usernameOrEmail) {
    this.usernameOrEmail = usernameOrEmail;
    return this;
  }

   /**
   * Get usernameOrEmail
   * @return usernameOrEmail
  **/
  @ApiModelProperty(value = "")
  public String getUsernameOrEmail() {
    return usernameOrEmail;
  }

  public void setUsernameOrEmail(String usernameOrEmail) {
    this.usernameOrEmail = usernameOrEmail;
  }

  public CsApiDoLoginRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
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
    CsApiDoLoginRequest doLoginRequest = (CsApiDoLoginRequest) o;
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
    sb.append("class CsApiDoLoginRequest {\n");
    
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

