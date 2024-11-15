// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ChargeCaptureParams;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeRetrieveParams;
import com.stripe.param.ChargeSearchParams;
import com.stripe.param.ChargeUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Charge} object represents a single attempt to move money into your Stripe account.
 * PaymentIntent confirmation is the most common way to create Charges, but transferring money to a
 * different Stripe account through Connect also creates Charges. Some legacy payment flows create
 * Charges directly, which is not recommended for new integrations.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Charge extends ApiResource implements MetadataStore<Charge>, BalanceTransactionSource {
  /**
   * Amount intended to be collected by this payment. A positive integer representing how much to
   * charge in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
   * unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The
   * minimum amount is $0.50 US or <a
   * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
   * charge currency</a>. The amount value supports up to eight digits (e.g., a value of 99999999
   * for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Amount in cents (or local equivalent) captured (can be less than the amount attribute on the
   * charge if a partial capture was made).
   */
  @SerializedName("amount_captured")
  Long amountCaptured;

  /**
   * Amount in cents (or local equivalent) refunded (can be less than the amount attribute on the
   * charge if a partial refund was issued).
   */
  @SerializedName("amount_refunded")
  Long amountRefunded;

  /** ID of the Connect application that created the charge. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * The application fee (if any) for the charge. <a
   * href="https://stripe.com/docs/connect/direct-charges#collect-fees">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("application_fee")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ApplicationFee> applicationFee;

  /**
   * The amount of the application fee (if any) requested for the charge. <a
   * href="https://stripe.com/docs/connect/direct-charges#collect-fees">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /** Authorization code on the charge. */
  @SerializedName("authorization_code")
  String authorizationCode;

  /**
   * ID of the balance transaction that describes the impact of this charge on your account balance
   * (not including refunds or disputes).
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /**
   * The full statement descriptor that is passed to card networks, and that is displayed on your
   * customers' credit card and bank statements. Allows you to see what the statement descriptor
   * looks like after the static and dynamic portions are combined. This value only exists for card
   * payments.
   */
  @SerializedName("calculated_statement_descriptor")
  String calculatedStatementDescriptor;

  /**
   * If the charge was created without capturing, this Boolean represents whether it is still
   * uncaptured or has since been captured.
   */
  @SerializedName("captured")
  Boolean captured;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** ID of the customer this charge is for if one exists. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Whether the charge has been disputed. */
  @SerializedName("disputed")
  Boolean disputed;

  /**
   * ID of the balance transaction that describes the reversal of the balance on your account due to
   * payment failure.
   */
  @SerializedName("failure_balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> failureBalanceTransaction;

  /**
   * Error code explaining reason for charge failure if available (see <a
   * href="https://stripe.com/docs/error-codes">the errors section</a> for a list of codes).
   */
  @SerializedName("failure_code")
  String failureCode;

  /** Message to user further explaining reason for charge failure if available. */
  @SerializedName("failure_message")
  String failureMessage;

  /** Information on fraud assessments for the charge. */
  @SerializedName("fraud_details")
  FraudDetails fraudDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** ID of the invoice this charge is for if one exists. */
  @SerializedName("invoice")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Invoice> invoice;

  @SerializedName("level3")
  Level3 level3;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code charge}.
   */
  @SerializedName("object")
  String object;

  /**
   * The account (if any) the charge was made on behalf of without triggering an automatic transfer.
   * See the <a href="https://stripe.com/docs/connect/separate-charges-and-transfers">Connect
   * documentation</a> for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /**
   * Details about whether the payment was accepted, and why. See <a
   * href="https://stripe.com/docs/declines">understanding declines</a> for details.
   */
  @SerializedName("outcome")
  Outcome outcome;

  /** {@code true} if the charge succeeded, or was successfully authorized for later capture. */
  @SerializedName("paid")
  Boolean paid;

  /** ID of the PaymentIntent associated with this charge, if one exists. */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /** ID of the payment method used in this charge. */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Details about the payment method at the time of the transaction. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /**
   * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
   * Session</a> for more information.
   */
  @SerializedName("radar_options")
  RadarOptions radarOptions;

  /** This is the email address that the receipt for this charge was sent to. */
  @SerializedName("receipt_email")
  String receiptEmail;

  /**
   * This is the transaction number that appears on email receipts sent for this charge. This
   * attribute will be {@code null} until a receipt has been sent.
   */
  @SerializedName("receipt_number")
  String receiptNumber;

  /**
   * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
   * latest state of the charge, including any refunds. If the charge is for an Invoice, the receipt
   * will be stylized as an Invoice receipt.
   */
  @SerializedName("receipt_url")
  String receiptUrl;

  /**
   * Whether the charge has been fully refunded. If the charge is only partially refunded, this
   * attribute will still be false.
   */
  @SerializedName("refunded")
  Boolean refunded;

  /** A list of refunds that have been applied to the charge. */
  @SerializedName("refunds")
  RefundCollection refunds;

  /** ID of the review associated with this charge if one exists. */
  @SerializedName("review")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Review> review;

  /** Shipping information for the charge. */
  @SerializedName("shipping")
  ShippingDetails shipping;

  /**
   * This is a legacy field that will be removed in the future. It contains the Source, Card, or
   * BankAccount object used for the charge. For details about the payment method used for this
   * charge, refer to {@code payment_method} or {@code payment_method_details} instead.
   */
  @SerializedName("source")
  PaymentSource source;

  /**
   * The transfer ID which created this charge. Only present if the charge came from another Stripe
   * account. <a href="https://docs.stripe.com/connect/destination-charges">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("source_transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> sourceTransfer;

  /**
   * For a non-card charge, text that appears on the customer's statement as the statement
   * descriptor. This value overrides the account's default statement descriptor. For information
   * about requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   *
   * <p>For a card charge, this value is ignored unless you don't specify a {@code
   * statement_descriptor_suffix}, in which case this value is used as the suffix.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement. If the account has no prefix value, the suffix is concatenated to the account's
   * statement descriptor.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * The status of the payment is either {@code succeeded}, {@code pending}, or {@code failed}.
   *
   * <p>One of {@code failed}, {@code pending}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * ID of the transfer to the {@code destination} account (only applicable if the charge was
   * created using the {@code destination} parameter).
   */
  @SerializedName("transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> transfer;

  /**
   * An optional dictionary including the account to automatically transfer to as part of a
   * destination charge. <a href="https://stripe.com/docs/connect/destination-charges">See the
   * Connect documentation</a> for details.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies this transaction as part of a group. See the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers#transfer-options">Connect
   * documentation</a> for details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code applicationFee} object. */
  public String getApplicationFee() {
    return (this.applicationFee != null) ? this.applicationFee.getId() : null;
  }

  public void setApplicationFee(String id) {
    this.applicationFee = ApiResource.setExpandableFieldId(id, this.applicationFee);
  }

  /** Get expanded {@code applicationFee}. */
  public ApplicationFee getApplicationFeeObject() {
    return (this.applicationFee != null) ? this.applicationFee.getExpanded() : null;
  }

  public void setApplicationFeeObject(ApplicationFee expandableObject) {
    this.applicationFee =
        new ExpandableField<ApplicationFee>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code invoice} object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded {@code invoice}. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code review} object. */
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String id) {
    this.review = ApiResource.setExpandableFieldId(id, this.review);
  }

  /** Get expanded {@code review}. */
  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review expandableObject) {
    this.review = new ExpandableField<Review>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code sourceTransfer} object. */
  public String getSourceTransfer() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getId() : null;
  }

  public void setSourceTransfer(String id) {
    this.sourceTransfer = ApiResource.setExpandableFieldId(id, this.sourceTransfer);
  }

  /** Get expanded {@code sourceTransfer}. */
  public Transfer getSourceTransferObject() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getExpanded() : null;
  }

  public void setSourceTransferObject(Transfer expandableObject) {
    this.sourceTransfer = new ExpandableField<Transfer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code transfer} object. */
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String id) {
    this.transfer = ApiResource.setExpandableFieldId(id, this.transfer);
  }

  /** Get expanded {@code transfer}. */
  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer expandableObject) {
    this.transfer = new ExpandableField<Transfer>(expandableObject.getId(), expandableObject);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture() throws StripeException {
    return capture((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(RequestOptions options) throws StripeException {
    return capture((Map<String, Object>) null, options);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(Map<String, Object> params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Charge.class);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(ChargeCaptureParams params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured charge that was created with the {@code capture}
   * option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>), after which they are
   * marked as refunded and capture attempts will fail.
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="https://stripe.com/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.
   */
  public Charge capture(ChargeCaptureParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Charge.class);
  }

  /**
   * This method is no longer recommended—use the <a
   * href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to initiate a new
   * payment instead. Confirmation of the PaymentIntent creates the {@code Charge} object used to
   * request payment.
   */
  public static Charge create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This method is no longer recommended—use the <a
   * href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to initiate a new
   * payment instead. Confirmation of the PaymentIntent creates the {@code Charge} object used to
   * request payment.
   */
  public static Charge create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Charge.class);
  }

  /**
   * This method is no longer recommended—use the <a
   * href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to initiate a new
   * payment instead. Confirmation of the PaymentIntent creates the {@code Charge} object used to
   * request payment.
   */
  public static Charge create(ChargeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This method is no longer recommended—use the <a
   * href="https://stripe.com/docs/api/payment_intents">Payment Intents API</a> to initiate a new
   * payment instead. Confirmation of the PaymentIntent creates the {@code Charge} object used to
   * request payment.
   */
  public static Charge create(ChargeCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Charge.class);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public static ChargeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public static ChargeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ChargeCollection.class);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public static ChargeCollection list(ChargeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public static ChargeCollection list(ChargeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ChargeCollection.class);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public static Charge retrieve(String charge) throws StripeException {
    return retrieve(charge, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public static Charge retrieve(String charge, RequestOptions options) throws StripeException {
    return retrieve(charge, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public static Charge retrieve(String charge, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Charge.class);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public static Charge retrieve(String charge, ChargeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Charge.class);
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ChargeSearchResult search(Map<String, Object> params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ChargeSearchResult search(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges/search";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ChargeSearchResult.class);
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ChargeSearchResult search(ChargeSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }

  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public static ChargeSearchResult search(ChargeSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges/search";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ChargeSearchResult.class);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Charge update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  @Override
  public Charge update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Charge.class);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(ChargeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(ChargeUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Charge.class);
  }

  /**
   * For more details about BillingDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingDetails extends StripeObject {
    /** Billing address. */
    @SerializedName("address")
    com.stripe.model.Address address;

    /** Email address. */
    @SerializedName("email")
    String email;

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;
  }

  /**
   * For more details about FraudDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudDetails extends StripeObject {
    /** Assessments from Stripe. If set, the value is {@code fraudulent}. */
    @SerializedName("stripe_report")
    String stripeReport;

    /**
     * Assessments reported by you. If set, possible values of are {@code safe} and {@code
     * fraudulent}.
     */
    @SerializedName("user_report")
    String userReport;
  }

  /**
   * For more details about Level3, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Level3 extends StripeObject {
    @SerializedName("customer_reference")
    String customerReference;

    @SerializedName("line_items")
    List<Charge.Level3.LineItem> lineItems;

    @SerializedName("merchant_reference")
    String merchantReference;

    @SerializedName("shipping_address_zip")
    String shippingAddressZip;

    @SerializedName("shipping_amount")
    Long shippingAmount;

    @SerializedName("shipping_from_zip")
    String shippingFromZip;

    /**
     * For more details about LineItem, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem extends StripeObject {
      @SerializedName("discount_amount")
      Long discountAmount;

      @SerializedName("product_code")
      String productCode;

      @SerializedName("product_description")
      String productDescription;

      @SerializedName("quantity")
      Long quantity;

      @SerializedName("tax_amount")
      Long taxAmount;

      @SerializedName("unit_cost")
      Long unitCost;
    }
  }

  /**
   * For more details about Outcome, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Outcome extends StripeObject {
    /**
     * For charges declined by the network, a 2 digit code which indicates the advice returned by
     * the network on how to proceed with an error.
     */
    @SerializedName("network_advice_code")
    String networkAdviceCode;

    /**
     * For charges declined by the network, a brand specific 2, 3, or 4 digit code which indicates
     * the reason the authorization failed.
     */
    @SerializedName("network_decline_code")
    String networkDeclineCode;

    /**
     * Possible values are {@code approved_by_network}, {@code declined_by_network}, {@code
     * not_sent_to_network}, and {@code reversed_after_approval}. The value {@code
     * reversed_after_approval} indicates the payment was <a
     * href="https://stripe.com/docs/declines#blocked-payments">blocked by Stripe</a> after bank
     * authorization, and may temporarily appear as &quot;pending&quot; on a cardholder's statement.
     */
    @SerializedName("network_status")
    String networkStatus;

    /**
     * An enumerated value providing a more detailed explanation of the outcome's {@code type}.
     * Charges blocked by Radar's default block rule have the value {@code highest_risk_level}.
     * Charges placed in review by Radar's default review rule have the value {@code
     * elevated_risk_level}. Charges authorized, blocked, or placed in review by custom rules have
     * the value {@code rule}. See <a href="https://stripe.com/docs/declines">understanding
     * declines</a> for more details.
     */
    @SerializedName("reason")
    String reason;

    /**
     * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated
     * payments are {@code normal}, {@code elevated}, {@code highest}. For non-card payments, and
     * card-based payments predating the public assignment of risk levels, this field will have the
     * value {@code not_assessed}. In the event of an error in the evaluation, this field will have
     * the value {@code unknown}. This field is only available with Radar.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /**
     * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated
     * payments are between 0 and 100. For non-card payments, card-based payments predating the
     * public assignment of risk scores, or in the event of an error during evaluation, this field
     * will not be present. This field is only available with Radar for Fraud Teams.
     */
    @SerializedName("risk_score")
    Long riskScore;

    /** The ID of the Radar rule that matched the payment, if applicable. */
    @SerializedName("rule")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Rule> rule;

    /**
     * A human-readable description of the outcome type and reason, designed for you (the recipient
     * of the payment), not your customer.
     */
    @SerializedName("seller_message")
    String sellerMessage;

    /**
     * Possible values are {@code authorized}, {@code manual_review}, {@code issuer_declined},
     * {@code blocked}, and {@code invalid}. See <a
     * href="https://stripe.com/docs/declines">understanding declines</a> and <a
     * href="https://stripe.com/docs/radar/reviews">Radar reviews</a> for details.
     */
    @SerializedName("type")
    String type;

    /** Get ID of expandable {@code rule} object. */
    public String getRule() {
      return (this.rule != null) ? this.rule.getId() : null;
    }

    public void setRule(String id) {
      this.rule = ApiResource.setExpandableFieldId(id, this.rule);
    }

    /** Get expanded {@code rule}. */
    public Rule getRuleObject() {
      return (this.rule != null) ? this.rule.getExpanded() : null;
    }

    public void setRuleObject(Rule expandableObject) {
      this.rule = new ExpandableField<Rule>(expandableObject.getId(), expandableObject);
    }

    /**
     * For more details about Rule, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rule extends StripeObject implements HasId {
      /** The action taken on the payment. */
      @SerializedName("action")
      String action;

      /** Unique identifier for the object. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;

      /** The predicate to evaluate the payment against. */
      @SerializedName("predicate")
      String predicate;
    }
  }

  /**
   * For more details about PaymentMethodDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("ach_credit_transfer")
    AchCreditTransfer achCreditTransfer;

    @SerializedName("ach_debit")
    AchDebit achDebit;

    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("affirm")
    Affirm affirm;

    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    @SerializedName("alipay")
    Alipay alipay;

    @SerializedName("alma")
    Alma alma;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("blik")
    Blik blik;

    @SerializedName("boleto")
    Boleto boleto;

    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("cashapp")
    Cashapp cashapp;

    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    @SerializedName("eps")
    Eps eps;

    @SerializedName("fpx")
    Fpx fpx;

    @SerializedName("giropay")
    Giropay giropay;

    @SerializedName("gopay")
    Gopay gopay;

    @SerializedName("grabpay")
    Grabpay grabpay;

    @SerializedName("id_bank_transfer")
    IdBankTransfer idBankTransfer;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("interac_present")
    InteracPresent interacPresent;

    @SerializedName("kakao_pay")
    KakaoPay kakaoPay;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("konbini")
    Konbini konbini;

    @SerializedName("kr_card")
    KrCard krCard;

    @SerializedName("link")
    Link link;

    @SerializedName("mb_way")
    MbWay mbWay;

    @SerializedName("mobilepay")
    Mobilepay mobilepay;

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("naver_pay")
    NaverPay naverPay;

    @SerializedName("oxxo")
    Oxxo oxxo;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("payco")
    Payco payco;

    @SerializedName("paynow")
    Paynow paynow;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("payto")
    Payto payto;

    @SerializedName("pix")
    Pix pix;

    @SerializedName("promptpay")
    Promptpay promptpay;

    @SerializedName("qris")
    Qris qris;

    @SerializedName("rechnung")
    Rechnung rechnung;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("samsung_pay")
    SamsungPay samsungPay;

    @SerializedName("sepa_credit_transfer")
    SepaCreditTransfer sepaCreditTransfer;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("shopeepay")
    Shopeepay shopeepay;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("stripe_account")
    StripeAccount stripeAccount;

    @SerializedName("swish")
    Swish swish;

    @SerializedName("twint")
    Twint twint;

    /**
     * The type of transaction-specific details of the payment method used in the payment, one of
     * {@code ach_credit_transfer}, {@code ach_debit}, {@code acss_debit}, {@code alipay}, {@code
     * au_becs_debit}, {@code bancontact}, {@code card}, {@code card_present}, {@code eps}, {@code
     * giropay}, {@code ideal}, {@code klarna}, {@code multibanco}, {@code p24}, {@code sepa_debit},
     * {@code sofort}, {@code stripe_account}, or {@code wechat}. An additional hash is included on
     * {@code payment_method_details} with a name matching this value. It contains information
     * specific to the payment method.
     */
    @SerializedName("type")
    String type;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    @SerializedName("wechat")
    Wechat wechat;

    @SerializedName("wechat_pay")
    WechatPay wechatPay;

    @SerializedName("zip")
    Zip zip;

    /**
     * For more details about AchCreditTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchCreditTransfer extends StripeObject {
      /** Account number to transfer funds to. */
      @SerializedName("account_number")
      String accountNumber;

      /** Name of the bank associated with the routing number. */
      @SerializedName("bank_name")
      String bankName;

      /** Routing transit number for the bank account to transfer funds to. */
      @SerializedName("routing_number")
      String routingNumber;

      /** SWIFT code of the bank associated with the routing number. */
      @SerializedName("swift_code")
      String swiftCode;
    }

    /**
     * For more details about AchDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchDebit extends StripeObject {
      /**
       * Type of entity that holds the account. This can be either {@code individual} or {@code
       * company}.
       *
       * <p>One of {@code company}, or {@code individual}.
       */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** Routing transit number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;
    }

    /**
     * For more details about AcssDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Institution number of the bank account. */
      @SerializedName("institution_number")
      String institutionNumber;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** Transit number of the bank account. */
      @SerializedName("transit_number")
      String transitNumber;
    }

    /**
     * For more details about Affirm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm extends StripeObject {
      /** The Affirm transaction ID associated with this payment. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about AfterpayClearpay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay extends StripeObject {
      /** The Afterpay order ID associated with this payment intent. */
      @SerializedName("order_id")
      String orderId;

      /** Order identifier shown to the merchant in Afterpay’s online portal. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Alipay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alipay extends StripeObject {
      /**
       * Uniquely identifies this particular Alipay account. You can use this attribute to check
       * whether two Alipay accounts are the same.
       */
      @SerializedName("buyer_id")
      String buyerId;

      /**
       * Uniquely identifies this particular Alipay account. You can use this attribute to check
       * whether two Alipay accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Transaction ID of this particular Alipay transaction. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Alma, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alma extends StripeObject {}

    /**
     * For more details about AmazonPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {
      @SerializedName("funding")
      Funding funding;

      /**
       * For more details about Funding, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Funding extends StripeObject {
        @SerializedName("card")
        Card card;

        /**
         * funding type of the underlying payment method.
         *
         * <p>Equal to {@code card}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about Card, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Card extends StripeObject {
          /**
           * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code eftpos_au},
           * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or
           * {@code unknown}.
           */
          @SerializedName("brand")
          String brand;

          /**
           * Two-letter ISO code representing the country of the card. You could use this attribute
           * to get a sense of the international breakdown of cards you've collected.
           */
          @SerializedName("country")
          String country;

          /** Two-digit number representing the card's expiration month. */
          @SerializedName("exp_month")
          Long expMonth;

          /** Four-digit number representing the card's expiration year. */
          @SerializedName("exp_year")
          Long expYear;

          /**
           * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
           * unknown}.
           */
          @SerializedName("funding")
          String funding;

          /** The last four digits of the card. */
          @SerializedName("last4")
          String last4;
        }
      }
    }

    /**
     * For more details about AuBecsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {
      /** Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      String bsbNumber;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;
    }

    /**
     * For more details about BacsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
      @SerializedName("sort_code")
      String sortCode;
    }

    /**
     * For more details about Bancontact, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       * Can be one of {@code en}, {@code de}, {@code fr}, or {@code nl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by Bancontact directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Blik, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Blik extends StripeObject {
      /** A unique and immutable identifier assigned by BLIK to every buyer. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about Boleto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Boleto extends StripeObject {
      /**
       * The tax ID of the customer (CPF for individuals consumers or CNPJ for businesses
       * consumers).
       */
      @SerializedName("tax_id")
      String taxId;
    }

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** The authorized amount. */
      @SerializedName("amount_authorized")
      Long amountAuthorized;

      /** Authorization code on the charge. */
      @SerializedName("authorization_code")
      String authorizationCode;

      /**
       * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code eftpos_au},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("brand")
      String brand;

      /**
       * When using manual capture, a future timestamp at which the charge will be automatically
       * refunded if uncaptured.
       */
      @SerializedName("capture_before")
      Long captureBefore;

      /** Check results by Card networks on Card address and CVC at time of payment. */
      @SerializedName("checks")
      Checks checks;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      @SerializedName("decremental_authorization")
      DecrementalAuthorization decrementalAuthorization;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      @SerializedName("extended_authorization")
      ExtendedAuthorization extendedAuthorization;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      @SerializedName("incremental_authorization")
      IncrementalAuthorization incrementalAuthorization;

      /**
       * Installment details for this payment (Mexico only).
       *
       * <p>For more information, see the <a
       * href="https://stripe.com/docs/payments/installments">installments integration guide</a>.
       */
      @SerializedName("installments")
      Installments installments;

      /**
       * The name of the card's issuing bank. (For internal use only and not typically available in
       * standard API requests.)
       */
      @SerializedName("issuer")
      String issuer;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment or created by it. */
      @SerializedName("mandate")
      String mandate;

      /** True if this payment was marked as MOTO and out of scope for SCA. */
      @SerializedName("moto")
      Boolean moto;

      @SerializedName("multicapture")
      Multicapture multicapture;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * If this card has network token credentials, this contains the details of the network token
       * credentials.
       */
      @SerializedName("network_token")
      NetworkToken networkToken;

      @SerializedName("overcapture")
      Overcapture overcapture;

      /** Populated if this transaction used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      /** If this Card is part of a card wallet, this contains the details of the card wallet. */
      @SerializedName("wallet")
      Wallet wallet;

      /**
       * For more details about Checks, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Checks extends StripeObject {
        /**
         * If a address line1 was provided, results of the check, one of {@code pass}, {@code fail},
         * {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_line1_check")
        String addressLine1Check;

        /**
         * If a address postal code was provided, results of the check, one of {@code pass}, {@code
         * fail}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        /**
         * If a CVC was provided, results of the check, one of {@code pass}, {@code fail}, {@code
         * unavailable}, or {@code unchecked}.
         */
        @SerializedName("cvc_check")
        String cvcCheck;
      }

      /**
       * For more details about DecrementalAuthorization, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class DecrementalAuthorization extends StripeObject {
        /**
         * Indicates whether or not the decremental authorization feature is supported.
         *
         * <p>One of {@code available}, or {@code unavailable}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about ExtendedAuthorization, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ExtendedAuthorization extends StripeObject {
        /**
         * Indicates whether or not the capture window is extended beyond the standard
         * authorization.
         *
         * <p>One of {@code disabled}, or {@code enabled}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about IncrementalAuthorization, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class IncrementalAuthorization extends StripeObject {
        /**
         * Indicates whether or not the incremental authorization feature is supported.
         *
         * <p>One of {@code available}, or {@code unavailable}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about Installments, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments extends StripeObject {
        /** Installment plan selected for the payment. */
        @SerializedName("plan")
        Plan plan;

        /**
         * For more details about Plan, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Plan extends StripeObject {
          /**
           * For {@code fixed_count} installment plans, this is the number of installment payments
           * your customer will make to their credit card.
           */
          @SerializedName("count")
          Long count;

          /**
           * For {@code fixed_count} installment plans, this is the interval between installment
           * payments your customer will make to their credit card. One of {@code month}.
           */
          @SerializedName("interval")
          String interval;

          /** Type of installment plan, one of {@code fixed_count}. */
          @SerializedName("type")
          String type;
        }
      }

      /**
       * For more details about Multicapture, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Multicapture extends StripeObject {
        /**
         * Indicates whether or not multiple captures are supported.
         *
         * <p>One of {@code available}, or {@code unavailable}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about NetworkToken, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NetworkToken extends StripeObject {
        /**
         * Indicates if Stripe used a network token, either user provided or Stripe managed when
         * processing the transaction.
         */
        @SerializedName("used")
        Boolean used;
      }

      /**
       * For more details about Overcapture, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Overcapture extends StripeObject {
        /** The maximum amount that can be captured. */
        @SerializedName("maximum_amount_capturable")
        Long maximumAmountCapturable;

        /**
         * Indicates whether or not the authorized amount can be over-captured.
         *
         * <p>One of {@code available}, or {@code unavailable}.
         */
        @SerializedName("status")
        String status;
      }

      /**
       * For more details about ThreeDSecure, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure extends StripeObject {
        /**
         * For authenticated transactions: how the customer was authenticated by the issuing bank.
         *
         * <p>One of {@code challenge}, or {@code frictionless}.
         */
        @SerializedName("authentication_flow")
        String authenticationFlow;

        /**
         * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of
         * authentication was performed.
         *
         * <p>One of {@code 01}, {@code 02}, {@code 05}, {@code 06}, or {@code 07}.
         */
        @SerializedName("electronic_commerce_indicator")
        String electronicCommerceIndicator;

        /**
         * The exemption requested via 3DS and accepted by the issuer at authentication time.
         *
         * <p>One of {@code low_risk}, or {@code none}.
         */
        @SerializedName("exemption_indicator")
        String exemptionIndicator;

        /**
         * Whether Stripe requested the value of {@code exemption_indicator} in the transaction.
         * This will depend on the outcome of Stripe's internal risk assessment.
         */
        @SerializedName("exemption_indicator_applied")
        Boolean exemptionIndicatorApplied;

        /**
         * Indicates the outcome of 3D Secure authentication.
         *
         * <p>One of {@code attempt_acknowledged}, {@code authenticated}, {@code exempted}, {@code
         * failed}, {@code not_supported}, or {@code processing_error}.
         */
        @SerializedName("result")
        String result;

        /**
         * Additional information about why 3D Secure succeeded or failed based on the {@code
         * result}.
         *
         * <p>One of {@code abandoned}, {@code bypassed}, {@code canceled}, {@code
         * card_not_enrolled}, {@code network_not_supported}, {@code protocol_error}, or {@code
         * rejected}.
         */
        @SerializedName("result_reason")
        String resultReason;

        /**
         * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID (dsTransId) for this
         * payment.
         */
        @SerializedName("transaction_id")
        String transactionId;

        /**
         * The version of 3D Secure that was used.
         *
         * <p>One of {@code 1.0.2}, {@code 2.1.0}, or {@code 2.2.0}.
         */
        @SerializedName("version")
        String version;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Wallet extends StripeObject {
        @SerializedName("amex_express_checkout")
        AmexExpressCheckout amexExpressCheckout;

        @SerializedName("apple_pay")
        ApplePay applePay;

        /** (For tokenized numbers only.) The last four digits of the device account number. */
        @SerializedName("dynamic_last4")
        String dynamicLast4;

        @SerializedName("google_pay")
        GooglePay googlePay;

        @SerializedName("link")
        Link link;

        @SerializedName("masterpass")
        Masterpass masterpass;

        @SerializedName("samsung_pay")
        SamsungPay samsungPay;

        /**
         * The type of the card wallet, one of {@code amex_express_checkout}, {@code apple_pay},
         * {@code google_pay}, {@code masterpass}, {@code samsung_pay}, {@code visa_checkout}, or
         * {@code link}. An additional hash is included on the Wallet subhash with a name matching
         * this value. It contains additional information specific to the card wallet type.
         */
        @SerializedName("type")
        String type;

        @SerializedName("visa_checkout")
        VisaCheckout visaCheckout;

        /**
         * For more details about AmexExpressCheckout, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmexExpressCheckout extends StripeObject {}

        /**
         * For more details about ApplePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplePay extends StripeObject {}

        /**
         * For more details about GooglePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GooglePay extends StripeObject {}

        /**
         * For more details about Link, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Link extends StripeObject {}

        /**
         * For more details about Masterpass, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Masterpass extends StripeObject {
          /**
           * Owner's verified billing address. Values are verified or provided by the wallet
           * directly (if supported) at the time of authorization or settlement. They cannot be set
           * or mutated.
           */
          @SerializedName("billing_address")
          com.stripe.model.Address billingAddress;

          /**
           * Owner's verified email. Values are verified or provided by the wallet directly (if
           * supported) at the time of authorization or settlement. They cannot be set or mutated.
           */
          @SerializedName("email")
          String email;

          /**
           * Owner's verified full name. Values are verified or provided by the wallet directly (if
           * supported) at the time of authorization or settlement. They cannot be set or mutated.
           */
          @SerializedName("name")
          String name;

          /**
           * Owner's verified shipping address. Values are verified or provided by the wallet
           * directly (if supported) at the time of authorization or settlement. They cannot be set
           * or mutated.
           */
          @SerializedName("shipping_address")
          com.stripe.model.Address shippingAddress;
        }

        /**
         * For more details about SamsungPay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPay extends StripeObject {}

        /**
         * For more details about VisaCheckout, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class VisaCheckout extends StripeObject {
          /**
           * Owner's verified billing address. Values are verified or provided by the wallet
           * directly (if supported) at the time of authorization or settlement. They cannot be set
           * or mutated.
           */
          @SerializedName("billing_address")
          com.stripe.model.Address billingAddress;

          /**
           * Owner's verified email. Values are verified or provided by the wallet directly (if
           * supported) at the time of authorization or settlement. They cannot be set or mutated.
           */
          @SerializedName("email")
          String email;

          /**
           * Owner's verified full name. Values are verified or provided by the wallet directly (if
           * supported) at the time of authorization or settlement. They cannot be set or mutated.
           */
          @SerializedName("name")
          String name;

          /**
           * Owner's verified shipping address. Values are verified or provided by the wallet
           * directly (if supported) at the time of authorization or settlement. They cannot be set
           * or mutated.
           */
          @SerializedName("shipping_address")
          com.stripe.model.Address shippingAddress;
        }
      }
    }

    /**
     * For more details about CardPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      /** The authorized amount. */
      @SerializedName("amount_authorized")
      Long amountAuthorized;

      /**
       * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code eftpos_au},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("brand")
      String brand;

      /**
       * The <a href="https://stripe.com/docs/card-product-codes">product code</a> that identifies
       * the specific program or product associated with a card.
       */
      @SerializedName("brand_product")
      String brandProduct;

      /**
       * When using manual capture, a future timestamp after which the charge will be automatically
       * refunded if uncaptured.
       */
      @SerializedName("capture_before")
      Long captureBefore;

      /**
       * The cardholder name as read from the card, in <a
       * href="https://en.wikipedia.org/wiki/ISO/IEC_7813">ISO 7813</a> format. May include
       * alphanumeric characters, special characters and first/last name separator ({@code /}). In
       * some cases, the cardholder name may not be available depending on how the issuer has
       * configured the card. Cardholder name is typically not available on swipe or contactless
       * payments, such as those made with Apple Pay and Google Pay.
       */
      @SerializedName("cardholder_name")
      String cardholderName;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /** Authorization response cryptogram. */
      @SerializedName("emv_auth_data")
      String emvAuthData;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
      @SerializedName("generated_card")
      String generatedCard;

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      /**
       * Whether this <a href="https://stripe.com/docs/api/payment_intents">PaymentIntent</a> is
       * eligible for incremental authorizations. Request support using <a
       * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-payment_method_options-card_present-request_incremental_authorization_support">request_incremental_authorization_support</a>.
       */
      @SerializedName("incremental_authorization_supported")
      Boolean incrementalAuthorizationSupported;

      /**
       * The name of the card's issuing bank. (For internal use only and not typically available in
       * standard API requests.)
       */
      @SerializedName("issuer")
      String issuer;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. The first three digits of the Trace ID is the Financial Network
       * Code, the next 6 digits is the Banknet Reference Number, and the last 4 digits represent
       * the date (MM/DD). This field will be available for successful Visa, Mastercard, or American
       * Express transactions and always null for other card brands.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /** Details about payments collected offline. */
      @SerializedName("offline")
      Offline offline;

      /** Defines whether the authorized amount can be over-captured or not. */
      @SerializedName("overcapture_supported")
      Boolean overcaptureSupported;

      /** EMV tag 5F2D. Preferred languages specified by the integrated circuit chip. */
      @SerializedName("preferred_locales")
      List<String> preferredLocales;

      /**
       * How card details were read in this transaction.
       *
       * <p>One of {@code contact_emv}, {@code contactless_emv}, {@code contactless_magstripe_mode},
       * {@code magnetic_stripe_fallback}, or {@code magnetic_stripe_track2}.
       */
      @SerializedName("read_method")
      String readMethod;

      /**
       * A collection of fields required to be displayed on receipts. Only required for EMV
       * transactions.
       */
      @SerializedName("receipt")
      Receipt receipt;

      @SerializedName("wallet")
      Wallet wallet;

      /**
       * For more details about Offline, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Offline extends StripeObject {
        /** Time at which the payment was collected while offline. */
        @SerializedName("stored_at")
        Long storedAt;

        /**
         * The method used to process this payment method offline. Only deferred is allowed.
         *
         * <p>Equal to {@code deferred}.
         */
        @SerializedName("type")
        String type;
      }

      /**
       * For more details about Receipt, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Receipt extends StripeObject {
        /**
         * The type of account being debited or credited
         *
         * <p>One of {@code checking}, {@code credit}, {@code prepaid}, or {@code unknown}.
         */
        @SerializedName("account_type")
        String accountType;

        /** EMV tag 9F26, cryptogram generated by the integrated circuit chip. */
        @SerializedName("application_cryptogram")
        String applicationCryptogram;

        /** Mnenomic of the Application Identifier. */
        @SerializedName("application_preferred_name")
        String applicationPreferredName;

        /** Identifier for this transaction. */
        @SerializedName("authorization_code")
        String authorizationCode;

        /** EMV tag 8A. A code returned by the card issuer. */
        @SerializedName("authorization_response_code")
        String authorizationResponseCode;

        /**
         * Describes the method used by the cardholder to verify ownership of the card. One of the
         * following: {@code approval}, {@code failure}, {@code none}, {@code offline_pin}, {@code
         * offline_pin_and_signature}, {@code online_pin}, or {@code signature}.
         */
        @SerializedName("cardholder_verification_method")
        String cardholderVerificationMethod;

        /**
         * EMV tag 84. Similar to the application identifier stored on the integrated circuit chip.
         */
        @SerializedName("dedicated_file_name")
        String dedicatedFileName;

        /** The outcome of a series of EMV functions performed by the card reader. */
        @SerializedName("terminal_verification_results")
        String terminalVerificationResults;

        /** An indication of various EMV functions performed during the transaction. */
        @SerializedName("transaction_status_information")
        String transactionStatusInformation;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Wallet extends StripeObject {
        /**
         * The type of mobile wallet, one of {@code apple_pay}, {@code google_pay}, {@code
         * samsung_pay}, or {@code unknown}.
         */
        @SerializedName("type")
        String type;
      }
    }

    /**
     * For more details about Cashapp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {
      /** A unique and immutable identifier assigned by Cash App to every buyer. */
      @SerializedName("buyer_id")
      String buyerId;

      /** A public identifier for buyers using Cash App. */
      @SerializedName("cashtag")
      String cashtag;
    }

    /**
     * For more details about CustomerBalance, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerBalance extends StripeObject {}

    /**
     * For more details about Eps, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
      /**
       * The customer's bank. Should be one of {@code arzte_und_apotheker_bank}, {@code
       * austrian_anadi_bank_ag}, {@code bank_austria}, {@code bankhaus_carl_spangler}, {@code
       * bankhaus_schelhammer_und_schattera_ag}, {@code bawag_psk_ag}, {@code bks_bank_ag}, {@code
       * brull_kallmus_bank_ag}, {@code btv_vier_lander_bank}, {@code capital_bank_grawe_gruppe_ag},
       * {@code deutsche_bank_ag}, {@code dolomitenbank}, {@code easybank_ag}, {@code
       * erste_bank_und_sparkassen}, {@code hypo_alpeadriabank_international_ag}, {@code
       * hypo_noe_lb_fur_niederosterreich_u_wien}, {@code hypo_oberosterreich_salzburg_steiermark},
       * {@code hypo_tirol_bank_ag}, {@code hypo_vorarlberg_bank_ag}, {@code
       * hypo_bank_burgenland_aktiengesellschaft}, {@code marchfelder_bank}, {@code oberbank_ag},
       * {@code raiffeisen_bankengruppe_osterreich}, {@code schoellerbank_ag}, {@code
       * sparda_bank_wien}, {@code volksbank_gruppe}, {@code volkskreditbank_ag}, or {@code
       * vr_bank_braunau}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * Owner's verified full name. Values are verified or provided by EPS directly (if supported)
       * at the time of authorization or settlement. They cannot be set or mutated. EPS rarely
       * provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about Fpx, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fpx extends StripeObject {
      /** Account holder type, if provided. Can be one of {@code individual} or {@code company}. */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /**
       * The customer's bank. Can be one of {@code affin_bank}, {@code agrobank}, {@code
       * alliance_bank}, {@code ambank}, {@code bank_islam}, {@code bank_muamalat}, {@code
       * bank_rakyat}, {@code bsn}, {@code cimb}, {@code hong_leong_bank}, {@code hsbc}, {@code
       * kfh}, {@code maybank2u}, {@code ocbc}, {@code public_bank}, {@code rhb}, {@code
       * standard_chartered}, {@code uob}, {@code deutsche_bank}, {@code maybank2e}, {@code
       * pb_enterprise}, or {@code bank_of_china}.
       */
      @SerializedName("bank")
      String bank;

      /** Unique transaction id generated by FPX for every request from the merchant. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Giropay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Giropay extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /**
       * Owner's verified full name. Values are verified or provided by Giropay directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       * Giropay rarely provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about Gopay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Gopay extends StripeObject {}

    /**
     * For more details about Grabpay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Grabpay extends StripeObject {
      /** Unique transaction id generated by GrabPay. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about IdBankTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class IdBankTransfer extends StripeObject {
      /** Account number of the bank account to transfer funds to. */
      @SerializedName("account_number")
      String accountNumber;

      /**
       * Bank where the account is located.
       *
       * <p>One of {@code bca}, {@code bni}, {@code bri}, {@code cimb}, or {@code permata}.
       */
      @SerializedName("bank")
      String bank;

      /** Local bank code of the bank. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Merchant name and billing details name, for the customer to check for the correct merchant
       * when performing the bank transfer.
       */
      @SerializedName("display_name")
      String displayName;
    }

    /**
     * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code abn_amro}, {@code asn_bank}, {@code bunq}, {@code
       * handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code n26}, {@code nn}, {@code
       * rabobank}, {@code regiobank}, {@code revolut}, {@code sns_bank}, {@code triodos_bank},
       * {@code van_lanschot}, or {@code yoursafe}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BITSNL2A}, {@code BUNQNL2A}, {@code
       * FVLBNL22}, {@code HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code MOYONL21}, {@code
       * NNBANL2G}, {@code NTSBDEB1}, {@code RABONL2U}, {@code RBRBNL21}, {@code REVOIE23}, {@code
       * REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
       */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Owner's verified full name. Values are verified or provided by iDEAL directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about InteracPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InteracPresent extends StripeObject {
      /** Card brand. Can be {@code interac}, {@code mastercard} or {@code visa}. */
      @SerializedName("brand")
      String brand;

      /**
       * The cardholder name as read from the card, in <a
       * href="https://en.wikipedia.org/wiki/ISO/IEC_7813">ISO 7813</a> format. May include
       * alphanumeric characters, special characters and first/last name separator ({@code /}). In
       * some cases, the cardholder name may not be available depending on how the issuer has
       * configured the card. Cardholder name is typically not available on swipe or contactless
       * payments, such as those made with Apple Pay and Google Pay.
       */
      @SerializedName("cardholder_name")
      String cardholderName;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /** Authorization response cryptogram. */
      @SerializedName("emv_auth_data")
      String emvAuthData;

      /** Two-digit number representing the card's expiration month. */
      @SerializedName("exp_month")
      Long expMonth;

      /** Four-digit number representing the card's expiration year. */
      @SerializedName("exp_year")
      Long expYear;

      /**
       * Uniquely identifies this particular card number. You can use this attribute to check
       * whether two customers who’ve signed up with you are using the same card number, for
       * example. For payment methods that tokenize card information (Apple Pay, Google Pay), the
       * tokenized number might be provided instead of the underlying card number.
       *
       * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
       * fingerprints for the same card---one for India and one for the rest of the world.</em>
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /**
       * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
       * unknown}.
       */
      @SerializedName("funding")
      String funding;

      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
      @SerializedName("generated_card")
      String generatedCard;

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      /**
       * The name of the card's issuing bank. (For internal use only and not typically available in
       * standard API requests.)
       */
      @SerializedName("issuer")
      String issuer;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. The first three digits of the Trace ID is the Financial Network
       * Code, the next 6 digits is the Banknet Reference Number, and the last 4 digits represent
       * the date (MM/DD). This field will be available for successful Visa, Mastercard, or American
       * Express transactions and always null for other card brands.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /** EMV tag 5F2D. Preferred languages specified by the integrated circuit chip. */
      @SerializedName("preferred_locales")
      List<String> preferredLocales;

      /**
       * How card details were read in this transaction.
       *
       * <p>One of {@code contact_emv}, {@code contactless_emv}, {@code contactless_magstripe_mode},
       * {@code magnetic_stripe_fallback}, or {@code magnetic_stripe_track2}.
       */
      @SerializedName("read_method")
      String readMethod;

      /**
       * A collection of fields required to be displayed on receipts. Only required for EMV
       * transactions.
       */
      @SerializedName("receipt")
      Receipt receipt;

      /**
       * For more details about Receipt, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Receipt extends StripeObject {
        /**
         * The type of account being debited or credited
         *
         * <p>One of {@code checking}, {@code savings}, or {@code unknown}.
         */
        @SerializedName("account_type")
        String accountType;

        /** EMV tag 9F26, cryptogram generated by the integrated circuit chip. */
        @SerializedName("application_cryptogram")
        String applicationCryptogram;

        /** Mnenomic of the Application Identifier. */
        @SerializedName("application_preferred_name")
        String applicationPreferredName;

        /** Identifier for this transaction. */
        @SerializedName("authorization_code")
        String authorizationCode;

        /** EMV tag 8A. A code returned by the card issuer. */
        @SerializedName("authorization_response_code")
        String authorizationResponseCode;

        /**
         * Describes the method used by the cardholder to verify ownership of the card. One of the
         * following: {@code approval}, {@code failure}, {@code none}, {@code offline_pin}, {@code
         * offline_pin_and_signature}, {@code online_pin}, or {@code signature}.
         */
        @SerializedName("cardholder_verification_method")
        String cardholderVerificationMethod;

        /**
         * EMV tag 84. Similar to the application identifier stored on the integrated circuit chip.
         */
        @SerializedName("dedicated_file_name")
        String dedicatedFileName;

        /** The outcome of a series of EMV functions performed by the card reader. */
        @SerializedName("terminal_verification_results")
        String terminalVerificationResults;

        /** An indication of various EMV functions performed during the transaction. */
        @SerializedName("transaction_status_information")
        String transactionStatusInformation;
      }
    }

    /**
     * For more details about KakaoPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
      /** The payer details for this transaction. */
      @SerializedName("payer_details")
      PayerDetails payerDetails;

      /**
       * The Klarna payment method used for this transaction. Can be one of {@code pay_later},
       * {@code pay_now}, {@code pay_with_financing}, or {@code pay_in_installments}
       */
      @SerializedName("payment_method_category")
      String paymentMethodCategory;

      /**
       * Preferred language of the Klarna authorization page that the customer is redirected to. Can
       * be one of {@code de-AT}, {@code en-AT}, {@code nl-BE}, {@code fr-BE}, {@code en-BE}, {@code
       * de-DE}, {@code en-DE}, {@code da-DK}, {@code en-DK}, {@code es-ES}, {@code en-ES}, {@code
       * fi-FI}, {@code sv-FI}, {@code en-FI}, {@code en-GB}, {@code en-IE}, {@code it-IT}, {@code
       * en-IT}, {@code nl-NL}, {@code en-NL}, {@code nb-NO}, {@code en-NO}, {@code sv-SE}, {@code
       * en-SE}, {@code en-US}, {@code es-US}, {@code fr-FR}, {@code en-FR}, {@code cs-CZ}, {@code
       * en-CZ}, {@code ro-RO}, {@code en-RO}, {@code el-GR}, {@code en-GR}, {@code en-AU}, {@code
       * en-NZ}, {@code en-CA}, {@code fr-CA}, {@code pl-PL}, {@code en-PL}, {@code pt-PT}, {@code
       * en-PT}, {@code de-CH}, {@code fr-CH}, {@code it-CH}, or {@code en-CH}
       */
      @SerializedName("preferred_locale")
      String preferredLocale;

      /**
       * For more details about PayerDetails, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class PayerDetails extends StripeObject {
        /** The payer's address. */
        @SerializedName("address")
        com.stripe.model.Charge.PaymentMethodDetails.Klarna.PayerDetails.Address address;

        /**
         * For more details about Address, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Address extends StripeObject {
          /** The payer address country. */
          @SerializedName("country")
          String country;
        }
      }
    }

    /**
     * For more details about Konbini, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Konbini extends StripeObject {
      /**
       * If the payment succeeded, this contains the details of the convenience store where the
       * payment was completed.
       */
      @SerializedName("store")
      Store store;

      /**
       * For more details about Store, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Store extends StripeObject {
        /**
         * The name of the convenience store chain where the payment was completed.
         *
         * <p>One of {@code familymart}, {@code lawson}, {@code ministop}, or {@code seicomart}.
         */
        @SerializedName("chain")
        String chain;
      }
    }

    /**
     * For more details about KrCard, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard extends StripeObject {
      /**
       * The local credit or debit card brand.
       *
       * <p>One of {@code bc}, {@code citi}, {@code hana}, {@code hyundai}, {@code jeju}, {@code
       * jeonbuk}, {@code kakaobank}, {@code kbank}, {@code kdbbank}, {@code kookmin}, {@code
       * kwangju}, {@code lotte}, {@code mg}, {@code nh}, {@code post}, {@code samsung}, {@code
       * savingsbank}, {@code shinhan}, {@code shinhyup}, {@code suhyup}, {@code tossbank}, or
       * {@code woori}.
       */
      @SerializedName("brand")
      String brand;

      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;

      /** The last four digits of the card. This may not be present for American Express cards. */
      @SerializedName("last4")
      String last4;
    }

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /**
       * Two-letter ISO code representing the funding source country beneath the Link payment. You
       * could use this attribute to get a sense of international fees.
       */
      @SerializedName("country")
      String country;
    }

    /**
     * For more details about MbWay, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MbWay extends StripeObject {}

    /**
     * For more details about Mobilepay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Mobilepay extends StripeObject {
      /** Internal card details. */
      @SerializedName("card")
      Card card;

      /**
       * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        /** Brand of the card used in the transaction. */
        @SerializedName("brand")
        String brand;

        /** Two-letter ISO code representing the country of the card. */
        @SerializedName("country")
        String country;

        /** Two digit number representing the card's expiration month. */
        @SerializedName("exp_month")
        Long expMonth;

        /** Two digit number representing the card's expiration year. */
        @SerializedName("exp_year")
        Long expYear;

        /** The last 4 digits of the card. */
        @SerializedName("last4")
        String last4;
      }
    }

    /**
     * For more details about Multibanco, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco extends StripeObject {
      /** Entity number associated with this Multibanco payment. */
      @SerializedName("entity")
      String entity;

      /** Reference number associated with this Multibanco payment. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about NaverPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about Oxxo, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Oxxo extends StripeObject {
      /** OXXO reference number. */
      @SerializedName("number")
      String number;
    }

    /**
     * For more details about P24, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code ing}, {@code citi_handlowy}, {@code
       * tmobile_usbugi_bankowe}, {@code plus_bank}, {@code etransfer_pocztowy24}, {@code
       * banki_spbdzielcze}, {@code bank_nowy_bfg_sa}, {@code getin_bank}, {@code velobank}, {@code
       * blik}, {@code noble_pay}, {@code ideabank}, {@code envelobank}, {@code
       * santander_przelew24}, {@code nest_przelew}, {@code mbank_mtransfer}, {@code inteligo},
       * {@code pbac_z_ipko}, {@code bnp_paribas}, {@code credit_agricole}, {@code toyota_bank},
       * {@code bank_pekao_sa}, {@code volkswagen_bank}, {@code bank_millennium}, {@code
       * alior_bank}, or {@code boz}.
       */
      @SerializedName("bank")
      String bank;

      /** Unique reference for this Przelewy24 payment. */
      @SerializedName("reference")
      String reference;

      /**
       * Owner's verified full name. Values are verified or provided by Przelewy24 directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       * Przelewy24 rarely provides this information so the attribute is usually empty.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    /**
     * For more details about Payco, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payco extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about Paynow, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paynow extends StripeObject {
      /** Reference number associated with this PayNow payment. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * Owner's email. Values are provided by PayPal directly (if supported) at the time of
       * authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("payer_email")
      String payerEmail;

      /** PayPal account PayerID. This identifier uniquely identifies the PayPal customer. */
      @SerializedName("payer_id")
      String payerId;

      /**
       * Owner's full name. Values provided by PayPal directly (if supported) at the time of
       * authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("payer_name")
      String payerName;

      /**
       * The level of protection offered as defined by PayPal Seller Protection for Merchants, for
       * this transaction.
       */
      @SerializedName("seller_protection")
      SellerProtection sellerProtection;

      /**
       * The shipping address for the customer, as supplied by the merchant at the point of payment
       * execution. This shipping address will not be updated if the merchant updates the shipping
       * address on the PaymentIntent after the PaymentIntent was successfully confirmed.
       */
      @SerializedName("shipping")
      com.stripe.model.Address shipping;

      /** A unique ID generated by PayPal for this transaction. */
      @SerializedName("transaction_id")
      String transactionId;

      /**
       * The shipping address for the customer, as supplied by the merchant at the point of payment
       * execution. This shipping address will not be updated if the merchant updates the shipping
       * address on the PaymentIntent after the PaymentIntent was successfully confirmed.
       */
      @SerializedName("verified_address")
      com.stripe.model.Address verifiedAddress;

      /**
       * Owner's verified email. Values are verified or provided by PayPal directly (if supported)
       * at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_email")
      String verifiedEmail;

      /**
       * Owner's verified full name. Values are verified or provided by PayPal directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /**
       * For more details about SellerProtection, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class SellerProtection extends StripeObject {
        /** An array of conditions that are covered for the transaction, if applicable. */
        @SerializedName("dispute_categories")
        List<String> disputeCategories;

        /**
         * Indicates whether the transaction is eligible for PayPal's seller protection.
         *
         * <p>One of {@code eligible}, {@code not_eligible}, or {@code partially_eligible}.
         */
        @SerializedName("status")
        String status;
      }
    }

    /**
     * For more details about Payto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payto extends StripeObject {
      /** Bank-State-Branch number of the bank account. */
      @SerializedName("bsb_number")
      String bsbNumber;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;

      /** The PayID alias for the bank account. */
      @SerializedName("pay_id")
      String payId;
    }

    /**
     * For more details about Pix, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Pix extends StripeObject {
      /** Unique transaction id generated by BCB. */
      @SerializedName("bank_transaction_id")
      String bankTransactionId;
    }

    /**
     * For more details about Promptpay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Promptpay extends StripeObject {
      /** Bill reference generated by PromptPay. */
      @SerializedName("reference")
      String reference;
    }

    /**
     * For more details about Qris, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Qris extends StripeObject {}

    /**
     * For more details about Rechnung, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rechnung extends StripeObject {}

    /**
     * For more details about RevolutPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {
      @SerializedName("funding")
      Funding funding;

      /**
       * For more details about Funding, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Funding extends StripeObject {
        @SerializedName("card")
        Card card;

        /**
         * funding type of the underlying payment method.
         *
         * <p>Equal to {@code card}.
         */
        @SerializedName("type")
        String type;

        /**
         * For more details about Card, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Card extends StripeObject {
          /**
           * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code eftpos_au},
           * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or
           * {@code unknown}.
           */
          @SerializedName("brand")
          String brand;

          /**
           * Two-letter ISO code representing the country of the card. You could use this attribute
           * to get a sense of the international breakdown of cards you've collected.
           */
          @SerializedName("country")
          String country;

          /** Two-digit number representing the card's expiration month. */
          @SerializedName("exp_month")
          Long expMonth;

          /** Four-digit number representing the card's expiration year. */
          @SerializedName("exp_year")
          Long expYear;

          /**
           * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code
           * unknown}.
           */
          @SerializedName("funding")
          String funding;

          /** The last four digits of the card. */
          @SerializedName("last4")
          String last4;
        }
      }
    }

    /**
     * For more details about SamsungPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SamsungPay extends StripeObject {
      /** A unique identifier for the buyer as determined by the local payment processor. */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about SepaCreditTransfer, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaCreditTransfer extends StripeObject {
      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** IBAN of the bank account to transfer funds to. */
      @SerializedName("iban")
      String iban;
    }

    /**
     * For more details about SepaDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Branch code of bank associated with the bank account. */
      @SerializedName("branch_code")
      String branchCode;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four characters of the IBAN. */
      @SerializedName("last4")
      String last4;

      /**
       * Find the ID of the mandate used for this payment under the <a
       * href="https://stripe.com/docs/api/charges/object#charge_object-payment_method_details-sepa_debit-mandate">payment_method_details.sepa_debit.mandate</a>
       * property on the Charge. Use this mandate ID to <a
       * href="https://stripe.com/docs/api/mandates/retrieve">retrieve the Mandate</a>.
       */
      @SerializedName("mandate")
      String mandate;
    }

    /**
     * For more details about Shopeepay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Shopeepay extends StripeObject {}

    /**
     * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** Two-letter ISO code representing the country the bank account is located in. */
      @SerializedName("country")
      String country;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /** The mandate for the SEPA Direct Debit PaymentMethod which was generated by this Charge. */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the SOFORT authorization page that the customer is redirected to. Can
       * be one of {@code de}, {@code en}, {@code es}, {@code fr}, {@code it}, {@code nl}, or {@code
       * pl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by SOFORT directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about StripeAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAccount extends StripeObject {}

    /**
     * For more details about Swish, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Swish extends StripeObject {
      /**
       * Uniquely identifies the payer's Swish account. You can use this attribute to check whether
       * two Swish transactions were paid for by the same payer
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Payer bank reference number for the payment. */
      @SerializedName("payment_reference")
      String paymentReference;

      /** The last four digits of the Swish account phone number. */
      @SerializedName("verified_phone_last4")
      String verifiedPhoneLast4;
    }

    /**
     * For more details about Twint, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Twint extends StripeObject {}

    /**
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      /**
       * Account holder type: individual or company.
       *
       * <p>One of {@code company}, or {@code individual}.
       */
      @SerializedName("account_holder_type")
      String accountHolderType;

      /**
       * Account type: checkings or savings. Defaults to checking if omitted.
       *
       * <p>One of {@code checking}, or {@code savings}.
       */
      @SerializedName("account_type")
      String accountType;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /**
       * Uniquely identifies this particular bank account. You can use this attribute to check
       * whether two bank accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Last four digits of the bank account number. */
      @SerializedName("last4")
      String last4;

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> mandate;

      /** Reference number to locate ACH payments with customer's bank. */
      @SerializedName("payment_reference")
      String paymentReference;

      /** Routing number of the bank account. */
      @SerializedName("routing_number")
      String routingNumber;

      /** Get ID of expandable {@code mandate} object. */
      public String getMandate() {
        return (this.mandate != null) ? this.mandate.getId() : null;
      }

      public void setMandate(String id) {
        this.mandate = ApiResource.setExpandableFieldId(id, this.mandate);
      }

      /** Get expanded {@code mandate}. */
      public Mandate getMandateObject() {
        return (this.mandate != null) ? this.mandate.getExpanded() : null;
      }

      public void setMandateObject(Mandate expandableObject) {
        this.mandate = new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Wechat, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Wechat extends StripeObject {}

    /**
     * For more details about WechatPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class WechatPay extends StripeObject {
      /**
       * Uniquely identifies this particular WeChat Pay account. You can use this attribute to check
       * whether two WeChat accounts are the same.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Transaction ID of this particular WeChat Pay transaction. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    /**
     * For more details about Zip, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Zip extends StripeObject {}
  }

  /**
   * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
   * Session</a> for more information.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RadarOptions extends StripeObject {
    /**
     * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
     * the browser metadata and device details that help Radar make more accurate predictions on
     * your payments.
     */
    @SerializedName("session")
    String session;
  }

  /**
   * For more details about TransferData, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData extends StripeObject {
    /**
     * The amount transferred to the destination account, if specified. By default, the entire
     * charge amount is transferred to the destination account.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * ID of an existing, connected Stripe account to transfer funds to if {@code transfer_data} was
     * specified in the charge request.
     */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get ID of expandable {@code destination} object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded {@code destination}. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(applicationFee, responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
    trySetResponseGetter(billingDetails, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(failureBalanceTransaction, responseGetter);
    trySetResponseGetter(fraudDetails, responseGetter);
    trySetResponseGetter(invoice, responseGetter);
    trySetResponseGetter(level3, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(outcome, responseGetter);
    trySetResponseGetter(paymentIntent, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(radarOptions, responseGetter);
    trySetResponseGetter(refunds, responseGetter);
    trySetResponseGetter(review, responseGetter);
    trySetResponseGetter(shipping, responseGetter);
    trySetResponseGetter(source, responseGetter);
    trySetResponseGetter(sourceTransfer, responseGetter);
    trySetResponseGetter(transfer, responseGetter);
    trySetResponseGetter(transferData, responseGetter);
  }
}
