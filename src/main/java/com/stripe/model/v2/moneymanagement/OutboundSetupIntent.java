// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

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
public class OutboundSetupIntent extends StripeObject implements HasId {
  /** Created timestamp. */
  @SerializedName("created")
  Instant created;

  /** ID of the outbound setup intent. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Specifies which actions needs to be taken next to continue setup of the credential. */
  @SerializedName("next_action")
  NextAction nextAction;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.outbound_setup_intent}.
   */
  @SerializedName("object")
  String object;

  /**
   * Information about the payout method that’s created and linked to this outbound setup intent.
   */
  @SerializedName("payout_method")
  PayoutMethod payoutMethod;

  /**
   * Closed Enum. Status of the outbound setup intent.
   *
   * <p>One of {@code canceled}, {@code requires_action}, {@code requires_payout_method}, or {@code
   * succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * The intended money movement flow this payout method should be set up for, specified in params.
   *
   * <p>One of {@code payment}, or {@code transfer}.
   */
  @SerializedName("usage_intent")
  String usageIntent;

  /**
   * For more details about NextAction, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    /** Confirmation of Payee details. */
    @SerializedName("confirmation_of_payee")
    ConfirmationOfPayee confirmationOfPayee;

    /**
     * The type of next action.
     *
     * <p>Equal to {@code confirmation_of_payee}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about ConfirmationOfPayee, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ConfirmationOfPayee extends StripeObject {
      /** The type of the credential. */
      @SerializedName("object")
      String object;

      /**
       * The Confirmation of Payee status.
       *
       * <p>One of {@code awaiting_acknowledgement}, {@code confirmed}, or {@code uninitiated}.
       */
      @SerializedName("status")
      String status;
    }
  }
}
