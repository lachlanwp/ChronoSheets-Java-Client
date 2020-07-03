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
import org.threeten.bp.OffsetDateTime;

/**
 * RawReportItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T21:12:18.282+10:00[Australia/Sydney]")
public class RawReportItem {
  public static final String SERIALIZED_NAME_ORGANISATION_ID = "OrganisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private Integer organisationId;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_JOB_CODE = "JobCode";
  @SerializedName(SERIALIZED_NAME_JOB_CODE)
  private String jobCode;

  public static final String SERIALIZED_NAME_TASK_NAME = "TaskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "ClientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_SPAN_SECONDS = "SpanSeconds";
  @SerializedName(SERIALIZED_NAME_SPAN_SECONDS)
  private Integer spanSeconds;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "PayAmount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Double payAmount;

  public static final String SERIALIZED_NAME_PAY_OVERTIME_AMOUNT = "PayOvertimeAmount";
  @SerializedName(SERIALIZED_NAME_PAY_OVERTIME_AMOUNT)
  private Double payOvertimeAmount;

  public static final String SERIALIZED_NAME_TRIP_COST = "TripCost";
  @SerializedName(SERIALIZED_NAME_TRIP_COST)
  private Double tripCost;

  public static final String SERIALIZED_NAME_TRIP_DISTANCE_METERS = "TripDistanceMeters";
  @SerializedName(SERIALIZED_NAME_TRIP_DISTANCE_METERS)
  private Double tripDistanceMeters;

  public static final String SERIALIZED_NAME_SPAN_SECONDS_NORMAL_TIME = "SpanSecondsNormalTime";
  @SerializedName(SERIALIZED_NAME_SPAN_SECONDS_NORMAL_TIME)
  private Integer spanSecondsNormalTime;

  public static final String SERIALIZED_NAME_SPAN_SECONDS_OVERTIME = "SpanSecondsOvertime";
  @SerializedName(SERIALIZED_NAME_SPAN_SECONDS_OVERTIME)
  private Integer spanSecondsOvertime;


  public RawReportItem organisationId(Integer organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }


  public RawReportItem userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public RawReportItem username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public RawReportItem emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public RawReportItem jobCode(String jobCode) {
    
    this.jobCode = jobCode;
    return this;
  }

   /**
   * Get jobCode
   * @return jobCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobCode() {
    return jobCode;
  }


  public void setJobCode(String jobCode) {
    this.jobCode = jobCode;
  }


  public RawReportItem taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public RawReportItem clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public RawReportItem projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public RawReportItem startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public RawReportItem endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public RawReportItem spanSeconds(Integer spanSeconds) {
    
    this.spanSeconds = spanSeconds;
    return this;
  }

   /**
   * Get spanSeconds
   * @return spanSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpanSeconds() {
    return spanSeconds;
  }


  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }


  public RawReportItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RawReportItem payAmount(Double payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * Get payAmount
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }


  public RawReportItem payOvertimeAmount(Double payOvertimeAmount) {
    
    this.payOvertimeAmount = payOvertimeAmount;
    return this;
  }

   /**
   * Get payOvertimeAmount
   * @return payOvertimeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPayOvertimeAmount() {
    return payOvertimeAmount;
  }


  public void setPayOvertimeAmount(Double payOvertimeAmount) {
    this.payOvertimeAmount = payOvertimeAmount;
  }


  public RawReportItem tripCost(Double tripCost) {
    
    this.tripCost = tripCost;
    return this;
  }

   /**
   * Get tripCost
   * @return tripCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTripCost() {
    return tripCost;
  }


  public void setTripCost(Double tripCost) {
    this.tripCost = tripCost;
  }


  public RawReportItem tripDistanceMeters(Double tripDistanceMeters) {
    
    this.tripDistanceMeters = tripDistanceMeters;
    return this;
  }

   /**
   * Get tripDistanceMeters
   * @return tripDistanceMeters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTripDistanceMeters() {
    return tripDistanceMeters;
  }


  public void setTripDistanceMeters(Double tripDistanceMeters) {
    this.tripDistanceMeters = tripDistanceMeters;
  }


  public RawReportItem spanSecondsNormalTime(Integer spanSecondsNormalTime) {
    
    this.spanSecondsNormalTime = spanSecondsNormalTime;
    return this;
  }

   /**
   * Get spanSecondsNormalTime
   * @return spanSecondsNormalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpanSecondsNormalTime() {
    return spanSecondsNormalTime;
  }


  public void setSpanSecondsNormalTime(Integer spanSecondsNormalTime) {
    this.spanSecondsNormalTime = spanSecondsNormalTime;
  }


  public RawReportItem spanSecondsOvertime(Integer spanSecondsOvertime) {
    
    this.spanSecondsOvertime = spanSecondsOvertime;
    return this;
  }

   /**
   * Get spanSecondsOvertime
   * @return spanSecondsOvertime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSpanSecondsOvertime() {
    return spanSecondsOvertime;
  }


  public void setSpanSecondsOvertime(Integer spanSecondsOvertime) {
    this.spanSecondsOvertime = spanSecondsOvertime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawReportItem rawReportItem = (RawReportItem) o;
    return Objects.equals(this.organisationId, rawReportItem.organisationId) &&
        Objects.equals(this.userId, rawReportItem.userId) &&
        Objects.equals(this.username, rawReportItem.username) &&
        Objects.equals(this.emailAddress, rawReportItem.emailAddress) &&
        Objects.equals(this.jobCode, rawReportItem.jobCode) &&
        Objects.equals(this.taskName, rawReportItem.taskName) &&
        Objects.equals(this.clientName, rawReportItem.clientName) &&
        Objects.equals(this.projectName, rawReportItem.projectName) &&
        Objects.equals(this.startDate, rawReportItem.startDate) &&
        Objects.equals(this.endDate, rawReportItem.endDate) &&
        Objects.equals(this.spanSeconds, rawReportItem.spanSeconds) &&
        Objects.equals(this.description, rawReportItem.description) &&
        Objects.equals(this.payAmount, rawReportItem.payAmount) &&
        Objects.equals(this.payOvertimeAmount, rawReportItem.payOvertimeAmount) &&
        Objects.equals(this.tripCost, rawReportItem.tripCost) &&
        Objects.equals(this.tripDistanceMeters, rawReportItem.tripDistanceMeters) &&
        Objects.equals(this.spanSecondsNormalTime, rawReportItem.spanSecondsNormalTime) &&
        Objects.equals(this.spanSecondsOvertime, rawReportItem.spanSecondsOvertime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, userId, username, emailAddress, jobCode, taskName, clientName, projectName, startDate, endDate, spanSeconds, description, payAmount, payOvertimeAmount, tripCost, tripDistanceMeters, spanSecondsNormalTime, spanSecondsOvertime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawReportItem {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    jobCode: ").append(toIndentedString(jobCode)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    spanSeconds: ").append(toIndentedString(spanSeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    payOvertimeAmount: ").append(toIndentedString(payOvertimeAmount)).append("\n");
    sb.append("    tripCost: ").append(toIndentedString(tripCost)).append("\n");
    sb.append("    tripDistanceMeters: ").append(toIndentedString(tripDistanceMeters)).append("\n");
    sb.append("    spanSecondsNormalTime: ").append(toIndentedString(spanSecondsNormalTime)).append("\n");
    sb.append("    spanSecondsOvertime: ").append(toIndentedString(spanSecondsOvertime)).append("\n");
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

