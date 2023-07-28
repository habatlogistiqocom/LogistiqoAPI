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


import io.swagger.client.model.Manifest;
import io.swagger.client.model.ResponseStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManifestApi {
    private ApiClient apiClient;

    public ManifestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManifestApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postManifest
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postManifestCall(Manifest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/logistiqo/rest/manifest/json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postManifestValidateBeforeCall(Manifest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postManifest(Async)");
        }
        
        com.squareup.okhttp.Call call = postManifestCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * postManifestEndpoint
     *  # Manifest     This API provides a comprehensive set of functionalities to export unplanned, planned, and optimized tours or bundles of shipments, regardless of whether they are transported by your own vehicles or contractors.   While importing shipments may be your primary objective, it is crucial to bundle them within a manifest. To prevent the creation of manifests, simply set the &#x27;createManifest&#x27; field to false. It is also important to use a unique reference for each manifest to ensure data integrity within the system.    Moreover, this API empowers you to effortlessly create Master and House Air Waybills (MAWB and HAWB). You can leverage the manifest fields for the MAWB and the shipment fields for the HAWB. By designating the manifest as a MAWB, you establish a seamless link between the shipment and the MAWB. Similarly, including a HAWB within the shipment establishes a clear connection between the shipment and the HAWB. In the event that either the MAWB or the HAWB does not exist, this API will automatically generate both to maintain consistency.    With these powerful capabilities, this API simplifies and enhances the management of shipments, manifests, and Air Waybills, ensuring efficient and accurate logistics operations.     
     * @param body  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postManifest(Manifest body) throws ApiException {
        postManifestWithHttpInfo(body);
    }

    /**
     * postManifestEndpoint
     *  # Manifest     This API provides a comprehensive set of functionalities to export unplanned, planned, and optimized tours or bundles of shipments, regardless of whether they are transported by your own vehicles or contractors.   While importing shipments may be your primary objective, it is crucial to bundle them within a manifest. To prevent the creation of manifests, simply set the &#x27;createManifest&#x27; field to false. It is also important to use a unique reference for each manifest to ensure data integrity within the system.    Moreover, this API empowers you to effortlessly create Master and House Air Waybills (MAWB and HAWB). You can leverage the manifest fields for the MAWB and the shipment fields for the HAWB. By designating the manifest as a MAWB, you establish a seamless link between the shipment and the MAWB. Similarly, including a HAWB within the shipment establishes a clear connection between the shipment and the HAWB. In the event that either the MAWB or the HAWB does not exist, this API will automatically generate both to maintain consistency.    With these powerful capabilities, this API simplifies and enhances the management of shipments, manifests, and Air Waybills, ensuring efficient and accurate logistics operations.     
     * @param body  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postManifestWithHttpInfo(Manifest body) throws ApiException {
        com.squareup.okhttp.Call call = postManifestValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * postManifestEndpoint (asynchronously)
     *  # Manifest     This API provides a comprehensive set of functionalities to export unplanned, planned, and optimized tours or bundles of shipments, regardless of whether they are transported by your own vehicles or contractors.   While importing shipments may be your primary objective, it is crucial to bundle them within a manifest. To prevent the creation of manifests, simply set the &#x27;createManifest&#x27; field to false. It is also important to use a unique reference for each manifest to ensure data integrity within the system.    Moreover, this API empowers you to effortlessly create Master and House Air Waybills (MAWB and HAWB). You can leverage the manifest fields for the MAWB and the shipment fields for the HAWB. By designating the manifest as a MAWB, you establish a seamless link between the shipment and the MAWB. Similarly, including a HAWB within the shipment establishes a clear connection between the shipment and the HAWB. In the event that either the MAWB or the HAWB does not exist, this API will automatically generate both to maintain consistency.    With these powerful capabilities, this API simplifies and enhances the management of shipments, manifests, and Air Waybills, ensuring efficient and accurate logistics operations.     
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postManifestAsync(Manifest body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postManifestValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
