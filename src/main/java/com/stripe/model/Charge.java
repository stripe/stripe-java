package com.stripe.model;

import com.google.gson.annotations.SerializedName;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Charge extends ApiResource implements MetadataStore<Charge>, HasId {
  public static final String FRAUD_DETAILS = "fraud_details";

  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long amount;
  Long amountRefunded;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Application> application;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<ApplicationFee> applicationFee;
  Long applicationFeeAmount;
  AlternateStatementDescriptors alternateStatementDescriptors;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      ExpandableField<BalanceTransaction> balanceTransaction;
  PaymentMethod.BillingDetails billingDetails;
  Boolean captured;
  Long created;
  String currency;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Customer> customer;
  String description;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> destination;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Dispute> dispute;
  String failureCode;
  String failureMessage;
  FraudDetails fraudDetails;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Invoice> invoice;
  Level3 level3;
  Boolean livemode;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> onBehalfOf;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Order> order;
  Outcome outcome;
  Boolean paid;
  String paymentMethod;
  PaymentMethodDetails paymentMethodDetails;
  String receiptEmail;
  String receiptNumber;
  String receiptUrl;
  Boolean refunded;
  @Getter(AccessLevel.NONE) ChargeRefundCollection refunds;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Review> review;
  ShippingDetails shipping;
  ExternalAccount source;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> sourceTransfer;
  String statementDescriptor;
  String status;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Transfer> transfer;
  TransferData transferData;
  String transferGroup;

  // Please note that these field are for internal use only and are not typically returned
  // as part of standard API requests.
  String authorizationCode;

  /**
   * The {@code card} attribute.
   *
   * @return the {@code card} attribute
   * @deprecated Prefer using the {@link #source} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2015-02-18">API version 2015-02-18</a>
   */
  @Deprecated
  Card card;

  /**
   * The {@code disputed} attribute.
   *
   * @return the {@code disputed} attribute
   * @deprecated Prefer using the {@link #dispute} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2012-11-07">API version 2012-11-07</a>
   */
  @Deprecated
  Boolean disputed;

  /**
   * The {@code statement_description} attribute.
   *
   * @return the {@code cards} attribute
   * @deprecated Prefer using the {@link #statementDescriptor} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   */
  @Deprecated
  String statementDescription;

  // <editor-fold desc="application">
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String applicationId) {
    this.application = setExpandableFieldId(applicationId, this.application);
  }

  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application c) {
    this.application = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="applicationFee">
  public String getApplicationFee() {
    return (this.applicationFee != null) ? this.applicationFee.getId() : null;
  }

  public void setApplicationFee(String applicationFeeId) {
    this.applicationFee = setExpandableFieldId(applicationFeeId, this.applicationFee);
  }

  public ApplicationFee getApplicationFeeObject() {
    return (this.applicationFee != null) ? this.applicationFee.getExpanded() : null;
  }

  public void setApplicationFeeObject(ApplicationFee c) {
    this.applicationFee = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="balanceTransaction">
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionId) {
    this.balanceTransaction = setExpandableFieldId(balanceTransactionId, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="customer">
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String customerId) {
    this.customer = setExpandableFieldId(customerId, this.customer);

  }

  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer c) {
    this.customer = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="destination">
  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String destinationId) {
    this.destination = ApiResource.setExpandableFieldId(destinationId, this.destination);
  }

  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account c) {
    this.destination = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="dispute">
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String disputeId) {
    this.dispute = setExpandableFieldId(disputeId, this.dispute);
  }

  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute dispute) {
    this.dispute = new ExpandableField<>(dispute.getId(), dispute);
  }
  // </editor-fold>

  // <editor-fold desc="invoice">
  public String getInvoice() {
    return (this.invoice != null) ? this.invoice.getId() : null;
  }

  public void setInvoice(String invoiceId) {
    this.invoice = setExpandableFieldId(invoiceId, this.invoice);
  }

  public Invoice getInvoiceObject() {
    return (this.invoice != null) ? this.invoice.getExpanded() : null;
  }

  public void setInvoiceObject(Invoice c) {
    this.invoice = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="onBehalfOf">
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String onBehalfOfId) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(onBehalfOfId, this.onBehalfOf);
  }

  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account c) {
    this.onBehalfOf = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="order">
  public String getOrder() {
    return (this.order != null) ? this.order.getId() : null;
  }

  public void setOrder(String orderId) {
    this.order = setExpandableFieldId(orderId, this.order);
  }

  public Order getOrderObject() {
    return (this.order != null) ? this.order.getExpanded() : null;
  }

  public void setOrderObject(Order c) {
    this.order = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  /**
   * Returns the {@code refunds} list.
   *
   * @return the {@code refunds} list
   */
  public ChargeRefundCollection getRefunds() {
    // API versions 2014-05-19 and earlier render charge refunds as an array
    // instead of an object, meaning there is no sublist URL.
    if (refunds != null && refunds.getUrl() == null) {
      refunds.setUrl(String.format("/v1/charges/%s/refunds", getId()));
    }
    return refunds;
  }

  // <editor-fold desc="review">
  public String getReview() {
    return (this.review != null) ? this.review.getId() : null;
  }

  public void setReview(String reviewId) {
    this.review = setExpandableFieldId(reviewId, this.review);
  }

  public Review getReviewObject() {
    return (this.review != null) ? this.review.getExpanded() : null;
  }

  public void setReviewObject(Review r) {
    this.review = new ExpandableField<>(r.getId(), r);
  }
  // </editor-fold>

  // <editor-fold desc="sourceTransfer">
  public String getSourceTransfer() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getId() : null;
  }

  public void setSourceTransfer(String sourceTransferId) {
    this.sourceTransfer = setExpandableFieldId(sourceTransferId, this.sourceTransfer);
  }

  public Transfer getSourceTransferObject() {
    return (this.sourceTransfer != null) ? this.sourceTransfer.getExpanded() : null;
  }

  public void setSourceTransferObject(Transfer c) {
    this.sourceTransfer = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="transfer">
  public String getTransfer() {
    return (this.transfer != null) ? this.transfer.getId() : null;
  }

  public void setTransfer(String transferId) {
    this.transfer = setExpandableFieldId(transferId, this.transfer);
  }

  public Transfer getTransferObject() {
    return (this.transfer != null) ? this.transfer.getExpanded() : null;
  }

  public void setTransferObject(Transfer c) {
    this.transfer = new ExpandableField<>(c.getId(), c);
  }
  // </editor-fold>

  // <editor-fold desc="capture">
  /**
   * Capture a charge.
   */
  public Charge capture() throws StripeException {
    return this.capture(null, (RequestOptions) null);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(RequestOptions options) throws StripeException {
    return this.capture(null, options);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(Map<String, Object> params) throws StripeException {
    return this.capture(params, (RequestOptions) null);
  }

  /**
   * Capture a charge.
   */
  public Charge capture(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, String.format("%s/capture",
        instanceUrl(Charge.class, this.getId())), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="create">
  /**
   * Create a charge.
   */
  public static Charge create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a charge.
   */
  public static Charge create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, classUrl(Charge.class), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all charges.
   */
  public static ChargeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all charges.
   */
  public static ChargeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(Charge.class), params, ChargeCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="markFraudulent">
  /**
   * Mark the charge as fraudulent.
   */
  public Charge markFraudulent(RequestOptions options) throws StripeException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "fraudulent"));
    return this.update(params, options);
  }
  // </editor-fold>

  // <editor-fold desc="markSafe">
  /**
   * Mark the charge as safe.
   */
  public Charge markSafe(RequestOptions options) throws StripeException {
    Map<String, Object> params = Collections.<String, Object>singletonMap(
        FRAUD_DETAILS, Collections.singletonMap(FraudDetails.USER_REPORT, "safe"));
    return this.update(params, options);
  }
  // </editor-fold>

  // <editor-fold desc="refund">
  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} method instead.
   */
  @Deprecated
  public Charge refund() throws StripeException {
    return this.refund(null, (RequestOptions) null);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public Charge refund(RequestOptions options) throws StripeException {
    return this.refund(null, options);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map)} method instead.
   */
  @Deprecated
  public Charge refund(Map<String, Object> params) throws StripeException {
    return this.refund(params, (RequestOptions) null);
  }

  /**
   * Refund the charge.
   *
   * @deprecated Prefer using the {@link Refund#create(Map, RequestOptions)} method instead.
   */
  @Deprecated
  public Charge refund(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, String.format("%s/refund",
        instanceUrl(Charge.class, this.getId())), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a charge.
   */
  public static Charge retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Charge.class, id), params, Charge.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a charge.
   */
  @Override
  public Charge update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a charge.
   */
  @Override
  public Charge update(Map<String, Object> params, RequestOptions options) throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Charge.class, id), params, Charge.class,
        options);
  }
  // </editor-fold>

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AlternateStatementDescriptors extends StripeObject {
    String kana;
    String kanji;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudDetails extends StripeObject {
    public static final String USER_REPORT = "user_report";

    String userReport;
    String stripeReport;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Level3 extends StripeObject {
    String customerReference;
    List<LineItem> lineItems;
    String merchantReference;
    String shippingAddressZip;
    String shippingFromZip;
    Long shippingAmount;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class LineItem extends StripeObject {
      Long discountAmount;
      String productCode;
      String productDescription;
      Long quantity;
      Long taxAmount;
      Long unitCost;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Outcome extends ApiResource {
    String networkStatus;
    String reason;
    String riskLevel;
    Long riskScore;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Rule> rule;
    String sellerMessage;
    String type;

    // <editor-fold desc="rule">
    /**
     * Returns the {@code rule} object, if expanded. If not expanded, use {@link #getRuleId()} to
     * get the ID.
     *
     * @return the {@code rule} ID
     * @deprecated In recent API versions, this attribute is no longer automatically expanded.
     *     Prefer using the {@link #getRuleId()} and {@link #getRuleObject()} methods instead.
     * @see <a href="https://stripe.com/docs/upgrades#2017-02-14">API version 2017-02-14</a>
     */
    @Deprecated
    public Rule getRule() {
      return (this.rule != null) ? this.rule.getExpanded() : null;
    }

    @Deprecated
    public void setRule(Rule rule) {
      this.rule = new ExpandableField<>(rule.getId(), rule);
    }

    public String getRuleId() {
      return (this.rule != null) ? this.rule.getId() : null;
    }

    public void setRuleId(String ruleId) {
      this.rule = setExpandableFieldId(ruleId, this.rule);
    }

    public Rule getRuleObject() {
      return (this.rule != null) ? this.rule.getExpanded() : null;
    }

    public void setRuleObject(Rule rule) {
      this.rule = new ExpandableField<>(rule.getId(), rule);
    }
    // </editor-fold>

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rule extends StripeObject implements HasId {
      @Getter(onMethod = @__({@Override})) String id;
      String action;
      String predicate;
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

    @SerializedName("alipay")
    Alipay alipay;

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

    @SerializedName("multibanco")
    Multibanco multibanco;

    @SerializedName("p24")
    P24 p24;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("sofort")
    Sofort sofort;

    @SerializedName("stripe_account")
    StripeAccount stripeAccount;

    @SerializedName("type")
    String type;

    @SerializedName("wechat")
    Wechat wechat;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchCreditTransfer extends StripeObject {
      @SerializedName("account_number")
      String accountNumber;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("routing_number")
      String routingNumber;

      @SerializedName("swift_code")
      String swiftCode;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AchDebit extends StripeObject {
      @SerializedName("account_holder_type")
      String accountHolderType;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("country")
      String country;

      @SerializedName("fingerprint")
      String fingerprint;

      @SerializedName("last4")
      String last4;

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
    public static class Bancontact extends StripeObject {
      @SerializedName("bank_code")
      String bankCode;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("bic")
      String bic;

      @SerializedName("iban_last4")
      String ibanLast4;

      @SerializedName("preferred_language")
      String preferredLanguage;

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
      @SerializedName("brand")
      String brand;

      @SerializedName("checks")
      Checks checks;

      @SerializedName("country")
      String country;

      @SerializedName("exp_month")
      Long expMonth;

      @SerializedName("exp_year")
      Long expYear;

      @SerializedName("fingerprint")
      String fingerprint;

      @SerializedName("funding")
      String funding;

      @SerializedName("last4")
      String last4;

      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      /** If this Card is part of a Card Wallet, this contains the details of the Card Wallet. */
      @SerializedName("wallet")
      Wallet wallet;

      // Please note that these field are for internal use only and are not typically returned
      // as part of standard API requests.
      @SerializedName("description")
      String description;

      @SerializedName("iin")
      String iin;

      @SerializedName("issuer")
      String issuer;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Checks extends StripeObject {
        @SerializedName("address_line1_check")
        String addressLine1Check;

        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        @SerializedName("cvc_check")
        String cvcCheck;
      }

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure extends StripeObject {}

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
          @SerializedName("billing_address")
          Address billingAddress;

          @SerializedName("email")
          String email;

          @SerializedName("name")
          String name;

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
          @SerializedName("billing_address")
          Address billingAddress;

          @SerializedName("email")
          String email;

          @SerializedName("name")
          String name;

          @SerializedName("shipping_address")
          Address shippingAddress;
        }
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      @SerializedName("brand")
      String brand;

      @SerializedName("country")
      String country;

      @SerializedName("emv_auth_data")
      String emvAuthData;

      @SerializedName("exp_month")
      Long expMonth;

      @SerializedName("exp_year")
      Long expYear;

      @SerializedName("fingerprint")
      String fingerprint;

      @SerializedName("funding")
      String funding;

      @SerializedName("generated_card")
      String generatedCard;

      @SerializedName("last4")
      String last4;

      @SerializedName("read_method")
      String readMethod;

      @SerializedName("receipt")
      Receipt receipt;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Receipt extends StripeObject {
        @SerializedName("application_cryptogram")
        String applicationCryptogram;

        @SerializedName("application_preferred_name")
        String applicationPreferredName;

        @SerializedName("authorization_code")
        String authorizationCode;

        @SerializedName("authorization_response_code")
        String authorizationResponseCode;

        @SerializedName("cardholder_verification_method")
        String cardholderVerificationMethod;

        @SerializedName("dedicated_file_name")
        String dedicatedFileName;

        @SerializedName("terminal_verification_results")
        String terminalVerificationResults;

        @SerializedName("transaction_status_information")
        String transactionStatusInformation;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Eps extends StripeObject {
      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Giropay extends StripeObject {
      @SerializedName("bank_code")
      String bankCode;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("bic")
      String bic;

      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      @SerializedName("bank")
      String bank;

      @SerializedName("bic")
      String bic;

      @SerializedName("iban_last4")
      String ibanLast4;

      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Multibanco extends StripeObject {
      @SerializedName("entity")
      String entity;

      @SerializedName("reference")
      String reference;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class P24 extends StripeObject {
      @SerializedName("reference")
      String reference;

      @SerializedName("verified_name")
      String verifiedName;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      @SerializedName("bank_code")
      String bankCode;

      @SerializedName("branch_code")
      String branchCode;

      @SerializedName("country")
      String country;

      @SerializedName("fingerprint")
      String fingerprint;

      @SerializedName("last4")
      String last4;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
      @SerializedName("bank_code")
      String bankCode;

      @SerializedName("bank_name")
      String bankName;

      @SerializedName("bic")
      String bic;

      @SerializedName("country")
      String country;

      @SerializedName("iban_last4")
      String ibanLast4;

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
    Long amount;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE) ExpandableField<Account> destination;

    // <editor-fold desc="destination">
    public String getDestination() {
      return (this.destination != null) ? this.destination.getId() : null;
    }

    public void setDestination(String destinationId) {
      this.destination = setExpandableFieldId(destinationId, this.destination);

    }

    public Account getDestinationObject() {
      return (this.destination != null) ? this.destination.getExpanded() : null;
    }

    public void setDestinationObject(Account c) {
      this.destination = new ExpandableField<>(c.getId(), c);
    }
    // </editor-fold>
  }
}
