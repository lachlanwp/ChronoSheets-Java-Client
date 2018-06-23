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


import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseListUserForManagement;
import ChronoSheetsClientLibModel.CsApiSetOrganisationGroupUsersRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganisationGroupUsersApi {
    private ApiClient apiClient;

    public OrganisationGroupUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganisationGroupUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for organisationGroupUsersGetOrganisationGroupUsers
     * @param orgGroupId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organisationGroupUsersGetOrganisationGroupUsersCall(Integer orgGroupId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/OrganisationGroupUsers/GetOrganisationGroupUsers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (orgGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orgGroupId", orgGroupId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null)
        localVarHeaderParams.put("x-chronosheets-auth", apiClient.parameterToString(xChronosheetsAuth));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(Integer orgGroupId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'orgGroupId' is set
        if (orgGroupId == null) {
            throw new ApiException("Missing the required parameter 'orgGroupId' when calling organisationGroupUsersGetOrganisationGroupUsers(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationGroupUsersGetOrganisationGroupUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = organisationGroupUsersGetOrganisationGroupUsersCall(orgGroupId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a collection of organisation group users that belong to an organisation group
     * 
     * @param orgGroupId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseListUserForManagement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseListUserForManagement organisationGroupUsersGetOrganisationGroupUsers(Integer orgGroupId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseListUserForManagement> resp = organisationGroupUsersGetOrganisationGroupUsersWithHttpInfo(orgGroupId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get a collection of organisation group users that belong to an organisation group
     * 
     * @param orgGroupId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseListUserForManagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseListUserForManagement> organisationGroupUsersGetOrganisationGroupUsersWithHttpInfo(Integer orgGroupId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(orgGroupId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseListUserForManagement>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a collection of organisation group users that belong to an organisation group (asynchronously)
     * 
     * @param orgGroupId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organisationGroupUsersGetOrganisationGroupUsersAsync(Integer orgGroupId, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseListUserForManagement> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = organisationGroupUsersGetOrganisationGroupUsersValidateBeforeCall(orgGroupId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseListUserForManagement>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organisationGroupUsersUpdateOrganisationGroupUsers
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organisationGroupUsersUpdateOrganisationGroupUsersCall(CsApiSetOrganisationGroupUsersRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/OrganisationGroupUsers/UpdateOrganisationGroupUsers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChronosheetsAuth != null)
        localVarHeaderParams.put("x-chronosheets-auth", apiClient.parameterToString(xChronosheetsAuth));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml", "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(CsApiSetOrganisationGroupUsersRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling organisationGroupUsersUpdateOrganisationGroupUsers(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationGroupUsersUpdateOrganisationGroupUsers(Async)");
        }
        

        com.squareup.okhttp.Call call = organisationGroupUsersUpdateOrganisationGroupUsersCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Set the users who belong to an organisation group
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseBoolean organisationGroupUsersUpdateOrganisationGroupUsers(CsApiSetOrganisationGroupUsersRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseBoolean> resp = organisationGroupUsersUpdateOrganisationGroupUsersWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Set the users who belong to an organisation group
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseBoolean> organisationGroupUsersUpdateOrganisationGroupUsersWithHttpInfo(CsApiSetOrganisationGroupUsersRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set the users who belong to an organisation group (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organisationGroupUsersUpdateOrganisationGroupUsersAsync(CsApiSetOrganisationGroupUsersRequest request, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseBoolean> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = organisationGroupUsersUpdateOrganisationGroupUsersValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
