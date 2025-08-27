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
public class PricingPlanSubscriptionListParams extends ApiRequestParams {
  /**
   * Filter by Billing Cadence ID. Mutually exclusive with {@code payer}, {@code pricing_plan}, and
   * {@code pricing_plan_version}.
   */
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

  /** Optionally set the maximum number of results per page. Defaults to 20. */
  @SerializedName("limit")
  Integer limit;

  /**
   * Filter by payer. Mutually exclusive with {@code billing_cadence}, {@code pricing_plan}, and
   * {@code pricing_plan_version}.
   */
  @SerializedName("payer")
  Payer payer;

  /**
   * Filter by PricingPlan ID. Mutually exlcusive with {@code billing_cadence}, {@code payer}, and
   * {@code pricing_plan_version}.
   */
  @SerializedName("pricing_plan")
  String pricingPlan;

  /**
   * Filter by Pricing Plan Version ID. Mutually exlcusive with {@code billing_cadence}, {@code
   * payer}, and {@code pricing_plan}.
   */
  @SerializedName("pricing_plan_version")
  String pricingPlanVersion;

  /** Filter by servicing status. */
  @SerializedName("servicing_status")
  ServicingStatus servicingStatus;

  private PricingPlanSubscriptionListParams(
      String billingCadence,
      Map<String, Object> extraParams,
      Integer limit,
      Payer payer,
      String pricingPlan,
      String pricingPlanVersion,
      ServicingStatus servicingStatus) {
    this.billingCadence = billingCadence;
    this.extraParams = extraParams;
    this.limit = limit;
    this.payer = payer;
    this.pricingPlan = pricingPlan;
    this.pricingPlanVersion = pricingPlanVersion;
    this.servicingStatus = servicingStatus;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String billingCadence;

    private Map<String, Object> extraParams;

    private Integer limit;

    private Payer payer;

    private String pricingPlan;

    private String pricingPlanVersion;

    private ServicingStatus servicingStatus;

    /** Finalize and obtain parameter instance from this builder. */
    public PricingPlanSubscriptionListParams build() {
      return new PricingPlanSubscriptionListParams(
          this.billingCadence,
          this.extraParams,
          this.limit,
          this.payer,
          this.pricingPlan,
          this.pricingPlanVersion,
          this.servicingStatus);
    }

    /**
     * Filter by Billing Cadence ID. Mutually exclusive with {@code payer}, {@code pricing_plan},
     * and {@code pricing_plan_version}.
     */
    public Builder setBillingCadence(String billingCadence) {
      this.billingCadence = billingCadence;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PricingPlanSubscriptionListParams#extraParams} for the field documentation.
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
     * See {@link PricingPlanSubscriptionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optionally set the maximum number of results per page. Defaults to 20. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Filter by payer. Mutually exclusive with {@code billing_cadence}, {@code pricing_plan}, and
     * {@code pricing_plan_version}.
     */
    public Builder setPayer(PricingPlanSubscriptionListParams.Payer payer) {
      this.payer = payer;
      return this;
    }

    /**
     * Filter by PricingPlan ID. Mutually exlcusive with {@code billing_cadence}, {@code payer}, and
     * {@code pricing_plan_version}.
     */
    public Builder setPricingPlan(String pricingPlan) {
      this.pricingPlan = pricingPlan;
      return this;
    }

    /**
     * Filter by Pricing Plan Version ID. Mutually exlcusive with {@code billing_cadence}, {@code
     * payer}, and {@code pricing_plan}.
     */
    public Builder setPricingPlanVersion(String pricingPlanVersion) {
      this.pricingPlanVersion = pricingPlanVersion;
      return this;
    }

    /** Filter by servicing status. */
    public Builder setServicingStatus(
        PricingPlanSubscriptionListParams.ServicingStatus servicingStatus) {
      this.servicingStatus = servicingStatus;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Payer {
    /**
     * The ID of the Customer object. If provided, only Pricing Plan Subscriptions that are
     * subscribed on the cadences with the specified payer will be returned.
     */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
     * supported value is {@code customer}.
     */
    @SerializedName("type")
    Type type;

    private Payer(String customer, Map<String, Object> extraParams, Type type) {
      this.customer = customer;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customer;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PricingPlanSubscriptionListParams.Payer build() {
        return new PricingPlanSubscriptionListParams.Payer(
            this.customer, this.extraParams, this.type);
      }

      /**
       * The ID of the Customer object. If provided, only Pricing Plan Subscriptions that are
       * subscribed on the cadences with the specified payer will be returned.
       */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PricingPlanSubscriptionListParams.Payer#extraParams} for the field documentation.
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
       * See {@link PricingPlanSubscriptionListParams.Payer#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> A string identifying the type of the payer. Currently the only
       * supported value is {@code customer}.
       */
      public Builder setType(PricingPlanSubscriptionListParams.Payer.Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("customer")
      CUSTOMER("customer");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum ServicingStatus implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("canceled")
    CANCELED("canceled"),

    @SerializedName("paused")
    PAUSED("paused"),

    @SerializedName("pending")
    PENDING("pending");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ServicingStatus(String value) {
      this.value = value;
    }
  }
}
