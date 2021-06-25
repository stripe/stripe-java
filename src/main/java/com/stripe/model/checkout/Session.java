// File generated from our OpenAPI spec
package com.stripe.model.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.LineItem;
import com.stripe.model.LineItemCollection;
import com.stripe.model.PaymentIntent;
import com.stripe.model.SetupIntent;
import com.stripe.model.ShippingDetails;
import com.stripe.model.StripeObject;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionListLineItemsParams;
import com.stripe.param.checkout.SessionListParams;
import com.stripe.param.checkout.SessionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {
  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /** Total of all items before discounts or taxes are applied. */
  @SerializedName("amount_subtotal")
  Long amountSubtotal;

  /** Total of all items after discounts and taxes are applied. */
  @SerializedName("amount_total")
  Long amountTotal;

  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /**
   * Describes whether Checkout should collect the customer's billing address.
   *
   * <p>One of {@code auto}, or {@code required}.
   */
  @SerializedName("billing_address_collection")
  String billingAddressCollection;

  /**
   * The URL the customer will be directed to if they decide to cancel payment and return to your
   * website.
   */
  @SerializedName("cancel_url")
  String cancelUrl;

  /**
   * A unique string to reference the Checkout Session. This can be a customer ID, a cart ID, or
   * similar, and can be used to reconcile the Session with your internal systems.
   */
  @SerializedName("client_reference_id")
  String clientReferenceId;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of the customer for this Session. For Checkout Sessions in {@code payment} or {@code
   * subscription} mode, Checkout will create a new customer object based on information provided
   * during the payment flow unless an existing customer was provided when the Session was created.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * The customer details including the customer's tax exempt status and the customer's tax IDs.
   * Only present on Sessions in {@code payment} or {@code subscription} mode.
   */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * If provided, this value will be used when the Customer object is created. If not provided,
   * customers will be asked to enter their email address. Use this parameter to prefill customer
   * data if you already have an email on file. To access information about the customer once the
   * payment flow is complete, use the {@code customer} attribute.
   */
  @SerializedName("customer_email")
  String customerEmail;

  /** Unique identifier for the object. Used to pass to {@code redirectToCheckout} in Stripe.js. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The line items purchased by the customer. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * The IETF language tag of the locale Checkout is displayed in. If blank or {@code auto}, the
   * browser's locale is used.
   *
   * <p>One of {@code auto}, {@code bg}, {@code cs}, {@code da}, {@code de}, {@code el}, {@code en},
   * {@code en-GB}, {@code es}, {@code es-419}, {@code et}, {@code fi}, {@code fr}, {@code fr-CA},
   * {@code hu}, {@code id}, {@code it}, {@code ja}, {@code lt}, {@code lv}, {@code ms}, {@code mt},
   * {@code nb}, {@code nl}, {@code pl}, {@code pt}, {@code pt-BR}, {@code ro}, {@code ru}, {@code
   * sk}, {@code sl}, {@code sv}, {@code th}, {@code tr}, {@code zh}, {@code zh-HK}, or {@code
   * zh-TW}.
   */
  @SerializedName("locale")
  String locale;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The mode of the Checkout Session.
   *
   * <p>One of {@code payment}, {@code setup}, or {@code subscription}.
   */
  @SerializedName("mode")
  String mode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code checkout.session}.
   */
  @SerializedName("object")
  String object;

  /** The ID of the PaymentIntent for Checkout Sessions in {@code payment} mode. */
  @SerializedName("payment_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentIntent> paymentIntent;

  /**
   * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this
   * CheckoutSession.
   */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * The payment status of the Checkout Session, one of {@code paid}, {@code unpaid}, or {@code
   * no_payment_required}. You can use this value to decide when to fulfill your customer's order.
   */
  @SerializedName("payment_status")
  String paymentStatus;

  /** The ID of the SetupIntent for Checkout Sessions in {@code setup} mode. */
  @SerializedName("setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> setupIntent;

  /** Shipping information for this Checkout Session. */
  @SerializedName("shipping")
  ShippingDetails shipping;

  /**
   * When set, provides configuration for Checkout to collect a shipping address from a customer.
   */
  @SerializedName("shipping_address_collection")
  ShippingAddressCollection shippingAddressCollection;

  /**
   * Describes the type of transaction being performed by Checkout in order to customize relevant
   * text on the page, such as the submit button. {@code submit_type} can only be specified on
   * Checkout Sessions in {@code payment} mode, but not Checkout Sessions in {@code subscription} or
   * {@code setup} mode.
   *
   * <p>One of {@code auto}, {@code book}, {@code donate}, or {@code pay}.
   */
  @SerializedName("submit_type")
  String submitType;

  /** The ID of the subscription for Checkout Sessions in {@code subscription} mode. */
  @SerializedName("subscription")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Subscription> subscription;

  /**
   * The URL the customer will be directed to after the payment or subscription creation is
   * successful.
   */
  @SerializedName("success_url")
  String successUrl;

  @SerializedName("tax_id_collection")
  TaxIDCollection taxIdCollection;

  /** Tax and discount details for the computed total amount. */
  @SerializedName("total_details")
  TotalDetails totalDetails;

  /** The URL to the Checkout Session. */
  @SerializedName("url")
  String url;

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

  /** Get ID of expandable {@code setupIntent} object. */
  public String getSetupIntent() {
    return (this.setupIntent != null) ? this.setupIntent.getId() : null;
  }

  public void setSetupIntent(String id) {
    this.setupIntent = ApiResource.setExpandableFieldId(id, this.setupIntent);
  }

  /** Get expanded {@code setupIntent}. */
  public SetupIntent getSetupIntentObject() {
    return (this.setupIntent != null) ? this.setupIntent.getExpanded() : null;
  }

  public void setSetupIntentObject(SetupIntent expandableObject) {
    this.setupIntent = new ExpandableField<SetupIntent>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code subscription} object. */
  public String getSubscription() {
    return (this.subscription != null) ? this.subscription.getId() : null;
  }

  public void setSubscription(String id) {
    this.subscription = ApiResource.setExpandableFieldId(id, this.subscription);
  }

  /** Get expanded {@code subscription}. */
  public Subscription getSubscriptionObject() {
    return (this.subscription != null) ? this.subscription.getExpanded() : null;
  }

  public void setSubscriptionObject(Subscription expandableObject) {
    this.subscription =
        new ExpandableField<Subscription>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.requestCollection(url, params, SessionCollection.class, options);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Checkout Sessions. */
  public static SessionCollection list(SessionListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.requestCollection(url, params, SessionCollection.class, options);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session, RequestOptions options) throws StripeException {
    return retrieve(session, (Map<String, Object>) null, options);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(String session, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Session.class, options);
  }

  /** Retrieves a Session object. */
  public static Session retrieve(
      String session, SessionRetrieveParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/checkout/sessions/%s", ApiResource.urlEncodeId(session)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Session.class, options);
  }

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
  public static Session create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
  }

  /** Creates a Session object. */
  public static Session create(SessionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Session object. */
  public static Session create(SessionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/checkout/sessions");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Session.class, options);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(Map<String, Object> params) throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId())));

    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(SessionListLineItemsParams params)
      throws StripeException {
    return listLineItems(params, (RequestOptions) null);
  }

  /** Returns a list of Line Items */
  public LineItemCollection listLineItems(SessionListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/checkout/sessions/%s/line_items", ApiResource.urlEncodeId(this.getId())));

    return ApiResource.requestCollection(url, params, LineItemCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticTax extends StripeObject {
    /** Indicates whether automatic tax is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * The status of the most recent automated tax calculation for this session.
     *
     * <p>One of {@code complete}, {@code failed}, or {@code requires_location_inputs}.
     */
    @SerializedName("status")
    String status;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The customer’s email at time of checkout. */
    @SerializedName("email")
    String email;

    /**
     * The customer’s tax exempt status at time of checkout.
     *
     * <p>One of {@code exempt}, {@code none}, or {@code reverse}.
     */
    @SerializedName("tax_exempt")
    String taxExempt;

    /** The customer’s tax IDs at time of checkout. */
    @SerializedName("tax_ids")
    List<Session.CustomerDetails.TaxID> taxIds;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxID extends StripeObject {
      /**
       * The type of the tax ID, one of {@code eu_vat}, {@code br_cnpj}, {@code br_cpf}, {@code
       * gb_vat}, {@code nz_gst}, {@code au_abn}, {@code in_gst}, {@code no_vat}, {@code za_vat},
       * {@code ch_vat}, {@code mx_rfc}, {@code sg_uen}, {@code ru_inn}, {@code ru_kpp}, {@code
       * ca_bn}, {@code hk_br}, {@code es_cif}, {@code tw_vat}, {@code th_vat}, {@code jp_cn},
       * {@code jp_rn}, {@code li_uid}, {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code
       * ca_qst}, {@code ca_gst_hst}, {@code ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk},
       * {@code my_sst}, {@code sg_gst}, {@code ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code
       * id_npwp}, {@code my_frp}, {@code il_vat}, or {@code unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /**
       * Currency supported by the bank account. Returned when the Session is in {@code setup} mode.
       *
       * <p>One of {@code cad}, or {@code usd}.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /** A URL for custom mandate text. */
        @SerializedName("custom_mandate_url")
        String customMandateUrl;

        /**
         * Description of the interval. Only required if 'payment_schedule' parmeter is 'interval'
         * or 'combined'.
         */
        @SerializedName("interval_description")
        String intervalDescription;

        /**
         * Payment schedule for the mandate.
         *
         * <p>One of {@code combined}, {@code interval}, or {@code sporadic}.
         */
        @SerializedName("payment_schedule")
        String paymentSchedule;

        /**
         * Transaction type of the mandate.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("transaction_type")
        String transactionType;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingAddressCollection extends StripeObject {
    /**
     * An array of two-letter ISO country codes representing which countries Checkout should provide
     * as options for shipping locations. Unsupported country codes: {@code AS, CX, CC, CU, HM, IR,
     * KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<String> allowedCountries;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TaxIDCollection extends StripeObject {
    /** Indicates whether tax ID collection is enabled for the session. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class TotalDetails extends StripeObject {
    /** This is the sum of all the line item discounts. */
    @SerializedName("amount_discount")
    Long amountDiscount;

    /** This is the sum of all the line item shipping amounts. */
    @SerializedName("amount_shipping")
    Long amountShipping;

    /** This is the sum of all the line item tax amounts. */
    @SerializedName("amount_tax")
    Long amountTax;

    @SerializedName("breakdown")
    Breakdown breakdown;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Breakdown extends StripeObject {
      /** The aggregated line item discounts. */
      @SerializedName("discounts")
      List<LineItem.Discount> discounts;

      /** The aggregated line item tax amounts by rate. */
      @SerializedName("taxes")
      List<LineItem.Tax> taxes;
    }
  }
}
