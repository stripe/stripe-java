// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Contract resource representing a comprehensive sales agreement. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Contract extends StripeObject implements HasId {
  /** The billing cycle anchor. */
  @SerializedName("billing_cycle_anchor")
  BillingCycleAnchor billingCycleAnchor;

  /** The billing settings. */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /** A unique user-provided contract number e.g. C-2026-0001. */
  @SerializedName("contract_number")
  String contractNumber;

  /** Timestamp of when the contract was created. */
  @SerializedName("created")
  Instant created;

  /** The currency. */
  @SerializedName("currency")
  String currency;

  /** The customer id. */
  @SerializedName("customer")
  String customer;

  /** The contract id. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Set of key-value pairs. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.contract}.
   */
  @SerializedName("object")
  String object;

  /**
   * The one-time fees. Only populated when {@code one_time_fees} is passed in the {@code include}
   * parameter.
   */
  @SerializedName("one_time_fees")
  OneTimeFees oneTimeFees;

  /**
   * The pricing lines. Only populated when {@code pricing_lines} is passed in the {@code include}
   * parameter.
   */
  @SerializedName("pricing_lines")
  PricingLines pricingLines;

  /**
   * The pricing overrides. Only populated when {@code pricing_overrides} is passed in the {@code
   * include} parameter.
   */
  @SerializedName("pricing_overrides")
  PricingOverrides pricingOverrides;

  /**
   * The current status of the contract.
   *
   * <p>One of {@code active}, {@code canceled}, {@code draft}, or {@code ended}.
   */
  @SerializedName("status")
  String status;

  /** Historical timestamps of when the contract transitioned into each status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** The billing cycle anchor. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingCycleAnchor extends StripeObject {
    /** The billing cycle anchor as a UTC timestamp. */
    @SerializedName("timestamp")
    Instant timestamp;
  }

  /** The billing settings. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingSettings extends StripeObject {
    /** The bill settings details configures invoice and tax settings for the contract. */
    @SerializedName("bill_settings_details")
    BillSettingsDetails billSettingsDetails;

    /** The billing profile details configures who is charged for the contract. */
    @SerializedName("billing_profile_details")
    BillingProfileDetails billingProfileDetails;

    /** The collection settings details configures how payments are collected on the contract. */
    @SerializedName("collection_settings_details")
    CollectionSettingsDetails collectionSettingsDetails;

    /** The bill settings details configures invoice and tax settings for the contract. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillSettingsDetails extends StripeObject {
      /** Calculation settings. */
      @SerializedName("calculation")
      Calculation calculation;

      /** Invoice settings. */
      @SerializedName("invoice")
      Invoice invoice;

      /** Calculation settings. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Calculation extends StripeObject {
        /** Tax calculation settings. */
        @SerializedName("tax")
        Tax tax;

        /** Tax calculation settings. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax extends StripeObject {
          /**
           * The type of tax calculation.
           *
           * <p>One of {@code automatic}, or {@code manual}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** Invoice settings. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Invoice extends StripeObject {
        /** The number of time units before the invoice is past due. */
        @SerializedName("time_until_due")
        TimeUntilDue timeUntilDue;

        /** The number of time units before the invoice is past due. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class TimeUntilDue extends StripeObject {
          /**
           * The interval unit.
           *
           * <p>One of {@code day}, {@code month}, {@code week}, or {@code year}.
           */
          @SerializedName("interval")
          String interval;

          /** The number of intervals. */
          @SerializedName("interval_count")
          Long intervalCount;
        }
      }
    }

    /** The billing profile details configures who is charged for the contract. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingProfileDetails extends StripeObject {
      /** The customer who pays for the contract invoice. */
      @SerializedName("customer")
      String customer;

      /** The default payment method for the contract. */
      @SerializedName("default_payment_method")
      String defaultPaymentMethod;
    }

    /** The collection settings details configures how payments are collected on the contract. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CollectionSettingsDetails extends StripeObject {
      /**
       * The collection method.
       *
       * <p>One of {@code charge_automatically}, or {@code send_invoice}.
       */
      @SerializedName("collection_method")
      String collectionMethod;

      /** The payment method configuration. */
      @SerializedName("payment_method_configuration")
      String paymentMethodConfiguration;
    }
  }

  /**
   * The one-time fees. Only populated when {@code one_time_fees} is passed in the {@code include}
   * parameter.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OneTimeFees extends StripeObject {
    /** The one-time fees for this page. */
    @SerializedName("data")
    List<Contract.OneTimeFees.Data> data;

    /**
     * For more details about Data, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject implements HasId {
      /** The amount billed for this fee. */
      @SerializedName("amount")
      Amount amount;

      /** When this fee will be billed. Always contains a concrete timestamp. */
      @SerializedName("bill_at")
      BillAt billAt;

      /** The id of the one-time fee. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The user-provided lookup key. */
      @SerializedName("lookup_key")
      String lookupKey;

      /** The id of the product for this fee. */
      @SerializedName("product")
      String product;

      /** When this fee will be billed. Always contains a concrete timestamp. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillAt extends StripeObject {
        /** The timestamp at which the fee will be billed. */
        @SerializedName("timestamp")
        Instant timestamp;
      }
    }
  }

  /**
   * The pricing lines. Only populated when {@code pricing_lines} is passed in the {@code include}
   * parameter.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingLines extends StripeObject {
    /** The pricing lines for this page. */
    @SerializedName("data")
    List<Contract.PricingLines.Data> data;

    /**
     * For more details about Data, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject implements HasId {
      /** Timestamp when the pricing line ends. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /** The id of the pricing line. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The user-provided lookup key for the pricing line. */
      @SerializedName("lookup_key")
      String lookupKey;

      /** Set of key-value pairs. */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** The pricing configuration for the pricing line. */
      @SerializedName("pricing")
      Pricing pricing;

      /** Timestamp when the pricing line starts. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /** Timestamp when the pricing line ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt extends StripeObject {
        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;
      }

      /** The pricing configuration for the pricing line. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Pricing extends StripeObject {
        /** V1 price details. Present when {@code type} is {@code price}. */
        @SerializedName("price_details")
        PriceDetails priceDetails;

        /**
         * The type of pricing.
         *
         * <p>Equal to {@code price}.
         */
        @SerializedName("type")
        String type;

        /** V1 price details. Present when {@code type} is {@code price}. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class PriceDetails extends StripeObject {
          /** The current quantity on this pricing line. */
          @SerializedName("current_quantity")
          BigDecimal currentQuantity;

          /** The ID of the V1 price. */
          @SerializedName("price")
          String price;

          /** The overwrite_price overrides embedded directly on this pricing line. */
          @SerializedName("pricing_overrides")
          PricingOverrides pricingOverrides;

          /** The overwrite_price overrides embedded directly on this pricing line. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class PricingOverrides extends StripeObject {
            /** The pricing line overrides. */
            @SerializedName("data")
            List<Contract.PricingLines.Data.Pricing.PriceDetails.PricingOverrides.InnerData> data;

            /**
             * For more details about InnerData, please refer to the <a
             * href="https://docs.stripe.com/api">API Reference.</a>
             */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class InnerData extends StripeObject implements HasId {
              /** Timestamp when this override ends. */
              @SerializedName("ends_at")
              EndsAt endsAt;

              /** The ID of the pricing override. */
              @Getter(onMethod_ = {@Override})
              @SerializedName("id")
              String id;

              /** The user-provided lookup key for this override. */
              @SerializedName("lookup_key")
              String lookupKey;

              /** Details for an overwrite_price override. */
              @SerializedName("overwrite_price")
              OverwritePrice overwritePrice;

              /**
               * The priority of this override relative to others. Lower number = higher priority.
               */
              @SerializedName("priority")
              Long priority;

              /** Timestamp when this override starts. */
              @SerializedName("starts_at")
              StartsAt startsAt;

              /**
               * The type of override.
               *
               * <p>Equal to {@code overwrite_price}.
               */
              @SerializedName("type")
              String type;

              /** Timestamp when this override ends. */
              @Getter
              @Setter
              @EqualsAndHashCode(callSuper = false)
              public static class EndsAt extends StripeObject {
                /** The timestamp when the item ends. */
                @SerializedName("timestamp")
                Instant timestamp;
              }

              /** Details for an overwrite_price override. */
              @Getter
              @Setter
              @EqualsAndHashCode(callSuper = false)
              public static class OverwritePrice extends StripeObject {
                /**
                 * Defines whether the tiered price should be graduated or volume-based.
                 *
                 * <p>One of {@code graduated}, or {@code volume}.
                 */
                @SerializedName("tiering_mode")
                String tieringMode;

                /** Each element represents a pricing tier. */
                @SerializedName("tiers")
                List<
                        Contract.PricingLines.Data.Pricing.PriceDetails.PricingOverrides.InnerData
                            .OverwritePrice.Tier>
                    tiers;

                /**
                 * The per-unit amount to be charged, represented as a decimal string in minor
                 * currency units.
                 */
                @SerializedName("unit_amount")
                String unitAmount;

                /**
                 * For more details about Tier, please refer to the <a
                 * href="https://docs.stripe.com/api">API Reference.</a>
                 */
                @Getter
                @Setter
                @EqualsAndHashCode(callSuper = false)
                public static class Tier extends StripeObject {
                  /**
                   * Price for the entire tier, represented as a decimal string in minor currency
                   * units.
                   */
                  @SerializedName("flat_amount")
                  String flatAmount;

                  /**
                   * Per-unit price for units included in this tier, represented as a decimal string
                   * in minor currency units.
                   */
                  @SerializedName("unit_amount")
                  String unitAmount;

                  /** Up to and including this quantity will be contained in the tier. */
                  @SerializedName("up_to_decimal")
                  BigDecimal upToDecimal;

                  /**
                   * No upper bound to this tier.
                   *
                   * <p>Equal to {@code inf}.
                   */
                  @SerializedName("up_to_inf")
                  String upToInf;
                }
              }

              /** Timestamp when this override starts. */
              @Getter
              @Setter
              @EqualsAndHashCode(callSuper = false)
              public static class StartsAt extends StripeObject {
                /** The timestamp when the item starts. */
                @SerializedName("timestamp")
                Instant timestamp;
              }
            }
          }
        }
      }

      /** Timestamp when the pricing line starts. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt extends StripeObject {
        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;
      }
    }
  }

  /**
   * The pricing overrides. Only populated when {@code pricing_overrides} is passed in the {@code
   * include} parameter.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingOverrides extends StripeObject {
    /** The pricing overrides for this page. */
    @SerializedName("data")
    List<Contract.PricingOverrides.Data> data;

    /**
     * For more details about Data, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject implements HasId {
      /** Resolved timestamp when the pricing override ends. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /** The ID of the pricing override. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The user-provided lookup key for the pricing override. */
      @SerializedName("lookup_key")
      String lookupKey;

      /** Details for a multiply_pricing override. */
      @SerializedName("multiply_pricing")
      MultiplyPricing multiplyPricing;

      /** The priority of this override relative to others. Lower number = higher priority. */
      @SerializedName("priority")
      Long priority;

      /** Resolved timestamp when the pricing override starts. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /**
       * The type of pricing override.
       *
       * <p>Equal to {@code multiply_pricing}.
       */
      @SerializedName("type")
      String type;

      /** Resolved timestamp when the pricing override ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt extends StripeObject {
        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;
      }

      /** Details for a multiply_pricing override. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MultiplyPricing extends StripeObject {
        /** Criteria determining which rates the multiply_pricing override applies to. */
        @SerializedName("criteria")
        List<Contract.PricingOverrides.Data.MultiplyPricing.Criterion> criteria;

        /**
         * The multiply_pricing factor, represented as a decimal string. e.g. &quot;0.8&quot; for a
         * 20% reduction.
         */
        @SerializedName("factor")
        String factor;

        /**
         * For more details about Criterion, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Criterion extends StripeObject {
          /** Filter by pricing line IDs. */
          @SerializedName("pricing_line_ids")
          List<String> pricingLineIds;

          /** Filter by pricing line lookup keys. */
          @SerializedName("pricing_line_lookup_keys")
          List<String> pricingLineLookupKeys;

          /**
           * Whether to include or exclude items matching these criteria.
           *
           * <p>One of {@code exclude}, or {@code include}.
           */
          @SerializedName("type")
          String type;
        }
      }

      /** Resolved timestamp when the pricing override starts. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt extends StripeObject {
        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;
      }
    }
  }

  /** Historical timestamps of when the contract transitioned into each status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** The timestamp when the contract was activated. */
    @SerializedName("activated_at")
    Instant activatedAt;

    /** The timestamp when the contract was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** The timestamp when the contract ended. */
    @SerializedName("ended_at")
    Instant endedAt;
  }
}
