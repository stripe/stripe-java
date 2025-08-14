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
public class RateCardCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The currency of this RateCard. */
  @SerializedName("currency")
  String currency;

  /**
   * <strong>Required.</strong> A customer-facing name for the RateCard. This name is used in
   * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on Invoices.
   * Maximum length of 250 characters.
   */
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * <strong>Required.</strong> The interval for assessing service. For example, a monthly RateCard
   * with a rate of $1 for the first 10 &quot;workloads&quot; and $2 thereafter means &quot;$1 per
   * workload up to 10 workloads during a month of service.&quot; This is similar to but distinct
   * from billing interval; the service interval deals with the rate at which the customer
   * accumulates fees, while the billing interval in Cadence deals with the rate the customer is
   * billed.
   */
  @SerializedName("service_interval")
  ServiceInterval serviceInterval;

  /**
   * <strong>Required.</strong> The length of the interval for assessing service. For example, set
   * this to 3 and {@code service_interval} to {@code "month"} in order to specify quarterly
   * service.
   */
  @SerializedName("service_interval_count")
  Integer serviceIntervalCount;

  /**
   * <strong>Required.</strong> The Stripe Tax tax behavior - whether the rates are inclusive or
   * exclusive of tax.
   */
  @SerializedName("tax_behavior")
  TaxBehavior taxBehavior;

  private RateCardCreateParams(
      String currency,
      String displayName,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      ServiceInterval serviceInterval,
      Integer serviceIntervalCount,
      TaxBehavior taxBehavior) {
    this.currency = currency;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.serviceInterval = serviceInterval;
    this.serviceIntervalCount = serviceIntervalCount;
    this.taxBehavior = taxBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String currency;

    private String displayName;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private ServiceInterval serviceInterval;

    private Integer serviceIntervalCount;

    private TaxBehavior taxBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public RateCardCreateParams build() {
      return new RateCardCreateParams(
          this.currency,
          this.displayName,
          this.extraParams,
          this.metadata,
          this.serviceInterval,
          this.serviceIntervalCount,
          this.taxBehavior);
    }

    /** <strong>Required.</strong> The currency of this RateCard. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <strong>Required.</strong> A customer-facing name for the RateCard. This name is used in
     * Stripe-hosted products like the Customer Portal and Checkout. It does not show up on
     * Invoices. Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RateCardCreateParams#extraParams} for the field documentation.
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
     * See {@link RateCardCreateParams#extraParams} for the field documentation.
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
     * RateCardCreateParams#metadata} for the field documentation.
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
     * See {@link RateCardCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The interval for assessing service. For example, a monthly
     * RateCard with a rate of $1 for the first 10 &quot;workloads&quot; and $2 thereafter means
     * &quot;$1 per workload up to 10 workloads during a month of service.&quot; This is similar to
     * but distinct from billing interval; the service interval deals with the rate at which the
     * customer accumulates fees, while the billing interval in Cadence deals with the rate the
     * customer is billed.
     */
    public Builder setServiceInterval(RateCardCreateParams.ServiceInterval serviceInterval) {
      this.serviceInterval = serviceInterval;
      return this;
    }

    /**
     * <strong>Required.</strong> The length of the interval for assessing service. For example, set
     * this to 3 and {@code service_interval} to {@code "month"} in order to specify quarterly
     * service.
     */
    public Builder setServiceIntervalCount(Integer serviceIntervalCount) {
      this.serviceIntervalCount = serviceIntervalCount;
      return this;
    }

    /**
     * <strong>Required.</strong> The Stripe Tax tax behavior - whether the rates are inclusive or
     * exclusive of tax.
     */
    public Builder setTaxBehavior(RateCardCreateParams.TaxBehavior taxBehavior) {
      this.taxBehavior = taxBehavior;
      return this;
    }
  }

  public enum ServiceInterval implements ApiRequestParams.EnumParam {
    @SerializedName("day")
    DAY("day"),

    @SerializedName("month")
    MONTH("month"),

    @SerializedName("week")
    WEEK("week"),

    @SerializedName("year")
    YEAR("year");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ServiceInterval(String value) {
      this.value = value;
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
