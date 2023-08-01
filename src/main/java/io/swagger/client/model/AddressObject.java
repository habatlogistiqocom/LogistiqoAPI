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
 * AddressObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T15:42:11.807009033Z[GMT]")

public class AddressObject {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("idAddress")
  private Integer idAddress = 0;

  @SerializedName("city")
  private String city = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("greeting")
  private String greeting = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("houseNo")
  private String houseNo = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name2")
  private String name2 = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("mobile")
  private String mobile = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("addressrow")
  private String addressrow = null;

  @SerializedName("zipcode")
  private String zipcode = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("plantNumber")
  private String plantNumber = null;

  @SerializedName("instructions")
  private String instructions = null;

  @SerializedName("openingHoursMonToThuFrom")
  private Integer openingHoursMonToThuFrom = null;

  @SerializedName("openingHoursMonToThuTo")
  private Integer openingHoursMonToThuTo = null;

  @SerializedName("openingHoursFriFrom")
  private Integer openingHoursFriFrom = null;

  @SerializedName("openingHoursFriTo")
  private Integer openingHoursFriTo = null;

  @SerializedName("idTimeslot")
  private Integer idTimeslot = null;

  @SerializedName("withDurationGrid")
  private Boolean withDurationGrid = false;

  @SerializedName("idDuration")
  private Integer idDuration = null;

  @SerializedName("temporary")
  private Boolean temporary = false;

  public AddressObject id(Integer id) {
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

  public AddressObject number(String number) {
    this.number = number;
    return this;
  }

   /**
   * If you have the address number available in Logistiqo, please enter it in this field. In that case, no other address fields are required. However, if the address number not known or the address is new, please make sure to fill out all the other necessary address fields
   * @return number
  **/
  @Schema(description = "If you have the address number available in Logistiqo, please enter it in this field. In that case, no other address fields are required. However, if the address number not known or the address is new, please make sure to fill out all the other necessary address fields")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public AddressObject idAddress(Integer idAddress) {
    this.idAddress = idAddress;
    return this;
  }

   /**
   * This field contains the ID of the address within the Logistiqo Application. It is exclusively utilized by Logistiqo&#x27;s internal functions.
   * @return idAddress
  **/
  @Schema(description = "This field contains the ID of the address within the Logistiqo Application. It is exclusively utilized by Logistiqo's internal functions.")
  public Integer getIdAddress() {
    return idAddress;
  }

  public void setIdAddress(Integer idAddress) {
    this.idAddress = idAddress;
  }

  public AddressObject city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(example = "London", description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressObject countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Please enter the two-letter country code according to the ISO  3166-1 alpha-2 standard. These codes are internationally recognized and defined by the International Organization for Standardization as part of the ISO 3166 standard.
   * @return countryCode
  **/
  @Schema(example = "GB", description = "Please enter the two-letter country code according to the ISO  3166-1 alpha-2 standard. These codes are internationally recognized and defined by the International Organization for Standardization as part of the ISO 3166 standard.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressObject email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "r.sterling@universalexport.net", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddressObject greeting(String greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Get greeting
   * @return greeting
  **/
  @Schema(example = "Mr.", description = "")
  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public AddressObject title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(example = "Dr.", description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AddressObject firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(example = "Robert", description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AddressObject houseNo(String houseNo) {
    this.houseNo = houseNo;
    return this;
  }

   /**
   * Get houseNo
   * @return houseNo
  **/
  @Schema(example = "413", description = "")
  public String getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public AddressObject lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(example = "Sterling", description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AddressObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Universal Exports", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressObject name2(String name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * Get name2
   * @return name2
  **/
  @Schema(example = "Limited", description = "")
  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public AddressObject phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(example = "+44 207 946 0139", description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AddressObject mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @Schema(example = "+44 207 946 0139", description = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public AddressObject street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @Schema(example = "413 Longstream Road", description = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddressObject addressrow(String addressrow) {
    this.addressrow = addressrow;
    return this;
  }

   /**
   * Get addressrow
   * @return addressrow
  **/
  @Schema(example = "Unit 1D, Lock 71", description = "")
  public String getAddressrow() {
    return addressrow;
  }

  public void setAddressrow(String addressrow) {
    this.addressrow = addressrow;
  }

  public AddressObject zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @Schema(example = "SE1 7TP", description = "")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public AddressObject state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(example = "Bayern", description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressObject plantNumber(String plantNumber) {
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

  public AddressObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @Schema(description = "")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public AddressObject openingHoursMonToThuFrom(Integer openingHoursMonToThuFrom) {
    this.openingHoursMonToThuFrom = openingHoursMonToThuFrom;
    return this;
  }

   /**
   * open as of in minutes from start of day on monday to thursday
   * @return openingHoursMonToThuFrom
  **/
  @Schema(description = "open as of in minutes from start of day on monday to thursday")
  public Integer getOpeningHoursMonToThuFrom() {
    return openingHoursMonToThuFrom;
  }

  public void setOpeningHoursMonToThuFrom(Integer openingHoursMonToThuFrom) {
    this.openingHoursMonToThuFrom = openingHoursMonToThuFrom;
  }

  public AddressObject openingHoursMonToThuTo(Integer openingHoursMonToThuTo) {
    this.openingHoursMonToThuTo = openingHoursMonToThuTo;
    return this;
  }

   /**
   * close as of in minutes from start of day on monday to thursday
   * @return openingHoursMonToThuTo
  **/
  @Schema(description = "close as of in minutes from start of day on monday to thursday")
  public Integer getOpeningHoursMonToThuTo() {
    return openingHoursMonToThuTo;
  }

  public void setOpeningHoursMonToThuTo(Integer openingHoursMonToThuTo) {
    this.openingHoursMonToThuTo = openingHoursMonToThuTo;
  }

  public AddressObject openingHoursFriFrom(Integer openingHoursFriFrom) {
    this.openingHoursFriFrom = openingHoursFriFrom;
    return this;
  }

   /**
   * open as of in minutes from start of day on friday
   * @return openingHoursFriFrom
  **/
  @Schema(description = "open as of in minutes from start of day on friday")
  public Integer getOpeningHoursFriFrom() {
    return openingHoursFriFrom;
  }

  public void setOpeningHoursFriFrom(Integer openingHoursFriFrom) {
    this.openingHoursFriFrom = openingHoursFriFrom;
  }

  public AddressObject openingHoursFriTo(Integer openingHoursFriTo) {
    this.openingHoursFriTo = openingHoursFriTo;
    return this;
  }

   /**
   * close as of in minutes from start of day on friday
   * @return openingHoursFriTo
  **/
  @Schema(description = "close as of in minutes from start of day on friday")
  public Integer getOpeningHoursFriTo() {
    return openingHoursFriTo;
  }

  public void setOpeningHoursFriTo(Integer openingHoursFriTo) {
    this.openingHoursFriTo = openingHoursFriTo;
  }

  public AddressObject idTimeslot(Integer idTimeslot) {
    this.idTimeslot = idTimeslot;
    return this;
  }

   /**
   * Internal field
   * @return idTimeslot
  **/
  @Schema(description = "Internal field")
  public Integer getIdTimeslot() {
    return idTimeslot;
  }

  public void setIdTimeslot(Integer idTimeslot) {
    this.idTimeslot = idTimeslot;
  }

  public AddressObject withDurationGrid(Boolean withDurationGrid) {
    this.withDurationGrid = withDurationGrid;
    return this;
  }

   /**
   * Internal field
   * @return withDurationGrid
  **/
  @Schema(description = "Internal field")
  public Boolean isWithDurationGrid() {
    return withDurationGrid;
  }

  public void setWithDurationGrid(Boolean withDurationGrid) {
    this.withDurationGrid = withDurationGrid;
  }

  public AddressObject idDuration(Integer idDuration) {
    this.idDuration = idDuration;
    return this;
  }

   /**
   * Internal field
   * @return idDuration
  **/
  @Schema(description = "Internal field")
  public Integer getIdDuration() {
    return idDuration;
  }

  public void setIdDuration(Integer idDuration) {
    this.idDuration = idDuration;
  }

  public AddressObject temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Get temporary
   * @return temporary
  **/
  @Schema(example = "false", description = "")
  public Boolean isTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressObject addressObject = (AddressObject) o;
    return Objects.equals(this.id, addressObject.id) &&
        Objects.equals(this.number, addressObject.number) &&
        Objects.equals(this.idAddress, addressObject.idAddress) &&
        Objects.equals(this.city, addressObject.city) &&
        Objects.equals(this.countryCode, addressObject.countryCode) &&
        Objects.equals(this.email, addressObject.email) &&
        Objects.equals(this.greeting, addressObject.greeting) &&
        Objects.equals(this.title, addressObject.title) &&
        Objects.equals(this.firstName, addressObject.firstName) &&
        Objects.equals(this.houseNo, addressObject.houseNo) &&
        Objects.equals(this.lastName, addressObject.lastName) &&
        Objects.equals(this.name, addressObject.name) &&
        Objects.equals(this.name2, addressObject.name2) &&
        Objects.equals(this.phone, addressObject.phone) &&
        Objects.equals(this.mobile, addressObject.mobile) &&
        Objects.equals(this.street, addressObject.street) &&
        Objects.equals(this.addressrow, addressObject.addressrow) &&
        Objects.equals(this.zipcode, addressObject.zipcode) &&
        Objects.equals(this.state, addressObject.state) &&
        Objects.equals(this.plantNumber, addressObject.plantNumber) &&
        Objects.equals(this.instructions, addressObject.instructions) &&
        Objects.equals(this.openingHoursMonToThuFrom, addressObject.openingHoursMonToThuFrom) &&
        Objects.equals(this.openingHoursMonToThuTo, addressObject.openingHoursMonToThuTo) &&
        Objects.equals(this.openingHoursFriFrom, addressObject.openingHoursFriFrom) &&
        Objects.equals(this.openingHoursFriTo, addressObject.openingHoursFriTo) &&
        Objects.equals(this.idTimeslot, addressObject.idTimeslot) &&
        Objects.equals(this.withDurationGrid, addressObject.withDurationGrid) &&
        Objects.equals(this.idDuration, addressObject.idDuration) &&
        Objects.equals(this.temporary, addressObject.temporary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, idAddress, city, countryCode, email, greeting, title, firstName, houseNo, lastName, name, name2, phone, mobile, street, addressrow, zipcode, state, plantNumber, instructions, openingHoursMonToThuFrom, openingHoursMonToThuTo, openingHoursFriFrom, openingHoursFriTo, idTimeslot, withDurationGrid, idDuration, temporary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    idAddress: ").append(toIndentedString(idAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    houseNo: ").append(toIndentedString(houseNo)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    addressrow: ").append(toIndentedString(addressrow)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    plantNumber: ").append(toIndentedString(plantNumber)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    openingHoursMonToThuFrom: ").append(toIndentedString(openingHoursMonToThuFrom)).append("\n");
    sb.append("    openingHoursMonToThuTo: ").append(toIndentedString(openingHoursMonToThuTo)).append("\n");
    sb.append("    openingHoursFriFrom: ").append(toIndentedString(openingHoursFriFrom)).append("\n");
    sb.append("    openingHoursFriTo: ").append(toIndentedString(openingHoursFriTo)).append("\n");
    sb.append("    idTimeslot: ").append(toIndentedString(idTimeslot)).append("\n");
    sb.append("    withDurationGrid: ").append(toIndentedString(withDurationGrid)).append("\n");
    sb.append("    idDuration: ").append(toIndentedString(idDuration)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
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
