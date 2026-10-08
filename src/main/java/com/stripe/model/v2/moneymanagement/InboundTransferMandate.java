// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An InboundTransferMandate represents Stripe's authorization to debit a merchant's external bank
 * account (v2 credential) on their behalf.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InboundTransferMandate extends StripeObject implements HasId {
  /** Australian BECS-specific details. Present when type is AU_BECS. */
  @SerializedName("au_becs")
  AuBecs auBecs;

  /** Bacs-specific details. Present when type is BACS. */
  @SerializedName("bacs")
  Bacs bacs;

  /** Creation time of the mandate. RFC 3339 UTC, millisecond precision. */
  @SerializedName("created")
  Instant created;

  /** The v2 credential (e.g. GB Bank Account) this mandate authorizes debits for. */
  @SerializedName("credential")
  String credential;

  /** Unique identifier for the InboundTransferMandate. */
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
   * <p>Equal to {@code v2.money_management.inbound_transfer_mandate}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current lifecycle status of the mandate.
   *
   * <p>One of {@code active}, {@code canceled}, {@code expired}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /** Additional details about the current status (e.g. cancelation reason). */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Timestamps for each state transition. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /**
   * The mandate scheme type.
   *
   * <p>One of {@code au_becs}, {@code bacs}, {@code nz_becs}, or {@code sepa}.
   */
  @SerializedName("type")
  String type;

  /** Evidence of the merchant's acceptance of the mandate. */
  @SerializedName("user_accepted_details")
  UserAcceptedDetails userAcceptedDetails;

  /** Australian BECS-specific details. Present when type is AU_BECS. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecs extends StripeObject {
    /**
     * The generated AU BECS lodgement reference. It is 18 uppercase alphanumeric or underscore
     * characters and incorporates lodgement_reference_prefix when one was supplied at creation.
     */
    @SerializedName("lodgement_reference")
    String lodgementReference;
  }

  /** Bacs-specific details. Present when type is BACS. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Bacs extends StripeObject {
    /**
     * The generated Bacs mandate reference. May incorporate the optional reference_prefix supplied
     * at creation time.
     */
    @SerializedName("reference")
    String reference;
  }

  /** Additional details about the current status (e.g. cancelation reason). */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Present when the mandate is in the CANCELED state. */
    @SerializedName("canceled")
    Canceled canceled;

    /** Present when the mandate is in the CANCELED state. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Canceled extends StripeObject {
      /**
       * The reason the mandate was canceled.
       *
       * <p>One of {@code canceled_by_network}, {@code canceled_by_user}, {@code
       * refused_by_network}, or {@code revoked_by_stripe}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /** Timestamps for each state transition. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /** When the mandate became active. */
    @SerializedName("activated_at")
    Instant activatedAt;

    /** When the mandate was canceled. */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /** When the mandate expired. */
    @SerializedName("expired_at")
    Instant expiredAt;
  }

  /** Evidence of the merchant's acceptance of the mandate. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserAcceptedDetails extends StripeObject {
    /**
     * When the merchant accepted the mandate. Must be a past timestamp. For direct account
     * requests, defaults to the mandate's creation time when not supplied.
     */
    @SerializedName("accepted_at")
    Instant acceptedAt;

    /** Optional details for online acceptance. */
    @SerializedName("online")
    Online online;

    /**
     * Channel through which acceptance was obtained.
     *
     * <p>Equal to {@code online}.
     */
    @SerializedName("type")
    String type;

    /** Optional details for online acceptance. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Online extends StripeObject {
      /**
       * The IP address from which the merchant accepted the mandate. For direct account requests,
       * derived from the request when not supplied; rejected if obtainable from neither.
       */
      @SerializedName("ip_address")
      String ipAddress;

      /**
       * The user agent of the browser from which the merchant accepted the mandate. For direct
       * account requests, derived from the request when not supplied.
       */
      @SerializedName("user_agent")
      String userAgent;
    }
  }
}
