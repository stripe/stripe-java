package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SetupIntentCreateParams extends ApiRequestParams {
  /**
   * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults to
   * `false`. If the payment method attached is a card, a return_url may be provided in case
   * additional authentication is required.
   */
  @SerializedName("confirm")
  Boolean confirm;

  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * <p>If present, payment methods used with this SetupIntent can only be attached to this
   * Customer, and payment methods attached to other Customers cannot be used with this SetupIntent.
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
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The Stripe account ID for which this SetupIntent is created. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to attach
   * to this SetupIntent.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** Payment-method-specific configuration for this SetupIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /**
   * The list of payment method types (e.g. card) that this SetupIntent is allowed to use. If this
   * is not provided, defaults to ["card"].
   */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /**
   * The URL to redirect your customer back to after they authenticate or cancel their payment on
   * the payment method's app or site. If you'd prefer to redirect to a mobile application, you can
   * alternatively supply an application URI scheme. This parameter can only be used with
   * [`confirm=true`](https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm).
   */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * Indicates how the payment method is intended to be used in the future. If not provided, this
   * value defaults to `off_session`.
   */
  @SerializedName("usage")
  Object usage;

  private SetupIntentCreateParams(
      Boolean confirm,
      String customer,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      PaymentMethodOptions paymentMethodOptions,
      List<String> paymentMethodTypes,
      String returnUrl,
      Object usage) {
    this.confirm = confirm;
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.paymentMethodOptions = paymentMethodOptions;
    this.paymentMethodTypes = paymentMethodTypes;
    this.returnUrl = returnUrl;
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

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private PaymentMethodOptions paymentMethodOptions;

    private List<String> paymentMethodTypes;

    private String returnUrl;

    private Object usage;

    /** Finalize and obtain parameter instance from this builder. */
    public SetupIntentCreateParams build() {
      return new SetupIntentCreateParams(
          this.confirm,
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
          this.paymentMethodOptions,
          this.paymentMethodTypes,
          this.returnUrl,
          this.usage);
    }

    /**
     * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults to
     * `false`. If the payment method attached is a card, a return_url may be provided in case
     * additional authentication is required.
     */
    public Builder setConfirm(Boolean confirm) {
      this.confirm = confirm;
      return this;
    }

    /**
     * ID of the Customer this SetupIntent belongs to, if one exists.
     *
     * <p>If present, payment methods used with this SetupIntent can only be attached to this
     * Customer, and payment methods attached to other Customers cannot be used with this
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
     * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object) to
     * attach to this SetupIntent.
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
     * can alternatively supply an application URI scheme. This parameter can only be used with
     * [`confirm=true`](https://stripe.com/docs/api/setup_intents/create#create_setup_intent-confirm).
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * Indicates how the payment method is intended to be used in the future. If not provided, this
     * value defaults to `off_session`.
     */
    public Builder setUsage(Usage usage) {
      this.usage = usage;
      return this;
    }

    /**
     * Indicates how the payment method is intended to be used in the future. If not provided, this
     * value defaults to `off_session`.
     */
    public Builder setUsage(String usage) {
      this.usage = usage;
      return this;
    }
  }

  @Getter
  public static class PaymentMethodOptions {
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

    private PaymentMethodOptions(Card card, Map<String, Object> extraParams) {
      this.card = card;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Card card;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodOptions build() {
        return new PaymentMethodOptions(this.card, this.extraParams);
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
       * customers for authentication based on risk level and [other
       * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you wish
       * to request 3D Secure based on logic from your own fraud engine, provide this option.
       * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
       * Read our guide on [manually requesting 3D
       * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information on
       * how this configuration interacts with Radar and our SCA Engine.
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
         * customers for authentication based on risk level and [other
         * requirements](https://stripe.com/docs/strong-customer-authentication). However, if you
         * wish to request 3D Secure based on logic from your own fraud engine, provide this option.
         * Permitted values include: `automatic` or `any`. If not provided, defaults to `automatic`.
         * Read our guide on [manually requesting 3D
         * Secure](https://stripe.com/docs/payments/3d-secure#manual-three-ds) for more information
         * on how this configuration interacts with Radar and our SCA Engine.
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
