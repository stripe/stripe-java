// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SetupIntentCreateParams extends ApiRequestParams {
  /**
   * Set to {@code true} to attempt to confirm this SetupIntent immediately. This parameter defaults
   * to {@code false}. If the payment method attached is a card, a return_url may be provided in
   * case additional authentication is required.
   */
  @SerializedName("confirm")
  Boolean confirm;

  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * <p>If present, the SetupIntent's payment method will be attached to the Customer on successful
   * setup. Payment methods attached to other Customers cannot be used with this SetupIntent.
   */
  @SerializedName("customer")
  String customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * This hash contains details about the Mandate to create. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("mandate_data")
  MandateData mandateData;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The Stripe account ID for which this SetupIntent is created. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
   * SetupIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment-method-specific configuration for this SetupIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (e.g. card) that this SetupIntent is allowed to use. If this
   * is not provided, defaults to [&quot;card&quot;].
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This parameter can only be used with <a
   * href="https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm">{@code
   * confirm=true}</a>.
   */
  @SerializedName("return_url")
  String returnUrl;

  /** If this hash is populated, this SetupIntent will generate a single_use Mandate on success. */
  @SerializedName("single_use")
  SingleUse singleUse;

  /**
   * Indicates how the payment method is intended to be used in the future. If not provided, this
   * value defaults to {@code off_session}.
   */
  @SerializedName("usage")
  Usage usage;

  private SetupIntentCreateParams(
      Boolean confirm,
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      MandateData mandateData,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes,
      String returnUrl,
      SingleUse singleUse,
      Usage usage) {
    this.confirm = confirm;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.mandateData = mandateData;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.returnUrl = returnUrl;
    this.singleUse = singleUse;
    this.usage = usage;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean confirm;

    private String customer;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private MandateData mandateData;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    private String returnUrl;

    private SingleUse singleUse;

    private Usage usage;

    /** Finalize and obtain parameter instance from this builder. */
    public SetupIntentCreateParams build() {
      return new SetupIntentCreateParams(
          this.confirm,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.mandateData,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.returnUrl,
          this.singleUse,
          this.usage);
    }

    /**
     * Set to {@code true} to attempt to confirm this SetupIntent immediately. This parameter
     * defaults to {@code false}. If the payment method attached is a card, a return_url may be
     * provided in case additional authentication is required.
     */
    public Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * <p>If present, the SetupIntent's payment method will be attached to the Customer on
     * successful setup. Payment methods attached to other Customers cannot be used with this
     * SetupIntent.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SetupIntentCreateParams#extraParams} for the field documentation.
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
     * See {@link SetupIntentCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * This hash contains details about the Mandate to create. This parameter can only be used with
     * <a href="https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setMandateData(MandateData mandateData) {
      this.mandateData = mandateData;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * SetupIntentCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SetupIntentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The Stripe account ID for which this SetupIntent is created. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * ID of the payment method (a PaymentMethod, Card, or saved Source object) to attach to this
     * SetupIntent.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** Payment-method-specific configuration for this SetupIntent. */
    public Builder setPaymentMethodOptions(PaymentMethodOptions paymentMethodOptions) {
      this.paymentMethodOptions = paymentMethodOptions;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addPaymentMethodType(String element) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link SetupIntentCreateParams#paymentMethodTypes} for the field documentation.
     */
    public Builder addAllPaymentMethodType(List<String> elements) {
      if (this.paymentMethodTypes == null) {
        this.paymentMethodTypes = new ArrayList<>();
      }
      this.paymentMethodTypes.addAll(elements);
      return this;
    }

    /**
     * The URL to redirect your customer back to after they authenticate or cancel their payment on
     * the payment method's app or site. If you'd prefer to redirect to a mobile application, you
     * can alternatively supply an application URI scheme. This parameter can only be used with <a
     * href="https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm">{@code
     * confirm=true}</a>.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * If this hash is populated, this SetupIntent will generate a single_use Mandate on success.
     */
    public Builder setSingleUse(SingleUse singleUse) {
      this.singleUse = singleUse;
      return this;
    }

    /**
     * Indicates how the payment method is intended to be used in the future. If not provided, this
     * value defaults to {@code off_session}.
     */
    public Builder setUsage(Usage usage) {
      this.usage = usage;
      return this;
    }
  }

  @Getter
  public static class MandateData {
    /** This hash contains details about the customer acceptance of the Mandate. */
    @SerializedName("customer_acceptance")
    CustomerAcceptance customerAcceptance;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private MandateData(CustomerAcceptance customerAcceptance, Map<String, Object> extraParams) {
      this.customerAcceptance = customerAcceptance;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CustomerAcceptance customerAcceptance;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public MandateData build() {
        return new MandateData(this.customerAcceptance, this.extraParams);
      }

      /** This hash contains details about the customer acceptance of the Mandate. */
      public Builder setCustomerAcceptance(CustomerAcceptance customerAcceptance) {
        this.customerAcceptance = customerAcceptance;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentCreateParams.MandateData#extraParams} for the field documentation.
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
       * See {@link SetupIntentCreateParams.MandateData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    public static class CustomerAcceptance {
      /** The time at which the customer accepted the Mandate. */
      @SerializedName("accepted_at")
      Long acceptedAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * If this is a Mandate accepted offline, this hash contains details about the offline
       * acceptance.
       */
      @SerializedName("offline")
      Offline offline;

      /**
       * If this is a Mandate accepted online, this hash contains details about the online
       * acceptance.
       */
      @SerializedName("online")
      Online online;

      /**
       * The type of customer acceptance information included with the Mandate. One of {@code
       * online} or {@code offline}.
       */
      @SerializedName("type")
      Type type;

      private CustomerAcceptance(
          Long acceptedAt,
          Map<String, Object> extraParams,
          Offline offline,
          Online online,
          Type type) {
        this.acceptedAt = acceptedAt;
        this.extraParams = extraParams;
        this.offline = offline;
        this.online = online;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long acceptedAt;

        private Map<String, Object> extraParams;

        private Offline offline;

        private Online online;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerAcceptance build() {
          return new CustomerAcceptance(
              this.acceptedAt, this.extraParams, this.offline, this.online, this.type);
        }

        /** The time at which the customer accepted the Mandate. */
        public Builder setAcceptedAt(Long acceptedAt) {
          this.acceptedAt = acceptedAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentCreateParams.MandateData.CustomerAcceptance#extraParams} for
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
         * map. See {@link SetupIntentCreateParams.MandateData.CustomerAcceptance#extraParams} for
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
         * If this is a Mandate accepted offline, this hash contains details about the offline
         * acceptance.
         */
        public Builder setOffline(Offline offline) {
          this.offline = offline;
          return this;
        }

        /**
         * If this is a Mandate accepted online, this hash contains details about the online
         * acceptance.
         */
        public Builder setOnline(Online online) {
          this.online = online;
          return this;
        }

        /**
         * The type of customer acceptance information included with the Mandate. One of {@code
         * online} or {@code offline}.
         */
        public Builder setType(Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      public static class Offline {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Offline(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public Offline build() {
            return new Offline(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentCreateParams.MandateData.CustomerAcceptance.Offline#extraParams} for the
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
           * SetupIntentCreateParams.MandateData.CustomerAcceptance.Offline#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }
        }
      }

      @Getter
      public static class Online {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The IP address from which the Mandate was accepted by the customer. */
        @SerializedName("ip_address")
        String ipAddress;

        /** The user agent of the browser from which the Mandate was accepted by the customer. */
        @SerializedName("user_agent")
        String userAgent;

        private Online(Map<String, Object> extraParams, String ipAddress, String userAgent) {
          this.extraParams = extraParams;
          this.ipAddress = ipAddress;
          this.userAgent = userAgent;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String ipAddress;

          private String userAgent;

          /** Finalize and obtain parameter instance from this builder. */
          public Online build() {
            return new Online(this.extraParams, this.ipAddress, this.userAgent);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentCreateParams.MandateData.CustomerAcceptance.Online#extraParams} for the
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
           * SetupIntentCreateParams.MandateData.CustomerAcceptance.Online#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The IP address from which the Mandate was accepted by the customer. */
          public Builder setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
          }

          /** The user agent of the browser from which the Mandate was accepted by the customer. */
          public Builder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("offline")
        OFFLINE("offline"),

        @SerializedName("online")
        ONLINE("online");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  public static class PaymentMethodOptions {
    /**
     * If this is a {@code acss_debit} SetupIntent, this sub-hash contains details about the ACSS
     * Debit payment method options.
     */
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    /** Configuration for any card setup attempted on this SetupIntent. */
    @SerializedName("card")
    Card card;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * If this is a {@code sepa_debit} SetupIntent, this sub-hash contains details about the SEPA
     * Debit payment method options.
     */
    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    private PaymentMethodOptions(
        AcssDebit acssDebit, Card card, Map<String, Object> extraParams, SepaDebit sepaDebit) {
      this.acssDebit = acssDebit;
      this.card = card;
      this.extraParams = extraParams;
      this.sepaDebit = sepaDebit;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AcssDebit acssDebit;

      private Card card;

      private Map<String, Object> extraParams;

      private SepaDebit sepaDebit;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodOptions build() {
        return new PaymentMethodOptions(
            this.acssDebit, this.card, this.extraParams, this.sepaDebit);
      }

      /**
       * If this is a {@code acss_debit} SetupIntent, this sub-hash contains details about the ACSS
       * Debit payment method options.
       */
      public Builder setAcssDebit(AcssDebit acssDebit) {
        this.acssDebit = acssDebit;
        return this;
      }

      /** Configuration for any card setup attempted on this SetupIntent. */
      public Builder setCard(Card card) {
        this.card = card;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentCreateParams.PaymentMethodOptions#extraParams} for the field documentation.
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
       * See {@link SetupIntentCreateParams.PaymentMethodOptions#extraParams} for the field
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
       * If this is a {@code sepa_debit} SetupIntent, this sub-hash contains details about the SEPA
       * Debit payment method options.
       */
      public Builder setSepaDebit(SepaDebit sepaDebit) {
        this.sepaDebit = sepaDebit;
        return this;
      }
    }

    @Getter
    public static class AcssDebit {
      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      Currency currency;

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

      /** Verification method for the intent. */
      @SerializedName("verification_method")
      VerificationMethod verificationMethod;

      private AcssDebit(
          Currency currency,
          Map<String, Object> extraParams,
          MandateOptions mandateOptions,
          VerificationMethod verificationMethod) {
        this.currency = currency;
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
        this.verificationMethod = verificationMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Currency currency;

        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        private VerificationMethod verificationMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public AcssDebit build() {
          return new AcssDebit(
              this.currency, this.extraParams, this.mandateOptions, this.verificationMethod);
        }

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        public Builder setCurrency(Currency currency) {
          this.currency = currency;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for
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
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.AcssDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }

        /** Verification method for the intent. */
        public Builder setVerificationMethod(VerificationMethod verificationMethod) {
          this.verificationMethod = verificationMethod;
          return this;
        }
      }

      @Getter
      public static class MandateOptions {
        /**
         * A URL for custom mandate text to render during confirmation step. The URL will be
         * rendered with additional GET parameters {@code payment_intent} and {@code
         * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
         * and {@code setup_intent_client_secret} when confirming a Setup Intent.
         */
        @SerializedName("custom_mandate_url")
        Object customMandateUrl;

        /** List of Stripe products where this mandate can be selected automatically. */
        @SerializedName("default_for")
        List<DefaultFor> defaultFor;

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
         * Description of the mandate interval. Only required if 'payment_schedule' parameter is
         * 'interval' or 'combined'.
         */
        @SerializedName("interval_description")
        String intervalDescription;

        /** Payment schedule for the mandate. */
        @SerializedName("payment_schedule")
        PaymentSchedule paymentSchedule;

        /** Transaction type of the mandate. */
        @SerializedName("transaction_type")
        TransactionType transactionType;

        private MandateOptions(
            Object customMandateUrl,
            List<DefaultFor> defaultFor,
            Map<String, Object> extraParams,
            String intervalDescription,
            PaymentSchedule paymentSchedule,
            TransactionType transactionType) {
          this.customMandateUrl = customMandateUrl;
          this.defaultFor = defaultFor;
          this.extraParams = extraParams;
          this.intervalDescription = intervalDescription;
          this.paymentSchedule = paymentSchedule;
          this.transactionType = transactionType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object customMandateUrl;

          private List<DefaultFor> defaultFor;

          private Map<String, Object> extraParams;

          private String intervalDescription;

          private PaymentSchedule paymentSchedule;

          private TransactionType transactionType;

          /** Finalize and obtain parameter instance from this builder. */
          public MandateOptions build() {
            return new MandateOptions(
                this.customMandateUrl,
                this.defaultFor,
                this.extraParams,
                this.intervalDescription,
                this.paymentSchedule,
                this.transactionType);
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(String customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * A URL for custom mandate text to render during confirmation step. The URL will be
           * rendered with additional GET parameters {@code payment_intent} and {@code
           * payment_intent_client_secret} when confirming a Payment Intent, or {@code setup_intent}
           * and {@code setup_intent_client_secret} when confirming a Setup Intent.
           */
          public Builder setCustomMandateUrl(EmptyParam customMandateUrl) {
            this.customMandateUrl = customMandateUrl;
            return this;
          }

          /**
           * Add an element to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SetupIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for
           * the field documentation.
           */
          public Builder addDefaultFor(DefaultFor element) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.add(element);
            return this;
          }

          /**
           * Add all elements to `defaultFor` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * SetupIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#defaultFor} for
           * the field documentation.
           */
          public Builder addAllDefaultFor(List<DefaultFor> elements) {
            if (this.defaultFor == null) {
              this.defaultFor = new ArrayList<>();
            }
            this.defaultFor.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for
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
           * SetupIntentCreateParams.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams} for
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
           * Description of the mandate interval. Only required if 'payment_schedule' parameter is
           * 'interval' or 'combined'.
           */
          public Builder setIntervalDescription(String intervalDescription) {
            this.intervalDescription = intervalDescription;
            return this;
          }

          /** Payment schedule for the mandate. */
          public Builder setPaymentSchedule(PaymentSchedule paymentSchedule) {
            this.paymentSchedule = paymentSchedule;
            return this;
          }

          /** Transaction type of the mandate. */
          public Builder setTransactionType(TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
          }
        }

        public enum DefaultFor implements ApiRequestParams.EnumParam {
          @SerializedName("invoice")
          INVOICE("invoice"),

          @SerializedName("subscription")
          SUBSCRIPTION("subscription");

          @Getter(onMethod_ = {@Override})
          private final String value;

          DefaultFor(String value) {
            this.value = value;
          }
        }

        public enum PaymentSchedule implements ApiRequestParams.EnumParam {
          @SerializedName("combined")
          COMBINED("combined"),

          @SerializedName("interval")
          INTERVAL("interval"),

          @SerializedName("sporadic")
          SPORADIC("sporadic");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentSchedule(String value) {
            this.value = value;
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

      public enum Currency implements ApiRequestParams.EnumParam {
        @SerializedName("cad")
        CAD("cad"),

        @SerializedName("usd")
        USD("usd");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Currency(String value) {
          this.value = value;
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
    public static class Card {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * When specified, this parameter signals that a card has been collected as MOTO (Mail Order
       * Telephone Order) and thus out of scope for SCA. This parameter can only be provided during
       * confirmation.
       */
      @SerializedName("moto")
      Boolean moto;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. Permitted values include: {@code automatic} or {@code any}. If not
       * provided, defaults to {@code automatic}. Read our guide on <a
       * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
       * Secure</a> for more information on how this configuration interacts with Radar and our SCA
       * Engine.
       */
      @SerializedName("request_three_d_secure")
      RequestThreeDSecure requestThreeDSecure;

      private Card(
          Map<String, Object> extraParams, Boolean moto, RequestThreeDSecure requestThreeDSecure) {
        this.extraParams = extraParams;
        this.moto = moto;
        this.requestThreeDSecure = requestThreeDSecure;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Boolean moto;

        private RequestThreeDSecure requestThreeDSecure;

        /** Finalize and obtain parameter instance from this builder. */
        public Card build() {
          return new Card(this.extraParams, this.moto, this.requestThreeDSecure);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.Card#extraParams} for the
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
         * When specified, this parameter signals that a card has been collected as MOTO (Mail Order
         * Telephone Order) and thus out of scope for SCA. This parameter can only be provided
         * during confirmation.
         */
        public Builder setMoto(Boolean moto) {
          this.moto = moto;
          return this;
        }

        /**
         * We strongly recommend that you rely on our SCA Engine to automatically prompt your
         * customers for authentication based on risk level and <a
         * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
         * However, if you wish to request 3D Secure based on logic from your own fraud engine,
         * provide this option. Permitted values include: {@code automatic} or {@code any}. If not
         * provided, defaults to {@code automatic}. Read our guide on <a
         * href="https://stripe.com/docs/payments/3d-secure#manual-three-ds">manually requesting 3D
         * Secure</a> for more information on how this configuration interacts with Radar and our
         * SCA Engine.
         */
        public Builder setRequestThreeDSecure(RequestThreeDSecure requestThreeDSecure) {
          this.requestThreeDSecure = requestThreeDSecure;
          return this;
        }
      }

      public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
        @SerializedName("any")
        ANY("any"),

        @SerializedName("automatic")
        AUTOMATIC("automatic");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RequestThreeDSecure(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class SepaDebit {
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

      private SepaDebit(Map<String, Object> extraParams, MandateOptions mandateOptions) {
        this.extraParams = extraParams;
        this.mandateOptions = mandateOptions;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MandateOptions mandateOptions;

        /** Finalize and obtain parameter instance from this builder. */
        public SepaDebit build() {
          return new SepaDebit(this.extraParams, this.mandateOptions);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for
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
         * map. See {@link SetupIntentCreateParams.PaymentMethodOptions.SepaDebit#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Additional fields for Mandate creation. */
        public Builder setMandateOptions(MandateOptions mandateOptions) {
          this.mandateOptions = mandateOptions;
          return this;
        }
      }

      @Getter
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

        private MandateOptions(Map<String, Object> extraParams) {
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public MandateOptions build() {
            return new MandateOptions(this.extraParams);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * SetupIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams} for
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
           * SetupIntentCreateParams.PaymentMethodOptions.SepaDebit.MandateOptions#extraParams} for
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
      }
    }
  }

  @Getter
  public static class SingleUse {
    /**
     * Amount the customer is granting permission to collect later. A positive integer representing
     * how much to charge in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest
     * currency unit</a> (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal
     * currency). The minimum amount is $0.50 US or <a
     * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
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

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private SingleUse(Long amount, String currency, Map<String, Object> extraParams) {
      this.amount = amount;
      this.currency = currency;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SingleUse build() {
        return new SingleUse(this.amount, this.currency, this.extraParams);
      }

      /**
       * Amount the customer is granting permission to collect later. A positive integer
       * representing how much to charge in the <a
       * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a> (e.g.,
       * 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum
       * amount is $0.50 US or <a
       * href="https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts">equivalent in
       * charge currency</a>. The amount value supports up to eight digits (e.g., a value of
       * 99999999 for a USD charge of $999,999.99).
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SetupIntentCreateParams.SingleUse#extraParams} for the field documentation.
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
       * See {@link SetupIntentCreateParams.SingleUse#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum Usage implements ApiRequestParams.EnumParam {
    @SerializedName("off_session")
    OFF_SESSION("off_session"),

    @SerializedName("on_session")
    ON_SESSION("on_session");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Usage(String value) {
      this.value = value;
    }
  }
}
