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
import java.util.ArrayList;
import java.util.List;

/**
 * CsApiSignupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T17:51:45.139+10:00")
public class CsApiSignupResponse {
  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("ValidationErrors")
  private List<String> validationErrors = null;

  public CsApiSignupResponse organisationId(Integer organisationId) {
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

  public CsApiSignupResponse userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CsApiSignupResponse validationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public CsApiSignupResponse addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @ApiModelProperty(value = "")
  public List<String> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiSignupResponse signupResponse = (CsApiSignupResponse) o;
    return Objects.equals(this.organisationId, signupResponse.organisationId) &&
        Objects.equals(this.userId, signupResponse.userId) &&
        Objects.equals(this.validationErrors, signupResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, userId, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiSignupResponse {\n");
    
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

