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
 * Service
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-17T10:06:38.163246815Z[GMT]")

public class Service {
  @SerializedName("pos")
  private Integer pos = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("netAmount")
  private Double netAmount = null;

  @SerializedName("netCost")
  private Double netCost = null;

  @SerializedName("subcontractor")
  private AllOfServiceSubcontractor subcontractor = null;

  @SerializedName("importId")
  private String importId = null;

  public Service pos(Integer pos) {
    this.pos = pos;
    return this;
  }

   /**
   * When entering a new sevice item into the sevice array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item
   * @return pos
  **/
  @Schema(example = "1", description = "When entering a new sevice item into the sevice array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Service name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Please provide a name of the service. If a service with the same name is not found in the Logistiqo application, it will be created.
   * @return name
  **/
  @Schema(description = "Please provide a name of the service. If a service with the same name is not found in the Logistiqo application, it will be created.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Provide a reference of the service.
   * @return reference
  **/
  @Schema(description = "Provide a reference of the service.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Service netAmount(Double netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Get netAmount
   * @return netAmount
  **/
  @Schema(example = "0", description = "")
  public Double getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Double netAmount) {
    this.netAmount = netAmount;
  }

  public Service netCost(Double netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * Get netCost
   * @return netCost
  **/
  @Schema(example = "0", description = "")
  public Double getNetCost() {
    return netCost;
  }

  public void setNetCost(Double netCost) {
    this.netCost = netCost;
  }

  public Service subcontractor(AllOfServiceSubcontractor subcontractor) {
    this.subcontractor = subcontractor;
    return this;
  }

   /**
   * Get subcontractor
   * @return subcontractor
  **/
  @Schema(description = "")
  public AllOfServiceSubcontractor getSubcontractor() {
    return subcontractor;
  }

  public void setSubcontractor(AllOfServiceSubcontractor subcontractor) {
    this.subcontractor = subcontractor;
  }

  public Service importId(String importId) {
    this.importId = importId;
    return this;
  }

   /**
   * The importId is only required if you intend to change goods items through the API. It is used to find the correct goods item. If no item is found, a new item will be created.
   * @return importId
  **/
  @Schema(example = "12345678", description = "The importId is only required if you intend to change goods items through the API. It is used to find the correct goods item. If no item is found, a new item will be created.")
  public String getImportId() {
    return importId;
  }

  public void setImportId(String importId) {
    this.importId = importId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.pos, service.pos) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.reference, service.reference) &&
        Objects.equals(this.netAmount, service.netAmount) &&
        Objects.equals(this.netCost, service.netCost) &&
        Objects.equals(this.subcontractor, service.subcontractor) &&
        Objects.equals(this.importId, service.importId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, name, reference, netAmount, netCost, subcontractor, importId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    subcontractor: ").append(toIndentedString(subcontractor)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
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
