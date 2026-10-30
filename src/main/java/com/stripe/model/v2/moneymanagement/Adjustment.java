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
 * An Adjustment records a credit or debit that Stripe makes to your Financial Account balance, for
 * example to correct technical or operational errors.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Adjustment extends StripeObject implements HasId {
  /**
   * Details about the original flow object linked to this Adjustment, if applicable. {@code
   * adjusted_flow.type} identifies the kind of object. The corresponding field contains its ID: for
   * an InboundTransfer, {@code adjusted_flow.inbound_transfer} contains the InboundTransfer's ID.
   * Pass that ID to the {@code adjusted_flow} parameter on List Adjustments.
   */
  @SerializedName("adjusted_flow")
  AdjustedFlow adjustedFlow;

  /** The amount of the Adjustment. */
  @SerializedName("amount")
  Amount amount;

  /**
   * Time at which the object was created. Represented as an RFC 3339 timestamp in UTC with
   * millisecond precision, for example {@code 2022-09-18T13:22:18.123Z}.
   */
  @SerializedName("created")
  Instant created;

  /** A description of the Adjustment and its purpose. */
  @SerializedName("description")
  String description;

  /** The ID of the FinancialAccount whose balance this Adjustment affects. */
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
   * A link to the Stripe-hosted receipt provided when money movement is regulated under Stripe's
   * money transmission licenses. You can use this link to view the receipt for 60 days after the
   * Adjustment is created. After that, the link expires and {@code receipt_url} is {@code null}.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /** A reference for the Adjustment that associates it with related records or operations. */
  @SerializedName("reference")
  String reference;

  /**
   * Details about the original flow object linked to this Adjustment, if applicable. {@code
   * adjusted_flow.type} identifies the kind of object. The corresponding field contains its ID: for
   * an InboundTransfer, {@code adjusted_flow.inbound_transfer} contains the InboundTransfer's ID.
   * Pass that ID to the {@code adjusted_flow} parameter on List Adjustments.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AdjustedFlow extends StripeObject {
    /** If applicable, the ID of the original Adjustment linked to this Adjustment. */
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
     * Open Enum. If applicable, the type of flow linked to this Adjustment. The field matching this
     * value will contain the ID of the flow.
     *
     * <p>One of {@code adjustment}, {@code inbound_transfer}, {@code outbound_payment}, {@code
     * outbound_transfer}, {@code received_credit}, or {@code received_debit}.
     */
    @SerializedName("type")
    String type;
  }
}
