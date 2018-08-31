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
import java.util.ArrayList;
import java.util.List;

/**
 * Fields for inserting a new Job Code
 */
@ApiModel(description = "Fields for inserting a new Job Code")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-31T20:36:12.993+10:00")
public class CSInsertJobCodeRequest {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("ProjectId")
  private Integer projectId = null;

  @SerializedName("ClientId")
  private Integer clientId = null;

  @SerializedName("LinkedTaskIds")
  private List<Integer> linkedTaskIds = null;

  @SerializedName("LinkedOrgGroupIds")
  private List<Integer> linkedOrgGroupIds = null;

  public CSInsertJobCodeRequest code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A short code for the Job.  This is referred to as a Job Code
   * @return code
  **/
  @ApiModelProperty(value = "A short code for the Job.  This is referred to as a Job Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CSInsertJobCodeRequest projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The linked Project.  Time spent with this JobCode is on this Project
   * @return projectId
  **/
  @ApiModelProperty(value = "The linked Project.  Time spent with this JobCode is on this Project")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public CSInsertJobCodeRequest clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The linked Client.  Time spent with this JobCode is for this Client
   * @return clientId
  **/
  @ApiModelProperty(value = "The linked Client.  Time spent with this JobCode is for this Client")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CSInsertJobCodeRequest linkedTaskIds(List<Integer> linkedTaskIds) {
    this.linkedTaskIds = linkedTaskIds;
    return this;
  }

  public CSInsertJobCodeRequest addLinkedTaskIdsItem(Integer linkedTaskIdsItem) {
    if (this.linkedTaskIds == null) {
      this.linkedTaskIds = new ArrayList<Integer>();
    }
    this.linkedTaskIds.add(linkedTaskIdsItem);
    return this;
  }

   /**
   * A list of Task Ids.  This are the Tasks that become available to the employee when they select this JobCode
   * @return linkedTaskIds
  **/
  @ApiModelProperty(value = "A list of Task Ids.  This are the Tasks that become available to the employee when they select this JobCode")
  public List<Integer> getLinkedTaskIds() {
    return linkedTaskIds;
  }

  public void setLinkedTaskIds(List<Integer> linkedTaskIds) {
    this.linkedTaskIds = linkedTaskIds;
  }

  public CSInsertJobCodeRequest linkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
    return this;
  }

  public CSInsertJobCodeRequest addLinkedOrgGroupIdsItem(Integer linkedOrgGroupIdsItem) {
    if (this.linkedOrgGroupIds == null) {
      this.linkedOrgGroupIds = new ArrayList<Integer>();
    }
    this.linkedOrgGroupIds.add(linkedOrgGroupIdsItem);
    return this;
  }

   /**
   * Optionally restrict access to the JobCode by specifying which Organisation Groups can use it
   * @return linkedOrgGroupIds
  **/
  @ApiModelProperty(value = "Optionally restrict access to the JobCode by specifying which Organisation Groups can use it")
  public List<Integer> getLinkedOrgGroupIds() {
    return linkedOrgGroupIds;
  }

  public void setLinkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertJobCodeRequest insertJobCodeRequest = (CSInsertJobCodeRequest) o;
    return Objects.equals(this.code, insertJobCodeRequest.code) &&
        Objects.equals(this.projectId, insertJobCodeRequest.projectId) &&
        Objects.equals(this.clientId, insertJobCodeRequest.clientId) &&
        Objects.equals(this.linkedTaskIds, insertJobCodeRequest.linkedTaskIds) &&
        Objects.equals(this.linkedOrgGroupIds, insertJobCodeRequest.linkedOrgGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, projectId, clientId, linkedTaskIds, linkedOrgGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertJobCodeRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    linkedTaskIds: ").append(toIndentedString(linkedTaskIds)).append("\n");
    sb.append("    linkedOrgGroupIds: ").append(toIndentedString(linkedOrgGroupIds)).append("\n");
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

