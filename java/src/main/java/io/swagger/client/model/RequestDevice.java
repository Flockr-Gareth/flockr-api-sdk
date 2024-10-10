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
import io.swagger.client.model.RequestDeviceScreen;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RequestDevice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-10T17:35:19.331632027Z[GMT]")

public class RequestDevice {
  @SerializedName("screen")
  private RequestDeviceScreen screen = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  public RequestDevice screen(RequestDeviceScreen screen) {
    this.screen = screen;
    return this;
  }

   /**
   * Get screen
   * @return screen
  **/
  @Schema(description = "")
  public RequestDeviceScreen getScreen() {
    return screen;
  }

  public void setScreen(RequestDeviceScreen screen) {
    this.screen = screen;
  }

  public RequestDevice userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @Schema(example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36", description = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDevice requestDevice = (RequestDevice) o;
    return Objects.equals(this.screen, requestDevice.screen) &&
        Objects.equals(this.userAgent, requestDevice.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screen, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDevice {\n");
    
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
