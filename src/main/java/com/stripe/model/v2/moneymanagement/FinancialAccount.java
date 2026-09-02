// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

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

/**
 * A FinancialAccount represents a balance and can be used as the source or destination for the
 * money management ({@code /v2/money_management}) APIs.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccount extends StripeObject implements HasId {
  /**
   * If this is a {@code accrued_fees} FinancialAccount, this hash include details specific to
   * {@code accrued_fees} FinancialAccount.
   */
  @SerializedName("accrued_fees")
  AccruedFees accruedFees;

  /**
   * Multi-currency balance of this FinancialAccount, split by availability state. Each balance is
   * represented as a hash where the key is the three-letter ISO currency code, in lowercase, and
   * the value is the amount for that currency.
   */
  @SerializedName("balance")
  Balance balance;

  /**
   * Open Enum. Two-letter country code that represents the country where the LegalEntity associated
   * with the FinancialAccount is based in.
   */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /**
   * If this is a {@code credit} FinancialAccount, this hash includes details specific to {@code
   * credit} FinancialAccounts.
   */
  @SerializedName("credit")
  Credit credit;

  /**
   * A descriptive name for the FinancialAccount, up to 50 characters long. This name will be used
   * in the Stripe Dashboard and embedded components.
   */
  @SerializedName("display_name")
  String displayName;

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

  /** Metadata associated with the FinancialAccount. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If this is a {@code multiprocessor_settlement} FinancialAccount, this hash includes details
   * specific to {@code multiprocessor_settlement} FinancialAccounts.
   */
  @SerializedName("multiprocessor_settlement")
  MultiprocessorSettlement multiprocessorSettlement;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * If this is a {@code other} FinancialAccount, this hash indicates what the actual type is.
   * Upgrade your API version to see it reflected in {@code type}.
   */
  @SerializedName("other")
  Other other;

  /**
   * If this is a {@code payments} FinancialAccount, this hash include details specific to {@code
   * payments} FinancialAccount.
   */
  @SerializedName("payments")
  Payments payments;

  /**
   * If this is a {@code savings} FinancialAccount, this hash includes details specific to {@code
   * savings} FinancialAccounts.
   */
  @SerializedName("savings")
  Savings savings;

  /**
   * Closed Enum. An enum representing the status of the FinancialAccount. This indicates whether or
   * not the FinancialAccount can be used for any money movement flows.
   *
   * <p>One of {@code closed}, {@code open}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /** Additional details related to the status of the FinancialAccount. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * If this is a {@code storage} FinancialAccount, this hash includes details specific to {@code
   * storage} FinancialAccounts.
   */
  @SerializedName("storage")
  Storage storage;

  /**
   * Type of the FinancialAccount. An additional hash is included on the FinancialAccount with a
   * name matching this value. It contains additional information specific to the FinancialAccount
   * type.
   *
   * <p>One of {@code accrued_fees}, {@code credit}, {@code multiprocessor_settlement}, {@code
   * other}, {@code payments}, {@code savings}, or {@code storage}.
   */
  @SerializedName("type")
  String type;

  /**
   * If this is a {@code accrued_fees} FinancialAccount, this hash include details specific to
   * {@code accrued_fees} FinancialAccount.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccruedFees extends StripeObject {
    /** The currencies enabled for fee accrual on this FinancialAccount. */
    @SerializedName("currencies")
    List<String> currencies;

    /**
     * Direction of fee accrual for this FinancialAccount.
     *
     * <p>One of {@code payable}, or {@code receivable}.
     */
    @SerializedName("direction")
    String direction;
  }

  /**
   * Multi-currency balance of this FinancialAccount, split by availability state. Each balance is
   * represented as a hash where the key is the three-letter ISO currency code, in lowercase, and
   * the value is the amount for that currency.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    /** Balance that can be used for money movement. */
    @SerializedName("available")
    Map<String, Amount> available;

    /** Balance of inbound funds that will later transition to the {@code available} balance. */
    @SerializedName("inbound_pending")
    Map<String, Amount> inboundPending;

    /** Balance of funds that are being used for a pending outbound money movement. */
    @SerializedName("outbound_pending")
    Map<String, Amount> outboundPending;
  }

  /**
   * If this is a {@code credit} FinancialAccount, this hash includes details specific to {@code
   * credit} FinancialAccounts.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Credit extends StripeObject {
    /** Details about how this credit FinancialAccount is funded. */
    @SerializedName("funded_by")
    FundedBy fundedBy;

    /** The currencies supported by this credit FinancialAccount. */
    @SerializedName("supported_currencies")
    List<String> supportedCurrencies;

    /** Details about how this credit FinancialAccount is funded. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FundedBy extends StripeObject {
      /** Details for platform-funded credit FinancialAccounts. */
      @SerializedName("platform")
      Platform platform;

      /**
       * The type of funding source for this credit FinancialAccount.
       *
       * <p>One of {@code platform}, or {@code stripe}.
       */
      @SerializedName("type")
      String type;

      /** Details for platform-funded credit FinancialAccounts. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Platform extends StripeObject {
        /** The platform FinancialAccount used to fund this credit FinancialAccount. */
        @SerializedName("financial_account")
        String financialAccount;
      }
    }
  }

  /**
   * If this is a {@code multiprocessor_settlement} FinancialAccount, this hash includes details
   * specific to {@code multiprocessor_settlement} FinancialAccounts.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MultiprocessorSettlement extends StripeObject {
    /** Settlement currencies enabled for this FinancialAccount. */
    @SerializedName("settlement_currencies")
    List<String> settlementCurrencies;
  }

  /**
   * If this is a {@code other} FinancialAccount, this hash indicates what the actual type is.
   * Upgrade your API version to see it reflected in {@code type}.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Other extends StripeObject {
    /**
     * The type of the FinancialAccount, represented as a string. Upgrade your API version to see
     * the type reflected in {@code financial_account.type}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * If this is a {@code payments} FinancialAccount, this hash include details specific to {@code
   * payments} FinancialAccount.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Payments extends StripeObject {
    /**
     * The balance of the {@code payments} FinancialAccount is a mix of payment processing and
     * stored value funds, and this field describes the breakdown between the two. The sum will
     * match the balance of the FinancialAccount.
     */
    @SerializedName("balance_by_funds_type")
    BalanceByFundsType balanceByFundsType;

    /** The currency that non-settlement currency payments will be converted to. */
    @SerializedName("default_currency")
    String defaultCurrency;

    /**
     * Settlement currencies enabled for this FinancialAccount. Payments in other currencies will be
     * automatically converted to {@code default_currency}.
     */
    @SerializedName("settlement_currencies")
    List<String> settlementCurrencies;

    /** Describes the available balance when it was projected. */
    @SerializedName("starting_balance")
    StartingBalance startingBalance;

    /**
     * The balance of the {@code payments} FinancialAccount is a mix of payment processing and
     * stored value funds, and this field describes the breakdown between the two. The sum will
     * match the balance of the FinancialAccount.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BalanceByFundsType extends StripeObject {
      /**
       * Payment processing funds are those that are received for goods or services and may only be
       * used for payouts to self. These funds may be converted to stored value funds.
       */
      @SerializedName("payment_processing")
      PaymentProcessing paymentProcessing;

      /** Stored value funds may be used for either payouts to self or payments to others. */
      @SerializedName("stored_value")
      StoredValue storedValue;

      /**
       * Payment processing funds are those that are received for goods or services and may only be
       * used for payouts to self. These funds may be converted to stored value funds.
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentProcessing extends StripeObject {
        /** Balance that can be used for money movement. */
        @SerializedName("available")
        Map<String, Amount> available;

        /** Balance of inbound funds that will later transition to the {@code available} balance. */
        @SerializedName("inbound_pending")
        Map<String, Amount> inboundPending;

        /** Balance of funds that are being used for a pending outbound money movement. */
        @SerializedName("outbound_pending")
        Map<String, Amount> outboundPending;
      }

      /** Stored value funds may be used for either payouts to self or payments to others. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StoredValue extends StripeObject {
        /** Balance that can be used for money movement. */
        @SerializedName("available")
        Map<String, Amount> available;

        /** Balance of inbound funds that will later transition to the {@code available} balance. */
        @SerializedName("inbound_pending")
        Map<String, Amount> inboundPending;

        /** Balance of funds that are being used for a pending outbound money movement. */
        @SerializedName("outbound_pending")
        Map<String, Amount> outboundPending;
      }
    }

    /** Describes the available balance when it was projected. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StartingBalance extends StripeObject {
      /** When the balance was projected. */
      @SerializedName("at")
      Instant at;

      /** The available balance at the time when the balance was projected. */
      @SerializedName("available")
      Map<String, Amount> available;
    }
  }

  /**
   * If this is a {@code savings} FinancialAccount, this hash includes details specific to {@code
   * savings} FinancialAccounts.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Savings extends StripeObject {
    /** The currencies that this savings FinancialAccount can hold. */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;

    /** Interest details for this savings FinancialAccount. Populated by the server. */
    @SerializedName("interest")
    Interest interest;

    /** Interest details for this savings FinancialAccount. Populated by the server. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Interest extends StripeObject {
      /** The interest rate applied to this savings FinancialAccount. */
      @SerializedName("rate")
      Rate rate;

      /** The interest rate applied to this savings FinancialAccount. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Rate extends StripeObject {
        /** Current variable rate, e.g. &quot;3.00&quot;. */
        @SerializedName("percentage")
        BigDecimal percentage;

        /**
         * The period over which interest accrues.
         *
         * <p>Equal to {@code annual}.
         */
        @SerializedName("period")
        String period;
      }
    }
  }

  /** Additional details related to the status of the FinancialAccount. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details related to the closed state of the FinancialAccount. */
    @SerializedName("closed")
    Closed closed;

    /** Details related to the closed state of the FinancialAccount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Closed extends StripeObject {
      /** The forwarding settings for the closed FinancialAccount. */
      @SerializedName("forwarding_settings")
      ForwardingSettings forwardingSettings;

      /**
       * The reason the FinancialAccount was closed.
       *
       * <p>One of {@code account_closed}, {@code closed_by_platform}, or {@code other}.
       */
      @SerializedName("reason")
      String reason;

      /** The forwarding settings for the closed FinancialAccount. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ForwardingSettings extends StripeObject {
        /** The address to send forwarded payments to. */
        @SerializedName("payment_method")
        String paymentMethod;

        /** The address to send forwarded payouts to. */
        @SerializedName("payout_method")
        String payoutMethod;
      }
    }
  }

  /**
   * If this is a {@code storage} FinancialAccount, this hash includes details specific to {@code
   * storage} FinancialAccounts.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Storage extends StripeObject {
    /**
     * The usage type for funds in this FinancialAccount. Can be used to specify that the funds are
     * for Consumer activity.
     */
    @SerializedName("funds_usage_type")
    String fundsUsageType;

    /** The currencies that this FinancialAccount can hold. */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;
  }
}
