/*
 * ChronoSheets API
 * An API for integrating into ChronoSheets timesheets
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
import org.threeten.bp.OffsetDateTime;

/**
 * CsApiInsertUserHourlyRateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T16:05:15.946+10:00")
public class CsApiInsertUserHourlyRateRequest {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("HourlyRate")
  private Double hourlyRate = null;

  @SerializedName("HourlyOvertimeRate")
  private Double hourlyOvertimeRate = null;

  @SerializedName("CurrentDate")
  private OffsetDateTime currentDate = null;

  public CsApiInsertUserHourlyRateRequest userId(Integer userId) {
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

  public CsApiInsertUserHourlyRateRequest hourlyRate(Double hourlyRate) {
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

  public CsApiInsertUserHourlyRateRequest hourlyOvertimeRate(Double hourlyOvertimeRate) {
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

  public CsApiInsertUserHourlyRateRequest currentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
    return this;
  }

   /**
   * Get currentDate
   * @return currentDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(OffsetDateTime currentDate) {
    this.currentDate = currentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiInsertUserHourlyRateRequest insertUserHourlyRateRequest = (CsApiInsertUserHourlyRateRequest) o;
    return Objects.equals(this.userId, insertUserHourlyRateRequest.userId) &&
        Objects.equals(this.hourlyRate, insertUserHourlyRateRequest.hourlyRate) &&
        Objects.equals(this.hourlyOvertimeRate, insertUserHourlyRateRequest.hourlyOvertimeRate) &&
        Objects.equals(this.currentDate, insertUserHourlyRateRequest.currentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, hourlyRate, hourlyOvertimeRate, currentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiInsertUserHourlyRateRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    hourlyRate: ").append(toIndentedString(hourlyRate)).append("\n");
    sb.append("    hourlyOvertimeRate: ").append(toIndentedString(hourlyOvertimeRate)).append("\n");
    sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
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

