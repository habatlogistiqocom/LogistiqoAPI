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
 * UploadedFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-06-11T22:27:13.531+02:00[Europe/Berlin]")
public class UploadedFile {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileContent")
  private String fileContent = null;

  @SerializedName("fileSize")
  private String fileSize = null;

  @SerializedName("temporary")
  private Boolean temporary = false;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdOn")
  private String createdOn = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("modifiedOn")
  private String modifiedOn = null;

  @SerializedName("deleted")
  private Boolean deleted = false;

  public UploadedFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the uploaded file
   * @return fileName
  **/
  @Schema(example = "deliveryNote001.pdf", description = "Name of the uploaded file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public UploadedFile fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
   * A String containing a Base64 encoded file byte[] input_file &#x3D; new byte[0]; input_file &#x3D; Files.readAllBytes(Paths.get(file.getAbsolutePath())); encodedBytes &#x3D; Base64.getEncoder().encode(input_file); String encodedString &#x3D; new String(encodedBytes);
   * @return fileContent
  **/
  @Schema(description = "A String containing a Base64 encoded file byte[] input_file = new byte[0]; input_file = Files.readAllBytes(Paths.get(file.getAbsolutePath())); encodedBytes = Base64.getEncoder().encode(input_file); String encodedString = new String(encodedBytes);")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  public UploadedFile fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Size in KB of the uploaded file
   * @return fileSize
  **/
  @Schema(example = "deliveryNote001.pdf", description = "Size in KB of the uploaded file")
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  public UploadedFile temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

   /**
   * Internal field
   * @return temporary
  **/
  @Schema(example = "false", description = "Internal field")
  public Boolean isTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public UploadedFile createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UploadedFile createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * date in the format dd.MM.yyyy HH:mm
   * @return createdOn
  **/
  @Schema(example = "01.05.2023 15:00", description = "date in the format dd.MM.yyyy HH:mm")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public UploadedFile modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @Schema(description = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public UploadedFile modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * date in the format dd.MM.yyyy HH:mm
   * @return modifiedOn
  **/
  @Schema(example = "01.05.2023 15:00", description = "date in the format dd.MM.yyyy HH:mm")
  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public UploadedFile deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Internal field
   * @return deleted
  **/
  @Schema(description = "Internal field")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadedFile uploadedFile = (UploadedFile) o;
    return Objects.equals(this.fileName, uploadedFile.fileName) &&
        Objects.equals(this.fileContent, uploadedFile.fileContent) &&
        Objects.equals(this.fileSize, uploadedFile.fileSize) &&
        Objects.equals(this.temporary, uploadedFile.temporary) &&
        Objects.equals(this.createdBy, uploadedFile.createdBy) &&
        Objects.equals(this.createdOn, uploadedFile.createdOn) &&
        Objects.equals(this.modifiedBy, uploadedFile.modifiedBy) &&
        Objects.equals(this.modifiedOn, uploadedFile.modifiedOn) &&
        Objects.equals(this.deleted, uploadedFile.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileContent, fileSize, temporary, createdBy, createdOn, modifiedBy, modifiedOn, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFile {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
