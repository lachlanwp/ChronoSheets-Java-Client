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
import ChronoSheetsClientLibModel.OrgReportTimesheetFileAttachment;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T22:43:31.260+11:00[Australia/Sydney]")
public class ApiResponseForPaginatedListOrgReportTimesheetFileAttachment {
  public static final String SERIALIZED_NAME_TOTAL_SET_COUNT = "TotalSetCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_SET_COUNT)
  private Integer totalSetCount;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<OrgReportTimesheetFileAttachment> data = null;

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

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public ApiResponseForPaginatedListOrgReportTimesheetFileAttachment totalSetCount(Integer totalSetCount) {
    
    this.totalSetCount = totalSetCount;
    return this;
  }

   /**
   * The count of total records that are being paginated
   * @return totalSetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of total records that are being paginated")

  public Integer getTotalSetCount() {
    return totalSetCount;
  }


  public void setTotalSetCount(Integer totalSetCount) {
    this.totalSetCount = totalSetCount;
  }


  public ApiResponseForPaginatedListOrgReportTimesheetFileAttachment data(List<OrgReportTimesheetFileAttachment> data) {
    
    this.data = data;
    return this;
  }

  public ApiResponseForPaginatedListOrgReportTimesheetFileAttachment addDataItem(OrgReportTimesheetFileAttachment dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<OrgReportTimesheetFileAttachment>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The main Data of the response
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The main Data of the response")

  public List<OrgReportTimesheetFileAttachment> getData() {
    return data;
  }


  public void setData(List<OrgReportTimesheetFileAttachment> data) {
    this.data = data;
  }


  public ApiResponseForPaginatedListOrgReportTimesheetFileAttachment status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The API response status. Indicates if the request was successful, failed or was unauthorised.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API response status. Indicates if the request was successful, failed or was unauthorised.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ApiResponseForPaginatedListOrgReportTimesheetFileAttachment message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A message to accompany the response status.  If the Status is failed, this message will hint why it failed and what you need to do.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseForPaginatedListOrgReportTimesheetFileAttachment apiResponseForPaginatedListOrgReportTimesheetFileAttachment = (ApiResponseForPaginatedListOrgReportTimesheetFileAttachment) o;
    return Objects.equals(this.totalSetCount, apiResponseForPaginatedListOrgReportTimesheetFileAttachment.totalSetCount) &&
        Objects.equals(this.data, apiResponseForPaginatedListOrgReportTimesheetFileAttachment.data) &&
        Objects.equals(this.status, apiResponseForPaginatedListOrgReportTimesheetFileAttachment.status) &&
        Objects.equals(this.message, apiResponseForPaginatedListOrgReportTimesheetFileAttachment.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSetCount, data, status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseForPaginatedListOrgReportTimesheetFileAttachment {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

