/*
 * LogistiqoAPI
 * An API, or Application Programming Interface, is a set of protocols, routines, and tools that enable different software applications to communicate and exchange data with each other. It defines how software components should interact and helps to simplify software development by abstracting the underlying implementation. APIs are essential for building complex and interconnected software systems.
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
 * Goods
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-12T08:16:30.674626260Z[GMT]")

public class Goods {
  @SerializedName("pos")
  private Integer pos = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("articleName")
  private String articleName = null;

  @SerializedName("articleNumber")
  private String articleNumber = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("constructionIndex")
  private String constructionIndex = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("loadCarrier")
  private String loadCarrier = null;

  @SerializedName("lotNumber")
  private String lotNumber = null;

  @SerializedName("warehouseSlot")
  private String warehouseSlot = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("pieces")
  private Integer pieces = null;

  @SerializedName("weight")
  private Double weight = null;

  @SerializedName("volume")
  private Double volume = null;

  @SerializedName("ldm")
  private Double ldm = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("setpoint")
  private Boolean setpoint = false;

  @SerializedName("codAmount")
  private Double codAmount = 0d;

  @SerializedName("goodsValue")
  private Double goodsValue = 0d;

  @SerializedName("supplier")
  private String supplier = null;

  @SerializedName("largeLoadCarriers")
  private Integer largeLoadCarriers = 0;

  @SerializedName("smallLoadCarriers")
  private Integer smallLoadCarriers = 0;

  @SerializedName("temperatureRange")
  private String temperatureRange = null;

  @SerializedName("maxTemp")
  private Double maxTemp = null;

  @SerializedName("minTemp")
  private Double minTemp = null;

  @SerializedName("xray")
  private Boolean xray = false;

  @SerializedName("stackable")
  private Boolean stackable = false;

  @SerializedName("shockwatch")
  private Boolean shockwatch = false;

  @SerializedName("addPieces")
  private Integer addPieces = 0;

  @SerializedName("receiptId")
  private Integer receiptId = 0;

  @SerializedName("importId")
  private String importId = null;

  public Goods pos(Integer pos) {
    this.pos = pos;
    return this;
  }

   /**
   * When entering a new goods item into the goods array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item
   * @return pos
  **/
  @Schema(example = "1", description = "When entering a new goods item into the goods array, make sure to start with position 1 for the first item and add 1 to the position of the previous item for each subsequent item")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Goods name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Provide a name of the goods.
   * @return name
  **/
  @Schema(description = "Provide a name of the goods.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Goods description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Provide a description of the goods.
   * @return description
  **/
  @Schema(description = "Provide a description of the goods.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Goods articleName(String articleName) {
    this.articleName = articleName;
    return this;
  }

   /**
   * Please provide the name of the article. This field is exclusively utilized in warehousing to monitor the stock balance for each individual item. 
   * @return articleName
  **/
  @Schema(description = "Please provide the name of the article. This field is exclusively utilized in warehousing to monitor the stock balance for each individual item. ")
  public String getArticleName() {
    return articleName;
  }

  public void setArticleName(String articleName) {
    this.articleName = articleName;
  }

  public Goods articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Please provide the number of the article. This field is exclusively utilized in warehousing to monitor the stock balance for each individual item.
   * @return articleNumber
  **/
  @Schema(description = "Please provide the number of the article. This field is exclusively utilized in warehousing to monitor the stock balance for each individual item.")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public Goods reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Provide a reference of the goods.
   * @return reference
  **/
  @Schema(description = "Provide a reference of the goods.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Goods constructionIndex(String constructionIndex) {
    this.constructionIndex = constructionIndex;
    return this;
  }

   /**
   * This field exclusively pertains to VDA and warehouse monitoring purposes.
   * @return constructionIndex
  **/
  @Schema(description = "This field exclusively pertains to VDA and warehouse monitoring purposes.")
  public String getConstructionIndex() {
    return constructionIndex;
  }

  public void setConstructionIndex(String constructionIndex) {
    this.constructionIndex = constructionIndex;
  }

  public Goods serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * This field exclusively pertains to warehouse monitoring purposes.
   * @return serialNumber
  **/
  @Schema(description = "This field exclusively pertains to warehouse monitoring purposes.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Goods loadCarrier(String loadCarrier) {
    this.loadCarrier = loadCarrier;
    return this;
  }

   /**
   * This field exclusively pertains to warehouse monitoring purposes.
   * @return loadCarrier
  **/
  @Schema(description = "This field exclusively pertains to warehouse monitoring purposes.")
  public String getLoadCarrier() {
    return loadCarrier;
  }

  public void setLoadCarrier(String loadCarrier) {
    this.loadCarrier = loadCarrier;
  }

  public Goods lotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
    return this;
  }

   /**
   * This field exclusively pertains to warehouse monitoring purposes.
   * @return lotNumber
  **/
  @Schema(description = "This field exclusively pertains to warehouse monitoring purposes.")
  public String getLotNumber() {
    return lotNumber;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public Goods warehouseSlot(String warehouseSlot) {
    this.warehouseSlot = warehouseSlot;
    return this;
  }

   /**
   * This field exclusively pertains to warehouse monitoring purposes.
   * @return warehouseSlot
  **/
  @Schema(description = "This field exclusively pertains to warehouse monitoring purposes.")
  public String getWarehouseSlot() {
    return warehouseSlot;
  }

  public void setWarehouseSlot(String warehouseSlot) {
    this.warehouseSlot = warehouseSlot;
  }

  public Goods unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Enter the name of the packaging used for the goods.If the unit does not exist in the Logistiqo system, it will be created.
   * @return unit
  **/
  @Schema(example = "Europalette, Euro pallet, Stück, Colli, Box", description = "Enter the name of the packaging used for the goods.If the unit does not exist in the Logistiqo system, it will be created.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Goods pieces(Integer pieces) {
    this.pieces = pieces;
    return this;
  }

   /**
   * Get pieces
   * @return pieces
  **/
  @Schema(example = "4", description = "")
  public Integer getPieces() {
    return pieces;
  }

  public void setPieces(Integer pieces) {
    this.pieces = pieces;
  }

  public Goods weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * When entering the total weight of the goods item, use kilograms as the unit of measurement and a dot as the decimal separator.
   * @return weight
  **/
  @Schema(example = "12.5", description = "When entering the total weight of the goods item, use kilograms as the unit of measurement and a dot as the decimal separator.")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Goods volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * When entering the total volume of the goods item, use kilograms as the unit of measurement and a dot as the decimal separator.
   * @return volume
  **/
  @Schema(example = "1.2", description = "When entering the total volume of the goods item, use kilograms as the unit of measurement and a dot as the decimal separator.")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Goods ldm(Double ldm) {
    this.ldm = ldm;
    return this;
  }

   /**
   * Get ldm
   * @return ldm
  **/
  @Schema(example = "5.2", description = "")
  public Double getLdm() {
    return ldm;
  }

  public void setLdm(Double ldm) {
    this.ldm = ldm;
  }

  public Goods length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Please enter the length of the goods item using centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.
   * @return length
  **/
  @Schema(example = "80", description = "Please enter the length of the goods item using centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Goods width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * When entering the width of the goods item, use centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.
   * @return width
  **/
  @Schema(example = "70", description = "When entering the width of the goods item, use centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Goods height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * When entering the height of the goods item, use centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.
   * @return height
  **/
  @Schema(example = "100", description = "When entering the height of the goods item, use centimeters (cm) as the unit of measurement. If you need to use a different unit of measurement, you can define it in the Logistiqo application. For further assistance, please reach out to our support team.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Goods setpoint(Boolean setpoint) {
    this.setpoint = setpoint;
    return this;
  }

   /**
   * This indicates whether the goods item requires a setpoint temperature or not.
   * @return setpoint
  **/
  @Schema(example = "true", description = "This indicates whether the goods item requires a setpoint temperature or not.")
  public Boolean isSetpoint() {
    return setpoint;
  }

  public void setSetpoint(Boolean setpoint) {
    this.setpoint = setpoint;
  }

  public Goods codAmount(Double codAmount) {
    this.codAmount = codAmount;
    return this;
  }

   /**
   * Get codAmount
   * @return codAmount
  **/
  @Schema(description = "")
  public Double getCodAmount() {
    return codAmount;
  }

  public void setCodAmount(Double codAmount) {
    this.codAmount = codAmount;
  }

  public Goods goodsValue(Double goodsValue) {
    this.goodsValue = goodsValue;
    return this;
  }

   /**
   * Get goodsValue
   * @return goodsValue
  **/
  @Schema(description = "")
  public Double getGoodsValue() {
    return goodsValue;
  }

  public void setGoodsValue(Double goodsValue) {
    this.goodsValue = goodsValue;
  }

  public Goods supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @Schema(description = "")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public Goods largeLoadCarriers(Integer largeLoadCarriers) {
    this.largeLoadCarriers = largeLoadCarriers;
    return this;
  }

   /**
   * Get largeLoadCarriers
   * @return largeLoadCarriers
  **/
  @Schema(description = "")
  public Integer getLargeLoadCarriers() {
    return largeLoadCarriers;
  }

  public void setLargeLoadCarriers(Integer largeLoadCarriers) {
    this.largeLoadCarriers = largeLoadCarriers;
  }

  public Goods smallLoadCarriers(Integer smallLoadCarriers) {
    this.smallLoadCarriers = smallLoadCarriers;
    return this;
  }

   /**
   * Get smallLoadCarriers
   * @return smallLoadCarriers
  **/
  @Schema(description = "")
  public Integer getSmallLoadCarriers() {
    return smallLoadCarriers;
  }

  public void setSmallLoadCarriers(Integer smallLoadCarriers) {
    this.smallLoadCarriers = smallLoadCarriers;
  }

  public Goods temperatureRange(String temperatureRange) {
    this.temperatureRange = temperatureRange;
    return this;
  }

   /**
   * This field corresponds to the TemperatureRange table in the Logistiqo application. If a temperature range is entered that is not available in Logistiqo, it will be created. However, please note that the actual range must be manually entered in Logistiqo afterwards.
   * @return temperatureRange
  **/
  @Schema(example = "TC02", description = "This field corresponds to the TemperatureRange table in the Logistiqo application. If a temperature range is entered that is not available in Logistiqo, it will be created. However, please note that the actual range must be manually entered in Logistiqo afterwards.")
  public String getTemperatureRange() {
    return temperatureRange;
  }

  public void setTemperatureRange(String temperatureRange) {
    this.temperatureRange = temperatureRange;
  }

  public Goods maxTemp(Double maxTemp) {
    this.maxTemp = maxTemp;
    return this;
  }

   /**
   * Get maxTemp
   * @return maxTemp
  **/
  @Schema(description = "")
  public Double getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(Double maxTemp) {
    this.maxTemp = maxTemp;
  }

  public Goods minTemp(Double minTemp) {
    this.minTemp = minTemp;
    return this;
  }

   /**
   * Get minTemp
   * @return minTemp
  **/
  @Schema(description = "")
  public Double getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(Double minTemp) {
    this.minTemp = minTemp;
  }

  public Goods xray(Boolean xray) {
    this.xray = xray;
    return this;
  }

   /**
   * This field indicates that the described goods must undergo screening.
   * @return xray
  **/
  @Schema(description = "This field indicates that the described goods must undergo screening.")
  public Boolean isXray() {
    return xray;
  }

  public void setXray(Boolean xray) {
    this.xray = xray;
  }

  public Goods stackable(Boolean stackable) {
    this.stackable = stackable;
    return this;
  }

   /**
   * This field indicates that the described goods are stackable in both the warehouse and during transport.
   * @return stackable
  **/
  @Schema(description = "This field indicates that the described goods are stackable in both the warehouse and during transport.")
  public Boolean isStackable() {
    return stackable;
  }

  public void setStackable(Boolean stackable) {
    this.stackable = stackable;
  }

  public Goods shockwatch(Boolean shockwatch) {
    this.shockwatch = shockwatch;
    return this;
  }

   /**
   * This field indicates that the described goods must be monitored with a shockwatch device.
   * @return shockwatch
  **/
  @Schema(description = "This field indicates that the described goods must be monitored with a shockwatch device.")
  public Boolean isShockwatch() {
    return shockwatch;
  }

  public void setShockwatch(Boolean shockwatch) {
    this.shockwatch = shockwatch;
  }

  public Goods addPieces(Integer addPieces) {
    this.addPieces = addPieces;
    return this;
  }

   /**
   * Internal field
   * @return addPieces
  **/
  @Schema(description = "Internal field")
  public Integer getAddPieces() {
    return addPieces;
  }

  public void setAddPieces(Integer addPieces) {
    this.addPieces = addPieces;
  }

  public Goods receiptId(Integer receiptId) {
    this.receiptId = receiptId;
    return this;
  }

   /**
   * Internal field
   * @return receiptId
  **/
  @Schema(description = "Internal field")
  public Integer getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(Integer receiptId) {
    this.receiptId = receiptId;
  }

  public Goods importId(String importId) {
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
    Goods goods = (Goods) o;
    return Objects.equals(this.pos, goods.pos) &&
        Objects.equals(this.name, goods.name) &&
        Objects.equals(this.description, goods.description) &&
        Objects.equals(this.articleName, goods.articleName) &&
        Objects.equals(this.articleNumber, goods.articleNumber) &&
        Objects.equals(this.reference, goods.reference) &&
        Objects.equals(this.constructionIndex, goods.constructionIndex) &&
        Objects.equals(this.serialNumber, goods.serialNumber) &&
        Objects.equals(this.loadCarrier, goods.loadCarrier) &&
        Objects.equals(this.lotNumber, goods.lotNumber) &&
        Objects.equals(this.warehouseSlot, goods.warehouseSlot) &&
        Objects.equals(this.unit, goods.unit) &&
        Objects.equals(this.pieces, goods.pieces) &&
        Objects.equals(this.weight, goods.weight) &&
        Objects.equals(this.volume, goods.volume) &&
        Objects.equals(this.ldm, goods.ldm) &&
        Objects.equals(this.length, goods.length) &&
        Objects.equals(this.width, goods.width) &&
        Objects.equals(this.height, goods.height) &&
        Objects.equals(this.setpoint, goods.setpoint) &&
        Objects.equals(this.codAmount, goods.codAmount) &&
        Objects.equals(this.goodsValue, goods.goodsValue) &&
        Objects.equals(this.supplier, goods.supplier) &&
        Objects.equals(this.largeLoadCarriers, goods.largeLoadCarriers) &&
        Objects.equals(this.smallLoadCarriers, goods.smallLoadCarriers) &&
        Objects.equals(this.temperatureRange, goods.temperatureRange) &&
        Objects.equals(this.maxTemp, goods.maxTemp) &&
        Objects.equals(this.minTemp, goods.minTemp) &&
        Objects.equals(this.xray, goods.xray) &&
        Objects.equals(this.stackable, goods.stackable) &&
        Objects.equals(this.shockwatch, goods.shockwatch) &&
        Objects.equals(this.addPieces, goods.addPieces) &&
        Objects.equals(this.receiptId, goods.receiptId) &&
        Objects.equals(this.importId, goods.importId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, name, description, articleName, articleNumber, reference, constructionIndex, serialNumber, loadCarrier, lotNumber, warehouseSlot, unit, pieces, weight, volume, ldm, length, width, height, setpoint, codAmount, goodsValue, supplier, largeLoadCarriers, smallLoadCarriers, temperatureRange, maxTemp, minTemp, xray, stackable, shockwatch, addPieces, receiptId, importId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Goods {\n");
    
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    articleName: ").append(toIndentedString(articleName)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    constructionIndex: ").append(toIndentedString(constructionIndex)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    loadCarrier: ").append(toIndentedString(loadCarrier)).append("\n");
    sb.append("    lotNumber: ").append(toIndentedString(lotNumber)).append("\n");
    sb.append("    warehouseSlot: ").append(toIndentedString(warehouseSlot)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    ldm: ").append(toIndentedString(ldm)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    setpoint: ").append(toIndentedString(setpoint)).append("\n");
    sb.append("    codAmount: ").append(toIndentedString(codAmount)).append("\n");
    sb.append("    goodsValue: ").append(toIndentedString(goodsValue)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    largeLoadCarriers: ").append(toIndentedString(largeLoadCarriers)).append("\n");
    sb.append("    smallLoadCarriers: ").append(toIndentedString(smallLoadCarriers)).append("\n");
    sb.append("    temperatureRange: ").append(toIndentedString(temperatureRange)).append("\n");
    sb.append("    maxTemp: ").append(toIndentedString(maxTemp)).append("\n");
    sb.append("    minTemp: ").append(toIndentedString(minTemp)).append("\n");
    sb.append("    xray: ").append(toIndentedString(xray)).append("\n");
    sb.append("    stackable: ").append(toIndentedString(stackable)).append("\n");
    sb.append("    shockwatch: ").append(toIndentedString(shockwatch)).append("\n");
    sb.append("    addPieces: ").append(toIndentedString(addPieces)).append("\n");
    sb.append("    receiptId: ").append(toIndentedString(receiptId)).append("\n");
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
