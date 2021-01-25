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
 * A project in ChronoSheets
 */
@ApiModel(description = "A project in ChronoSheets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T22:43:31.260+11:00[Australia/Sydney]")
public class Project {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CLIENT_ID = "ClientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "OrganisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private Integer organisationId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_COST_ESTIMATION = "CostEstimation";
  @SerializedName(SERIALIZED_NAME_COST_ESTIMATION)
  private Double costEstimation;

  public static final String SERIALIZED_NAME_COST_ACTUAL = "CostActual";
  @SerializedName(SERIALIZED_NAME_COST_ACTUAL)
  private Double costActual;

  public static final String SERIALIZED_NAME_START_DATE = "StartDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "EndDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;


  public Project id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the project
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Project clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client for which the project is being undertaken for
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the client for which the project is being undertaken for")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public Project organisationId(Integer organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * The ID of the organisation that is completing the project
   * @return organisationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the organisation that is completing the project")

  public Integer getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }


  public Project projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * A descriptive name of the project
   * @return projectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A descriptive name of the project")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public Project costEstimation(Double costEstimation) {
    
    this.costEstimation = costEstimation;
    return this;
  }

   /**
   * The project&#39;s estimated cost
   * @return costEstimation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The project's estimated cost")

  public Double getCostEstimation() {
    return costEstimation;
  }


  public void setCostEstimation(Double costEstimation) {
    this.costEstimation = costEstimation;
  }


  public Project costActual(Double costActual) {
    
    this.costActual = costActual;
    return this;
  }

   /**
   * The project&#39;s actual cost
   * @return costActual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The project's actual cost")

  public Double getCostActual() {
    return costActual;
  }


  public void setCostActual(Double costActual) {
    this.costActual = costActual;
  }


  public Project startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date and time of the project
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date and time of the project")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Project endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date and time of the project
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date and time of the project")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.clientId, project.clientId) &&
        Objects.equals(this.organisationId, project.organisationId) &&
        Objects.equals(this.projectName, project.projectName) &&
        Objects.equals(this.costEstimation, project.costEstimation) &&
        Objects.equals(this.costActual, project.costActual) &&
        Objects.equals(this.startDate, project.startDate) &&
        Objects.equals(this.endDate, project.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, organisationId, projectName, costEstimation, costActual, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    costEstimation: ").append(toIndentedString(costEstimation)).append("\n");
    sb.append("    costActual: ").append(toIndentedString(costActual)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
