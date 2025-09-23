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
 * OutboundPaymentQuote represents a quote that provides fee and amount estimates for
 * OutboundPayment.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OutboundPaymentQuote extends StripeObject implements HasId {
  /** The &quot;presentment amount&quot; for the OutboundPaymentQuote. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Time at which the OutboundPaymentQuote was created. Represented as a RFC 3339 date &amp; time
   * UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Delivery options to be used to send the OutboundPayment. */
  @SerializedName("delivery_options")
  DeliveryOptions deliveryOptions;

  /** The estimated fees for the OutboundPaymentQuote. */
  @SerializedName("estimated_fees")
  List<OutboundPaymentQuote.EstimatedFee> estimatedFees;

  /** Details about the sender of an OutboundPaymentQuote. */
  @SerializedName("from")
  From from;

  /** The underlying FXQuote details for the OutboundPaymentQuote. */
  @SerializedName("fx_quote")
  FxQuote fxQuote;

  /** Unique identifier for the OutboundPaymentQuote. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.outbound_payment_quote}.
   */
  @SerializedName("object")
  String object;

  /** Details about the recipient of an OutboundPaymentQuote. */
  @SerializedName("to")
  To to;

  /** Delivery options to be used to send the OutboundPayment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryOptions extends StripeObject {
    /**
     * Open Enum. Method for bank account.
     *
     * <p>One of {@code automatic}, {@code local}, or {@code wire}.
     */
    @SerializedName("bank_account")
    String bankAccount;
  }

  /**
   * For more details about EstimatedFee, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EstimatedFee extends StripeObject {
    /** The fee amount for corresponding fee type. */
    @SerializedName("amount")
    Amount amount;

    /**
     * The fee type.
     *
     * <p>One of {@code cross_border_payout_fee}, {@code foreign_exchange_fee}, {@code
     * instant_payout_fee}, {@code standard_payout_fee}, or {@code wire_payout_fee}.
     */
    @SerializedName("type")
    String type;
  }

  /** Details about the sender of an OutboundPaymentQuote. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The monetary amount debited from the sender, only set on responses. */
    @SerializedName("debited")
    Amount debited;

    /** The FinancialAccount that funds were pulled from. */
    @SerializedName("financial_account")
    String financialAccount;
  }

  /** The underlying FXQuote details for the OutboundPaymentQuote. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FxQuote extends StripeObject {
    /**
     * The duration the exchange rate lock remains valid from creation time. Allowed value is
     * five_minutes.
     *
     * <p>Equal to {@code five_minutes}.
     */
    @SerializedName("lock_duration")
    String lockDuration;

    /** Time at which the rate lock will expire, measured in seconds since the Unix epoch. */
    @SerializedName("lock_expires_at")
    Instant lockExpiresAt;

    /**
     * Lock status of the quote. Transitions from active to expired once past the lock_expires_at
     * timestamp. Value can be active or expired.
     *
     * <p>One of {@code active}, or {@code expired}.
     */
    @SerializedName("lock_status")
    String lockStatus;

    /** Key pair: from currency Value: exchange rate going from_currency -&gt; to_currency. */
    @SerializedName("rates")
    Map<String, OutboundPaymentQuote.FxQuote.Rate> rates;

    /** The currency that the transaction is exchanging to. */
    @SerializedName("to_currency")
    String toCurrency;

    /**
     * For more details about Rate, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rate extends StripeObject {
      /** The exchange rate going from_currency -&gt; to_currency. */
      @SerializedName("exchange_rate")
      String exchangeRate;
    }
  }

  /** Details about the recipient of an OutboundPaymentQuote. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The monetary amount being credited to the destination. */
    @SerializedName("credited")
    Amount credited;

    /** The payout method which the OutboundPayment uses to send payout. */
    @SerializedName("payout_method")
    String payoutMethod;

    /** To which account the OutboundPayment is sent. */
    @SerializedName("recipient")
    String recipient;
  }
}
