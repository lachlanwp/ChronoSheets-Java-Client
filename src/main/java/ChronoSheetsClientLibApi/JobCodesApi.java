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


import ChronoSheetsClientLibModel.CsApiApiResponseBoolean;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseJobCode;
import ChronoSheetsClientLibModel.CsApiApiResponseListJobCode;
import ChronoSheetsClientLibModel.CsApiInsertJobCodeRequest;
import ChronoSheetsClientLibModel.CsApiUpdateJobCodeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobCodesApi {
    private ApiClient apiClient;

    public JobCodesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobCodesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for jobCodesCreateJobCode
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call jobCodesCreateJobCodeCall(CsApiInsertJobCodeRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/JobCodes/CreateJobCode";

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call jobCodesCreateJobCodeValidateBeforeCall(CsApiInsertJobCodeRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling jobCodesCreateJobCode(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesCreateJobCode(Async)");
        }
        

        com.squareup.okhttp.Call call = jobCodesCreateJobCodeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a job code
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseInt32 jobCodesCreateJobCode(CsApiInsertJobCodeRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseInt32> resp = jobCodesCreateJobCodeWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Create a job code
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseInt32> jobCodesCreateJobCodeWithHttpInfo(CsApiInsertJobCodeRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = jobCodesCreateJobCodeValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseInt32>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a job code (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call jobCodesCreateJobCodeAsync(CsApiInsertJobCodeRequest request, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseInt32> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = jobCodesCreateJobCodeValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseInt32>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for jobCodesDeleteJobCode
     * @param jobCodeId The ID of the job code your want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call jobCodesDeleteJobCodeCall(Integer jobCodeId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/JobCodes/DeleteJobCode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (jobCodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("JobCodeId", jobCodeId));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call jobCodesDeleteJobCodeValidateBeforeCall(Integer jobCodeId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobCodeId' is set
        if (jobCodeId == null) {
            throw new ApiException("Missing the required parameter 'jobCodeId' when calling jobCodesDeleteJobCode(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesDeleteJobCode(Async)");
        }
        

        com.squareup.okhttp.Call call = jobCodesDeleteJobCodeCall(jobCodeId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a job code
     * 
     * @param jobCodeId The ID of the job code your want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseBoolean jobCodesDeleteJobCode(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseBoolean> resp = jobCodesDeleteJobCodeWithHttpInfo(jobCodeId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Delete a job code
     * 
     * @param jobCodeId The ID of the job code your want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseBoolean> jobCodesDeleteJobCodeWithHttpInfo(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = jobCodesDeleteJobCodeValidateBeforeCall(jobCodeId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a job code (asynchronously)
     * 
     * @param jobCodeId The ID of the job code your want to delete (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call jobCodesDeleteJobCodeAsync(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = jobCodesDeleteJobCodeValidateBeforeCall(jobCodeId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for jobCodesGetJobCodeById
     * @param jobCodeId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call jobCodesGetJobCodeByIdCall(Integer jobCodeId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/JobCodes/GetJobCodeById";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (jobCodeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("JobCodeId", jobCodeId));

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
    private com.squareup.okhttp.Call jobCodesGetJobCodeByIdValidateBeforeCall(Integer jobCodeId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobCodeId' is set
        if (jobCodeId == null) {
            throw new ApiException("Missing the required parameter 'jobCodeId' when calling jobCodesGetJobCodeById(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodeById(Async)");
        }
        

        com.squareup.okhttp.Call call = jobCodesGetJobCodeByIdCall(jobCodeId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a particular job code by job code id
     * 
     * @param jobCodeId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseJobCode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseJobCode jobCodesGetJobCodeById(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseJobCode> resp = jobCodesGetJobCodeByIdWithHttpInfo(jobCodeId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get a particular job code by job code id
     * 
     * @param jobCodeId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseJobCode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseJobCode> jobCodesGetJobCodeByIdWithHttpInfo(Integer jobCodeId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = jobCodesGetJobCodeByIdValidateBeforeCall(jobCodeId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseJobCode>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a particular job code by job code id (asynchronously)
     * 
     * @param jobCodeId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call jobCodesGetJobCodeByIdAsync(Integer jobCodeId, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseJobCode> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = jobCodesGetJobCodeByIdValidateBeforeCall(jobCodeId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseJobCode>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for jobCodesGetJobCodes
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call jobCodesGetJobCodesCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/JobCodes/GetJobCodes";

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
    private com.squareup.okhttp.Call jobCodesGetJobCodesValidateBeforeCall(String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesGetJobCodes(Async)");
        }
        

        com.squareup.okhttp.Call call = jobCodesGetJobCodesCall(xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get job codes for your organisation
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseListJobCode
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseListJobCode jobCodesGetJobCodes(String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseListJobCode> resp = jobCodesGetJobCodesWithHttpInfo(xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get job codes for your organisation
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseListJobCode&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseListJobCode> jobCodesGetJobCodesWithHttpInfo(String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = jobCodesGetJobCodesValidateBeforeCall(xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseListJobCode>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get job codes for your organisation (asynchronously)
     * 
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call jobCodesGetJobCodesAsync(String xChronosheetsAuth, final ApiCallback<CsApiApiResponseListJobCode> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = jobCodesGetJobCodesValidateBeforeCall(xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseListJobCode>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for jobCodesUpdateJobCode
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call jobCodesUpdateJobCodeCall(CsApiUpdateJobCodeRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/JobCodes/UpdateJobCode";

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
    private com.squareup.okhttp.Call jobCodesUpdateJobCodeValidateBeforeCall(CsApiUpdateJobCodeRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling jobCodesUpdateJobCode(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling jobCodesUpdateJobCode(Async)");
        }
        

        com.squareup.okhttp.Call call = jobCodesUpdateJobCodeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a job code
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseBoolean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseBoolean jobCodesUpdateJobCode(CsApiUpdateJobCodeRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseBoolean> resp = jobCodesUpdateJobCodeWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Update a job code
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseBoolean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseBoolean> jobCodesUpdateJobCodeWithHttpInfo(CsApiUpdateJobCodeRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = jobCodesUpdateJobCodeValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a job code (asynchronously)
     * 
     * @param request  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call jobCodesUpdateJobCodeAsync(CsApiUpdateJobCodeRequest request, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseBoolean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = jobCodesUpdateJobCodeValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseBoolean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
