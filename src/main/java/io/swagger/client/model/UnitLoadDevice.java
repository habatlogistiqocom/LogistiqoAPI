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
 * UnitLoadDevice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-04T09:19:59.134638260Z[GMT]")

public class UnitLoadDevice {
  @SerializedName("uniqueNumber")
  private String uniqueNumber = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("contour")
  private String contour = null;

  public UnitLoadDevice uniqueNumber(String uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
    return this;
  }

   /**
   * Get uniqueNumber
   * @return uniqueNumber
  **/
  @Schema(example = "654165141", description = "")
  public String getUniqueNumber() {
    return uniqueNumber;
  }

  public void setUniqueNumber(String uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
  }

  public UnitLoadDevice number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @Schema(example = "PMC1234", description = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public UnitLoadDevice contour(String contour) {
    this.contour = contour;
    return this;
  }

   /**
   * Get contour
   * @return contour
  **/
  @Schema(example = "PMC-Q5", description = "")
  public String getContour() {
    return contour;
  }

  public void setContour(String contour) {
    this.contour = contour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitLoadDevice unitLoadDevice = (UnitLoadDevice) o;
    return Objects.equals(this.uniqueNumber, unitLoadDevice.uniqueNumber) &&
        Objects.equals(this.number, unitLoadDevice.number) &&
        Objects.equals(this.contour, unitLoadDevice.contour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueNumber, number, contour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitLoadDevice {\n");
    
    sb.append("    uniqueNumber: ").append(toIndentedString(uniqueNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    contour: ").append(toIndentedString(contour)).append("\n");
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
