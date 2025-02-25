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
import com.stripe.param.PaymentAttemptRecordListParams;
import com.stripe.param.PaymentAttemptRecordRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Payment Attempt Record represents an individual attempt at making a payment, on or off Stripe.
 * Each payment attempt tries to collect a fixed amount of money from a fixed customer and payment
 * method. Payment Attempt Records are attached to Payment Records. Only one attempt per Payment
 * Record can have guaranteed funds.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentAttemptRecord extends ApiResource implements HasId {
  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_canceled")
  AmountCanceled amountCanceled;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_failed")
  AmountFailed amountFailed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_guaranteed")
  AmountGuaranteed amountGuaranteed;

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @SerializedName("amount_requested")
  AmountRequested amountRequested;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Customer information for this payment. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * Indicates whether the customer was present in your checkout flow during this payment.
   *
   * <p>One of {@code off_session}, or {@code on_session}.
   */
  @SerializedName("customer_presence")
  String customerPresence;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

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
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_attempt_record}.
   */
  @SerializedName("object")
  String object;

  /** Information about the Payment Method debited for this payment. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** ID of the Payment Record this Payment Attempt Record belongs to. */
  @SerializedName("payment_record")
  String paymentRecord;

  /**
   * An opaque string for manual reconciliation of this payment, for example a check number or a
   * payment processor ID.
   */
  @SerializedName("payment_reference")
  String paymentReference;

  /** Shipping information for this payment. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public static PaymentAttemptRecordCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public static PaymentAttemptRecordCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_attempt_records";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentAttemptRecordCollection.class);
  }

  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public static PaymentAttemptRecordCollection list(PaymentAttemptRecordListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all the Payment Attempt Records attached to the specified Payment Record. */
  public static PaymentAttemptRecordCollection list(
      PaymentAttemptRecordListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_attempt_records";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentAttemptRecordCollection.class);
  }

  /** Retrieves a Payment Attempt Record with the given ID. */
  public static PaymentAttemptRecord retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Payment Attempt Record with the given ID. */
  public static PaymentAttemptRecord retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a Payment Attempt Record with the given ID. */
  public static PaymentAttemptRecord retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payment_attempt_records/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentAttemptRecord.class);
  }

  /** Retrieves a Payment Attempt Record with the given ID. */
  public static PaymentAttemptRecord retrieve(
      String id, PaymentAttemptRecordRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_attempt_records/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentAttemptRecord.class);
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountCanceled extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountFailed extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountGuaranteed extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
     */
    @SerializedName("value")
    Long value;
  }

  /** A representation of an amount of money, consisting of an amount and a currency. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountRequested extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * A positive integer representing the amount in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> e.g., 100
     * cents for $1.00 or 100 for ¥100, a zero-decimal currency).
     */
    @SerializedName("value")
    Long value;
  }

  /** Information about the customer for this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** ID of the Stripe Customer associated with this payment. */
    @SerializedName("customer")
    String customer;

    /** The customer's email address. */
    @SerializedName("email")
    String email;

    /** The customer's name. */
    @SerializedName("name")
    String name;

    /** The customer's phone number. */
    @SerializedName("phone")
    String phone;
  }

  /** Details about the Payment Method used in this payment attempt. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    /** The billing details associated with the method of payment. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** Details of the card used for this payment attempt. */
    @SerializedName("card")
    Card card;

    /**
     * Custom Payment Methods represent Payment Method types not modeled directly in the Stripe API.
     * This resource consists of details about the custom payment method used for this payment
     * attempt.
     */
    @SerializedName("custom")
    Custom custom;

    /** ID of the Stripe PaymentMethod used to make this payment. */
    @SerializedName("payment_method")
    String paymentMethod;

    /**
     * The type of Payment Method used for this payment attempt.
     *
     * <p>One of {@code card}, or {@code custom}.
     */
    @SerializedName("type")
    String type;

    /** Billing details used by the customer for this payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails extends StripeObject {
      /** A representation of a physical address. */
      @SerializedName("address")
      Address address;

      /** The billing email associated with the method of payment. */
      @SerializedName("email")
      String email;

      /** The billing name associated with the method of payment. */
      @SerializedName("name")
      String name;

      /** The billing phone number associated with the method of payment. */
      @SerializedName("phone")
      String phone;

      /** A representation of a physical address. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Address extends StripeObject {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;
      }
    }

    /** Details of the card used for this payment attempt. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
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

      /** The last four digits of the card. */
      @SerializedName("last4")
      String last4;

      /** True if this payment was marked as MOTO and out of scope for SCA. */
      @SerializedName("moto")
      Boolean moto;

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

      /**
       * This is used by the financial networks to identify a transaction. Visa calls this the
       * Transaction ID, Mastercard calls this the Trace ID, and American Express calls this the
       * Acquirer Reference Data. This value will be present if it is returned by the financial
       * network in the authorization response, and null otherwise.
       */
      @SerializedName("network_transaction_id")
      String networkTransactionId;

      /** Populated if this transaction used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

      /**
       * For more details about Checks, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
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

      /**
       * For more details about NetworkToken, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class NetworkToken extends StripeObject {
        @SerializedName("used")
        Boolean used;
      }

      /**
       * For more details about ThreeDSecure, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure extends StripeObject {
        @SerializedName("authentication_flow")
        String authenticationFlow;

        @SerializedName("result")
        String result;

        @SerializedName("result_reason")
        String resultReason;

        @SerializedName("version")
        String version;
      }
    }

    /**
     * Custom Payment Methods represent Payment Method types not modeled directly in the Stripe API.
     * This resource consists of details about the custom payment method used for this payment
     * attempt.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom extends StripeObject {
      /**
       * Display name for the custom (user-defined) payment method type used to make this payment.
       */
      @SerializedName("display_name")
      String displayName;

      /** The custom payment method type associated with this payment. */
      @SerializedName("type")
      String type;
    }
  }

  /** The customer's shipping information associated with this payment. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingDetails extends StripeObject {
    /** A representation of a physical address. */
    @SerializedName("address")
    Address address;

    /** The shipping recipient's name. */
    @SerializedName("name")
    String name;

    /** The shipping recipient's phone number. */
    @SerializedName("phone")
    String phone;

    /** A representation of a physical address. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amountCanceled, responseGetter);
    trySetResponseGetter(amountFailed, responseGetter);
    trySetResponseGetter(amountGuaranteed, responseGetter);
    trySetResponseGetter(amountRequested, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(shippingDetails, responseGetter);
  }
}
