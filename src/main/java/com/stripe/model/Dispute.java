// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.DisputeCloseParams;
import com.stripe.param.DisputeListParams;
import com.stripe.param.DisputeRetrieveParams;
import com.stripe.param.DisputeUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A dispute occurs when a customer questions your charge with their card issuer. When this happens,
 * you're given the opportunity to respond to the dispute with evidence that shows that the charge
 * is legitimate. You can find more information about the dispute process in our <a
 * href="https://stripe.com/docs/disputes">Disputes and Fraud</a> documentation.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/disputes">Disputes and fraud</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Dispute extends ApiResource
    implements MetadataStore<Dispute>, BalanceTransactionSource {
  /**
   * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency
   * fluctuation or because only part of the order is disputed).
   */
  @SerializedName("amount")
  Long amount;

  /**
   * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your
   * Stripe account as a result of this dispute.
   */
  @SerializedName("balance_transactions")
  List<BalanceTransaction> balanceTransactions;

  /** ID of the charge that was disputed. */
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

  @SerializedName("evidence")
  Evidence evidence;

  @SerializedName("evidence_details")
  EvidenceDetails evidenceDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If true, it is still possible to refund the disputed payment. Once the payment has been fully
   * refunded, no further funds will be withdrawn from your Stripe account as a result of this
   * dispute.
   */
  @SerializedName("is_charge_refundable")
  Boolean isChargeRefundable;

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

  /** Network-dependent reason code for the dispute. */
  @SerializedName("network_reason_code")
  String networkReasonCode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code dispute}.
   */
  @SerializedName("object")
  String object;

  /** ID of the PaymentIntent that was disputed. */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /**
   * Reason given by cardholder for dispute. Possible values are {@code bank_cannot_process}, {@code
   * check_returned}, {@code credit_not_processed}, {@code customer_initiated}, {@code
   * debit_not_authorized}, {@code duplicate}, {@code fraudulent}, {@code general}, {@code
   * incorrect_account_details}, {@code insufficient_funds}, {@code product_not_received}, {@code
   * product_unacceptable}, {@code subscription_canceled}, or {@code unrecognized}. Read more about
   * <a href="https://stripe.com/docs/disputes/categories">dispute reasons</a>.
   */
  @SerializedName("reason")
  String reason;

  /**
   * Current status of dispute. Possible values are {@code warning_needs_response}, {@code
   * warning_under_review}, {@code warning_closed}, {@code needs_response}, {@code under_review},
   * {@code charge_refunded}, {@code won}, or {@code lost}.
   *
   * <p>One of {@code charge_refunded}, {@code lost}, {@code needs_response}, {@code under_review},
   * {@code warning_closed}, {@code warning_needs_response}, {@code warning_under_review}, or {@code
   * won}.
   */
  @SerializedName("status")
  String status;

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

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close() throws StripeException {
    return close((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(RequestOptions options) throws StripeException {
    return close((Map<String, Object>) null, options);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(Map<String, Object> params) throws StripeException {
    return close(params, (RequestOptions) null);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/disputes/%s/close", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Dispute.class,
            options,
            ApiMode.V1);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(DisputeCloseParams params) throws StripeException {
    return close(params, (RequestOptions) null);
  }

  /**
   * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
   * essentially dismissing the dispute, acknowledging it as lost.
   *
   * <p>The status of the dispute will change from {@code needs_response} to {@code lost}.
   * <em>Closing a dispute is irreversible</em>.
   */
  public Dispute close(DisputeCloseParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/disputes/%s/close", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Dispute.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/disputes";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            DisputeCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of your disputes. */
  public static DisputeCollection list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/disputes";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            DisputeCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute, RequestOptions options) throws StripeException {
    return retrieve(dispute, (Map<String, Object>) null, options);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(String dispute, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(dispute));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Dispute.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the dispute with the given ID. */
  public static Dispute retrieve(
      String dispute, DisputeRetrieveParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(dispute));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Dispute.class,
            options,
            ApiMode.V1);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  @Override
  public Dispute update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  @Override
  public Dispute update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Dispute.class,
            options,
            ApiMode.V1);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(DisputeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * When you get a dispute, contacting your customer is always the best first step. If that doesn’t
   * work, you can submit evidence to help us resolve the dispute in your favor. You can do this in
   * your <a href="https://dashboard.stripe.com/disputes">dashboard</a>, but if you prefer, you can
   * use the API to submit evidence programmatically.
   *
   * <p>Depending on your dispute type, different evidence fields will give you a better chance of
   * winning your dispute. To figure out which evidence fields to provide, see our <a
   * href="https://stripe.com/docs/disputes/categories">guide to dispute types</a>.
   */
  public Dispute update(DisputeUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/disputes/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Dispute.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Evidence extends StripeObject {
    /**
     * Any server or activity logs showing proof that the customer accessed or downloaded the
     * purchased digital product. This information should include IP addresses, corresponding
     * timestamps, and any detailed recorded activity.
     */
    @SerializedName("access_activity_log")
    String accessActivityLog;

    /** The billing address provided by the customer. */
    @SerializedName("billing_address")
    String billingAddress;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your
     * subscription cancellation policy, as shown to the customer.
     */
    @SerializedName("cancellation_policy")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> cancellationPolicy;

    /**
     * An explanation of how and when the customer was shown your refund policy prior to purchase.
     */
    @SerializedName("cancellation_policy_disclosure")
    String cancellationPolicyDisclosure;

    /** A justification for why the customer's subscription was not canceled. */
    @SerializedName("cancellation_rebuttal")
    String cancellationRebuttal;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any
     * communication with the customer that you feel is relevant to your case. Examples include
     * emails proving that the customer received the product or service, or demonstrating their use
     * of or satisfaction with the product or service.
     */
    @SerializedName("customer_communication")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> customerCommunication;

    /** The email address of the customer. */
    @SerializedName("customer_email_address")
    String customerEmailAddress;

    /** The name of the customer. */
    @SerializedName("customer_name")
    String customerName;

    /** The IP address that the customer used when making the purchase. */
    @SerializedName("customer_purchase_ip")
    String customerPurchaseIp;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) A relevant
     * document or contract showing the customer's signature.
     */
    @SerializedName("customer_signature")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> customerSignature;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * for the prior charge that can uniquely identify the charge, such as a receipt, shipping
     * label, work order, etc. This document should be paired with a similar document from the
     * disputed payment that proves the two payments are separate.
     */
    @SerializedName("duplicate_charge_documentation")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> duplicateChargeDocumentation;

    /**
     * An explanation of the difference between the disputed charge versus the prior charge that
     * appears to be a duplicate.
     */
    @SerializedName("duplicate_charge_explanation")
    String duplicateChargeExplanation;

    /**
     * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
     */
    @SerializedName("duplicate_charge_id")
    String duplicateChargeId;

    /** A description of the product or service that was sold. */
    @SerializedName("product_description")
    String productDescription;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any receipt or
     * message sent to the customer notifying them of the charge.
     */
    @SerializedName("receipt")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> receipt;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Your refund
     * policy, as shown to the customer.
     */
    @SerializedName("refund_policy")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> refundPolicy;

    /**
     * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
     */
    @SerializedName("refund_policy_disclosure")
    String refundPolicyDisclosure;

    /** A justification for why the customer is not entitled to a refund. */
    @SerializedName("refund_refusal_explanation")
    String refundRefusalExplanation;

    /**
     * The date on which the customer received or began receiving the purchased service, in a clear
     * human-readable format.
     */
    @SerializedName("service_date")
    String serviceDate;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * showing proof that a service was provided to the customer. This could include a copy of a
     * signed contract, work order, or other form of written agreement.
     */
    @SerializedName("service_documentation")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> serviceDocumentation;

    /**
     * The address to which a physical product was shipped. You should try to include as complete
     * address information as possible.
     */
    @SerializedName("shipping_address")
    String shippingAddress;

    /**
     * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If
     * multiple carriers were used for this purchase, please separate them with commas.
     */
    @SerializedName("shipping_carrier")
    String shippingCarrier;

    /**
     * The date on which a physical product began its route to the shipping address, in a clear
     * human-readable format.
     */
    @SerializedName("shipping_date")
    String shippingDate;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Documentation
     * showing proof that a product was shipped to the customer at the same address the customer
     * provided to you. This could include a copy of the shipment receipt, shipping label, etc. It
     * should show the customer's full shipping address, if possible.
     */
    @SerializedName("shipping_documentation")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> shippingDocumentation;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("shipping_tracking_number")
    String shippingTrackingNumber;

    /**
     * (ID of a <a href="https://stripe.com/docs/guides/file-upload">file upload</a>) Any additional
     * evidence or statements.
     */
    @SerializedName("uncategorized_file")
    @Getter(lombok.AccessLevel.NONE)
    @Setter(lombok.AccessLevel.NONE)
    ExpandableField<File> uncategorizedFile;

    /** Any additional evidence or statements. */
    @SerializedName("uncategorized_text")
    String uncategorizedText;

    /** Get ID of expandable {@code cancellationPolicy} object. */
    public String getCancellationPolicy() {
      return (this.cancellationPolicy != null) ? this.cancellationPolicy.getId() : null;
    }

    public void setCancellationPolicy(String id) {
      this.cancellationPolicy = ApiResource.setExpandableFieldId(id, this.cancellationPolicy);
    }

    /** Get expanded {@code cancellationPolicy}. */
    public File getCancellationPolicyObject() {
      return (this.cancellationPolicy != null) ? this.cancellationPolicy.getExpanded() : null;
    }

    public void setCancellationPolicyObject(File expandableObject) {
      this.cancellationPolicy =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code customerCommunication} object. */
    public String getCustomerCommunication() {
      return (this.customerCommunication != null) ? this.customerCommunication.getId() : null;
    }

    public void setCustomerCommunication(String id) {
      this.customerCommunication = ApiResource.setExpandableFieldId(id, this.customerCommunication);
    }

    /** Get expanded {@code customerCommunication}. */
    public File getCustomerCommunicationObject() {
      return (this.customerCommunication != null) ? this.customerCommunication.getExpanded() : null;
    }

    public void setCustomerCommunicationObject(File expandableObject) {
      this.customerCommunication =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code customerSignature} object. */
    public String getCustomerSignature() {
      return (this.customerSignature != null) ? this.customerSignature.getId() : null;
    }

    public void setCustomerSignature(String id) {
      this.customerSignature = ApiResource.setExpandableFieldId(id, this.customerSignature);
    }

    /** Get expanded {@code customerSignature}. */
    public File getCustomerSignatureObject() {
      return (this.customerSignature != null) ? this.customerSignature.getExpanded() : null;
    }

    public void setCustomerSignatureObject(File expandableObject) {
      this.customerSignature =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code duplicateChargeDocumentation} object. */
    public String getDuplicateChargeDocumentation() {
      return (this.duplicateChargeDocumentation != null)
          ? this.duplicateChargeDocumentation.getId()
          : null;
    }

    public void setDuplicateChargeDocumentation(String id) {
      this.duplicateChargeDocumentation =
          ApiResource.setExpandableFieldId(id, this.duplicateChargeDocumentation);
    }

    /** Get expanded {@code duplicateChargeDocumentation}. */
    public File getDuplicateChargeDocumentationObject() {
      return (this.duplicateChargeDocumentation != null)
          ? this.duplicateChargeDocumentation.getExpanded()
          : null;
    }

    public void setDuplicateChargeDocumentationObject(File expandableObject) {
      this.duplicateChargeDocumentation =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code receipt} object. */
    public String getReceipt() {
      return (this.receipt != null) ? this.receipt.getId() : null;
    }

    public void setReceipt(String id) {
      this.receipt = ApiResource.setExpandableFieldId(id, this.receipt);
    }

    /** Get expanded {@code receipt}. */
    public File getReceiptObject() {
      return (this.receipt != null) ? this.receipt.getExpanded() : null;
    }

    public void setReceiptObject(File expandableObject) {
      this.receipt = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code refundPolicy} object. */
    public String getRefundPolicy() {
      return (this.refundPolicy != null) ? this.refundPolicy.getId() : null;
    }

    public void setRefundPolicy(String id) {
      this.refundPolicy = ApiResource.setExpandableFieldId(id, this.refundPolicy);
    }

    /** Get expanded {@code refundPolicy}. */
    public File getRefundPolicyObject() {
      return (this.refundPolicy != null) ? this.refundPolicy.getExpanded() : null;
    }

    public void setRefundPolicyObject(File expandableObject) {
      this.refundPolicy = new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code serviceDocumentation} object. */
    public String getServiceDocumentation() {
      return (this.serviceDocumentation != null) ? this.serviceDocumentation.getId() : null;
    }

    public void setServiceDocumentation(String id) {
      this.serviceDocumentation = ApiResource.setExpandableFieldId(id, this.serviceDocumentation);
    }

    /** Get expanded {@code serviceDocumentation}. */
    public File getServiceDocumentationObject() {
      return (this.serviceDocumentation != null) ? this.serviceDocumentation.getExpanded() : null;
    }

    public void setServiceDocumentationObject(File expandableObject) {
      this.serviceDocumentation =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code shippingDocumentation} object. */
    public String getShippingDocumentation() {
      return (this.shippingDocumentation != null) ? this.shippingDocumentation.getId() : null;
    }

    public void setShippingDocumentation(String id) {
      this.shippingDocumentation = ApiResource.setExpandableFieldId(id, this.shippingDocumentation);
    }

    /** Get expanded {@code shippingDocumentation}. */
    public File getShippingDocumentationObject() {
      return (this.shippingDocumentation != null) ? this.shippingDocumentation.getExpanded() : null;
    }

    public void setShippingDocumentationObject(File expandableObject) {
      this.shippingDocumentation =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }

    /** Get ID of expandable {@code uncategorizedFile} object. */
    public String getUncategorizedFile() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getId() : null;
    }

    public void setUncategorizedFile(String id) {
      this.uncategorizedFile = ApiResource.setExpandableFieldId(id, this.uncategorizedFile);
    }

    /** Get expanded {@code uncategorizedFile}. */
    public File getUncategorizedFileObject() {
      return (this.uncategorizedFile != null) ? this.uncategorizedFile.getExpanded() : null;
    }

    public void setUncategorizedFileObject(File expandableObject) {
      this.uncategorizedFile =
          new ExpandableField<File>(expandableObject.getId(), expandableObject);
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class EvidenceDetails extends StripeObject {
    /**
     * Date by which evidence must be submitted in order to successfully challenge dispute. Will be
     * 0 if the customer's bank or credit card company doesn't allow a response for this particular
     * dispute.
     */
    @SerializedName("due_by")
    Long dueBy;

    /** Whether evidence has been staged for this dispute. */
    @SerializedName("has_evidence")
    Boolean hasEvidence;

    /**
     * Whether the last evidence submission was submitted past the due date. Defaults to {@code
     * false} if no evidence submissions have occurred. If {@code true}, then delivery of the latest
     * evidence is <em>not</em> guaranteed.
     */
    @SerializedName("past_due")
    Boolean pastDue;

    /**
     * The number of times evidence has been submitted. Typically, you may only submit evidence
     * once.
     */
    @SerializedName("submission_count")
    Long submissionCount;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(charge, responseGetter);
    trySetResponseGetter(evidence, responseGetter);
    trySetResponseGetter(evidenceDetails, responseGetter);
    trySetResponseGetter(paymentIntent, responseGetter);
  }
}
