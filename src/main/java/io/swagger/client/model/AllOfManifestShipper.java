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
import io.swagger.client.model.AddressObject;
/**
 * AllOfManifestShipper
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-19T13:45:14.600795045Z[GMT]")

public class AllOfManifestShipper extends AddressObject {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfManifestShipper {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
