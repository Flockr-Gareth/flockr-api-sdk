# FlockrSocialProofApi.ProductDetailsApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productVisit**](ProductDetailsApi.md#productVisit) | **POST** /{apiKey}/product/visit | saves a product visit and returns social proof

<a name="productVisit"></a>
# **productVisit**
> Flockr productVisit(body, apiKey, opts)

saves a product visit and returns social proof

By passing the details of a product visit, the social proof for that product is updagted, a product visit is counted once per session. The social proof for that product is returned 

### Example
```javascript
import {FlockrSocialProofApi} from 'flockr_social_proof_api';

let apiInstance = new FlockrSocialProofApi.ProductDetailsApi();
let body = new FlockrSocialProofApi.Product(); // Product | Details of the product visit
let apiKey = "apiKey_example"; // String | your api key
let opts = { 
  'flockrDemo': "flockrDemo_example", // String | append this parameter with the value \"true\" to return demo data for testing
  'flockrFakeData': "flockrFakeData_example", // String | append this value to return demo data of a specific proof type
  'transparent': true // Boolean | if supplied as well as an image url, will define whether a transparent based image url is returned for the image with social proof applied
};
apiInstance.productVisit(body, apiKey, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Product**](Product.md)| Details of the product visit | 
 **apiKey** | **String**| your api key | 
 **flockrDemo** | **String**| append this parameter with the value \&quot;true\&quot; to return demo data for testing | [optional] 
 **flockrFakeData** | **String**| append this value to return demo data of a specific proof type | [optional] 
 **transparent** | **Boolean**| if supplied as well as an image url, will define whether a transparent based image url is returned for the image with social proof applied | [optional] 

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

