/*
 * ChronoSheets API
 * <div style='font-size: 14px!important;font-family: Open Sans,sans-serif!important;color: #3b4151!important;'><p>      ChronoSheets is a flexible timesheet solution for small to medium businesses, it is free for small teams of up to 3 and there are iOS and Android apps available.  Use the ChronoSheets API to create your own custom integrations.  Before starting, sign up for a ChronoSheets account at <a target='_BLANK' href='http://tsheets.xyz/signup'>http://tsheets.xyz/signup</a>.  </p></div><div id='cs-extra-info'></div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ChronoSheetsClientLibApi;

import ChronoSheetsClient.ApiCallback;
import ChronoSheetsClient.ApiClient;
import ChronoSheetsClient.ApiException;
import ChronoSheetsClient.ApiResponse;
import ChronoSheetsClient.Configuration;
import ChronoSheetsClient.Pair;
import ChronoSheetsClient.ProgressRequestBody;
import ChronoSheetsClient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ChronoSheetsClientLibModel.ApiResponseBoolean;
import ChronoSheetsClientLibModel.ApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.SetOrganisationGroupUsersRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganisationGroupUsersApi {
    private ApiClient localVarApiClient;

    public OrganisationGroupUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganisationGroupUsersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for organisationGroupUsersGetOrganisationGroupUsers
     * @param orgGroupId An OrganisationGroup Id (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organisationGroupUsersGetOrganisationGroupUsersCall(Integer orgGroupId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/OrganisationGroupUsers/GetOrganisationGroupUsers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orgGroupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orgGroupId", orgGroupId));
        }

        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(Integer orgGroupId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orgGroupId' is set
        if (orgGroupId == null) {
            throw new ApiException("Missing the required parameter 'orgGroupId' when calling organisationGroupUsersGetOrganisationGroupUsers(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationGroupUsersGetOrganisationGroupUsers(Async)");
        }
        

        okhttp3.Call localVarCall = organisationGroupUsersGetOrganisationGroupUsersCall(orgGroupId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     * 
     * @param orgGroupId An OrganisationGroup Id (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseListUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListUserForManagement organisationGroupUsersGetOrganisationGroupUsers(Integer orgGroupId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseListUserForManagement> localVarResp = organisationGroupUsersGetOrganisationGroupUsersWithHttpInfo(orgGroupId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions.
     * 
     * @param orgGroupId An OrganisationGroup Id (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseListUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListUserForManagement> organisationGroupUsersGetOrganisationGroupUsersWithHttpInfo(Integer orgGroupId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(orgGroupId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseListUserForManagement>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a collection of organisation group users that belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; or &#39;ManageOrganisationUsers&#39; permissions. (asynchronously)
     * 
     * @param orgGroupId An OrganisationGroup Id (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organisationGroupUsersGetOrganisationGroupUsersAsync(Integer orgGroupId, String xChronosheetsAuth, final ApiCallback<ApiResponseListUserForManagement> _callback) throws ApiException {

        okhttp3.Call localVarCall = organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(orgGroupId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListUserForManagement>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for organisationGroupUsersUpdateOrganisationGroupUsers
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organisationGroupUsersUpdateOrganisationGroupUsersCall(String xChronosheetsAuth, SetOrganisationGroupUsersRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/OrganisationGroupUsers/UpdateOrganisationGroupUsers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xChronosheetsAuth != null) {
            localVarHeaderParams.put("x-chronosheets-auth", localVarApiClient.parameterToString(xChronosheetsAuth));
        }

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(String xChronosheetsAuth, SetOrganisationGroupUsersRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationGroupUsersUpdateOrganisationGroupUsers(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling organisationGroupUsersUpdateOrganisationGroupUsers(Async)");
        }
        

        okhttp3.Call localVarCall = organisationGroupUsersUpdateOrganisationGroupUsersCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4 (required)
     * @return ApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseBoolean organisationGroupUsersUpdateOrganisationGroupUsers(String xChronosheetsAuth, SetOrganisationGroupUsersRequest request) throws ApiException {
        ApiResponse<ApiResponseBoolean> localVarResp = organisationGroupUsersUpdateOrganisationGroupUsersWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4 (required)
     * @return ApiResponse&lt;ApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseBoolean> organisationGroupUsersUpdateOrganisationGroupUsersWithHttpInfo(String xChronosheetsAuth, SetOrganisationGroupUsersRequest request) throws ApiException {
        okhttp3.Call localVarCall = organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set the users who belong to an organisation group.    Requires the &#39;ManageOrganisationGroups&#39; permissions. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A request object specifying which users belong to an organisation group.  Make sure to specify the OrganisationGroup Id in the request object so that ChronoSheets knows which OrganisationGroup to update. CsvUserIds is a comma separated list of User Ids, e.g. 1,2,3,4 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call organisationGroupUsersUpdateOrganisationGroupUsersAsync(String xChronosheetsAuth, SetOrganisationGroupUsersRequest request, final ApiCallback<ApiResponseBoolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
