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
import io.swagger.client.model.Shipment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Manifest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-03T14:55:28.320760885Z[GMT]")

public class Manifest {
  @SerializedName("createManifest")
  private Boolean createManifest = false;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("mrn")
  private String mrn = null;

  @SerializedName("mawb")
  private String mawb = null;

  @SerializedName("airline")
  private String airline = null;

  @SerializedName("date")
  private String date = "current date";

  @SerializedName("dateto")
  private String dateto = "date";

  @SerializedName("depot")
  private String depot = "DEPOT";

  @SerializedName("subcontractor")
  private AllOfManifestSubcontractor subcontractor = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("flightNo")
  private String flightNo = null;

  @SerializedName("shipper")
  private AllOfManifestShipper shipper = null;

  @SerializedName("consignee")
  private AllOfManifestConsignee consignee = null;

  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("shipments")
  private List<Shipment> shipments = null;

  public Manifest createManifest(Boolean createManifest) {
    this.createManifest = createManifest;
    return this;
  }

   /**
   * If you specifically want to create shipments without a manifest, please keep the field at its default value \&quot;false\&quot;. However, if you require a manifest that includes all shipments, please set the field to \&quot;true\&quot;.
   * @return createManifest
  **/
  @Schema(description = "If you specifically want to create shipments without a manifest, please keep the field at its default value \"false\". However, if you require a manifest that includes all shipments, please set the field to \"true\".")
  public Boolean isCreateManifest() {
    return createManifest;
  }

  public void setCreateManifest(Boolean createManifest) {
    this.createManifest = createManifest;
  }

  public Manifest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * This field can contain either a unique random string or a unique ID, which is used to prevent the generation of duplicate manifests
   * @return reference
  **/
  @Schema(example = "23672", description = "This field can contain either a unique random string or a unique ID, which is used to prevent the generation of duplicate manifests")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Manifest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * This field can contain e free text describing the manifest
   * @return description
  **/
  @Schema(description = "This field can contain e free text describing the manifest")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Manifest mrn(String mrn) {
    this.mrn = mrn;
    return this;
  }

   /**
   * If this manifest represents a Master Reference Number, the field should contain a valid Master Reference Number.
   * @return mrn
  **/
  @Schema(example = "22AT100000TV0D2MD6", description = "If this manifest represents a Master Reference Number, the field should contain a valid Master Reference Number.")
  public String getMrn() {
    return mrn;
  }

  public void setMrn(String mrn) {
    this.mrn = mrn;
  }

  public Manifest mawb(String mawb) {
    this.mawb = mawb;
    return this;
  }

   /**
   * If this manifest represents a Master Air Waybill, the field should contain a valid Master Air Waybill number in the format 123-12345678.
   * @return mawb
  **/
  @Schema(example = "180-39408331", description = "If this manifest represents a Master Air Waybill, the field should contain a valid Master Air Waybill number in the format 123-12345678.")
  public String getMawb() {
    return mawb;
  }

  public void setMawb(String mawb) {
    this.mawb = mawb;
  }

  public Manifest airline(String airline) {
    this.airline = airline;
    return this;
  }

   /**
   * If this manifest represents a Master Air Waybill, the field should contain the name of the first carrier.
   * @return airline
  **/
  @Schema(example = "180 Korean Air Lines", description = "If this manifest represents a Master Air Waybill, the field should contain the name of the first carrier.")
  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public Manifest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Please indicate the desired start date in the format dd.MM.yyyy HH:mm or dd.MM.yyyy, and optionally the time, for the execution of this manifest.
   * @return date
  **/
  @Schema(example = "12.06.2023 12:00", description = "Please indicate the desired start date in the format dd.MM.yyyy HH:mm or dd.MM.yyyy, and optionally the time, for the execution of this manifest.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Manifest dateto(String dateto) {
    this.dateto = dateto;
    return this;
  }

   /**
   * Please provide the desired completion date in the format dd.MM.yyyy HH:mm or dd.MM.yyyy, and optionally the time, for the execution of this manifest.
   * @return dateto
  **/
  @Schema(example = "12.06.2023 16:00", description = "Please provide the desired completion date in the format dd.MM.yyyy HH:mm or dd.MM.yyyy, and optionally the time, for the execution of this manifest.")
  public String getDateto() {
    return dateto;
  }

  public void setDateto(String dateto) {
    this.dateto = dateto;
  }

  public Manifest depot(String depot) {
    this.depot = depot;
    return this;
  }

   /**
   * Please provide the desired depot for the execution of this manifest.
   * @return depot
  **/
  @Schema(example = "HUB01", description = "Please provide the desired depot for the execution of this manifest.")
  public String getDepot() {
    return depot;
  }

  public void setDepot(String depot) {
    this.depot = depot;
  }

  public Manifest subcontractor(AllOfManifestSubcontractor subcontractor) {
    this.subcontractor = subcontractor;
    return this;
  }

   /**
   * If this manifest represents a Contract of Carriage, please enter the Logistiqo-specified company code of the subcontractor responsible for carrying out the transportation.
   * @return subcontractor
  **/
  @Schema(description = "If this manifest represents a Contract of Carriage, please enter the Logistiqo-specified company code of the subcontractor responsible for carrying out the transportation.")
  public AllOfManifestSubcontractor getSubcontractor() {
    return subcontractor;
  }

  public void setSubcontractor(AllOfManifestSubcontractor subcontractor) {
    this.subcontractor = subcontractor;
  }

  public Manifest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * This field is solely utilized when the manifest includes warehouse issues, warehouse receipts, or relocation shipments. In such scenarios, the acceptable values are limited to SCAN_IN, SCAN_OUT, and SCAN_RELOCATE.
   * @return action
  **/
  @Schema(description = "This field is solely utilized when the manifest includes warehouse issues, warehouse receipts, or relocation shipments. In such scenarios, the acceptable values are limited to SCAN_IN, SCAN_OUT, and SCAN_RELOCATE.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Manifest flightNo(String flightNo) {
    this.flightNo = flightNo;
    return this;
  }

   /**
   * If this manifest represents a Master Air Waybill, please enter the Flight Number in the corresponding field.
   * @return flightNo
  **/
  @Schema(example = "KE946", description = "If this manifest represents a Master Air Waybill, please enter the Flight Number in the corresponding field.")
  public String getFlightNo() {
    return flightNo;
  }

  public void setFlightNo(String flightNo) {
    this.flightNo = flightNo;
  }

  public Manifest shipper(AllOfManifestShipper shipper) {
    this.shipper = shipper;
    return this;
  }

   /**
   * Get shipper
   * @return shipper
  **/
  @Schema(description = "")
  public AllOfManifestShipper getShipper() {
    return shipper;
  }

  public void setShipper(AllOfManifestShipper shipper) {
    this.shipper = shipper;
  }

  public Manifest consignee(AllOfManifestConsignee consignee) {
    this.consignee = consignee;
    return this;
  }

   /**
   * Get consignee
   * @return consignee
  **/
  @Schema(description = "")
  public AllOfManifestConsignee getConsignee() {
    return consignee;
  }

  public void setConsignee(AllOfManifestConsignee consignee) {
    this.consignee = consignee;
  }

  public Manifest error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * This field signifies the presence of errors in the Manifest.
   * @return error
  **/
  @Schema(example = "false", description = "This field signifies the presence of errors in the Manifest.")
  public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public Manifest shipments(List<Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }

  public Manifest addShipmentsItem(Shipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<Shipment>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @Schema(description = "")
  public List<Shipment> getShipments() {
    return shipments;
  }

  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manifest manifest = (Manifest) o;
    return Objects.equals(this.createManifest, manifest.createManifest) &&
        Objects.equals(this.reference, manifest.reference) &&
        Objects.equals(this.description, manifest.description) &&
        Objects.equals(this.mrn, manifest.mrn) &&
        Objects.equals(this.mawb, manifest.mawb) &&
        Objects.equals(this.airline, manifest.airline) &&
        Objects.equals(this.date, manifest.date) &&
        Objects.equals(this.dateto, manifest.dateto) &&
        Objects.equals(this.depot, manifest.depot) &&
        Objects.equals(this.subcontractor, manifest.subcontractor) &&
        Objects.equals(this.action, manifest.action) &&
        Objects.equals(this.flightNo, manifest.flightNo) &&
        Objects.equals(this.shipper, manifest.shipper) &&
        Objects.equals(this.consignee, manifest.consignee) &&
        Objects.equals(this.error, manifest.error) &&
        Objects.equals(this.shipments, manifest.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createManifest, reference, description, mrn, mawb, airline, date, dateto, depot, subcontractor, action, flightNo, shipper, consignee, error, shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifest {\n");
    
    sb.append("    createManifest: ").append(toIndentedString(createManifest)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mrn: ").append(toIndentedString(mrn)).append("\n");
    sb.append("    mawb: ").append(toIndentedString(mawb)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateto: ").append(toIndentedString(dateto)).append("\n");
    sb.append("    depot: ").append(toIndentedString(depot)).append("\n");
    sb.append("    subcontractor: ").append(toIndentedString(subcontractor)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    flightNo: ").append(toIndentedString(flightNo)).append("\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    consignee: ").append(toIndentedString(consignee)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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
