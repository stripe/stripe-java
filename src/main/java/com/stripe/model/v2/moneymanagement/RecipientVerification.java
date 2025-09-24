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
  /** The OBP/OBT ID that consumed this verification, present if one is successfully created. */
  @SerializedName("consumed_by")
  String consumedBy;

  /**
   * Time at which the RecipientVerification was created. Represented as a RFC 3339 date &amp; time
   * UTC value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /**
   * Time at which the RecipientVerification expires, 5 minutes after the creation. Represented as a
   * RFC 3339 date &amp; time UTC value in millisecond precision, for example:
   * 2022-09-18T13:22:18.123Z.
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

  /**
   * Closed Enum. Current status of the RecipientVerification: {@code verified}, {@code consumed},
   * {@code expired}, {@code awaiting_acknowledgement}, {@code acknowledged}.
   *
   * <p>One of {@code acknowledged}, {@code awaiting_acknowledgement}, {@code consumed}, {@code
   * expired}, or {@code verified}.
   */
  @SerializedName("status")
  String status;

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** Details for the match result. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MatchResultDetails extends StripeObject {
    /**
     * The account name associated with the bank account as provided by the VoP provider, only
     * present if there is a match or close match.
     */
    @SerializedName("matched_name")
    String matchedName;

    /** A message describing the match result. */
    @SerializedName("message")
    String message;

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
