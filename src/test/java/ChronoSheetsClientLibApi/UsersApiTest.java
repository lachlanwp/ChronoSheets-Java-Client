/*
 * ChronoSheets API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import ChronoSheetsClientLibModel.CsApiApiResponseInsertUserResponse;
import ChronoSheetsClientLibModel.CsApiApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.CsApiApiResponseUpdateUserResponse;
import ChronoSheetsClientLibModel.CsApiApiResponseUserForManagement;
import ChronoSheetsClientLibModel.CsApiInsertUserRequest;
import ChronoSheetsClientLibModel.CsApiUpdateUserRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create a user in your organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersCreateTimesheetUserTest() throws ApiException {
        CsApiInsertUserRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseInsertUserResponse response = api.usersCreateTimesheetUser(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get a particular user in your organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTimesheetUserTest() throws ApiException {
        Integer userId = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseUserForManagement response = api.usersGetTimesheetUser(userId, xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Get users for your organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersGetTimesheetUsersTest() throws ApiException {
        String xChronosheetsAuth = null;
        CsApiApiResponseListUserForManagement response = api.usersGetTimesheetUsers(xChronosheetsAuth);

        // TODO: test validations
    }
    
    /**
     * Update a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUpdateTimesheetUserTest() throws ApiException {
        CsApiUpdateUserRequest request = null;
        String xChronosheetsAuth = null;
        CsApiApiResponseUpdateUserResponse response = api.usersUpdateTimesheetUser(request, xChronosheetsAuth);

        // TODO: test validations
    }
    
}
