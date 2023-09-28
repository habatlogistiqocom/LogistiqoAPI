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
import io.swagger.client.model.DirectDetail;
import io.swagger.client.model.InvoiceContract;
import io.swagger.client.model.InvoiceShipment;
import io.swagger.client.model.UploadedFile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Invoice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-27T20:32:41.655864578Z[GMT]")

public class Invoice {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("invoiceDate")
  private String invoiceDate = null;

  @SerializedName("postingDate")
  private String postingDate = null;

  @SerializedName("invoiceText")
  private String invoiceText = null;

  @SerializedName("companyNote")
  private String companyNote = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("dueDate")
  private String dueDate = null;

  @SerializedName("invoiceAmount")
  private Double invoiceAmount = null;

  @SerializedName("vatAmount")
  private Double vatAmount = null;

  @SerializedName("printed")
  private Boolean printed = null;

  @SerializedName("mailed")
  private Boolean mailed = null;

  @SerializedName("paid")
  private Boolean paid = null;

  @SerializedName("paidOn")
  private String paidOn = null;

  @SerializedName("personYourRef")
  private AllOfInvoicePersonYourRef personYourRef = null;

  @SerializedName("personOwrRef")
  private AllOfInvoicePersonOwrRef personOwrRef = null;

  @SerializedName("paymentTerms")
  private AllOfInvoicePaymentTerms paymentTerms = null;

  @SerializedName("customer")
  private AllOfInvoiceCustomer customer = null;

  @SerializedName("invoiceReceiver")
  private AllOfInvoiceInvoiceReceiver invoiceReceiver = null;

  @SerializedName("directDetails")
  private List<DirectDetail> directDetails = null;

  @SerializedName("invoiceContracts")
  private List<InvoiceContract> invoiceContracts = null;

  @SerializedName("invoiceShipments")
  private List<InvoiceShipment> invoiceShipments = null;

  @SerializedName("pdf")
  private List<UploadedFile> pdf = null;

  public Invoice id(Integer id) {
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

  public Invoice number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(description = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Invoice invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @Schema(description = "")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Invoice postingDate(String postingDate) {
    this.postingDate = postingDate;
    return this;
  }

   /**
   * Get postingDate
   * @return postingDate
  **/
  @Schema(description = "")
  public String getPostingDate() {
    return postingDate;
  }

  public void setPostingDate(String postingDate) {
    this.postingDate = postingDate;
  }

  public Invoice invoiceText(String invoiceText) {
    this.invoiceText = invoiceText;
    return this;
  }

   /**
   * Get invoiceText
   * @return invoiceText
  **/
  @Schema(description = "")
  public String getInvoiceText() {
    return invoiceText;
  }

  public void setInvoiceText(String invoiceText) {
    this.invoiceText = invoiceText;
  }

  public Invoice companyNote(String companyNote) {
    this.companyNote = companyNote;
    return this;
  }

   /**
   * Get companyNote
   * @return companyNote
  **/
  @Schema(description = "")
  public String getCompanyNote() {
    return companyNote;
  }

  public void setCompanyNote(String companyNote) {
    this.companyNote = companyNote;
  }

  public Invoice period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Schema(description = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Invoice dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @Schema(description = "")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice invoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * Get invoiceAmount
   * @return invoiceAmount
  **/
  @Schema(description = "")
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public Invoice vatAmount(Double vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * Get vatAmount
   * @return vatAmount
  **/
  @Schema(description = "")
  public Double getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(Double vatAmount) {
    this.vatAmount = vatAmount;
  }

  public Invoice printed(Boolean printed) {
    this.printed = printed;
    return this;
  }

   /**
   * Get printed
   * @return printed
  **/
  @Schema(description = "")
  public Boolean isPrinted() {
    return printed;
  }

  public void setPrinted(Boolean printed) {
    this.printed = printed;
  }

  public Invoice mailed(Boolean mailed) {
    this.mailed = mailed;
    return this;
  }

   /**
   * Get mailed
   * @return mailed
  **/
  @Schema(description = "")
  public Boolean isMailed() {
    return mailed;
  }

  public void setMailed(Boolean mailed) {
    this.mailed = mailed;
  }

  public Invoice paid(Boolean paid) {
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @Schema(description = "")
  public Boolean isPaid() {
    return paid;
  }

  public void setPaid(Boolean paid) {
    this.paid = paid;
  }

  public Invoice paidOn(String paidOn) {
    this.paidOn = paidOn;
    return this;
  }

   /**
   * Get paidOn
   * @return paidOn
  **/
  @Schema(description = "")
  public String getPaidOn() {
    return paidOn;
  }

  public void setPaidOn(String paidOn) {
    this.paidOn = paidOn;
  }

  public Invoice personYourRef(AllOfInvoicePersonYourRef personYourRef) {
    this.personYourRef = personYourRef;
    return this;
  }

   /**
   * Get personYourRef
   * @return personYourRef
  **/
  @Schema(description = "")
  public AllOfInvoicePersonYourRef getPersonYourRef() {
    return personYourRef;
  }

  public void setPersonYourRef(AllOfInvoicePersonYourRef personYourRef) {
    this.personYourRef = personYourRef;
  }

  public Invoice personOwrRef(AllOfInvoicePersonOwrRef personOwrRef) {
    this.personOwrRef = personOwrRef;
    return this;
  }

   /**
   * Get personOwrRef
   * @return personOwrRef
  **/
  @Schema(description = "")
  public AllOfInvoicePersonOwrRef getPersonOwrRef() {
    return personOwrRef;
  }

  public void setPersonOwrRef(AllOfInvoicePersonOwrRef personOwrRef) {
    this.personOwrRef = personOwrRef;
  }

  public Invoice paymentTerms(AllOfInvoicePaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * Get paymentTerms
   * @return paymentTerms
  **/
  @Schema(description = "")
  public AllOfInvoicePaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(AllOfInvoicePaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public Invoice customer(AllOfInvoiceCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public AllOfInvoiceCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(AllOfInvoiceCustomer customer) {
    this.customer = customer;
  }

  public Invoice invoiceReceiver(AllOfInvoiceInvoiceReceiver invoiceReceiver) {
    this.invoiceReceiver = invoiceReceiver;
    return this;
  }

   /**
   * Get invoiceReceiver
   * @return invoiceReceiver
  **/
  @Schema(description = "")
  public AllOfInvoiceInvoiceReceiver getInvoiceReceiver() {
    return invoiceReceiver;
  }

  public void setInvoiceReceiver(AllOfInvoiceInvoiceReceiver invoiceReceiver) {
    this.invoiceReceiver = invoiceReceiver;
  }

  public Invoice directDetails(List<DirectDetail> directDetails) {
    this.directDetails = directDetails;
    return this;
  }

  public Invoice addDirectDetailsItem(DirectDetail directDetailsItem) {
    if (this.directDetails == null) {
      this.directDetails = new ArrayList<DirectDetail>();
    }
    this.directDetails.add(directDetailsItem);
    return this;
  }

   /**
   * Get directDetails
   * @return directDetails
  **/
  @Schema(description = "")
  public List<DirectDetail> getDirectDetails() {
    return directDetails;
  }

  public void setDirectDetails(List<DirectDetail> directDetails) {
    this.directDetails = directDetails;
  }

  public Invoice invoiceContracts(List<InvoiceContract> invoiceContracts) {
    this.invoiceContracts = invoiceContracts;
    return this;
  }

  public Invoice addInvoiceContractsItem(InvoiceContract invoiceContractsItem) {
    if (this.invoiceContracts == null) {
      this.invoiceContracts = new ArrayList<InvoiceContract>();
    }
    this.invoiceContracts.add(invoiceContractsItem);
    return this;
  }

   /**
   * Get invoiceContracts
   * @return invoiceContracts
  **/
  @Schema(description = "")
  public List<InvoiceContract> getInvoiceContracts() {
    return invoiceContracts;
  }

  public void setInvoiceContracts(List<InvoiceContract> invoiceContracts) {
    this.invoiceContracts = invoiceContracts;
  }

  public Invoice invoiceShipments(List<InvoiceShipment> invoiceShipments) {
    this.invoiceShipments = invoiceShipments;
    return this;
  }

  public Invoice addInvoiceShipmentsItem(InvoiceShipment invoiceShipmentsItem) {
    if (this.invoiceShipments == null) {
      this.invoiceShipments = new ArrayList<InvoiceShipment>();
    }
    this.invoiceShipments.add(invoiceShipmentsItem);
    return this;
  }

   /**
   * Get invoiceShipments
   * @return invoiceShipments
  **/
  @Schema(description = "")
  public List<InvoiceShipment> getInvoiceShipments() {
    return invoiceShipments;
  }

  public void setInvoiceShipments(List<InvoiceShipment> invoiceShipments) {
    this.invoiceShipments = invoiceShipments;
  }

  public Invoice pdf(List<UploadedFile> pdf) {
    this.pdf = pdf;
    return this;
  }

  public Invoice addPdfItem(UploadedFile pdfItem) {
    if (this.pdf == null) {
      this.pdf = new ArrayList<UploadedFile>();
    }
    this.pdf.add(pdfItem);
    return this;
  }

   /**
   * Get pdf
   * @return pdf
  **/
  @Schema(description = "")
  public List<UploadedFile> getPdf() {
    return pdf;
  }

  public void setPdf(List<UploadedFile> pdf) {
    this.pdf = pdf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.number, invoice.number) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.postingDate, invoice.postingDate) &&
        Objects.equals(this.invoiceText, invoice.invoiceText) &&
        Objects.equals(this.companyNote, invoice.companyNote) &&
        Objects.equals(this.period, invoice.period) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.invoiceAmount, invoice.invoiceAmount) &&
        Objects.equals(this.vatAmount, invoice.vatAmount) &&
        Objects.equals(this.printed, invoice.printed) &&
        Objects.equals(this.mailed, invoice.mailed) &&
        Objects.equals(this.paid, invoice.paid) &&
        Objects.equals(this.paidOn, invoice.paidOn) &&
        Objects.equals(this.personYourRef, invoice.personYourRef) &&
        Objects.equals(this.personOwrRef, invoice.personOwrRef) &&
        Objects.equals(this.paymentTerms, invoice.paymentTerms) &&
        Objects.equals(this.customer, invoice.customer) &&
        Objects.equals(this.invoiceReceiver, invoice.invoiceReceiver) &&
        Objects.equals(this.directDetails, invoice.directDetails) &&
        Objects.equals(this.invoiceContracts, invoice.invoiceContracts) &&
        Objects.equals(this.invoiceShipments, invoice.invoiceShipments) &&
        Objects.equals(this.pdf, invoice.pdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, invoiceDate, postingDate, invoiceText, companyNote, period, dueDate, invoiceAmount, vatAmount, printed, mailed, paid, paidOn, personYourRef, personOwrRef, paymentTerms, customer, invoiceReceiver, directDetails, invoiceContracts, invoiceShipments, pdf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    postingDate: ").append(toIndentedString(postingDate)).append("\n");
    sb.append("    invoiceText: ").append(toIndentedString(invoiceText)).append("\n");
    sb.append("    companyNote: ").append(toIndentedString(companyNote)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    mailed: ").append(toIndentedString(mailed)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    paidOn: ").append(toIndentedString(paidOn)).append("\n");
    sb.append("    personYourRef: ").append(toIndentedString(personYourRef)).append("\n");
    sb.append("    personOwrRef: ").append(toIndentedString(personOwrRef)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    invoiceReceiver: ").append(toIndentedString(invoiceReceiver)).append("\n");
    sb.append("    directDetails: ").append(toIndentedString(directDetails)).append("\n");
    sb.append("    invoiceContracts: ").append(toIndentedString(invoiceContracts)).append("\n");
    sb.append("    invoiceShipments: ").append(toIndentedString(invoiceShipments)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
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
