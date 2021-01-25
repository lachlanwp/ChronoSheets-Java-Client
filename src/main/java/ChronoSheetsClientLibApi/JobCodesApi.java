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
import ChronoSheetsClientLibModel.ApiResponseInt32;
import ChronoSheetsClientLibModel.ApiResponseJobCode;
import ChronoSheetsClientLibModel.ApiResponseListJobCode;
import ChronoSheetsClientLibModel.InsertJobCodeRequest;
import ChronoSheetsClientLibModel.UpdateJobCodeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobCodesApi {
    private ApiClient localVarApiClient;

    public JobCodesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobCodesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for jobCodesCreateJobCode
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert JobCode Request object containing values for the new JobCode to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobCodesCreateJobCodeCall(String xChronosheetsAuth, InsertJobCodeRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/JobCodes/CreateJobCode";

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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call jobCodesCreateJobCodeValidateBeforeCall(String xChronosheetsAuth, InsertJobCodeRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling jobCodesCreateJobCode(Async)");
        }
        

        okhttp3.Call localVarCall = jobCodesCreateJobCodeCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Create a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert JobCode Request object containing values for the new JobCode to create (required)
     * @return ApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseInt32 jobCodesCreateJobCode(String xChronosheetsAuth, InsertJobCodeRequest request) throws ApiException {
        ApiResponse<ApiResponseInt32> localVarResp = jobCodesCreateJobCodeWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Create a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert JobCode Request object containing values for the new JobCode to create (required)
     * @return ApiResponse&lt;ApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseInt32> jobCodesCreateJobCodeWithHttpInfo(String xChronosheetsAuth, InsertJobCodeRequest request) throws ApiException {
        okhttp3.Call localVarCall = jobCodesCreateJobCodeValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a job code.    Requires the &#39;ManageJobsAndTask&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request An Insert JobCode Request object containing values for the new JobCode to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobCodesCreateJobCodeAsync(String xChronosheetsAuth, InsertJobCodeRequest request, final ApiCallback<ApiResponseInt32> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobCodesCreateJobCodeValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseInt32>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobCodesDeleteJobCode
     * @param jobCodeId The ID of the job code you want to delete (required)
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
    public okhttp3.Call jobCodesDeleteJobCodeCall(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/JobCodes/DeleteJobCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (jobCodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("JobCodeId", jobCodeId));
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call jobCodesDeleteJobCodeValidateBeforeCall(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jobCodeId' is set
        if (jobCodeId == null) {
            throw new ApiException("Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode(Async)");
        }
        

        okhttp3.Call localVarCall = jobCodesDeleteJobCodeCall(jobCodeId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Delete a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param jobCodeId The ID of the job code you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseBoolean jobCodesDeleteJobCode(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseBoolean> localVarResp = jobCodesDeleteJobCodeWithHttpInfo(jobCodeId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Delete a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param jobCodeId The ID of the job code you want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseBoolean> jobCodesDeleteJobCodeWithHttpInfo(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = jobCodesDeleteJobCodeValidateBeforeCall(jobCodeId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a job code.    Requires the &#39;ManageJobsAndTask&#39; permission. (asynchronously)
     * 
     * @param jobCodeId The ID of the job code you want to delete (required)
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
    public okhttp3.Call jobCodesDeleteJobCodeAsync(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback<ApiResponseBoolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobCodesDeleteJobCodeValidateBeforeCall(jobCodeId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobCodesGetJobCodeById
     * @param jobCodeId The ID of the JobCode you want to get (required)
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
    public okhttp3.Call jobCodesGetJobCodeByIdCall(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/JobCodes/GetJobCodeById";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (jobCodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("JobCodeId", jobCodeId));
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
    private okhttp3.Call jobCodesGetJobCodeByIdValidateBeforeCall(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'jobCodeId' is set
        if (jobCodeId == null) {
            throw new ApiException("Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById(Async)");
        }
        

        okhttp3.Call localVarCall = jobCodesGetJobCodeByIdCall(jobCodeId, xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get a particular job code by job code id.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
     * 
     * @param jobCodeId The ID of the JobCode you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseJobCode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseJobCode jobCodesGetJobCodeById(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseJobCode> localVarResp = jobCodesGetJobCodeByIdWithHttpInfo(jobCodeId, xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get a particular job code by job code id.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
     * 
     * @param jobCodeId The ID of the JobCode you want to get (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseJobCode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseJobCode> jobCodesGetJobCodeByIdWithHttpInfo(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = jobCodesGetJobCodeByIdValidateBeforeCall(jobCodeId, xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseJobCode>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a particular job code by job code id.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions. (asynchronously)
     * 
     * @param jobCodeId The ID of the JobCode you want to get (required)
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
    public okhttp3.Call jobCodesGetJobCodeByIdAsync(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback<ApiResponseJobCode> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobCodesGetJobCodeByIdValidateBeforeCall(jobCodeId, xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseJobCode>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobCodesGetJobCodes
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
    public okhttp3.Call jobCodesGetJobCodesCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/JobCodes/GetJobCodes";

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call jobCodesGetJobCodesValidateBeforeCall(String xChronosheetsAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes(Async)");
        }
        

        okhttp3.Call localVarCall = jobCodesGetJobCodesCall(xChronosheetsAuth, _callback);
        return localVarCall;

    }

    /**
     * Get job codes for your organisation.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponseListJobCode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseListJobCode jobCodesGetJobCodes(String xChronosheetsAuth) throws ApiException {
        ApiResponse<ApiResponseListJobCode> localVarResp = jobCodesGetJobCodesWithHttpInfo(xChronosheetsAuth);
        return localVarResp.getData();
    }

    /**
     * Get job codes for your organisation.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;ApiResponseListJobCode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseListJobCode> jobCodesGetJobCodesWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        okhttp3.Call localVarCall = jobCodesGetJobCodesValidateBeforeCall(xChronosheetsAuth, null);
        Type localVarReturnType = new TypeToken<ApiResponseListJobCode>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get job codes for your organisation.    Requires &#39;SubmitTimesheets&#39; or &#39;ManageJobsAndTasks&#39; permissions. (asynchronously)
     * 
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
    public okhttp3.Call jobCodesGetJobCodesAsync(String xChronosheetsAuth, final ApiCallback<ApiResponseListJobCode> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobCodesGetJobCodesValidateBeforeCall(xChronosheetsAuth, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseListJobCode>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobCodesUpdateJobCode
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobCodesUpdateJobCodeCall(String xChronosheetsAuth, UpdateJobCodeRequest request, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/JobCodes/UpdateJobCode";

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
    private okhttp3.Call jobCodesUpdateJobCodeValidateBeforeCall(String xChronosheetsAuth, UpdateJobCodeRequest request, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode(Async)");
        }
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling jobCodesUpdateJobCode(Async)");
        }
        

        okhttp3.Call localVarCall = jobCodesUpdateJobCodeCall(xChronosheetsAuth, request, _callback);
        return localVarCall;

    }

    /**
     * Update a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update (required)
     * @return ApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponseBoolean jobCodesUpdateJobCode(String xChronosheetsAuth, UpdateJobCodeRequest request) throws ApiException {
        ApiResponse<ApiResponseBoolean> localVarResp = jobCodesUpdateJobCodeWithHttpInfo(xChronosheetsAuth, request);
        return localVarResp.getData();
    }

    /**
     * Update a job code.    Requires the &#39;ManageJobsAndTask&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update (required)
     * @return ApiResponse&lt;ApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResponseBoolean> jobCodesUpdateJobCodeWithHttpInfo(String xChronosheetsAuth, UpdateJobCodeRequest request) throws ApiException {
        okhttp3.Call localVarCall = jobCodesUpdateJobCodeValidateBeforeCall(xChronosheetsAuth, request, null);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a job code.    Requires the &#39;ManageJobsAndTask&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param request A Update JobCode Request object containing updated fields.  Make sure to specify the JobCode Id in the request object so that ChronoSheets knows which JobCode to update (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobCodesUpdateJobCodeAsync(String xChronosheetsAuth, UpdateJobCodeRequest request, final ApiCallback<ApiResponseBoolean> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobCodesUpdateJobCodeValidateBeforeCall(xChronosheetsAuth, request, _callback);
        Type localVarReturnType = new TypeToken<ApiResponseBoolean>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
