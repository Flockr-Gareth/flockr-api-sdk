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
import io.swagger.client.model.EventEventData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EventEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-09T14:32:01.000659766Z[GMT]")

public class EventEvent {
  @SerializedName("category")
  private String category = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("data")
  private EventEventData data = null;

  public EventEvent category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the event
   * @return category
  **/
  @Schema(example = "basket", required = true, description = "The category of the event")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EventEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the event
   * @return name
  **/
  @Schema(example = "add", required = true, description = "The name of the event")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventEvent data(EventEventData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public EventEventData getData() {
    return data;
  }

  public void setData(EventEventData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEvent eventEvent = (EventEvent) o;
    return Objects.equals(this.category, eventEvent.category) &&
        Objects.equals(this.name, eventEvent.name) &&
        Objects.equals(this.data, eventEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEvent {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
