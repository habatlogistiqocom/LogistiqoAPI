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
 * InvoiceContracts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-03T12:45:05.403669596Z[GMT]")

public class InvoiceContracts {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("contractDetail")
  private AllOfInvoiceContractsContractDetail contractDetail = null;

  @SerializedName("startDate")
  private String startDate = null;

  @SerializedName("endDate")
  private String endDate = null;

  @SerializedName("position")
  private Integer position = null;

  public InvoiceContracts id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the ContractDetail.
   * @return id
  **/
  @Schema(description = "The unique identifier for the ContractDetail.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InvoiceContracts contractDetail(AllOfInvoiceContractsContractDetail contractDetail) {
    this.contractDetail = contractDetail;
    return this;
  }

   /**
   * The unique identifier for the associated ContractDetail.
   * @return contractDetail
  **/
  @Schema(description = "The unique identifier for the associated ContractDetail.")
  public AllOfInvoiceContractsContractDetail getContractDetail() {
    return contractDetail;
  }

  public void setContractDetail(AllOfInvoiceContractsContractDetail contractDetail) {
    this.contractDetail = contractDetail;
  }

  public InvoiceContracts startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the ContractDetail.
   * @return startDate
  **/
  @Schema(description = "The start date of the ContractDetail.")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public InvoiceContracts endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the ContractDetail.
   * @return endDate
  **/
  @Schema(description = "The end date of the ContractDetail.")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public InvoiceContracts position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of the ContractDetail.
   * @return position
  **/
  @Schema(description = "The position of the ContractDetail.")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceContracts invoiceContracts = (InvoiceContracts) o;
    return Objects.equals(this.id, invoiceContracts.id) &&
        Objects.equals(this.contractDetail, invoiceContracts.contractDetail) &&
        Objects.equals(this.startDate, invoiceContracts.startDate) &&
        Objects.equals(this.endDate, invoiceContracts.endDate) &&
        Objects.equals(this.position, invoiceContracts.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contractDetail, startDate, endDate, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceContracts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractDetail: ").append(toIndentedString(contractDetail)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
