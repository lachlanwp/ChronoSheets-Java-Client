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
import java.util.ArrayList;
import java.util.List;

/**
 * Fields for inserting a new Organisation Group
 */
@ApiModel(description = "Fields for inserting a new Organisation Group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T22:27:55.870+10:00[Australia/Sydney]")
public class InsertOrganisationGroupRequest {
  public static final String SERIALIZED_NAME_ORGANISATION_GROUP_NAME = "OrganisationGroupName";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_GROUP_NAME)
  private String organisationGroupName;

  public static final String SERIALIZED_NAME_ORGANISATION_GROUP_USER_IDS = "OrganisationGroupUserIds";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_GROUP_USER_IDS)
  private List<Integer> organisationGroupUserIds = null;


  public InsertOrganisationGroupRequest organisationGroupName(String organisationGroupName) {
    
    this.organisationGroupName = organisationGroupName;
    return this;
  }

   /**
   * The name of the new Organisation Group.  This is used when you&#39;re looking up Organisation Groups elsewhere through ChronoSheets
   * @return organisationGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the new Organisation Group.  This is used when you're looking up Organisation Groups elsewhere through ChronoSheets")

  public String getOrganisationGroupName() {
    return organisationGroupName;
  }


  public void setOrganisationGroupName(String organisationGroupName) {
    this.organisationGroupName = organisationGroupName;
  }


  public InsertOrganisationGroupRequest organisationGroupUserIds(List<Integer> organisationGroupUserIds) {
    
    this.organisationGroupUserIds = organisationGroupUserIds;
    return this;
  }

  public InsertOrganisationGroupRequest addOrganisationGroupUserIdsItem(Integer organisationGroupUserIdsItem) {
    if (this.organisationGroupUserIds == null) {
      this.organisationGroupUserIds = new ArrayList<Integer>();
    }
    this.organisationGroupUserIds.add(organisationGroupUserIdsItem);
    return this;
  }

   /**
   * The Ids of the Users that are going to be in this Organisation Group
   * @return organisationGroupUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Ids of the Users that are going to be in this Organisation Group")

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
    InsertOrganisationGroupRequest insertOrganisationGroupRequest = (InsertOrganisationGroupRequest) o;
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
    sb.append("class InsertOrganisationGroupRequest {\n");
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

