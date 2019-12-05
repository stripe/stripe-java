package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceMandateNotification extends StripeObject implements HasId {
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is `debit_initiated`.
   */
  @SerializedName("amount")
  Long amount;

  @SerializedName("bacs_debit")
  BacsDebitData bacsDebit;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `source_mandate_notification`.
   */
  @SerializedName("object")
  String object;

  /**
   * The reason of the mandate notification. Valid reasons are `mandate_confirmed` or
   * `debit_initiated`.
   */
  @SerializedName("reason")
  String reason;

  @SerializedName("sepa_debit")
  SepaDebitData sepaDebit;

  @SerializedName("source")
  Source source;

  /** The status of the mandate notification. Valid statuses are `pending` or `submitted`. */
  @SerializedName("status")
  String status;

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as `three_d_secure`.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BacsDebitData extends StripeObject {
    /** Last 4 digits of the account number associated with the debit. */
    @SerializedName("last4")
    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebitData extends StripeObject {
    /** SEPA creditor ID. */
    @SerializedName("creditor_identifier")
    String creditorIdentifier;

    /** Last 4 digits of the account number associated with the debit. */
    @SerializedName("last4")
    String last4;

    /** Mandate reference associated with the debit. */
    @SerializedName("mandate_reference")
    String mandateReference;
  }
}
