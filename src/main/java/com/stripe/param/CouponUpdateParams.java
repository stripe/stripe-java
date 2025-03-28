// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CouponUpdateParams extends ApiRequestParams {
  /**
   * Coupons defined in each available currency option (only supported if the coupon is
   * amount-based). Each key must be a three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
   * href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency_options")
  Map<String, CouponUpdateParams.CurrencyOption> currencyOptions;

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

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /**
   * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default
   * the {@code id} is shown if {@code name} is not set.
   */
  @SerializedName("name")
  Object name;

  private CouponUpdateParams(
      Map<String, CouponUpdateParams.CurrencyOption> currencyOptions,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Object name) {
    this.currencyOptions = currencyOptions;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.name = name;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, CouponUpdateParams.CurrencyOption> currencyOptions;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Object name;

    /** Finalize and obtain parameter instance from this builder. */
    public CouponUpdateParams build() {
      return new CouponUpdateParams(
          this.currencyOptions, this.expand, this.extraParams, this.metadata, this.name);
    }

    /**
     * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CouponUpdateParams#currencyOptions} for the field documentation.
     */
    public Builder putCurrencyOption(String key, CouponUpdateParams.CurrencyOption value) {
      if (this.currencyOptions == null) {
        this.currencyOptions = new HashMap<>();
      }
      this.currencyOptions.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CouponUpdateParams#currencyOptions} for the field documentation.
     */
    public Builder putAllCurrencyOption(Map<String, CouponUpdateParams.CurrencyOption> map) {
      if (this.currencyOptions == null) {
        this.currencyOptions = new HashMap<>();
      }
      this.currencyOptions.putAll(map);
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CouponUpdateParams#expand} for the field documentation.
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
     * CouponUpdateParams#expand} for the field documentation.
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
     * CouponUpdateParams#extraParams} for the field documentation.
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
     * See {@link CouponUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * CouponUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CouponUpdateParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default
     * the {@code id} is shown if {@code name} is not set.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Name of the coupon displayed to customers on, for instance invoices, or receipts. By default
     * the {@code id} is shown if {@code name} is not set.
     */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CurrencyOption {
    /**
     * <strong>Required.</strong> A positive integer representing the amount to subtract from an
     * invoice total.
     */
    @SerializedName("amount_off")
    Long amountOff;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CurrencyOption(Long amountOff, Map<String, Object> extraParams) {
      this.amountOff = amountOff;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amountOff;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public CouponUpdateParams.CurrencyOption build() {
        return new CouponUpdateParams.CurrencyOption(this.amountOff, this.extraParams);
      }

      /**
       * <strong>Required.</strong> A positive integer representing the amount to subtract from an
       * invoice total.
       */
      public Builder setAmountOff(Long amountOff) {
        this.amountOff = amountOff;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CouponUpdateParams.CurrencyOption#extraParams} for the field documentation.
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
       * See {@link CouponUpdateParams.CurrencyOption#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
