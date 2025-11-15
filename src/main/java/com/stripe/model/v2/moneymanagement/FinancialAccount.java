// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
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
   * <p>One of {@code other}, or {@code storage}.
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
    Map<String, Amount> available;

    /** Balance of inbound funds that will later transition to the {@code available} balance. */
    @SerializedName("inbound_pending")
    Map<String, Amount> inboundPending;

    /** Balance of funds that are being used for a pending outbound money movement. */
    @SerializedName("outbound_pending")
    Map<String, Amount> outboundPending;
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
