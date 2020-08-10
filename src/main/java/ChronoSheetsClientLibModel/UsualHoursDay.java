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
import ChronoSheetsClientLibModel.TimeSlot;
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
 * UsualHoursDay
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T22:27:55.870+10:00[Australia/Sydney]")
public class UsualHoursDay {
  /**
   * Specify which day this collection of Roster timeslots is for (Monday-Sunday)
   */
  @JsonAdapter(DayTypeEnum.Adapter.class)
  public enum DayTypeEnum {
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday"),
    
    SUNDAY("Sunday");

    private String value;

    DayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DayTypeEnum fromValue(String value) {
      for (DayTypeEnum b : DayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DAY_TYPE = "DayType";
  @SerializedName(SERIALIZED_NAME_DAY_TYPE)
  private DayTypeEnum dayType;

  public static final String SERIALIZED_NAME_TIME_SLOTS = "TimeSlots";
  @SerializedName(SERIALIZED_NAME_TIME_SLOTS)
  private List<TimeSlot> timeSlots = null;

  public static final String SERIALIZED_NAME_DELETE_USUAL_HOURS = "DeleteUsualHours";
  @SerializedName(SERIALIZED_NAME_DELETE_USUAL_HOURS)
  private List<Integer> deleteUsualHours = null;


  public UsualHoursDay dayType(DayTypeEnum dayType) {
    
    this.dayType = dayType;
    return this;
  }

   /**
   * Specify which day this collection of Roster timeslots is for (Monday-Sunday)
   * @return dayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify which day this collection of Roster timeslots is for (Monday-Sunday)")

  public DayTypeEnum getDayType() {
    return dayType;
  }


  public void setDayType(DayTypeEnum dayType) {
    this.dayType = dayType;
  }


  public UsualHoursDay timeSlots(List<TimeSlot> timeSlots) {
    
    this.timeSlots = timeSlots;
    return this;
  }

  public UsualHoursDay addTimeSlotsItem(TimeSlot timeSlotsItem) {
    if (this.timeSlots == null) {
      this.timeSlots = new ArrayList<TimeSlot>();
    }
    this.timeSlots.add(timeSlotsItem);
    return this;
  }

   /**
   * A collection of TimeSlots within this day
   * @return timeSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of TimeSlots within this day")

  public List<TimeSlot> getTimeSlots() {
    return timeSlots;
  }


  public void setTimeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }


  public UsualHoursDay deleteUsualHours(List<Integer> deleteUsualHours) {
    
    this.deleteUsualHours = deleteUsualHours;
    return this;
  }

  public UsualHoursDay addDeleteUsualHoursItem(Integer deleteUsualHoursItem) {
    if (this.deleteUsualHours == null) {
      this.deleteUsualHours = new ArrayList<Integer>();
    }
    this.deleteUsualHours.add(deleteUsualHoursItem);
    return this;
  }

   /**
   * Mark here which existing UsualHours are to be deleted
   * @return deleteUsualHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mark here which existing UsualHours are to be deleted")

  public List<Integer> getDeleteUsualHours() {
    return deleteUsualHours;
  }


  public void setDeleteUsualHours(List<Integer> deleteUsualHours) {
    this.deleteUsualHours = deleteUsualHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsualHoursDay usualHoursDay = (UsualHoursDay) o;
    return Objects.equals(this.dayType, usualHoursDay.dayType) &&
        Objects.equals(this.timeSlots, usualHoursDay.timeSlots) &&
        Objects.equals(this.deleteUsualHours, usualHoursDay.deleteUsualHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayType, timeSlots, deleteUsualHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsualHoursDay {\n");
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    deleteUsualHours: ").append(toIndentedString(deleteUsualHours)).append("\n");
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

