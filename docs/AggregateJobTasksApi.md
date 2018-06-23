# AggregateJobTasksApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateJobTasksGetAggregateJobTasks**](AggregateJobTasksApi.md#aggregateJobTasksGetAggregateJobTasks) | **GET** /api/AggregateJobTasks/GetAggregateJobTasks | Get jobs and tasks information, aggregated


<a name="aggregateJobTasksGetAggregateJobTasks"></a>
# **aggregateJobTasksGetAggregateJobTasks**
> CsApiApiResponseListAggregateJobCode aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth)

Get jobs and tasks information, aggregated

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.AggregateJobTasksApi;


AggregateJobTasksApi apiInstance = new AggregateJobTasksApi();
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseListAggregateJobCode result = apiInstance.aggregateJobTasksGetAggregateJobTasks(xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AggregateJobTasksApi#aggregateJobTasksGetAggregateJobTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseListAggregateJobCode**](CsApiApiResponseListAggregateJobCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data
