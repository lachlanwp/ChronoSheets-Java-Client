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
import ChronoSheetsClientLibModel.CsApiApiResponseForPaginatedListTrip;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseTrip;
import ChronoSheetsClientLibModel.CsApiCreateTripRequest;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TripsApi
 */
@Ignore
public class TripsApiTest {

    private final TripsApi api = new TripsApi();

    
    /**
     * Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tripsCreateTripTest() throws ApiException {
        CsApiCreateTripRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseInt32 response = api.tripsCreateTrip(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get trip by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tripsGetMyTripByIdTest() throws ApiException {
        Integer tripId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseTrip response = api.tripsGetMyTripById(tripId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get my trips
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tripsGetMyTripsTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer skip = null;
        Integer take = null;
        Integer vehicleId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseForPaginatedListTrip response = api.tripsGetMyTrips(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
