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
import io.swagger.client.model.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ShipmentList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-30T12:18:39.751063444Z[GMT]")

public class ShipmentList {
  @SerializedName("idshipment")
  private Integer idshipment = null;

  @SerializedName("shipmentnummer")
  private String shipmentnummer = null;

  @SerializedName("customerreference")
  private String customerreference = null;

  @SerializedName("internalreference")
  private String internalreference = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("customername")
  private String customername = null;

  @SerializedName("customeraddress")
  private String customeraddress = null;

  @SerializedName("customerzipcode")
  private String customerzipcode = null;

  @SerializedName("customercity")
  private String customercity = null;

  @SerializedName("sendername")
  private String sendername = null;

  @SerializedName("senderaddress")
  private String senderaddress = null;

  @SerializedName("senderzipcode")
  private String senderzipcode = null;

  @SerializedName("sendercity")
  private String sendercity = null;

  @SerializedName("receivername")
  private String receivername = null;

  @SerializedName("receiveraddress")
  private String receiveraddress = null;

  @SerializedName("receiverzipcode")
  private String receiverzipcode = null;

  @SerializedName("receivercity")
  private String receivercity = null;

  @SerializedName("collecton")
  private String collecton = null;

  @SerializedName("deliveryon")
  private String deliveryon = null;

  @SerializedName("vehicle")
  private String vehicle = null;

  @SerializedName("vehicletype")
  private String vehicletype = null;

  @SerializedName("driver")
  private String driver = null;

  @SerializedName("subcontractor")
  private String subcontractor = null;

  @SerializedName("debtorsaccount")
  private String debtorsaccount = null;

  @SerializedName("creditorsaccount")
  private String creditorsaccount = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("goods")
  private String goods = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("netamount")
  private Double netamount = null;

  @SerializedName("cost")
  private Double cost = null;

  @SerializedName("grossprofit")
  private Double grossprofit = null;

  @SerializedName("distance")
  private Integer distance = null;

  @SerializedName("shipmenttype")
  private String shipmenttype = null;

  @SerializedName("verified")
  private Boolean verified = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("createdon")
  private String createdon = null;

  @SerializedName("createdby")
  private String createdby = null;

  @SerializedName("modifiedon")
  private String modifiedon = null;

  @SerializedName("modifiedby")
  private String modifiedby = null;

  @SerializedName("statusmodifiedon")
  private String statusmodifiedon = null;

  @SerializedName("statusnodes")
  private List<Status> statusnodes = null;

  public ShipmentList idshipment(Integer idshipment) {
    this.idshipment = idshipment;
    return this;
  }

   /**
   * Get idshipment
   * @return idshipment
  **/
  @Schema(description = "")
  public Integer getIdshipment() {
    return idshipment;
  }

  public void setIdshipment(Integer idshipment) {
    this.idshipment = idshipment;
  }

  public ShipmentList shipmentnummer(String shipmentnummer) {
    this.shipmentnummer = shipmentnummer;
    return this;
  }

   /**
   * Get shipmentnummer
   * @return shipmentnummer
  **/
  @Schema(description = "")
  public String getShipmentnummer() {
    return shipmentnummer;
  }

  public void setShipmentnummer(String shipmentnummer) {
    this.shipmentnummer = shipmentnummer;
  }

  public ShipmentList customerreference(String customerreference) {
    this.customerreference = customerreference;
    return this;
  }

   /**
   * Get customerreference
   * @return customerreference
  **/
  @Schema(description = "")
  public String getCustomerreference() {
    return customerreference;
  }

  public void setCustomerreference(String customerreference) {
    this.customerreference = customerreference;
  }

  public ShipmentList internalreference(String internalreference) {
    this.internalreference = internalreference;
    return this;
  }

   /**
   * Get internalreference
   * @return internalreference
  **/
  @Schema(description = "")
  public String getInternalreference() {
    return internalreference;
  }

  public void setInternalreference(String internalreference) {
    this.internalreference = internalreference;
  }

  public ShipmentList contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @Schema(description = "")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public ShipmentList customername(String customername) {
    this.customername = customername;
    return this;
  }

   /**
   * Get customername
   * @return customername
  **/
  @Schema(description = "")
  public String getCustomername() {
    return customername;
  }

  public void setCustomername(String customername) {
    this.customername = customername;
  }

  public ShipmentList customeraddress(String customeraddress) {
    this.customeraddress = customeraddress;
    return this;
  }

   /**
   * Get customeraddress
   * @return customeraddress
  **/
  @Schema(description = "")
  public String getCustomeraddress() {
    return customeraddress;
  }

  public void setCustomeraddress(String customeraddress) {
    this.customeraddress = customeraddress;
  }

  public ShipmentList customerzipcode(String customerzipcode) {
    this.customerzipcode = customerzipcode;
    return this;
  }

   /**
   * Get customerzipcode
   * @return customerzipcode
  **/
  @Schema(description = "")
  public String getCustomerzipcode() {
    return customerzipcode;
  }

  public void setCustomerzipcode(String customerzipcode) {
    this.customerzipcode = customerzipcode;
  }

  public ShipmentList customercity(String customercity) {
    this.customercity = customercity;
    return this;
  }

   /**
   * Get customercity
   * @return customercity
  **/
  @Schema(description = "")
  public String getCustomercity() {
    return customercity;
  }

  public void setCustomercity(String customercity) {
    this.customercity = customercity;
  }

  public ShipmentList sendername(String sendername) {
    this.sendername = sendername;
    return this;
  }

   /**
   * Get sendername
   * @return sendername
  **/
  @Schema(description = "")
  public String getSendername() {
    return sendername;
  }

  public void setSendername(String sendername) {
    this.sendername = sendername;
  }

  public ShipmentList senderaddress(String senderaddress) {
    this.senderaddress = senderaddress;
    return this;
  }

   /**
   * Get senderaddress
   * @return senderaddress
  **/
  @Schema(description = "")
  public String getSenderaddress() {
    return senderaddress;
  }

  public void setSenderaddress(String senderaddress) {
    this.senderaddress = senderaddress;
  }

  public ShipmentList senderzipcode(String senderzipcode) {
    this.senderzipcode = senderzipcode;
    return this;
  }

   /**
   * Get senderzipcode
   * @return senderzipcode
  **/
  @Schema(description = "")
  public String getSenderzipcode() {
    return senderzipcode;
  }

  public void setSenderzipcode(String senderzipcode) {
    this.senderzipcode = senderzipcode;
  }

  public ShipmentList sendercity(String sendercity) {
    this.sendercity = sendercity;
    return this;
  }

   /**
   * Get sendercity
   * @return sendercity
  **/
  @Schema(description = "")
  public String getSendercity() {
    return sendercity;
  }

  public void setSendercity(String sendercity) {
    this.sendercity = sendercity;
  }

  public ShipmentList receivername(String receivername) {
    this.receivername = receivername;
    return this;
  }

   /**
   * Get receivername
   * @return receivername
  **/
  @Schema(description = "")
  public String getReceivername() {
    return receivername;
  }

  public void setReceivername(String receivername) {
    this.receivername = receivername;
  }

  public ShipmentList receiveraddress(String receiveraddress) {
    this.receiveraddress = receiveraddress;
    return this;
  }

   /**
   * Get receiveraddress
   * @return receiveraddress
  **/
  @Schema(description = "")
  public String getReceiveraddress() {
    return receiveraddress;
  }

  public void setReceiveraddress(String receiveraddress) {
    this.receiveraddress = receiveraddress;
  }

  public ShipmentList receiverzipcode(String receiverzipcode) {
    this.receiverzipcode = receiverzipcode;
    return this;
  }

   /**
   * Get receiverzipcode
   * @return receiverzipcode
  **/
  @Schema(description = "")
  public String getReceiverzipcode() {
    return receiverzipcode;
  }

  public void setReceiverzipcode(String receiverzipcode) {
    this.receiverzipcode = receiverzipcode;
  }

  public ShipmentList receivercity(String receivercity) {
    this.receivercity = receivercity;
    return this;
  }

   /**
   * Get receivercity
   * @return receivercity
  **/
  @Schema(description = "")
  public String getReceivercity() {
    return receivercity;
  }

  public void setReceivercity(String receivercity) {
    this.receivercity = receivercity;
  }

  public ShipmentList collecton(String collecton) {
    this.collecton = collecton;
    return this;
  }

   /**
   * Get collecton
   * @return collecton
  **/
  @Schema(description = "")
  public String getCollecton() {
    return collecton;
  }

  public void setCollecton(String collecton) {
    this.collecton = collecton;
  }

  public ShipmentList deliveryon(String deliveryon) {
    this.deliveryon = deliveryon;
    return this;
  }

   /**
   * Get deliveryon
   * @return deliveryon
  **/
  @Schema(description = "")
  public String getDeliveryon() {
    return deliveryon;
  }

  public void setDeliveryon(String deliveryon) {
    this.deliveryon = deliveryon;
  }

  public ShipmentList vehicle(String vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @Schema(description = "")
  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }

  public ShipmentList vehicletype(String vehicletype) {
    this.vehicletype = vehicletype;
    return this;
  }

   /**
   * Get vehicletype
   * @return vehicletype
  **/
  @Schema(description = "")
  public String getVehicletype() {
    return vehicletype;
  }

  public void setVehicletype(String vehicletype) {
    this.vehicletype = vehicletype;
  }

  public ShipmentList driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @Schema(description = "")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public ShipmentList subcontractor(String subcontractor) {
    this.subcontractor = subcontractor;
    return this;
  }

   /**
   * Get subcontractor
   * @return subcontractor
  **/
  @Schema(description = "")
  public String getSubcontractor() {
    return subcontractor;
  }

  public void setSubcontractor(String subcontractor) {
    this.subcontractor = subcontractor;
  }

  public ShipmentList debtorsaccount(String debtorsaccount) {
    this.debtorsaccount = debtorsaccount;
    return this;
  }

   /**
   * Get debtorsaccount
   * @return debtorsaccount
  **/
  @Schema(description = "")
  public String getDebtorsaccount() {
    return debtorsaccount;
  }

  public void setDebtorsaccount(String debtorsaccount) {
    this.debtorsaccount = debtorsaccount;
  }

  public ShipmentList creditorsaccount(String creditorsaccount) {
    this.creditorsaccount = creditorsaccount;
    return this;
  }

   /**
   * Get creditorsaccount
   * @return creditorsaccount
  **/
  @Schema(description = "")
  public String getCreditorsaccount() {
    return creditorsaccount;
  }

  public void setCreditorsaccount(String creditorsaccount) {
    this.creditorsaccount = creditorsaccount;
  }

  public ShipmentList service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ShipmentList goods(String goods) {
    this.goods = goods;
    return this;
  }

   /**
   * Get goods
   * @return goods
  **/
  @Schema(description = "")
  public String getGoods() {
    return goods;
  }

  public void setGoods(String goods) {
    this.goods = goods;
  }

  public ShipmentList unit(String unit) {
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

  public ShipmentList quantity(Integer quantity) {
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

  public ShipmentList weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ShipmentList netamount(Double netamount) {
    this.netamount = netamount;
    return this;
  }

   /**
   * Get netamount
   * @return netamount
  **/
  @Schema(description = "")
  public Double getNetamount() {
    return netamount;
  }

  public void setNetamount(Double netamount) {
    this.netamount = netamount;
  }

  public ShipmentList cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(description = "")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public ShipmentList grossprofit(Double grossprofit) {
    this.grossprofit = grossprofit;
    return this;
  }

   /**
   * Get grossprofit
   * @return grossprofit
  **/
  @Schema(description = "")
  public Double getGrossprofit() {
    return grossprofit;
  }

  public void setGrossprofit(Double grossprofit) {
    this.grossprofit = grossprofit;
  }

  public ShipmentList distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @Schema(description = "")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public ShipmentList shipmenttype(String shipmenttype) {
    this.shipmenttype = shipmenttype;
    return this;
  }

   /**
   * Get shipmenttype
   * @return shipmenttype
  **/
  @Schema(description = "")
  public String getShipmenttype() {
    return shipmenttype;
  }

  public void setShipmenttype(String shipmenttype) {
    this.shipmenttype = shipmenttype;
  }

  public ShipmentList verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @Schema(description = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public ShipmentList status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ShipmentList createdon(String createdon) {
    this.createdon = createdon;
    return this;
  }

   /**
   * Get createdon
   * @return createdon
  **/
  @Schema(description = "")
  public String getCreatedon() {
    return createdon;
  }

  public void setCreatedon(String createdon) {
    this.createdon = createdon;
  }

  public ShipmentList createdby(String createdby) {
    this.createdby = createdby;
    return this;
  }

   /**
   * Get createdby
   * @return createdby
  **/
  @Schema(description = "")
  public String getCreatedby() {
    return createdby;
  }

  public void setCreatedby(String createdby) {
    this.createdby = createdby;
  }

  public ShipmentList modifiedon(String modifiedon) {
    this.modifiedon = modifiedon;
    return this;
  }

   /**
   * Get modifiedon
   * @return modifiedon
  **/
  @Schema(description = "")
  public String getModifiedon() {
    return modifiedon;
  }

  public void setModifiedon(String modifiedon) {
    this.modifiedon = modifiedon;
  }

  public ShipmentList modifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
    return this;
  }

   /**
   * Get modifiedby
   * @return modifiedby
  **/
  @Schema(description = "")
  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }

  public ShipmentList statusmodifiedon(String statusmodifiedon) {
    this.statusmodifiedon = statusmodifiedon;
    return this;
  }

   /**
   * Get statusmodifiedon
   * @return statusmodifiedon
  **/
  @Schema(description = "")
  public String getStatusmodifiedon() {
    return statusmodifiedon;
  }

  public void setStatusmodifiedon(String statusmodifiedon) {
    this.statusmodifiedon = statusmodifiedon;
  }

  public ShipmentList statusnodes(List<Status> statusnodes) {
    this.statusnodes = statusnodes;
    return this;
  }

  public ShipmentList addStatusnodesItem(Status statusnodesItem) {
    if (this.statusnodes == null) {
      this.statusnodes = new ArrayList<Status>();
    }
    this.statusnodes.add(statusnodesItem);
    return this;
  }

   /**
   * Get statusnodes
   * @return statusnodes
  **/
  @Schema(description = "")
  public List<Status> getStatusnodes() {
    return statusnodes;
  }

  public void setStatusnodes(List<Status> statusnodes) {
    this.statusnodes = statusnodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentList shipmentList = (ShipmentList) o;
    return Objects.equals(this.idshipment, shipmentList.idshipment) &&
        Objects.equals(this.shipmentnummer, shipmentList.shipmentnummer) &&
        Objects.equals(this.customerreference, shipmentList.customerreference) &&
        Objects.equals(this.internalreference, shipmentList.internalreference) &&
        Objects.equals(this.contract, shipmentList.contract) &&
        Objects.equals(this.customername, shipmentList.customername) &&
        Objects.equals(this.customeraddress, shipmentList.customeraddress) &&
        Objects.equals(this.customerzipcode, shipmentList.customerzipcode) &&
        Objects.equals(this.customercity, shipmentList.customercity) &&
        Objects.equals(this.sendername, shipmentList.sendername) &&
        Objects.equals(this.senderaddress, shipmentList.senderaddress) &&
        Objects.equals(this.senderzipcode, shipmentList.senderzipcode) &&
        Objects.equals(this.sendercity, shipmentList.sendercity) &&
        Objects.equals(this.receivername, shipmentList.receivername) &&
        Objects.equals(this.receiveraddress, shipmentList.receiveraddress) &&
        Objects.equals(this.receiverzipcode, shipmentList.receiverzipcode) &&
        Objects.equals(this.receivercity, shipmentList.receivercity) &&
        Objects.equals(this.collecton, shipmentList.collecton) &&
        Objects.equals(this.deliveryon, shipmentList.deliveryon) &&
        Objects.equals(this.vehicle, shipmentList.vehicle) &&
        Objects.equals(this.vehicletype, shipmentList.vehicletype) &&
        Objects.equals(this.driver, shipmentList.driver) &&
        Objects.equals(this.subcontractor, shipmentList.subcontractor) &&
        Objects.equals(this.debtorsaccount, shipmentList.debtorsaccount) &&
        Objects.equals(this.creditorsaccount, shipmentList.creditorsaccount) &&
        Objects.equals(this.service, shipmentList.service) &&
        Objects.equals(this.goods, shipmentList.goods) &&
        Objects.equals(this.unit, shipmentList.unit) &&
        Objects.equals(this.quantity, shipmentList.quantity) &&
        Objects.equals(this.weight, shipmentList.weight) &&
        Objects.equals(this.netamount, shipmentList.netamount) &&
        Objects.equals(this.cost, shipmentList.cost) &&
        Objects.equals(this.grossprofit, shipmentList.grossprofit) &&
        Objects.equals(this.distance, shipmentList.distance) &&
        Objects.equals(this.shipmenttype, shipmentList.shipmenttype) &&
        Objects.equals(this.verified, shipmentList.verified) &&
        Objects.equals(this.status, shipmentList.status) &&
        Objects.equals(this.createdon, shipmentList.createdon) &&
        Objects.equals(this.createdby, shipmentList.createdby) &&
        Objects.equals(this.modifiedon, shipmentList.modifiedon) &&
        Objects.equals(this.modifiedby, shipmentList.modifiedby) &&
        Objects.equals(this.statusmodifiedon, shipmentList.statusmodifiedon) &&
        Objects.equals(this.statusnodes, shipmentList.statusnodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idshipment, shipmentnummer, customerreference, internalreference, contract, customername, customeraddress, customerzipcode, customercity, sendername, senderaddress, senderzipcode, sendercity, receivername, receiveraddress, receiverzipcode, receivercity, collecton, deliveryon, vehicle, vehicletype, driver, subcontractor, debtorsaccount, creditorsaccount, service, goods, unit, quantity, weight, netamount, cost, grossprofit, distance, shipmenttype, verified, status, createdon, createdby, modifiedon, modifiedby, statusmodifiedon, statusnodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentList {\n");
    
    sb.append("    idshipment: ").append(toIndentedString(idshipment)).append("\n");
    sb.append("    shipmentnummer: ").append(toIndentedString(shipmentnummer)).append("\n");
    sb.append("    customerreference: ").append(toIndentedString(customerreference)).append("\n");
    sb.append("    internalreference: ").append(toIndentedString(internalreference)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customername: ").append(toIndentedString(customername)).append("\n");
    sb.append("    customeraddress: ").append(toIndentedString(customeraddress)).append("\n");
    sb.append("    customerzipcode: ").append(toIndentedString(customerzipcode)).append("\n");
    sb.append("    customercity: ").append(toIndentedString(customercity)).append("\n");
    sb.append("    sendername: ").append(toIndentedString(sendername)).append("\n");
    sb.append("    senderaddress: ").append(toIndentedString(senderaddress)).append("\n");
    sb.append("    senderzipcode: ").append(toIndentedString(senderzipcode)).append("\n");
    sb.append("    sendercity: ").append(toIndentedString(sendercity)).append("\n");
    sb.append("    receivername: ").append(toIndentedString(receivername)).append("\n");
    sb.append("    receiveraddress: ").append(toIndentedString(receiveraddress)).append("\n");
    sb.append("    receiverzipcode: ").append(toIndentedString(receiverzipcode)).append("\n");
    sb.append("    receivercity: ").append(toIndentedString(receivercity)).append("\n");
    sb.append("    collecton: ").append(toIndentedString(collecton)).append("\n");
    sb.append("    deliveryon: ").append(toIndentedString(deliveryon)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    vehicletype: ").append(toIndentedString(vehicletype)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    subcontractor: ").append(toIndentedString(subcontractor)).append("\n");
    sb.append("    debtorsaccount: ").append(toIndentedString(debtorsaccount)).append("\n");
    sb.append("    creditorsaccount: ").append(toIndentedString(creditorsaccount)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    goods: ").append(toIndentedString(goods)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    netamount: ").append(toIndentedString(netamount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    grossprofit: ").append(toIndentedString(grossprofit)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    shipmenttype: ").append(toIndentedString(shipmenttype)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdon: ").append(toIndentedString(createdon)).append("\n");
    sb.append("    createdby: ").append(toIndentedString(createdby)).append("\n");
    sb.append("    modifiedon: ").append(toIndentedString(modifiedon)).append("\n");
    sb.append("    modifiedby: ").append(toIndentedString(modifiedby)).append("\n");
    sb.append("    statusmodifiedon: ").append(toIndentedString(statusmodifiedon)).append("\n");
    sb.append("    statusnodes: ").append(toIndentedString(statusnodes)).append("\n");
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
