// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CollectionSettingUpdateParams extends ApiRequestParams {
  /**
   * Either automatic, or send_invoice. When charging automatically, Stripe will attempt to pay this
   * bill at the end of the period using the payment method attached to the payer profile. When
   * sending an invoice, Stripe will email your payer profile an invoice with payment instructions.
   */
  @SerializedName("collection_method")
  CollectionMethod collectionMethod;

  /**
   * An optional customer-facing display name for the CollectionSetting object. To remove the
   * display name, set it to an empty string in the request. Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  Object displayName;

  /** Email delivery settings. */
  @SerializedName("email_delivery")
  EmailDelivery emailDelivery;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Optionally change the live version of the CollectionSetting. Billing Cadences and other objects
   * that refer to this CollectionSetting will use this version when no overrides are set. Providing
   * {@code live_version = "latest"} will set the CollectionSetting's {@code live_version} to its
   * latest version.
   */
  @SerializedName("live_version")
  Object liveVersion;

  /**
   * A lookup key used to retrieve settings dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  /**
   * The ID of the PaymentMethodConfiguration object, which controls which payment methods are
   * displayed to your customers.
   */
  @SerializedName("payment_method_configuration")
  Object paymentMethodConfiguration;

  /** Payment Method specific configuration to be stored on the object. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  private CollectionSettingUpdateParams(
      CollectionMethod collectionMethod,
      Object displayName,
      EmailDelivery emailDelivery,
      Map<String, Object> extraParams,
      Object liveVersion,
      Object lookupKey,
      Object paymentMethodConfiguration,
      PaymentMethodOptions paymentMethodOptions) {
    this.collectionMethod = collectionMethod;
    this.displayName = displayName;
    this.emailDelivery = emailDelivery;
    this.extraParams = extraParams;
    this.liveVersion = liveVersion;
    this.lookupKey = lookupKey;
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    this.paymentMethodOptions = paymentMethodOptions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private CollectionMethod collectionMethod;

    private Object displayName;

    private EmailDelivery emailDelivery;

    private Map<String, Object> extraParams;

    private Object liveVersion;

    private Object lookupKey;

    private Object paymentMethodConfiguration;

    private PaymentMethodOptions paymentMethodOptions;

    /** Finalize and obtain parameter instance from this builder. */
    public CollectionSettingUpdateParams build() {
      return new CollectionSettingUpdateParams(
          this.collectionMethod,
          this.displayName,
          this.emailDelivery,
          this.extraParams,
          this.liveVersion,
          this.lookupKey,
          this.paymentMethodConfiguration,
          this.paymentMethodOptions);
    }

    /**
     * Either automatic, or send_invoice. When charging automatically, Stripe will attempt to pay
     * this bill at the end of the period using the payment method attached to the payer profile.
     * When sending an invoice, Stripe will email your payer profile an invoice with payment
     * instructions.
     */
    public Builder setCollectionMethod(
        CollectionSettingUpdateParams.CollectionMethod collectionMethod) {
      this.collectionMethod = collectionMethod;
      return this;
    }

    /**
     * An optional customer-facing display name for the CollectionSetting object. To remove the
     * display name, set it to an empty string in the request. Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * An optional customer-facing display name for the CollectionSetting object. To remove the
     * display name, set it to an empty string in the request. Maximum length of 250 characters.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /** Email delivery settings. */
    public Builder setEmailDelivery(CollectionSettingUpdateParams.EmailDelivery emailDelivery) {
      this.emailDelivery = emailDelivery;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CollectionSettingUpdateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CollectionSettingUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Optionally change the live version of the CollectionSetting. Billing Cadences and other
     * objects that refer to this CollectionSetting will use this version when no overrides are set.
     * Providing {@code live_version = "latest"} will set the CollectionSetting's {@code
     * live_version} to its latest version.
     */
    public Builder setLiveVersion(String liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * Optionally change the live version of the CollectionSetting. Billing Cadences and other
     * objects that refer to this CollectionSetting will use this version when no overrides are set.
     * Providing {@code live_version = "latest"} will set the CollectionSetting's {@code
     * live_version} to its latest version.
     */
    public Builder setLiveVersion(EmptyParam liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * A lookup key used to retrieve settings dynamically from a static string. This may be up to
     * 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * A lookup key used to retrieve settings dynamically from a static string. This may be up to
     * 200 characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * The ID of the PaymentMethodConfiguration object, which controls which payment methods are
     * displayed to your customers.
     */
    public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /**
     * The ID of the PaymentMethodConfiguration object, which controls which payment methods are
     * displayed to your customers.
     */
    public Builder setPaymentMethodConfiguration(EmptyParam paymentMethodConfiguration) {
      this.paymentMethodConfiguration = paymentMethodConfiguration;
      return this;
    }

    /** Payment Method specific configuration to be stored on the object. */
    public Builder setPaymentMethodOptions(
        CollectionSettingUpdateParams.PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class EmailDelivery {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Controls emails for when the payment is due. For example after the invoice is finalized and
     * transitions to Open state.
     */
    @SerializedName("payment_due")
    PaymentDue paymentDue;

    private EmailDelivery(Map<String, Object> extraParams, PaymentDue paymentDue) {
      this.extraParams = extraParams;
      this.paymentDue = paymentDue;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private PaymentDue paymentDue;

      /** Finalize and obtain parameter instance from this builder. */
      public CollectionSettingUpdateParams.EmailDelivery build() {
        return new CollectionSettingUpdateParams.EmailDelivery(this.extraParams, this.paymentDue);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CollectionSettingUpdateParams.EmailDelivery#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CollectionSettingUpdateParams.EmailDelivery#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Controls emails for when the payment is due. For example after the invoice is finalized and
       * transitions to Open state.
       */
      public Builder setPaymentDue(
          CollectionSettingUpdateParams.EmailDelivery.PaymentDue paymentDue) {
        this.paymentDue = paymentDue;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentDue {
      /**
       * <strong>Required.</strong> If true an email for the invoice would be generated and sent
       * out.
       */
      @SerializedName("enabled")
      Boolean enabled;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> If true the payment link to hosted invoice page would be
       * included in email and PDF of the invoice.
       */
      @SerializedName("include_payment_link")
      Boolean includePaymentLink;

      private PaymentDue(
          Boolean enabled, Map<String, Object> extraParams, Boolean includePaymentLink) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.includePaymentLink = includePaymentLink;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Boolean includePaymentLink;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.EmailDelivery.PaymentDue build() {
          return new CollectionSettingUpdateParams.EmailDelivery.PaymentDue(
              this.enabled, this.extraParams, this.includePaymentLink);
        }

        /**
         * <strong>Required.</strong> If true an email for the invoice would be generated and sent
         * out.
         */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.EmailDelivery.PaymentDue#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.EmailDelivery.PaymentDue#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> If true the payment link to hosted invoice page would be
         * included in email and PDF of the invoice.
         */
        public Builder setIncludePaymentLink(Boolean includePaymentLink) {
          this.includePaymentLink = includePaymentLink;
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions {
    /**
     * This sub-hash contains details about the Canadian pre-authorized debit payment method
     * options.
     */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /** This sub-hash contains details about the Bancontact payment method. */
    @SerializedName("bancontact")
    Bancontact bancontact;

    /** This sub-hash contains details about the Card payment method options. */
    @SerializedName("card")
    Card card;

    /** This sub-hash contains details about the Bank transfer payment method options. */
    @SerializedName("customer_balance")
    CustomerBalance customerBalance;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** This sub-hash contains details about the Konbini payment method options. */
    @SerializedName("konbini")
    Map<String, Object> konbini;

    /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
    @SerializedName("sepa_debit")
    Map<String, Object> sepaDebit;

    /** This sub-hash contains details about the ACH direct debit payment method options. */
    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    private PaymentMethodOptions(
        AcssDebit acssDebit,
        Bancontact bancontact,
        Card card,
        CustomerBalance customerBalance,
        Map<String, Object> extraParams,
        Map<String, Object> konbini,
        Map<String, Object> sepaDebit,
        UsBankAccount usBankAccount) {
      this.acssDebit = acssDebit;
      this.bancontact = bancontact;
      this.card = card;
      this.customerBalance = customerBalance;
      this.extraParams = extraParams;
      this.konbini = konbini;
      this.sepaDebit = sepaDebit;
      this.usBankAccount = usBankAccount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebit acssDebit;

      private Bancontact bancontact;

      private Card card;

      private CustomerBalance customerBalance;

      private Map<String, Object> extraParams;

      private Map<String, Object> konbini;

      private Map<String, Object> sepaDebit;

      private UsBankAccount usBankAccount;

      /** Finalize and obtain parameter instance from this builder. */
      public CollectionSettingUpdateParams.PaymentMethodOptions build() {
        return new CollectionSettingUpdateParams.PaymentMethodOptions(
            this.acssDebit,
            this.bancontact,
            this.card,
            this.customerBalance,
            this.extraParams,
            this.konbini,
            this.sepaDebit,
            this.usBankAccount);
      }

      /**
       * This sub-hash contains details about the Canadian pre-authorized debit payment method
       * options.
       */
      public Builder setAcssDebit(
          CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /** This sub-hash contains details about the Bancontact payment method. */
      public Builder setBancontact(
          CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact bancontact) {
        this.bancontact = bancontact;
        return this;
      }

      /** This sub-hash contains details about the Card payment method options. */
      public Builder setCard(CollectionSettingUpdateParams.PaymentMethodOptions.Card card) {
        this.card = card;
        return this;
      }

      /** This sub-hash contains details about the Bank transfer payment method options. */
      public Builder setCustomerBalance(
          CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance customerBalance) {
        this.customerBalance = customerBalance;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CollectionSettingUpdateParams.PaymentMethodOptions#extraParams} for the field
       * documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CollectionSettingUpdateParams.PaymentMethodOptions#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `konbini` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CollectionSettingUpdateParams.PaymentMethodOptions#konbini} for the field documentation.
       */
      public Builder putKonbini(String key, Object value) {
        if (this.konbini == null) {
          this.konbini = new HashMap<>();
        }
        this.konbini.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `konbini` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CollectionSettingUpdateParams.PaymentMethodOptions#konbini} for the field
       * documentation.
       */
      public Builder putAllKonbini(Map<String, Object> map) {
        if (this.konbini == null) {
          this.konbini = new HashMap<>();
        }
        this.konbini.putAll(map);
        return this;
      }

      /**
       * Add a key/value pair to `sepaDebit` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CollectionSettingUpdateParams.PaymentMethodOptions#sepaDebit} for the field documentation.
       */
      public Builder putSepaDebit(String key, Object value) {
        if (this.sepaDebit == null) {
          this.sepaDebit = new HashMap<>();
        }
        this.sepaDebit.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `sepaDebit` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link CollectionSettingUpdateParams.PaymentMethodOptions#sepaDebit} for the field
       * documentation.
       */
      public Builder putAllSepaDebit(Map<String, Object> map) {
        if (this.sepaDebit == null) {
          this.sepaDebit = new HashMap<>();
        }
        this.sepaDebit.putAll(map);
        return this;
      }

      /** This sub-hash contains details about the ACH direct debit payment method options. */
      public Builder setUsBankAccount(
          CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount usBankAccount) {
        this.usBankAccount = usBankAccount;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Additional fields for Mandate creation. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /** Verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit build() {
          return new CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit(
              this.extraParams, this.mandateOptions, this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit#extraParams}
         * for the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(
            CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /** Verification method. */
        public Builder setVerificationMethod(
            CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Transaction type of the mandate. */
        @SerializedName("transaction_type")
        TransactionType transactionType;

        private MandateOptions(Map<String, Object> extraParams, TransactionType transactionType) {
          this.extraParams = extraParams;
          this.transactionType = transactionType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
              build() {
            return new CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions(
                this.extraParams, this.transactionType);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(
              CollectionSettingUpdateParams.PaymentMethodOptions.AcssDebit.MandateOptions
                      .TransactionType
                  transactionType) {
            this.transactionType = transactionType;
            return this;
          }
        }

        public enum TransactionType implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("personal")
          PERSONAL("personal");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TransactionType(String value) {
            this.value = value;
          }
        }
      }

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant"),

        @SerializedName("microdeposits")
        MICRODEPOSITS("microdeposits");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Bancontact {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Preferred language of the Bancontact authorization page that the customer is redirected to.
       */
      @SerializedName("preferred_language")
      PreferredLanguage preferredLanguage;

      private Bancontact(Map<String, Object> extraParams, PreferredLanguage preferredLanguage) {
        this.extraParams = extraParams;
        this.preferredLanguage = preferredLanguage;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PreferredLanguage preferredLanguage;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact build() {
          return new CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact(
              this.extraParams, this.preferredLanguage);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * Preferred language of the Bancontact authorization page that the customer is redirected
         * to.
         */
        public Builder setPreferredLanguage(
            CollectionSettingUpdateParams.PaymentMethodOptions.Bancontact.PreferredLanguage
                preferredLanguage) {
          this.preferredLanguage = preferredLanguage;
          return this;
        }
      }

      public enum PreferredLanguage implements ApiRequestParams.EnumParam {
        @SerializedName("de")
        DE("de"),

        @SerializedName("en")
        EN("en"),

        @SerializedName("fr")
        FR("fr"),

        @SerializedName("nl")
        NL("nl");

        @Getter(onMethod_ = {@Override})
        private final String value;

        PreferredLanguage(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Configuration options for setting up an eMandate for cards issued in India. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Selected network to process the payment on. Depends on the available networks of the card.
       */
      @SerializedName("network")
      Object network;

      /**
       * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
       * automatically prompt your customers for authentication based on risk level and <a
       * href="https://docs.corp.stripe.com/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. Read our guide on <a
       * href="https://docs.corp.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      private Card(
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          Object network,
          RequestThreeDSecure requestThreeDSecure) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.network = network;
        this.requestThreeDSecure = requestThreeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private Object network;

        private RequestThreeDSecure requestThreeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.PaymentMethodOptions.Card build() {
          return new CollectionSettingUpdateParams.PaymentMethodOptions.Card(
              this.extraParams, this.mandateOptions, this.network, this.requestThreeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.PaymentMethodOptions.Card#extraParams} for
         * the field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CollectionSettingUpdateParams.PaymentMethodOptions.Card#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Configuration options for setting up an eMandate for cards issued in India. */
        public Builder setMandateOptions(
            CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /**
         * Selected network to process the payment on. Depends on the available networks of the
         * card.
         */
        public Builder setNetwork(String network) {
          this.network = network;
          return this;
        }

        /**
         * Selected network to process the payment on. Depends on the available networks of the
         * card.
         */
        public Builder setNetwork(EmptyParam network) {
          this.network = network;
          return this;
        }

        /**
         * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
         * automatically prompt your customers for authentication based on risk level and <a
         * href="https://docs.corp.stripe.com/strong-customer-authentication">other
         * requirements</a>. However, if you wish to request 3D Secure based on logic from your own
         * fraud engine, provide this option. Read our guide on <a
         * href="https://docs.corp.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
         * requesting 3D Secure</a> for more information on how this configuration interacts with
         * Radar and our SCA Engine.
         */
        public Builder setRequestThreeDSecure(
            CollectionSettingUpdateParams.PaymentMethodOptions.Card.RequestThreeDSecure
                requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions {
        /** Amount to be charged for future payments. */
        @SerializedName("amount")
        Long amount;

        /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
        @SerializedName("amount_type")
        AmountType amountType;

        /** A description of the mandate that is meant to be displayed to the customer. */
        @SerializedName("description")
        Object description;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private MandateOptions(
            Long amount,
            AmountType amountType,
            Object description,
            Map<String, Object> extraParams) {
          this.amount = amount;
          this.amountType = amountType;
          this.description = description;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private AmountType amountType;

          private Object description;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions build() {
            return new CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions(
                this.amount, this.amountType, this.description, this.extraParams);
          }

          /** Amount to be charged for future payments. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
          public Builder setAmountType(
              CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions.AmountType
                  amountType) {
            this.amountType = amountType;
            return this;
          }

          /** A description of the mandate that is meant to be displayed to the customer. */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /** A description of the mandate that is meant to be displayed to the customer. */
          public Builder setDescription(EmptyParam description) {
            this.description = description;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for
           * the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.Card.MandateOptions#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }

        public enum AmountType implements ApiRequestParams.EnumParam {
          @SerializedName("fixed")
          FIXED("fixed"),

          @SerializedName("maximum")
          MAXIMUM("maximum");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AmountType(String value) {
            this.value = value;
          }
        }
      }

      public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
        @SerializedName("any")
        ANY("any"),

        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("challenge")
        CHALLENGE("challenge");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestThreeDSecure(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerBalance {
      /**
       * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
       * {@code bank_transfer}.
       */
      @SerializedName("bank_transfer")
      BankTransfer bankTransfer;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The funding method type to be used when there are not enough funds in the customer balance.
       * Currently the only supported value is {@code bank_transfer}.
       */
      @SerializedName("funding_type")
      FundingType fundingType;

      private CustomerBalance(
          BankTransfer bankTransfer, Map<String, Object> extraParams, FundingType fundingType) {
        this.bankTransfer = bankTransfer;
        this.extraParams = extraParams;
        this.fundingType = fundingType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BankTransfer bankTransfer;

        private Map<String, Object> extraParams;

        private FundingType fundingType;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance build() {
          return new CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance(
              this.bankTransfer, this.extraParams, this.fundingType);
        }

        /**
         * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
         * {@code bank_transfer}.
         */
        public Builder setBankTransfer(
            CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                bankTransfer) {
          this.bankTransfer = bankTransfer;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * The funding method type to be used when there are not enough funds in the customer
         * balance. Currently the only supported value is {@code bank_transfer}.
         */
        public Builder setFundingType(
            CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.FundingType
                fundingType) {
          this.fundingType = fundingType;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BankTransfer {
        /**
         * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
         * {@code eu_bank_transfer}.
         */
        @SerializedName("eu_bank_transfer")
        EuBankTransfer euBankTransfer;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The bank transfer type that can be used for funding. */
        @SerializedName("type")
        Type type;

        private BankTransfer(
            EuBankTransfer euBankTransfer, Map<String, Object> extraParams, Type type) {
          this.euBankTransfer = euBankTransfer;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EuBankTransfer euBankTransfer;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
              build() {
            return new CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance
                .BankTransfer(this.euBankTransfer, this.extraParams, this.type);
          }

          /**
           * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
           * {@code eu_bank_transfer}.
           */
          public Builder setEuBankTransfer(
              CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                      .EuBankTransfer
                  euBankTransfer) {
            this.euBankTransfer = euBankTransfer;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The bank transfer type that can be used for funding. */
          public Builder setType(
              CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.Type
                  type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class EuBankTransfer {
          /**
           * <strong>Required.</strong> The desired country code of the bank account information.
           */
          @SerializedName("country")
          Country country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private EuBankTransfer(Country country, Map<String, Object> extraParams) {
            this.country = country;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Country country;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                    .EuBankTransfer
                build() {
              return new CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance
                  .BankTransfer.EuBankTransfer(this.country, this.extraParams);
            }

            /**
             * <strong>Required.</strong> The desired country code of the bank account information.
             */
            public Builder setCountry(
                CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer
                        .EuBankTransfer.Country
                    country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }
          }

          public enum Country implements ApiRequestParams.EnumParam {
            @SerializedName("BE")
            BE("BE"),

            @SerializedName("DE")
            DE("DE"),

            @SerializedName("ES")
            ES("ES"),

            @SerializedName("FR")
            FR("FR"),

            @SerializedName("IE")
            IE("IE"),

            @SerializedName("NL")
            NL("NL");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Country(String value) {
              this.value = value;
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("eu_bank_transfer")
          EU_BANK_TRANSFER("eu_bank_transfer"),

          @SerializedName("gb_bank_transfer")
          GB_BANK_TRANSFER("gb_bank_transfer"),

          @SerializedName("jp_bank_transfer")
          JP_BANK_TRANSFER("jp_bank_transfer"),

          @SerializedName("mx_bank_transfer")
          MX_BANK_TRANSFER("mx_bank_transfer"),

          @SerializedName("us_bank_transfer")
          US_BANK_TRANSFER("us_bank_transfer");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum FundingType implements ApiRequestParams.EnumParam {
        @SerializedName("bank_transfer")
        BANK_TRANSFER("bank_transfer");

        @Getter(onMethod_ = {@Override})
        private final String value;

        FundingType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Additional fields for Financial Connections Session creation.
       */
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      /** <strong>Required.</strong> Verification method. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private UsBankAccount(
          Map<String, Object> extraParams,
          FinancialConnections financialConnections,
          VerificationMethod verificationMethod) {
        this.extraParams = extraParams;
        this.financialConnections = financialConnections;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private FinancialConnections financialConnections;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount build() {
          return new CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount(
              this.extraParams, this.financialConnections, this.verificationMethod);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /**
         * <strong>Required.</strong> Additional fields for Financial Connections Session creation.
         */
        public Builder setFinancialConnections(
            CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                financialConnections) {
          this.financialConnections = financialConnections;
          return this;
        }

        /** <strong>Required.</strong> Verification method. */
        public Builder setVerificationMethod(
            CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.VerificationMethod
                verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class FinancialConnections {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Provide filters for the linked accounts that the customer can select for the payment
         * method.
         */
        @SerializedName("filters")
        Filters filters;

        /**
         * The list of permissions to request. If this parameter is passed, the {@code
         * payment_method} permission must be included.
         */
        @SerializedName("permissions")
        List<
                CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections.Permission>
            permissions;

        /** List of data features that you would like to retrieve upon account creation. */
        @SerializedName("prefetch")
        List<
                CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections.Prefetch>
            prefetch;

        private FinancialConnections(
            Map<String, Object> extraParams,
            Filters filters,
            List<
                    CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Permission>
                permissions,
            List<
                    CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Prefetch>
                prefetch) {
          this.extraParams = extraParams;
          this.filters = filters;
          this.permissions = permissions;
          this.prefetch = prefetch;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Filters filters;

          private List<
                  CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Permission>
              permissions;

          private List<
                  CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Prefetch>
              prefetch;

          /** Finalize and obtain parameter instance from this builder. */
          public CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections
              build() {
            return new CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                .FinancialConnections(
                this.extraParams, this.filters, this.permissions, this.prefetch);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
           * for the field documentation.
           */
          public Builder putExtraParam(String key, Object value) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
          }

          /**
           * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * Provide filters for the linked accounts that the customer can select for the payment
           * method.
           */
          public Builder setFilters(
              CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Filters
                  filters) {
            this.filters = filters;
            return this;
          }

          /**
           * Add an element to `permissions` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addPermission(
              CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Permission
                  element) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.add(element);
            return this;
          }

          /**
           * Add all elements to `permissions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
           * for the field documentation.
           */
          public Builder addAllPermission(
              List<
                      CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Permission>
                  elements) {
            if (this.permissions == null) {
              this.permissions = new ArrayList<>();
            }
            this.permissions.addAll(elements);
            return this;
          }

          /**
           * Add an element to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addPrefetch(
              CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections
                      .Prefetch
                  element) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.add(element);
            return this;
          }

          /**
           * Add all elements to `prefetch` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
           * for the field documentation.
           */
          public Builder addAllPrefetch(
              List<
                      CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Prefetch>
                  elements) {
            if (this.prefetch == null) {
              this.prefetch = new ArrayList<>();
            }
            this.prefetch.addAll(elements);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Filters {
          /** The account subcategories to use to filter for selectable accounts. */
          @SerializedName("account_subcategories")
          List<
                  CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                      .FinancialConnections.Filters.AccountSubcategory>
              accountSubcategories;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Filters(
              List<
                      CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                          .FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories,
              Map<String, Object> extraParams) {
            this.accountSubcategories = accountSubcategories;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters.AccountSubcategory>
                accountSubcategories;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                    .FinancialConnections.Filters
                build() {
              return new CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                  .FinancialConnections.Filters(this.accountSubcategories, this.extraParams);
            }

            /**
             * Add an element to `accountSubcategories` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAccountSubcategory(
                CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                        .FinancialConnections.Filters.AccountSubcategory
                    element) {
              if (this.accountSubcategories == null) {
                this.accountSubcategories = new ArrayList<>();
              }
              this.accountSubcategories.add(element);
              return this;
            }

            /**
             * Add all elements to `accountSubcategories` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
             * for the field documentation.
             */
            public Builder addAllAccountSubcategory(
                List<
                        CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount
                            .FinancialConnections.Filters.AccountSubcategory>
                    elements) {
              if (this.accountSubcategories == null) {
                this.accountSubcategories = new ArrayList<>();
              }
              this.accountSubcategories.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
             * for the field documentation.
             */
            public Builder putExtraParam(String key, Object value) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.put(key, value);
              return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * CollectionSettingUpdateParams.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }
          }

          public enum AccountSubcategory implements ApiRequestParams.EnumParam {
            @SerializedName("checking")
            CHECKING("checking"),

            @SerializedName("savings")
            SAVINGS("savings");

            @Getter(onMethod_ = {@Override})
            private final String value;

            AccountSubcategory(String value) {
              this.value = value;
            }
          }
        }

        public enum Permission implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances"),

          @SerializedName("ownership")
          OWNERSHIP("ownership"),

          @SerializedName("payment_method")
          PAYMENT_METHOD("payment_method"),

          @SerializedName("transactions")
          TRANSACTIONS("transactions");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Permission(String value) {
            this.value = value;
          }
        }

        public enum Prefetch implements ApiRequestParams.EnumParam {
          @SerializedName("balances")
          BALANCES("balances"),

          @SerializedName("ownership")
          OWNERSHIP("ownership"),

          @SerializedName("transactions")
          TRANSACTIONS("transactions");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Prefetch(String value) {
            this.value = value;
          }
        }
      }

      public enum VerificationMethod implements ApiRequestParams.EnumParam {
        @SerializedName("automatic")
        AUTOMATIC("automatic"),

        @SerializedName("instant")
        INSTANT("instant"),

        @SerializedName("microdeposits")
        MICRODEPOSITS("microdeposits");

        @Getter(onMethod_ = {@Override})
        private final String value;

        VerificationMethod(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum CollectionMethod implements ApiRequestParams.EnumParam {
    @SerializedName("automatic")
    AUTOMATIC("automatic"),

    @SerializedName("send_invoice")
    SEND_INVOICE("send_invoice");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CollectionMethod(String value) {
      this.value = value;
    }
  }
}
