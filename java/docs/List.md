# List

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | The category of the products - should not be an empty string | 
**products** | **List&lt;String&gt;** | An array of product IDs, also accepts an array of altIds, e.g. [{altId:\&quot;abcdefg\&quot;}] | 
**recommendations** | **List&lt;String&gt;** | Optional list of product IDs to fetch proof values for (can be requested on a dedicated call instead if required) |  [optional]
**images** | **Map&lt;String, String&gt;** | Anoptional map of productIds to image URL, if supplied Flockr will return an image URL for the social proof alon with the social proof values |  [optional]
