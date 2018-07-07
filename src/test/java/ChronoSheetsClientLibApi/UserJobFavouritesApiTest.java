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
import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseListUserJobFavourite;
import ChronoSheetsClientLibModel.CSInsertUserJobFavouriteRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserJobFavouritesApi
 */
@Ignore
public class UserJobFavouritesApiTest {

    private final UserJobFavouritesApi api = new UserJobFavouritesApi();

    
    /**
     * Create a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userJobFavouritesCreateJobFavouriteTest() throws ApiException {
        CSInsertUserJobFavouriteRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.userJobFavouritesCreateJobFavourite(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Delete a job favourite.    Requires the &#39;SubmitTimesheets&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userJobFavouritesDeleteJobFavouriteTest() throws ApiException {
        Integer jobId = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.userJobFavouritesDeleteJobFavourite(jobId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get your job favourites.    Requires the &#39;SubmitTimesheets&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userJobFavouritesGetJobFavouritesTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseListUserJobFavourite response = api.userJobFavouritesGetJobFavourites(xChronosheetsAuth);

        // TODO: test validations
    }
    
}
