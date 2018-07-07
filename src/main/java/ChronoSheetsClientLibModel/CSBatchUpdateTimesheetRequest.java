/*
 * The ChronoSheets API
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
import ChronoSheetsClientLibModel.CSTimesheet;
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
 * Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created
 */
@ApiModel(description = "Contains a collection of Timesheet objects that are to be either created or updated.  If the ID of the timesheet is specified in the Timesheet object, then that Timesheet will be updated otherwise it will be created")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-07T19:20:40.221+10:00")
public class CSBatchUpdateTimesheetRequest {
  @SerializedName("Timesheets")
  private List<CSTimesheet> timesheets = null;

  public CSBatchUpdateTimesheetRequest timesheets(List<CSTimesheet> timesheets) {
    this.timesheets = timesheets;
    return this;
  }

  public CSBatchUpdateTimesheetRequest addTimesheetsItem(CSTimesheet timesheetsItem) {
    if (this.timesheets == null) {
      this.timesheets = new ArrayList<CSTimesheet>();
    }
    this.timesheets.add(timesheetsItem);
    return this;
  }

   /**
   * A collection of Timesheet objects to be either created or updated
   * @return timesheets
  **/
  @ApiModelProperty(value = "A collection of Timesheet objects to be either created or updated")
  public List<CSTimesheet> getTimesheets() {
    return timesheets;
  }

  public void setTimesheets(List<CSTimesheet> timesheets) {
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
    CSBatchUpdateTimesheetRequest batchUpdateTimesheetRequest = (CSBatchUpdateTimesheetRequest) o;
    return Objects.equals(this.timesheets, batchUpdateTimesheetRequest.timesheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timesheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSBatchUpdateTimesheetRequest {\n");
    
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

