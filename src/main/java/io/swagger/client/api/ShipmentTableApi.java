/*
 * LogistiqoAPI
 *   - Go to [Swagger Editor](https://editor.swagger.io/?url=https://raw.githubusercontent.com/habatlogistiqocom/logistiqoSwaggerYaml/main/logistiqoSwaggerYaml.yaml)   An API, or Application Programming Interface, is a set of protocols,   routines, and tools that enable different software applications to   communicate and exchange data with each other. It defines how software   components should interact and helps to simplify software development by   abstracting the underlying implementation. APIs are essential for building   complex and interconnected software systems.       ## Contact Us     If you have problems or questions, please read the following information:     - [FAQ](https://www.logistiqo.com/faq/)    - [Contact us](https://www.logistiqo.com/contact.php)     To stay informed about the latest developments, you can     - Follow us on [Twitter](https://twitter.com/logistiqo/),
 *
 * OpenAPI spec version: 1.0
 * Contact: info@logistiqo.com
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


import io.swagger.client.model.ShipmentListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentTableApi {
    private ApiClient apiClient;

    public ShipmentTableApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentTableApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getShipmentList
     * @param shipment select one single shipment no, if not used all shipments will be returned (optional)
     * @param reference select one single customer reference, if not used all shipments will be returned (optional)
     * @param year filter on created in year use format yyyy (optional, default to 2023)
     * @param month filter on created in month, use format MM, can be combined with year (optional, default to 11)
     * @param createdOn filter on created on date, use format dd.MM.yyyy (optional)
     * @param modifiedOn filter on current date greater than modified on date, use format dd.MM.yyyy (optional)
     * @param statusModifiedOn filter on current date greater than status modified on date, use format dd.MM.yyyy (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShipmentListCall(String shipment, String reference, String year, String month, String createdOn, String modifiedOn, String statusModifiedOn, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/logistiqo/api/shipment-list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipment != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("shipment", shipment));
        if (reference != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reference", reference));
        if (year != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("year", year));
        if (month != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("month", month));
        if (createdOn != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdOn", createdOn));
        if (modifiedOn != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("modifiedOn", modifiedOn));
        if (statusModifiedOn != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("statusModifiedOn", statusModifiedOn));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getShipmentListValidateBeforeCall(String shipment, String reference, String year, String month, String createdOn, String modifiedOn, String statusModifiedOn, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getShipmentListCall(shipment, reference, year, month, createdOn, modifiedOn, statusModifiedOn, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * GetShipmentListEndpoint
     *  # Shipment 
     * @param shipment select one single shipment no, if not used all shipments will be returned (optional)
     * @param reference select one single customer reference, if not used all shipments will be returned (optional)
     * @param year filter on created in year use format yyyy (optional, default to 2023)
     * @param month filter on created in month, use format MM, can be combined with year (optional, default to 11)
     * @param createdOn filter on created on date, use format dd.MM.yyyy (optional)
     * @param modifiedOn filter on current date greater than modified on date, use format dd.MM.yyyy (optional)
     * @param statusModifiedOn filter on current date greater than status modified on date, use format dd.MM.yyyy (optional)
     * @return ShipmentListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShipmentListResponse getShipmentList(String shipment, String reference, String year, String month, String createdOn, String modifiedOn, String statusModifiedOn) throws ApiException {
        ApiResponse<ShipmentListResponse> resp = getShipmentListWithHttpInfo(shipment, reference, year, month, createdOn, modifiedOn, statusModifiedOn);
        return resp.getData();
    }

    /**
     * GetShipmentListEndpoint
     *  # Shipment 
     * @param shipment select one single shipment no, if not used all shipments will be returned (optional)
     * @param reference select one single customer reference, if not used all shipments will be returned (optional)
     * @param year filter on created in year use format yyyy (optional, default to 2023)
     * @param month filter on created in month, use format MM, can be combined with year (optional, default to 11)
     * @param createdOn filter on created on date, use format dd.MM.yyyy (optional)
     * @param modifiedOn filter on current date greater than modified on date, use format dd.MM.yyyy (optional)
     * @param statusModifiedOn filter on current date greater than status modified on date, use format dd.MM.yyyy (optional)
     * @return ApiResponse&lt;ShipmentListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShipmentListResponse> getShipmentListWithHttpInfo(String shipment, String reference, String year, String month, String createdOn, String modifiedOn, String statusModifiedOn) throws ApiException {
        com.squareup.okhttp.Call call = getShipmentListValidateBeforeCall(shipment, reference, year, month, createdOn, modifiedOn, statusModifiedOn, null, null);
        Type localVarReturnType = new TypeToken<ShipmentListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * GetShipmentListEndpoint (asynchronously)
     *  # Shipment 
     * @param shipment select one single shipment no, if not used all shipments will be returned (optional)
     * @param reference select one single customer reference, if not used all shipments will be returned (optional)
     * @param year filter on created in year use format yyyy (optional, default to 2023)
     * @param month filter on created in month, use format MM, can be combined with year (optional, default to 11)
     * @param createdOn filter on created on date, use format dd.MM.yyyy (optional)
     * @param modifiedOn filter on current date greater than modified on date, use format dd.MM.yyyy (optional)
     * @param statusModifiedOn filter on current date greater than status modified on date, use format dd.MM.yyyy (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShipmentListAsync(String shipment, String reference, String year, String month, String createdOn, String modifiedOn, String statusModifiedOn, final ApiCallback<ShipmentListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShipmentListValidateBeforeCall(shipment, reference, year, month, createdOn, modifiedOn, statusModifiedOn, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ShipmentListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
