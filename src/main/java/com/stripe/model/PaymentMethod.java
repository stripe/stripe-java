package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethod extends ApiResource implements HasId, MetadataStore<PaymentMethod> {
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
  @Getter(onMethod = @__({@Override}))
  @SerializedName("id")
  String id;

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
  @Getter(onMethod = @__({@Override}))
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /**
   * The type of the PaymentMethod, one of `card` or `card_present`. An additional hash is included
   * on the PaymentMethod with a name matching this value. It contains additional information
   * specific to the PaymentMethod type.
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
    return request(ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(String paymentMethod) throws StripeException {
    return retrieve(paymentMethod, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a PaymentMethod object. */
  public static PaymentMethod retrieve(
      String paymentMethod, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/payment_methods/%s", paymentMethod));
    return request(ApiResource.RequestMethod.GET, url, params, PaymentMethod.class, options);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a PaymentMethod object. A PaymentMethod must be attached a customer to be updated. */
  public PaymentMethod update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/payment_methods/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of PaymentMethods for a given Customer. */
  public static PaymentMethodCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/payment_methods");
    return requestCollection(url, params, PaymentMethodCollection.class, options);
  }

  /** Attaches a PaymentMethod object to a Customer. */
  public PaymentMethod attach(Map<String, Object> params) throws StripeException {
    return attach(params, (RequestOptions) null);
  }

  /** Attaches a PaymentMethod object to a Customer. */
  public PaymentMethod attach(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_methods/%s/attach", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
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
  public PaymentMethod detach(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(), String.format("/v1/payment_methods/%s/detach", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, PaymentMethod.class, options);
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

    /** The last four digits of the card. */
    @SerializedName("last4")
    String last4;

    /** Contains details on how this Card maybe be used for 3D Secure authentication. */
    @SerializedName("three_d_secure_usage")
    ThreeDSecureUsage threeDSecureUsage;

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
    public static class ThreeDSecureUsage extends StripeObject {
      /** 3D Secure is supported on this card. */
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
  public static class CardPresent extends StripeObject {}
}

