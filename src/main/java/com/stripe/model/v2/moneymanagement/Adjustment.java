// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Adjustments represent Stripe-initiated credits or debits to a user balance. They might be used to
 * amend balances due to technical or operational error.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Adjustment extends StripeObject implements HasId {
  /** If applicable, contains information about the original flow linked to this Adjustment. */
  @SerializedName("adjusted_flow")
  AdjustedFlow adjustedFlow;

  /** The amount of the Adjustment. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Time at which the object was created. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Description of the Adjustment and what it was used for. */
  @SerializedName("description")
  String description;

  /** The FinancialAccount that this adjustment is for. */
  @SerializedName("financial_account")
  String financialAccount;

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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.adjustment}.
   */
  @SerializedName("object")
  String object;

  /**
   * A link to the Stripe-hosted receipt that is provided when money movement is considered
   * regulated under Stripe’s money transmission licenses. The receipt link remains active for 60
   * days from the Adjustment creation date. After this period, the link will expire and the receipt
   * url value will be null.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /** If applicable, contains information about the original flow linked to this Adjustment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdjustedFlow extends StripeObject {
    /** If applicable, the ID of the Adjustment linked to this Adjustment. */
    @SerializedName("adjustment")
    String adjustment;

    /** If applicable, the ID of the InboundTransfer linked to this Adjustment. */
    @SerializedName("inbound_transfer")
    String inboundTransfer;

    /** If applicable, the ID of the OutboundPayment linked to this Adjustment. */
    @SerializedName("outbound_payment")
    String outboundPayment;

    /** If applicable, the ID of the OutboundTransfer linked to this Adjustment. */
    @SerializedName("outbound_transfer")
    String outboundTransfer;

    /** If applicable, the ID of the ReceivedCredit linked to this Adjustment. */
    @SerializedName("received_credit")
    String receivedCredit;

    /** If applicable, the ID of the ReceivedDebit linked to this Adjustment. */
    @SerializedName("received_debit")
    String receivedDebit;

    /**
     * Closed Enum. If applicable, the type of flow linked to this Adjustment. The field matching
     * this value will contain the ID of the flow.
     *
     * <p>One of {@code adjustment}, {@code balance_exchange}, {@code inbound_payment}, {@code
     * inbound_transfer}, {@code outbound_payment}, {@code outbound_transfer}, {@code
     * received_credit}, or {@code received_debit}.
     */
    @SerializedName("type")
    String type;
  }
}
