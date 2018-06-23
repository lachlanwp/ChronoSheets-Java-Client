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
import ChronoSheetsClientLibModel.CsApiClientSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiClientTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiJobSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiJobTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiProjectSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiProjectTotalsReportItem;
import ChronoSheetsClientLibModel.CsApiTaskSeriesReportItem;
import ChronoSheetsClientLibModel.CsApiTaskTotalsReportItem;
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
 * CsApiCombinedReportsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-24T01:39:09.827+10:00")
public class CsApiCombinedReportsData {
  @SerializedName("SeriesJobCodes")
  private List<CsApiJobSeriesReportItem> seriesJobCodes = null;

  @SerializedName("SeriesTasks")
  private List<CsApiTaskSeriesReportItem> seriesTasks = null;

  @SerializedName("SeriesClients")
  private List<CsApiClientSeriesReportItem> seriesClients = null;

  @SerializedName("SeriesProjects")
  private List<CsApiProjectSeriesReportItem> seriesProjects = null;

  @SerializedName("TotalsJobCodes")
  private List<CsApiJobTotalsReportItem> totalsJobCodes = null;

  @SerializedName("TotalsTasks")
  private List<CsApiTaskTotalsReportItem> totalsTasks = null;

  @SerializedName("TotalsClients")
  private List<CsApiClientTotalsReportItem> totalsClients = null;

  @SerializedName("TotalsProjects")
  private List<CsApiProjectTotalsReportItem> totalsProjects = null;

  public CsApiCombinedReportsData seriesJobCodes(List<CsApiJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
    return this;
  }

  public CsApiCombinedReportsData addSeriesJobCodesItem(CsApiJobSeriesReportItem seriesJobCodesItem) {
    if (this.seriesJobCodes == null) {
      this.seriesJobCodes = new ArrayList<CsApiJobSeriesReportItem>();
    }
    this.seriesJobCodes.add(seriesJobCodesItem);
    return this;
  }

   /**
   * Get seriesJobCodes
   * @return seriesJobCodes
  **/
  @ApiModelProperty(value = "")
  public List<CsApiJobSeriesReportItem> getSeriesJobCodes() {
    return seriesJobCodes;
  }

  public void setSeriesJobCodes(List<CsApiJobSeriesReportItem> seriesJobCodes) {
    this.seriesJobCodes = seriesJobCodes;
  }

  public CsApiCombinedReportsData seriesTasks(List<CsApiTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
    return this;
  }

  public CsApiCombinedReportsData addSeriesTasksItem(CsApiTaskSeriesReportItem seriesTasksItem) {
    if (this.seriesTasks == null) {
      this.seriesTasks = new ArrayList<CsApiTaskSeriesReportItem>();
    }
    this.seriesTasks.add(seriesTasksItem);
    return this;
  }

   /**
   * Get seriesTasks
   * @return seriesTasks
  **/
  @ApiModelProperty(value = "")
  public List<CsApiTaskSeriesReportItem> getSeriesTasks() {
    return seriesTasks;
  }

  public void setSeriesTasks(List<CsApiTaskSeriesReportItem> seriesTasks) {
    this.seriesTasks = seriesTasks;
  }

  public CsApiCombinedReportsData seriesClients(List<CsApiClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
    return this;
  }

  public CsApiCombinedReportsData addSeriesClientsItem(CsApiClientSeriesReportItem seriesClientsItem) {
    if (this.seriesClients == null) {
      this.seriesClients = new ArrayList<CsApiClientSeriesReportItem>();
    }
    this.seriesClients.add(seriesClientsItem);
    return this;
  }

   /**
   * Get seriesClients
   * @return seriesClients
  **/
  @ApiModelProperty(value = "")
  public List<CsApiClientSeriesReportItem> getSeriesClients() {
    return seriesClients;
  }

  public void setSeriesClients(List<CsApiClientSeriesReportItem> seriesClients) {
    this.seriesClients = seriesClients;
  }

  public CsApiCombinedReportsData seriesProjects(List<CsApiProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
    return this;
  }

  public CsApiCombinedReportsData addSeriesProjectsItem(CsApiProjectSeriesReportItem seriesProjectsItem) {
    if (this.seriesProjects == null) {
      this.seriesProjects = new ArrayList<CsApiProjectSeriesReportItem>();
    }
    this.seriesProjects.add(seriesProjectsItem);
    return this;
  }

   /**
   * Get seriesProjects
   * @return seriesProjects
  **/
  @ApiModelProperty(value = "")
  public List<CsApiProjectSeriesReportItem> getSeriesProjects() {
    return seriesProjects;
  }

  public void setSeriesProjects(List<CsApiProjectSeriesReportItem> seriesProjects) {
    this.seriesProjects = seriesProjects;
  }

  public CsApiCombinedReportsData totalsJobCodes(List<CsApiJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
    return this;
  }

  public CsApiCombinedReportsData addTotalsJobCodesItem(CsApiJobTotalsReportItem totalsJobCodesItem) {
    if (this.totalsJobCodes == null) {
      this.totalsJobCodes = new ArrayList<CsApiJobTotalsReportItem>();
    }
    this.totalsJobCodes.add(totalsJobCodesItem);
    return this;
  }

   /**
   * Get totalsJobCodes
   * @return totalsJobCodes
  **/
  @ApiModelProperty(value = "")
  public List<CsApiJobTotalsReportItem> getTotalsJobCodes() {
    return totalsJobCodes;
  }

  public void setTotalsJobCodes(List<CsApiJobTotalsReportItem> totalsJobCodes) {
    this.totalsJobCodes = totalsJobCodes;
  }

  public CsApiCombinedReportsData totalsTasks(List<CsApiTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
    return this;
  }

  public CsApiCombinedReportsData addTotalsTasksItem(CsApiTaskTotalsReportItem totalsTasksItem) {
    if (this.totalsTasks == null) {
      this.totalsTasks = new ArrayList<CsApiTaskTotalsReportItem>();
    }
    this.totalsTasks.add(totalsTasksItem);
    return this;
  }

   /**
   * Get totalsTasks
   * @return totalsTasks
  **/
  @ApiModelProperty(value = "")
  public List<CsApiTaskTotalsReportItem> getTotalsTasks() {
    return totalsTasks;
  }

  public void setTotalsTasks(List<CsApiTaskTotalsReportItem> totalsTasks) {
    this.totalsTasks = totalsTasks;
  }

  public CsApiCombinedReportsData totalsClients(List<CsApiClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
    return this;
  }

  public CsApiCombinedReportsData addTotalsClientsItem(CsApiClientTotalsReportItem totalsClientsItem) {
    if (this.totalsClients == null) {
      this.totalsClients = new ArrayList<CsApiClientTotalsReportItem>();
    }
    this.totalsClients.add(totalsClientsItem);
    return this;
  }

   /**
   * Get totalsClients
   * @return totalsClients
  **/
  @ApiModelProperty(value = "")
  public List<CsApiClientTotalsReportItem> getTotalsClients() {
    return totalsClients;
  }

  public void setTotalsClients(List<CsApiClientTotalsReportItem> totalsClients) {
    this.totalsClients = totalsClients;
  }

  public CsApiCombinedReportsData totalsProjects(List<CsApiProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
    return this;
  }

  public CsApiCombinedReportsData addTotalsProjectsItem(CsApiProjectTotalsReportItem totalsProjectsItem) {
    if (this.totalsProjects == null) {
      this.totalsProjects = new ArrayList<CsApiProjectTotalsReportItem>();
    }
    this.totalsProjects.add(totalsProjectsItem);
    return this;
  }

   /**
   * Get totalsProjects
   * @return totalsProjects
  **/
  @ApiModelProperty(value = "")
  public List<CsApiProjectTotalsReportItem> getTotalsProjects() {
    return totalsProjects;
  }

  public void setTotalsProjects(List<CsApiProjectTotalsReportItem> totalsProjects) {
    this.totalsProjects = totalsProjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsApiCombinedReportsData combinedReportsData = (CsApiCombinedReportsData) o;
    return Objects.equals(this.seriesJobCodes, combinedReportsData.seriesJobCodes) &&
        Objects.equals(this.seriesTasks, combinedReportsData.seriesTasks) &&
        Objects.equals(this.seriesClients, combinedReportsData.seriesClients) &&
        Objects.equals(this.seriesProjects, combinedReportsData.seriesProjects) &&
        Objects.equals(this.totalsJobCodes, combinedReportsData.totalsJobCodes) &&
        Objects.equals(this.totalsTasks, combinedReportsData.totalsTasks) &&
        Objects.equals(this.totalsClients, combinedReportsData.totalsClients) &&
        Objects.equals(this.totalsProjects, combinedReportsData.totalsProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seriesJobCodes, seriesTasks, seriesClients, seriesProjects, totalsJobCodes, totalsTasks, totalsClients, totalsProjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsApiCombinedReportsData {\n");
    
    sb.append("    seriesJobCodes: ").append(toIndentedString(seriesJobCodes)).append("\n");
    sb.append("    seriesTasks: ").append(toIndentedString(seriesTasks)).append("\n");
    sb.append("    seriesClients: ").append(toIndentedString(seriesClients)).append("\n");
    sb.append("    seriesProjects: ").append(toIndentedString(seriesProjects)).append("\n");
    sb.append("    totalsJobCodes: ").append(toIndentedString(totalsJobCodes)).append("\n");
    sb.append("    totalsTasks: ").append(toIndentedString(totalsTasks)).append("\n");
    sb.append("    totalsClients: ").append(toIndentedString(totalsClients)).append("\n");
    sb.append("    totalsProjects: ").append(toIndentedString(totalsProjects)).append("\n");
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

