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
 * Barcode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-03T12:45:05.403669596Z[GMT]")

public class Barcode {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("barcode")
  private String barcode = null;

  @SerializedName("customerref")
  private String customerref = null;

  @SerializedName("manifestref")
  private String manifestref = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("storage")
  private String storage = null;

  @SerializedName("loadcarrier")
  private String loadcarrier = null;

  @SerializedName("constructionindex")
  private String constructionindex = null;

  @SerializedName("serialnumber")
  private String serialnumber = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("slc")
  private Integer slc = null;

  @SerializedName("llc")
  private Integer llc = null;

  @SerializedName("qpu")
  private Integer qpu = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("barcodetype")
  private String barcodetype = null;

  @SerializedName("createnew")
  private Boolean createnew = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("changestatus")
  private Boolean changestatus = null;

  @SerializedName("scannedby")
  private String scannedby = null;

  @SerializedName("scannedinon")
  private String scannedinon = null;

  public Barcode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Barcode barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  @Schema(description = "")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Barcode customerref(String customerref) {
    this.customerref = customerref;
    return this;
  }

   /**
   * Get customerref
   * @return customerref
  **/
  @Schema(description = "")
  public String getCustomerref() {
    return customerref;
  }

  public void setCustomerref(String customerref) {
    this.customerref = customerref;
  }

  public Barcode manifestref(String manifestref) {
    this.manifestref = manifestref;
    return this;
  }

   /**
   * Get manifestref
   * @return manifestref
  **/
  @Schema(description = "")
  public String getManifestref() {
    return manifestref;
  }

  public void setManifestref(String manifestref) {
    this.manifestref = manifestref;
  }

  public Barcode reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Barcode storage(String storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @Schema(description = "")
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  public Barcode loadcarrier(String loadcarrier) {
    this.loadcarrier = loadcarrier;
    return this;
  }

   /**
   * Get loadcarrier
   * @return loadcarrier
  **/
  @Schema(description = "")
  public String getLoadcarrier() {
    return loadcarrier;
  }

  public void setLoadcarrier(String loadcarrier) {
    this.loadcarrier = loadcarrier;
  }

  public Barcode constructionindex(String constructionindex) {
    this.constructionindex = constructionindex;
    return this;
  }

   /**
   * Get constructionindex
   * @return constructionindex
  **/
  @Schema(description = "")
  public String getConstructionindex() {
    return constructionindex;
  }

  public void setConstructionindex(String constructionindex) {
    this.constructionindex = constructionindex;
  }

  public Barcode serialnumber(String serialnumber) {
    this.serialnumber = serialnumber;
    return this;
  }

   /**
   * Get serialnumber
   * @return serialnumber
  **/
  @Schema(description = "")
  public String getSerialnumber() {
    return serialnumber;
  }

  public void setSerialnumber(String serialnumber) {
    this.serialnumber = serialnumber;
  }

  public Barcode quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Barcode slc(Integer slc) {
    this.slc = slc;
    return this;
  }

   /**
   * Get slc
   * @return slc
  **/
  @Schema(description = "")
  public Integer getSlc() {
    return slc;
  }

  public void setSlc(Integer slc) {
    this.slc = slc;
  }

  public Barcode llc(Integer llc) {
    this.llc = llc;
    return this;
  }

   /**
   * Get llc
   * @return llc
  **/
  @Schema(description = "")
  public Integer getLlc() {
    return llc;
  }

  public void setLlc(Integer llc) {
    this.llc = llc;
  }

  public Barcode qpu(Integer qpu) {
    this.qpu = qpu;
    return this;
  }

   /**
   * Get qpu
   * @return qpu
  **/
  @Schema(description = "")
  public Integer getQpu() {
    return qpu;
  }

  public void setQpu(Integer qpu) {
    this.qpu = qpu;
  }

  public Barcode unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Barcode action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Barcode barcodetype(String barcodetype) {
    this.barcodetype = barcodetype;
    return this;
  }

   /**
   * Get barcodetype
   * @return barcodetype
  **/
  @Schema(description = "")
  public String getBarcodetype() {
    return barcodetype;
  }

  public void setBarcodetype(String barcodetype) {
    this.barcodetype = barcodetype;
  }

  public Barcode createnew(Boolean createnew) {
    this.createnew = createnew;
    return this;
  }

   /**
   * Get createnew
   * @return createnew
  **/
  @Schema(description = "")
  public Boolean isCreatenew() {
    return createnew;
  }

  public void setCreatenew(Boolean createnew) {
    this.createnew = createnew;
  }

  public Barcode deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Barcode complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @Schema(description = "")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Barcode changestatus(Boolean changestatus) {
    this.changestatus = changestatus;
    return this;
  }

   /**
   * Get changestatus
   * @return changestatus
  **/
  @Schema(description = "")
  public Boolean isChangestatus() {
    return changestatus;
  }

  public void setChangestatus(Boolean changestatus) {
    this.changestatus = changestatus;
  }

  public Barcode scannedby(String scannedby) {
    this.scannedby = scannedby;
    return this;
  }

   /**
   * Get scannedby
   * @return scannedby
  **/
  @Schema(description = "")
  public String getScannedby() {
    return scannedby;
  }

  public void setScannedby(String scannedby) {
    this.scannedby = scannedby;
  }

  public Barcode scannedinon(String scannedinon) {
    this.scannedinon = scannedinon;
    return this;
  }

   /**
   * Get scannedinon
   * @return scannedinon
  **/
  @Schema(description = "")
  public String getScannedinon() {
    return scannedinon;
  }

  public void setScannedinon(String scannedinon) {
    this.scannedinon = scannedinon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Barcode barcode = (Barcode) o;
    return Objects.equals(this.id, barcode.id) &&
        Objects.equals(this.barcode, barcode.barcode) &&
        Objects.equals(this.customerref, barcode.customerref) &&
        Objects.equals(this.manifestref, barcode.manifestref) &&
        Objects.equals(this.reference, barcode.reference) &&
        Objects.equals(this.storage, barcode.storage) &&
        Objects.equals(this.loadcarrier, barcode.loadcarrier) &&
        Objects.equals(this.constructionindex, barcode.constructionindex) &&
        Objects.equals(this.serialnumber, barcode.serialnumber) &&
        Objects.equals(this.quantity, barcode.quantity) &&
        Objects.equals(this.slc, barcode.slc) &&
        Objects.equals(this.llc, barcode.llc) &&
        Objects.equals(this.qpu, barcode.qpu) &&
        Objects.equals(this.unit, barcode.unit) &&
        Objects.equals(this.action, barcode.action) &&
        Objects.equals(this.barcodetype, barcode.barcodetype) &&
        Objects.equals(this.createnew, barcode.createnew) &&
        Objects.equals(this.deleted, barcode.deleted) &&
        Objects.equals(this.complete, barcode.complete) &&
        Objects.equals(this.changestatus, barcode.changestatus) &&
        Objects.equals(this.scannedby, barcode.scannedby) &&
        Objects.equals(this.scannedinon, barcode.scannedinon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, barcode, customerref, manifestref, reference, storage, loadcarrier, constructionindex, serialnumber, quantity, slc, llc, qpu, unit, action, barcodetype, createnew, deleted, complete, changestatus, scannedby, scannedinon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Barcode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    customerref: ").append(toIndentedString(customerref)).append("\n");
    sb.append("    manifestref: ").append(toIndentedString(manifestref)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    loadcarrier: ").append(toIndentedString(loadcarrier)).append("\n");
    sb.append("    constructionindex: ").append(toIndentedString(constructionindex)).append("\n");
    sb.append("    serialnumber: ").append(toIndentedString(serialnumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    slc: ").append(toIndentedString(slc)).append("\n");
    sb.append("    llc: ").append(toIndentedString(llc)).append("\n");
    sb.append("    qpu: ").append(toIndentedString(qpu)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    barcodetype: ").append(toIndentedString(barcodetype)).append("\n");
    sb.append("    createnew: ").append(toIndentedString(createnew)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    changestatus: ").append(toIndentedString(changestatus)).append("\n");
    sb.append("    scannedby: ").append(toIndentedString(scannedby)).append("\n");
    sb.append("    scannedinon: ").append(toIndentedString(scannedinon)).append("\n");
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
