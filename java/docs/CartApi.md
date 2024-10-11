# CartApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cartDrawer**](CartApi.md#cartDrawer) | **POST** /{apiKey}/cartDrawer/visit | Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for

<a name="cartDrawer"></a>
# **cartDrawer**
> Flockr cartDrawer(body, apiKey, flockrDemo, flockrFakeData, transparent)

Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for

Returns a list of Social Proof values for the products provided 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CartApi;


CartApi apiInstance = new CartApi();
ListOnly body = new ListOnly(); // ListOnly | An array of product IDs or altIds
String apiKey = "apiKey_example"; // String | your api key
String flockrDemo = "flockrDemo_example"; // String | append this parameter with the value \"true\" to return demo data for testing
String flockrFakeData = "flockrFakeData_example"; // String | append this value to return demo data of a specific proof type
Boolean transparent = true; // Boolean | if supplied as well as an image url, will define whether a transparent based image url is returned for the image with social proof applied
try {
    Flockr result = apiInstance.cartDrawer(body, apiKey, flockrDemo, flockrFakeData, transparent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartDrawer");
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
 **transparent** | **Boolean**| if supplied as well as an image url, will define whether a transparent based image url is returned for the image with social proof applied | [optional]

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

