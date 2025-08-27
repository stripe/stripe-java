// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ServiceAction extends StripeObject implements HasId {
  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** Details for the credit grant. Provided only if {@code type} is &quot;credit_grant&quot;. */
  @SerializedName("credit_grant")
  CreditGrant creditGrant;

  /**
   * Details for the credit grant per tenant. Provided only if {@code type} is
   * &quot;credit_grant_per_tenant&quot;.
   */
  @SerializedName("credit_grant_per_tenant")
  CreditGrantPerTenant creditGrantPerTenant;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** An internal key you can use to search for this service action. */
  @SerializedName("lookup_key")
  String lookupKey;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.service_action}.
   */
  @SerializedName("object")
  String object;

  /**
   * The interval for assessing service.
   *
   * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
   */
  @SerializedName("service_interval")
  String serviceInterval;

  /** The length of the interval for assessing service. */
  @SerializedName("service_interval_count")
  Integer serviceIntervalCount;

  /**
   * The type of the service action.
   *
   * <p>One of {@code credit_grant}, or {@code credit_grant_per_tenant}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about CreditGrant, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrant extends StripeObject {
    /** The amount of the credit grant. */
    @SerializedName("amount")
    com.stripe.model.v2.billing.ServiceAction.CreditGrant.Amount amount;

    /** Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /** The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /** A descriptive name shown in dashboard. */
    @SerializedName("name")
    String name;

    /**
     * For more details about Amount, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @SerializedName("custom_pricing_unit")
      CustomPricingUnit customPricingUnit;

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      com.stripe.v2.Amount monetary;

      /**
       * The type of the credit grant amount. We currently support {@code monetary} and {@code
       * custom_pricing_unit} billing credits.
       *
       * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about CustomPricingUnit, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit extends StripeObject implements HasId {
        /** The id of the custom pricing unit. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The value of the credit grant, decimal value represented as a string. */
        @SerializedName("value")
        String value;
      }
    }

    /**
     * For more details about ApplicabilityConfig, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig extends StripeObject {
      /** The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      /**
       * For more details about Scope, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scope extends StripeObject {
        /** The billable items to apply the credit grant to. */
        @SerializedName("billable_items")
        List<String> billableItems;

        /**
         * The price type that credit grants can apply to. We currently only support the {@code
         * metered} price type. This will apply to metered prices and rate cards. Cannot be used in
         * combination with {@code billable_items}.
         *
         * <p>Equal to {@code metered}.
         */
        @SerializedName("price_type")
        String priceType;
      }
    }

    /**
     * For more details about ExpiryConfig, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExpiryConfig extends StripeObject {
      /**
       * The type of the expiry configuration. We currently support {@code end_of_service_period}.
       *
       * <p>Equal to {@code end_of_service_period}.
       */
      @SerializedName("type")
      String type;
    }
  }

  /**
   * For more details about CreditGrantPerTenant, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrantPerTenant extends StripeObject {
    /** The amount of the credit grant. */
    @SerializedName("amount")
    com.stripe.model.v2.billing.ServiceAction.CreditGrantPerTenant.Amount amount;

    /** Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /** The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /** Customer-facing name for the credit grant. */
    @SerializedName("name")
    String name;

    /**
     * For more details about Amount, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @SerializedName("custom_pricing_unit")
      CustomPricingUnit customPricingUnit;

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      com.stripe.v2.Amount monetary;

      /**
       * The type of the credit grant amount. We currently support {@code monetary} and {@code
       * custom_pricing_unit} billing credits.
       *
       * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about CustomPricingUnit, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit extends StripeObject implements HasId {
        /** The id of the custom pricing unit. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The value of the credit grant, decimal value represented as a string. */
        @SerializedName("value")
        String value;
      }
    }

    /**
     * For more details about ApplicabilityConfig, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig extends StripeObject {
      /** The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      /**
       * For more details about Scope, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Scope extends StripeObject {
        /** The billable items to apply the credit grant to. */
        @SerializedName("billable_items")
        List<String> billableItems;

        /**
         * The price type that credit grants can apply to. We currently only support the {@code
         * metered} price type. This will apply to metered prices and rate cards. Cannot be used in
         * combination with {@code billable_items}.
         *
         * <p>Equal to {@code metered}.
         */
        @SerializedName("price_type")
        String priceType;
      }
    }

    /**
     * For more details about ExpiryConfig, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ExpiryConfig extends StripeObject {
      /**
       * The type of the expiry configuration. We currently support {@code end_of_service_period}.
       *
       * <p>Equal to {@code end_of_service_period}.
       */
      @SerializedName("type")
      String type;
    }
  }
}
