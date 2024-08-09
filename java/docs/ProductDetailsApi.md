# ProductDetailsApi

All URIs are relative to *https://api.cdn.flockr.co/api/v2/key*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productVisit**](ProductDetailsApi.md#productVisit) | **POST** /{apiKey}/product/visit | saves a product visit and returns social proof

<a name="productVisit"></a>
# **productVisit**
> Flockr productVisit(body, apiKey, flockrDemo, flockrFakeData)

saves a product visit and returns social proof

By passing the details of a product visit, the social proof for that product is updagted, a product visit is counted once per session. The social proof for that product is returned 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductDetailsApi;


ProductDetailsApi apiInstance = new ProductDetailsApi();
Product body = new Product(); // Product | Details of the product visit
String apiKey = "apiKey_example"; // String | your api key
String flockrDemo = "flockrDemo_example"; // String | append this parameter with the value \"true\" to return demo data for testing
String flockrFakeData = "flockrFakeData_example"; // String | append this value to return demo data of a specific proof type
try {
    Flockr result = apiInstance.productVisit(body, apiKey, flockrDemo, flockrFakeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductDetailsApi#productVisit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Product**](Product.md)| Details of the product visit |
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

