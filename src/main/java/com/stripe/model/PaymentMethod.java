// File generated from our OpenAPI spec
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
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethod extends ApiResource implements HasId, MetadataStore<PaymentMethod> {
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

  @SerializedName("billing_details")
  BillingDetails billingDetails;

  @SerializedName("boleto")
  Boleto boleto;

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

  @SerializedName("eps")
  Eps eps;

  @SerializedName("fpx")
  Fpx fpx;

  @SerializedName("giropay")
  Giropay giropay;

  @SerializedName("grabpay")
  Grabpay grabpay;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("ideal")
  Ideal ideal;

  @SerializedName("interac_present")
  InteracPresent interacPresent;

  @SerializedName("klarna")
  Klarna klarna;

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
   * <p>Equal to {@code payment_method}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("oxxo")
  Oxxo oxxo;

  @SerializedName("p24")
  P24 p24;

  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  @SerializedName("sofort")
  Sofort sofort;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   *
   * <p>One of {@code acss_debit}, {@code afterpay_clearpay}, {@code alipay}, {@code au_becs_debit},
   * {@code bacs_debit}, {@code bancontact}, {@code boleto}, {@code card}, {@code card_present},
   * {@code eps}, {@code fpx}, {@code giropay}, {@code grabpay}, {@code ideal}, {@code
   * interac_present}, {@code klarna}, {@code oxxo}, {@code p24}, {@code sepa_debit}, {@code
   * sofort}, or {@code wechat_pay}.
   */
  @SerializedName("type")
  String type;

  @SerializedName("wechat_pay")
  WechatPay wechatPay;

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

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public static PaymentMethod create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public static PaymentMethod create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
   */
  public static PaymentMethod create(PaymentMethodCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a PaymentMethod object. Read the <a
   * href="https://stripe.com/docs/stripe-js/reference#stripe-create-payment-method">Stripe.js
   * reference</a> to learn how to create PaymentMethods via Stripe.js.
   *
   * <p>Instead of creating a PaymentMethod directly, we recommend using the <a
   * href="https://stripe.com/docs/payments/accept-a-payment">PaymentIntents</a> API to accept a
   * payment immediately or the <a
   * href="https://stripe.com/docs/payments/save-and-reuse">SetupIntent</a> API to collect payment
   * method details ahead of a future payment.
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

  /**
   * Returns a list of PaymentMethods. For listing a customer’s payment methods, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a>
   */
  public static PaymentMethodCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of PaymentMethods. For listing a customer’s payment methods, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a>
   */
  public static PaymentMethodCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /**
   * Returns a list of PaymentMethods. For listing a customer’s payment methods, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a>
   */
  public static PaymentMethodCollection list(PaymentMethodListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of PaymentMethods. For listing a customer’s payment methods, you should use <a
   * href="https://stripe.com/docs/api/payment_methods/customer_list">List a Customer’s
   * PaymentMethods</a>
   */
  public static PaymentMethodCollection list(PaymentMethodListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return ApiResource.requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to ensure that the PaymentMethod can be used
   * in a future payment. Using the <code>/v1/payment_methods/:id/attach</code> endpoint does not
   * ensure that future payments can be made with the attached PaymentMethod. See <a
   * href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(Map<String, Object> params) throws StripeException {
    return attach(params, (RequestOptions) null);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to ensure that the PaymentMethod can be used
   * in a future payment. Using the <code>/v1/payment_methods/:id/attach</code> endpoint does not
   * ensure that future payments can be made with the attached PaymentMethod. See <a
   * href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
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
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to ensure that the PaymentMethod can be used
   * in a future payment. Using the <code>/v1/payment_methods/:id/attach</code> endpoint does not
   * ensure that future payments can be made with the attached PaymentMethod. See <a
   * href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
   * <code>invoice_settings.default_payment_method</code></a>, on the Customer to the
   * PaymentMethod’s ID.
   */
  public PaymentMethod attach(PaymentMethodAttachParams params) throws StripeException {
    return attach(params, (RequestOptions) null);
  }

  /**
   * Attaches a PaymentMethod object to a Customer.
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="https://stripe.com/docs/api/setup_intents">SetupIntent</a> or a PaymentIntent with <a
   * href="https://stripe.com/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to ensure that the PaymentMethod can be used
   * in a future payment. Using the <code>/v1/payment_methods/:id/attach</code> endpoint does not
   * ensure that future payments can be made with the attached PaymentMethod. See <a
   * href="https://stripe.com/docs/payments/payment-intents#future-usage">Optimizing cards for
   * future payments</a> for more information about setting up future payments.
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments, set <a
   * href="https://stripe.com/docs/api/customers/update#update_customer-invoice_settings-default_payment_method">
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
  public static class AcssDebit extends StripeObject {
    /** Name of the bank associated with the bank account. */
    @SerializedName("bank_name")
    String bankName;

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether
     * two bank accounts are the same.
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /** Institution number of the bank account. */
    @SerializedName("institution_number")
    String institutionNumber;

    /** Last four digits of the bank account number. */
    @SerializedName("last4")
    String last4;

    /** Transit number of the bank account. */
    @SerializedName("transit_number")
    String transitNumber;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterpayClearpay extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Alipay extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    /** Six-digit number identifying bank and branch associated with this bank account. */
    @SerializedName("bsb_number")
    String bsbNumber;

    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether
     * two bank accounts are the same.
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /** Last four digits of the bank account number. */
    @SerializedName("last4")
    String last4;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BacsDebit extends StripeObject {
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether
     * two bank accounts are the same.
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /** Last four digits of the bank account number. */
    @SerializedName("last4")
    String last4;

    /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
    @SerializedName("sort_code")
    String sortCode;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Bancontact extends StripeObject {}

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
  public static class Boleto extends StripeObject {
    /** Uniquely identifies the customer tax id (CNPJ or CPF). */
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
     * Uniquely identifies this particular card number. You can use this attribute to check whether
     * two customers who’ve signed up with you are using the same card number, for example. For
     * payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized number
     * might be provided instead of the underlying card number.
     *
     * <p><em>Starting May 1, 2021, card fingerprint in India for Connect will change to allow two
     * fingerprints for the same card --- one for India and one for the rest of the world.</em>
     */
    @SerializedName("fingerprint")
    String fingerprint;

    /**
     * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code unknown}.
     */
    @SerializedName("funding")
    String funding;

    /**
     * Issuer identification number of the card. (For internal use only and not typically available
     * in standard API requests.)
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

    /** Contains information about card networks that can be used to process the payment. */
    @SerializedName("networks")
    Networks networks;

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
    public static class Networks extends StripeObject {
      /** All available networks for the card. */
      @SerializedName("available")
      List<String> available;

      /** The preferred network for the card. */
      @SerializedName("preferred")
      String preferred;
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
  public static class Eps extends StripeObject {
    /**
     * The customer's bank. Should be one of {@code arzte_und_apotheker_bank}, {@code
     * austrian_anadi_bank_ag}, {@code bank_austria}, {@code bankhaus_carl_spangler}, {@code
     * bankhaus_schelhammer_und_schattera_ag}, {@code bawag_psk_ag}, {@code bks_bank_ag}, {@code
     * brull_kallmus_bank_ag}, {@code btv_vier_lander_bank}, {@code capital_bank_grawe_gruppe_ag},
     * {@code dolomitenbank}, {@code easybank_ag}, {@code erste_bank_und_sparkassen}, {@code
     * hypo_alpeadriabank_international_ag}, {@code hypo_noe_lb_fur_niederosterreich_u_wien}, {@code
     * hypo_oberosterreich_salzburg_steiermark}, {@code hypo_tirol_bank_ag}, {@code
     * hypo_vorarlberg_bank_ag}, {@code hypo_bank_burgenland_aktiengesellschaft}, {@code
     * marchfelder_bank}, {@code oberbank_ag}, {@code raiffeisen_bankengruppe_osterreich}, {@code
     * schoellerbank_ag}, {@code sparda_bank_wien}, {@code volksbank_gruppe}, {@code
     * volkskreditbank_ag}, or {@code vr_bank_braunau}.
     */
    @SerializedName("bank")
    String bank;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fpx extends StripeObject {
    /** Account holder type, if provided. Can be one of {@code individual} or {@code company}. */
    @SerializedName("account_holder_type")
    String accountHolderType;

    /**
     * The customer's bank, if provided. Can be one of {@code affin_bank}, {@code agrobank}, {@code
     * alliance_bank}, {@code ambank}, {@code bank_islam}, {@code bank_muamalat}, {@code
     * bank_rakyat}, {@code bsn}, {@code cimb}, {@code hong_leong_bank}, {@code hsbc}, {@code kfh},
     * {@code maybank2u}, {@code ocbc}, {@code public_bank}, {@code rhb}, {@code
     * standard_chartered}, {@code uob}, {@code deutsche_bank}, {@code maybank2e}, or {@code
     * pb_enterprise}.
     */
    @SerializedName("bank")
    String bank;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Giropay extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Grabpay extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    /**
     * The customer's bank, if provided. Can be one of {@code abn_amro}, {@code asn_bank}, {@code
     * bunq}, {@code handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code rabobank},
     * {@code regiobank}, {@code revolut}, {@code sns_bank}, {@code triodos_bank}, or {@code
     * van_lanschot}.
     */
    @SerializedName("bank")
    String bank;

    /**
     * The Bank Identifier Code of the customer's bank, if the bank was provided.
     *
     * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BUNQNL2A}, {@code FVLBNL22}, {@code
     * HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code MOYONL21}, {@code RABONL2U}, {@code
     * RBRBNL21}, {@code REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
     */
    @SerializedName("bic")
    String bic;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class InteracPresent extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Klarna extends StripeObject {
    /** The customer's date of birth, if provided. */
    @SerializedName("dob")
    DateOfBirth dob;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DateOfBirth extends StripeObject {
      /** The day of birth, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /** The month of birth, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year of birth. */
      @SerializedName("year")
      Long year;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Oxxo extends StripeObject {}

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class P24 extends StripeObject {
    /**
     * The customer's bank, if provided.
     *
     * <p>One of {@code alior_bank}, {@code bank_millennium}, {@code bank_nowy_bfg_sa}, {@code
     * bank_pekao_sa}, {@code banki_spbdzielcze}, {@code blik}, {@code bnp_paribas}, {@code boz},
     * {@code citi_handlowy}, {@code credit_agricole}, {@code envelobank}, {@code
     * etransfer_pocztowy24}, {@code getin_bank}, {@code ideabank}, {@code ing}, {@code inteligo},
     * {@code mbank_mtransfer}, {@code nest_przelew}, {@code noble_pay}, {@code pbac_z_ipko}, {@code
     * plus_bank}, {@code santander_przelew24}, {@code tmobile_usbugi_bankowe}, {@code toyota_bank},
     * or {@code volkswagen_bank}.
     */
    @SerializedName("bank")
    String bank;
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

    /** Information about the object that generated this PaymentMethod. */
    @SerializedName("generated_from")
    GeneratedFrom generatedFrom;

    /** Last four characters of the IBAN. */
    @SerializedName("last4")
    String last4;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class GeneratedFrom extends StripeObject {
      /** The ID of the Charge that generated this PaymentMethod, if any. */
      @SerializedName("charge")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Charge> charge;

      /** The ID of the SetupAttempt that generated this PaymentMethod, if any. */
      @SerializedName("setup_attempt")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<SetupAttempt> setupAttempt;

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

      /** Get ID of expandable {@code setupAttempt} object. */
      public String getSetupAttempt() {
        return (this.setupAttempt != null) ? this.setupAttempt.getId() : null;
      }

      public void setSetupAttempt(String id) {
        this.setupAttempt = ApiResource.setExpandableFieldId(id, this.setupAttempt);
      }

      /** Get expanded {@code setupAttempt}. */
      public SetupAttempt getSetupAttemptObject() {
        return (this.setupAttempt != null) ? this.setupAttempt.getExpanded() : null;
      }

      public void setSetupAttemptObject(SetupAttempt expandableObject) {
        this.setupAttempt =
            new ExpandableField<SetupAttempt>(expandableObject.getId(), expandableObject);
      }
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Sofort extends StripeObject {
    /** Two-letter ISO code representing the country the bank account is located in. */
    @SerializedName("country")
    String country;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WechatPay extends StripeObject {}
}
