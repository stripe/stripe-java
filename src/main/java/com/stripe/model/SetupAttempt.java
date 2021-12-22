// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SetupAttemptListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_attempts");
    return ApiResource.requestCollection(url, params, SetupAttemptCollection.class, options);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_attempts");
    return ApiResource.requestCollection(url, params, SetupAttemptCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

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

    @SerializedName("ideal")
    Ideal ideal;

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AuBecsDebit extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {}

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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Boleto extends StripeObject {}

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** Populated if this authorization used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      Charge.PaymentMethodDetails.Card.ThreeDSecure threeDSecure;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {
      /** The ID of the Card PaymentMethod which was generated by this SetupAttempt. */
      @SerializedName("generated_card")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentMethod> generatedCard;

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
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ideal extends StripeObject {
      /**
       * The customer's bank. Can be one of {@code abn_amro}, {@code asn_bank}, {@code bunq}, {@code
       * handelsbanken}, {@code ing}, {@code knab}, {@code moneyou}, {@code rabobank}, {@code
       * regiobank}, {@code revolut}, {@code sns_bank}, {@code triodos_bank}, or {@code
       * van_lanschot}.
       */
      @SerializedName("bank")
      String bank;

      /**
       * The Bank Identifier Code of the customer's bank.
       *
       * <p>One of {@code ABNANL2A}, {@code ASNBNL21}, {@code BUNQNL2A}, {@code FVLBNL22}, {@code
       * HANDNL2A}, {@code INGBNL2A}, {@code KNABNL2H}, {@code MOYONL21}, {@code RABONL2U}, {@code
       * RBRBNL21}, {@code REVOLT21}, {@code SNSBNL2A}, or {@code TRIONL2U}.
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

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {}

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
  }
}
