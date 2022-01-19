// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.radar.Rule;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ChargeCaptureParams;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeRetrieveParams;
import com.stripe.param.ChargeUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Charge extends ApiResource implements MetadataStore<Charge>, BalanceTransactionSource {
  @SerializedName("alternate_statement_descriptors")
  AlternateStatementDescriptors alternateStatementDescriptors;

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
   * Amount in %s captured (can be less than the amount attribute on the charge if a partial capture
   * was made).
   */
  @SerializedName("amount_captured")
  Long amountCaptured;

  /**
   * Amount in %s refunded (can be less than the amount attribute on the charge if a partial refund
   * was issued).
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
   * href="https://stripe.com/docs/connect/direct-charges#collecting-fees">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("application_fee")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ApplicationFee> applicationFee;

  /**
   * The amount of the application fee (if any) requested for the charge. <a
   * href="https://stripe.com/docs/connect/direct-charges#collecting-fees">See the Connect
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
  PaymentMethod.BillingDetails billingDetails;

  /**
   * The full statement descriptor that is passed to card networks, and that is displayed on your
   * customers' credit card and bank statements. Allows you to see what the statement descriptor
   * looks like after the static and dynamic portions are combined.
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

  /**
   * ID of an existing, connected Stripe account to transfer funds to if {@code transfer_data} was
   * specified in the charge request.
   */
  @SerializedName("destination")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> destination;

  /** Details about the dispute if the charge has been disputed. */
  @SerializedName("dispute")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Dispute> dispute;

  /** Whether the charge has been disputed. */
  @SerializedName("disputed")
  Boolean disputed;

  /**
   * Error code explaining reason for charge failure if available (see <a
   * href="https://stripe.com/docs/api#errors">the errors section</a> for a list of codes).
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
   * See the <a href="https://stripe.com/docs/connect/charges-transfers">Connect documentation</a>
   * for details.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** ID of the order this charge is for if one exists. */
  @SerializedName("order")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Order> order;

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
   * account. <a href="https://stripe.com/docs/connect/destination-charges">See the Connect
   * documentation</a> for details.
   */
  @SerializedName("source_transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> sourceTransfer;

  /**
   * For card charges, use {@code statement_descriptor_suffix} instead. Otherwise, you can use this
   * value as the complete description of a charge on your customers’ statements. Must contain at
   * least one letter, maximum 22 characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about the charge that customers see on their statements. Concatenated with
   * the prefix (shortened descriptor) or statement descriptor that’s set on the account to form the
   * complete statement descriptor. Maximum 22 characters for the concatenated descriptor.
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
   * href="https://stripe.com/docs/connect/charges-transfers#transfer-options">Connect
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

  /** Get ID of expandable {@code dispute} object. */
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String id) {
    this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
  }

  /** Get expanded {@code dispute}. */
  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute expandableObject) {
    this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code order} object. */
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String id) {
    this.order = ApiResource.setExpandableFieldId(id, this.order);
  }

  /** Get expanded {@code order}. */
  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order expandableObject) {
    this.order = new ExpandableField<Order>(expandableObject.getId(), expandableObject);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/charges");
    return ApiResource.requestCollection(url, params, ChargeCollection.class, options);
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
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/charges");
    return ApiResource.requestCollection(url, params, ChargeCollection.class, options);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   */
  public static Charge create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   */
  public static Charge create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/charges");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   */
  public static Charge create(ChargeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To charge a credit card or other payment source, you create a <code>Charge</code> object. If
   * your API key is in test mode, the supplied payment source (e.g., card) won’t actually be
   * charged, although everything else will occur as if in live mode. (Stripe assumes that the
   * charge would have completed successfully).
   */
  public static Charge create(ChargeCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/charges");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Charge.class, options);
  }

  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public static Charge retrieve(String charge, ChargeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/charges/%s", ApiResource.urlEncodeId(charge)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Charge.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/charges/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/charges/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture() throws StripeException {
    return capture((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(RequestOptions options) throws StripeException {
    return capture((Map<String, Object>) null, options);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(Map<String, Object> params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(ChargeCaptureParams params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="https://stripe.com/docs/api#create_charge">created a
   * charge</a> with the capture option set to false.
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a
   * href="https://stripe.com/docs/charges/placing-a-hold">7 by default</a>). If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(ChargeCaptureParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Charge.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AlternateStatementDescriptors extends StripeObject {
    /** The Kana variation of the descriptor. */
    @SerializedName("kana")
    String kana;

    /** The Kanji variation of the descriptor. */
    @SerializedName("kanji")
    String kanji;
  }

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Outcome extends StripeObject {
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
  }

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

    @SerializedName("afterpay_clearpay")
    AfterpayClearpay afterpayClearpay;

    @SerializedName("alipay")
    Alipay alipay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("boleto")
    Boleto boleto;

    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("eps")
    Eps eps;

    @SerializedName("fpx")
    Fpx fpx;

    @SerializedName("giropay")
    Giropay giropay;

    @SerializedName("grabpay")
    Grabpay grabpay;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("interac_present")
    InteracPresent interacPresent;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("oxxo")
    Oxxo oxxo;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("sepa_credit_transfer")
    SepaCreditTransfer sepaCreditTransfer;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("stripe_account")
    StripeAccount stripeAccount;

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

    @SerializedName("wechat")
    Wechat wechat;

    @SerializedName("wechat_pay")
    WechatPay wechatPay;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AfterpayClearpay extends StripeObject {
      /** Order identifier shown to the merchant in Afterpay’s online portal. */
      @SerializedName("reference")
      String reference;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code jcb}, {@code
       * mastercard}, {@code unionpay}, {@code visa}, or {@code unknown}.
       */
      @SerializedName("brand")
      String brand;

      /** Check results by Card networks on Card address and CVC at time of payment. */
      @SerializedName("checks")
      Checks checks;

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
       * <p><em>Starting May 1, 2021, card fingerprint in India for Connect will change to allow two
       * fingerprints for the same card --- one for India and one for the rest of the world.</em>
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

      /** True if this payment was marked as MOTO and out of scope for SCA. */
      @SerializedName("moto")
      Boolean moto;

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code interac}, {@code jcb}, {@code
       * mastercard}, {@code unionpay}, {@code visa}, or {@code unknown}.
       */
      @SerializedName("network")
      String network;

      /** Populated if this transaction used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      /** If this Card is part of a card wallet, this contains the details of the card wallet. */
      @SerializedName("wallet")
      Wallet wallet;

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

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Installments extends StripeObject {
        /** Installment plan selected for the payment. */
        @SerializedName("plan")
        PaymentIntent.PaymentMethodOptions.Card.Installments.Plan plan;
      }

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
         * Indicates the outcome of 3D Secure authentication.
         *
         * <p>One of {@code attempt_acknowledged}, {@code authenticated}, {@code failed}, {@code
         * not_supported}, or {@code processing_error}.
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
         * The version of 3D Secure that was used.
         *
         * <p>One of {@code 1.0.2}, {@code 2.1.0}, or {@code 2.2.0}.
         */
        @SerializedName("version")
        String version;
      }

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

        @SerializedName("masterpass")
        Masterpass masterpass;

        @SerializedName("samsung_pay")
        SamsungPay samsungPay;

        /**
         * The type of the card wallet, one of {@code amex_express_checkout}, {@code apple_pay},
         * {@code google_pay}, {@code masterpass}, {@code samsung_pay}, or {@code visa_checkout}. An
         * additional hash is included on the Wallet subhash with a name matching this value. It
         * contains additional information specific to the card wallet type.
         */
        @SerializedName("type")
        String type;

        @SerializedName("visa_checkout")
        VisaCheckout visaCheckout;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmexExpressCheckout extends StripeObject {}

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplePay extends StripeObject {}

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GooglePay extends StripeObject {}

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
          Address billingAddress;

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
          Address shippingAddress;
        }

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPay extends StripeObject {}

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
          Address billingAddress;

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
          Address shippingAddress;
        }
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      /** The authorized amount. */
      @SerializedName("amount_authorized")
      Long amountAuthorized;

      /**
       * Card brand. Can be {@code amex}, {@code diners}, {@code discover}, {@code jcb}, {@code
       * mastercard}, {@code unionpay}, {@code visa}, or {@code unknown}.
       */
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
       * <p><em>Starting May 1, 2021, card fingerprint in India for Connect will change to allow two
       * fingerprints for the same card --- one for India and one for the rest of the world.</em>
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
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code interac}, {@code jcb}, {@code
       * mastercard}, {@code unionpay}, {@code visa}, or {@code unknown}.
       */
      @SerializedName("network")
      String network;

      /** Defines whether the authorized amount can be over-captured or not. */
      @SerializedName("overcapture_supported")
      Boolean overcaptureSupported;

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

        /** How the cardholder verified ownership of the card. */
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
      /**
       * The customer's bank. Should be one of {@code arzte_und_apotheker_bank}, {@code
       * austrian_anadi_bank_ag}, {@code bank_austria}, {@code bankhaus_carl_spangler}, {@code
       * bankhaus_schelhammer_und_schattera_ag}, {@code bawag_psk_ag}, {@code bks_bank_ag}, {@code
       * brull_kallmus_bank_ag}, {@code btv_vier_lander_bank}, {@code capital_bank_grawe_gruppe_ag},
       * {@code dolomitenbank}, {@code easybank_ag}, {@code erste_bank_und_sparkassen}, {@code
       * hypo_alpeadriabank_international_ag}, {@code hypo_noe_lb_fur_niederosterreich_u_wien},
       * {@code hypo_oberosterreich_salzburg_steiermark}, {@code hypo_tirol_bank_ag}, {@code
       * hypo_vorarlberg_bank_ag}, {@code hypo_bank_burgenland_aktiengesellschaft}, {@code
       * marchfelder_bank}, {@code oberbank_ag}, {@code raiffeisen_bankengruppe_osterreich}, {@code
       * schoellerbank_ag}, {@code sparda_bank_wien}, {@code volksbank_gruppe}, {@code
       * volkskreditbank_ag}, or {@code vr_bank_braunau}.
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
       * standard_chartered}, {@code uob}, {@code deutsche_bank}, {@code maybank2e}, or {@code
       * pb_enterprise}.
       */
      @SerializedName("bank")
      String bank;

      /** Unique transaction id generated by FPX for every request from the merchant. */
      @SerializedName("transaction_id")
      String transactionId;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Grabpay extends StripeObject {
      /** Unique transaction id generated by GrabPay. */
      @SerializedName("transaction_id")
      String transactionId;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code abn_amro}, {@code asn_bank}, {@code bunq}, {@code
       * handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code rabobank}, {@code
       * regiobank}, {@code revolut}, {@code sns_bank}, {@code triodos_bank}, or {@code
       * van_lanschot}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BUNQNL2A}, {@code FVLBNL22}, {@code
       * HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code MOYONL21}, {@code RABONL2U}, {@code
       * RBRBNL21}, {@code REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
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
       * <p><em>Starting May 1, 2021, card fingerprint in India for Connect will change to allow two
       * fingerprints for the same card --- one for India and one for the rest of the world.</em>
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
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code interac}, {@code jcb}, {@code
       * mastercard}, {@code unionpay}, {@code visa}, or {@code unknown}.
       */
      @SerializedName("network")
      String network;

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

        /** How the cardholder verified ownership of the card. */
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
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
       * en-SE}, {@code en-US}, {@code es-US}, {@code fr-FR}, or {@code en-FR}
       */
      @SerializedName("preferred_locale")
      String preferredLocale;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Oxxo extends StripeObject {
      /** OXXO reference number. */
      @SerializedName("number")
      String number;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code ing}, {@code citi_handlowy}, {@code
       * tmobile_usbugi_bankowe}, {@code plus_bank}, {@code etransfer_pocztowy24}, {@code
       * banki_spbdzielcze}, {@code bank_nowy_bfg_sa}, {@code getin_bank}, {@code blik}, {@code
       * noble_pay}, {@code ideabank}, {@code envelobank}, {@code santander_przelew24}, {@code
       * nest_przelew}, {@code mbank_mtransfer}, {@code inteligo}, {@code pbac_z_ipko}, {@code
       * bnp_paribas}, {@code credit_agricole}, {@code toyota_bank}, {@code bank_pekao_sa}, {@code
       * volkswagen_bank}, {@code bank_millennium}, {@code alior_bank}, or {@code boz}.
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

      /** ID of the mandate used to make this payment. */
      @SerializedName("mandate")
      String mandate;
    }

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAccount extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Wechat extends StripeObject {}

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
  }

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
}
