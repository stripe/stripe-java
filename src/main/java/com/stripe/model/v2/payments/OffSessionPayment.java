// File generated from our OpenAPI spec
package com.stripe.model.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPayment extends StripeObject implements HasId {
  /** The amount you requested to be collected on the OSP upon creation. */
  @SerializedName("amount_requested")
  Amount amountRequested;

  /**
   * The frequency of the underlying payment that this OSP represents.
   *
   * <p>One of {@code recurring}, or {@code unscheduled}.
   */
  @SerializedName("cadence")
  String cadence;

  /** ID of owning compartment. */
  @SerializedName("compartment_id")
  String compartmentId;

  /** Timestamp of creation. */
  @SerializedName("created")
  Instant created;

  /** Customer owning the supplied payment method. */
  @SerializedName("customer")
  String customer;

  /**
   * Reason why the OSP failed.
   *
   * <p>One of {@code rejected_by_partner}, or {@code retries_exhausted}.
   */
  @SerializedName("failure_reason")
  String failureReason;

  /** ID of the OSP. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Last error returned by the financial partner for a failed authorization. */
  @SerializedName("last_authorization_attempt_error")
  String lastAuthorizationAttemptError;

  /** Payment attempt record for the latest attempt, if one exists. */
  @SerializedName("latest_payment_attempt_record")
  String latestPaymentAttemptRecord;

  /** True if the txn is livemode, false otherwise. */
  @SerializedName("livemode")
  Boolean livemode;

  /** Metadata you provided. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.payments.off_session_payment}.
   */
  @SerializedName("object")
  String object;

  /** OBO, same as on the PI. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** ID of payment method. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment record associated with the OSP. consistent across attempts. */
  @SerializedName("payment_record")
  String paymentRecord;

  /** Details about the OSP retries. */
  @SerializedName("retry_details")
  RetryDetails retryDetails;

  /** Statement descriptor you provided. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /** Statement descriptor suffix you provided, similar to that on the PI. */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * Status of the OSP.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code pending}, {@code pending_retry}, {@code
   * processing}, {@code requires_capture}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Test clock to be used to advance the retry attempts. */
  @SerializedName("test_clock")
  String testClock;

  /** Instructions for the transfer to be made with this OSP after successful money movement. */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * For more details about RetryDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RetryDetails extends StripeObject {
    /** Number of authorization attempts so far. */
    @SerializedName("attempts")
    Integer attempts;

    /**
     * How you want Stripe to retry the payment.
     *
     * <p>One of {@code none}, or {@code smart}.
     */
    @SerializedName("retry_strategy")
    String retryStrategy;
  }

  /**
   * For more details about TransferData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /** Amount in minor units that you want to transfer. */
    @SerializedName("amount")
    Integer amount;

    /** ID of the connected account where you want money to go. */
    @SerializedName("destination")
    String destination;
  }
}
