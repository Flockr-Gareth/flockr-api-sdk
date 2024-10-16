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
import io.swagger.client.model.SocialProofProductAltId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SocialProofProduct
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class SocialProofProduct {
  @SerializedName("id")
  private String id = null;

  @SerializedName("altId")
  private SocialProofProductAltId altId = null;

  public SocialProofProduct id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "7515", description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SocialProofProduct altId(SocialProofProductAltId altId) {
    this.altId = altId;
    return this;
  }

   /**
   * Get altId
   * @return altId
  **/
  @Schema(description = "")
  public SocialProofProductAltId getAltId() {
    return altId;
  }

  public void setAltId(SocialProofProductAltId altId) {
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
    SocialProofProduct socialProofProduct = (SocialProofProduct) o;
    return Objects.equals(this.id, socialProofProduct.id) &&
        Objects.equals(this.altId, socialProofProduct.altId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, altId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialProofProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
