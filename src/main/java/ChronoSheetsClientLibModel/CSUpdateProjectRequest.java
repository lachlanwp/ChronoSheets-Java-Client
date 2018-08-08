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
 * Fields for updating a project
 */
@ApiModel(description = "Fields for updating a project")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-08T20:20:15.013+10:00")
public class CSUpdateProjectRequest {
  @SerializedName("ProjectId")
  private Integer projectId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("CostEstimation")
  private Double costEstimation = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  public CSUpdateProjectRequest projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The Id of the Project that is to be updated
   * @return projectId
  **/
  @ApiModelProperty(value = "The Id of the Project that is to be updated")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public CSUpdateProjectRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * The new name of the Project
   * @return projectName
  **/
  @ApiModelProperty(value = "The new name of the Project")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CSUpdateProjectRequest costEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
    return this;
  }

   /**
   * The updated estimated cost of the Project
   * @return costEstimation
  **/
  @ApiModelProperty(value = "The updated estimated cost of the Project")
  public Double getCostEstimation() {
    return costEstimation;
  }

  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  public CSUpdateProjectRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The updated project start date
   * @return startDate
  **/
  @ApiModelProperty(value = "The updated project start date")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CSUpdateProjectRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The update project end date
   * @return endDate
  **/
  @ApiModelProperty(value = "The update project end date")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSUpdateProjectRequest updateProjectRequest = (CSUpdateProjectRequest) o;
    return Objects.equals(this.projectId, updateProjectRequest.projectId) &&
        Objects.equals(this.projectName, updateProjectRequest.projectName) &&
        Objects.equals(this.costEstimation, updateProjectRequest.costEstimation) &&
        Objects.equals(this.startDate, updateProjectRequest.startDate) &&
        Objects.equals(this.endDate, updateProjectRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, costEstimation, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSUpdateProjectRequest {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    costEstimation: ").append(toIndentedString(costEstimation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

