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
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much
   * to charge in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
   * (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum
   * amount is $0.50 US or [equivalent in charge
   * currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts). The amount
   * value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

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
   * The application fee (if any) for the charge. [See the Connect
   * documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees) for details.
   */
  @SerializedName("application_fee")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<ApplicationFee> applicationFee;

  /**
   * The amount of the application fee (if any) for the charge. [See the Connect
   * documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees) for details.
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
   * If the charge was created without capturing, this Boolean represents whether it is still
   * uncaptured or has since been captured.
   */
  @SerializedName("captured")
  Boolean captured;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
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
   * ID of an existing, connected Stripe account to transfer funds to if `transfer_data` was
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
   * Error code explaining reason for charge failure if available (see [the errors
   * section](https://stripe.com/docs/api#errors) for a list of codes).
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
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `charge`.
   */
  @SerializedName("object")
  String object;

  /**
   * The account (if any) the charge was made on behalf of without triggering an automatic transfer.
   * See the [Connect documentation](https://stripe.com/docs/connect/charges-transfers) for details.
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
   * Details about whether the payment was accepted, and why. See [understanding
   * declines](https://stripe.com/docs/declines) for details.
   */
  @SerializedName("outcome")
  Outcome outcome;

  /** `true` if the charge succeeded, or was successfully authorized for later capture. */
  @SerializedName("paid")
  Boolean paid;

  /** ID of the PaymentIntent associated with this charge, if one exists. */
  @SerializedName("payment_intent")
  String paymentIntent;

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
   * attribute will be `null` until a receipt has been sent.
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
   * charge, refer to `payment_method` or `payment_method_details` instead.
   */
  @SerializedName("source")
  PaymentSource source;

  /**
   * The transfer ID which created this charge. Only present if the charge came from another Stripe
   * account. [See the Connect documentation](https://stripe.com/docs/connect/destination-charges)
   * for details.
   */
  @SerializedName("source_transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> sourceTransfer;

  /**
   * For card charges, use `statement_descriptor_suffix` instead. Otherwise, you can use this value
   * as the complete description of a charge on your customers’ statements. Must contain at least
   * one letter, maximum 22 characters.
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

  /** The status of the payment is either `succeeded`, `pending`, or `failed`. */
  @SerializedName("status")
  String status;

  /**
   * ID of the transfer to the `destination` account (only applicable if the charge was created
   * using the `destination` parameter).
   */
  @SerializedName("transfer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Transfer> transfer;

  /**
   * An optional dictionary including the account to automatically transfer to as part of a
   * destination charge. [See the Connect
   * documentation](https://stripe.com/docs/connect/destination-charges) for details.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies this transaction as part of a group. See the [Connect
   * documentation](https://stripe.com/docs/connect/charges-transfers#grouping-transactions) for
   * details.
   */
  @SerializedName("transfer_group")
  String transferGroup;

  /** Get id of expandable `application` object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded `application`. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `applicationFee` object. */
  public String getApplicationFee() {
    return (this.applicationFee != null) ? this.applicationFee.getId() : null;
  }

  public void setApplicationFee(String id) {
    this.applicationFee = ApiResource.setExpandableFieldId(id, this.applicationFee);
  }

  /** Get expanded `applicationFee`. */
  public ApplicationFee getApplicationFeeObject() {
    return (this.applicationFee != null) ? this.applicationFee.getExpanded() : null;
  }

  public void setApplicationFeeObject(ApplicationFee expandableObject) {
    this.applicationFee =
        new ExpandableField<ApplicationFee>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `balanceTransaction` object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded `balanceTransaction`. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `destination` object. */
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String id) {
    this.destination = ApiResource.setExpandableFieldId(id, this.destination);
  }

  /** Get expanded `destination`. */
  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account expandableObject) {
    this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `dispute` object. */
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String id) {
    this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
  }

  /** Get expanded `dispute`. */
  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute expandableObject) {
    this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `invoice` object. */
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String id) {
    this.invoice = ApiResource.setExpandableFieldId(id, this.invoice);
  }

  /** Get expanded `invoice`. */
  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice expandableObject) {
    this.invoice = new ExpandableField<Invoice>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `onBehalfOf` object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded `onBehalfOf`. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `order` object. */
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String id) {
    this.order = ApiResource.setExpandableFieldId(id, this.order);
  }

  /** Get expanded `order`. */
  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order expandableObject) {
    this.order = new ExpandableField<Order>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `review` object. */
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String id) {
    this.review = ApiResource.setExpandableFieldId(id, this.review);
  }

  /** Get expanded `review`. */
  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review expandableObject) {
    this.review = new ExpandableField<Review>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `sourceTransfer` object. */
  public String getSourceTransfer() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getId() : null;
  }

  public void setSourceTransfer(String id) {
    this.sourceTransfer = ApiResource.setExpandableFieldId(id, this.sourceTransfer);
  }

  /** Get expanded `sourceTransfer`. */
  public Transfer getSourceTransferObject() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getExpanded() : null;
  }

  public void setSourceTransferObject(Transfer expandableObject) {
    this.sourceTransfer = new ExpandableField<Transfer>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `transfer` object. */
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String id) {
    this.transfer = ApiResource.setExpandableFieldId(id, this.transfer);
  }

  /** Get expanded `transfer`. */
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
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture() throws StripeException {
    return capture((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(RequestOptions options) throws StripeException {
    return capture((Map<String, Object>) null, options);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(Map<String, Object> params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
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
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
   * captured by that point in time, they will be marked as refunded and will no longer be
   * capturable.
   */
  public Charge capture(ChargeCaptureParams params) throws StripeException {
    return capture(params, (RequestOptions) null);
  }

  /**
   * Capture the payment of an existing, uncaptured, charge. This is the second half of the two-step
   * payment flow, where first you <a href="#create_charge">created a charge</a> with the capture
   * option set to false.
   *
   * <p>Uncaptured payments expire exactly seven days after they are created. If they are not
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
    /** Assessments from Stripe. If set, the value is `fraudulent`. */
    @SerializedName("stripe_report")
    String stripeReport;

    /** Assessments reported by you. If set, possible values of are `safe` and `fraudulent`. */
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
     * Possible values are `approved_by_network`, `declined_by_network`, `not_sent_to_network`, and
     * `reversed_after_approval`. The value `reversed_after_approval` indicates the payment was
     * [blocked by Stripe](https://stripe.com/docs/declines#blocked-payments) after bank
     * authorization, and may temporarily appear as "pending" on a cardholder's statement.
     */
    @SerializedName("network_status")
    String networkStatus;

    /**
     * An enumerated value providing a more detailed explanation of the outcome's `type`. Charges
     * blocked by Radar's default block rule have the value `highest_risk_level`. Charges placed in
     * review by Radar's default review rule have the value `elevated_risk_level`. Charges
     * authorized, blocked, or placed in review by custom rules have the value `rule`. See
     * [understanding declines](https://stripe.com/docs/declines) for more details.
     */
    @SerializedName("reason")
    String reason;

    /**
     * Stripe's evaluation of the riskiness of the payment. Possible values for evaluated payments
     * are `normal`, `elevated`, `highest`. For non-card payments, and card-based payments predating
     * the public assignment of risk levels, this field will have the value `not_assessed`. In the
     * event of an error in the evaluation, this field will have the value `unknown`.
     */
    @SerializedName("risk_level")
    String riskLevel;

    /**
     * Stripe's evaluation of the riskiness of the payment. Possible values for evaluated payments
     * are between 0 and 100. For non-card payments, card-based payments predating the public
     * assignment of risk scores, or in the event of an error during evaluation, this field will not
     * be present. This field is only available with Radar for Fraud Teams.
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
     * Possible values are `authorized`, `manual_review`, `issuer_declined`, `blocked`, and
     * `invalid`. See [understanding declines](https://stripe.com/docs/declines) and [Radar
     * reviews](https://stripe.com/docs/radar/reviews) for details.
     */
    @SerializedName("type")
    String type;

    /** Get id of expandable `rule` object. */
    public String getRule() {
      return (this.rule != null) ? this.rule.getId() : null;
    }

    public void setRule(String id) {
      this.rule = ApiResource.setExpandableFieldId(id, this.rule);
    }

    /** Get expanded `rule`. */
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

    @SerializedName("alipay")
    Alipay alipay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("bitcoin")
    Bitcoin bitcoin;

    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("eps")
    Eps eps;

    @SerializedName("giropay")
    Giropay giropay;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("multibanco")
    Multibanco multibanco;

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
     * `ach_credit_transfer`, `ach_debit`, `alipay`, `bancontact`, `card`, `card_present`, `eps`,
     * `giropay`, `ideal`, `klarna`, `multibanco`, `p24`, `sepa_debit`, `sofort`, `stripe_account`,
     * or `wechat`. An additional hash is included on `payment_method_details` with a name matching
     * this value. It contains information specific to the payment method.
     */
    @SerializedName("type")
    String type;

    @SerializedName("wechat")
    Wechat wechat;

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
       * Type of entity that holds the account. This can be either `individual` or `company`.
       *
       * <p>One of `company`, or `individual`.
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
    public static class Alipay extends StripeObject {}

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

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       * Can be one of `en`, `de`, `fr`, or `nl`
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by Bancontact directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bitcoin extends StripeObject {
      @SerializedName("address")
      String address;

      @SerializedName("amount")
      Long amount;

      @SerializedName("amount_charged")
      Long amountCharged;

      @SerializedName("amount_received")
      Long amountReceived;

      @SerializedName("amount_returned")
      Long amountReturned;

      @SerializedName("refund_address")
      String refundAddress;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`,
       * or `unknown`.
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
       * Card description. (Only for internal use only and not typically available in standard API
       * requests.)
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
       * whether two customers who've signed up with you are using the same card number, for
       * example.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`. */
      @SerializedName("funding")
      String funding;

      /**
       * Issuer identification number of the card. (Only for internal use only and not typically
       * available in standard API requests.)
       */
      @SerializedName("iin")
      String iin;

      /**
       * Installment details for this payment (Mexico only).
       *
       * <p>For more information, see the [installments integration
       * guide](https://stripe.com/docs/payments/installments).
       */
      @SerializedName("installments")
      Installments installments;

      /**
       * Issuer bank name of the card. (Only for internal use only and not typically available in
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
       * Identifies which network this charge was processed on. Can be `amex`, `diners`, `discover`,
       * `interac`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`.
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
         * If a address line1 was provided, results of the check, one of `pass`, `fail`,
         * `unavailable`, or `unchecked`.
         */
        @SerializedName("address_line1_check")
        String addressLine1Check;

        /**
         * If a address postal code was provided, results of the check, one of `pass`, `fail`,
         * `unavailable`, or `unchecked`.
         */
        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        /**
         * If a CVC was provided, results of the check, one of `pass`, `fail`, `unavailable`, or
         * `unchecked`.
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
         * Whether or not authentication was performed. 3D Secure will succeed without
         * authentication when the card is not enrolled.
         */
        @SerializedName("authenticated")
        Boolean authenticated;

        /** Whether or not 3D Secure succeeded. */
        @SerializedName("succeeded")
        Boolean succeeded;

        /** The version of 3D Secure that was used for this payment. */
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
         * The type of the card wallet, one of `amex_express_checkout`, `apple_pay`, `google_pay`,
         * `masterpass`, `samsung_pay`, or `visa_checkout`. An additional hash is included on the
         * Wallet subhash with a name matching this value. It contains additional information
         * specific to the card wallet type.
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
      /**
       * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`,
       * or `unknown`.
       */
      @SerializedName("brand")
      String brand;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

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
       * whether two customers who've signed up with you are using the same card number, for
       * example.
       */
      @SerializedName("fingerprint")
      String fingerprint;

      /** Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`. */
      @SerializedName("funding")
      String funding;

      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
      @SerializedName("generated_card")
      String generatedCard;

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /**
       * Identifies which network this charge was processed on. Can be `amex`, `diners`, `discover`,
       * `interac`, `jcb`, `mastercard`, `unionpay`, `visa`, or `unknown`.
       */
      @SerializedName("network")
      String network;

      /**
       * How were card details read in this transaction. Can be contact_emv, contactless_emv,
       * magnetic_stripe_fallback, magnetic_stripe_track2, or contactless_magstripe_mode
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
       * Owner's verified full name. Values are verified or provided by EPS directly (if supported)
       * at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;
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
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of `abn_amro`, `asn_bank`, `bunq`, `handelsbanken`, `ing`,
       * `knab`, `moneyou`, `rabobank`, `regiobank`, `sns_bank`, `triodos_bank`, or `van_lanschot`.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of `ABNANL2A`, `ASNBNL21`, `BUNQNL2A`, `FVLBNL22`, `HANDNL2A`, `INGBNL2A`,
       * `KNABNL2H`, `MOYONL21`, `RABONL2U`, `RBRBNL21`, `SNSBNL2A`, or `TRIONL2U`.
       */
      @SerializedName("bic")
      String bic;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Owner's verified full name. Values are verified or provided by iDEAL directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {}

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
    public static class P24 extends StripeObject {
      /** Unique reference for this Przelewy24 payment. */
      @SerializedName("reference")
      String reference;

      /**
       * Owner's verified full name. Values are verified or provided by Przelewy24 directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
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

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Owner's verified full name. Values are verified or provided by SOFORT directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StripeAccount extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Wechat extends StripeObject {}
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
     * ID of an existing, connected Stripe account to transfer funds to if `transfer_data` was
     * specified in the charge request.
     */
    @SerializedName("destination")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<Account> destination;

    /** Get id of expandable `destination` object. */
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String id) {
      this.destination = ApiResource.setExpandableFieldId(id, this.destination);
    }

    /** Get expanded `destination`. */
    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account expandableObject) {
      this.destination = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
    }
  }
}
