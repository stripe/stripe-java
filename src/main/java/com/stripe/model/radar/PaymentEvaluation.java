// File generated from our OpenAPI spec
package com.stripe.model.radar;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.PaymentMethod;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.PaymentEvaluationCreateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Payment Evaluations represent the risk lifecycle of an externally processed payment. It includes
 * the Radar risk score from Stripe, payment outcome taken by the merchant or processor, and any
 * post transaction events, such as refunds or disputes. See the <a
 * href="https://stripe.com/radar/multiprocessor">Radar API guide</a> for integration steps.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentEvaluation extends ApiResource implements HasId {
  /** Client device metadata attached to this payment evaluation. */
  @SerializedName("client_device_metadata_details")
  ClientDeviceMetadataDetails clientDeviceMetadataDetails;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created_at")
  Long createdAt;

  /** Customer details attached to this payment evaluation. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * Event information associated with the payment evaluation, such as refunds, dispute, early fraud
   * warnings, or user interventions.
   */
  @SerializedName("events")
  List<PaymentEvaluation.Event> events;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Collection of scores and insights for this payment evaluation. */
  @SerializedName("insights")
  Insights insights;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
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
   * <p>Equal to {@code radar.payment_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** Indicates the final outcome for the payment evaluation. */
  @SerializedName("outcome")
  Outcome outcome;

  /** Payment details attached to this payment evaluation. */
  @SerializedName("payment_details")
  PaymentDetails paymentDetails;

  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public static PaymentEvaluation create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public static PaymentEvaluation create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/radar/payment_evaluations";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentEvaluation.class);
  }

  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public static PaymentEvaluation create(PaymentEvaluationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Request a Radar API fraud risk score from Stripe for a payment before sending it for external
   * processor authorization.
   */
  public static PaymentEvaluation create(
      PaymentEvaluationCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/payment_evaluations";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentEvaluation.class);
  }

  /** Client device metadata attached to this payment evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ClientDeviceMetadataDetails extends StripeObject {
    /**
     * ID for the Radar Session associated with the payment evaluation. A <a
     * href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot of the
     * browser metadata and device details that help Radar make more accurate predictions on your
     * payments.
     */
    @SerializedName("radar_session")
    String radarSession;
  }

  /** Customer details attached to this payment evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The ID of the customer associated with the payment evaluation. */
    @SerializedName("customer")
    String customer;

    /** The ID of the Account representing the customer associated with the payment evaluation. */
    @SerializedName("customer_account")
    String customerAccount;

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

  /** Event reported for this payment evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Event extends StripeObject {
    /** Dispute opened event details attached to this payment evaluation. */
    @SerializedName("dispute_opened")
    DisputeOpened disputeOpened;

    /** Early Fraud Warning Received event details attached to this payment evaluation. */
    @SerializedName("early_fraud_warning_received")
    EarlyFraudWarningReceived earlyFraudWarningReceived;

    /** Timestamp when the event occurred. */
    @SerializedName("occurred_at")
    Long occurredAt;

    /** Refunded Event details attached to this payment evaluation. */
    @SerializedName("refunded")
    Refunded refunded;

    /**
     * Indicates the type of event attached to the payment evaluation.
     *
     * <p>One of {@code dispute_opened}, {@code early_fraud_warning_received}, {@code refunded},
     * {@code user_intervention_raised}, or {@code user_intervention_resolved}.
     */
    @SerializedName("type")
    String type;

    /** User intervention raised event details attached to this payment evaluation. */
    @SerializedName("user_intervention_raised")
    UserInterventionRaised userInterventionRaised;

    /** User Intervention Resolved Event details attached to this payment evaluation. */
    @SerializedName("user_intervention_resolved")
    UserInterventionResolved userInterventionResolved;

    /** Dispute opened event details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisputeOpened extends StripeObject {
      /**
       * Amount to dispute for this payment. A positive integer representing how much to charge in
       * <a href="https://docs.stripe.com/currencies#zero-decimal">the smallest currency unit</a>
       * (for example, 100 cents to charge 1.00 USD or 100 to charge 100 Yen, a zero-decimal
       * currency).
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

      /**
       * Reason given by cardholder for dispute.
       *
       * <p>One of {@code account_not_available}, {@code credit_not_processed}, {@code
       * customer_initiated}, {@code duplicate}, {@code fraudulent}, {@code general}, {@code
       * noncompliant}, {@code product_not_received}, {@code product_unacceptable}, {@code
       * subscription_canceled}, or {@code unrecognized}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** Early Fraud Warning Received event details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EarlyFraudWarningReceived extends StripeObject {
      /**
       * The type of fraud labeled by the issuer.
       *
       * <p>One of {@code made_with_lost_card}, {@code made_with_stolen_card}, {@code other}, or
       * {@code unauthorized_use_of_card}.
       */
      @SerializedName("fraud_type")
      String fraudType;
    }

    /** Refunded Event details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Refunded extends StripeObject {
      /**
       * Amount refunded for this payment. A positive integer representing how much to charge in <a
       * href="https://docs.stripe.com/currencies#zero-decimal">the smallest currency unit</a> (for
       * example, 100 cents to charge 1.00 USD or 100 to charge 100 Yen, a zero-decimal currency).
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

      /**
       * Indicates the reason for the refund.
       *
       * <p>One of {@code duplicate}, {@code fraudulent}, {@code other}, or {@code
       * requested_by_customer}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** User intervention raised event details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserInterventionRaised extends StripeObject {
      /** User intervention raised custom event details attached to this payment evaluation. */
      @SerializedName("custom")
      Custom custom;

      /** Unique identifier for the user intervention event. */
      @SerializedName("key")
      String key;

      /**
       * Type of user intervention raised.
       *
       * <p>One of {@code 3ds}, {@code captcha}, or {@code custom}.
       */
      @SerializedName("type")
      String type;

      /** User intervention raised custom event details attached to this payment evaluation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Custom extends StripeObject {
        /**
         * Custom type of user intervention raised. The string must use a snake case description for
         * the type of intervention performed.
         */
        @SerializedName("type")
        String type;
      }
    }

    /** User Intervention Resolved Event details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UserInterventionResolved extends StripeObject {
      /** Unique ID of this intervention. Use this to provide the result. */
      @SerializedName("key")
      String key;

      /**
       * Result of the intervention if it has been completed.
       *
       * <p>One of {@code abandoned}, {@code failed}, or {@code passed}.
       */
      @SerializedName("outcome")
      String outcome;
    }
  }

  /** Collection of scores and insights for this payment evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Insights extends StripeObject {
    /** Stripe Radar's evaluation of the likelihood of a card issuer decline on this payment. */
    @SerializedName("card_issuer_decline")
    CardIssuerDecline cardIssuerDecline;

    /** The timestamp when the evaluation was performed. */
    @SerializedName("evaluated_at")
    Long evaluatedAt;

    /** Scores, insights and recommended action for one scorer for this PaymentEvaluation. */
    @SerializedName("fraudulent_dispute")
    FraudulentDispute fraudulentDispute;

    /**
     * Provides Stripe Radar's evaluation of the likelihood that a payment will be declined by the
     * card issuer.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardIssuerDecline extends StripeObject {
      /**
       * Stripe Radar's evaluation of the likelihood that the payment will be declined by the card
       * issuer. Scores range from 0 to 100, with higher values indicating a higher likelihood of
       * decline.
       */
      @SerializedName("model_score")
      BigDecimal modelScore;

      /**
       * Recommended action based on the model score. Possible values are {@code block} and {@code
       * continue}.
       *
       * <p>One of {@code block}, or {@code continue}.
       */
      @SerializedName("recommended_action")
      String recommendedAction;
    }

    /** Scores, insights and recommended action for one scorer for this PaymentEvaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class FraudulentDispute extends StripeObject {
      /**
       * Recommended action based on the risk score. Possible values are {@code block} and {@code
       * continue}.
       *
       * <p>One of {@code block}, or {@code continue}.
       */
      @SerializedName("recommended_action")
      String recommendedAction;

      /**
       * Stripe Radar’s evaluation of the risk level of the payment. Possible values for evaluated
       * payments are between 0 and 100, with higher scores indicating higher risk.
       */
      @SerializedName("risk_score")
      Long riskScore;
    }
  }

  /** Outcome details for this payment evaluation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Outcome extends StripeObject {
    /** Details of a merchant_blocked outcome attached to this payment evaluation. */
    @SerializedName("merchant_blocked")
    MerchantBlocked merchantBlocked;

    /** The PaymentIntent ID associated with the payment evaluation. */
    @SerializedName("payment_intent_id")
    String paymentIntentId;

    /** Details of an rejected outcome attached to this payment evaluation. */
    @SerializedName("rejected")
    Rejected rejected;

    /** Details of a succeeded outcome attached to this payment evaluation. */
    @SerializedName("succeeded")
    Succeeded succeeded;

    /**
     * Indicates the outcome of the payment evaluation.
     *
     * <p>One of {@code failed}, {@code merchant_blocked}, {@code rejected}, or {@code succeeded}.
     */
    @SerializedName("type")
    String type;

    /** Details of a merchant_blocked outcome attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class MerchantBlocked extends StripeObject {
      /**
       * The reason the payment was blocked by the merchant.
       *
       * <p>One of {@code authentication_required}, {@code blocked_for_fraud}, {@code
       * invalid_payment}, or {@code other}.
       */
      @SerializedName("reason")
      String reason;
    }

    /** Details of an rejected outcome attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Rejected extends StripeObject {
      /** Details of an rejected card outcome attached to this payment evaluation. */
      @SerializedName("card")
      Card card;

      /** Details of an rejected card outcome attached to this payment evaluation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        /**
         * Result of the address line 1 check.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_line1_check")
        String addressLine1Check;

        /**
         * Indicates whether the cardholder provided a postal code and if it matched the
         * cardholder’s billing address.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        /**
         * Result of the CVC check.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("cvc_check")
        String cvcCheck;

        /**
         * Card issuer's reason for the network decline.
         *
         * <p>One of {@code authentication_failed}, {@code do_not_honor}, {@code expired}, {@code
         * incorrect_cvc}, {@code incorrect_number}, {@code incorrect_postal_code}, {@code
         * insufficient_funds}, {@code invalid_account}, {@code lost_card}, {@code other}, {@code
         * processing_error}, {@code reported_stolen}, or {@code try_again_later}.
         */
        @SerializedName("reason")
        String reason;
      }
    }

    /** Details of a succeeded outcome attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Succeeded extends StripeObject {
      /** Details of an succeeded card outcome attached to this payment evaluation. */
      @SerializedName("card")
      Card card;

      /** Details of an succeeded card outcome attached to this payment evaluation. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Card extends StripeObject {
        /**
         * Result of the address line 1 check.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_line1_check")
        String addressLine1Check;

        /**
         * Indicates whether the cardholder provided a postal code and if it matched the
         * cardholder’s billing address.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("address_postal_code_check")
        String addressPostalCodeCheck;

        /**
         * Result of the CVC check.
         *
         * <p>One of {@code fail}, {@code pass}, {@code unavailable}, or {@code unchecked}.
         */
        @SerializedName("cvc_check")
        String cvcCheck;
      }
    }
  }

  /** Payment details attached to this payment evaluation. */
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

    /** Details about the payment method used for the payment. */
    @SerializedName("payment_method_details")
    PaymentMethodDetails paymentMethodDetails;

    /** Shipping details for the payment evaluation. */
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
      /** Describes card money movement details for the payment evaluation. */
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

    /** Payment method details attached to this payment evaluation. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodDetails extends StripeObject {
      /** Billing information associated with the payment evaluation. */
      @SerializedName("billing_details")
      BillingDetails billingDetails;

      /** The payment method used in this payment evaluation. */
      @SerializedName("payment_method")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> paymentMethod;

      /** Get ID of expandable {@code paymentMethod} object. */
      public String getPaymentMethod() {
        return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
      }

      public void setPaymentMethod(String id) {
        this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
      }

      /** Get expanded {@code paymentMethod}. */
      public PaymentMethod getPaymentMethodObject() {
        return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
      }

      public void setPaymentMethodObject(PaymentMethod expandableObject) {
        this.paymentMethod =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Billing details attached to this payment evaluation. */
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

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(clientDeviceMetadataDetails, responseGetter);
    trySetResponseGetter(customerDetails, responseGetter);
    trySetResponseGetter(insights, responseGetter);
    trySetResponseGetter(outcome, responseGetter);
    trySetResponseGetter(paymentDetails, responseGetter);
  }
}
