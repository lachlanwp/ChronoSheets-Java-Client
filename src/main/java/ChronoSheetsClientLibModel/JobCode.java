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
 * JobCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T22:27:55.870+10:00[Australia/Sydney]")
public class JobCode {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CLIENT = "Client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_CLIENT_ID = "ClientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_PROJECT = "Project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  public static final String SERIALIZED_NAME_ORGANISATION_ID = "OrganisationId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_ID)
  private Integer organisationId;

  public static final String SERIALIZED_NAME_IS_DELETED = "IsDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;


  public JobCode id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the job code (not the code itself)
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the job code (not the code itself)")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public JobCode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The job code itself
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job code itself")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public JobCode client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * The name of the client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the client")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public JobCode clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The ID of the client
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the client")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public JobCode project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * The name of the project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


  public JobCode projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project")

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public JobCode organisationId(Integer organisationId) {
    
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Your organisation ID
   * @return organisationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your organisation ID")

  public Integer getOrganisationId() {
    return organisationId;
  }


  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }


  public JobCode isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A flag indicating whether or not the job code has been marked as deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether or not the job code has been marked as deleted")

  public Boolean getIsDeleted() {
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
    JobCode jobCode = (JobCode) o;
    return Objects.equals(this.id, jobCode.id) &&
        Objects.equals(this.code, jobCode.code) &&
        Objects.equals(this.client, jobCode.client) &&
        Objects.equals(this.clientId, jobCode.clientId) &&
        Objects.equals(this.project, jobCode.project) &&
        Objects.equals(this.projectId, jobCode.projectId) &&
        Objects.equals(this.organisationId, jobCode.organisationId) &&
        Objects.equals(this.isDeleted, jobCode.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, client, clientId, project, projectId, organisationId, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCode {\n");
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

