// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StringInt64TypeAdapter;
import com.stripe.model.StripeObject;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Main Contract resource representing a comprehensive billing agreement. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Contract extends StripeObject implements HasId {
  /** The billing settings for the contract. */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /**
   * The contract line details of the contract. Only populated when {@code contract_line_details} is
   * passed in the {@code include} parameter.
   */
  @SerializedName("contract_line_details")
  List<Contract.ContractLineDetail> contractLineDetails;

  /** A unique user-provided contract number e.g. C-2026-0001. */
  @SerializedName("contract_number")
  String contractNumber;

  /** The computed total value of all contract lines. */
  @SerializedName("contract_value_details")
  ContractValueDetails contractValueDetails;

  /** Timestamp of when the object was created. */
  @SerializedName("created")
  Instant created;

  /** The currency of the contract. */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer associated with the contract. */
  @SerializedName("customer")
  String customer;

  /** The ID of the contract object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The license quantities of the contract. Only populated when {@code license_quantities} is
   * passed in the {@code include} parameter.
   */
  @SerializedName("license_quantities")
  List<Contract.LicenseQuantity> licenseQuantities;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Set of key-value pairs that you can attach to an object. */
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
   * The one-time fees of the contract. Only populated when {@code one_time_fees} is passed in the
   * {@code include} parameter.
   */
  @SerializedName("one_time_fees")
  List<Contract.OneTimeFee> oneTimeFees;

  /**
   * The pricing lines of the contract. Only populated when {@code pricing_lines} is passed in the
   * {@code include} parameter.
   */
  @SerializedName("pricing_lines")
  List<Contract.PricingLine> pricingLines;

  /**
   * The pricing overrides of the contract. Only populated when {@code pricing_overrides} is passed
   * in the {@code include} parameter.
   */
  @SerializedName("pricing_overrides")
  List<Contract.PricingOverride> pricingOverrides;

  /**
   * The current status of the contract.
   *
   * <p>One of {@code active}, {@code canceled}, {@code draft}, or {@code ended}.
   */
  @SerializedName("status")
  String status;

  /** Information about the contract status transitions. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** The billing settings for the contract. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingSettings extends StripeObject {
    /** Billing settings details for the contract. */
    @SerializedName("contract_billing_details")
    ContractBillingDetails contractBillingDetails;

    /** Billing settings details for the contract. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ContractBillingDetails extends StripeObject {
      /** The bill settings details. */
      @SerializedName("bill_settings_details")
      BillSettingsDetails billSettingsDetails;

      /** The billing profile details. */
      @SerializedName("billing_profile_details")
      BillingProfileDetails billingProfileDetails;

      /** The collection settings details. */
      @SerializedName("collection_settings_details")
      CollectionSettingsDetails collectionSettingsDetails;

      /** The bill settings details. */
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

      /** The billing profile details. */
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

      /** The collection settings details. */
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
  }

  /**
   * For more details about ContractLineDetail, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContractLineDetail extends StripeObject {
    /** The ID of the contract line. */
    @SerializedName("contract_line")
    String contractLine;

    /** The computed value details for the contract line. */
    @SerializedName("contract_line_value_details")
    ContractLineValueDetails contractLineValueDetails;

    /** Timestamp of when the object was created. */
    @SerializedName("created")
    Instant created;

    /** Timestamp to indicate when the contract line ends. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /** Set of key-value pairs that you can attach to an object. */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** List of overrides applied to the contract line. */
    @SerializedName("overrides")
    List<Contract.ContractLineDetail.Overrides> overrides;

    /** The pricing configuration for the contract line. */
    @SerializedName("pricing")
    Pricing pricing;

    /** Timestamp to indicate when the contract line starts. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /** The computed value details for the contract line. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ContractLineValueDetails extends StripeObject {
      /**
       * Computed sum of all licensed fees. Represented as a decimal string in minor currency units.
       */
      @SerializedName("total")
      String total;
    }

    /** Timestamp to indicate when the contract line ends. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EndsAt extends StripeObject {
      /** The timestamp when the item ends. */
      @SerializedName("timestamp")
      Instant timestamp;
    }

    /**
     * For more details about Overrides, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Overrides extends StripeObject {
      /** Timestamp to indicate when the override ends. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /** Service action override details. */
      @SerializedName("service_action")
      ServiceAction serviceAction;

      /** Timestamp to indicate when the override starts. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /**
       * The type of the override.
       *
       * <p>Equal to {@code service_action}.
       */
      @SerializedName("type")
      String type;

      /** Timestamp to indicate when the override ends. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt extends StripeObject {
        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;
      }

      /** Service action override details. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ServiceAction extends StripeObject {
        /** Parameters for adding a new service action. */
        @SerializedName("add")
        Add add;

        /** Parameters for replacing an existing service action. */
        @SerializedName("replace")
        Replace replace;

        /**
         * The type of service action override.
         *
         * <p>One of {@code add}, or {@code replace}.
         */
        @SerializedName("type")
        String type;

        /** Parameters for adding a new service action. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Add extends StripeObject {
          /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
          @SerializedName("credit_grant")
          CreditGrant creditGrant;

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
           * <p>Equal to {@code credit_grant}.
           */
          @SerializedName("type")
          String type;

          /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class CreditGrant extends StripeObject {
            /** The amount of the credit grant. */
            @SerializedName("amount")
            com.stripe.model.v2.billing.Contract.ContractLineDetail.Overrides.ServiceAction.Add
                    .CreditGrant.Amount
                amount;

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

            /** A descriptive name. */
            @SerializedName("name")
            String name;

            /**
             * The desired priority for applying this credit grant. The highest priority is 0 and
             * the lowest is 100.
             */
            @SerializedName("priority")
            Long priority;

            /** The amount of the credit grant. */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class Amount extends StripeObject {
              /**
               * The monetary amount of the credit grant. Required if {@code type} is {@code
               * monetary}.
               */
              @SerializedName("monetary")
              com.stripe.v2.Amount monetary;

              /**
               * The type of the credit grant amount.
               *
               * <p>Equal to {@code monetary}.
               */
              @SerializedName("type")
              String type;
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
                 * The price type that credit grants can apply to.
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
               * The type of the expiry configuration.
               *
               * <p>Equal to {@code end_of_service_period}.
               */
              @SerializedName("type")
              String type;
            }
          }
        }

        /** Parameters for replacing an existing service action. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Replace extends StripeObject implements HasId {
          /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
          @SerializedName("credit_grant")
          CreditGrant creditGrant;

          /** The ID of the service action to replace. */
          @Getter(onMethod_ = {@Override})
          @SerializedName("id")
          String id;

          /** The lookup key for the service action to replace. */
          @SerializedName("lookup_key")
          String lookupKey;

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
           * <p>Equal to {@code credit_grant}.
           */
          @SerializedName("type")
          String type;

          /** Details for the credit grant. Required if {@code type} is {@code credit_grant}. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class CreditGrant extends StripeObject {
            /** The amount of the credit grant. */
            @SerializedName("amount")
            com.stripe.model.v2.billing.Contract.ContractLineDetail.Overrides.ServiceAction.Replace
                    .CreditGrant.Amount
                amount;

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

            /** A descriptive name. */
            @SerializedName("name")
            String name;

            /**
             * The desired priority for applying this credit grant. The highest priority is 0 and
             * the lowest is 100.
             */
            @SerializedName("priority")
            Long priority;

            /** The amount of the credit grant. */
            @Getter
            @Setter
            @EqualsAndHashCode(callSuper = false)
            public static class Amount extends StripeObject {
              /**
               * The monetary amount of the credit grant. Required if {@code type} is {@code
               * monetary}.
               */
              @SerializedName("monetary")
              com.stripe.v2.Amount monetary;

              /**
               * The type of the credit grant amount.
               *
               * <p>Equal to {@code monetary}.
               */
              @SerializedName("type")
              String type;
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
                 * The price type that credit grants can apply to.
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
               * The type of the expiry configuration.
               *
               * <p>Equal to {@code end_of_service_period}.
               */
              @SerializedName("type")
              String type;
            }
          }
        }
      }

      /** Timestamp to indicate when the override starts. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StartsAt extends StripeObject {
        /** The timestamp when the item starts. */
        @SerializedName("timestamp")
        Instant timestamp;
      }
    }

    /** The pricing configuration for the contract line. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pricing extends StripeObject {}

    /** Timestamp to indicate when the contract line starts. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt extends StripeObject {
      /** The timestamp when the item starts. */
      @SerializedName("timestamp")
      Instant timestamp;
    }
  }

  /** The computed total value of all contract lines. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContractValueDetails extends StripeObject {
    /** The total value represented as a decimal string in minor currency units. */
    @SerializedName("total")
    String total;
  }

  /**
   * For more details about LicenseQuantity, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LicenseQuantity extends StripeObject {
    /** The ID of the license pricing. */
    @SerializedName("license_pricing_id")
    String licensePricingId;

    /**
     * The type of the license pricing.
     *
     * <p>One of {@code license_fee}, or {@code price}.
     */
    @SerializedName("license_pricing_type")
    String licensePricingType;

    /** The ID of the pricing line associated with this license quantity. */
    @SerializedName("pricing_line")
    String pricingLine;

    /** The current quantity of the license. */
    @SerializedName("quantity")
    Long quantity;
  }

  /**
   * For more details about OneTimeFee, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class OneTimeFee extends StripeObject {
    /** The resolved bill schedule for the fee. */
    @SerializedName("bill_schedule")
    List<Contract.OneTimeFee.BillSchedule> billSchedule;

    /**
     * The type of billable item that this fee references.
     *
     * <p>Equal to {@code product}.
     */
    @SerializedName("billable_item_type")
    String billableItemType;

    /**
     * Details for a product billable target. Set when {@code billable_item_type} is {@code
     * product}.
     */
    @SerializedName("product_details")
    ProductDetails productDetails;

    /**
     * For more details about BillSchedule, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillSchedule extends StripeObject {
      /** When this entry will be billed. */
      @SerializedName("bill_at")
      BillAt billAt;

      /** The amount to bill for this entry, in the smallest currency unit. */
      @SerializedName("value")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long value;

      /** When this entry will be billed. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillAt extends StripeObject {
        /**
         * The datetime at which the entry will be billed. Set when {@code type} is {@code
         * datetime}.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /**
         * The type of the bill_at.
         *
         * <p>One of {@code contract_start}, or {@code datetime}.
         */
        @SerializedName("type")
        String type;
      }
    }

    /**
     * Details for a product billable target. Set when {@code billable_item_type} is {@code
     * product}.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProductDetails extends StripeObject {
      /** The ID of the v1 Product. */
      @SerializedName("product")
      String product;
    }
  }

  /**
   * For more details about PricingLine, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingLine extends StripeObject {
    /** Resolved timestamp when the pricing line ends. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /** The user-provided lookup key for the pricing line. */
    @SerializedName("lookup_key")
    String lookupKey;

    /** Set of key-value pairs that you can attach to an object. */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** The pricing configuration for the pricing line. */
    @SerializedName("pricing")
    Pricing pricing;

    /** The ID of the pricing line. */
    @SerializedName("pricing_line")
    String pricingLine;

    /** Resolved timestamp when the pricing line starts. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /** Resolved timestamp when the pricing line ends. */
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
        /** The ID of the V1 price. */
        @SerializedName("price")
        String price;
      }
    }

    /** Resolved timestamp when the pricing line starts. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt extends StripeObject {
      /** The timestamp when the item starts. */
      @SerializedName("timestamp")
      Instant timestamp;
    }
  }

  /**
   * For more details about PricingOverride, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingOverride extends StripeObject {
    /** Resolved timestamp when the pricing override ends. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /** The user-provided lookup key for the pricing override. */
    @SerializedName("lookup_key")
    String lookupKey;

    /** Details for a multiplier override. */
    @SerializedName("multiplier")
    Multiplier multiplier;

    /** Details for an overwrite_price override. */
    @SerializedName("overwrite_price")
    OverwritePrice overwritePrice;

    /** The ID of the pricing override. */
    @SerializedName("pricing_override")
    String pricingOverride;

    /** The priority of this override relative to others. Lower number = higher priority. */
    @SerializedName("priority")
    Long priority;

    /** Resolved timestamp when the pricing override starts. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /**
     * The type of pricing override.
     *
     * <p>One of {@code multiplier}, or {@code overwrite_price}.
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

    /** Details for a multiplier override. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multiplier extends StripeObject {
      /** Criteria determining which rates the multiplier applies to. */
      @SerializedName("criteria")
      List<Contract.PricingOverride.Multiplier.Criterion> criteria;

      /**
       * The multiplier factor, represented as a decimal string. e.g. &quot;0.8&quot; for a 20%
       * reduction.
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
        /** Filter by billable item IDs. */
        @SerializedName("billable_item_ids")
        List<String> billableItemIds;

        /** Filter by billable item lookup keys. */
        @SerializedName("billable_item_lookup_keys")
        List<String> billableItemLookupKeys;

        /** Filter by billable item type. */
        @SerializedName("billable_item_types")
        List<String> billableItemTypes;

        /** Filter by metadata conditions. */
        @SerializedName("metadata_conditions")
        List<Contract.PricingOverride.Multiplier.Criterion.MetadataCondition> metadataConditions;

        /** Filter by rate card IDs. Only applicable for {@code multiplier} overrides. */
        @SerializedName("rate_card_ids")
        List<String> rateCardIds;

        /**
         * Whether to include or exclude items matching these criteria.
         *
         * <p>One of {@code exclude}, or {@code include}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about MetadataCondition, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class MetadataCondition extends StripeObject {
          /** All of these key-value conditions must match. */
          @SerializedName("all_of")
          List<Contract.PricingOverride.Multiplier.Criterion.MetadataCondition.AllOf> allOf;

          /**
           * For more details about AllOf, please refer to the <a
           * href="https://docs.stripe.com/api">API Reference.</a>
           */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class AllOf extends StripeObject {
            /** The metadata key. */
            @SerializedName("key")
            String key;

            /** The metadata value. */
            @SerializedName("value")
            String value;
          }
        }
      }
    }

    /** Details for an overwrite_price override. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OverwritePrice extends StripeObject {
      /** The ID of the V1 price to overwrite. */
      @SerializedName("price")
      String price;

      /**
       * Defines whether the tiered price should be graduated or volume-based.
       *
       * <p>One of {@code graduated}, or {@code volume}.
       */
      @SerializedName("tiering_mode")
      String tieringMode;

      /** Each element represents a pricing tier. */
      @SerializedName("tiers")
      List<Contract.PricingOverride.OverwritePrice.Tier> tiers;

      /**
       * The per-unit amount to be charged, represented as a decimal string in minor currency units.
       */
      @SerializedName("unit_amount")
      String unitAmount;

      /**
       * For more details about Tier, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tier extends StripeObject {
        /** Price for the entire tier, represented as a decimal string in minor currency units. */
        @SerializedName("flat_amount")
        String flatAmount;

        /**
         * Per-unit price for units included in this tier, represented as a decimal string in minor
         * currency units.
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

  /** Information about the contract status transitions. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details of the active contract status. */
    @SerializedName("active")
    Active active;

    /** Details of the canceled contract status. */
    @SerializedName("canceled")
    Canceled canceled;

    /** Details of the active contract status. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Active extends StripeObject {
      /** The timestamp when the contract was activated. */
      @SerializedName("activated_at")
      Instant activatedAt;
    }

    /** Details of the canceled contract status. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /** The timestamp when the contract was canceled. */
      @SerializedName("canceled_at")
      Instant canceledAt;
    }
  }
}
