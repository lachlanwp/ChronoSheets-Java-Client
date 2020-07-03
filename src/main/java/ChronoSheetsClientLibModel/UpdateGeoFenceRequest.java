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
import ChronoSheetsClientLibModel.BasicCoordinate;
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
 * A request object for updating a new geofence
 */
@ApiModel(description = "A request object for updating a new geofence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-03T21:12:18.282+10:00[Australia/Sydney]")
public class UpdateGeoFenceRequest {
  public static final String SERIALIZED_NAME_GEOFENCE_ID = "GeofenceId";
  @SerializedName(SERIALIZED_NAME_GEOFENCE_ID)
  private Integer geofenceId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FENCE_COORDINATES = "FenceCoordinates";
  @SerializedName(SERIALIZED_NAME_FENCE_COORDINATES)
  private List<BasicCoordinate> fenceCoordinates = null;

  public static final String SERIALIZED_NAME_TRIGGER_JOB_CODE_ID = "TriggerJobCodeId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_JOB_CODE_ID)
  private Integer triggerJobCodeId;

  public static final String SERIALIZED_NAME_TRIGGER_TASK_ID = "TriggerTaskId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TASK_ID)
  private Integer triggerTaskId;

  public static final String SERIALIZED_NAME_SEND_ALERT_TO_ORG_GROUP_ID = "SendAlertToOrgGroupId";
  @SerializedName(SERIALIZED_NAME_SEND_ALERT_TO_ORG_GROUP_ID)
  private Integer sendAlertToOrgGroupId;

  /**
   * Define when you want the alerts to be setn
   */
  @JsonAdapter(AlertSettingsEnum.Adapter.class)
  public enum AlertSettingsEnum {
    NONE("None"),
    
    SENDWHENENTERING("SendWhenEntering"),
    
    SENDWHENEXITING("SendWhenExiting"),
    
    SENDWHENENTERINGOREXITING("SendWhenEnteringOrExiting");

    private String value;

    AlertSettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlertSettingsEnum fromValue(String value) {
      for (AlertSettingsEnum b : AlertSettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlertSettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlertSettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlertSettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlertSettingsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALERT_SETTINGS = "AlertSettings";
  @SerializedName(SERIALIZED_NAME_ALERT_SETTINGS)
  private AlertSettingsEnum alertSettings;

  /**
   * Define how to you want to trigger the timesheet automation
   */
  @JsonAdapter(TriggerSettingsEnum.Adapter.class)
  public enum TriggerSettingsEnum {
    NONE("None"),
    
    STARTTIMESHEETWHENENTERING("StartTimesheetWhenEntering"),
    
    STOPTIMESHEETWHENENTERING("StopTimesheetWhenEntering"),
    
    STARTONENTERSTOPONLEAVE("StartOnEnterStopOnLeave");

    private String value;

    TriggerSettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggerSettingsEnum fromValue(String value) {
      for (TriggerSettingsEnum b : TriggerSettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TriggerSettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerSettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggerSettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TriggerSettingsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRIGGER_SETTINGS = "TriggerSettings";
  @SerializedName(SERIALIZED_NAME_TRIGGER_SETTINGS)
  private TriggerSettingsEnum triggerSettings;

  public static final String SERIALIZED_NAME_START_TIME_HOUR = "StartTimeHour";
  @SerializedName(SERIALIZED_NAME_START_TIME_HOUR)
  private Integer startTimeHour;

  public static final String SERIALIZED_NAME_START_TIME_MINUTE = "StartTimeMinute";
  @SerializedName(SERIALIZED_NAME_START_TIME_MINUTE)
  private Integer startTimeMinute;

  public static final String SERIALIZED_NAME_END_TIME_HOUR = "EndTimeHour";
  @SerializedName(SERIALIZED_NAME_END_TIME_HOUR)
  private Integer endTimeHour;

  public static final String SERIALIZED_NAME_END_TIME_MINUTE = "EndTimeMinute";
  @SerializedName(SERIALIZED_NAME_END_TIME_MINUTE)
  private Integer endTimeMinute;


  public UpdateGeoFenceRequest geofenceId(Integer geofenceId) {
    
    this.geofenceId = geofenceId;
    return this;
  }

   /**
   * The ID of the geofence you want to update
   * @return geofenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the geofence you want to update")

  public Integer getGeofenceId() {
    return geofenceId;
  }


  public void setGeofenceId(Integer geofenceId) {
    this.geofenceId = geofenceId;
  }


  public UpdateGeoFenceRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the geo fence
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the geo fence")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateGeoFenceRequest fenceCoordinates(List<BasicCoordinate> fenceCoordinates) {
    
    this.fenceCoordinates = fenceCoordinates;
    return this;
  }

  public UpdateGeoFenceRequest addFenceCoordinatesItem(BasicCoordinate fenceCoordinatesItem) {
    if (this.fenceCoordinates == null) {
      this.fenceCoordinates = new ArrayList<BasicCoordinate>();
    }
    this.fenceCoordinates.add(fenceCoordinatesItem);
    return this;
  }

   /**
   * A list of coordinates specifying the geofence region
   * @return fenceCoordinates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of coordinates specifying the geofence region")

  public List<BasicCoordinate> getFenceCoordinates() {
    return fenceCoordinates;
  }


  public void setFenceCoordinates(List<BasicCoordinate> fenceCoordinates) {
    this.fenceCoordinates = fenceCoordinates;
  }


  public UpdateGeoFenceRequest triggerJobCodeId(Integer triggerJobCodeId) {
    
    this.triggerJobCodeId = triggerJobCodeId;
    return this;
  }

   /**
   * The job code to be used when the person enters/leaves the geofence
   * @return triggerJobCodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job code to be used when the person enters/leaves the geofence")

  public Integer getTriggerJobCodeId() {
    return triggerJobCodeId;
  }


  public void setTriggerJobCodeId(Integer triggerJobCodeId) {
    this.triggerJobCodeId = triggerJobCodeId;
  }


  public UpdateGeoFenceRequest triggerTaskId(Integer triggerTaskId) {
    
    this.triggerTaskId = triggerTaskId;
    return this;
  }

   /**
   * The task to be used when the person enters/leaves the geofence
   * @return triggerTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The task to be used when the person enters/leaves the geofence")

  public Integer getTriggerTaskId() {
    return triggerTaskId;
  }


  public void setTriggerTaskId(Integer triggerTaskId) {
    this.triggerTaskId = triggerTaskId;
  }


  public UpdateGeoFenceRequest sendAlertToOrgGroupId(Integer sendAlertToOrgGroupId) {
    
    this.sendAlertToOrgGroupId = sendAlertToOrgGroupId;
    return this;
  }

   /**
   * Send an alert to a user, specified by their user ID
   * @return sendAlertToOrgGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Send an alert to a user, specified by their user ID")

  public Integer getSendAlertToOrgGroupId() {
    return sendAlertToOrgGroupId;
  }


  public void setSendAlertToOrgGroupId(Integer sendAlertToOrgGroupId) {
    this.sendAlertToOrgGroupId = sendAlertToOrgGroupId;
  }


  public UpdateGeoFenceRequest alertSettings(AlertSettingsEnum alertSettings) {
    
    this.alertSettings = alertSettings;
    return this;
  }

   /**
   * Define when you want the alerts to be setn
   * @return alertSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define when you want the alerts to be setn")

  public AlertSettingsEnum getAlertSettings() {
    return alertSettings;
  }


  public void setAlertSettings(AlertSettingsEnum alertSettings) {
    this.alertSettings = alertSettings;
  }


  public UpdateGeoFenceRequest triggerSettings(TriggerSettingsEnum triggerSettings) {
    
    this.triggerSettings = triggerSettings;
    return this;
  }

   /**
   * Define how to you want to trigger the timesheet automation
   * @return triggerSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Define how to you want to trigger the timesheet automation")

  public TriggerSettingsEnum getTriggerSettings() {
    return triggerSettings;
  }


  public void setTriggerSettings(TriggerSettingsEnum triggerSettings) {
    this.triggerSettings = triggerSettings;
  }


  public UpdateGeoFenceRequest startTimeHour(Integer startTimeHour) {
    
    this.startTimeHour = startTimeHour;
    return this;
  }

   /**
   * The start hour in which this geofence should apply.  After this time, the geofence will be active.
   * @return startTimeHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start hour in which this geofence should apply.  After this time, the geofence will be active.")

  public Integer getStartTimeHour() {
    return startTimeHour;
  }


  public void setStartTimeHour(Integer startTimeHour) {
    this.startTimeHour = startTimeHour;
  }


  public UpdateGeoFenceRequest startTimeMinute(Integer startTimeMinute) {
    
    this.startTimeMinute = startTimeMinute;
    return this;
  }

   /**
   * The start minute in which this geofence should apply.  After this time, the geofence will be active.
   * @return startTimeMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start minute in which this geofence should apply.  After this time, the geofence will be active.")

  public Integer getStartTimeMinute() {
    return startTimeMinute;
  }


  public void setStartTimeMinute(Integer startTimeMinute) {
    this.startTimeMinute = startTimeMinute;
  }


  public UpdateGeoFenceRequest endTimeHour(Integer endTimeHour) {
    
    this.endTimeHour = endTimeHour;
    return this;
  }

   /**
   * The end hour in which this geofence will stop applying.  After this time, the geofence will be inactive.
   * @return endTimeHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end hour in which this geofence will stop applying.  After this time, the geofence will be inactive.")

  public Integer getEndTimeHour() {
    return endTimeHour;
  }


  public void setEndTimeHour(Integer endTimeHour) {
    this.endTimeHour = endTimeHour;
  }


  public UpdateGeoFenceRequest endTimeMinute(Integer endTimeMinute) {
    
    this.endTimeMinute = endTimeMinute;
    return this;
  }

   /**
   * The end minute in which this geofence will stop applying.  After this time, the geofence will be inactive.
   * @return endTimeMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end minute in which this geofence will stop applying.  After this time, the geofence will be inactive.")

  public Integer getEndTimeMinute() {
    return endTimeMinute;
  }


  public void setEndTimeMinute(Integer endTimeMinute) {
    this.endTimeMinute = endTimeMinute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGeoFenceRequest updateGeoFenceRequest = (UpdateGeoFenceRequest) o;
    return Objects.equals(this.geofenceId, updateGeoFenceRequest.geofenceId) &&
        Objects.equals(this.name, updateGeoFenceRequest.name) &&
        Objects.equals(this.fenceCoordinates, updateGeoFenceRequest.fenceCoordinates) &&
        Objects.equals(this.triggerJobCodeId, updateGeoFenceRequest.triggerJobCodeId) &&
        Objects.equals(this.triggerTaskId, updateGeoFenceRequest.triggerTaskId) &&
        Objects.equals(this.sendAlertToOrgGroupId, updateGeoFenceRequest.sendAlertToOrgGroupId) &&
        Objects.equals(this.alertSettings, updateGeoFenceRequest.alertSettings) &&
        Objects.equals(this.triggerSettings, updateGeoFenceRequest.triggerSettings) &&
        Objects.equals(this.startTimeHour, updateGeoFenceRequest.startTimeHour) &&
        Objects.equals(this.startTimeMinute, updateGeoFenceRequest.startTimeMinute) &&
        Objects.equals(this.endTimeHour, updateGeoFenceRequest.endTimeHour) &&
        Objects.equals(this.endTimeMinute, updateGeoFenceRequest.endTimeMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geofenceId, name, fenceCoordinates, triggerJobCodeId, triggerTaskId, sendAlertToOrgGroupId, alertSettings, triggerSettings, startTimeHour, startTimeMinute, endTimeHour, endTimeMinute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGeoFenceRequest {\n");
    sb.append("    geofenceId: ").append(toIndentedString(geofenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fenceCoordinates: ").append(toIndentedString(fenceCoordinates)).append("\n");
    sb.append("    triggerJobCodeId: ").append(toIndentedString(triggerJobCodeId)).append("\n");
    sb.append("    triggerTaskId: ").append(toIndentedString(triggerTaskId)).append("\n");
    sb.append("    sendAlertToOrgGroupId: ").append(toIndentedString(sendAlertToOrgGroupId)).append("\n");
    sb.append("    alertSettings: ").append(toIndentedString(alertSettings)).append("\n");
    sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
    sb.append("    startTimeHour: ").append(toIndentedString(startTimeHour)).append("\n");
    sb.append("    startTimeMinute: ").append(toIndentedString(startTimeMinute)).append("\n");
    sb.append("    endTimeHour: ").append(toIndentedString(endTimeHour)).append("\n");
    sb.append("    endTimeMinute: ").append(toIndentedString(endTimeMinute)).append("\n");
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

