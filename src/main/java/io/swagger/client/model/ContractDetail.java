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
 * ContractDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-08T15:23:34.163430093Z[GMT]")

public class ContractDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("idContract")
  private Integer idContract = null;

  @SerializedName("overrideRevenueAccount")
  private Boolean overrideRevenueAccount = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("inactive")
  private Boolean inactive = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public ContractDetail id(Integer id) {
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

  public ContractDetail idContract(Integer idContract) {
    this.idContract = idContract;
    return this;
  }

   /**
   * Get idContract
   * @return idContract
  **/
  @Schema(description = "")
  public Integer getIdContract() {
    return idContract;
  }

  public void setIdContract(Integer idContract) {
    this.idContract = idContract;
  }

  public ContractDetail overrideRevenueAccount(Boolean overrideRevenueAccount) {
    this.overrideRevenueAccount = overrideRevenueAccount;
    return this;
  }

   /**
   * Get overrideRevenueAccount
   * @return overrideRevenueAccount
  **/
  @Schema(description = "")
  public Boolean isOverrideRevenueAccount() {
    return overrideRevenueAccount;
  }

  public void setOverrideRevenueAccount(Boolean overrideRevenueAccount) {
    this.overrideRevenueAccount = overrideRevenueAccount;
  }

  public ContractDetail position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @Schema(description = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ContractDetail startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ContractDetail endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ContractDetail inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @Schema(description = "")
  public Boolean isInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public ContractDetail quantity(Integer quantity) {
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

  public ContractDetail unit(String unit) {
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

  public ContractDetail amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ContractDetail code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ContractDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContractDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractDetail contractDetail = (ContractDetail) o;
    return Objects.equals(this.id, contractDetail.id) &&
        Objects.equals(this.idContract, contractDetail.idContract) &&
        Objects.equals(this.overrideRevenueAccount, contractDetail.overrideRevenueAccount) &&
        Objects.equals(this.position, contractDetail.position) &&
        Objects.equals(this.startDate, contractDetail.startDate) &&
        Objects.equals(this.endDate, contractDetail.endDate) &&
        Objects.equals(this.inactive, contractDetail.inactive) &&
        Objects.equals(this.quantity, contractDetail.quantity) &&
        Objects.equals(this.unit, contractDetail.unit) &&
        Objects.equals(this.amount, contractDetail.amount) &&
        Objects.equals(this.code, contractDetail.code) &&
        Objects.equals(this.name, contractDetail.name) &&
        Objects.equals(this.description, contractDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idContract, overrideRevenueAccount, position, startDate, endDate, inactive, quantity, unit, amount, code, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idContract: ").append(toIndentedString(idContract)).append("\n");
    sb.append("    overrideRevenueAccount: ").append(toIndentedString(overrideRevenueAccount)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
