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
import io.swagger.client.model.MessageRaw;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Message
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-11T13:43:34.865069393Z[GMT]")

public class Message {
  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    @SerializedName("BASKET")
    BASKET("BASKET"),
    @SerializedName("LAST_ORDER_ELAPSED_TIME")
    LAST_ORDER_ELAPSED_TIME("LAST_ORDER_ELAPSED_TIME"),
    @SerializedName("AUDIENCE")
    AUDIENCE("AUDIENCE"),
    @SerializedName("QUANTITY_ORDERS")
    QUANTITY_ORDERS("QUANTITY_ORDERS"),
    @SerializedName("RATING")
    RATING("RATING");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CategoryEnum fromValue(String input) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CategoryEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("category")
  private CategoryEnum category = null;

  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    @SerializedName("TS")
    TS("TS"),
    @SerializedName("QPH")
    QPH("QPH"),
    @SerializedName("LPMS")
    LPMS("LPMS"),
    @SerializedName("LPSP")
    LPSP("LPSP"),
    @SerializedName("SLVP")
    SLVP("SLVP"),
    @SerializedName("ATB")
    ATB("ATB"),
    @SerializedName("SLVB")
    SLVB("SLVB"),
    @SerializedName("CAP")
    CAP("CAP"),
    @SerializedName("SLVA")
    SLVA("SLVA"),
    @SerializedName("PRV")
    PRV("PRV"),
    @SerializedName("SZ")
    SZ("SZ");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String input) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CodeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("raw")
  private MessageRaw raw = null;

  /**
   * an enum value or an integer representing the number of hours since last visit (for SLVA, SLVB, SLVP)
   */
  @JsonAdapter(TimeEnum.Adapter.class)
  public enum TimeEnum {
    @SerializedName("now_view_count")
    NOW_VIEW_COUNT("now_view_count"),
    @SerializedName("now_atb_count")
    NOW_ATB_COUNT("now_atb_count"),
    @SerializedName("now_purchase_count")
    NOW_PURCHASE_COUNT("now_purchase_count"),
    @SerializedName("now_purchase_sample_count")
    NOW_PURCHASE_SAMPLE_COUNT("now_purchase_sample_count"),
    @SerializedName("recent_atb_count")
    RECENT_ATB_COUNT("recent_atb_count"),
    @SerializedName("recent_view_count")
    RECENT_VIEW_COUNT("recent_view_count"),
    @SerializedName("recent_purchase_count")
    RECENT_PURCHASE_COUNT("recent_purchase_count"),
    @SerializedName("recent_purchase_sample_count")
    RECENT_PURCHASE_SAMPLE_COUNT("recent_purchase_sample_count"),
    @SerializedName("hour1_view_count")
    HOUR1_VIEW_COUNT("hour1_view_count"),
    @SerializedName("hour1_atb_count")
    HOUR1_ATB_COUNT("hour1_atb_count"),
    @SerializedName("hour1_purchase_count")
    HOUR1_PURCHASE_COUNT("hour1_purchase_count"),
    @SerializedName("hour1_purchase_sample_count")
    HOUR1_PURCHASE_SAMPLE_COUNT("hour1_purchase_sample_count"),
    @SerializedName("hour3_view_count")
    HOUR3_VIEW_COUNT("hour3_view_count"),
    @SerializedName("hour3_atb_count")
    HOUR3_ATB_COUNT("hour3_atb_count"),
    @SerializedName("hour3_purchase_count")
    HOUR3_PURCHASE_COUNT("hour3_purchase_count"),
    @SerializedName("hour3_purchase_sample_count")
    HOUR3_PURCHASE_SAMPLE_COUNT("hour3_purchase_sample_count"),
    @SerializedName("hour12_view_count")
    HOUR12_VIEW_COUNT("hour12_view_count"),
    @SerializedName("hour12_atb_count")
    HOUR12_ATB_COUNT("hour12_atb_count"),
    @SerializedName("hour12_purchase_count")
    HOUR12_PURCHASE_COUNT("hour12_purchase_count"),
    @SerializedName("hour12_purchase_sample_count")
    HOUR12_PURCHASE_SAMPLE_COUNT("hour12_purchase_sample_count"),
    @SerializedName("hour24_view_count")
    HOUR24_VIEW_COUNT("hour24_view_count"),
    @SerializedName("hour24_atb_count")
    HOUR24_ATB_COUNT("hour24_atb_count"),
    @SerializedName("hour24_purchase_count")
    HOUR24_PURCHASE_COUNT("hour24_purchase_count"),
    @SerializedName("hour24_purchase_sample_count")
    HOUR24_PURCHASE_SAMPLE_COUNT("hour24_purchase_sample_count"),
    @SerializedName("hour48_view_count")
    HOUR48_VIEW_COUNT("hour48_view_count"),
    @SerializedName("hour48_atb_count")
    HOUR48_ATB_COUNT("hour48_atb_count"),
    @SerializedName("hour48_purchase_count")
    HOUR48_PURCHASE_COUNT("hour48_purchase_count"),
    @SerializedName("hour48_purchase_sample_count")
    HOUR48_PURCHASE_SAMPLE_COUNT("hour48_purchase_sample_count"),
    @SerializedName("hour120_view_count")
    HOUR120_VIEW_COUNT("hour120_view_count"),
    @SerializedName("hour120_atb_count")
    HOUR120_ATB_COUNT("hour120_atb_count"),
    @SerializedName("hour120_purchase_count")
    HOUR120_PURCHASE_COUNT("hour120_purchase_count"),
    @SerializedName("hour120_purchase_sample_count")
    HOUR120_PURCHASE_SAMPLE_COUNT("hour120_purchase_sample_count"),
    @SerializedName("hour168_view_count")
    HOUR168_VIEW_COUNT("hour168_view_count"),
    @SerializedName("hour168_atb_count")
    HOUR168_ATB_COUNT("hour168_atb_count"),
    @SerializedName("hour168_purchase_count")
    HOUR168_PURCHASE_COUNT("hour168_purchase_count"),
    @SerializedName("hour168_purchase_sample_count")
    HOUR168_PURCHASE_SAMPLE_COUNT("hour168_purchase_sample_count");

    private String value;

    TimeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TimeEnum fromValue(String input) {
      for (TimeEnum b : TimeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TimeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TimeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("time")
  private TimeEnum time = null;

  public Message category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(example = "BASKET", description = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Message code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "CAP", description = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Message message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "<div class=\"flockr-dt\"><strong>Popular choice!</strong>21 people are looking at this right now</div><div class=\"flockr-mb\"><strong>Popular!</strong>21 views</div>", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Message raw(MessageRaw raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @Schema(description = "")
  public MessageRaw getRaw() {
    return raw;
  }

  public void setRaw(MessageRaw raw) {
    this.raw = raw;
  }

  public Message time(TimeEnum time) {
    this.time = time;
    return this;
  }

   /**
   * an enum value or an integer representing the number of hours since last visit (for SLVA, SLVB, SLVP)
   * @return time
  **/
  @Schema(example = "now_view_count", description = "an enum value or an integer representing the number of hours since last visit (for SLVA, SLVB, SLVP)")
  public TimeEnum getTime() {
    return time;
  }

  public void setTime(TimeEnum time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.category, message.category) &&
        Objects.equals(this.code, message.code) &&
        Objects.equals(this.message, message.message) &&
        Objects.equals(this.raw, message.raw) &&
        Objects.equals(this.time, message.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, message, raw, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
