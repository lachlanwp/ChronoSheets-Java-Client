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
 * Fields for inserting a new Project
 */
@ApiModel(description = "Fields for inserting a new Project")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-21T22:54:32.605+11:00")
public class CSInsertProjectRequest {
  @SerializedName("ClientId")
  private Integer clientId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("CostEstimation")
  private Double costEstimation = null;

  @SerializedName("StartDate")
  private OffsetDateTime startDate = null;

  @SerializedName("EndDate")
  private OffsetDateTime endDate = null;

  public CSInsertProjectRequest clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The Id of the Client that is associated with the new project
   * @return clientId
  **/
  @ApiModelProperty(value = "The Id of the Client that is associated with the new project")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CSInsertProjectRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * The name of the new Project
   * @return projectName
  **/
  @ApiModelProperty(value = "The name of the new Project")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CSInsertProjectRequest costEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
    return this;
  }

   /**
   * The estimated cost of work to complete the project.  This value is used in the Organisation Reports view &#39;Project Costs&#39;
   * @return costEstimation
  **/
  @ApiModelProperty(value = "The estimated cost of work to complete the project.  This value is used in the Organisation Reports view 'Project Costs'")
  public Double getCostEstimation() {
    return costEstimation;
  }

  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }

  public CSInsertProjectRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the project.  When the project is due to start
   * @return startDate
  **/
  @ApiModelProperty(value = "The start date of the project.  When the project is due to start")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CSInsertProjectRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the project.  When the project is due to end
   * @return endDate
  **/
  @ApiModelProperty(value = "The end date of the project.  When the project is due to end")
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
    CSInsertProjectRequest insertProjectRequest = (CSInsertProjectRequest) o;
    return Objects.equals(this.clientId, insertProjectRequest.clientId) &&
        Objects.equals(this.projectName, insertProjectRequest.projectName) &&
        Objects.equals(this.costEstimation, insertProjectRequest.costEstimation) &&
        Objects.equals(this.startDate, insertProjectRequest.startDate) &&
        Objects.equals(this.endDate, insertProjectRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, projectName, costEstimation, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertProjectRequest {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

