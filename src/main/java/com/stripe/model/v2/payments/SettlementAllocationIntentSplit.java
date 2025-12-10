// File generated from our OpenAPI spec
package com.stripe.model.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** SettlementAllocationIntentSplit resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SettlementAllocationIntentSplit extends StripeObject implements HasId {
  /** The ID of the account that will be used for the debit/credit. */
  @SerializedName("account")
  String account;

  /** The amount and currency of the SettlementAllocationIntentSplit. */
  @SerializedName("amount")
  Amount amount;

  /** Timestamp at which SettlementAllocationIntentSplit was created. */
  @SerializedName("created")
  Instant created;

  /** Details about the Flow object that settled the split. */
  @SerializedName("flow")
  Flow flow;

  /** Unique identifier for the SettlementAllocationIntentSplit. */
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
   * <p>Equal to {@code v2.payments.settlement_allocation_intent_split}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the SettlementAllocationIntent that this split belongs too. */
  @SerializedName("settlement_allocation_intent")
  String settlementAllocationIntent;

  /**
   * The status of the SettlementAllocationIntentSplit.
   *
   * <p>One of {@code canceled}, {@code pending}, or {@code settled}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of the SettlementAllocationIntentSplit.
   *
   * <p>One of {@code credit}, or {@code debit}.
   */
  @SerializedName("type")
  String type;

  /** The amount and currency of the SettlementAllocationIntentSplit. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Amount extends StripeObject {
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

  /** Details about the Flow object that settled the split. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Flow extends StripeObject {
    /** If applicable, the ID of the OutboundPayment that created this Transaction. */
    @SerializedName("outbound_payment")
    String outboundPayment;

    /** If applicable, the ID of the OutboundTransfer that created this Transaction. */
    @SerializedName("outbound_transfer")
    String outboundTransfer;

    /** If applicable, the ID of the ReceivedCredit that created this Transaction. */
    @SerializedName("received_credit")
    String receivedCredit;

    /**
     * Type of the flow linked to the transaction which settled the split. The field matching this
     * value will contain the ID of the flow.
     *
     * <p>One of {@code outbound_payment}, {@code outbound_transfer}, or {@code received_credit}.
     */
    @SerializedName("type")
    String type;
  }
}
