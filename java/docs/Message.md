# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional]
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**message** | **String** |  |  [optional]
**raw** | [**MessageRaw**](MessageRaw.md) |  |  [optional]
**time** | [**TimeEnum**](#TimeEnum) | an enum value or an integer representing the number of hours since last visit (for SLVA, SLVB, SLVP) |  [optional]

<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
BASKET | &quot;BASKET&quot;
LAST_ORDER_ELAPSED_TIME | &quot;LAST_ORDER_ELAPSED_TIME&quot;
AUDIENCE | &quot;AUDIENCE&quot;
QUANTITY_ORDERS | &quot;QUANTITY_ORDERS&quot;
RATING | &quot;RATING&quot;

<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
TS | &quot;TS&quot;
QPH | &quot;QPH&quot;
LPMS | &quot;LPMS&quot;
LPSP | &quot;LPSP&quot;
SLVP | &quot;SLVP&quot;
ATB | &quot;ATB&quot;
SLVB | &quot;SLVB&quot;
CAP | &quot;CAP&quot;
SLVA | &quot;SLVA&quot;
PRV | &quot;PRV&quot;
SZ | &quot;SZ&quot;

<a name="TimeEnum"></a>
## Enum: TimeEnum
Name | Value
---- | -----
NOW_VIEW_COUNT | &quot;now_view_count&quot;
NOW_ATB_COUNT | &quot;now_atb_count&quot;
NOW_PURCHASE_COUNT | &quot;now_purchase_count&quot;
NOW_PURCHASE_SAMPLE_COUNT | &quot;now_purchase_sample_count&quot;
RECENT_ATB_COUNT | &quot;recent_atb_count&quot;
RECENT_VIEW_COUNT | &quot;recent_view_count&quot;
RECENT_PURCHASE_COUNT | &quot;recent_purchase_count&quot;
RECENT_PURCHASE_SAMPLE_COUNT | &quot;recent_purchase_sample_count&quot;
HOUR1_VIEW_COUNT | &quot;hour1_view_count&quot;
HOUR1_ATB_COUNT | &quot;hour1_atb_count&quot;
HOUR1_PURCHASE_COUNT | &quot;hour1_purchase_count&quot;
HOUR1_PURCHASE_SAMPLE_COUNT | &quot;hour1_purchase_sample_count&quot;
HOUR3_VIEW_COUNT | &quot;hour3_view_count&quot;
HOUR3_ATB_COUNT | &quot;hour3_atb_count&quot;
HOUR3_PURCHASE_COUNT | &quot;hour3_purchase_count&quot;
HOUR3_PURCHASE_SAMPLE_COUNT | &quot;hour3_purchase_sample_count&quot;
HOUR12_VIEW_COUNT | &quot;hour12_view_count&quot;
HOUR12_ATB_COUNT | &quot;hour12_atb_count&quot;
HOUR12_PURCHASE_COUNT | &quot;hour12_purchase_count&quot;
HOUR12_PURCHASE_SAMPLE_COUNT | &quot;hour12_purchase_sample_count&quot;
HOUR24_VIEW_COUNT | &quot;hour24_view_count&quot;
HOUR24_ATB_COUNT | &quot;hour24_atb_count&quot;
HOUR24_PURCHASE_COUNT | &quot;hour24_purchase_count&quot;
HOUR24_PURCHASE_SAMPLE_COUNT | &quot;hour24_purchase_sample_count&quot;
HOUR48_VIEW_COUNT | &quot;hour48_view_count&quot;
HOUR48_ATB_COUNT | &quot;hour48_atb_count&quot;
HOUR48_PURCHASE_COUNT | &quot;hour48_purchase_count&quot;
HOUR48_PURCHASE_SAMPLE_COUNT | &quot;hour48_purchase_sample_count&quot;
HOUR120_VIEW_COUNT | &quot;hour120_view_count&quot;
HOUR120_ATB_COUNT | &quot;hour120_atb_count&quot;
HOUR120_PURCHASE_COUNT | &quot;hour120_purchase_count&quot;
HOUR120_PURCHASE_SAMPLE_COUNT | &quot;hour120_purchase_sample_count&quot;
HOUR168_VIEW_COUNT | &quot;hour168_view_count&quot;
HOUR168_ATB_COUNT | &quot;hour168_atb_count&quot;
HOUR168_PURCHASE_COUNT | &quot;hour168_purchase_count&quot;
HOUR168_PURCHASE_SAMPLE_COUNT | &quot;hour168_purchase_sample_count&quot;
