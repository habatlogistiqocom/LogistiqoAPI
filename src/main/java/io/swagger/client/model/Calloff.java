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
 * Calloff
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T15:42:11.807009033Z[GMT]")

public class Calloff {
  @SerializedName("callOffDate")
  private String callOffDate = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("description")
  private String description = null;

  public Calloff callOffDate(String callOffDate) {
    this.callOffDate = callOffDate;
    return this;
  }

   /**
   * When entering a new goods item into the goods array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item
   * @return callOffDate
  **/
  @Schema(example = "yyMMdd", description = "When entering a new goods item into the goods array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item")
  public String getCallOffDate() {
    return callOffDate;
  }

  public void setCallOffDate(String callOffDate) {
    this.callOffDate = callOffDate;
  }

  public Calloff quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Provide a call-off quantity of the goods.
   * @return quantity
  **/
  @Schema(description = "Provide a call-off quantity of the goods.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Calloff description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Provide a reference of the goods.
   * @return description
  **/
  @Schema(description = "Provide a reference of the goods.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calloff calloff = (Calloff) o;
    return Objects.equals(this.callOffDate, calloff.callOffDate) &&
        Objects.equals(this.quantity, calloff.quantity) &&
        Objects.equals(this.description, calloff.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callOffDate, quantity, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calloff {\n");
    
    sb.append("    callOffDate: ").append(toIndentedString(callOffDate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
