// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class GiftCardCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The brand of the gift card. */
  @SerializedName("brand")
  Brand brand;

  /** Two-digit number representing the gift card's expiration month. */
  @SerializedName("exp_month")
  Long expMonth;

  /** Four-digit number representing the gift card's expiration year. */
  @SerializedName("exp_year")
  Long expYear;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** The gift card number. */
  @SerializedName("number")
  String number;

  /** The gift card PIN. */
  @SerializedName("pin")
  String pin;

  private GiftCardCreateParams(
      Brand brand,
      Long expMonth,
      Long expYear,
      List<String> expand,
      Map<String, Object> extraParams,
      String number,
      String pin) {
    this.brand = brand;
    this.expMonth = expMonth;
    this.expYear = expYear;
    this.expand = expand;
    this.extraParams = extraParams;
    this.number = number;
    this.pin = pin;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Brand brand;

    private Long expMonth;

    private Long expYear;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String number;

    private String pin;

    /** Finalize and obtain parameter instance from this builder. */
    public GiftCardCreateParams build() {
      return new GiftCardCreateParams(
          this.brand,
          this.expMonth,
          this.expYear,
          this.expand,
          this.extraParams,
          this.number,
          this.pin);
    }

    /** <strong>Required.</strong> The brand of the gift card. */
    public Builder setBrand(GiftCardCreateParams.Brand brand) {
      this.brand = brand;
      return this;
    }

    /** Two-digit number representing the gift card's expiration month. */
    public Builder setExpMonth(Long expMonth) {
      this.expMonth = expMonth;
      return this;
    }

    /** Four-digit number representing the gift card's expiration year. */
    public Builder setExpYear(Long expYear) {
      this.expYear = expYear;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * GiftCardCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * GiftCardCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * GiftCardCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link GiftCardCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The gift card number. */
    public Builder setNumber(String number) {
      this.number = number;
      return this;
    }

    /** The gift card PIN. */
    public Builder setPin(String pin) {
      this.pin = pin;
      return this;
    }
  }

  public enum Brand implements ApiRequestParams.EnumParam {
    @SerializedName("fiserv_valuelink")
    FISERV_VALUELINK("fiserv_valuelink"),

    @SerializedName("givex")
    GIVEX("givex"),

    @SerializedName("svs")
    SVS("svs");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Brand(String value) {
      this.value = value;
    }
  }
}
