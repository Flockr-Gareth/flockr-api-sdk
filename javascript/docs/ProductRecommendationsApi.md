# FlockrSocialProofApi.ProductRecommendationsApi

All URIs are relative to *https://virtserver.swaggerhub.com/Flockr_AI/Flockr/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productRecommendations**](ProductRecommendationsApi.md#productRecommendations) | **POST** /{apiKey}/productRecommendations/visit | Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for

<a name="productRecommendations"></a>
# **productRecommendations**
> Flockr productRecommendations(body, apiKey, opts)

Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for

Returns a list of Social Proof values for the products provided 

### Example
```javascript
import {FlockrSocialProofApi} from 'flockr_social_proof_api';

let apiInstance = new FlockrSocialProofApi.ProductRecommendationsApi();
let body = new FlockrSocialProofApi.ListOnly(); // ListOnly | An array of product IDs or altIds
let apiKey = "apiKey_example"; // String | your api key
let opts = { 
  'flockrDemo': "flockrDemo_example", // String | append this parameter with the value \"true\" to return demo data for testing
  'flockrFakeData': "flockrFakeData_example" // String | append this value to return demo data of a specific proof type
};
apiInstance.productRecommendations(body, apiKey, opts, (error, data, response) => {
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
 **body** | [**ListOnly**](ListOnly.md)| An array of product IDs or altIds | 
 **apiKey** | **String**| your api key | 
 **flockrDemo** | **String**| append this parameter with the value \&quot;true\&quot; to return demo data for testing | [optional] 
 **flockrFakeData** | **String**| append this value to return demo data of a specific proof type | [optional] 

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

