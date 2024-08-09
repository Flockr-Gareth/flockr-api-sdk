# FlockrSocialProofApi.CustomerEventApi

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
```javascript
import {FlockrSocialProofApi} from 'flockr_social_proof_api';

let apiInstance = new FlockrSocialProofApi.CustomerEventApi();
let body = new FlockrSocialProofApi.Event(); // Event | Details of the event
let apiKey = "apiKey_example"; // String | your api key

apiInstance.event(body, apiKey, (error, data, response) => {
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
 **body** | [**Event**](Event.md)| Details of the event | 
 **apiKey** | **String**| your api key | 

### Return type

[**Flockr**](Flockr.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

