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
import io.swagger.client.model.FlockrResult;
import io.swagger.client.model.SocialProof;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Flockr
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class Flockr {
  @SerializedName("result")
  private FlockrResult result = null;

  @SerializedName("socialProof")
  private List<SocialProof> socialProof = null;

  @SerializedName("recommendations")
  private List<SocialProof> recommendations = null;

  public Flockr result(FlockrResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public FlockrResult getResult() {
    return result;
  }

  public void setResult(FlockrResult result) {
    this.result = result;
  }

  public Flockr socialProof(List<SocialProof> socialProof) {
    this.socialProof = socialProof;
    return this;
  }

  public Flockr addSocialProofItem(SocialProof socialProofItem) {
    if (this.socialProof == null) {
      this.socialProof = new ArrayList<SocialProof>();
    }
    this.socialProof.add(socialProofItem);
    return this;
  }

   /**
   * Get socialProof
   * @return socialProof
  **/
  @Schema(description = "")
  public List<SocialProof> getSocialProof() {
    return socialProof;
  }

  public void setSocialProof(List<SocialProof> socialProof) {
    this.socialProof = socialProof;
  }

  public Flockr recommendations(List<SocialProof> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public Flockr addRecommendationsItem(SocialProof recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<SocialProof>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

   /**
   * Get recommendations
   * @return recommendations
  **/
  @Schema(description = "")
  public List<SocialProof> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<SocialProof> recommendations) {
    this.recommendations = recommendations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flockr flockr = (Flockr) o;
    return Objects.equals(this.result, flockr.result) &&
        Objects.equals(this.socialProof, flockr.socialProof) &&
        Objects.equals(this.recommendations, flockr.recommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, socialProof, recommendations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flockr {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    socialProof: ").append(toIndentedString(socialProof)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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
