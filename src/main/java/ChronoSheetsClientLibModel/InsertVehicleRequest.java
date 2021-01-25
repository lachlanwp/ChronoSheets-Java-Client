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
 * Fields for inserting a new Vehicle
 */
@ApiModel(description = "Fields for inserting a new Vehicle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T22:43:31.260+11:00[Australia/Sydney]")
public class InsertVehicleRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COST_PER_KILOMETER = "CostPerKilometer";
  @SerializedName(SERIALIZED_NAME_COST_PER_KILOMETER)
  private Double costPerKilometer;

  public static final String SERIALIZED_NAME_MAKE = "Make";
  @SerializedName(SERIALIZED_NAME_MAKE)
  private String make;

  public static final String SERIALIZED_NAME_MODEL = "Model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_YEAR = "Year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public static final String SERIALIZED_NAME_LICENCE_PLATE_NUMBER = "LicencePlateNumber";
  @SerializedName(SERIALIZED_NAME_LICENCE_PLATE_NUMBER)
  private String licencePlateNumber;

  public static final String SERIALIZED_NAME_LINKED_ORG_GROUP_IDS = "LinkedOrgGroupIds";
  @SerializedName(SERIALIZED_NAME_LINKED_ORG_GROUP_IDS)
  private List<Integer> linkedOrgGroupIds = null;


  public InsertVehicleRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The Name of the Vehicle
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Name of the Vehicle")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InsertVehicleRequest costPerKilometer(Double costPerKilometer) {
    
    this.costPerKilometer = costPerKilometer;
    return this;
  }

   /**
   * The fuel cost / running cost of the Vehicle, measured per kilometer
   * @return costPerKilometer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fuel cost / running cost of the Vehicle, measured per kilometer")

  public Double getCostPerKilometer() {
    return costPerKilometer;
  }


  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }


  public InsertVehicleRequest make(String make) {
    
    this.make = make;
    return this;
  }

   /**
   * The make of the Vehicle
   * @return make
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The make of the Vehicle")

  public String getMake() {
    return make;
  }


  public void setMake(String make) {
    this.make = make;
  }


  public InsertVehicleRequest model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * The model of the Vehicle
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The model of the Vehicle")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public InsertVehicleRequest year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * The year the Vehicle was made
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year the Vehicle was made")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }


  public InsertVehicleRequest licencePlateNumber(String licencePlateNumber) {
    
    this.licencePlateNumber = licencePlateNumber;
    return this;
  }

   /**
   * The Licence Plate Number of the Vehicle
   * @return licencePlateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Licence Plate Number of the Vehicle")

  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }


  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }


  public InsertVehicleRequest linkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    
    this.linkedOrgGroupIds = linkedOrgGroupIds;
    return this;
  }

  public InsertVehicleRequest addLinkedOrgGroupIdsItem(Integer linkedOrgGroupIdsItem) {
    if (this.linkedOrgGroupIds == null) {
      this.linkedOrgGroupIds = new ArrayList<Integer>();
    }
    this.linkedOrgGroupIds.add(linkedOrgGroupIdsItem);
    return this;
  }

   /**
   * Optionally restrict this Vehicle to only be available to employees within these Organisation Groups
   * @return linkedOrgGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionally restrict this Vehicle to only be available to employees within these Organisation Groups")

  public List<Integer> getLinkedOrgGroupIds() {
    return linkedOrgGroupIds;
  }


  public void setLinkedOrgGroupIds(List<Integer> linkedOrgGroupIds) {
    this.linkedOrgGroupIds = linkedOrgGroupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertVehicleRequest insertVehicleRequest = (InsertVehicleRequest) o;
    return Objects.equals(this.name, insertVehicleRequest.name) &&
        Objects.equals(this.costPerKilometer, insertVehicleRequest.costPerKilometer) &&
        Objects.equals(this.make, insertVehicleRequest.make) &&
        Objects.equals(this.model, insertVehicleRequest.model) &&
        Objects.equals(this.year, insertVehicleRequest.year) &&
        Objects.equals(this.licencePlateNumber, insertVehicleRequest.licencePlateNumber) &&
        Objects.equals(this.linkedOrgGroupIds, insertVehicleRequest.linkedOrgGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, costPerKilometer, make, model, year, licencePlateNumber, linkedOrgGroupIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertVehicleRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    licencePlateNumber: ").append(toIndentedString(licencePlateNumber)).append("\n");
    sb.append("    linkedOrgGroupIds: ").append(toIndentedString(linkedOrgGroupIds)).append("\n");
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
