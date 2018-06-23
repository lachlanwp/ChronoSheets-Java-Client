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
 * CsApiUpdateTaskRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:39:02.512+10:00")
public class CsApiUpdateTaskRequest {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  @SerializedName("TripEnabled")
  private Boolean tripEnabled = null;

  public CsApiUpdateTaskRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CsApiUpdateTaskRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public CsApiUpdateTaskRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CsApiUpdateTaskRequest tripEnabled(Boolean tripEnabled) {
    this.tripEnabled = tripEnabled;
    return this;
  }

   /**
   * Get tripEnabled
   * @return tripEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isTripEnabled() {
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
    CsApiUpdateTaskRequest updateTaskRequest = (CsApiUpdateTaskRequest) o;
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
    sb.append("class CsApiUpdateTaskRequest {\n");
    
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

