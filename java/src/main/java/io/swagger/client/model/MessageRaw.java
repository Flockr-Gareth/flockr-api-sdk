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
import io.swagger.client.model.MessageRawLong;
import io.swagger.client.model.MessageRawShort;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MessageRaw
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class MessageRaw {
  @SerializedName("data")
  private Integer data = null;

  @SerializedName("long")
  private MessageRawLong _long = null;

  @SerializedName("short")
  private MessageRawShort _short = null;

  public MessageRaw data(Integer data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(example = "21", description = "")
  public Integer getData() {
    return data;
  }

  public void setData(Integer data) {
    this.data = data;
  }

  public MessageRaw _long(MessageRawLong _long) {
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @Schema(description = "")
  public MessageRawLong getLong() {
    return _long;
  }

  public void setLong(MessageRawLong _long) {
    this._long = _long;
  }

  public MessageRaw _short(MessageRawShort _short) {
    this._short = _short;
    return this;
  }

   /**
   * Get _short
   * @return _short
  **/
  @Schema(description = "")
  public MessageRawShort getShort() {
    return _short;
  }

  public void setShort(MessageRawShort _short) {
    this._short = _short;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRaw messageRaw = (MessageRaw) o;
    return Objects.equals(this.data, messageRaw.data) &&
        Objects.equals(this._long, messageRaw._long) &&
        Objects.equals(this._short, messageRaw._short);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, _long, _short);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRaw {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
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
