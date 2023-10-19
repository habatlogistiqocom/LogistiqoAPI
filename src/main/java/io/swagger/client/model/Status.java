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
 * Status
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-19T13:45:14.600795045Z[GMT]")

public class Status {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("idShipment")
  private Integer idShipment = null;

  @SerializedName("shipmentNumber")
  private String shipmentNumber = null;

  @SerializedName("customerReference")
  private String customerReference = null;

  @SerializedName("statusId")
  private Integer statusId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("idProblemType")
  private Integer idProblemType = null;

  @SerializedName("statusDescription")
  private String statusDescription = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("idDepot")
  private Integer idDepot = null;

  @SerializedName("networkId")
  private Integer networkId = null;

  @SerializedName("article")
  private String article = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("timeStamp")
  private String timeStamp = null;

  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("lng")
  private Double lng = null;

  public Status reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * :&gt;- This unique identification is essential to ensure that the transaction is not mistakenly imported more than once. By using this identifier, we can accurately track and manage the transaction, preventing any errors or discrepancies that could arise from duplicate imports. Please ensure that this unique identifier is included in the transaction. In case of a get method the id of the transaction is shown in this field.
   * @return reference
  **/
  @Schema(example = "541641", description = ":>- This unique identification is essential to ensure that the transaction is not mistakenly imported more than once. By using this identifier, we can accurately track and manage the transaction, preventing any errors or discrepancies that could arise from duplicate imports. Please ensure that this unique identifier is included in the transaction. In case of a get method the id of the transaction is shown in this field.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Status idShipment(Integer idShipment) {
    this.idShipment = idShipment;
    return this;
  }

   /**
   * :&gt;- Only if the id of the shipment is known
   * @return idShipment
  **/
  @Schema(example = "61664", description = ":>- Only if the id of the shipment is known")
  public Integer getIdShipment() {
    return idShipment;
  }

  public void setIdShipment(Integer idShipment) {
    this.idShipment = idShipment;
  }

  public Status shipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * :&gt;- To ensure proper identification of a shipment, it is necessary to use either the idShipment, the shipment number, or a unique customer reference. Using any of these identifiers will allow for accurate and efficient tracking and management of the shipment. Please ensure that one of these identifiers is included.
   * @return shipmentNumber
  **/
  @Schema(example = "23 00050", description = ":>- To ensure proper identification of a shipment, it is necessary to use either the idShipment, the shipment number, or a unique customer reference. Using any of these identifiers will allow for accurate and efficient tracking and management of the shipment. Please ensure that one of these identifiers is included.")
  public String getShipmentNumber() {
    return shipmentNumber;
  }

  public void setShipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }

  public Status customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * :&gt;- To ensure proper identification of a shipment, it is necessary to use either the idShipment, the shipment number, or a unique customer reference. Using any of these identifiers will allow for accurate and efficient tracking and management of the shipment. Please ensure that one of these identifiers is included.
   * @return customerReference
  **/
  @Schema(example = "07049162454161", description = ":>- To ensure proper identification of a shipment, it is necessary to use either the idShipment, the shipment number, or a unique customer reference. Using any of these identifiers will allow for accurate and efficient tracking and management of the shipment. Please ensure that one of these identifiers is included.")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public Status statusId(Integer statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * :&gt;- Only for internal use by Logtistiqo
   * @return statusId
  **/
  @Schema(example = "1", description = ":>- Only for internal use by Logtistiqo")
  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public Status status(String status) {
    this.status = status;
    return this;
  }

   /**
   * :&gt;- Possible values NONASSIGNED, ASSIGNED, STOPOVER, ACCEPTED, ATGATECOLLECT, COLLECTED, DEPOT, DELIVERY, ATGATEDELIVERY, DELIVERED, POD, QUOTE, QUOTEACCEPTED, CANCELED, PROBLEM, XRAY, LABELED, PARTIN, PARTOUT
   * @return status
  **/
  @Schema(example = "POD", description = ":>- Possible values NONASSIGNED, ASSIGNED, STOPOVER, ACCEPTED, ATGATECOLLECT, COLLECTED, DEPOT, DELIVERY, ATGATEDELIVERY, DELIVERED, POD, QUOTE, QUOTEACCEPTED, CANCELED, PROBLEM, XRAY, LABELED, PARTIN, PARTOUT")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Status idProblemType(Integer idProblemType) {
    this.idProblemType = idProblemType;
    return this;
  }

   /**
   * :&gt;- This optional field allows users to set a problem status from the problem type table, providing flexibility and customization within the Logistiqo system. Users have the freedom to define their own problem types. To create and find the available IDs, you can refer to the &#x27;Settings/Shipment/Problem Type&#x27; function in Logistiqo.
   * @return idProblemType
  **/
  @Schema(example = "2", description = ":>- This optional field allows users to set a problem status from the problem type table, providing flexibility and customization within the Logistiqo system. Users have the freedom to define their own problem types. To create and find the available IDs, you can refer to the 'Settings/Shipment/Problem Type' function in Logistiqo.")
  public Integer getIdProblemType() {
    return idProblemType;
  }

  public void setIdProblemType(Integer idProblemType) {
    this.idProblemType = idProblemType;
  }

  public Status statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * :&gt;- A translated status, this field is not used by add status
   * @return statusDescription
  **/
  @Schema(example = "Abholung", description = ":>- A translated status, this field is not used by add status")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public Status description(String description) {
    this.description = description;
    return this;
  }

   /**
   * :&gt;- A free textfield indicating a further description of the status change, i.e in case of a problem the description of the problem
   * @return description
  **/
  @Schema(example = "Freight papers are missing", description = ":>- A free textfield indicating a further description of the status change, i.e in case of a problem the description of the problem")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Status user(String user) {
    this.user = user;
    return this;
  }

   /**
   * :&gt;- Name, Email or Phone number of the user who changed the status
   * @return user
  **/
  @Schema(example = "r.sterling@universalexport.net", description = ":>- Name, Email or Phone number of the user who changed the status")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Status idDepot(Integer idDepot) {
    this.idDepot = idDepot;
    return this;
  }

   /**
   * :&gt;- Please provide the depot ID within Logistiqo where the status change occurred.
   * @return idDepot
  **/
  @Schema(example = "7", description = ":>- Please provide the depot ID within Logistiqo where the status change occurred.")
  public Integer getIdDepot() {
    return idDepot;
  }

  public void setIdDepot(Integer idDepot) {
    this.idDepot = idDepot;
  }

  public Status networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * :&gt;- In this context, the NetworkId represents the identifier of the specific customer involved within the network, which is exclusively employed for the exchange of status information among multiple Logistiqo domains.
   * @return networkId
  **/
  @Schema(example = "7", description = ":>- In this context, the NetworkId represents the identifier of the specific customer involved within the network, which is exclusively employed for the exchange of status information among multiple Logistiqo domains.")
  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public Status article(String article) {
    this.article = article;
    return this;
  }

   /**
   * :&gt;- This field is applicable in cases where the status change pertains to a single specific article within the shipment.
   * @return article
  **/
  @Schema(example = "ABC1237", description = ":>- This field is applicable in cases where the status change pertains to a single specific article within the shipment.")
  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  public Status serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * :&gt;- This field is applicable in cases where the status change pertains to a single specific serialNumber within the shipment.
   * @return serialNumber
  **/
  @Schema(example = "321456987", description = ":>- This field is applicable in cases where the status change pertains to a single specific serialNumber within the shipment.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Status timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * :&gt;- Time of the status change, Use Dateformat &#x27;dd.MM.yyyy HH:mm&#x27;
   * @return timeStamp
  **/
  @Schema(example = "23.03.2023 19:01", description = ":>- Time of the status change, Use Dateformat 'dd.MM.yyyy HH:mm'")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public Status lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * minimum: -90
   * maximum: 90
   * @return lat
  **/
  @Schema(example = "47.7968048", description = "")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Status lng(Double lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * minimum: -180
   * maximum: 180
   * @return lng
  **/
  @Schema(example = "11.973085", description = "")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.reference, status.reference) &&
        Objects.equals(this.idShipment, status.idShipment) &&
        Objects.equals(this.shipmentNumber, status.shipmentNumber) &&
        Objects.equals(this.customerReference, status.customerReference) &&
        Objects.equals(this.statusId, status.statusId) &&
        Objects.equals(this.status, status.status) &&
        Objects.equals(this.idProblemType, status.idProblemType) &&
        Objects.equals(this.statusDescription, status.statusDescription) &&
        Objects.equals(this.description, status.description) &&
        Objects.equals(this.user, status.user) &&
        Objects.equals(this.idDepot, status.idDepot) &&
        Objects.equals(this.networkId, status.networkId) &&
        Objects.equals(this.article, status.article) &&
        Objects.equals(this.serialNumber, status.serialNumber) &&
        Objects.equals(this.timeStamp, status.timeStamp) &&
        Objects.equals(this.lat, status.lat) &&
        Objects.equals(this.lng, status.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, idShipment, shipmentNumber, customerReference, statusId, status, idProblemType, statusDescription, description, user, idDepot, networkId, article, serialNumber, timeStamp, lat, lng);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    idShipment: ").append(toIndentedString(idShipment)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idProblemType: ").append(toIndentedString(idProblemType)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    idDepot: ").append(toIndentedString(idDepot)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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
