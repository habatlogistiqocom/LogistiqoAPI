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
 * Detail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-03T10:35:47.578844334Z[GMT]")

public class Detail {
  @SerializedName("type")
  private String type = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("address")
  private AllOfDetailAddress address = null;

  @SerializedName("dateType")
  private Integer dateType = null;

  @SerializedName("dateFrom")
  private String dateFrom = null;

  @SerializedName("dateTo")
  private String dateTo = null;

  @SerializedName("dateFrom2")
  private String dateFrom2 = null;

  @SerializedName("dateTo2")
  private String dateTo2 = null;

  @SerializedName("fixedTime")
  private Boolean fixedTime = null;

  @SerializedName("notification")
  private Boolean notification = null;

  public Detail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Every shipment necessitates a minimum of two detail objects: one designated as the SENDER and the other as the RECEIVER. Nevertheless, if required, it is also possible to include multiple Senders and/or multiple Receivers within a single shipment. The Sender is also utilized for pickups, while the Receiver is utilized for deliveries. 
   * @return type
  **/
  @Schema(example = "SENDER", required = true, description = "Every shipment necessitates a minimum of two detail objects: one designated as the SENDER and the other as the RECEIVER. Nevertheless, if required, it is also possible to include multiple Senders and/or multiple Receivers within a single shipment. The Sender is also utilized for pickups, while the Receiver is utilized for deliveries. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Detail instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @Schema(description = "")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public Detail address(AllOfDetailAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public AllOfDetailAddress getAddress() {
    return address;
  }

  public void setAddress(AllOfDetailAddress address) {
    this.address = address;
  }

  public Detail dateType(Integer dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   * 0&#x3D;default, 1&#x3D;FromTo, 2&#x3D;From, 3&#x3D;To, 4&#x3D;Fix, 5&#x3D;None
   * @return dateType
  **/
  @Schema(example = "1", description = "0=default, 1=FromTo, 2=From, 3=To, 4=Fix, 5=None")
  public Integer getDateType() {
    return dateType;
  }

  public void setDateType(Integer dateType) {
    this.dateType = dateType;
  }

  public Detail dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * The parameters &#x27;dateFrom&#x27; and &#x27;dateTo&#x27; specify the time frame during which the goods are scheduled to be picked up and/or delivered.
   * @return dateFrom
  **/
  @Schema(example = "12.06.2023 10:00", description = "The parameters 'dateFrom' and 'dateTo' specify the time frame during which the goods are scheduled to be picked up and/or delivered.")
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public Detail dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @Schema(example = "12.06.2023 15:00", description = "")
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public Detail dateFrom2(String dateFrom2) {
    this.dateFrom2 = dateFrom2;
    return this;
  }

   /**
   * Get dateFrom2
   * @return dateFrom2
  **/
  @Schema(example = "dd.MM.yyyy HH.mm", description = "")
  public String getDateFrom2() {
    return dateFrom2;
  }

  public void setDateFrom2(String dateFrom2) {
    this.dateFrom2 = dateFrom2;
  }

  public Detail dateTo2(String dateTo2) {
    this.dateTo2 = dateTo2;
    return this;
  }

   /**
   * Get dateTo2
   * @return dateTo2
  **/
  @Schema(example = "dd.MM.yyyy HH.mm", description = "")
  public String getDateTo2() {
    return dateTo2;
  }

  public void setDateTo2(String dateTo2) {
    this.dateTo2 = dateTo2;
  }

  public Detail fixedTime(Boolean fixedTime) {
    this.fixedTime = fixedTime;
    return this;
  }

   /**
   * Get fixedTime
   * @return fixedTime
  **/
  @Schema(example = "false", description = "")
  public Boolean isFixedTime() {
    return fixedTime;
  }

  public void setFixedTime(Boolean fixedTime) {
    this.fixedTime = fixedTime;
  }

  public Detail notification(Boolean notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @Schema(example = "false", description = "")
  public Boolean isNotification() {
    return notification;
  }

  public void setNotification(Boolean notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Detail detail = (Detail) o;
    return Objects.equals(this.type, detail.type) &&
        Objects.equals(this.instructions, detail.instructions) &&
        Objects.equals(this.address, detail.address) &&
        Objects.equals(this.dateType, detail.dateType) &&
        Objects.equals(this.dateFrom, detail.dateFrom) &&
        Objects.equals(this.dateTo, detail.dateTo) &&
        Objects.equals(this.dateFrom2, detail.dateFrom2) &&
        Objects.equals(this.dateTo2, detail.dateTo2) &&
        Objects.equals(this.fixedTime, detail.fixedTime) &&
        Objects.equals(this.notification, detail.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, instructions, address, dateType, dateFrom, dateTo, dateFrom2, dateTo2, fixedTime, notification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Detail {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    dateFrom2: ").append(toIndentedString(dateFrom2)).append("\n");
    sb.append("    dateTo2: ").append(toIndentedString(dateTo2)).append("\n");
    sb.append("    fixedTime: ").append(toIndentedString(fixedTime)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
