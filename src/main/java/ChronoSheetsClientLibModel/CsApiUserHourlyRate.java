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
import org.threeten.bp.OffsetDateTime;

/**
 * CsApiUserHourlyRate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:28:39.852+10:00")
public class CsApiUserHourlyRate {
  @SerializedName("RateId")
  private Integer rateId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("IsCurrent")
  private Boolean isCurrent = null;

  @SerializedName("HourlyRate")
  private Double hourlyRate = null;

  @SerializedName("HourlyOvertimeRate")
  private Double hourlyOvertimeRate = null;

  @SerializedName("StartDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("EndDateTime")
  private OffsetDateTime endDateTime = null;

  public CsApiUserHourlyRate rateId(Integer rateId) {
    this.rateId = rateId;
    return this;
  }

   /**
   * Get rateId
   * @return rateId
  **/
  @ApiModelProperty(value = "")
  public Integer getRateId() {
    return rateId;
  }

  public void setRateId(Integer rateId) {
    this.rateId = rateId;
  }

  public CsApiUserHourlyRate userId(Integer userId) {
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

  public CsApiUserHourlyRate organisationId(Integer organisationId) {
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

  public CsApiUserHourlyRate isCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
    return this;
  }

   /**
   * Get isCurrent
   * @return isCurrent
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) {
    this.isCurrent = isCurrent;
  }

  public CsApiUserHourlyRate hourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
    return this;
  }

   /**
   * Get hourlyRate
   * @return hourlyRate
  **/
  @ApiModelProperty(value = "")
  public Double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public CsApiUserHourlyRate hourlyOvertimeRate(Double hourlyOvertimeRate) {
    this.hourlyOvertimeRate = hourlyOvertimeRate;
    return this;
  }

   /**
   * Get hourlyOvertimeRate
   * @return hourlyOvertimeRate
  **/
  @ApiModelProperty(value = "")
  public Double getHourlyOvertimeRate() {
    return hourlyOvertimeRate;
  }

  public void setHourlyOvertimeRate(Double hourlyOvertimeRate) {
    this.hourlyOvertimeRate = hourlyOvertimeRate;
  }

  public CsApiUserHourlyRate startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public CsApiUserHourlyRate endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiUserHourlyRate userHourlyRate = (CsApiUserHourlyRate) o;
    return Objects.equals(this.rateId, userHourlyRate.rateId) &&
        Objects.equals(this.userId, userHourlyRate.userId) &&
        Objects.equals(this.organisationId, userHourlyRate.organisationId) &&
        Objects.equals(this.isCurrent, userHourlyRate.isCurrent) &&
        Objects.equals(this.hourlyRate, userHourlyRate.hourlyRate) &&
        Objects.equals(this.hourlyOvertimeRate, userHourlyRate.hourlyOvertimeRate) &&
        Objects.equals(this.startDateTime, userHourlyRate.startDateTime) &&
        Objects.equals(this.endDateTime, userHourlyRate.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateId, userId, organisationId, isCurrent, hourlyRate, hourlyOvertimeRate, startDateTime, endDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiUserHourlyRate {\n");
    
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    isCurrent: ").append(toIndentedString(isCurrent)).append("\n");
    sb.append("    hourlyRate: ").append(toIndentedString(hourlyRate)).append("\n");
    sb.append("    hourlyOvertimeRate: ").append(toIndentedString(hourlyOvertimeRate)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

