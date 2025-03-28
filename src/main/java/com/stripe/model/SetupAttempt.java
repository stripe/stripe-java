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
import com.stripe.param.SetupAttemptListParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A SetupAttempt describes one attempted confirmation of a SetupIntent, whether that confirmation
 * is successful or unsuccessful. You can use SetupAttempts to inspect details of a specific attempt
 * at setting up a payment method using a SetupIntent.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SetupAttempt extends ApiResource implements HasId {
  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-application">application</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * <p>It can only be used for this Stripe Account’s own money movement flows like InboundTransfer
   * and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer,
   * and defaults to false when attaching a PaymentMethod to a Customer.
   */
  @SerializedName("attach_to_self")
  Boolean attachToSelf;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-customer">customer</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * Indicates the directions of money movement for which this payment method is intended to be
   * used.
   *
   * <p>Include {@code inbound} if you intend to use the payment method as the origin to pull funds
   * from. Include {@code outbound} if you intend to use the payment method as the destination to
   * send funds to. You can include both if you intend to use the payment method for both purposes.
   */
  @SerializedName("flow_directions")
  List<String> flowDirections;

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
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code setup_attempt}.
   */
  @SerializedName("object")
  String object;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-on_behalf_of">on_behalf_of</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** ID of the payment method used with this SetupAttempt. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** The error encountered during this attempt to confirm the SetupIntent, if any. */
  @SerializedName("setup_error")
  StripeError setupError;

  /** ID of the SetupIntent that this attempt belongs to. */
  @SerializedName("setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> setupIntent;

  /**
   * Status of this SetupAttempt, one of {@code requires_confirmation}, {@code requires_action},
   * {@code processing}, {@code succeeded}, {@code failed}, or {@code abandoned}.
   */
  @SerializedName("status")
  String status;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-usage">usage</a> on
   * the SetupIntent at the time of this confirmation, one of {@code off_session} or {@code
   * on_session}.
   */
  @SerializedName("usage")
  String usage;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

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

  /** Returns a list of SetupAttempts that associate with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts that associate with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_attempts";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SetupAttemptCollection.class);
  }

  /** Returns a list of SetupAttempts that associate with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts that associate with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_attempts";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SetupAttemptCollection.class);
  }

  /**
   * For more details about PaymentMethodDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("au_becs_debit")
    AuBecsDebit auBecsDebit;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("bancontact")
    Bancontact bancontact;

    @SerializedName("boleto")
    Boleto boleto;

    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("cashapp")
    Cashapp cashapp;

    @SerializedName("ideal")
    Ideal ideal;

    @SerializedName("kakao_pay")
    KakaoPay kakaoPay;

    @SerializedName("klarna")
    Klarna klarna;

    @SerializedName("kr_card")
    KrCard krCard;

    @SerializedName("link")
    Link link;

    @SerializedName("naver_pay")
    NaverPay naverPay;

    @SerializedName("nz_bank_account")
    NzBankAccount nzBankAccount;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("revolut_pay")
    RevolutPay revolutPay;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("sofort")
    Sofort sofort;

    /**
     * The type of the payment method used in the SetupIntent (e.g., {@code card}). An additional
     * hash is included on {@code payment_method_details} with a name matching this value. It
     * contains confirmation-specific information for the payment method.
     */
    @SerializedName("type")
    String type;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * For more details about AcssDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {}

    /**
     * For more details about AmazonPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {}

    /**
     * For more details about AuBecsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {}

    /**
     * For more details about BacsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {}

    /**
     * For more details about Bancontact, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this SetupAttempt. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /**
       * The mandate for the SEPA Direct Debit PaymentMethod which was generated by this
       * SetupAttempt.
       */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       * Can be one of {@code en}, {@code de}, {@code fr}, or {@code nl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by Bancontact directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about Boleto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Boleto extends StripeObject {}

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
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

      /** Check results by Card networks on Card address and CVC at the time of authorization. */
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

      /**
       * Identifies which network this charge was processed on. Can be {@code amex}, {@code
       * cartes_bancaires}, {@code diners}, {@code discover}, {@code eftpos_au}, {@code interac},
       * {@code jcb}, {@code link}, {@code mastercard}, {@code unionpay}, {@code visa}, or {@code
       * unknown}.
       */
      @SerializedName("network")
      String network;

      /** Populated if this authorization used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      ThreeDSecure threeDSecure;

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
       * For more details about ThreeDSecure, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ThreeDSecure extends StripeObject {
        /**
         * For authenticated transactions: how the customer was authenticated by the issuing bank.
         *
         * <p>One of {@code challenge}, or {@code frictionless}.
         */
        @SerializedName("authentication_flow")
        String authenticationFlow;

        /**
         * The Electronic Commerce Indicator (ECI). A protocol-level field indicating what degree of
         * authentication was performed.
         *
         * <p>One of {@code 01}, {@code 02}, {@code 05}, {@code 06}, or {@code 07}.
         */
        @SerializedName("electronic_commerce_indicator")
        String electronicCommerceIndicator;

        /**
         * Indicates the outcome of 3D Secure authentication.
         *
         * <p>One of {@code attempt_acknowledged}, {@code authenticated}, {@code exempted}, {@code
         * failed}, {@code not_supported}, or {@code processing_error}.
         */
        @SerializedName("result")
        String result;

        /**
         * Additional information about why 3D Secure succeeded or failed based on the {@code
         * result}.
         *
         * <p>One of {@code abandoned}, {@code bypassed}, {@code canceled}, {@code
         * card_not_enrolled}, {@code network_not_supported}, {@code protocol_error}, or {@code
         * rejected}.
         */
        @SerializedName("result_reason")
        String resultReason;

        /**
         * The 3D Secure 1 XID or 3D Secure 2 Directory Server Transaction ID (dsTransId) for this
         * payment.
         */
        @SerializedName("transaction_id")
        String transactionId;

        /**
         * The version of 3D Secure that was used.
         *
         * <p>One of {@code 1.0.2}, {@code 2.1.0}, or {@code 2.2.0}.
         */
        @SerializedName("version")
        String version;
      }

      /**
       * For more details about Wallet, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Wallet extends StripeObject {
        @SerializedName("apple_pay")
        ApplePay applePay;

        @SerializedName("google_pay")
        GooglePay googlePay;

        /**
         * The type of the card wallet, one of {@code apple_pay}, {@code google_pay}, or {@code
         * link}. An additional hash is included on the Wallet subhash with a name matching this
         * value. It contains additional information specific to the card wallet type.
         */
        @SerializedName("type")
        String type;

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
      }
    }

    /**
     * For more details about CardPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      /** The ID of the Card PaymentMethod which was generated by this SetupAttempt. */
      @SerializedName("generated_card")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedCard;

      /** Details about payments collected offline. */
      @SerializedName("offline")
      Offline offline;

      /** Get ID of expandable {@code generatedCard} object. */
      public String getGeneratedCard() {
        return (this.generatedCard != null) ? this.generatedCard.getId() : null;
      }

      public void setGeneratedCard(String id) {
        this.generatedCard = ApiResource.setExpandableFieldId(id, this.generatedCard);
      }

      /** Get expanded {@code generatedCard}. */
      public PaymentMethod getGeneratedCardObject() {
        return (this.generatedCard != null) ? this.generatedCard.getExpanded() : null;
      }

      public void setGeneratedCardObject(PaymentMethod expandableObject) {
        this.generatedCard =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /**
       * For more details about Offline, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Offline extends StripeObject {
        /** Time at which the payment was collected while offline. */
        @SerializedName("stored_at")
        Long storedAt;

        /**
         * The method used to process this payment method offline. Only deferred is allowed.
         *
         * <p>Equal to {@code deferred}.
         */
        @SerializedName("type")
        String type;
      }
    }

    /**
     * For more details about Cashapp, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Cashapp extends StripeObject {}

    /**
     * For more details about Ideal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code abn_amro}, {@code asn_bank}, {@code bunq}, {@code
       * handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code n26}, {@code nn}, {@code
       * rabobank}, {@code regiobank}, {@code revolut}, {@code sns_bank}, {@code triodos_bank},
       * {@code van_lanschot}, or {@code yoursafe}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BITSNL2A}, {@code BUNQNL2A}, {@code
       * FVLBNL22}, {@code HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code MOYONL21}, {@code
       * NNBANL2G}, {@code NTSBDEB1}, {@code RABONL2U}, {@code RBRBNL21}, {@code REVOIE23}, {@code
       * REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
       */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this SetupAttempt. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /**
       * The mandate for the SEPA Direct Debit PaymentMethod which was generated by this
       * SetupAttempt.
       */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Owner's verified full name. Values are verified or provided by iDEAL directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about KakaoPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KakaoPay extends StripeObject {}

    /**
     * For more details about Klarna, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Klarna extends StripeObject {}

    /**
     * For more details about KrCard, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class KrCard extends StripeObject {}

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {}

    /**
     * For more details about NaverPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NaverPay extends StripeObject {
      /**
       * Uniquely identifies this particular Naver Pay account. You can use this attribute to check
       * whether two Naver Pay accounts are the same.
       */
      @SerializedName("buyer_id")
      String buyerId;
    }

    /**
     * For more details about NzBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class NzBankAccount extends StripeObject {}

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {}

    /**
     * For more details about RevolutPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RevolutPay extends StripeObject {}

    /**
     * For more details about SepaDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {}

    /**
     * For more details about Sofort, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Sofort extends StripeObject {
      /** Bank code of bank associated with the bank account. */
      @SerializedName("bank_code")
      String bankCode;

      /** Name of the bank associated with the bank account. */
      @SerializedName("bank_name")
      String bankName;

      /** Bank Identifier Code of the bank associated with the bank account. */
      @SerializedName("bic")
      String bic;

      /** The ID of the SEPA Direct Debit PaymentMethod which was generated by this SetupAttempt. */
      @SerializedName("generated_sepa_debit")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedSepaDebit;

      /**
       * The mandate for the SEPA Direct Debit PaymentMethod which was generated by this
       * SetupAttempt.
       */
      @SerializedName("generated_sepa_debit_mandate")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Mandate> generatedSepaDebitMandate;

      /** Last four characters of the IBAN. */
      @SerializedName("iban_last4")
      String ibanLast4;

      /**
       * Preferred language of the Sofort authorization page that the customer is redirected to. Can
       * be one of {@code en}, {@code de}, {@code fr}, or {@code nl}
       */
      @SerializedName("preferred_language")
      String preferredLanguage;

      /**
       * Owner's verified full name. Values are verified or provided by Sofort directly (if
       * supported) at the time of authorization or settlement. They cannot be set or mutated.
       */
      @SerializedName("verified_name")
      String verifiedName;

      /** Get ID of expandable {@code generatedSepaDebit} object. */
      public String getGeneratedSepaDebit() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getId() : null;
      }

      public void setGeneratedSepaDebit(String id) {
        this.generatedSepaDebit = ApiResource.setExpandableFieldId(id, this.generatedSepaDebit);
      }

      /** Get expanded {@code generatedSepaDebit}. */
      public PaymentMethod getGeneratedSepaDebitObject() {
        return (this.generatedSepaDebit != null) ? this.generatedSepaDebit.getExpanded() : null;
      }

      public void setGeneratedSepaDebitObject(PaymentMethod expandableObject) {
        this.generatedSepaDebit =
            new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
      }

      /** Get ID of expandable {@code generatedSepaDebitMandate} object. */
      public String getGeneratedSepaDebitMandate() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getId()
            : null;
      }

      public void setGeneratedSepaDebitMandate(String id) {
        this.generatedSepaDebitMandate =
            ApiResource.setExpandableFieldId(id, this.generatedSepaDebitMandate);
      }

      /** Get expanded {@code generatedSepaDebitMandate}. */
      public Mandate getGeneratedSepaDebitMandateObject() {
        return (this.generatedSepaDebitMandate != null)
            ? this.generatedSepaDebitMandate.getExpanded()
            : null;
      }

      public void setGeneratedSepaDebitMandateObject(Mandate expandableObject) {
        this.generatedSepaDebitMandate =
            new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
      }
    }

    /**
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {}
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(paymentMethod, responseGetter);
    trySetResponseGetter(paymentMethodDetails, responseGetter);
    trySetResponseGetter(setupError, responseGetter);
    trySetResponseGetter(setupIntent, responseGetter);
  }
}
