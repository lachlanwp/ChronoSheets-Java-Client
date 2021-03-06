/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
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
import java.util.Arrays;
import ChronoSheetsClientLibModel.CSAggregateJobTask;
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
 * CSAggregateJobCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-01T00:13:30.131+10:00")
public class CSAggregateJobCode {
  @SerializedName("AvailableTasks")
  private List<CSAggregateJobTask> availableTasks = null;

  @SerializedName("PermittedEmployees")
  private List<Integer> permittedEmployees = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Client")
  private String client = null;

  @SerializedName("ClientId")
  private Integer clientId = null;

  @SerializedName("Project")
  private String project = null;

  @SerializedName("ProjectId")
  private Integer projectId = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public CSAggregateJobCode availableTasks(List<CSAggregateJobTask> availableTasks) {
    this.availableTasks = availableTasks;
    return this;
  }

  public CSAggregateJobCode addAvailableTasksItem(CSAggregateJobTask availableTasksItem) {
    if (this.availableTasks == null) {
      this.availableTasks = new ArrayList<CSAggregateJobTask>();
    }
    this.availableTasks.add(availableTasksItem);
    return this;
  }

   /**
   * The list of available tasks under this job code
   * @return availableTasks
  **/
  @ApiModelProperty(value = "The list of available tasks under this job code")
  public List<CSAggregateJobTask> getAvailableTasks() {
    return availableTasks;
  }

  public void setAvailableTasks(List<CSAggregateJobTask> availableTasks) {
    this.availableTasks = availableTasks;
  }

  public CSAggregateJobCode permittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
    return this;
  }

  public CSAggregateJobCode addPermittedEmployeesItem(Integer permittedEmployeesItem) {
    if (this.permittedEmployees == null) {
      this.permittedEmployees = new ArrayList<Integer>();
    }
    this.permittedEmployees.add(permittedEmployeesItem);
    return this;
  }

   /**
   * The list of employee IDs that are permitted to record timesheets with this job code (empty means everyone)
   * @return permittedEmployees
  **/
  @ApiModelProperty(value = "The list of employee IDs that are permitted to record timesheets with this job code (empty means everyone)")
  public List<Integer> getPermittedEmployees() {
    return permittedEmployees;
  }

  public void setPermittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
  }

  public CSAggregateJobCode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the job code (not the code itself)
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the job code (not the code itself)")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CSAggregateJobCode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The job code itself
   * @return code
  **/
  @ApiModelProperty(value = "The job code itself")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CSAggregateJobCode client(String client) {
    this.client = client;
    return this;
  }

   /**
   * The name of the client
   * @return client
  **/
  @ApiModelProperty(value = "The name of the client")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public CSAggregateJobCode clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client
   * @return clientId
  **/
  @ApiModelProperty(value = "The ID of the client")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CSAggregateJobCode project(String project) {
    this.project = project;
    return this;
  }

   /**
   * The name of the project
   * @return project
  **/
  @ApiModelProperty(value = "The name of the project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CSAggregateJobCode projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project
   * @return projectId
  **/
  @ApiModelProperty(value = "The ID of the project")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public CSAggregateJobCode organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Your organisation ID
   * @return organisationId
  **/
  @ApiModelProperty(value = "Your organisation ID")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CSAggregateJobCode isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A flag indicating whether or not the job code has been marked as deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "A flag indicating whether or not the job code has been marked as deleted")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSAggregateJobCode aggregateJobCode = (CSAggregateJobCode) o;
    return Objects.equals(this.availableTasks, aggregateJobCode.availableTasks) &&
        Objects.equals(this.permittedEmployees, aggregateJobCode.permittedEmployees) &&
        Objects.equals(this.id, aggregateJobCode.id) &&
        Objects.equals(this.code, aggregateJobCode.code) &&
        Objects.equals(this.client, aggregateJobCode.client) &&
        Objects.equals(this.clientId, aggregateJobCode.clientId) &&
        Objects.equals(this.project, aggregateJobCode.project) &&
        Objects.equals(this.projectId, aggregateJobCode.projectId) &&
        Objects.equals(this.organisationId, aggregateJobCode.organisationId) &&
        Objects.equals(this.isDeleted, aggregateJobCode.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableTasks, permittedEmployees, id, code, client, clientId, project, projectId, organisationId, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSAggregateJobCode {\n");
    
    sb.append("    availableTasks: ").append(toIndentedString(availableTasks)).append("\n");
    sb.append("    permittedEmployees: ").append(toIndentedString(permittedEmployees)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

