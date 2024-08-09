# FlockrSocialProofApi.Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** |  | [optional] 
**code** | **String** |  | [optional] 
**message** | **String** |  | [optional] 
**raw** | [**MessageRaw**](MessageRaw.md) |  | [optional] 
**time** | **String** | an enum value or an integer representing the number of hours since last visit (for SLVA, SLVB, SLVP) | [optional] 

<a name="CategoryEnum"></a>
## Enum: CategoryEnum

* `BASKET` (value: `"BASKET"`)
* `LAST_ORDER_ELAPSED_TIME` (value: `"LAST_ORDER_ELAPSED_TIME"`)
* `AUDIENCE` (value: `"AUDIENCE"`)
* `QUANTITY_ORDERS` (value: `"QUANTITY_ORDERS"`)
* `RATING` (value: `"RATING"`)


<a name="CodeEnum"></a>
## Enum: CodeEnum

* `TS` (value: `"TS"`)
* `QPH` (value: `"QPH"`)
* `LPMS` (value: `"LPMS"`)
* `LPSP` (value: `"LPSP"`)
* `SLVP` (value: `"SLVP"`)
* `ATB` (value: `"ATB"`)
* `SLVB` (value: `"SLVB"`)
* `CAP` (value: `"CAP"`)
* `SLVA` (value: `"SLVA"`)
* `PRV` (value: `"PRV"`)
* `SZ` (value: `"SZ"`)


<a name="TimeEnum"></a>
## Enum: TimeEnum

* `nowViewCount` (value: `"now_view_count"`)
* `nowAtbCount` (value: `"now_atb_count"`)
* `nowPurchaseCount` (value: `"now_purchase_count"`)
* `nowPurchaseSampleCount` (value: `"now_purchase_sample_count"`)
* `recentAtbCount` (value: `"recent_atb_count"`)
* `recentViewCount` (value: `"recent_view_count"`)
* `recentPurchaseCount` (value: `"recent_purchase_count"`)
* `recentPurchaseSampleCount` (value: `"recent_purchase_sample_count"`)
* `hour1ViewCount` (value: `"hour1_view_count"`)
* `hour1AtbCount` (value: `"hour1_atb_count"`)
* `hour1PurchaseCount` (value: `"hour1_purchase_count"`)
* `hour1PurchaseSampleCount` (value: `"hour1_purchase_sample_count"`)
* `hour3ViewCount` (value: `"hour3_view_count"`)
* `hour3AtbCount` (value: `"hour3_atb_count"`)
* `hour3PurchaseCount` (value: `"hour3_purchase_count"`)
* `hour3PurchaseSampleCount` (value: `"hour3_purchase_sample_count"`)
* `hour12ViewCount` (value: `"hour12_view_count"`)
* `hour12AtbCount` (value: `"hour12_atb_count"`)
* `hour12PurchaseCount` (value: `"hour12_purchase_count"`)
* `hour12PurchaseSampleCount` (value: `"hour12_purchase_sample_count"`)
* `hour24ViewCount` (value: `"hour24_view_count"`)
* `hour24AtbCount` (value: `"hour24_atb_count"`)
* `hour24PurchaseCount` (value: `"hour24_purchase_count"`)
* `hour24PurchaseSampleCount` (value: `"hour24_purchase_sample_count"`)
* `hour48ViewCount` (value: `"hour48_view_count"`)
* `hour48AtbCount` (value: `"hour48_atb_count"`)
* `hour48PurchaseCount` (value: `"hour48_purchase_count"`)
* `hour48PurchaseSampleCount` (value: `"hour48_purchase_sample_count"`)
* `hour120ViewCount` (value: `"hour120_view_count"`)
* `hour120AtbCount` (value: `"hour120_atb_count"`)
* `hour120PurchaseCount` (value: `"hour120_purchase_count"`)
* `hour120PurchaseSampleCount` (value: `"hour120_purchase_sample_count"`)
* `hour168ViewCount` (value: `"hour168_view_count"`)
* `hour168AtbCount` (value: `"hour168_atb_count"`)
* `hour168PurchaseCount` (value: `"hour168_purchase_count"`)
* `hour168PurchaseSampleCount` (value: `"hour168_purchase_sample_count"`)

