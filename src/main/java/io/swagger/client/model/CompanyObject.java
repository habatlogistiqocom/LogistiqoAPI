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
 * CompanyObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-09T10:01:07.112410758Z[GMT]")

public class CompanyObject {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("companyType")
  private Integer companyType = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("edifactId")
  private String edifactId = null;

  @SerializedName("networkId")
  private Integer networkId = null;

  @SerializedName("vatId")
  private String vatId = null;

  @SerializedName("stripeCustomerId")
  private String stripeCustomerId = null;

  @SerializedName("address")
  private AllOfCompanyObjectAddress address = null;

  public CompanyObject id(Integer id) {
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

  public CompanyObject number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * If you have the company number available in Logistiqo, please enter it in this field. In that case, no other company or address fields are required. However, if the company number not known or the company is new, please make sure to fill out all the other necessary company and address fields
   * @return number
  **/
  @Schema(example = "102", description = "If you have the company number available in Logistiqo, please enter it in this field. In that case, no other company or address fields are required. However, if the company number not known or the company is new, please make sure to fill out all the other necessary company and address fields")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public CompanyObject companyType(Integer companyType) {
    this.companyType = companyType;
    return this;
  }

   /**
   * 1 &#x3D; company, 3 &#x3D; customer, 4 &#x3D; subcontractor
   * @return companyType
  **/
  @Schema(example = "3", description = "1 = company, 3 = customer, 4 = subcontractor")
  public Integer getCompanyType() {
    return companyType;
  }

  public void setCompanyType(Integer companyType) {
    this.companyType = companyType;
  }

  public CompanyObject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "RSTERLING", description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CompanyObject edifactId(String edifactId) {
    this.edifactId = edifactId;
    return this;
  }

   /**
   * Get edifactId
   * @return edifactId
  **/
  @Schema(description = "")
  public String getEdifactId() {
    return edifactId;
  }

  public void setEdifactId(String edifactId) {
    this.edifactId = edifactId;
  }

  public CompanyObject networkId(Integer networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/
  @Schema(description = "")
  public Integer getNetworkId() {
    return networkId;
  }

  public void setNetworkId(Integer networkId) {
    this.networkId = networkId;
  }

  public CompanyObject vatId(String vatId) {
    this.vatId = vatId;
    return this;
  }

   /**
   * Get vatId
   * @return vatId
  **/
  @Schema(example = "DE64987444", description = "")
  public String getVatId() {
    return vatId;
  }

  public void setVatId(String vatId) {
    this.vatId = vatId;
  }

  public CompanyObject stripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
    return this;
  }

   /**
   * Get stripeCustomerId
   * @return stripeCustomerId
  **/
  @Schema(description = "")
  public String getStripeCustomerId() {
    return stripeCustomerId;
  }

  public void setStripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
  }

  public CompanyObject address(AllOfCompanyObjectAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public AllOfCompanyObjectAddress getAddress() {
    return address;
  }

  public void setAddress(AllOfCompanyObjectAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyObject companyObject = (CompanyObject) o;
    return Objects.equals(this.id, companyObject.id) &&
        Objects.equals(this.number, companyObject.number) &&
        Objects.equals(this.companyType, companyObject.companyType) &&
        Objects.equals(this.code, companyObject.code) &&
        Objects.equals(this.edifactId, companyObject.edifactId) &&
        Objects.equals(this.networkId, companyObject.networkId) &&
        Objects.equals(this.vatId, companyObject.vatId) &&
        Objects.equals(this.stripeCustomerId, companyObject.stripeCustomerId) &&
        Objects.equals(this.address, companyObject.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, companyType, code, edifactId, networkId, vatId, stripeCustomerId, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    edifactId: ").append(toIndentedString(edifactId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    vatId: ").append(toIndentedString(vatId)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
