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
 * DirectDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-19T13:45:14.600795045Z[GMT]")

public class DirectDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("deliveryDate")
  private String deliveryDate = null;

  public DirectDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the DirectDetail.
   * @return id
  **/
  @Schema(description = "The unique identifier for the DirectDetail.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DirectDetail code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code for the DirectDetail.
   * @return code
  **/
  @Schema(description = "The code for the DirectDetail.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DirectDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the DirectDetail.
   * @return name
  **/
  @Schema(description = "The name of the DirectDetail.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirectDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the DirectDetail.
   * @return description
  **/
  @Schema(description = "A description of the DirectDetail.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DirectDetail price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the DirectDetail.
   * @return price
  **/
  @Schema(description = "The price of the DirectDetail.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public DirectDetail unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measurement for the DirectDetail.
   * @return unit
  **/
  @Schema(description = "The unit of measurement for the DirectDetail.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public DirectDetail quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the DirectDetail.
   * @return quantity
  **/
  @Schema(description = "The quantity of the DirectDetail.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public DirectDetail amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount for the DirectDetail.
   * @return amount
  **/
  @Schema(description = "The total amount for the DirectDetail.")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DirectDetail deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

   /**
   * The delivery date for the DirectDetail.
   * @return deliveryDate
  **/
  @Schema(description = "The delivery date for the DirectDetail.")
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDetail directDetail = (DirectDetail) o;
    return Objects.equals(this.id, directDetail.id) &&
        Objects.equals(this.code, directDetail.code) &&
        Objects.equals(this.name, directDetail.name) &&
        Objects.equals(this.description, directDetail.description) &&
        Objects.equals(this.price, directDetail.price) &&
        Objects.equals(this.unit, directDetail.unit) &&
        Objects.equals(this.quantity, directDetail.quantity) &&
        Objects.equals(this.amount, directDetail.amount) &&
        Objects.equals(this.deliveryDate, directDetail.deliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, description, price, unit, quantity, amount, deliveryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
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
