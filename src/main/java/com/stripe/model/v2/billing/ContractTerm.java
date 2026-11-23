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

/** A commercial term. Display order is independent of billing evaluation order. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ContractTerm extends StripeObject implements HasId {
  /** The stable ID of the term. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The lookup key, unique across all term types on this contract. */
  @SerializedName("lookup_key")
  String lookupKey;

  /** Set of key-value pairs attached to the term. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.billing.contract_term}.
   */
  @SerializedName("object")
  String object;

  /** Present when type is pricing_override. */
  @SerializedName("pricing_override")
  PricingOverride pricingOverride;

  /** Present when type is recurring_price. */
  @SerializedName("recurring_price")
  RecurringPrice recurringPrice;

  /** Present when type is scheduled_fee. */
  @SerializedName("scheduled_fee")
  ScheduledFee scheduledFee;

  /**
   * The type of this term.
   *
   * <p>One of {@code pricing_override}, {@code recurring_price}, or {@code scheduled_fee}.
   */
  @SerializedName("type")
  String type;

  /** Present when type is pricing_override. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingOverride extends StripeObject {
    /**
     * Recurring or scheduled_fee terms selected by this override. An override without criteria
     * applies to all recurring and scheduled_fee terms.
     */
    @SerializedName("criteria")
    List<ContractTerm.PricingOverride.Criterion> criteria;

    /** The exclusive end of the validity window. Null for an open end. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /** Present when type is multiply. */
    @SerializedName("multiply")
    Multiply multiply;

    /** Present when type is overwrite. */
    @SerializedName("overwrite")
    Overwrite overwrite;

    /** Lower numbers win. Equal priorities resolve by display order; overrides do not stack. */
    @SerializedName("priority")
    Long priority;

    /** The inclusive start of the override's validity window. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /**
     * The pricing operation.
     *
     * <p>One of {@code multiply}, or {@code overwrite}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Criterion, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Criterion extends StripeObject {
      /** Resolved IDs of recurring or scheduled_fee terms. Override terms are not valid targets. */
      @SerializedName("terms")
      List<String> terms;

      /**
       * Whether to include or exclude the selected recurring or scheduled_fee terms.
       *
       * <p>One of {@code exclude}, or {@code include}.
       */
      @SerializedName("type")
      String type;
    }

    /** The exclusive end of the validity window. Null for an open end. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EndsAt extends StripeObject {
      /** The timestamp when the item ends. */
      @SerializedName("timestamp")
      Instant timestamp;
    }

    /** Present when type is multiply. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multiply extends StripeObject {
      /** The multiplier, for example 0.85 for a 15% discount. */
      @SerializedName("factor")
      BigDecimal factor;
    }

    /** Present when type is overwrite. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Overwrite extends StripeObject {
      /**
       * Whether the replacement pricing is per unit or tiered.
       *
       * <p>One of {@code per_unit}, or {@code tiered}.
       */
      @SerializedName("billing_scheme")
      String billingScheme;

      /** Replacement pricing tiers. */
      @SerializedName("tiers")
      List<ContractTerm.PricingOverride.Overwrite.Tier> tiers;

      /**
       * How the pricing tiers are applied.
       *
       * <p>One of {@code graduated}, or {@code volume}.
       */
      @SerializedName("tiers_mode")
      String tiersMode;

      /** The replacement per-unit amount in minor currency units. */
      @SerializedName("unit_amount_decimal")
      BigDecimal unitAmountDecimal;

      /**
       * For more details about Tier, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tier extends StripeObject {
        /** Flat amount in minor currency units. */
        @SerializedName("flat_amount_decimal")
        BigDecimal flatAmountDecimal;

        /** Per-unit amount in minor currency units. */
        @SerializedName("unit_amount_decimal")
        BigDecimal unitAmountDecimal;

        /** Inclusive whole-number upper bound. Omitted for an unbounded final tier. */
        @SerializedName("up_to")
        @JsonAdapter(StringInt64TypeAdapter.class)
        Long upTo;
      }
    }

    /** The inclusive start of the override's validity window. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt extends StripeObject {
      /** The timestamp when the item starts. */
      @SerializedName("timestamp")
      Instant timestamp;
    }
  }

  /** Present when type is recurring_price. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RecurringPrice extends StripeObject {
    /** The exclusive end of the term. Null for an open end. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /** The V1 recurring Price. */
    @SerializedName("price")
    String price;

    /** Current licensed quantity. Null for metered Prices; history is available separately. */
    @SerializedName("quantity")
    BigDecimal quantity;

    /** The inclusive start of the term. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /** The exclusive end of the term. Null for an open end. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EndsAt extends StripeObject {
      /** The timestamp when the item ends. */
      @SerializedName("timestamp")
      Instant timestamp;
    }

    /** The inclusive start of the term. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt extends StripeObject {
      /** The timestamp when the item starts. */
      @SerializedName("timestamp")
      Instant timestamp;
    }
  }

  /** Present when type is scheduled_fee. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ScheduledFee extends StripeObject {
    /** Explicit bill dates and amounts, including billed history. */
    @SerializedName("bill_schedule")
    BillSchedule billSchedule;

    /** The V1 Product being billed. */
    @SerializedName("product")
    String product;

    /**
     * Informational invoice and revenue-recognition period with timestamp objects; does not affect
     * billing or proration.
     */
    @SerializedName("service_period")
    ServicePeriod servicePeriod;

    /** Explicit bill dates and amounts, including billed history. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillSchedule extends StripeObject {
      /** Scheduled installments and billed history. */
      @SerializedName("custom")
      List<ContractTerm.ScheduledFee.BillSchedule.Custom> custom;

      /**
       * The type of billing schedule.
       *
       * <p>Equal to {@code custom}.
       */
      @SerializedName("type")
      String type;

      /**
       * For more details about Custom, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Custom extends StripeObject {
        /** The resolved bill date. */
        @SerializedName("bill_at")
        BillAt billAt;

        /** Resolved installment quantity. Always present; defaults to 1 when omitted on input. */
        @SerializedName("quantity")
        BigDecimal quantity;

        /** Unit price in minor units of the contract's currency, before multiplying by quantity. */
        @SerializedName("unit_amount_decimal")
        BigDecimal unitAmountDecimal;

        /** The resolved bill date. */
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
     * Informational invoice and revenue-recognition period with timestamp objects; does not affect
     * billing or proration.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ServicePeriod extends StripeObject {
      /** The exclusive end of the service period. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /** The inclusive start of the service period. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /** The exclusive end of the service period. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt extends StripeObject {
        /** The timestamp when the item ends. */
        @SerializedName("timestamp")
        Instant timestamp;
      }

      /** The inclusive start of the service period. */
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
