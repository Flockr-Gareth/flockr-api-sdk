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
import io.swagger.client.model.Request;
import io.swagger.client.model.RequestDevice;
import io.swagger.client.model.RequestLocale;
import io.swagger.client.model.RequestLocation;
import io.swagger.client.model.RequestVisitor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListOnly
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-10T17:35:19.331632027Z[GMT]")

public class ListOnly extends Request {
  @SerializedName("category")
  private String category = null;

  @SerializedName("products")
  private List<String> products = new ArrayList<String>();

  public ListOnly category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Should be set to \&quot;recommendations\&quot;
   * @return category
  **/
  @Schema(example = "recommendations", required = true, description = "Should be set to \"recommendations\"")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ListOnly products(List<String> products) {
    this.products = products;
    return this;
  }

  public ListOnly addProductsItem(String productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * An array of product IDs, also accepts an array of altIds, e.g. [{altId:\&quot;abcdefg\&quot;}]
   * @return products
  **/
  @Schema(example = "[\"1725\",\"8647\",\"1750\",\"9325\"]", required = true, description = "An array of product IDs, also accepts an array of altIds, e.g. [{altId:\"abcdefg\"}]")
  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOnly listOnly = (ListOnly) o;
    return Objects.equals(this.category, listOnly.category) &&
        Objects.equals(this.products, listOnly.products) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, products, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOnly {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
