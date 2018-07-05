/*
 * ChronoSheets API
 * ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.
 *
 * OpenAPI spec version: v1
 * Contact: lachlan@chronosheets.com
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
 * CSInsertJobCodeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T21:12:18.606+10:00")
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
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
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
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")
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
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
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
   * Get linkedTaskIds
   * @return linkedTaskIds
  **/
  @ApiModelProperty(value = "")
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
   * Get linkedOrgGroupIds
   * @return linkedOrgGroupIds
  **/
  @ApiModelProperty(value = "")
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

