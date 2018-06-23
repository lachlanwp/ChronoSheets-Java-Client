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
import ChronoSheetsClientLibModel.CsApiApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.CsApiSetOrganisationGroupUsersRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganisationGroupUsersApi
 */
@Ignore
public class OrganisationGroupUsersApiTest {

    private final OrganisationGroupUsersApi api = new OrganisationGroupUsersApi();

    
    /**
     * Get a collection of organisation group users that belong to an organisation group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupUsersGetOrganisationGroupUsersTest() throws ApiException {
        Integer orgGroupId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseListUserForManagement response = api.organisationGroupUsersGetOrganisationGroupUsers(orgGroupId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Set the users who belong to an organisation group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupUsersUpdateOrganisationGroupUsersTest() throws ApiException {
        CsApiSetOrganisationGroupUsersRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseBoolean response = api.organisationGroupUsersUpdateOrganisationGroupUsers(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
