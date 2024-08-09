# CustomerEventApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**event**](CustomerEventApi.md#event) | **POST** /{apiKey}/event | Registers an event for the customer

<a name="event"></a>
# **event**
> Flockr event(body, apiKey)

Registers an event for the customer

By passing the details of event for a product, the social proof for that product is updated. The social proof for that product is returned 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEventApi;


CustomerEventApi apiInstance = new CustomerEventApi();
Event body = new Event(); // Event | Details of the event
String apiKey = "apiKey_example"; // String | your api key
try {
    Flockr result = apiInstance.event(body, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEventApi#event");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Event**](Event.md)| Details of the event |
 **apiKey** | **String**| your api key |

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

