# ConversionOrderApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order**](ConversionOrderApi.md#order) | **POST** /{apiKey}/conversion/order | saves a product order and returns social proof

<a name="order"></a>
# **order**
> Flockr order(body, apiKey, flockrDemo, flockrFakeData)

saves a product order and returns social proof

By passing the details of an order, the social proof for those products are updated, a product visit is counted once per session. The social proof for that product is returned 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConversionOrderApi;


ConversionOrderApi apiInstance = new ConversionOrderApi();
Order body = new Order(); // Order | Details of the product visit
String apiKey = "apiKey_example"; // String | your api key
String flockrDemo = "flockrDemo_example"; // String | append this parameter with the value \"true\" to return demo data for testing
String flockrFakeData = "flockrFakeData_example"; // String | append this value to return demo data of a specific proof type
try {
    Flockr result = apiInstance.order(body, apiKey, flockrDemo, flockrFakeData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversionOrderApi#order");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Details of the product visit |
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

