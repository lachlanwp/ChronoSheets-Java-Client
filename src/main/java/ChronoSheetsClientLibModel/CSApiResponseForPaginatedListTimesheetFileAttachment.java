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
import ChronoSheetsClientLibModel.CSTimesheetFileAttachment;
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
 * A paginated API repsonse
 */
@ApiModel(description = "A paginated API repsonse")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-18T19:40:56.212+10:00")
public class CSApiResponseForPaginatedListTimesheetFileAttachment {
  @SerializedName("TotalSetCount")
  private Integer totalSetCount = null;

  @SerializedName("Data")
  private List<CSTimesheetFileAttachment> data = null;

  /**
   * The API response status. Indicates if the request was successful, failed or was unauthorised.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("Succeeded"),
    
    FATALEXCEPTION("FatalException"),
    
    GENERALERROR("GeneralError"),
    
    VALIDATIONERROR("ValidationError"),
    
    UNAUTHORIZED("UnAuthorized"),
    
    SESSIONEXPIRED("SessionExpired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("Message")
  private String message = null;

  public CSApiResponseForPaginatedListTimesheetFileAttachment totalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
    return this;
  }

   /**
   * The count of total records that are being paginated
   * @return totalSetCount
  **/
  @ApiModelProperty(value = "The count of total records that are being paginated")
  public Integer getTotalSetCount() {
    return totalSetCount;
  }

  public void setTotalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
  }

  public CSApiResponseForPaginatedListTimesheetFileAttachment data(List<CSTimesheetFileAttachment> data) {
    this.data = data;
    return this;
  }

  public CSApiResponseForPaginatedListTimesheetFileAttachment addDataItem(CSTimesheetFileAttachment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CSTimesheetFileAttachment>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The main Data of the response
   * @return data
  **/
  @ApiModelProperty(value = "The main Data of the response")
  public List<CSTimesheetFileAttachment> getData() {
    return data;
  }

  public void setData(List<CSTimesheetFileAttachment> data) {
    this.data = data;
  }

  public CSApiResponseForPaginatedListTimesheetFileAttachment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The API response status. Indicates if the request was successful, failed or was unauthorised.
   * @return status
  **/
  @ApiModelProperty(value = "The API response status. Indicates if the request was successful, failed or was unauthorised.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CSApiResponseForPaginatedListTimesheetFileAttachment message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.
   * @return message
  **/
  @ApiModelProperty(value = "A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSApiResponseForPaginatedListTimesheetFileAttachment apiResponseForPaginatedListTimesheetFileAttachment = (CSApiResponseForPaginatedListTimesheetFileAttachment) o;
    return Objects.equals(this.totalSetCount, apiResponseForPaginatedListTimesheetFileAttachment.totalSetCount) &&
        Objects.equals(this.data, apiResponseForPaginatedListTimesheetFileAttachment.data) &&
        Objects.equals(this.status, apiResponseForPaginatedListTimesheetFileAttachment.status) &&
        Objects.equals(this.message, apiResponseForPaginatedListTimesheetFileAttachment.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSetCount, data, status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSApiResponseForPaginatedListTimesheetFileAttachment {\n");
    
    sb.append("    totalSetCount: ").append(toIndentedString(totalSetCount)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

