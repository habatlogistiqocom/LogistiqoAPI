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


import io.swagger.client.model.Invoice;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceApi {
    private ApiClient apiClient;

    public InvoiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInvoice
     * @param month select invoices by month  (optional)
     * @param year select invoices by year  (optional)
     * @param date select invoices by date (optional)
     * @param number select invoices by number (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInvoiceCall(String month, String year, String date, String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/logistiqo/rest/api/v-1/invoice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (month != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("month", month));
        if (year != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("year", year));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
        if (number != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("number", number));

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
    private com.squareup.okhttp.Call getInvoiceValidateBeforeCall(String month, String year, String date, String number, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getInvoiceCall(month, year, date, number, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * From this endpoint, you can retrieve a list of invoices. The endpoint allows you to filter invoices based on different criteria such as month, year, date, or invoice number.
     *  #Invoice 
     * @param month select invoices by month  (optional)
     * @param year select invoices by year  (optional)
     * @param date select invoices by date (optional)
     * @param number select invoices by number (optional)
     * @return List&lt;Invoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Invoice> getInvoice(String month, String year, String date, String number) throws ApiException {
        ApiResponse<List<Invoice>> resp = getInvoiceWithHttpInfo(month, year, date, number);
        return resp.getData();
    }

    /**
     * From this endpoint, you can retrieve a list of invoices. The endpoint allows you to filter invoices based on different criteria such as month, year, date, or invoice number.
     *  #Invoice 
     * @param month select invoices by month  (optional)
     * @param year select invoices by year  (optional)
     * @param date select invoices by date (optional)
     * @param number select invoices by number (optional)
     * @return ApiResponse&lt;List&lt;Invoice&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Invoice>> getInvoiceWithHttpInfo(String month, String year, String date, String number) throws ApiException {
        com.squareup.okhttp.Call call = getInvoiceValidateBeforeCall(month, year, date, number, null, null);
        Type localVarReturnType = new TypeToken<List<Invoice>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * From this endpoint, you can retrieve a list of invoices. The endpoint allows you to filter invoices based on different criteria such as month, year, date, or invoice number. (asynchronously)
     *  #Invoice 
     * @param month select invoices by month  (optional)
     * @param year select invoices by year  (optional)
     * @param date select invoices by date (optional)
     * @param number select invoices by number (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInvoiceAsync(String month, String year, String date, String number, final ApiCallback<List<Invoice>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInvoiceValidateBeforeCall(month, year, date, number, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Invoice>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
