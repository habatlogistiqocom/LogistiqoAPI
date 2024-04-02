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
 * UnloadingNotes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-30T12:18:39.751063444Z[GMT]")

public class UnloadingNotes {
  @SerializedName("mrn")
  private String mrn = null;

  @SerializedName("anmeldeID")
  private Integer anmeldeID = null;

  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  public UnloadingNotes mrn(String mrn) {
    this.mrn = mrn;
    return this;
  }

   /**
   * :&gt;- MRN for the manifest for which the unload notes were requested.
   * @return mrn
  **/
  @Schema(example = "23AT320000TVF8SXX6", description = ":>- MRN for the manifest for which the unload notes were requested.")
  public String getMrn() {
    return mrn;
  }

  public void setMrn(String mrn) {
    this.mrn = mrn;
  }

  public UnloadingNotes anmeldeID(Integer anmeldeID) {
    this.anmeldeID = anmeldeID;
    return this;
  }

   /**
   * :&gt;- LoginID (AnmeldeId) for the manifest for which the unload notes were requested.
   * @return anmeldeID
  **/
  @Schema(example = "263532", description = ":>- LoginID (AnmeldeId) for the manifest for which the unload notes were requested.")
  public Integer getAnmeldeID() {
    return anmeldeID;
  }

  public void setAnmeldeID(Integer anmeldeID) {
    this.anmeldeID = anmeldeID;
  }

  public UnloadingNotes statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * :&gt;- Status code
   * @return statusCode
  **/
  @Schema(example = "0", description = ":>- Status code")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public UnloadingNotes errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * :&gt;- Error text
   * @return errorMessage
  **/
  @Schema(description = ":>- Error text")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnloadingNotes unloadingNotes = (UnloadingNotes) o;
    return Objects.equals(this.mrn, unloadingNotes.mrn) &&
        Objects.equals(this.anmeldeID, unloadingNotes.anmeldeID) &&
        Objects.equals(this.statusCode, unloadingNotes.statusCode) &&
        Objects.equals(this.errorMessage, unloadingNotes.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrn, anmeldeID, statusCode, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnloadingNotes {\n");
    
    sb.append("    mrn: ").append(toIndentedString(mrn)).append("\n");
    sb.append("    anmeldeID: ").append(toIndentedString(anmeldeID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
