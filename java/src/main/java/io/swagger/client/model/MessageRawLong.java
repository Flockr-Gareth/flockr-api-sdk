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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MessageRawLong
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class MessageRawLong {
  @SerializedName("heading")
  private String heading = null;

  @SerializedName("text")
  private String text = null;

  public MessageRawLong heading(String heading) {
    this.heading = heading;
    return this;
  }

   /**
   * The long heading, these values can be managed in template for the message the Flockr portal
   * @return heading
  **/
  @Schema(example = "Popular choice!", description = "The long heading, these values can be managed in template for the message the Flockr portal")
  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public MessageRawLong text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The long text, these values can be managed in template for the message the Flockr portal
   * @return text
  **/
  @Schema(example = "21 people are looking at this right now", description = "The long text, these values can be managed in template for the message the Flockr portal")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRawLong messageRawLong = (MessageRawLong) o;
    return Objects.equals(this.heading, messageRawLong.heading) &&
        Objects.equals(this.text, messageRawLong.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRawLong {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
