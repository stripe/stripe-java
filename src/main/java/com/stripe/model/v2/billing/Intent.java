// File generated from our OpenAPI spec
package com.stripe.model.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Intent extends StripeObject implements HasId {
  /** Breakdown of the amount for this Billing Intent. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** ID of an existing Cadence to use. */
  @SerializedName("cadence")
  String cadence;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

  /** Three-letter ISO currency code, in lowercase. Must be a supported currency. */
  @SerializedName("currency")
  String currency;

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
   * <p>Equal to {@code v2.billing.intent}.
   */
  @SerializedName("object")
  String object;

  /**
   * Current status of the Billing Intent.
   *
   * <p>One of {@code canceled}, {@code committed}, {@code draft}, or {@code reserved}.
   */
  @SerializedName("status")
  String status;

  /** Timestamps for status transitions of the Billing Intent. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * For more details about AmountDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** Three-letter ISO currency code, in lowercase. Must be a supported currency. */
    @SerializedName("currency")
    String currency;

    /** Amount of discount applied. */
    @SerializedName("discount")
    String discount;

    /** Amount of shipping charges. */
    @SerializedName("shipping")
    String shipping;

    /** Subtotal amount before tax and discounts. */
    @SerializedName("subtotal")
    String subtotal;

    /** Amount of tax. */
    @SerializedName("tax")
    String tax;

    /** Total amount for the Billing Intent. */
    @SerializedName("total")
    String total;
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** Time at which the Billing Intent was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** Time at which the Billing Intent was committed. */
    @SerializedName("committed_at")
    Instant committedAt;

    /** Time at which the Billing Intent was drafted. */
    @SerializedName("drafted_at")
    Instant draftedAt;

    /** Time at which the Billing Intent was reserved. */
    @SerializedName("reserved_at")
    Instant reservedAt;
  }
}
