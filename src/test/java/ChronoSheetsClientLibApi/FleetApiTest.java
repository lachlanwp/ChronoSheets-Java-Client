/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 5 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiException;
import ChronoSheetsClientLibModel.CSApiResponseBoolean;
import ChronoSheetsClientLibModel.CSApiResponseFleetVehicle;
import ChronoSheetsClientLibModel.CSApiResponseInt32;
import ChronoSheetsClientLibModel.CSApiResponseListFleetVehicle;
import ChronoSheetsClientLibModel.CSInsertVehicleRequest;
import ChronoSheetsClientLibModel.CSSaveVehicleRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FleetApi
 */
@Ignore
public class FleetApiTest {

    private final FleetApi api = new FleetApi();

    
    /**
     * Create a vehicle.    Requires the &#39;ManageFleet&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fleetCreateVehicleTest() throws ApiException {
        CSInsertVehicleRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.fleetCreateVehicle(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular vehicle.  Does not require any special permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fleetGetVehicleByIdTest() throws ApiException {
        Integer vehicleId = null;
        String xChronosheetsAuth = null;
        CSApiResponseFleetVehicle response = api.fleetGetVehicleById(vehicleId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a collection of vehicles that are under your organisation.    Does not require any special permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fleetGetVehiclesTest() throws ApiException {
        String xChronosheetsAuth = null;
        Boolean includeDeleted = null;
        CSApiResponseListFleetVehicle response = api.fleetGetVehicles(xChronosheetsAuth, includeDeleted);

        // TODO: test validations
    }
    
    /**
     * Update a vehicle.    Requires the &#39;ManageFleet&#39; permission.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fleetUpdateVehicleTest() throws ApiException {
        CSSaveVehicleRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.fleetUpdateVehicle(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
