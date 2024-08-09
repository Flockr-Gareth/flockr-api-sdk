/*
 * Flockr Social Proof API
 * API for sending product user actions and retrieving social proof
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@flockr.co
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
import io.swagger.client.model.RequestDevice;
import io.swagger.client.model.RequestLocale;
import io.swagger.client.model.RequestLocation;
import io.swagger.client.model.RequestVisitor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Request
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-09T13:49:56.363387768Z[GMT]")

public class Request {
  @SerializedName("visitor")
  private RequestVisitor visitor = null;

  @SerializedName("location")
  private RequestLocation location = null;

  @SerializedName("locale")
  private RequestLocale locale = null;

  @SerializedName("device")
  private RequestDevice device = null;

  public Request visitor(RequestVisitor visitor) {
    this.visitor = visitor;
    return this;
  }

   /**
   * Get visitor
   * @return visitor
  **/
  @Schema(description = "")
  public RequestVisitor getVisitor() {
    return visitor;
  }

  public void setVisitor(RequestVisitor visitor) {
    this.visitor = visitor;
  }

  public Request location(RequestLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public RequestLocation getLocation() {
    return location;
  }

  public void setLocation(RequestLocation location) {
    this.location = location;
  }

  public Request locale(RequestLocale locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(description = "")
  public RequestLocale getLocale() {
    return locale;
  }

  public void setLocale(RequestLocale locale) {
    this.locale = locale;
  }

  public Request device(RequestDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @Schema(description = "")
  public RequestDevice getDevice() {
    return device;
  }

  public void setDevice(RequestDevice device) {
    this.device = device;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.visitor, request.visitor) &&
        Objects.equals(this.location, request.location) &&
        Objects.equals(this.locale, request.locale) &&
        Objects.equals(this.device, request.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitor, location, locale, device);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    visitor: ").append(toIndentedString(visitor)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
