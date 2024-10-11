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
import java.util.ArrayList;
import java.util.List;
/**
 * ProductProduct
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class ProductProduct {
  @SerializedName("altId")
  private String altId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("displayPriceUnitPlural")
  private String displayPriceUnitPlural = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("recommendations")
  private List<OneOfproductProductRecommendationsItems> recommendations = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("url")
  private String url = null;

  public ProductProduct altId(String altId) {
    this.altId = altId;
    return this;
  }

   /**
   * An alternative ID for the product, this is automaticall mapped to the main ID
   * @return altId
  **/
  @Schema(example = "abcdefg", description = "An alternative ID for the product, this is automaticall mapped to the main ID")
  public String getAltId() {
    return altId;
  }

  public void setAltId(String altId) {
    this.altId = altId;
  }

  public ProductProduct id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for the product - must be a string
   * @return id
  **/
  @Schema(example = "1725", required = true, description = "The unique ID for the product - must be a string")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductProduct category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of the product
   * @return category
  **/
  @Schema(example = "Bathroom Tiles", description = "The category of the product")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProductProduct displayPriceUnitPlural(String displayPriceUnitPlural) {
    this.displayPriceUnitPlural = displayPriceUnitPlural;
    return this;
  }

   /**
   * A plural name that the product is sold in, e.g. boxes
   * @return displayPriceUnitPlural
  **/
  @Schema(example = "boxes", description = "A plural name that the product is sold in, e.g. boxes")
  public String getDisplayPriceUnitPlural() {
    return displayPriceUnitPlural;
  }

  public void setDisplayPriceUnitPlural(String displayPriceUnitPlural) {
    this.displayPriceUnitPlural = displayPriceUnitPlural;
  }

  public ProductProduct image(String image) {
    this.image = image;
    return this;
  }

   /**
   * A url of the product image, if supplied Flockr will respond with an image URL that can be used to display the social proof message as an image
   * @return image
  **/
  @Schema(example = "https://www.toppstiles.co.uk/static/media/catalog/product/c/a/634119_metro-white-tile_7.jpg", description = "A url of the product image, if supplied Flockr will respond with an image URL that can be used to display the social proof message as an image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ProductProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the product
   * @return name
  **/
  @Schema(example = "Metro Tiles", description = "The name of the product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductProduct recommendations(List<OneOfproductProductRecommendationsItems> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public ProductProduct addRecommendationsItem(OneOfproductProductRecommendationsItems recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<OneOfproductProductRecommendationsItems>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

   /**
   * Optional list of product IDs to fetch proof values for (can be requested on a dedicated call instead if required)
   * @return recommendations
  **/
  @Schema(example = "[7654,3456]", description = "Optional list of product IDs to fetch proof values for (can be requested on a dedicated call instead if required)")
  public List<OneOfproductProductRecommendationsItems> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<OneOfproductProductRecommendationsItems> recommendations) {
    this.recommendations = recommendations;
  }

  public ProductProduct sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * An optinal SKU for the product
   * @return sku
  **/
  @Schema(example = "Metro-Tiles_Configurable", description = "An optinal SKU for the product")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductProduct url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the product
   * @return url
  **/
  @Schema(example = "https://www.toppstiles.co.uk/bathroom-tiles/metro-tiles", description = "The URL of the product")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProduct productProduct = (ProductProduct) o;
    return Objects.equals(this.altId, productProduct.altId) &&
        Objects.equals(this.id, productProduct.id) &&
        Objects.equals(this.category, productProduct.category) &&
        Objects.equals(this.displayPriceUnitPlural, productProduct.displayPriceUnitPlural) &&
        Objects.equals(this.image, productProduct.image) &&
        Objects.equals(this.name, productProduct.name) &&
        Objects.equals(this.recommendations, productProduct.recommendations) &&
        Objects.equals(this.sku, productProduct.sku) &&
        Objects.equals(this.url, productProduct.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altId, id, category, displayPriceUnitPlural, image, name, recommendations, sku, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProduct {\n");
    
    sb.append("    altId: ").append(toIndentedString(altId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    displayPriceUnitPlural: ").append(toIndentedString(displayPriceUnitPlural)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
