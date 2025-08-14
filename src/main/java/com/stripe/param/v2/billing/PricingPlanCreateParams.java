// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PricingPlanCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The currency of the PricingPlan. */
  @SerializedName("currency")
  String currency;

  /** Description of pricing plan subscription. */
  @SerializedName("description")
  String description;

  /** <strong>Required.</strong> Display name of the PricingPlan. Maximum 250 characters. */
  @SerializedName("display_name")
  String displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
   * characters.
   */
  @SerializedName("lookup_key")
  String lookupKey;

  /** Set of key-value pairs that you can attach to a PricingPlan. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The Stripe Tax tax behavior - whether the PricingPlan is inclusive
   * or exclusive of tax.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  private PricingPlanCreateParams(
      String currency,
      String description,
      String displayName,
      Map<String, Object> extraParams,
      String lookupKey,
      Map<String, String> metadata,
      TaxBehavior taxBehavior) {
    this.currency = currency;
    this.description = description;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.lookupKey = lookupKey;
    this.metadata = metadata;
    this.taxBehavior = taxBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String description;

    private String displayName;

    private Map<String, Object> extraParams;

    private String lookupKey;

    private Map<String, String> metadata;

    private TaxBehavior taxBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public PricingPlanCreateParams build() {
      return new PricingPlanCreateParams(
          this.currency,
          this.description,
          this.displayName,
          this.extraParams,
          this.lookupKey,
          this.metadata,
          this.taxBehavior);
    }

    /** <strong>Required.</strong> The currency of the PricingPlan. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** Description of pricing plan subscription. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /** <strong>Required.</strong> Display name of the PricingPlan. Maximum 250 characters. */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PricingPlanCreateParams#extraParams} for the field documentation.
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
     * See {@link PricingPlanCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * An internal key you can use to search for a particular PricingPlan. Maximum length of 200
     * characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PricingPlanCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PricingPlanCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The Stripe Tax tax behavior - whether the PricingPlan is inclusive
     * or exclusive of tax.
     */
    public Builder setTaxBehavior(PricingPlanCreateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }
  }

  public enum TaxBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("exclusive")
    EXCLUSIVE("exclusive"),

    @SerializedName("inclusive")
    INCLUSIVE("inclusive");

    @Getter(onMethod_ = {@Override})
    private final String value;

    TaxBehavior(String value) {
      this.value = value;
    }
  }
}
