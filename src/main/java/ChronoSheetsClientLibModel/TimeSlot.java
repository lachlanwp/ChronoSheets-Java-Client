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

/**
 * TimeSlot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T22:43:31.260+11:00[Australia/Sydney]")
public class TimeSlot {
  /**
   * Gets or Sets dayType
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

  public static final String SERIALIZED_NAME_USUAL_HOUR_ID = "UsualHourId";
  @SerializedName(SERIALIZED_NAME_USUAL_HOUR_ID)
  private Integer usualHourId;

  public static final String SERIALIZED_NAME_START_HOUR = "StartHour";
  @SerializedName(SERIALIZED_NAME_START_HOUR)
  private Integer startHour;

  public static final String SERIALIZED_NAME_START_MINUTE = "StartMinute";
  @SerializedName(SERIALIZED_NAME_START_MINUTE)
  private Integer startMinute;

  public static final String SERIALIZED_NAME_END_HOUR = "EndHour";
  @SerializedName(SERIALIZED_NAME_END_HOUR)
  private Integer endHour;

  public static final String SERIALIZED_NAME_END_MINUTE = "EndMinute";
  @SerializedName(SERIALIZED_NAME_END_MINUTE)
  private Integer endMinute;

  public static final String SERIALIZED_NAME_IS_VALID = "IsValid";
  @SerializedName(SERIALIZED_NAME_IS_VALID)
  private Boolean isValid;


  public TimeSlot dayType(DayTypeEnum dayType) {
    
    this.dayType = dayType;
    return this;
  }

   /**
   * Get dayType
   * @return dayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DayTypeEnum getDayType() {
    return dayType;
  }


  public void setDayType(DayTypeEnum dayType) {
    this.dayType = dayType;
  }


  public TimeSlot usualHourId(Integer usualHourId) {
    
    this.usualHourId = usualHourId;
    return this;
  }

   /**
   * Get usualHourId
   * @return usualHourId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsualHourId() {
    return usualHourId;
  }


  public void setUsualHourId(Integer usualHourId) {
    this.usualHourId = usualHourId;
  }


  public TimeSlot startHour(Integer startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartHour() {
    return startHour;
  }


  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }


  public TimeSlot startMinute(Integer startMinute) {
    
    this.startMinute = startMinute;
    return this;
  }

   /**
   * Get startMinute
   * @return startMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartMinute() {
    return startMinute;
  }


  public void setStartMinute(Integer startMinute) {
    this.startMinute = startMinute;
  }


  public TimeSlot endHour(Integer endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndHour() {
    return endHour;
  }


  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public TimeSlot endMinute(Integer endMinute) {
    
    this.endMinute = endMinute;
    return this;
  }

   /**
   * Get endMinute
   * @return endMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndMinute() {
    return endMinute;
  }


  public void setEndMinute(Integer endMinute) {
    this.endMinute = endMinute;
  }


  public TimeSlot isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsValid() {
    return isValid;
  }


  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.dayType, timeSlot.dayType) &&
        Objects.equals(this.usualHourId, timeSlot.usualHourId) &&
        Objects.equals(this.startHour, timeSlot.startHour) &&
        Objects.equals(this.startMinute, timeSlot.startMinute) &&
        Objects.equals(this.endHour, timeSlot.endHour) &&
        Objects.equals(this.endMinute, timeSlot.endMinute) &&
        Objects.equals(this.isValid, timeSlot.isValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayType, usualHourId, startHour, startMinute, endHour, endMinute, isValid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    sb.append("    dayType: ").append(toIndentedString(dayType)).append("\n");
    sb.append("    usualHourId: ").append(toIndentedString(usualHourId)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMinute: ").append(toIndentedString(startMinute)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMinute: ").append(toIndentedString(endMinute)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

