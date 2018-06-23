/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import ChronoSheetsClientLibModel.CsApiTimesheet;
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
 * CsApiBatchUpdateTimesheetRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T12:42:53.227+10:00")
public class CsApiBatchUpdateTimesheetRequest {
  @SerializedName("Timesheets")
  private List<CsApiTimesheet> timesheets = null;

  public CsApiBatchUpdateTimesheetRequest timesheets(List<CsApiTimesheet> timesheets) {
    this.timesheets = timesheets;
    return this;
  }

  public CsApiBatchUpdateTimesheetRequest addTimesheetsItem(CsApiTimesheet timesheetsItem) {
    if (this.timesheets == null) {
      this.timesheets = new ArrayList<CsApiTimesheet>();
    }
    this.timesheets.add(timesheetsItem);
    return this;
  }

   /**
   * Get timesheets
   * @return timesheets
  **/
  @ApiModelProperty(value = "")
  public List<CsApiTimesheet> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(List<CsApiTimesheet> timesheets) {
    this.timesheets = timesheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiBatchUpdateTimesheetRequest batchUpdateTimesheetRequest = (CsApiBatchUpdateTimesheetRequest) o;
    return Objects.equals(this.timesheets, batchUpdateTimesheetRequest.timesheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiBatchUpdateTimesheetRequest {\n");
    
    sb.append("    timesheets: ").append(toIndentedString(timesheets)).append("\n");
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
