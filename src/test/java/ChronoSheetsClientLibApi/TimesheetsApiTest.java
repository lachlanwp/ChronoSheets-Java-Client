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
import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseListInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseListTimesheet;
import ChronoSheetsClientLibModel.CsApiBatchUpdateTimesheetRequest;
import ChronoSheetsClientLibModel.CsApiTimesheet;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimesheetsApi
 */
@Ignore
public class TimesheetsApiTest {

    private final TimesheetsApi api = new TimesheetsApi();

    
    /**
     * Inserts a single timesheet record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timesheetsCreateSingleTimesheetTest() throws ApiException {
        CsApiTimesheet request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseInt32 response = api.timesheetsCreateSingleTimesheet(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Delete a timesheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timesheetsDeleteTimesheetTest() throws ApiException {
        Integer timesheetId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseBoolean response = api.timesheetsDeleteTimesheet(timesheetId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get timesheets between start and end dates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timesheetsGetTimesheetsTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseListTimesheet response = api.timesheetsGetTimesheets(startDate, endDate, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Batch update timesheets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void timesheetsUpdateTimesheetsTest() throws ApiException {
        CsApiBatchUpdateTimesheetRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseListInt32 response = api.timesheetsUpdateTimesheets(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
