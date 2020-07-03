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
 * Fields used to update a Task
 */
@ApiModel(description = "Fields used to update a Task")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T21:12:18.282+10:00[Australia/Sydney]")
public class UpdateTaskRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TASK_NAME = "TaskName";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_IS_DELETED = "IsDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_TRIP_ENABLED = "TripEnabled";
  @SerializedName(SERIALIZED_NAME_TRIP_ENABLED)
  private Boolean tripEnabled;


  public UpdateTaskRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Id of the Task that is to be updated
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Id of the Task that is to be updated")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public UpdateTaskRequest taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * The updated Task Name
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated Task Name")

  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public UpdateTaskRequest isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Whether or not this Task should be marked as deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this Task should be marked as deleted")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public UpdateTaskRequest tripEnabled(Boolean tripEnabled) {
    
    this.tripEnabled = tripEnabled;
    return this;
  }

   /**
   * Whether or not this Task should have GPS Trip Recording enabled
   * @return tripEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this Task should have GPS Trip Recording enabled")

  public Boolean getTripEnabled() {
    return tripEnabled;
  }


  public void setTripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskRequest updateTaskRequest = (UpdateTaskRequest) o;
    return Objects.equals(this.id, updateTaskRequest.id) &&
        Objects.equals(this.taskName, updateTaskRequest.taskName) &&
        Objects.equals(this.isDeleted, updateTaskRequest.isDeleted) &&
        Objects.equals(this.tripEnabled, updateTaskRequest.tripEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, isDeleted, tripEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTaskRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    tripEnabled: ").append(toIndentedString(tripEnabled)).append("\n");
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

