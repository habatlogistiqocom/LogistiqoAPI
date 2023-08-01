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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T15:42:11.807009033Z[GMT]")

public class ResponseStatus {
  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  public ResponseStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * :&gt;- Status as in Response Header.
   * @return status
  **/
  @Schema(example = "200", description = ":>- Status as in Response Header.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ResponseStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * :&gt;- This field contains free text that provides information about the outcome of the import process. If the import is successful, it will describe the result of the process. However, in case of errors, it will provide details about the issues encountered. Common Errors - Missing Fields, Some required fields were not provided in the API request, which caused the import process to fail. - Incorrect Fields, The data provided for certain fields in the API request was not in the expected format or did not meet the validation requirements, resulting in an error during import.
   * @return message
  **/
  @Schema(example = "The Manifest 1234567 was created successfully", description = ":>- This field contains free text that provides information about the outcome of the import process. If the import is successful, it will describe the result of the process. However, in case of errors, it will provide details about the issues encountered. Common Errors - Missing Fields, Some required fields were not provided in the API request, which caused the import process to fail. - Incorrect Fields, The data provided for certain fields in the API request was not in the expected format or did not meet the validation requirements, resulting in an error during import.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStatus responseStatus = (ResponseStatus) o;
    return Objects.equals(this.status, responseStatus.status) &&
        Objects.equals(this.message, responseStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
