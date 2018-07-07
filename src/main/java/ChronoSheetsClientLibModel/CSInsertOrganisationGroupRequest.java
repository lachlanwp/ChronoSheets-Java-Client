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
 * CSInsertOrganisationGroupRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T14:17:00.368+10:00")
public class CSInsertOrganisationGroupRequest {
  @SerializedName("OrganisationGroupName")
  private String organisationGroupName = null;

  @SerializedName("OrganisationGroupUserIds")
  private List<Integer> organisationGroupUserIds = null;

  public CSInsertOrganisationGroupRequest organisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
    return this;
  }

   /**
   * Get organisationGroupName
   * @return organisationGroupName
  **/
  @ApiModelProperty(value = "")
  public String getOrganisationGroupName() {
    return organisationGroupName;
  }

  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }

  public CSInsertOrganisationGroupRequest organisationGroupUserIds(List<Integer> organisationGroupUserIds) {
    this.organisationGroupUserIds = organisationGroupUserIds;
    return this;
  }

  public CSInsertOrganisationGroupRequest addOrganisationGroupUserIdsItem(Integer organisationGroupUserIdsItem) {
    if (this.organisationGroupUserIds == null) {
      this.organisationGroupUserIds = new ArrayList<Integer>();
    }
    this.organisationGroupUserIds.add(organisationGroupUserIdsItem);
    return this;
  }

   /**
   * Get organisationGroupUserIds
   * @return organisationGroupUserIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getOrganisationGroupUserIds() {
    return organisationGroupUserIds;
  }

  public void setOrganisationGroupUserIds(List<Integer> organisationGroupUserIds) {
    this.organisationGroupUserIds = organisationGroupUserIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSInsertOrganisationGroupRequest insertOrganisationGroupRequest = (CSInsertOrganisationGroupRequest) o;
    return Objects.equals(this.organisationGroupName, insertOrganisationGroupRequest.organisationGroupName) &&
        Objects.equals(this.organisationGroupUserIds, insertOrganisationGroupRequest.organisationGroupUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationGroupName, organisationGroupUserIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSInsertOrganisationGroupRequest {\n");
    
    sb.append("    organisationGroupName: ").append(toIndentedString(organisationGroupName)).append("\n");
    sb.append("    organisationGroupUserIds: ").append(toIndentedString(organisationGroupUserIds)).append("\n");
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

