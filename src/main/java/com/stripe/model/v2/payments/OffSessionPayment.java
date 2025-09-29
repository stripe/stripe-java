// File generated from our OpenAPI spec
package com.stripe.model.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** OffSessionPayment resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPayment extends StripeObject implements HasId {
  /** The amount available to be captured. */
  @SerializedName("amount_capturable")
  Amount amountCapturable;

  /** Provides industry-specific information about the amount. */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** The “presentment amount” to be collected from the customer. */
  @SerializedName("amount_requested")
  Amount amountRequested;

  /**
   * The frequency of the underlying payment.
   *
   * <p>One of {@code recurring}, or {@code unscheduled}.
   */
  @SerializedName("cadence")
  String cadence;

  /** Details about the capture configuration for the OffSessionPayment. */
  @SerializedName("capture")
  Capture capture;

  /**
   * Whether the OffSessionPayment should be captured automatically or manually.
   *
   * <p>One of {@code automatic}, or {@code manual}.
   */
  @SerializedName("capture_method")
  String captureMethod;

  /** ID of the owning compartment. */
  @SerializedName("compartment_id")
  String compartmentId;

  /**
   * Creation time of the OffSessionPayment. Represented as a RFC 3339 date &amp; time UTC value in
   * millisecond precision, for example: 2022-09-18T13:22:18.123Z.
   */
  @SerializedName("created")
  Instant created;

  /** ID of the Customer to which this OffSessionPayment belongs. */
  @SerializedName("customer")
  String customer;

  /**
   * The reason why the OffSessionPayment failed.
   *
   * <p>One of {@code authorization_expired}, {@code rejected_by_partner}, or {@code
   * retries_exhausted}.
   */
  @SerializedName("failure_reason")
  String failureReason;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The payment error encountered in the previous attempt to authorize the payment. */
  @SerializedName("last_authorization_attempt_error")
  String lastAuthorizationAttemptError;

  /** Payment attempt record for the latest attempt, if one exists. */
  @SerializedName("latest_payment_attempt_record")
  String latestPaymentAttemptRecord;

  /**
   * Has the value true if the object exists in live mode or the value false if the object exists in
   * test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.corp.stripe.com/api/metadata">key-value pairs</a> that you can
   * attach to an object. This can be useful for storing additional information about the object in
   * a structured format. Learn more about <a
   * href="https://docs.corp.stripe.com/payments/payment-intents#storing-information-in-metadata">storing
   * information in metadata</a>.
   */
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

  /** The account (if any) for which the funds of the OffSessionPayment are intended. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** ID of the payment method used in this OffSessionPayment. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment record associated with the OffSessionPayment. */
  @SerializedName("payment_record")
  String paymentRecord;

  /** Details about the payments orchestration configuration. */
  @SerializedName("payments_orchestration")
  PaymentsOrchestration paymentsOrchestration;

  /** Details about the OffSessionPayment retries. */
  @SerializedName("retry_details")
  RetryDetails retryDetails;

  /**
   * Text that appears on the customer’s statement as the statement descriptor for a non-card
   * charge. This value overrides the account’s default statement descriptor. For information about
   * requirements, including the 22-character limit, see the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">Statement Descriptor
   * docs</a>.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account’s <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer’s
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * Status of this OffSessionPayment, one of {@code pending}, {@code pending_retry}, {@code
   * processing}, {@code failed}, {@code canceled}, {@code requires_capture}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /** Test clock that can be used to advance the retry attempts in a sandbox. */
  @SerializedName("test_clock")
  String testClock;

  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /** Provides industry-specific information about the amount. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** The amount the total transaction was discounted for. */
    @SerializedName("discount_amount")
    Long discountAmount;

    /**
     * A list of line items, each containing information about a product in the PaymentIntent. There
     * is a maximum of 100 line items.
     */
    @SerializedName("line_items")
    List<OffSessionPayment.AmountDetails.LineItem> lineItems;

    /** Contains information about the shipping portion of the amount. */
    @SerializedName("shipping")
    Shipping shipping;

    /** Contains information about the tax portion of the amount. */
    @SerializedName("tax")
    Tax tax;

    /**
     * For more details about LineItem, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem extends StripeObject {
      /** The amount an item was discounted for. Positive integer. */
      @SerializedName("discount_amount")
      Long discountAmount;

      /** Unique identifier of the product. At most 12 characters long. */
      @SerializedName("product_code")
      String productCode;

      /** Name of the product. At most 100 characters long. */
      @SerializedName("product_name")
      String productName;

      /** Number of items of the product. Positive integer. */
      @SerializedName("quantity")
      Long quantity;

      /** Contains information about the tax on the item. */
      @SerializedName("tax")
      Tax tax;

      /** Cost of the product. Non-negative integer. */
      @SerializedName("unit_cost")
      Long unitCost;

      /** Contains information about the tax on the item. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Tax extends StripeObject {
        /** Total portion of the amount that is for tax. */
        @SerializedName("total_tax_amount")
        Long totalTaxAmount;
      }
    }

    /** Contains information about the shipping portion of the amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Shipping extends StripeObject {
      /** Portion of the amount that is for shipping. */
      @SerializedName("amount")
      Long amount;

      /** The postal code that represents the shipping source. */
      @SerializedName("from_postal_code")
      String fromPostalCode;

      /** The postal code that represents the shipping destination. */
      @SerializedName("to_postal_code")
      String toPostalCode;
    }

    /** Contains information about the tax portion of the amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Tax extends StripeObject {
      /** Total portion of the amount that is for tax. */
      @SerializedName("total_tax_amount")
      Long totalTaxAmount;
    }
  }

  /** Details about the capture configuration for the OffSessionPayment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Capture extends StripeObject {
    /** The timestamp when this payment is no longer eligible to be captured. */
    @SerializedName("capture_before")
    Instant captureBefore;

    /**
     * The method to use to capture the payment.
     *
     * <p>One of {@code automatic}, or {@code manual}.
     */
    @SerializedName("capture_method")
    String captureMethod;
  }

  /** Details about the payments orchestration configuration. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentsOrchestration extends StripeObject {
    /**
     * True when you want to enable payments orchestration for this off-session payment. False
     * otherwise.
     */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /** Details about the OffSessionPayment retries. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RetryDetails extends StripeObject {
    /** Number of authorization attempts so far. */
    @SerializedName("attempts")
    Long attempts;

    /** The pre-configured retry policy to use for the payment. */
    @SerializedName("retry_policy")
    String retryPolicy;

    /**
     * Indicates the strategy for how you want Stripe to retry the payment.
     *
     * <p>One of {@code heuristic}, {@code none}, {@code scheduled}, or {@code smart}.
     */
    @SerializedName("retry_strategy")
    String retryStrategy;
  }

  /**
   * The data that automatically creates a Transfer after the payment finalizes. Learn more about
   * the use case for <a href="https://docs.corp.stripe.com/payments/connected-accounts">connected
   * accounts</a>.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount transferred to the destination account. This transfer will occur automatically
     * after the payment succeeds. If no amount is specified, by default the entire payment amount
     * is transferred to the destination account. The amount must be less than or equal to the <a
     * href="https://docs.corp.stripe.com/api/v2/off-session-payments/object?api-version=2025-05-28.preview#v2_off_session_payment_object-amount_requested">amount_requested</a>,
     * and must be a positive integer representing how much to transfer in the smallest currency
     * unit (e.g., 100 cents to charge $1.00).
     */
    @SerializedName("amount")
    Long amount;

    /**
     * The account (if any) that the payment is attributed to for tax reporting, and where funds
     * from the payment are transferred to after payment success.
     */
    @SerializedName("destination")
    String destination;
  }
}
