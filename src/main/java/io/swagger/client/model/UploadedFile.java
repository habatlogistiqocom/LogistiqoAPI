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
 * UploadedFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-30T12:18:39.751063444Z[GMT]")

public class UploadedFile {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("idShipment")
  private Integer idShipment = null;

  @SerializedName("shipmentNumber")
  private String shipmentNumber = null;

  @SerializedName("customerReference")
  private String customerReference = null;

  @SerializedName("networkId")
  private Integer networkId = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileContent")
  private String fileContent = null;

  @SerializedName("fileSize")
  private Integer fileSize = null;

  @SerializedName("temporary")
  private Boolean temporary = false;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdOn")
  private String createdOn = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("modifiedOn")
  private String modifiedOn = null;

  @SerializedName("deleted")
  private Boolean deleted = false;

  public UploadedFile reference(String reference) {
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

  public UploadedFile idShipment(Integer idShipment) {
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

  public UploadedFile shipmentNumber(String shipmentNumber) {
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

  public UploadedFile customerReference(String customerReference) {
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

  public UploadedFile networkId(Integer networkId) {
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

  public UploadedFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the uploaded file
   * @return fileName
  **/
  @Schema(example = "deliveryNote001.pdf", description = "Name of the uploaded file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public UploadedFile fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
   * A String containing a Base64 encoded file byte[] input_file &#x3D; new byte[0]; input_file &#x3D; Files.readAllBytes(Paths.get(file.getAbsolutePath())); encodedBytes &#x3D; Base64.getEncoder().encode(input_file); String encodedString &#x3D; new String(encodedBytes);
   * @return fileContent
  **/
  @Schema(description = "A String containing a Base64 encoded file byte[] input_file = new byte[0]; input_file = Files.readAllBytes(Paths.get(file.getAbsolutePath())); encodedBytes = Base64.getEncoder().encode(input_file); String encodedString = new String(encodedBytes);")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  public UploadedFile fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Size in KB of the uploaded file
   * @return fileSize
  **/
  @Schema(example = "12345", description = "Size in KB of the uploaded file")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public UploadedFile temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Internal field
   * @return temporary
  **/
  @Schema(example = "false", description = "Internal field")
  public Boolean isTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public UploadedFile createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UploadedFile createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * date in the format dd.MM.yyyy HH:mm
   * @return createdOn
  **/
  @Schema(example = "12.06.2023 15:00", description = "date in the format dd.MM.yyyy HH:mm")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public UploadedFile modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @Schema(description = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public UploadedFile modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * date in the format dd.MM.yyyy HH:mm
   * @return modifiedOn
  **/
  @Schema(example = "12.06.2023 15:00", description = "date in the format dd.MM.yyyy HH:mm")
  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public UploadedFile deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Internal field
   * @return deleted
  **/
  @Schema(description = "Internal field")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedFile uploadedFile = (UploadedFile) o;
    return Objects.equals(this.reference, uploadedFile.reference) &&
        Objects.equals(this.idShipment, uploadedFile.idShipment) &&
        Objects.equals(this.shipmentNumber, uploadedFile.shipmentNumber) &&
        Objects.equals(this.customerReference, uploadedFile.customerReference) &&
        Objects.equals(this.networkId, uploadedFile.networkId) &&
        Objects.equals(this.fileName, uploadedFile.fileName) &&
        Objects.equals(this.fileContent, uploadedFile.fileContent) &&
        Objects.equals(this.fileSize, uploadedFile.fileSize) &&
        Objects.equals(this.temporary, uploadedFile.temporary) &&
        Objects.equals(this.createdBy, uploadedFile.createdBy) &&
        Objects.equals(this.createdOn, uploadedFile.createdOn) &&
        Objects.equals(this.modifiedBy, uploadedFile.modifiedBy) &&
        Objects.equals(this.modifiedOn, uploadedFile.modifiedOn) &&
        Objects.equals(this.deleted, uploadedFile.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, idShipment, shipmentNumber, customerReference, networkId, fileName, fileContent, fileSize, temporary, createdBy, createdOn, modifiedBy, modifiedOn, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFile {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    idShipment: ").append(toIndentedString(idShipment)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
