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
import io.swagger.client.model.Calloff;
import io.swagger.client.model.Detail;
import io.swagger.client.model.Goods;
import io.swagger.client.model.NotifiedGoods;
import io.swagger.client.model.Service;
import io.swagger.client.model.UploadedFile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Shipment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-01T13:29:13.109750286Z[GMT]")

public class Shipment {
  @SerializedName("idCustomer")
  private Integer idCustomer = null;

  @SerializedName("networkId")
  private Integer networkId = null;

  @SerializedName("edifactId")
  private String edifactId = null;

  @SerializedName("customerNumber")
  private String customerNumber = null;

  @SerializedName("shipmentNumber")
  private String shipmentNumber = null;

  @SerializedName("customerReference")
  private String customerReference = null;

  @SerializedName("internalReference")
  private String internalReference = null;

  @SerializedName("hawb")
  private String hawb = null;

  @SerializedName("shipmentType")
  private String shipmentType = null;

  @SerializedName("paymentTerms")
  private AllOfShipmentPaymentTerms paymentTerms = null;

  @SerializedName("branch")
  private String branch = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dropofByCompany")
  private String dropofByCompany = null;

  @SerializedName("dropofByVehicle")
  private String dropofByVehicle = null;

  @SerializedName("ownCompanyCode")
  private String ownCompanyCode = null;

  @SerializedName("idScanningConfig")
  private Integer idScanningConfig = 1;

  @SerializedName("plantNumber")
  private String plantNumber = null;

  @SerializedName("callOffNumber")
  private String callOffNumber = null;

  @SerializedName("callOffDate")
  private String callOffDate = null;

  @SerializedName("callOffArticle")
  private String callOffArticle = null;

  @SerializedName("callOffCumulativeQuantity")
  private String callOffCumulativeQuantity = null;

  @SerializedName("callOffLastDeliveryDate")
  private String callOffLastDeliveryDate = null;

  @SerializedName("callOffLastDeliveryNote")
  private String callOffLastDeliveryNote = null;

  @SerializedName("unloadingPoint")
  private String unloadingPoint = null;

  @SerializedName("customerMark")
  private String customerMark = null;

  @SerializedName("scannedBy")
  private String scannedBy = null;

  @SerializedName("return")
  private Boolean _return = null;

  @SerializedName("returnExchange")
  private Boolean returnExchange = null;

  @SerializedName("idCustomerContact")
  private Integer idCustomerContact = null;

  @SerializedName("idContract")
  private Integer idContract = 0;

  @SerializedName("idStockStatus")
  private Integer idStockStatus = 0;

  @SerializedName("customer")
  private AllOfShipmentCustomer customer = null;

  @SerializedName("invoiceReceiver")
  private AllOfShipmentInvoiceReceiver invoiceReceiver = null;

  @SerializedName("details")
  private List<Detail> details = new ArrayList<Detail>();

  @SerializedName("goodss")
  private List<Goods> goodss = new ArrayList<Goods>();

  @SerializedName("notifiedGoodss")
  private List<NotifiedGoods> notifiedGoodss = null;

  @SerializedName("calloffs")
  private List<Calloff> calloffs = null;

  @SerializedName("uploadedFiles")
  private List<UploadedFile> uploadedFiles = null;

  @SerializedName("services")
  private List<Service> services = null;

  public Shipment idCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
    return this;
  }

   /**
   * Internal field, This field is exclusively utilized for internal purposes within the Logistiqo application.
   * @return idCustomer
  **/
  @Schema(description = "Internal field, This field is exclusively utilized for internal purposes within the Logistiqo application.")
  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public Shipment networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * Internal field, this field is exclusively utilized for internal purposes within the Logistiqo application for exchange of shipments between Logistiqo Domains. The networkId is the common id of the Customer within the Network of different logistiqo domains 
   * @return networkId
  **/
  @Schema(description = "Internal field, this field is exclusively utilized for internal purposes within the Logistiqo application for exchange of shipments between Logistiqo Domains. The networkId is the common id of the Customer within the Network of different logistiqo domains ")
  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public Shipment edifactId(String edifactId) {
    this.edifactId = edifactId;
    return this;
  }

   /**
   * Internal field, This field is exclusively utilized for internal purposes within the Logistiqo application.
   * @return edifactId
  **/
  @Schema(description = "Internal field, This field is exclusively utilized for internal purposes within the Logistiqo application.")
  public String getEdifactId() {
    return edifactId;
  }

  public void setEdifactId(String edifactId) {
    this.edifactId = edifactId;
  }

  public Shipment customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Please be aware that this field is mandatory and should include a unique customer number that is registered in the Logistiqo system. If the customerNumber is left empty, please provide  all the necessary company and address fields in the field customer.
   * @return customerNumber
  **/
  @Schema(required = true, description = "Please be aware that this field is mandatory and should include a unique customer number that is registered in the Logistiqo system. If the customerNumber is left empty, please provide  all the necessary company and address fields in the field customer.")
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Shipment shipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
    return this;
  }

   /**
   * This field exclusively holds the Shipment Number and is exclusively utilized by the GET method; in contrast, the POST method disregards this field entirely.
   * @return shipmentNumber
  **/
  @Schema(description = "This field exclusively holds the Shipment Number and is exclusively utilized by the GET method; in contrast, the POST method disregards this field entirely.")
  public String getShipmentNumber() {
    return shipmentNumber;
  }

  public void setShipmentNumber(String shipmentNumber) {
    this.shipmentNumber = shipmentNumber;
  }

  public Shipment customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * Please ensure that this required field contains a unique customer reference, which is typically the customer&#x27;s order number. This information is crucial for proper order processing and fulfillment.
   * @return customerReference
  **/
  @Schema(required = true, description = "Please ensure that this required field contains a unique customer reference, which is typically the customer's order number. This information is crucial for proper order processing and fulfillment.")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public Shipment internalReference(String internalReference) {
    this.internalReference = internalReference;
    return this;
  }

   /**
   * Get internalReference
   * @return internalReference
  **/
  @Schema(description = "")
  public String getInternalReference() {
    return internalReference;
  }

  public void setInternalReference(String internalReference) {
    this.internalReference = internalReference;
  }

  public Shipment hawb(String hawb) {
    this.hawb = hawb;
    return this;
  }

   /**
   * If this shipment is linked with a House Air Waybill, please enter the House Waybill number in the field using a free format.
   * @return hawb
  **/
  @Schema(description = "If this shipment is linked with a House Air Waybill, please enter the House Waybill number in the field using a free format.")
  public String getHawb() {
    return hawb;
  }

  public void setHawb(String hawb) {
    this.hawb = hawb;
  }

  public Shipment shipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Please specify the shipment type according to the options defined in the Logistiqo application, such as IMPORT, EXPORT, DEPOT, or SAMMEL.
   * @return shipmentType
  **/
  @Schema(example = "DIRECT", description = "Please specify the shipment type according to the options defined in the Logistiqo application, such as IMPORT, EXPORT, DEPOT, or SAMMEL.")
  public String getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }

  public Shipment paymentTerms(AllOfShipmentPaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * This field should only be used if the payment term for this shipment differs from the customer&#x27;s default payment term as defined in the Logistiqo application.
   * @return paymentTerms
  **/
  @Schema(description = "This field should only be used if the payment term for this shipment differs from the customer's default payment term as defined in the Logistiqo application.")
  public AllOfShipmentPaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(AllOfShipmentPaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public Shipment branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * free text
   * @return branch
  **/
  @Schema(description = "free text")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public Shipment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * free text
   * @return description
  **/
  @Schema(description = "free text")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Shipment dropofByCompany(String dropofByCompany) {
    this.dropofByCompany = dropofByCompany;
    return this;
  }

   /**
   * Get dropofByCompany
   * @return dropofByCompany
  **/
  @Schema(description = "")
  public String getDropofByCompany() {
    return dropofByCompany;
  }

  public void setDropofByCompany(String dropofByCompany) {
    this.dropofByCompany = dropofByCompany;
  }

  public Shipment dropofByVehicle(String dropofByVehicle) {
    this.dropofByVehicle = dropofByVehicle;
    return this;
  }

   /**
   * Get dropofByVehicle
   * @return dropofByVehicle
  **/
  @Schema(description = "")
  public String getDropofByVehicle() {
    return dropofByVehicle;
  }

  public void setDropofByVehicle(String dropofByVehicle) {
    this.dropofByVehicle = dropofByVehicle;
  }

  public Shipment ownCompanyCode(String ownCompanyCode) {
    this.ownCompanyCode = ownCompanyCode;
    return this;
  }

   /**
   * Internal field
   * @return ownCompanyCode
  **/
  @Schema(description = "Internal field")
  public String getOwnCompanyCode() {
    return ownCompanyCode;
  }

  public void setOwnCompanyCode(String ownCompanyCode) {
    this.ownCompanyCode = ownCompanyCode;
  }

  public Shipment idScanningConfig(Integer idScanningConfig) {
    this.idScanningConfig = idScanningConfig;
    return this;
  }

   /**
   * Internal field
   * @return idScanningConfig
  **/
  @Schema(example = "1", description = "Internal field")
  public Integer getIdScanningConfig() {
    return idScanningConfig;
  }

  public void setIdScanningConfig(Integer idScanningConfig) {
    this.idScanningConfig = idScanningConfig;
  }

  public Shipment plantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
    return this;
  }

   /**
   * Internal field
   * @return plantNumber
  **/
  @Schema(description = "Internal field")
  public String getPlantNumber() {
    return plantNumber;
  }

  public void setPlantNumber(String plantNumber) {
    this.plantNumber = plantNumber;
  }

  public Shipment callOffNumber(String callOffNumber) {
    this.callOffNumber = callOffNumber;
    return this;
  }

   /**
   * Internal field
   * @return callOffNumber
  **/
  @Schema(description = "Internal field")
  public String getCallOffNumber() {
    return callOffNumber;
  }

  public void setCallOffNumber(String callOffNumber) {
    this.callOffNumber = callOffNumber;
  }

  public Shipment callOffDate(String callOffDate) {
    this.callOffDate = callOffDate;
    return this;
  }

   /**
   * Internal field
   * @return callOffDate
  **/
  @Schema(description = "Internal field")
  public String getCallOffDate() {
    return callOffDate;
  }

  public void setCallOffDate(String callOffDate) {
    this.callOffDate = callOffDate;
  }

  public Shipment callOffArticle(String callOffArticle) {
    this.callOffArticle = callOffArticle;
    return this;
  }

   /**
   * Internal field
   * @return callOffArticle
  **/
  @Schema(description = "Internal field")
  public String getCallOffArticle() {
    return callOffArticle;
  }

  public void setCallOffArticle(String callOffArticle) {
    this.callOffArticle = callOffArticle;
  }

  public Shipment callOffCumulativeQuantity(String callOffCumulativeQuantity) {
    this.callOffCumulativeQuantity = callOffCumulativeQuantity;
    return this;
  }

   /**
   * Internal field
   * @return callOffCumulativeQuantity
  **/
  @Schema(description = "Internal field")
  public String getCallOffCumulativeQuantity() {
    return callOffCumulativeQuantity;
  }

  public void setCallOffCumulativeQuantity(String callOffCumulativeQuantity) {
    this.callOffCumulativeQuantity = callOffCumulativeQuantity;
  }

  public Shipment callOffLastDeliveryDate(String callOffLastDeliveryDate) {
    this.callOffLastDeliveryDate = callOffLastDeliveryDate;
    return this;
  }

   /**
   * Internal field
   * @return callOffLastDeliveryDate
  **/
  @Schema(description = "Internal field")
  public String getCallOffLastDeliveryDate() {
    return callOffLastDeliveryDate;
  }

  public void setCallOffLastDeliveryDate(String callOffLastDeliveryDate) {
    this.callOffLastDeliveryDate = callOffLastDeliveryDate;
  }

  public Shipment callOffLastDeliveryNote(String callOffLastDeliveryNote) {
    this.callOffLastDeliveryNote = callOffLastDeliveryNote;
    return this;
  }

   /**
   * Internal field
   * @return callOffLastDeliveryNote
  **/
  @Schema(description = "Internal field")
  public String getCallOffLastDeliveryNote() {
    return callOffLastDeliveryNote;
  }

  public void setCallOffLastDeliveryNote(String callOffLastDeliveryNote) {
    this.callOffLastDeliveryNote = callOffLastDeliveryNote;
  }

  public Shipment unloadingPoint(String unloadingPoint) {
    this.unloadingPoint = unloadingPoint;
    return this;
  }

   /**
   * Internal field
   * @return unloadingPoint
  **/
  @Schema(description = "Internal field")
  public String getUnloadingPoint() {
    return unloadingPoint;
  }

  public void setUnloadingPoint(String unloadingPoint) {
    this.unloadingPoint = unloadingPoint;
  }

  public Shipment customerMark(String customerMark) {
    this.customerMark = customerMark;
    return this;
  }

   /**
   * Internal field
   * @return customerMark
  **/
  @Schema(description = "Internal field")
  public String getCustomerMark() {
    return customerMark;
  }

  public void setCustomerMark(String customerMark) {
    this.customerMark = customerMark;
  }

  public Shipment scannedBy(String scannedBy) {
    this.scannedBy = scannedBy;
    return this;
  }

   /**
   * Internal field
   * @return scannedBy
  **/
  @Schema(description = "Internal field")
  public String getScannedBy() {
    return scannedBy;
  }

  public void setScannedBy(String scannedBy) {
    this.scannedBy = scannedBy;
  }

  public Shipment _return(Boolean _return) {
    this._return = _return;
    return this;
  }

   /**
   * Indicatates that this is a return shipment
   * @return _return
  **/
  @Schema(description = "Indicatates that this is a return shipment")
  public Boolean isReturn() {
    return _return;
  }

  public void setReturn(Boolean _return) {
    this._return = _return;
  }

  public Shipment returnExchange(Boolean returnExchange) {
    this.returnExchange = returnExchange;
    return this;
  }

   /**
   * Indicatates that this is a return of loading device shipment
   * @return returnExchange
  **/
  @Schema(description = "Indicatates that this is a return of loading device shipment")
  public Boolean isReturnExchange() {
    return returnExchange;
  }

  public void setReturnExchange(Boolean returnExchange) {
    this.returnExchange = returnExchange;
  }

  public Shipment idCustomerContact(Integer idCustomerContact) {
    this.idCustomerContact = idCustomerContact;
    return this;
  }

   /**
   * Internal field
   * @return idCustomerContact
  **/
  @Schema(description = "Internal field")
  public Integer getIdCustomerContact() {
    return idCustomerContact;
  }

  public void setIdCustomerContact(Integer idCustomerContact) {
    this.idCustomerContact = idCustomerContact;
  }

  public Shipment idContract(Integer idContract) {
    this.idContract = idContract;
    return this;
  }

   /**
   * Internal field
   * @return idContract
  **/
  @Schema(description = "Internal field")
  public Integer getIdContract() {
    return idContract;
  }

  public void setIdContract(Integer idContract) {
    this.idContract = idContract;
  }

  public Shipment idStockStatus(Integer idStockStatus) {
    this.idStockStatus = idStockStatus;
    return this;
  }

   /**
   * Internal field
   * @return idStockStatus
  **/
  @Schema(description = "Internal field")
  public Integer getIdStockStatus() {
    return idStockStatus;
  }

  public void setIdStockStatus(Integer idStockStatus) {
    this.idStockStatus = idStockStatus;
  }

  public Shipment customer(AllOfShipmentCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public AllOfShipmentCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(AllOfShipmentCustomer customer) {
    this.customer = customer;
  }

  public Shipment invoiceReceiver(AllOfShipmentInvoiceReceiver invoiceReceiver) {
    this.invoiceReceiver = invoiceReceiver;
    return this;
  }

   /**
   * Get invoiceReceiver
   * @return invoiceReceiver
  **/
  @Schema(description = "")
  public AllOfShipmentInvoiceReceiver getInvoiceReceiver() {
    return invoiceReceiver;
  }

  public void setInvoiceReceiver(AllOfShipmentInvoiceReceiver invoiceReceiver) {
    this.invoiceReceiver = invoiceReceiver;
  }

  public Shipment details(List<Detail> details) {
    this.details = details;
    return this;
  }

  public Shipment addDetailsItem(Detail detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(required = true, description = "")
  public List<Detail> getDetails() {
    return details;
  }

  public void setDetails(List<Detail> details) {
    this.details = details;
  }

  public Shipment goodss(List<Goods> goodss) {
    this.goodss = goodss;
    return this;
  }

  public Shipment addGoodssItem(Goods goodssItem) {
    this.goodss.add(goodssItem);
    return this;
  }

   /**
   * Get goodss
   * @return goodss
  **/
  @Schema(required = true, description = "")
  public List<Goods> getGoodss() {
    return goodss;
  }

  public void setGoodss(List<Goods> goodss) {
    this.goodss = goodss;
  }

  public Shipment notifiedGoodss(List<NotifiedGoods> notifiedGoodss) {
    this.notifiedGoodss = notifiedGoodss;
    return this;
  }

  public Shipment addNotifiedGoodssItem(NotifiedGoods notifiedGoodssItem) {
    if (this.notifiedGoodss == null) {
      this.notifiedGoodss = new ArrayList<NotifiedGoods>();
    }
    this.notifiedGoodss.add(notifiedGoodssItem);
    return this;
  }

   /**
   * Get notifiedGoodss
   * @return notifiedGoodss
  **/
  @Schema(description = "")
  public List<NotifiedGoods> getNotifiedGoodss() {
    return notifiedGoodss;
  }

  public void setNotifiedGoodss(List<NotifiedGoods> notifiedGoodss) {
    this.notifiedGoodss = notifiedGoodss;
  }

  public Shipment calloffs(List<Calloff> calloffs) {
    this.calloffs = calloffs;
    return this;
  }

  public Shipment addCalloffsItem(Calloff calloffsItem) {
    if (this.calloffs == null) {
      this.calloffs = new ArrayList<Calloff>();
    }
    this.calloffs.add(calloffsItem);
    return this;
  }

   /**
   * Get calloffs
   * @return calloffs
  **/
  @Schema(description = "")
  public List<Calloff> getCalloffs() {
    return calloffs;
  }

  public void setCalloffs(List<Calloff> calloffs) {
    this.calloffs = calloffs;
  }

  public Shipment uploadedFiles(List<UploadedFile> uploadedFiles) {
    this.uploadedFiles = uploadedFiles;
    return this;
  }

  public Shipment addUploadedFilesItem(UploadedFile uploadedFilesItem) {
    if (this.uploadedFiles == null) {
      this.uploadedFiles = new ArrayList<UploadedFile>();
    }
    this.uploadedFiles.add(uploadedFilesItem);
    return this;
  }

   /**
   * Get uploadedFiles
   * @return uploadedFiles
  **/
  @Schema(description = "")
  public List<UploadedFile> getUploadedFiles() {
    return uploadedFiles;
  }

  public void setUploadedFiles(List<UploadedFile> uploadedFiles) {
    this.uploadedFiles = uploadedFiles;
  }

  public Shipment services(List<Service> services) {
    this.services = services;
    return this;
  }

  public Shipment addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @Schema(description = "")
  public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.idCustomer, shipment.idCustomer) &&
        Objects.equals(this.networkId, shipment.networkId) &&
        Objects.equals(this.edifactId, shipment.edifactId) &&
        Objects.equals(this.customerNumber, shipment.customerNumber) &&
        Objects.equals(this.shipmentNumber, shipment.shipmentNumber) &&
        Objects.equals(this.customerReference, shipment.customerReference) &&
        Objects.equals(this.internalReference, shipment.internalReference) &&
        Objects.equals(this.hawb, shipment.hawb) &&
        Objects.equals(this.shipmentType, shipment.shipmentType) &&
        Objects.equals(this.paymentTerms, shipment.paymentTerms) &&
        Objects.equals(this.branch, shipment.branch) &&
        Objects.equals(this.description, shipment.description) &&
        Objects.equals(this.dropofByCompany, shipment.dropofByCompany) &&
        Objects.equals(this.dropofByVehicle, shipment.dropofByVehicle) &&
        Objects.equals(this.ownCompanyCode, shipment.ownCompanyCode) &&
        Objects.equals(this.idScanningConfig, shipment.idScanningConfig) &&
        Objects.equals(this.plantNumber, shipment.plantNumber) &&
        Objects.equals(this.callOffNumber, shipment.callOffNumber) &&
        Objects.equals(this.callOffDate, shipment.callOffDate) &&
        Objects.equals(this.callOffArticle, shipment.callOffArticle) &&
        Objects.equals(this.callOffCumulativeQuantity, shipment.callOffCumulativeQuantity) &&
        Objects.equals(this.callOffLastDeliveryDate, shipment.callOffLastDeliveryDate) &&
        Objects.equals(this.callOffLastDeliveryNote, shipment.callOffLastDeliveryNote) &&
        Objects.equals(this.unloadingPoint, shipment.unloadingPoint) &&
        Objects.equals(this.customerMark, shipment.customerMark) &&
        Objects.equals(this.scannedBy, shipment.scannedBy) &&
        Objects.equals(this._return, shipment._return) &&
        Objects.equals(this.returnExchange, shipment.returnExchange) &&
        Objects.equals(this.idCustomerContact, shipment.idCustomerContact) &&
        Objects.equals(this.idContract, shipment.idContract) &&
        Objects.equals(this.idStockStatus, shipment.idStockStatus) &&
        Objects.equals(this.customer, shipment.customer) &&
        Objects.equals(this.invoiceReceiver, shipment.invoiceReceiver) &&
        Objects.equals(this.details, shipment.details) &&
        Objects.equals(this.goodss, shipment.goodss) &&
        Objects.equals(this.notifiedGoodss, shipment.notifiedGoodss) &&
        Objects.equals(this.calloffs, shipment.calloffs) &&
        Objects.equals(this.uploadedFiles, shipment.uploadedFiles) &&
        Objects.equals(this.services, shipment.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCustomer, networkId, edifactId, customerNumber, shipmentNumber, customerReference, internalReference, hawb, shipmentType, paymentTerms, branch, description, dropofByCompany, dropofByVehicle, ownCompanyCode, idScanningConfig, plantNumber, callOffNumber, callOffDate, callOffArticle, callOffCumulativeQuantity, callOffLastDeliveryDate, callOffLastDeliveryNote, unloadingPoint, customerMark, scannedBy, _return, returnExchange, idCustomerContact, idContract, idStockStatus, customer, invoiceReceiver, details, goodss, notifiedGoodss, calloffs, uploadedFiles, services);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    idCustomer: ").append(toIndentedString(idCustomer)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    edifactId: ").append(toIndentedString(edifactId)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    shipmentNumber: ").append(toIndentedString(shipmentNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
    sb.append("    hawb: ").append(toIndentedString(hawb)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dropofByCompany: ").append(toIndentedString(dropofByCompany)).append("\n");
    sb.append("    dropofByVehicle: ").append(toIndentedString(dropofByVehicle)).append("\n");
    sb.append("    ownCompanyCode: ").append(toIndentedString(ownCompanyCode)).append("\n");
    sb.append("    idScanningConfig: ").append(toIndentedString(idScanningConfig)).append("\n");
    sb.append("    plantNumber: ").append(toIndentedString(plantNumber)).append("\n");
    sb.append("    callOffNumber: ").append(toIndentedString(callOffNumber)).append("\n");
    sb.append("    callOffDate: ").append(toIndentedString(callOffDate)).append("\n");
    sb.append("    callOffArticle: ").append(toIndentedString(callOffArticle)).append("\n");
    sb.append("    callOffCumulativeQuantity: ").append(toIndentedString(callOffCumulativeQuantity)).append("\n");
    sb.append("    callOffLastDeliveryDate: ").append(toIndentedString(callOffLastDeliveryDate)).append("\n");
    sb.append("    callOffLastDeliveryNote: ").append(toIndentedString(callOffLastDeliveryNote)).append("\n");
    sb.append("    unloadingPoint: ").append(toIndentedString(unloadingPoint)).append("\n");
    sb.append("    customerMark: ").append(toIndentedString(customerMark)).append("\n");
    sb.append("    scannedBy: ").append(toIndentedString(scannedBy)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("    returnExchange: ").append(toIndentedString(returnExchange)).append("\n");
    sb.append("    idCustomerContact: ").append(toIndentedString(idCustomerContact)).append("\n");
    sb.append("    idContract: ").append(toIndentedString(idContract)).append("\n");
    sb.append("    idStockStatus: ").append(toIndentedString(idStockStatus)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    invoiceReceiver: ").append(toIndentedString(invoiceReceiver)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    goodss: ").append(toIndentedString(goodss)).append("\n");
    sb.append("    notifiedGoodss: ").append(toIndentedString(notifiedGoodss)).append("\n");
    sb.append("    calloffs: ").append(toIndentedString(calloffs)).append("\n");
    sb.append("    uploadedFiles: ").append(toIndentedString(uploadedFiles)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
