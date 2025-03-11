// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PromotionCodeUpdateParams extends ApiRequestParams {
  /**
   * Whether the promotion code is currently active. A promotion code can only be reactivated when
   * the coupon is still valid and the promotion code is otherwise redeemable.
   */
  @SerializedName("active")
  Boolean active;

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

  /** Settings that restrict the redemption of the promotion code. */
  @SerializedName("restrictions")
  Restrictions restrictions;

  private PromotionCodeUpdateParams(
      Boolean active,
      List<String> expand,
      Map<String, Object> extraParams,
      Object metadata,
      Restrictions restrictions) {
    this.active = active;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.restrictions = restrictions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object metadata;

    private Restrictions restrictions;

    /** Finalize and obtain parameter instance from this builder. */
    public PromotionCodeUpdateParams build() {
      return new PromotionCodeUpdateParams(
          this.active, this.expand, this.extraParams, this.metadata, this.restrictions);
    }

    /**
     * Whether the promotion code is currently active. A promotion code can only be reactivated when
     * the coupon is still valid and the promotion code is otherwise redeemable.
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PromotionCodeUpdateParams#expand} for the field documentation.
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
     * PromotionCodeUpdateParams#expand} for the field documentation.
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
     * PromotionCodeUpdateParams#extraParams} for the field documentation.
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
     * See {@link PromotionCodeUpdateParams#extraParams} for the field documentation.
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
     * PromotionCodeUpdateParams#metadata} for the field documentation.
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
     * See {@link PromotionCodeUpdateParams#metadata} for the field documentation.
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

    /** Settings that restrict the redemption of the promotion code. */
    public Builder setRestrictions(PromotionCodeUpdateParams.Restrictions restrictions) {
      this.restrictions = restrictions;
      return this;
    }
  }

  @Getter
  public static class Restrictions {
    /**
     * Promotion codes defined in each available currency option. Each key must be a three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a> and a <a
     * href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency_options")
    Map<String, PromotionCodeUpdateParams.Restrictions.CurrencyOption> currencyOptions;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Restrictions(
        Map<String, PromotionCodeUpdateParams.Restrictions.CurrencyOption> currencyOptions,
        Map<String, Object> extraParams) {
      this.currencyOptions = currencyOptions;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, PromotionCodeUpdateParams.Restrictions.CurrencyOption> currencyOptions;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PromotionCodeUpdateParams.Restrictions build() {
        return new PromotionCodeUpdateParams.Restrictions(this.currencyOptions, this.extraParams);
      }

      /**
       * Add a key/value pair to `currencyOptions` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PromotionCodeUpdateParams.Restrictions#currencyOptions} for the field
       * documentation.
       */
      public Builder putCurrencyOption(
          String key, PromotionCodeUpdateParams.Restrictions.CurrencyOption value) {
        if (this.currencyOptions == null) {
          this.currencyOptions = new HashMap<>();
        }
        this.currencyOptions.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `currencyOptions` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PromotionCodeUpdateParams.Restrictions#currencyOptions} for the field
       * documentation.
       */
      public Builder putAllCurrencyOption(
          Map<String, PromotionCodeUpdateParams.Restrictions.CurrencyOption> map) {
        if (this.currencyOptions == null) {
          this.currencyOptions = new HashMap<>();
        }
        this.currencyOptions.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PromotionCodeUpdateParams.Restrictions#extraParams} for the field documentation.
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
       * See {@link PromotionCodeUpdateParams.Restrictions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    public static class CurrencyOption {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must
       * be $100 or more to work).
       */
      @SerializedName("minimum_amount")
      Long minimumAmount;

      private CurrencyOption(Map<String, Object> extraParams, Long minimumAmount) {
        this.extraParams = extraParams;
        this.minimumAmount = minimumAmount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Long minimumAmount;

        /** Finalize and obtain parameter instance from this builder. */
        public PromotionCodeUpdateParams.Restrictions.CurrencyOption build() {
          return new PromotionCodeUpdateParams.Restrictions.CurrencyOption(
              this.extraParams, this.minimumAmount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PromotionCodeUpdateParams.Restrictions.CurrencyOption#extraParams} for
         * the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PromotionCodeUpdateParams.Restrictions.CurrencyOption#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase
         * must be $100 or more to work).
         */
        public Builder setMinimumAmount(Long minimumAmount) {
          this.minimumAmount = minimumAmount;
          return this;
        }
      }
    }
  }
}
