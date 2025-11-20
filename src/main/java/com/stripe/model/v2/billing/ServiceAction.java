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
  Long serviceIntervalCount;

  /**
   * The type of the service action.
   *
   * <p>One of {@code credit_grant}, or {@code credit_grant_per_tenant}.
   */
  @SerializedName("type")
  String type;

  /** Details for the credit grant. Provided only if {@code type} is &quot;credit_grant&quot;. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrant extends StripeObject {
    /** The amount of the credit grant. */
    @SerializedName("amount")
    Amount amount;

    /** Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /**
     * The category of the credit grant.
     *
     * <p>One of {@code paid}, or {@code promotional}.
     */
    @SerializedName("category")
    String category;

    /** The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /** A descriptive name shown in dashboard. */
    @SerializedName("name")
    String name;

    /**
     * The desired priority for applying this credit grant. If not specified, it will be set to the
     * default value of 50. The highest priority is 0 and the lowest is 100.
     */
    @SerializedName("priority")
    Long priority;

    /** The amount of the credit grant. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @SerializedName("custom_pricing_unit")
      com.stripe.model.v2.billing.ServiceAction.CreditGrant.Amount.CustomPricingUnit
          customPricingUnit;

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      Monetary monetary;

      /**
       * The type of the credit grant amount. We currently support {@code monetary} and {@code
       * custom_pricing_unit} billing credits.
       *
       * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit extends StripeObject implements HasId {
        /** The Custom Pricing Unit object. */
        @SerializedName("custom_pricing_unit_details")
        com.stripe.model.v2.billing.CustomPricingUnit customPricingUnitDetails;

        /** The id of the custom pricing unit. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The value of the credit grant, decimal value represented as a string. */
        @SerializedName("value")
        String value;
      }

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Monetary extends StripeObject {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * A non-negative integer representing how much to charge in the <a
         * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
         */
        @SerializedName("value")
        Long value;
      }
    }

    /** Defines the scope where the credit grant is applicable. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig extends StripeObject {
      /** The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      /** The applicability scope of the credit grant. */
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

    /** The expiry configuration for the credit grant. */
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
   * Details for the credit grant per tenant. Provided only if {@code type} is
   * &quot;credit_grant_per_tenant&quot;.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CreditGrantPerTenant extends StripeObject {
    /** The amount of the credit grant. */
    @SerializedName("amount")
    Amount amount;

    /** Defines the scope where the credit grant is applicable. */
    @SerializedName("applicability_config")
    ApplicabilityConfig applicabilityConfig;

    /**
     * The category of the credit grant.
     *
     * <p>One of {@code paid}, or {@code promotional}.
     */
    @SerializedName("category")
    String category;

    /** The expiry configuration for the credit grant. */
    @SerializedName("expiry_config")
    ExpiryConfig expiryConfig;

    /** Customer-facing name for the credit grant. */
    @SerializedName("name")
    String name;

    /**
     * The desired priority for applying this credit grant. If not specified, it will be set to the
     * default value of 50. The highest priority is 0 and the lowest is 100.
     */
    @SerializedName("priority")
    Long priority;

    /** The amount of the credit grant. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Amount extends StripeObject {
      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @SerializedName("custom_pricing_unit")
      com.stripe.model.v2.billing.ServiceAction.CreditGrantPerTenant.Amount.CustomPricingUnit
          customPricingUnit;

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @SerializedName("monetary")
      Monetary monetary;

      /**
       * The type of the credit grant amount. We currently support {@code monetary} and {@code
       * custom_pricing_unit} billing credits.
       *
       * <p>One of {@code custom_pricing_unit}, or {@code monetary}.
       */
      @SerializedName("type")
      String type;

      /**
       * The custom pricing unit amount of the credit grant. Required if {@code type} is {@code
       * custom_pricing_unit}.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CustomPricingUnit extends StripeObject implements HasId {
        /** The Custom Pricing Unit object. */
        @SerializedName("custom_pricing_unit_details")
        com.stripe.model.v2.billing.CustomPricingUnit customPricingUnitDetails;

        /** The id of the custom pricing unit. */
        @Getter(onMethod_ = {@Override})
        @SerializedName("id")
        String id;

        /** The value of the credit grant, decimal value represented as a string. */
        @SerializedName("value")
        String value;
      }

      /** The monetary amount of the credit grant. Required if {@code type} is {@code monetary}. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Monetary extends StripeObject {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * A non-negative integer representing how much to charge in the <a
         * href="https://docs.stripe.com/currencies#minor-units">smallest currency unit</a>.
         */
        @SerializedName("value")
        Long value;
      }
    }

    /** Defines the scope where the credit grant is applicable. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApplicabilityConfig extends StripeObject {
      /** The applicability scope of the credit grant. */
      @SerializedName("scope")
      Scope scope;

      /** The applicability scope of the credit grant. */
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

    /** The expiry configuration for the credit grant. */
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
