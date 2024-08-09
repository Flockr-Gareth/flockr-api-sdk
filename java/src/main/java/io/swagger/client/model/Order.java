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
import io.swagger.client.model.OrderOrderItems;
import io.swagger.client.model.Request;
import io.swagger.client.model.RequestDevice;
import io.swagger.client.model.RequestLocale;
import io.swagger.client.model.RequestLocation;
import io.swagger.client.model.RequestVisitor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Order
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-09T13:49:56.363387768Z[GMT]")

public class Order extends Request {
  @SerializedName("id")
  private String id = null;

  @SerializedName("totalPrice")
  private BigDecimal totalPrice = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("orderItems")
  private List<OrderOrderItems> orderItems = null;

  public Order id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the order
   * @return id
  **/
  @Schema(example = "abcdefg", description = "The id of the order")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order totalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * The total value of the order including tax and shipping
   * @return totalPrice
  **/
  @Schema(example = "456.78", description = "The total value of the order including tax and shipping")
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Order currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO code for the order currency
   * @return currency
  **/
  @Schema(example = "GBP", description = "The ISO code for the order currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Order orderItems(List<OrderOrderItems> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public Order addOrderItemsItem(OrderOrderItems orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<OrderOrderItems>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/
  @Schema(description = "")
  public List<OrderOrderItems> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderOrderItems> orderItems) {
    this.orderItems = orderItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.totalPrice, order.totalPrice) &&
        Objects.equals(this.currency, order.currency) &&
        Objects.equals(this.orderItems, order.orderItems) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, totalPrice, currency, orderItems, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
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
