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
 * OrderOrderItems
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-10T17:35:19.331632027Z[GMT]")

public class OrderOrderItems {
  @SerializedName("id")
  private String id = null;

  @SerializedName("quantity")
  private String quantity = null;

  @SerializedName("altId")
  private String altId = null;

  public OrderOrderItems id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The product id
   * @return id
  **/
  @Schema(description = "The product id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderOrderItems quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity purchased
   * @return quantity
  **/
  @Schema(required = true, description = "The quantity purchased")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public OrderOrderItems altId(String altId) {
    this.altId = altId;
    return this;
  }

   /**
   * The altId of the product (if the product ID is not available). You should use either id or altId
   * @return altId
  **/
  @Schema(description = "The altId of the product (if the product ID is not available). You should use either id or altId")
  public String getAltId() {
    return altId;
  }

  public void setAltId(String altId) {
    this.altId = altId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOrderItems orderOrderItems = (OrderOrderItems) o;
    return Objects.equals(this.id, orderOrderItems.id) &&
        Objects.equals(this.quantity, orderOrderItems.quantity) &&
        Objects.equals(this.altId, orderOrderItems.altId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, altId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOrderItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    altId: ").append(toIndentedString(altId)).append("\n");
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
