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


import ChronoSheetsClientLibModel.CsApiApiResponseForPaginatedListTrip;
import ChronoSheetsClientLibModel.CsApiApiResponseInt32;
import ChronoSheetsClientLibModel.CsApiApiResponseTrip;
import ChronoSheetsClientLibModel.CsApiCreateTripRequest;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripsApi {
    private ApiClient apiClient;

    public TripsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TripsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tripsCreateTrip
     * @param request The create trip request (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tripsCreateTripCall(CsApiCreateTripRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Trips/CreateTrip";

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
    private com.squareup.okhttp.Call tripsCreateTripValidateBeforeCall(CsApiCreateTripRequest request, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling tripsCreateTrip(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling tripsCreateTrip(Async)");
        }
        

        com.squareup.okhttp.Call call = tripsCreateTripCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.
     * 
     * @param request The create trip request (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseInt32
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseInt32 tripsCreateTrip(CsApiCreateTripRequest request, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseInt32> resp = tripsCreateTripWithHttpInfo(request, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference.
     * 
     * @param request The create trip request (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseInt32&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseInt32> tripsCreateTripWithHttpInfo(CsApiCreateTripRequest request, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = tripsCreateTripValidateBeforeCall(request, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseInt32>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new trip.  Important: create a timesheet record before calling this, passing in the new timesheet record id as a reference. (asynchronously)
     * 
     * @param request The create trip request (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tripsCreateTripAsync(CsApiCreateTripRequest request, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseInt32> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tripsCreateTripValidateBeforeCall(request, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseInt32>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tripsGetMyTripById
     * @param tripId The ID of the trip (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tripsGetMyTripByIdCall(Integer tripId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Trips/GetMyTripById";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tripId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("TripId", tripId));

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
    private com.squareup.okhttp.Call tripsGetMyTripByIdValidateBeforeCall(Integer tripId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tripId' is set
        if (tripId == null) {
            throw new ApiException("Missing the required parameter 'tripId' when calling tripsGetMyTripById(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling tripsGetMyTripById(Async)");
        }
        

        com.squareup.okhttp.Call call = tripsGetMyTripByIdCall(tripId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get trip by Id
     * 
     * @param tripId The ID of the trip (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseTrip
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseTrip tripsGetMyTripById(Integer tripId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseTrip> resp = tripsGetMyTripByIdWithHttpInfo(tripId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get trip by Id
     * 
     * @param tripId The ID of the trip (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseTrip&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseTrip> tripsGetMyTripByIdWithHttpInfo(Integer tripId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = tripsGetMyTripByIdValidateBeforeCall(tripId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseTrip>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get trip by Id (asynchronously)
     * 
     * @param tripId The ID of the trip (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tripsGetMyTripByIdAsync(Integer tripId, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseTrip> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tripsGetMyTripByIdValidateBeforeCall(tripId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseTrip>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tripsGetMyTrips
     * @param startDate  (required)
     * @param endDate  (required)
     * @param skip  (required)
     * @param take  (required)
     * @param vehicleId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tripsGetMyTripsCall(OffsetDateTime startDate, OffsetDateTime endDate, Integer skip, Integer take, Integer vehicleId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Trips/GetMyTrips";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("StartDate", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("EndDate", endDate));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Skip", skip));
        if (take != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Take", take));
        if (vehicleId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("VehicleId", vehicleId));

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
    private com.squareup.okhttp.Call tripsGetMyTripsValidateBeforeCall(OffsetDateTime startDate, OffsetDateTime endDate, Integer skip, Integer take, Integer vehicleId, String xChronosheetsAuth, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling tripsGetMyTrips(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling tripsGetMyTrips(Async)");
        }
        
        // verify the required parameter 'skip' is set
        if (skip == null) {
            throw new ApiException("Missing the required parameter 'skip' when calling tripsGetMyTrips(Async)");
        }
        
        // verify the required parameter 'take' is set
        if (take == null) {
            throw new ApiException("Missing the required parameter 'take' when calling tripsGetMyTrips(Async)");
        }
        
        // verify the required parameter 'vehicleId' is set
        if (vehicleId == null) {
            throw new ApiException("Missing the required parameter 'vehicleId' when calling tripsGetMyTrips(Async)");
        }
        
        // verify the required parameter 'xChronosheetsAuth' is set
        if (xChronosheetsAuth == null) {
            throw new ApiException("Missing the required parameter 'xChronosheetsAuth' when calling tripsGetMyTrips(Async)");
        }
        

        com.squareup.okhttp.Call call = tripsGetMyTripsCall(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get my trips
     * 
     * @param startDate  (required)
     * @param endDate  (required)
     * @param skip  (required)
     * @param take  (required)
     * @param vehicleId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return CsApiApiResponseForPaginatedListTrip
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CsApiApiResponseForPaginatedListTrip tripsGetMyTrips(OffsetDateTime startDate, OffsetDateTime endDate, Integer skip, Integer take, Integer vehicleId, String xChronosheetsAuth) throws ApiException {
        ApiResponse<CsApiApiResponseForPaginatedListTrip> resp = tripsGetMyTripsWithHttpInfo(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth);
        return resp.getData();
    }

    /**
     * Get my trips
     * 
     * @param startDate  (required)
     * @param endDate  (required)
     * @param skip  (required)
     * @param take  (required)
     * @param vehicleId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @return ApiResponse&lt;CsApiApiResponseForPaginatedListTrip&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CsApiApiResponseForPaginatedListTrip> tripsGetMyTripsWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate, Integer skip, Integer take, Integer vehicleId, String xChronosheetsAuth) throws ApiException {
        com.squareup.okhttp.Call call = tripsGetMyTripsValidateBeforeCall(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth, null, null);
        Type localVarReturnType = new TypeToken<CsApiApiResponseForPaginatedListTrip>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get my trips (asynchronously)
     * 
     * @param startDate  (required)
     * @param endDate  (required)
     * @param skip  (required)
     * @param take  (required)
     * @param vehicleId  (required)
     * @param xChronosheetsAuth The ChronoSheets Auth Token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tripsGetMyTripsAsync(OffsetDateTime startDate, OffsetDateTime endDate, Integer skip, Integer take, Integer vehicleId, String xChronosheetsAuth, final ApiCallback<CsApiApiResponseForPaginatedListTrip> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tripsGetMyTripsValidateBeforeCall(startDate, endDate, skip, take, vehicleId, xChronosheetsAuth, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CsApiApiResponseForPaginatedListTrip>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
