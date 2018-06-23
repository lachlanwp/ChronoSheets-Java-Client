/*
 * ChronoSheets API
 * An API for integrating into ChronoSheets timesheets
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
import ChronoSheetsClientLibModel.CsApiApiResponseListUsualHoursDay;
import ChronoSheetsClientLibModel.CsApiSetUsualHoursRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsualHoursApi
 */
@Ignore
public class UsualHoursApiTest {

    private final UsualHoursApi api = new UsualHoursApi();

    
    /**
     * Get usual hours (rostered hours) for an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usualHoursGetUsualHoursTest() throws ApiException {
        Integer userId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseListUsualHoursDay response = api.usualHoursGetUsualHours(userId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Set usual hours (rostered hours) for an employee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usualHoursSetUsualHoursTest() throws ApiException {
        CsApiSetUsualHoursRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseBoolean response = api.usualHoursSetUsualHours(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
