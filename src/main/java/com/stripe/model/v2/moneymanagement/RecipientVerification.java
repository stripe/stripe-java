// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** RecipientVerification represents a verification of recipient you intend to send funds to. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RecipientVerification extends StripeObject implements HasId {
  /** The resource that consumed this verification. */
  @SerializedName("consumed_by")
  ConsumedBy consumedBy;

  /**
   * Time at which the RecipientVerification was created. Represented as a RFC 3339 date &amp; time
   * UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * Time at which the RecipientVerification expires, 5 minutes after the creation. Only applicable
   * for Verification of Payee (VoP) verifications. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** The ID of the RecipientVerification. */
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
   * Closed Enum. Match level of the RecipientVerification: {@code match}, {@code close_match},
   * {@code no_match}, {@code unavailable}.
   *
   * <p>One of {@code close_match}, {@code match}, {@code no_match}, or {@code unavailable}.
   */
  @SerializedName("match_result")
  String matchResult;

  /** Details for the match result. */
  @SerializedName("match_result_details")
  MatchResultDetails matchResultDetails;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.recipient_verification}.
   */
  @SerializedName("object")
  String object;

  /** ID of the payout method that was verified. */
  @SerializedName("payout_method")
  String payoutMethod;

  /** ID of the recipient account. Omitted for same-entity payouts. */
  @SerializedName("recipient")
  String recipient;

  /**
   * Current status of the recipient verification.
   *
   * <p>One of {@code acknowledged}, {@code awaiting_acknowledgement}, {@code consumed}, {@code
   * expired}, or {@code verified}.
   */
  @SerializedName("status")
  String status;

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * Open Enum. The type of verification performed: {@code verification_of_payee}, {@code
   * confirmation_of_payee}.
   *
   * <p>One of {@code confirmation_of_payee}, or {@code verification_of_payee}.
   */
  @SerializedName("verification_type")
  String verificationType;

  /** The resource that consumed this verification. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ConsumedBy extends StripeObject {
    /** The ID of the OutboundPayment that consumed the RecipientVerification. */
    @SerializedName("outbound_payment")
    String outboundPayment;

    /**
     * The type of resource that consumed the RecipientVerification.
     *
     * <p>Equal to {@code outbound_payment}.
     */
    @SerializedName("type")
    String type;
  }

  /** Details for the match result. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MatchResultDetails extends StripeObject {
    /**
     * The business type matched by the provider. Only present for Confirmation of Payee (CoP)
     * verifications.
     *
     * <p>One of {@code business}, or {@code personal}.
     */
    @SerializedName("matched_business_type")
    String matchedBusinessType;

    /**
     * The account name associated with the bank account as provided by the VoP provider, only
     * present if there is a match or close match.
     */
    @SerializedName("matched_name")
    String matchedName;

    /** A message describing the match result. */
    @SerializedName("message")
    String message;

    /**
     * The business type provided by the user. Only present for Confirmation of Payee (CoP)
     * verifications.
     *
     * <p>One of {@code business}, or {@code personal}.
     */
    @SerializedName("provided_business_type")
    String providedBusinessType;

    /** The name associated with the provided recipient. */
    @SerializedName("provided_name")
    String providedName;
  }

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when a RecipientVerification changed status to {@code acknowledged}.
     * Represented as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("acknowledged_at")
    Instant acknowledgedAt;

    /**
     * Timestamp describing when a RecipientVerification changed status to {@code consumed}.
     * Represented as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("consumed_at")
    Instant consumedAt;
  }
}
