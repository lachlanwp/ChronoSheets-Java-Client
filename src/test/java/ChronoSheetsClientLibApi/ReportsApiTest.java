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


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CSApiResponseCombinedReportsData;
import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment;
import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListOrgReportTrip;
import ChronoSheetsClientLibModel.CSApiResponseForPaginatedListRawReportItem;
import ChronoSheetsClientLibModel.CSApiResponseListJobSeriesReportItem;
import ChronoSheetsClientLibModel.CSApiResponseListProjectCostingReportItem;
import ChronoSheetsClientLibModel.CSApiResponseTrip;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * Get Consolidated Admin Reports Data (Jobs, Tasks, Clients and Projects).  These are the organisation wide reports, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetAllChartsDataAdminTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String userIds = null;
        String xChronosheetsAuth = null;
        CSApiResponseCombinedReportsData response = api.reportsGetAllChartsDataAdmin(startDate, endDate, userIds, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get Consolidated User Reports Data (Jobs, Tasks, Clients and Projects).  These are the user&#39;s own reports.    Requires the &#39;ViewOwnReports&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetAllChartsDataUserTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String xChronosheetsAuth = null;
        CSApiResponseCombinedReportsData response = api.reportsGetAllChartsDataUser(startDate, endDate, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get trip by Id, for reporting purposes.    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetOrgTripByIdTest() throws ApiException {
        Integer tripId = null;
        String xChronosheetsAuth = null;
        CSApiResponseTrip response = api.reportsGetOrgTripById(tripId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Reports on Organisation timesheet file attachments (files uploaded and attached to timesheet records.    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetOrganisationTimesheetFileAttachmentsTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer skip = null;
        Integer take = null;
        String userIds = null;
        String xChronosheetsAuth = null;
        CSApiResponseForPaginatedListOrgReportTimesheetFileAttachment response = api.reportsGetOrganisationTimesheetFileAttachments(startDate, endDate, skip, take, userIds, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Reports on Organisation trips (GPS tracking from whole organisation).    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetOrganisationTripsTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer skip = null;
        Integer take = null;
        String userIds = null;
        String xChronosheetsAuth = null;
        CSApiResponseForPaginatedListOrgReportTrip response = api.reportsGetOrganisationTrips(startDate, endDate, skip, take, userIds, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get Timesheets Raw Data.  This data details each timesheet record.  These are the organisation wide timesheet records, with data from potentially all employees.    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsGetRawDataAdminTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String userIds = null;
        String sort = null;
        String order = null;
        Integer skip = null;
        Integer take = null;
        String xChronosheetsAuth = null;
        CSApiResponseForPaginatedListRawReportItem response = api.reportsGetRawDataAdmin(startDate, endDate, userIds, sort, order, skip, take, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Gets project cost estimations VS actual cost for date range and users.    Requires the &#39;ReportAdmin&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsProjectCostingsAdminTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String userIds = null;
        String xChronosheetsAuth = null;
        CSApiResponseListProjectCostingReportItem response = api.reportsProjectCostingsAdmin(startDate, endDate, userIds, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Timeseries jobs data for the logged in user.    Requires the &#39;ViewOwnReports&#39; or &#39;SubmitTimesheets&#39;.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportsUserJobsOverTimeTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String xChronosheetsAuth = null;
        CSApiResponseListJobSeriesReportItem response = api.reportsUserJobsOverTime(startDate, endDate, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
