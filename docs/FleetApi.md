# FleetApi

All URIs are relative to *https://www.chronosheets.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fleetCreateVehicle**](FleetApi.md#fleetCreateVehicle) | **PUT** /api/Fleet/CreateVehicle | Create a vehicle
[**fleetGetVehicleById**](FleetApi.md#fleetGetVehicleById) | **GET** /api/Fleet/GetVehicleById | Get a particular vehicle
[**fleetGetVehicles**](FleetApi.md#fleetGetVehicles) | **GET** /api/Fleet/GetVehicles | Get a collection of vehicles that are under your organisation
[**fleetUpdateVehicle**](FleetApi.md#fleetUpdateVehicle) | **POST** /api/Fleet/UpdateVehicle | Update a vehicle


<a name="fleetCreateVehicle"></a>
# **fleetCreateVehicle**
> CsApiApiResponseInt32 fleetCreateVehicle(request, xChronosheetsAuth)

Create a vehicle

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
CsApiInsertVehicleRequest request = new CsApiInsertVehicleRequest(); // CsApiInsertVehicleRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseInt32 result = apiInstance.fleetCreateVehicle(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetCreateVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiInsertVehicleRequest**](CsApiInsertVehicleRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseInt32**](CsApiApiResponseInt32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetGetVehicleById"></a>
# **fleetGetVehicleById**
> CsApiApiResponseFleetVehicle fleetGetVehicleById(vehicleId, xChronosheetsAuth)

Get a particular vehicle

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
Integer vehicleId = 56; // Integer | The ID of the vehicle you want to get
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseFleetVehicle result = apiInstance.fleetGetVehicleById(vehicleId, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicleById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **Integer**| The ID of the vehicle you want to get |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseFleetVehicle**](CsApiApiResponseFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetGetVehicles"></a>
# **fleetGetVehicles**
> CsApiApiResponseListFleetVehicle fleetGetVehicles(includeDeleted, xChronosheetsAuth)

Get a collection of vehicles that are under your organisation

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
Boolean includeDeleted = true; // Boolean | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseListFleetVehicle result = apiInstance.fleetGetVehicles(includeDeleted, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetGetVehicles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeDeleted** | **Boolean**|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseListFleetVehicle**](CsApiApiResponseListFleetVehicle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data

<a name="fleetUpdateVehicle"></a>
# **fleetUpdateVehicle**
> CsApiApiResponseBoolean fleetUpdateVehicle(request, xChronosheetsAuth)

Update a vehicle

### Example
```java
// Import classes:
//import ChronoSheetsClient.ApiException;
//import ChronoSheetsClientLibApi.FleetApi;


FleetApi apiInstance = new FleetApi();
CsApiSaveVehicleRequest request = new CsApiSaveVehicleRequest(); // CsApiSaveVehicleRequest | 
String xChronosheetsAuth = "xChronosheetsAuth_example"; // String | The ChronoSheets Auth Token
try {
    CsApiApiResponseBoolean result = apiInstance.fleetUpdateVehicle(request, xChronosheetsAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FleetApi#fleetUpdateVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CsApiSaveVehicleRequest**](CsApiSaveVehicleRequest.md)|  |
 **xChronosheetsAuth** | **String**| The ChronoSheets Auth Token |

### Return type

[**CsApiApiResponseBoolean**](CsApiApiResponseBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml, multipart/form-data
