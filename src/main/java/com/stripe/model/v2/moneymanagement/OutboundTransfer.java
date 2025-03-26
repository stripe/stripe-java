// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

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
public class OutboundTransfer extends StripeObject implements HasId {
  /** The &quot;presentment amount&quot; for the OutboundTransfer. */
  @SerializedName("amount")
  Amount amount;

  /** Returns true if the OutboundTransfer can be canceled, and false otherwise. */
  @SerializedName("cancelable")
  Boolean cancelable;

  /**
   * Time at which the OutboundTransfer was created. Represented as a RFC 3339 date &amp; time UTC
   * value in millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** Delivery options to be used to send the OutboundTransfer. */
  @SerializedName("delivery_options")
  DeliveryOptions deliveryOptions;

  /** An arbitrary string attached to the OutboundTransfer. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * The date when funds are expected to arrive in the payout method. This field is not set if the
   * payout method is in a {@code failed}, {@code canceled}, or {@code returned} state. Represented
   * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
   * 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("expected_arrival_date")
  Instant expectedArrivalDate;

  /** The FinancialAccount that funds were pulled from. */
  @SerializedName("from")
  From from;

  /** Unique identifier for the OutboundTransfer. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.outbound_transfer}.
   */
  @SerializedName("object")
  String object;

  /**
   * A hosted transaction receipt URL that is provided when money movement is considered regulated
   * under Stripe's money transmission licenses.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /**
   * The description that appears on the receiving end for an OutboundTransfer (for example, bank
   * statement for external bank transfer).
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Closed Enum. Current status of the OutboundTransfer: {@code processing}, {@code failed}, {@code
   * posted}, {@code returned}, {@code canceled}. An OutboundTransfer is {@code processing} if it
   * has been created and is processing. The status changes to {@code posted} once the
   * OutboundTransfer has been &quot;confirmed&quot; and funds have left the account, or to {@code
   * failed} or {@code canceled}. If an OutboundTransfer fails to arrive at its payout method, its
   * status will change to {@code returned}.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code posted}, {@code processing}, or {@code
   * returned}.
   */
  @SerializedName("status")
  String status;

  /** Status details for an OutboundTransfer in a {@code failed} or {@code returned} state. */
  @SerializedName("status_details")
  StatusDetails statusDetails;

  /** Hash containing timestamps of when the object transitioned to a particular status. */
  @SerializedName("status_transitions")
  StatusTransitions statusTransitions;

  /** To which payout method the OutboundTransfer was sent. */
  @SerializedName("to")
  To to;

  /**
   * A unique identifier that can be used to track this OutboundTransfer with recipient bank. Banks
   * might call this a “reference number” or something similar.
   */
  @SerializedName("trace_id")
  TraceId traceId;

  /**
   * For more details about DeliveryOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class DeliveryOptions extends StripeObject {
    /**
     * Open Enum. Method for bank account.
     *
     * <p>One of {@code automatic}, {@code local}, or {@code wire}.
     */
    @SerializedName("bank_account")
    String bankAccount;
  }

  /**
   * For more details about From, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class From extends StripeObject {
    /** The monetary amount debited from the sender, only set on responses. */
    @SerializedName("debited")
    Amount debited;

    /** The FinancialAccount that funds were pulled from. */
    @SerializedName("financial_account")
    String financialAccount;
  }

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** The {@code failed} status reason. */
    @SerializedName("failed")
    Failed failed;

    /** The {@code returned} status reason. */
    @SerializedName("returned")
    Returned returned;

    /**
     * For more details about Failed, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Failed extends StripeObject {
      /**
       * Open Enum. The {@code failed} status reason.
       *
       * <p>One of {@code payout_method_declined}, {@code payout_method_does_not_exist}, {@code
       * payout_method_expired}, {@code payout_method_unsupported}, {@code
       * payout_method_usage_frequency_limit_exceeded}, or {@code unknown_failure}.
       */
      @SerializedName("reason")
      String reason;
    }

    /**
     * For more details about Returned, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Returned extends StripeObject {
      /**
       * Open Enum. The {@code returned} status reason.
       *
       * <p>One of {@code payout_method_canceled_by_customer}, {@code payout_method_closed}, {@code
       * payout_method_currency_unsupported}, {@code payout_method_does_not_exist}, {@code
       * payout_method_holder_address_incorrect}, {@code payout_method_holder_details_incorrect},
       * {@code payout_method_holder_name_incorrect}, {@code payout_method_invalid_account_number},
       * {@code payout_method_restricted}, {@code recalled}, or {@code unknown_failure}.
       */
      @SerializedName("reason")
      String reason;
    }
  }

  /**
   * For more details about StatusTransitions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusTransitions extends StripeObject {
    /**
     * Timestamp describing when an OutboundTransfer changed status to {@code canceled}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("canceled_at")
    Instant canceledAt;

    /**
     * Timestamp describing when an OutboundTransfer changed status to {@code failed}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("failed_at")
    Instant failedAt;

    /**
     * Timestamp describing when an OutboundTransfer changed status to {@code posted}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("posted_at")
    Instant postedAt;

    /**
     * Timestamp describing when an OutboundTransfer changed status to {@code returned}. Represented
     * as a RFC 3339 date &amp; time UTC value in millisecond precision, for example:
     * 2022-09-18T13:22:18.123Z.
     */
    @SerializedName("returned_at")
    Instant returnedAt;
  }

  /**
   * For more details about To, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class To extends StripeObject {
    /** The monetary amount being credited to the destination. */
    @SerializedName("credited")
    Amount credited;

    /** The payout method which the OutboundTransfer uses to send payout. */
    @SerializedName("payout_method")
    String payoutMethod;
  }

  /**
   * For more details about TraceId, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TraceId extends StripeObject {
    /**
     * Possible values are {@code pending}, {@code supported}, and {@code unsupported}. Initially
     * set to {@code pending}, it changes to {@code supported} when the recipient bank provides a
     * trace ID, or {@code unsupported} if the recipient bank doesn't support it. Note that this
     * status may not align with the OutboundPayment or OutboundTransfer status and can remain
     * {@code pending} even after the payment or transfer is posted.
     *
     * <p>One of {@code pending}, {@code supported}, or {@code unsupported}.
     */
    @SerializedName("status")
    String status;

    /** The trace ID value if {@code trace_id.status} is {@code supported}, otherwise empty. */
    @SerializedName("value")
    String value;
  }
}
