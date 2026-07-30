// File generated from our OpenAPI spec
package com.stripe.model.sharedpayment;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.Address;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.sharedpayment.GrantedTokenCreateParams;
import com.stripe.param.sharedpayment.GrantedTokenRetrieveParams;
import com.stripe.param.sharedpayment.GrantedTokenRevokeParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * SharedPaymentGrantedToken is the view-only resource of a SharedPaymentIssuedToken, which is a
 * limited-use reference to a PaymentMethod. When another Stripe merchant shares a
 * SharedPaymentIssuedToken with you, you can view attributes of the shared token using the
 * SharedPaymentGrantedToken API, and use it with a PaymentIntent.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GrantedToken extends ApiResource implements HasId {
  /** Details about the agent that issued this SharedPaymentGrantedToken. */
  @SerializedName("agent_details")
  AgentDetails agentDetails;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Time at which this SharedPaymentGrantedToken expires and can no longer be used to confirm a
   * PaymentIntent.
   */
  @SerializedName("deactivated_at")
  Long deactivatedAt;

  /**
   * The reason why the SharedPaymentGrantedToken has been deactivated.
   *
   * <p>One of {@code consumed}, {@code expired}, {@code resolved}, or {@code revoked}.
   */
  @SerializedName("deactivated_reason")
  String deactivatedReason;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code shared_payment.granted_token}.
   */
  @SerializedName("object")
  String object;

  /** Details of the PaymentMethod that was shared via this token. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** Risk details of the SharedPaymentGrantedToken. */
  @SerializedName("risk_details")
  RiskDetails riskDetails;

  /** Metadata about the SharedPaymentGrantedToken. */
  @SerializedName("shared_metadata")
  Map<String, String> sharedMetadata;

  /** Some details about how the SharedPaymentGrantedToken has been used already. */
  @SerializedName("usage_details")
  UsageDetails usageDetails;

  /** Limits on how this SharedPaymentGrantedToken can be used. */
  @SerializedName("usage_limits")
  UsageLimits usageLimits;

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(String sharedPaymentGrantedToken) throws StripeException {
    return retrieve(sharedPaymentGrantedToken, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(String sharedPaymentGrantedToken, RequestOptions options)
      throws StripeException {
    return retrieve(sharedPaymentGrantedToken, (Map<String, Object>) null, options);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(
      String sharedPaymentGrantedToken, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/granted_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, GrantedToken.class);
  }

  /** Retrieves an existing SharedPaymentGrantedToken object. */
  public static GrantedToken retrieve(
      String sharedPaymentGrantedToken, GrantedTokenRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/shared_payment/granted_tokens/%s",
            ApiResource.urlEncodeId(sharedPaymentGrantedToken));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, GrantedToken.class);
  }

  /**
   * For more details about AgentDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AgentDetails extends StripeObject {
    /** The Stripe Profile ID of the agent that issued this SharedPaymentGrantedToken. */
    @SerializedName("network_business_profile")
    String networkBusinessProfile;
  }

  /** Details of the PaymentMethod that was used to create the SharedPaymentGrantedToken. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("affirm")
    Affirm affirm;

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    @SerializedName("card")
    Card card;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("link")
    Link link;

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the PaymentMethod
     * type.
     *
     * <p>One of {@code affirm}, {@code card}, {@code klarna}, or {@code link}.
     */
    @SerializedName("type")
    String type;

    /**
     * For more details about Affirm, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Affirm extends StripeObject {}

    /**
     * For more details about BillingDetails, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
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

      /**
       * Taxpayer identification number. Used only for transactions between LATAM buyers and
       * non-LATAM sellers.
       */
      @SerializedName("tax_id")
      String taxId;
    }

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /**
       * Card brand. Can be {@code amex}, {@code cartes_bancaires}, {@code diners}, {@code
       * discover}, {@code eftpos_au}, {@code jcb}, {@code link}, {@code mastercard}, {@code
       * unionpay}, {@code visa} or {@code unknown}.
       */
      @SerializedName("brand")
      String brand;

      /** Checks on Card address and CVC if provided. */
      @SerializedName("checks")
      Checks checks;

      /**
       * Two-letter ISO code representing the country of the card. You could use this attribute to
       * get a sense of the international breakdown of cards you've collected.
       */
      @SerializedName("country")
      String country;

      /**
       * A high-level description of the type of cards issued in this range. (For internal use only
       * and not typically available in standard API requests.)
       */
      @SerializedName("description")
      String description;

      /**
       * The brand to use when displaying the card, this accounts for customer's brand choice on
       * dual-branded cards. Can be {@code american_express}, {@code cartes_bancaires}, {@code
       * diners_club}, {@code discover}, {@code eftpos_australia}, {@code interac}, {@code jcb},
       * {@code mastercard}, {@code union_pay}, {@code visa}, or {@code other} and may contain more
       * values in the future.
       */
      @SerializedName("display_brand")
      String displayBrand;

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

      /**
       * Issuer identification number of the card. (For internal use only and not typically
       * available in standard API requests.)
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

      /** If this Card is part of a card wallet, this contains the details of the card wallet. */
      @SerializedName("wallet")
      Wallet wallet;

      /**
       * For more details about Checks, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
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

      /**
       * For more details about Networks, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Networks extends StripeObject {
        /**
         * All networks available for selection via <a
         * href="https://stripe.com/api/payment_intents/confirm#confirm_payment_intent-payment_method_options-card-network">payment_method_options.card.network</a>.
         */
        @SerializedName("available")
        List<String> available;

        /**
         * The preferred network for co-branded cards. Can be {@code cartes_bancaires}, {@code
         * mastercard}, {@code visa} or {@code invalid_preference} if requested network is not valid
         * for the card.
         */
        @SerializedName("preferred")
        String preferred;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
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

        @SerializedName("link")
        Link link;

        @SerializedName("masterpass")
        Masterpass masterpass;

        @SerializedName("samsung_pay")
        SamsungPay samsungPay;

        /**
         * The type of the card wallet, one of {@code amex_express_checkout}, {@code apple_pay},
         * {@code google_pay}, {@code masterpass}, {@code samsung_pay}, {@code visa_checkout}, or
         * {@code link}. An additional hash is included on the Wallet subhash with a name matching
         * this value. It contains additional information specific to the card wallet type.
         */
        @SerializedName("type")
        String type;

        @SerializedName("visa_checkout")
        VisaCheckout visaCheckout;

        /**
         * For more details about AmexExpressCheckout, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class AmexExpressCheckout extends StripeObject {}

        /**
         * For more details about ApplePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ApplePay extends StripeObject {}

        /**
         * For more details about GooglePay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class GooglePay extends StripeObject {}

        /**
         * For more details about Link, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Link extends StripeObject {}

        /**
         * For more details about Masterpass, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
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

        /**
         * For more details about SamsungPay, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class SamsungPay extends StripeObject {}

        /**
         * For more details about VisaCheckout, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
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

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {
      /** The customer's date of birth, if provided. */
      @SerializedName("dob")
      Dob dob;

      /**
       * For more details about Dob, please refer to the <a href="https://docs.stripe.com/api">API
       * Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Dob extends StripeObject {
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

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /** Account owner's email address. */
      @SerializedName("email")
      String email;

      /** [Deprecated] This is a legacy parameter that no longer has any function. */
      @SerializedName("persistent_token")
      @Deprecated
      String persistentToken;
    }
  }

  /** Risk details of the SharedPaymentGrantedToken. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RiskDetails extends StripeObject {
    /**
     * Risk insights for this token, including scores and recommended actions for each risk type.
     */
    @SerializedName("insights")
    Insights insights;

    /**
     * Risk insights for this token, including scores and recommended actions for each risk type.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Insights extends StripeObject {
      /** Bot risk insight. */
      @SerializedName("bot")
      Bot bot;

      /** Card issuer decline risk insight. */
      @SerializedName("card_issuer_decline")
      CardIssuerDecline cardIssuerDecline;

      /** Card testing risk insight. */
      @SerializedName("card_testing")
      CardTesting cardTesting;

      /** Fraudulent dispute risk insight. */
      @SerializedName("fraudulent_dispute")
      FraudulentDispute fraudulentDispute;

      /** Stolen card risk insight. */
      @SerializedName("stolen_card")
      StolenCard stolenCard;

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Bot extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight. */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardIssuerDecline extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight. */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with a float score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CardTesting extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight. */
        @SerializedName("score")
        BigDecimal score;
      }

      /** Risk insight with an integer score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FraudulentDispute extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight. */
        @SerializedName("score")
        Long score;
      }

      /** Risk insight with an integer score and recommended action. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class StolenCard extends StripeObject {
        /** Recommended action for this insight. */
        @SerializedName("recommended_action")
        String recommendedAction;

        /** Risk score for this insight. */
        @SerializedName("score")
        Long score;
      }
    }
  }

  /** Some details on how the SharedPaymentGrantedToken has been used so far. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageDetails extends StripeObject {
    /** The total amount captured using this SharedPaymentToken. */
    @SerializedName("amount_captured")
    AmountCaptured amountCaptured;

    /** A representation of an amount of money, consisting of an amount and a currency. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountCaptured extends StripeObject {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /** Integer value of the amount in the smallest currency unit. */
      @SerializedName("value")
      Long value;
    }
  }

  /** Limits on how this SharedPaymentGrantedToken can be used. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsageLimits extends StripeObject {
    /**
     * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
     * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
     * currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /**
     * Time at which this SharedPaymentToken expires and can no longer be used to confirm a
     * PaymentIntent.
     */
    @SerializedName("expires_at")
    Long expiresAt;

    /** Max amount that can be captured using this SharedPaymentToken. */
    @SerializedName("max_amount")
    Long maxAmount;

    /**
     * The recurring interval at which the shared payment token's amount usage restrictions reset.
     *
     * <p>One of {@code month}, {@code week}, or {@code year}.
     */
    @SerializedName("recurring_interval")
    String recurringInterval;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final GrantedToken resource;

    private TestHelpers(GrantedToken resource) {
      this.resource = resource;
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(Map<String, Object> params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/shared_payment/granted_tokens";
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return getGlobalResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(GrantedTokenCreateParams params) throws StripeException {
      return create(params, (RequestOptions) null);
    }

    /**
     * Creates a new test SharedPaymentGrantedToken object. This endpoint is only available in test
     * mode and allows sellers to create SharedPaymentGrantedTokens for testing their integration
     */
    public static GrantedToken create(GrantedTokenCreateParams params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/shared_payment/granted_tokens";
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return getGlobalResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke() throws StripeException {
      return revoke((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(RequestOptions options) throws StripeException {
      return revoke((Map<String, Object>) null, options);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(Map<String, Object> params) throws StripeException {
      return revoke(params, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/shared_payment/granted_tokens/%s/revoke",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiRequest request =
          new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
      return resource.getResponseGetter().request(request, GrantedToken.class);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(GrantedTokenRevokeParams params) throws StripeException {
      return revoke(params, (RequestOptions) null);
    }

    /**
     * Revokes a test SharedPaymentGrantedToken object. This endpoint is only available in test mode
     * and allows sellers to revoke SharedPaymentGrantedTokens for testing their integration
     */
    public GrantedToken revoke(GrantedTokenRevokeParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/shared_payment/granted_tokens/%s/revoke",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      ApiRequest request =
          new ApiRequest(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              options);
      return resource.getResponseGetter().request(request, GrantedToken.class);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(agentDetails, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(riskDetails, responseGetter);
    trySetResponseGetter(usageDetails, responseGetter);
    trySetResponseGetter(usageLimits, responseGetter);
  }
}
