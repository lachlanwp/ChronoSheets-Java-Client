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
import ChronoSheetsClientLibModel.CSApiResponseListOrganisationGroup;
import ChronoSheetsClientLibModel.CSApiResponseOrganisationGroup;
import ChronoSheetsClientLibModel.CSInsertOrganisationGroupRequest;
import ChronoSheetsClientLibModel.CSSaveOrganisationGroupRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganisationGroupsApi
 */
@Ignore
public class OrganisationGroupsApiTest {

    private final OrganisationGroupsApi api = new OrganisationGroupsApi();

    
    /**
     * Create an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsCreateOrganisationGroupTest() throws ApiException {
        CSInsertOrganisationGroupRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseInt32 response = api.organisationGroupsCreateOrganisationGroup(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular organisation group.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsGetOrganisationGroupTest() throws ApiException {
        Integer organisationGroupId = null;
        String xChronosheetsAuth = null;
        CSApiResponseOrganisationGroup response = api.organisationGroupsGetOrganisationGroup(organisationGroupId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a collection of organisation groups that are under your organisation.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsGetOrganisationGroupsTest() throws ApiException {
        String xChronosheetsAuth = null;
        CSApiResponseListOrganisationGroup response = api.organisationGroupsGetOrganisationGroups(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get org groups for a particular job.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageJobsAndTask&#39;, &#39;ManageClientsAndProjects&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsGetOrganisationGroupsForJobTest() throws ApiException {
        Integer jobId = null;
        String xChronosheetsAuth = null;
        CSApiResponseListOrganisationGroup response = api.organisationGroupsGetOrganisationGroupsForJob(jobId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get org groups for a particular vehicle.    Requires the &#39;ManageOrganisationGroups&#39;, &#39;ManageFleet&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsGetOrganisationGroupsForVehicleTest() throws ApiException {
        Integer vehicleId = null;
        String xChronosheetsAuth = null;
        CSApiResponseListOrganisationGroup response = api.organisationGroupsGetOrganisationGroupsForVehicle(vehicleId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organisationGroupsUpdateOrganisationGroupTest() throws ApiException {
        CSSaveOrganisationGroupRequest request = null;
        String xChronosheetsAuth = null;
        CSApiResponseBoolean response = api.organisationGroupsUpdateOrganisationGroup(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
