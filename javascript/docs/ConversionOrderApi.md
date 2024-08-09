# FlockrSocialProofApi.ConversionOrderApi

All URIs are relative to *https://api.cdn.flockr.co/api/v2/key*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order**](ConversionOrderApi.md#order) | **POST** /{apiKey}/conversion/order | saves a product order and returns social proof

<a name="order"></a>
# **order**
> Flockr order(body, apiKey, opts)

saves a product order and returns social proof

By passing the details of an order, the social proof for those products are updated, a product visit is counted once per session. The social proof for that product is returned 

### Example
```javascript
import {FlockrSocialProofApi} from 'flockr_social_proof_api';

let apiInstance = new FlockrSocialProofApi.ConversionOrderApi();
let body = new FlockrSocialProofApi.Order(); // Order | Details of the product visit
let apiKey = "apiKey_example"; // String | your api key
let opts = { 
  'flockrDemo': "flockrDemo_example", // String | append this parameter with the value \"true\" to return demo data for testing
  'flockrFakeData': "flockrFakeData_example" // String | append this value to return demo data of a specific proof type
};
apiInstance.order(body, apiKey, opts, (error, data, response) => {
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
 **body** | [**Order**](Order.md)| Details of the product visit | 
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

