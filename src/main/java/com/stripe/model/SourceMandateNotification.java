// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceMandateNotification extends StripeObject implements HasId {
  @SerializedName("acss_debit")
  AcssDebitData acssDebit;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount associated with the mandate
   * notification. The amount is expressed in the currency of the underlying source. Required if the
   * notification type is {@code debit_initiated}.
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
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code source_mandate_notification}.
   */
  @SerializedName("object")
  String object;

  /**
   * The reason of the mandate notification. Valid reasons are {@code mandate_confirmed} or {@code
   * debit_initiated}.
   */
  @SerializedName("reason")
  String reason;

  @SerializedName("sepa_debit")
  SepaDebitData sepaDebit;

  /**
   * {@code Source} objects allow you to accept a variety of payment methods. They represent a
   * customer's payment instrument, and can be used with the Stripe API just like a {@code Card}
   * object: once chargeable, they can be charged, or can be attached to customers.
   *
   * <p>Related guides: <a href="https://stripe.com/docs/sources">Sources API</a> and <a
   * href="https://stripe.com/docs/sources/customers">Sources &amp; Customers</a>.
   */
  @SerializedName("source")
  Source source;

  /**
   * The status of the mandate notification. Valid statuses are {@code pending} or {@code
   * submitted}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of source this mandate notification is attached to. Should be the source type
   * identifier code for the payment method, such as {@code three_d_secure}.
   */
  @SerializedName("type")
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcssDebitData extends StripeObject {
    /** The statement descriptor associate with the debit. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;
  }

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
