/*
 * Flockr Social Proof API
 * API for sending product user actions and retrieving social proof
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@flockr.co
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Flockr;
import io.swagger.client.model.ListOnly;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRecommendationsApi {
    private ApiClient apiClient;

    public ProductRecommendationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductRecommendationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for productRecommendations
     * @param body An array of product IDs or altIds (required)
     * @param apiKey your api key (required)
     * @param flockrDemo append this parameter with the value \&quot;true\&quot; to return demo data for testing (optional)
     * @param flockrFakeData append this value to return demo data of a specific proof type (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productRecommendationsCall(ListOnly body, String apiKey, String flockrDemo, String flockrFakeData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/{apiKey}/productRecommendations/visit"
            .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (flockrDemo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("flockrDemo", flockrDemo));
        if (flockrFakeData != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("flockrFakeData", flockrFakeData));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productRecommendationsValidateBeforeCall(ListOnly body, String apiKey, String flockrDemo, String flockrFakeData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling productRecommendations(Async)");
        }
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling productRecommendations(Async)");
        }
        
        com.squareup.okhttp.Call call = productRecommendationsCall(body, apiKey, flockrDemo, flockrFakeData, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for
     * Returns a list of Social Proof values for the products provided 
     * @param body An array of product IDs or altIds (required)
     * @param apiKey your api key (required)
     * @param flockrDemo append this parameter with the value \&quot;true\&quot; to return demo data for testing (optional)
     * @param flockrFakeData append this value to return demo data of a specific proof type (optional)
     * @return Flockr
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Flockr productRecommendations(ListOnly body, String apiKey, String flockrDemo, String flockrFakeData) throws ApiException {
        ApiResponse<Flockr> resp = productRecommendationsWithHttpInfo(body, apiKey, flockrDemo, flockrFakeData);
        return resp.getData();
    }

    /**
     * Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for
     * Returns a list of Social Proof values for the products provided 
     * @param body An array of product IDs or altIds (required)
     * @param apiKey your api key (required)
     * @param flockrDemo append this parameter with the value \&quot;true\&quot; to return demo data for testing (optional)
     * @param flockrFakeData append this value to return demo data of a specific proof type (optional)
     * @return ApiResponse&lt;Flockr&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Flockr> productRecommendationsWithHttpInfo(ListOnly body, String apiKey, String flockrDemo, String flockrFakeData) throws ApiException {
        com.squareup.okhttp.Call call = productRecommendationsValidateBeforeCall(body, apiKey, flockrDemo, flockrFakeData, null, null);
        Type localVarReturnType = new TypeToken<Flockr>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for (asynchronously)
     * Returns a list of Social Proof values for the products provided 
     * @param body An array of product IDs or altIds (required)
     * @param apiKey your api key (required)
     * @param flockrDemo append this parameter with the value \&quot;true\&quot; to return demo data for testing (optional)
     * @param flockrFakeData append this value to return demo data of a specific proof type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productRecommendationsAsync(ListOnly body, String apiKey, String flockrDemo, String flockrFakeData, final ApiCallback<Flockr> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = productRecommendationsValidateBeforeCall(body, apiKey, flockrDemo, flockrFakeData, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Flockr>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
