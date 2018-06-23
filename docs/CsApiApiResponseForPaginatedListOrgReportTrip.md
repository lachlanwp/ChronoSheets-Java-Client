
# CsApiApiResponseForPaginatedListOrgReportTrip

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalSetCount** | **Integer** |  |  [optional]
**data** | [**List&lt;CsApiOrgReportTrip&gt;**](CsApiOrgReportTrip.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**message** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCEEDED | &quot;Succeeded&quot;
FATALEXCEPTION | &quot;FatalException&quot;
GENERALERROR | &quot;GeneralError&quot;
VALIDATIONERROR | &quot;ValidationError&quot;
UNAUTHORIZED | &quot;UnAuthorized&quot;
SESSIONEXPIRED | &quot;SessionExpired&quot;


