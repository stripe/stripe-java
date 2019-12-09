package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PaymentMethodAttachParams;
import com.stripe.param.PaymentMethodCreateParams;
import com.stripe.param.PaymentMethodDetachParams;
import com.stripe.param.PaymentMethodListParams;
import com.stripe.param.PaymentMethodRetrieveParams;
import com.stripe.param.PaymentMethodUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethod extends ApiResource implements HasId, MetadataStore<PaymentMethod> {
  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  @SerializedName("billing_details")
  BillingDetails billingDetails;

  @SerializedName("card")
  Card card;

  @SerializedName("card_present")
  CardPresent cardPresent;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the
   * PaymentMethod has not been saved to a Customer.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("ideal")
  Ideal ideal;

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
   * <p>Equal to `payment_method`.
   */
  @SerializedName("object")
  String object;

  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   *
   * <p>One of `au_becs_debit`, `card`, `card_present`, `ideal`, or `sepa_debit`.
   */
  @SerializedName("type")
  String type;

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

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js reference</a> to learn
   * how to create PaymentMethods via Stripe.js.
   */
  public static PaymentMethod create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js reference</a> to learn
   * how to create PaymentMethods via Stripe.js.
   */
  public static PaymentMethod create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js reference</a> to learn
   * how to create PaymentMethods via Stripe.js.
   */
  public static PaymentMethod create(PaymentMethodCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js reference</a> to learn
   * how to create PaymentMethods via Stripe.js.
   */
  public static PaymentMethod create(PaymentMethodCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(String paymentMethod) throws StripeException {
    return retrieve(paymentMethod, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(String paymentMethod, RequestOptions options)
      throws StripeException {
    return retrieve(paymentMethod, (Map<String, Object>) null, options);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(
      String paymentMethod, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(paymentMethod)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentMethod.class, options);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(
      String paymentMethod, PaymentMethodRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(paymentMethod)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentMethod.class, options);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  @Override
  public PaymentMethod update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  @Override
  public PaymentMethod update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(PaymentMethodUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(PaymentMethodUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(PaymentMethodListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(PaymentMethodListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(Map<String, Object> params) throws StripeException {
    return attach(params, (RequestOptions) null);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s/attach", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(PaymentMethodAttachParams params) throws StripeException {
    return attach(params, (RequestOptions) null);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(PaymentMethodAttachParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s/attach", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach() throws StripeException {
    return detach((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach(RequestOptions options) throws StripeException {
    return detach((Map<String, Object>) null, options);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach(Map<String, Object> params) throws StripeException {
    return detach(params, (RequestOptions) null);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s/detach", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach(PaymentMethodDetachParams params) throws StripeException {
    return detach(params, (RequestOptions) null);
  }

  /** Detaches a PaymentMethod object from a Customer. */
  public PaymentMethod detach(PaymentMethodDetachParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/payment_methods/%s/detach", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    @SerializedName("bsb_number")
    String bsbNumber;

    @SerializedName("fingerprint")
    String fingerprint;

    @SerializedName("last4")
    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingDetails extends StripeObject {
    /** Billing address. */
    @SerializedName("address")
    Address address;

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

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    /**
     * Card brand. Can be `amex`, `diners`, `discover`, `jcb`, `mastercard`, `unionpay`, `visa`, or
     * `unknown`.
     */
    @SerializedName("brand")
    String brand;

    /** Checks on Card address and CVC if provided. */
    @SerializedName("checks")
    Checks checks;

    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get
     * a sense of the international breakdown of cards you've collected.
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
     * Uniquely identifies this particular card number. You can use this attribute to check whether
     * two customers who've signed up with you are using the same card number, for example.
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
     * Issuer bank name of the card. (Only for internal use only and not typically available in
     * standard API requests.)
     */
    @SerializedName("issuer")
    String issuer;

    /** The last four digits of the card. */
    @SerializedName("last4")
    String last4;

    /** Contains details on how this Card maybe be used for 3D Secure authentication. */
    @SerializedName("three_d_secure_usage")
    ThreeDSecureUsage threeDSecureUsage;

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
    public static class ThreeDSecureUsage extends StripeObject {
      /** Whether 3D Secure is supported on this card. */
      @SerializedName("supported")
      Boolean supported;
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
       * Wallet subhash with a name matching this value. It contains additional information specific
       * to the card wallet type.
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
         * Owner's verified billing address. Values are verified or provided by the wallet directly
         * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
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
         * Owner's verified shipping address. Values are verified or provided by the wallet directly
         * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
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
         * Owner's verified billing address. Values are verified or provided by the wallet directly
         * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
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
         * Owner's verified shipping address. Values are verified or provided by the wallet directly
         * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
         */
        @SerializedName("shipping_address")
        Address shippingAddress;
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CardPresent extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    /**
     * The customer's bank, if provided. Can be one of `abn_amro`, `asn_bank`, `bunq`,
     * `handelsbanken`, `ing`, `knab`, `moneyou`, `rabobank`, `regiobank`, `sns_bank`,
     * `triodos_bank`, or `van_lanschot`.
     */
    @SerializedName("bank")
    String bank;

    /**
     * The Bank Identifier Code of the customer's bank, if the bank was provided.
     *
     * <p>One of `ABNANL2A`, `ASNBNL21`, `BUNQNL2A`, `FVLBNL22`, `HANDNL2A`, `INGBNL2A`, `KNABNL2H`,
     * `MOYONL21`, `RABONL2U`, `RBRBNL21`, `SNSBNL2A`, or `TRIONL2U`.
     */
    @SerializedName("bic")
    String bic;
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
     * Uniquely identifies this particular bank account. You can use this attribute to check whether
     * two bank accounts are the same.
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /** Last four characters of the IBAN. */
    @SerializedName("last4")
    String last4;
  }
}
