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
 * NotifiedGoods
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-30T12:18:39.751063444Z[GMT]")

public class NotifiedGoods {
  @SerializedName("pos")
  private Integer pos = null;

  @SerializedName("articleNumber")
  private String articleNumber = null;

  @SerializedName("articleName")
  private String articleName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("lotNumber")
  private String lotNumber = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("pieces")
  private Integer pieces = 1;

  @SerializedName("weight")
  private Double weight = 0d;

  @SerializedName("volume")
  private Double volume = 0d;

  @SerializedName("length")
  private Integer length = 0;

  @SerializedName("width")
  private Integer width = 0;

  @SerializedName("height")
  private Integer height = 0;

  @SerializedName("importId")
  private String importId = null;

  public NotifiedGoods pos(Integer pos) {
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

  public NotifiedGoods articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Provide a concise Article Number of the notified goods.
   * @return articleNumber
  **/
  @Schema(description = "Provide a concise Article Number of the notified goods.")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public NotifiedGoods articleName(String articleName) {
    this.articleName = articleName;
    return this;
  }

   /**
   * Provide a concise Article Name of the notified goods.
   * @return articleName
  **/
  @Schema(description = "Provide a concise Article Name of the notified goods.")
  public String getArticleName() {
    return articleName;
  }

  public void setArticleName(String articleName) {
    this.articleName = articleName;
  }

  public NotifiedGoods description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Provide a description for the notified goods item.
   * @return description
  **/
  @Schema(description = "Provide a description for the notified goods item.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotifiedGoods serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Provide a barcode for the notified goods item.
   * @return serialNumber
  **/
  @Schema(description = "Provide a barcode for the notified goods item.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public NotifiedGoods lotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
    return this;
  }

   /**
   * Provide a lot number for the notified goods item.
   * @return lotNumber
  **/
  @Schema(description = "Provide a lot number for the notified goods item.")
  public String getLotNumber() {
    return lotNumber;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public NotifiedGoods unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Enter the name of the packaging used for the for the notified goods item. If the unit does not exist in the Logistiqo system, it will be created.
   * @return unit
  **/
  @Schema(example = "Europalette, Euro pallet, St?ck, Colli, Box", description = "Enter the name of the packaging used for the for the notified goods item. If the unit does not exist in the Logistiqo system, it will be created.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public NotifiedGoods pieces(Integer pieces) {
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

  public NotifiedGoods weight(Double weight) {
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

  public NotifiedGoods volume(Double volume) {
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

  public NotifiedGoods length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * When entering the length of the goods item, use centimeters (cm) as the unit of measurement.
   * @return length
  **/
  @Schema(example = "80", description = "When entering the length of the goods item, use centimeters (cm) as the unit of measurement.")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public NotifiedGoods width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * When entering the width of the goods item, use centimeters (cm) as the unit of measurement.
   * @return width
  **/
  @Schema(example = "70", description = "When entering the width of the goods item, use centimeters (cm) as the unit of measurement.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public NotifiedGoods height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * When entering the height of the goods item, use centimeters (cm) as the unit of measurement.
   * @return height
  **/
  @Schema(example = "100", description = "When entering the height of the goods item, use centimeters (cm) as the unit of measurement.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public NotifiedGoods importId(String importId) {
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
    NotifiedGoods notifiedGoods = (NotifiedGoods) o;
    return Objects.equals(this.pos, notifiedGoods.pos) &&
        Objects.equals(this.articleNumber, notifiedGoods.articleNumber) &&
        Objects.equals(this.articleName, notifiedGoods.articleName) &&
        Objects.equals(this.description, notifiedGoods.description) &&
        Objects.equals(this.serialNumber, notifiedGoods.serialNumber) &&
        Objects.equals(this.lotNumber, notifiedGoods.lotNumber) &&
        Objects.equals(this.unit, notifiedGoods.unit) &&
        Objects.equals(this.pieces, notifiedGoods.pieces) &&
        Objects.equals(this.weight, notifiedGoods.weight) &&
        Objects.equals(this.volume, notifiedGoods.volume) &&
        Objects.equals(this.length, notifiedGoods.length) &&
        Objects.equals(this.width, notifiedGoods.width) &&
        Objects.equals(this.height, notifiedGoods.height) &&
        Objects.equals(this.importId, notifiedGoods.importId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, articleNumber, articleName, description, serialNumber, lotNumber, unit, pieces, weight, volume, length, width, height, importId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifiedGoods {\n");
    
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    articleName: ").append(toIndentedString(articleName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    lotNumber: ").append(toIndentedString(lotNumber)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    pieces: ").append(toIndentedString(pieces)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
