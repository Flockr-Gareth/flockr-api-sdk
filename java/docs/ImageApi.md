# ImageApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**image**](ImageApi.md#image) | **GET** /{apiKey}/image | returns an image containing the social proof for the product, Note use https://flockr-cdn.com as the host in production

<a name="image"></a>
# **image**
> File image(apiKey, image, productId, visitorId, sessionId, host, location, transparent)

returns an image containing the social proof for the product, Note use https://flockr-cdn.com as the host in production

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ImageApi;


ImageApi apiInstance = new ImageApi();
String apiKey = "apiKey_example"; // String | your api key
String image = "image_example"; // String | URL Encoded path to the image to add/overlay social proof messages
String productId = "productId_example"; // String | the unique ID of the product, must be the same ID as used in product visit
String visitorId = "visitorId_example"; // String | A unique id for the visitor
String sessionId = "sessionId_example"; // String | A unique id for the session
String host = "host_example"; // String | The host name or ip address
String location = "location_example"; // String | the location of the messages in the site/app, e.g. \"PLP\", \"PDP\", \"cart\" etc.
Boolean transparent = true; // Boolean | If transparent is false (default), returns the input image with the social proof ovelayed, if no social proof values exist for the product a 301 redirect is returned. If transparent is true, returns a transparent image to the size of the input image with the social proof message, if no social proof values for the given product a 1x1px transparent image is returned.
try {
    File result = apiInstance.image(apiKey, image, productId, visitorId, sessionId, host, location, transparent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#image");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| your api key |
 **image** | **String**| URL Encoded path to the image to add/overlay social proof messages |
 **productId** | **String**| the unique ID of the product, must be the same ID as used in product visit |
 **visitorId** | **String**| A unique id for the visitor |
 **sessionId** | **String**| A unique id for the session |
 **host** | **String**| The host name or ip address | [optional]
 **location** | **String**| the location of the messages in the site/app, e.g. \&quot;PLP\&quot;, \&quot;PDP\&quot;, \&quot;cart\&quot; etc. | [optional]
 **transparent** | **Boolean**| If transparent is false (default), returns the input image with the social proof ovelayed, if no social proof values exist for the product a 301 redirect is returned. If transparent is true, returns a transparent image to the size of the input image with the social proof message, if no social proof values for the given product a 1x1px transparent image is returned. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/webp

