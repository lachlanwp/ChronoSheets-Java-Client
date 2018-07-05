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


import ChronoSheetsClientLibModel.CSApiResponseOrganisation;
import ChronoSheetsClientLibModel.CSApiResponseUpdateOrganisationResponse;
import ChronoSheetsClientLibModel.CSUpdateOrganisationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganisationApi {
    private ApiClient apiClient;

    public OrganisationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganisationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for organisationGetOrganisation
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organisationGetOrganisationCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Organisation/GetOrganisation";

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
    private com.squareup.okhttp.Call organisationGetOrganisationValidateBeforeCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationGetOrganisation(Async)");
        }
        

        com.squareup.okhttp.Call call = organisationGetOrganisationCall(xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseOrganisation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseOrganisation organisationGetOrganisation(String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseOrganisation> resp = organisationGetOrganisationWithHttpInfo(xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission.
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseOrganisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseOrganisation> organisationGetOrganisationWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = organisationGetOrganisationValidateBeforeCall(xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseOrganisation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get your organisation.  Requires &#39;OrganisationAdmin&#39; permission. (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organisationGetOrganisationAsync(String xChronosheetsAuth, final ApiCallback<CSApiResponseOrganisation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organisationGetOrganisationValidateBeforeCall(xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseOrganisation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organisationUpdateOrganisation
     * @param request An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organisationUpdateOrganisationCall(CSUpdateOrganisationRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Organisation/UpdateOrganisation";

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
    private com.squareup.okhttp.Call organisationUpdateOrganisationValidateBeforeCall(CSUpdateOrganisationRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling organisationUpdateOrganisation(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling organisationUpdateOrganisation(Async)");
        }
        

        com.squareup.okhttp.Call call = organisationUpdateOrganisationCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission.
     * 
     * @param request An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CSApiResponseUpdateOrganisationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CSApiResponseUpdateOrganisationResponse organisationUpdateOrganisation(CSUpdateOrganisationRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CSApiResponseUpdateOrganisationResponse> resp = organisationUpdateOrganisationWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission.
     * 
     * @param request An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CSApiResponseUpdateOrganisationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CSApiResponseUpdateOrganisationResponse> organisationUpdateOrganisationWithHttpInfo(CSUpdateOrganisationRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = organisationUpdateOrganisationValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CSApiResponseUpdateOrganisationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an organisation.  Requires &#39;OrganisationAdmin&#39; permission. (asynchronously)
     * 
     * @param request An Update Organsation Request object containing updated fields.  Make sure to specify the Organsation Id in the request object so that ChronoSheets knows which Organsation to update (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organisationUpdateOrganisationAsync(CSUpdateOrganisationRequest request, String xChronosheetsAuth, final ApiCallback<CSApiResponseUpdateOrganisationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organisationUpdateOrganisationValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CSApiResponseUpdateOrganisationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
