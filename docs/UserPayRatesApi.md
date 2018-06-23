# UserPayRatesApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userPayRatesCreatePayRate**](UserPayRatesApi.md#userPayRatesCreatePayRate) | **PUT** /api/UserPayRates/CreatePayRate | Create a new pay rate for a particular user, archiving the previous pay rate
[**userPayRatesGetPayRates**](UserPayRatesApi.md#userPayRatesGetPayRates) | **GET** /api/UserPayRates/GetPayRates | Get a collection of pay rates for a particular user, specified by user id


<a name="userPayRatesCreatePayRate"></a>
# **userPayRatesCreatePayRate**
> CsApiApiResponseInt32 userPayRatesCreatePayRate(request, xChronosheetsAuth)

Create a new pay rate for a particular user, archiving the previous pay rate

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserPayRatesApi;


UserPayRatesApi apiInstance = new UserPayRatesApi();
CsApiInsertUserHourlyRateRequest request = new CsApiInsertUserHourlyRateRequest(); // CsApiInsertUserHourlyRateRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseInt32 result = apiInstance.userPayRatesCreatePayRate(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPayRatesApi#userPayRatesCreatePayRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiInsertUserHourlyRateRequest**](CsApiInsertUserHourlyRateRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseInt32**](CsApiApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="userPayRatesGetPayRates"></a>
# **userPayRatesGetPayRates**
> CsApiApiResponseListUserHourlyRate userPayRatesGetPayRates(userId, xChronosheetsAuth)

Get a collection of pay rates for a particular user, specified by user id

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.UserPayRatesApi;


UserPayRatesApi apiInstance = new UserPayRatesApi();
Integer userId = 56; // Integer | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseListUserHourlyRate result = apiInstance.userPayRatesGetPayRates(userId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserPayRatesApi#userPayRatesGetPayRates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseListUserHourlyRate**](CsApiApiResponseListUserHourlyRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data
