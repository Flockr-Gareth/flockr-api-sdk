# ListApi

All URIs are relative to *https://api.cdn.flockr.co/api/v2/key*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cartDrawer**](ListApi.md#cartDrawer) | **POST** /{apiKey}/cartDrawer/visit | Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for
[**samplesList**](ListApi.md#samplesList) | **POST** /{apiKey}/samplesList/visit | Fetches a set of proofs for the provided product IDs based on sample interactions, e.g, number of samples for a given product ordered. Flockr will decide which products to return proofs for

<a name="cartDrawer"></a>
# **cartDrawer**
> Flockr cartDrawer(body, apiKey, flockrDemo, flockrFakeData)

Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for

Returns a list of Social Proof values for the products provided 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
ListOnly body = new ListOnly(); // ListOnly | An array of product IDs or altIds
String apiKey = "apiKey_example"; // String | your api key
String flockrDemo = "flockrDemo_example"; // String | append this parameter with the value \"true\" to return demo data for testing
String flockrFakeData = "flockrFakeData_example"; // String | append this value to return demo data of a specific proof type
try {
    Flockr result = apiInstance.cartDrawer(body, apiKey, flockrDemo, flockrFakeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#cartDrawer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListOnly**](ListOnly.md)| An array of product IDs or altIds |
 **apiKey** | **String**| your api key |
 **flockrDemo** | **String**| append this parameter with the value \&quot;true\&quot; to return demo data for testing | [optional]
 **flockrFakeData** | **String**| append this value to return demo data of a specific proof type | [optional] [enum: TS, QPH, LPMS, LPSP, SLVP, ATB, SLVB, CAP, SLVA, PRV, SZ]

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="samplesList"></a>
# **samplesList**
> Flockr samplesList(body, apiKey, flockrDemo, flockrFakeData)

Fetches a set of proofs for the provided product IDs based on sample interactions, e.g, number of samples for a given product ordered. Flockr will decide which products to return proofs for

Returns a list of Social Proof values for the products provided 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListApi;


ListApi apiInstance = new ListApi();
ListOnly body = new ListOnly(); // ListOnly | An array of product IDs or altIds
String apiKey = "apiKey_example"; // String | your api key
String flockrDemo = "flockrDemo_example"; // String | append this parameter with the value \"true\" to return demo data for testing
String flockrFakeData = "flockrFakeData_example"; // String | append this value to return demo data of a specific proof type
try {
    Flockr result = apiInstance.samplesList(body, apiKey, flockrDemo, flockrFakeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListApi#samplesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListOnly**](ListOnly.md)| An array of product IDs or altIds |
 **apiKey** | **String**| your api key |
 **flockrDemo** | **String**| append this parameter with the value \&quot;true\&quot; to return demo data for testing | [optional]
 **flockrFakeData** | **String**| append this value to return demo data of a specific proof type | [optional] [enum: TS, QPH, LPMS, LPSP, SLVP, ATB, SLVB, CAP, SLVA, PRV, SZ]

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

