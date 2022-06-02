// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.RefundCancelParams;
import com.stripe.param.RefundCreateParams;
import com.stripe.param.RefundExpireParams;
import com.stripe.param.RefundListParams;
import com.stripe.param.RefundRetrieveParams;
import com.stripe.param.RefundUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Refund extends ApiResource implements MetadataStore<Refund>, BalanceTransactionSource {
  /** Amount, in %s. */
  @SerializedName("amount")
  Long amount;

  /** Balance transaction that describes the impact on your account balance. */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** ID of the charge that was refunded. */
  @SerializedName("charge")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Charge> charge;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * An arbitrary string attached to the object. Often useful for displaying to users. (Available on
   * non-card refunds only)
   */
  @SerializedName("description")
  String description;

  /**
   * If the refund failed, this balance transaction describes the adjustment made on your account
   * balance that reverses the initial balance transaction.
   */
  @SerializedName("failure_balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> failureBalanceTransaction;

  /**
   * If the refund failed, the reason for refund failure if known. Possible values are {@code
   * lost_or_stolen_card}, {@code expired_or_canceled_card}, or {@code unknown}.
   */
  @SerializedName("failure_reason")
  String failureReason;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Email to which refund instructions, if required, are sent to. */
  @SerializedName("instructions_email")
  String instructionsEmail;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  @SerializedName("next_action")
  NextAction nextAction;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code refund}.
   */
  @SerializedName("object")
  String object;

  /** ID of the PaymentIntent that was refunded. */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /**
   * Reason for the refund, either user-provided ({@code duplicate}, {@code fraudulent}, or {@code
   * requested_by_customer}) or generated by Stripe internally ({@code expired_uncaptured_charge}).
   *
   * <p>One of {@code duplicate}, {@code expired_uncaptured_charge}, {@code fraudulent}, or {@code
   * requested_by_customer}.
   */
  @SerializedName("reason")
  String reason;

  /** This is the transaction number that appears on email receipts sent for this refund. */
  @SerializedName("receipt_number")
  String receiptNumber;

  /**
   * The transfer reversal that is associated with the refund. Only present if the charge came from
   * another Stripe account. See the Connect documentation for details.
   */
  @SerializedName("source_transfer_reversal")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TransferReversal> sourceTransferReversal;

  /**
   * Status of the refund. For credit card refunds, this can be {@code pending}, {@code succeeded},
   * or {@code failed}. For other types of refunds, it can be {@code pending}, {@code
   * requires_action}, {@code succeeded}, {@code failed}, or {@code canceled}. Refer to our <a
   * href="https://stripe.com/docs/refunds#failed-refunds">refunds</a> documentation for more
   * details.
   */
  @SerializedName("status")
  String status;

  /**
   * If the accompanying transfer was reversed, the transfer reversal object. Only applicable if the
   * charge was created using the destination parameter.
   */
  @SerializedName("transfer_reversal")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<TransferReversal> transferReversal;

  /** Get ID of expandable {@code balanceTransaction} object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded {@code balanceTransaction}. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code charge} object. */
  public String getCharge() {
    return (this.charge != null) ? this.charge.getId() : null;
  }

  public void setCharge(String id) {
    this.charge = ApiResource.setExpandableFieldId(id, this.charge);
  }

  /** Get expanded {@code charge}. */
  public Charge getChargeObject() {
    return (this.charge != null) ? this.charge.getExpanded() : null;
  }

  public void setChargeObject(Charge expandableObject) {
    this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code failureBalanceTransaction} object. */
  public String getFailureBalanceTransaction() {
    return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
  }

  public void setFailureBalanceTransaction(String id) {
    this.failureBalanceTransaction =
        ApiResource.setExpandableFieldId(id, this.failureBalanceTransaction);
  }

  /** Get expanded {@code failureBalanceTransaction}. */
  public BalanceTransaction getFailureBalanceTransactionObject() {
    return (this.failureBalanceTransaction != null)
        ? this.failureBalanceTransaction.getExpanded()
        : null;
  }

  public void setFailureBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.failureBalanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentIntent} object. */
  public String getPaymentIntent() {
    return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
  }

  public void setPaymentIntent(String id) {
    this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
  }

  /** Get expanded {@code paymentIntent}. */
  public PaymentIntent getPaymentIntentObject() {
    return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
  }

  public void setPaymentIntentObject(PaymentIntent expandableObject) {
    this.paymentIntent =
        new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code sourceTransferReversal} object. */
  public String getSourceTransferReversal() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getId() : null;
  }

  public void setSourceTransferReversal(String id) {
    this.sourceTransferReversal = ApiResource.setExpandableFieldId(id, this.sourceTransferReversal);
  }

  /** Get expanded {@code sourceTransferReversal}. */
  public TransferReversal getSourceTransferReversalObject() {
    return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getExpanded() : null;
  }

  public void setSourceTransferReversalObject(TransferReversal expandableObject) {
    this.sourceTransferReversal =
        new ExpandableField<TransferReversal>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code transferReversal} object. */
  public String getTransferReversal() {
    return (this.transferReversal != null) ? this.transferReversal.getId() : null;
  }

  public void setTransferReversal(String id) {
    this.transferReversal = ApiResource.setExpandableFieldId(id, this.transferReversal);
  }

  /** Get expanded {@code transferReversal}. */
  public TransferReversal getTransferReversalObject() {
    return (this.transferReversal != null) ? this.transferReversal.getExpanded() : null;
  }

  public void setTransferReversalObject(TransferReversal expandableObject) {
    this.transferReversal =
        new ExpandableField<TransferReversal>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return ApiResource.requestCollection(url, params, RefundCollection.class, options);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(RefundListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of all refunds you’ve previously created. The refunds are returned in sorted
   * order, with the most recent refunds appearing first. For convenience, the 10 most recent
   * refunds are always available by default on the charge object.
   */
  public static RefundCollection list(RefundListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return ApiResource.requestCollection(url, params, RefundCollection.class, options);
  }

  /** Create a refund. */
  public static Refund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a refund. */
  public static Refund create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /** Create a refund. */
  public static Refund create(RefundCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create a refund. */
  public static Refund create(RefundCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/refunds");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /** Retrieves the details of an existing refund. */
  public static Refund retrieve(String refund) throws StripeException {
    return retrieve(refund, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing refund. */
  public static Refund retrieve(String refund, RequestOptions options) throws StripeException {
    return retrieve(refund, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing refund. */
  public static Refund retrieve(String refund, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Refund.class, options);
  }

  /** Retrieves the details of an existing refund. */
  public static Refund retrieve(String refund, RefundRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/refunds/%s", ApiResource.urlEncodeId(refund)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Refund.class, options);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  @Override
  public Refund update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  @Override
  public Refund update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/refunds/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  public Refund update(RefundUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request only accepts <code>metadata</code> as an argument.
   */
  public Refund update(RefundUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/refunds/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/refunds/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel(RefundCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * Cancels a refund with a status of <code>requires_action</code>.
   *
   * <p>Refunds in other states cannot be canceled, and only refunds for payment methods that
   * require customer action will enter the <code>requires_action</code> state.
   */
  public Refund cancel(RefundCancelParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/refunds/%s/cancel", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Refund.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    /** Contains the refund details. */
    @SerializedName("display_details")
    NextActionDisplayDetails displayDetails;

    /** Type of the next action to perform. */
    @SerializedName("type")
    String type;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextActionDisplayDetails extends StripeObject {
    @SerializedName("email_sent")
    EmailSent emailSent;

    /** The expiry timestamp. */
    @SerializedName("expires_at")
    Long expiresAt;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EmailSent extends StripeObject {
      /** The timestamp when the email was sent. */
      @SerializedName("email_sent_at")
      Long emailSentAt;

      /** The recipient's email address. */
      @SerializedName("email_sent_to")
      String emailSentTo;
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public class TestHelpers {
    private final Refund resource;

    @Deprecated
    public TestHelpers() {
      this.resource = Refund.this;
    }

    private TestHelpers(Refund resource) {
      this.resource = resource;
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire() throws StripeException {
      return expire((Map<String, Object>) null, (RequestOptions) null);
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire(RequestOptions options) throws StripeException {
      return expire((Map<String, Object>) null, options);
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire(Map<String, Object> params) throws StripeException {
      return expire(params, (RequestOptions) null);
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/refunds/%s/expire",
                  ApiResource.urlEncodeId(this.resource.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Refund.class, options);
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire(RefundExpireParams params) throws StripeException {
      return expire(params, (RequestOptions) null);
    }

    /** Expire a refund with a status of <code>requires_action</code>. */
    public Refund expire(RefundExpireParams params, RequestOptions options) throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/refunds/%s/expire",
                  ApiResource.urlEncodeId(this.resource.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Refund.class, options);
    }
  }
}
