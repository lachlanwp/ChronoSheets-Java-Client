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
 * CsApiTimesheet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:42:53.227+10:00")
public class CsApiTimesheet {
  @SerializedName("TimesheetId")
  private Integer timesheetId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("JobId")
  private Integer jobId = null;

  @SerializedName("TaskId")
  private Integer taskId = null;

  @SerializedName("StartDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("EndDateTime")
  private OffsetDateTime endDateTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("TripId")
  private Integer tripId = null;

  @SerializedName("FileAttachmentCount")
  private Integer fileAttachmentCount = null;

  @SerializedName("PayAmount")
  private Double payAmount = null;

  @SerializedName("OvertimePayAmount")
  private Double overtimePayAmount = null;

  @SerializedName("IncludesOvertime")
  private Boolean includesOvertime = null;

  public CsApiTimesheet timesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
    return this;
  }

   /**
   * Get timesheetId
   * @return timesheetId
  **/
  @ApiModelProperty(value = "")
  public Integer getTimesheetId() {
    return timesheetId;
  }

  public void setTimesheetId(Integer timesheetId) {
    this.timesheetId = timesheetId;
  }

  public CsApiTimesheet userId(Integer userId) {
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

  public CsApiTimesheet jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")
  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public CsApiTimesheet taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public CsApiTimesheet startDateTime(OffsetDateTime startDateTime) {
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

  public CsApiTimesheet endDateTime(OffsetDateTime endDateTime) {
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

  public CsApiTimesheet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CsApiTimesheet tripId(Integer tripId) {
    this.tripId = tripId;
    return this;
  }

   /**
   * Get tripId
   * @return tripId
  **/
  @ApiModelProperty(value = "")
  public Integer getTripId() {
    return tripId;
  }

  public void setTripId(Integer tripId) {
    this.tripId = tripId;
  }

  public CsApiTimesheet fileAttachmentCount(Integer fileAttachmentCount) {
    this.fileAttachmentCount = fileAttachmentCount;
    return this;
  }

   /**
   * Get fileAttachmentCount
   * @return fileAttachmentCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFileAttachmentCount() {
    return fileAttachmentCount;
  }

  public void setFileAttachmentCount(Integer fileAttachmentCount) {
    this.fileAttachmentCount = fileAttachmentCount;
  }

  public CsApiTimesheet payAmount(Double payAmount) {
    this.payAmount = payAmount;
    return this;
  }

   /**
   * Get payAmount
   * @return payAmount
  **/
  @ApiModelProperty(value = "")
  public Double getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }

  public CsApiTimesheet overtimePayAmount(Double overtimePayAmount) {
    this.overtimePayAmount = overtimePayAmount;
    return this;
  }

   /**
   * Get overtimePayAmount
   * @return overtimePayAmount
  **/
  @ApiModelProperty(value = "")
  public Double getOvertimePayAmount() {
    return overtimePayAmount;
  }

  public void setOvertimePayAmount(Double overtimePayAmount) {
    this.overtimePayAmount = overtimePayAmount;
  }

  public CsApiTimesheet includesOvertime(Boolean includesOvertime) {
    this.includesOvertime = includesOvertime;
    return this;
  }

   /**
   * Get includesOvertime
   * @return includesOvertime
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludesOvertime() {
    return includesOvertime;
  }

  public void setIncludesOvertime(Boolean includesOvertime) {
    this.includesOvertime = includesOvertime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiTimesheet timesheet = (CsApiTimesheet) o;
    return Objects.equals(this.timesheetId, timesheet.timesheetId) &&
        Objects.equals(this.userId, timesheet.userId) &&
        Objects.equals(this.jobId, timesheet.jobId) &&
        Objects.equals(this.taskId, timesheet.taskId) &&
        Objects.equals(this.startDateTime, timesheet.startDateTime) &&
        Objects.equals(this.endDateTime, timesheet.endDateTime) &&
        Objects.equals(this.description, timesheet.description) &&
        Objects.equals(this.tripId, timesheet.tripId) &&
        Objects.equals(this.fileAttachmentCount, timesheet.fileAttachmentCount) &&
        Objects.equals(this.payAmount, timesheet.payAmount) &&
        Objects.equals(this.overtimePayAmount, timesheet.overtimePayAmount) &&
        Objects.equals(this.includesOvertime, timesheet.includesOvertime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheetId, userId, jobId, taskId, startDateTime, endDateTime, description, tripId, fileAttachmentCount, payAmount, overtimePayAmount, includesOvertime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiTimesheet {\n");
    
    sb.append("    timesheetId: ").append(toIndentedString(timesheetId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tripId: ").append(toIndentedString(tripId)).append("\n");
    sb.append("    fileAttachmentCount: ").append(toIndentedString(fileAttachmentCount)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    overtimePayAmount: ").append(toIndentedString(overtimePayAmount)).append("\n");
    sb.append("    includesOvertime: ").append(toIndentedString(includesOvertime)).append("\n");
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
