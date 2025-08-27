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
public class RateCardSubscriptionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the Billing Cadence. */
  @SerializedName("billing_cadence")
  String billingCadence;

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
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> The ID of the Rate Card. */
  @SerializedName("rate_card")
  String rateCard;

  /**
   * The ID of the Rate Card Version. If not specified, defaults to the &quot;live_version&quot; of
   * the Rate Card at the time of creation.
   */
  @SerializedName("rate_card_version")
  String rateCardVersion;

  private RateCardSubscriptionCreateParams(
      String billingCadence,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String rateCard,
      String rateCardVersion) {
    this.billingCadence = billingCadence;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.rateCard = rateCard;
    this.rateCardVersion = rateCardVersion;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String billingCadence;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String rateCard;

    private String rateCardVersion;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCardSubscriptionCreateParams build() {
      return new RateCardSubscriptionCreateParams(
          this.billingCadence,
          this.extraParams,
          this.metadata,
          this.rateCard,
          this.rateCardVersion);
    }

    /** <strong>Required.</strong> The ID of the Billing Cadence. */
    public Builder setBillingCadence(String billingCadence) {
      this.billingCadence = billingCadence;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCardSubscriptionCreateParams#extraParams} for the field documentation.
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
     * See {@link RateCardSubscriptionCreateParams#extraParams} for the field documentation.
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
     * RateCardSubscriptionCreateParams#metadata} for the field documentation.
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
     * See {@link RateCardSubscriptionCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The ID of the Rate Card. */
    public Builder setRateCard(String rateCard) {
      this.rateCard = rateCard;
      return this;
    }

    /**
     * The ID of the Rate Card Version. If not specified, defaults to the &quot;live_version&quot;
     * of the Rate Card at the time of creation.
     */
    public Builder setRateCardVersion(String rateCardVersion) {
      this.rateCardVersion = rateCardVersion;
      return this;
    }
  }
}
