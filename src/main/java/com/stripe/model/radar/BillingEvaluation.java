// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.BillingEvaluationCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Billing Evaluations represent Stripe Radar's assessment of the non-payment abuse risk of an
 * upcoming charge. Unlike a <a href="https://stripe.com/api/radar/payment-evaluation">Payment
 * Evaluation</a>, a billing evaluation is created before the payment is attempted and returns the
 * {@code non_payment_abuse} signal only.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BillingEvaluation extends ApiResource implements HasId {
  /** Client device metadata attached to this billing evaluation. */
  @SerializedName("client_device_metadata_details")
  ClientDeviceMetadataDetails clientDeviceMetadataDetails;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /** Details of the customer this billing evaluation assesses. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code radar.billing_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** Payment details for the upcoming charge this billing evaluation assesses. */
  @SerializedName("payment_details")
  PaymentDetails paymentDetails;

  /** Stripe Radar's signals for the upcoming charge this billing evaluation assesses. */
  @SerializedName("signals")
  Signals signals;

  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public static BillingEvaluation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public static BillingEvaluation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/billing_evaluations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, BillingEvaluation.class);
  }

  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public static BillingEvaluation create(BillingEvaluationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Request Stripe Radar’s assessment of the non-payment abuse risk of an upcoming charge, before
   * the payment is attempted.
   */
  public static BillingEvaluation create(
      BillingEvaluationCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/billing_evaluations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BillingEvaluation.class);
  }

  /** Client device metadata attached to this billing evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ClientDeviceMetadataDetails extends StripeObject {
    /**
     * ID for the Radar Session associated with the billing evaluation. A <a
     * href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot of the
     * browser metadata and device details that help Radar make more accurate predictions on your
     * payments.
     */
    @SerializedName("radar_session")
    String radarSession;
  }

  /** Details of the customer this billing evaluation assesses. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The ID of the customer whose upcoming payment was evaluated. */
    @SerializedName("customer")
    String customer;

    /** The ID of the Account representing the customer whose upcoming payment was evaluated. */
    @SerializedName("customer_account")
    String customerAccount;

    /**
     * Attributes of the customer being evaluated. These are populated from the {@code customer} or
     * {@code customer_account} object when one was supplied, and from the request otherwise.
     */
    @SerializedName("data")
    Data data;

    /** Attributes of the customer this billing evaluation assesses. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Data extends StripeObject {
      /** The customer's email address. */
      @SerializedName("email")
      String email;

      /** The customer's full name or business name. */
      @SerializedName("name")
      String name;

      /** The customer's phone number. */
      @SerializedName("phone")
      String phone;
    }
  }

  /** Payment details for the upcoming charge this billing evaluation assesses. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDetails extends StripeObject {
    /**
     * Amount intended to be collected by this payment. A positive integer representing how much to
     * charge in the <a href="https://docs.stripe.com/currencies#zero-decimal">smallest currency
     * unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency).
     * The minimum amount is $0.50 US or <a
     * href="https://docs.stripe.com/currencies#minimum-and-maximum-charge-amounts">equivalent in
     * charge currency</a>. The amount value supports up to eight digits (e.g., a value of 99999999
     * for a USD charge of $999,999.99).
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /** Details about the payment's customer presence and type. */
    @SerializedName("money_movement_details")
    MoneyMovementDetails moneyMovementDetails;

    /** Details about the payment method that will be charged. */
    @SerializedName("payment_method_details")
    PaymentMethodDetails paymentMethodDetails;

    /** Shipping details for the billing evaluation. */
    @SerializedName("shipping_details")
    ShippingDetails shippingDetails;

    /** Payment statement descriptor. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    /** Money Movement details attached to this payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MoneyMovementDetails extends StripeObject {
      /** Describes card money movement details. */
      @SerializedName("card")
      Card card;

      /**
       * Describes the type of money movement. Currently only {@code card} is supported.
       *
       * <p>Equal to {@code card}.
       */
      @SerializedName("money_movement_type")
      String moneyMovementType;

      /** Money Movement card details attached to this payment. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        /**
         * Describes the presence of the customer during the payment.
         *
         * <p>One of {@code off_session}, or {@code on_session}.
         */
        @SerializedName("customer_presence")
        String customerPresence;

        /**
         * Describes the type of payment.
         *
         * <p>One of {@code one_off}, {@code recurring}, {@code setup_one_off}, or {@code
         * setup_recurring}.
         */
        @SerializedName("payment_type")
        String paymentType;
      }
    }

    /** Payment method details attached to this billing evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodDetails extends StripeObject {
      /** Billing information associated with the billing evaluation. */
      @SerializedName("billing_details")
      BillingDetails billingDetails;

      /** The payment method that will be charged. */
      @SerializedName("payment_method")
      String paymentMethod;

      /** Billing details attached to the payment method. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BillingDetails extends StripeObject {
        /** Address data. */
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

        /** Address data. */
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

          /** Address line 1, such as the street, PO Box, or company name. */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          @SerializedName("state")
          String state;
        }
      }
    }

    /** Shipping details attached to this payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingDetails extends StripeObject {
      /** Address data. */
      @SerializedName("address")
      Address address;

      /** Shipping name. */
      @SerializedName("name")
      String name;

      /** Shipping phone number. */
      @SerializedName("phone")
      String phone;

      /** Address data. */
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /**
         * State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
        @SerializedName("state")
        String state;
      }
    }
  }

  /** Stripe Radar's signals for the upcoming charge this billing evaluation assesses. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Signals extends StripeObject {
    /**
     * Stripe Radar's assessment of the likelihood that the upcoming charge results in non-payment
     * abuse.
     */
    @SerializedName("non_payment_abuse")
    NonPaymentAbuse nonPaymentAbuse;

    /**
     * Stripe Radar's assessment of the non-payment abuse risk of the upcoming charge, with {@code
     * evaluated_at} and {@code risk_level} fields.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NonPaymentAbuse extends StripeObject {
      /** The time when this signal was evaluated. */
      @SerializedName("evaluated_at")
      Long evaluatedAt;

      /**
       * Risk level.
       *
       * <p>One of {@code elevated}, {@code highest}, {@code low}, {@code normal}, {@code
       * not_assessed}, or {@code unknown}.
       */
      @SerializedName("risk_level")
      String riskLevel;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(clientDeviceMetadataDetails, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(paymentDetails, responseGetter);
    trySetResponseGetter(signals, responseGetter);
  }
}
