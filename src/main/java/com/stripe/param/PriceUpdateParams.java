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
public class PriceUpdateParams extends ApiRequestParams {
  /** Whether the price can be used for new purchases. Defaults to {@code true}. */
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
   * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** A brief description of the price, hidden from customers. */
  @SerializedName("nickname")
  Object nickname;

  /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
  @SerializedName("recurring")
  Object recurring;

  /**
   * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
   * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code
   * inclusive} or {@code exclusive}, it cannot be changed.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  /**
   * If set to true, will atomically remove the lookup key from the existing price, and assign it to
   * this price.
   */
  @SerializedName("transfer_lookup_key")
  Boolean transferLookupKey;

  private PriceUpdateParams(
      Boolean active,
      List<String> expand,
      Map<String, Object> extraParams,
      Object lookupKey,
      Object metadata,
      Object nickname,
      Object recurring,
      TaxBehavior taxBehavior,
      Boolean transferLookupKey) {
    this.active = active;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.nickname = nickname;
    this.recurring = recurring;
    this.taxBehavior = taxBehavior;
    this.transferLookupKey = transferLookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Object lookupKey;

    private Object metadata;

    private Object nickname;

    private Object recurring;

    private TaxBehavior taxBehavior;

    private Boolean transferLookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public PriceUpdateParams build() {
      return new PriceUpdateParams(
          this.active,
          this.expand,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.nickname,
          this.recurring,
          this.taxBehavior,
          this.transferLookupKey);
    }

    /** Whether the price can be used for new purchases. Defaults to {@code true}. */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PriceUpdateParams#expand} for the field documentation.
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
     * PriceUpdateParams#expand} for the field documentation.
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
     * PriceUpdateParams#extraParams} for the field documentation.
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
     * See {@link PriceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200
     * characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PriceUpdateParams#metadata} for the field documentation.
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
     * See {@link PriceUpdateParams#metadata} for the field documentation.
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

    /** A brief description of the price, hidden from customers. */
    public Builder setNickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /** A brief description of the price, hidden from customers. */
    public Builder setNickname(EmptyParam nickname) {
      this.nickname = nickname;
      return this;
    }

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    public Builder setRecurring(Recurring recurring) {
      this.recurring = recurring;
      return this;
    }

    /** The recurring components of a price such as {@code interval} and {@code usage_type}. */
    public Builder setRecurring(EmptyParam recurring) {
      this.recurring = recurring;
      return this;
    }

    /**
     * Specifies whether the price is considered inclusive of taxes or exclusive of taxes. One of
     * {@code inclusive}, {@code exclusive}, or {@code unspecified}. Once specified as either {@code
     * inclusive} or {@code exclusive}, it cannot be changed.
     */
    public Builder setTaxBehavior(TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }

    /**
     * If set to true, will atomically remove the lookup key from the existing price, and assign it
     * to this price.
     */
    public Builder setTransferLookupKey(Boolean transferLookupKey) {
      this.transferLookupKey = transferLookupKey;
      return this;
    }
  }

  @Getter
  public static class Recurring {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Default number of trial days when subscribing a customer to this plan using <a
     * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
     * trial_from_plan=true}</a>.
     */
    @SerializedName("trial_period_days")
    Long trialPeriodDays;

    private Recurring(Map<String, Object> extraParams, Long trialPeriodDays) {
      this.extraParams = extraParams;
      this.trialPeriodDays = trialPeriodDays;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long trialPeriodDays;

      /** Finalize and obtain parameter instance from this builder. */
      public Recurring build() {
        return new Recurring(this.extraParams, this.trialPeriodDays);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PriceUpdateParams.Recurring#extraParams} for the field documentation.
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
       * See {@link PriceUpdateParams.Recurring#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Default number of trial days when subscribing a customer to this plan using <a
       * href="https://stripe.com/docs/api#create_subscription-trial_from_plan">{@code
       * trial_from_plan=true}</a>.
       */
      public Builder setTrialPeriodDays(Long trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
        return this;
      }
    }
  }

  public enum TaxBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("exclusive")
    EXCLUSIVE("exclusive"),

    @SerializedName("inclusive")
    INCLUSIVE("inclusive"),

    @SerializedName("unspecified")
    UNSPECIFIED("unspecified");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxBehavior(String value) {
      this.value = value;
    }
  }
}
