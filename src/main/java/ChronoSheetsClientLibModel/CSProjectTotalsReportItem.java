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

/**
 * CSProjectTotalsReportItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-05T22:42:00.485+10:00")
public class CSProjectTotalsReportItem {
  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("ProjectId")
  private Integer projectId = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SpanSeconds")
  private Integer spanSeconds = null;

  public CSProjectTotalsReportItem organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CSProjectTotalsReportItem userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CSProjectTotalsReportItem projectId(Integer projectId) {
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

  public CSProjectTotalsReportItem projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CSProjectTotalsReportItem spanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
    return this;
  }

   /**
   * Get spanSeconds
   * @return spanSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getSpanSeconds() {
    return spanSeconds;
  }

  public void setSpanSeconds(Integer spanSeconds) {
    this.spanSeconds = spanSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSProjectTotalsReportItem projectTotalsReportItem = (CSProjectTotalsReportItem) o;
    return Objects.equals(this.organisationId, projectTotalsReportItem.organisationId) &&
        Objects.equals(this.userId, projectTotalsReportItem.userId) &&
        Objects.equals(this.projectId, projectTotalsReportItem.projectId) &&
        Objects.equals(this.projectName, projectTotalsReportItem.projectName) &&
        Objects.equals(this.spanSeconds, projectTotalsReportItem.spanSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, userId, projectId, projectName, spanSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSProjectTotalsReportItem {\n");
    
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    spanSeconds: ").append(toIndentedString(spanSeconds)).append("\n");
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
