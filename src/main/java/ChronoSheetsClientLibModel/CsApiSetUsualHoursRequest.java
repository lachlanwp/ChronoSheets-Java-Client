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
import ChronoSheetsClientLibModel.CsApiUsualHoursDay;
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
 * CsApiSetUsualHoursRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T18:05:00.896+10:00")
public class CsApiSetUsualHoursRequest {
  @SerializedName("UsualHoursData")
  private List<CsApiUsualHoursDay> usualHoursData = null;

  @SerializedName("UserId")
  private Integer userId = null;

  public CsApiSetUsualHoursRequest usualHoursData(List<CsApiUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
    return this;
  }

  public CsApiSetUsualHoursRequest addUsualHoursDataItem(CsApiUsualHoursDay usualHoursDataItem) {
    if (this.usualHoursData == null) {
      this.usualHoursData = new ArrayList<CsApiUsualHoursDay>();
    }
    this.usualHoursData.add(usualHoursDataItem);
    return this;
  }

   /**
   * Get usualHoursData
   * @return usualHoursData
  **/
  @ApiModelProperty(value = "")
  public List<CsApiUsualHoursDay> getUsualHoursData() {
    return usualHoursData;
  }

  public void setUsualHoursData(List<CsApiUsualHoursDay> usualHoursData) {
    this.usualHoursData = usualHoursData;
  }

  public CsApiSetUsualHoursRequest userId(Integer userId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiSetUsualHoursRequest setUsualHoursRequest = (CsApiSetUsualHoursRequest) o;
    return Objects.equals(this.usualHoursData, setUsualHoursRequest.usualHoursData) &&
        Objects.equals(this.userId, setUsualHoursRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualHoursData, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiSetUsualHoursRequest {\n");
    
    sb.append("    usualHoursData: ").append(toIndentedString(usualHoursData)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

