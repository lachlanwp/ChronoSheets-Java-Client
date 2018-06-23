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
 * CsApiFleetVehicle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-23T17:51:45.139+10:00")
public class CsApiFleetVehicle {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OrganisationId")
  private Integer organisationId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CostPerKilometer")
  private Double costPerKilometer = null;

  @SerializedName("Make")
  private String make = null;

  @SerializedName("Model")
  private String model = null;

  @SerializedName("Year")
  private String year = null;

  @SerializedName("LicencePlateNumber")
  private String licencePlateNumber = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  @SerializedName("PermittedEmployees")
  private List<Integer> permittedEmployees = null;

  public CsApiFleetVehicle id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CsApiFleetVehicle organisationId(Integer organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Get organisationId
   * @return organisationId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(Integer organisationId) {
    this.organisationId = organisationId;
  }

  public CsApiFleetVehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CsApiFleetVehicle costPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
    return this;
  }

   /**
   * Get costPerKilometer
   * @return costPerKilometer
  **/
  @ApiModelProperty(value = "")
  public Double getCostPerKilometer() {
    return costPerKilometer;
  }

  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }

  public CsApiFleetVehicle make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public CsApiFleetVehicle model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CsApiFleetVehicle year(String year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public CsApiFleetVehicle licencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
    return this;
  }

   /**
   * Get licencePlateNumber
   * @return licencePlateNumber
  **/
  @ApiModelProperty(value = "")
  public String getLicencePlateNumber() {
    return licencePlateNumber;
  }

  public void setLicencePlateNumber(String licencePlateNumber) {
    this.licencePlateNumber = licencePlateNumber;
  }

  public CsApiFleetVehicle isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CsApiFleetVehicle permittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
    return this;
  }

  public CsApiFleetVehicle addPermittedEmployeesItem(Integer permittedEmployeesItem) {
    if (this.permittedEmployees == null) {
      this.permittedEmployees = new ArrayList<Integer>();
    }
    this.permittedEmployees.add(permittedEmployeesItem);
    return this;
  }

   /**
   * Get permittedEmployees
   * @return permittedEmployees
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPermittedEmployees() {
    return permittedEmployees;
  }

  public void setPermittedEmployees(List<Integer> permittedEmployees) {
    this.permittedEmployees = permittedEmployees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiFleetVehicle fleetVehicle = (CsApiFleetVehicle) o;
    return Objects.equals(this.id, fleetVehicle.id) &&
        Objects.equals(this.organisationId, fleetVehicle.organisationId) &&
        Objects.equals(this.name, fleetVehicle.name) &&
        Objects.equals(this.costPerKilometer, fleetVehicle.costPerKilometer) &&
        Objects.equals(this.make, fleetVehicle.make) &&
        Objects.equals(this.model, fleetVehicle.model) &&
        Objects.equals(this.year, fleetVehicle.year) &&
        Objects.equals(this.licencePlateNumber, fleetVehicle.licencePlateNumber) &&
        Objects.equals(this.isDeleted, fleetVehicle.isDeleted) &&
        Objects.equals(this.permittedEmployees, fleetVehicle.permittedEmployees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationId, name, costPerKilometer, make, model, year, licencePlateNumber, isDeleted, permittedEmployees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiFleetVehicle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    licencePlateNumber: ").append(toIndentedString(licencePlateNumber)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    permittedEmployees: ").append(toIndentedString(permittedEmployees)).append("\n");
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

