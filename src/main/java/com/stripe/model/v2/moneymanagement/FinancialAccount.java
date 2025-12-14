// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
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

  /**
   * If this is a managed FinancialAccount, {@code managed_by} indicates the product that created
   * and manages this FinancialAccount. For managed FinancialAccounts, creation of money management
   * resources can only be orchestrated by the managing product.
   */
  @SerializedName("managed_by")
  ManagedBy managedBy;

  /** Metadata associated with the FinancialAccount. */
  @SerializedName("metadata")
  Map<String, String> metadata;

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
   * Closed Enum. An enum representing the status of the FinancialAccount. This indicates whether or
   * not the FinancialAccount can be used for any money movement flows.
   *
   * <p>One of {@code closed}, {@code open}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

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
   * <p>One of {@code other}, {@code payments}, or {@code storage}.
   */
  @SerializedName("type")
  String type;

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
    Map<String, FinancialAccount.Balance.Available> available;

    /** Balance of inbound funds that will later transition to the {@code available} balance. */
    @SerializedName("inbound_pending")
    Map<String, FinancialAccount.Balance.InboundPending> inboundPending;

    /** Balance of funds that are being used for a pending outbound money movement. */
    @SerializedName("outbound_pending")
    Map<String, FinancialAccount.Balance.OutboundPending> outboundPending;

    /**
     * For more details about Available, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Available extends StripeObject {
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

    /**
     * For more details about InboundPending, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InboundPending extends StripeObject {
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

    /**
     * For more details about OutboundPending, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class OutboundPending extends StripeObject {
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

  /**
   * If this is a managed FinancialAccount, {@code managed_by} indicates the product that created
   * and manages this FinancialAccount. For managed FinancialAccounts, creation of money management
   * resources can only be orchestrated by the managing product.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ManagedBy extends StripeObject {
    /**
     * Enum describing the Stripe product that is managing this FinancialAccount.
     *
     * <p>Equal to {@code multiprocessor_settlement}.
     */
    @SerializedName("type")
    String type;
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
    /** The currency that non-settlement currency payments will be converted to. */
    @SerializedName("default_currency")
    String defaultCurrency;

    /**
     * Settlement currencies enabled for this FinancialAccount. Payments in other currencies will be
     * automatically converted to {@code default_currency}.
     */
    @SerializedName("settlement_currencies")
    List<String> settlementCurrencies;
  }

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("closed")
    Closed closed;

    /**
     * For more details about Closed, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Closed extends StripeObject {
      @SerializedName("forwarding_settings")
      ForwardingSettings forwardingSettings;

      @SerializedName("reason")
      String reason;

      /**
       * For more details about ForwardingSettings, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
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
    /** The currencies that this FinancialAccount can hold. */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;
  }
}
