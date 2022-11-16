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
public class PaymentLinkUpdateParams extends ApiRequestParams {
  /**
   * Whether the payment link's {@code url} is active. If {@code false}, customers visiting the URL
   * will be shown a page saying that the link has been deactivated.
   */
  @SerializedName("active")
  Boolean active;

  /** Behavior after the purchase is complete. */
  @SerializedName("after_completion")
  AfterCompletion afterCompletion;

  /** Enables user redeemable promotion codes. */
  @SerializedName("allow_promotion_codes")
  Boolean allowPromotionCodes;

  /** Configuration for automatic tax collection. */
  @SerializedName("automatic_tax")
  AutomaticTax automaticTax;

  /** Configuration for collecting the customer's billing address. */
  @SerializedName("billing_address_collection")
  BillingAddressCollection billingAddressCollection;

  /** Display additional text for your customers using custom text. */
  @SerializedName("custom_text")
  CustomText customText;

  /**
   * Configures whether <a href="https://stripe.com/docs/api/checkout/sessions">checkout
   * sessions</a> created by this payment link create a <a
   * href="https://stripe.com/docs/api/customers">Customer</a>.
   */
  @SerializedName("customer_creation")
  CustomerCreation customerCreation;

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
   * The line items representing what is being sold. Each line item represents an item being sold.
   * Up to 20 line items are supported.
   */
  @SerializedName("line_items")
  List<PaymentLinkUpdateParams.LineItem> lineItems;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}. Metadata associated with this Payment
   * Link will automatically be copied to <a
   * href="https://stripe.com/docs/api/checkout/sessions">checkout sessions</a> created by this
   * payment link.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Specify whether Checkout should collect a payment method. When set to {@code if_required},
   * Checkout will not collect a payment method when the total due for the session is 0.This may
   * occur if the Checkout Session includes a free trial or a discount.
   *
   * <p>Can only be set in {@code subscription} mode.
   *
   * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
   * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
   * subscriptions with a free trial</a>.
   */
  @SerializedName("payment_method_collection")
  PaymentMethodCollection paymentMethodCollection;

  /**
   * The list of payment method types that customers can use. Pass an empty string to enable
   * automatic payment methods that use your <a
   * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
   */
  @SerializedName("payment_method_types")
  Object paymentMethodTypes;

  /** Configuration for collecting the customer's shipping address. */
  @SerializedName("shipping_address_collection")
  Object shippingAddressCollection;

  private PaymentLinkUpdateParams(
      Boolean active,
      AfterCompletion afterCompletion,
      Boolean allowPromotionCodes,
      AutomaticTax automaticTax,
      BillingAddressCollection billingAddressCollection,
      CustomText customText,
      CustomerCreation customerCreation,
      List<String> expand,
      Map<String, Object> extraParams,
      List<PaymentLinkUpdateParams.LineItem> lineItems,
      Map<String, String> metadata,
      PaymentMethodCollection paymentMethodCollection,
      Object paymentMethodTypes,
      Object shippingAddressCollection) {
    this.active = active;
    this.afterCompletion = afterCompletion;
    this.allowPromotionCodes = allowPromotionCodes;
    this.automaticTax = automaticTax;
    this.billingAddressCollection = billingAddressCollection;
    this.customText = customText;
    this.customerCreation = customerCreation;
    this.expand = expand;
    this.extraParams = extraParams;
    this.lineItems = lineItems;
    this.metadata = metadata;
    this.paymentMethodCollection = paymentMethodCollection;
    this.paymentMethodTypes = paymentMethodTypes;
    this.shippingAddressCollection = shippingAddressCollection;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean active;

    private AfterCompletion afterCompletion;

    private Boolean allowPromotionCodes;

    private AutomaticTax automaticTax;

    private BillingAddressCollection billingAddressCollection;

    private CustomText customText;

    private CustomerCreation customerCreation;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private List<PaymentLinkUpdateParams.LineItem> lineItems;

    private Map<String, String> metadata;

    private PaymentMethodCollection paymentMethodCollection;

    private Object paymentMethodTypes;

    private Object shippingAddressCollection;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentLinkUpdateParams build() {
      return new PaymentLinkUpdateParams(
          this.active,
          this.afterCompletion,
          this.allowPromotionCodes,
          this.automaticTax,
          this.billingAddressCollection,
          this.customText,
          this.customerCreation,
          this.expand,
          this.extraParams,
          this.lineItems,
          this.metadata,
          this.paymentMethodCollection,
          this.paymentMethodTypes,
          this.shippingAddressCollection);
    }

    /**
     * Whether the payment link's {@code url} is active. If {@code false}, customers visiting the
     * URL will be shown a page saying that the link has been deactivated.
     */
    public Builder setActive(Boolean active) {
      this.active = active;
      return this;
    }

    /** Behavior after the purchase is complete. */
    public Builder setAfterCompletion(PaymentLinkUpdateParams.AfterCompletion afterCompletion) {
      this.afterCompletion = afterCompletion;
      return this;
    }

    /** Enables user redeemable promotion codes. */
    public Builder setAllowPromotionCodes(Boolean allowPromotionCodes) {
      this.allowPromotionCodes = allowPromotionCodes;
      return this;
    }

    /** Configuration for automatic tax collection. */
    public Builder setAutomaticTax(PaymentLinkUpdateParams.AutomaticTax automaticTax) {
      this.automaticTax = automaticTax;
      return this;
    }

    /** Configuration for collecting the customer's billing address. */
    public Builder setBillingAddressCollection(
        PaymentLinkUpdateParams.BillingAddressCollection billingAddressCollection) {
      this.billingAddressCollection = billingAddressCollection;
      return this;
    }

    /** Display additional text for your customers using custom text. */
    public Builder setCustomText(PaymentLinkUpdateParams.CustomText customText) {
      this.customText = customText;
      return this;
    }

    /**
     * Configures whether <a href="https://stripe.com/docs/api/checkout/sessions">checkout
     * sessions</a> created by this payment link create a <a
     * href="https://stripe.com/docs/api/customers">Customer</a>.
     */
    public Builder setCustomerCreation(PaymentLinkUpdateParams.CustomerCreation customerCreation) {
      this.customerCreation = customerCreation;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#expand} for the field documentation.
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
     * PaymentLinkUpdateParams#expand} for the field documentation.
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
     * PaymentLinkUpdateParams#extraParams} for the field documentation.
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
     * See {@link PaymentLinkUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#lineItems} for the field documentation.
     */
    public Builder addLineItem(PaymentLinkUpdateParams.LineItem element) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.add(element);
      return this;
    }

    /**
     * Add all elements to `lineItems` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#lineItems} for the field documentation.
     */
    public Builder addAllLineItem(List<PaymentLinkUpdateParams.LineItem> elements) {
      if (this.lineItems == null) {
        this.lineItems = new ArrayList<>();
      }
      this.lineItems.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentLinkUpdateParams#metadata} for the field documentation.
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
     * See {@link PaymentLinkUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Specify whether Checkout should collect a payment method. When set to {@code if_required},
     * Checkout will not collect a payment method when the total due for the session is 0.This may
     * occur if the Checkout Session includes a free trial or a discount.
     *
     * <p>Can only be set in {@code subscription} mode.
     *
     * <p>If you'd like information on how to collect a payment method outside of Checkout, read the
     * guide on <a href="https://stripe.com/docs/payments/checkout/free-trials">configuring
     * subscriptions with a free trial</a>.
     */
    public Builder setPaymentMethodCollection(
        PaymentLinkUpdateParams.PaymentMethodCollection paymentMethodCollection) {
      this.paymentMethodCollection = paymentMethodCollection;
      return this;
    }

    /**
     * Add an element to `paymentMethodTypes` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * PaymentLinkUpdateParams#paymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addPaymentMethodType(PaymentLinkUpdateParams.PaymentMethodType element) {
      if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
        this.paymentMethodTypes = new ArrayList<PaymentLinkUpdateParams.PaymentMethodType>();
      }
      ((List<PaymentLinkUpdateParams.PaymentMethodType>) this.paymentMethodTypes).add(element);
      return this;
    }

    /**
     * Add all elements to `paymentMethodTypes` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link PaymentLinkUpdateParams#paymentMethodTypes} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder addAllPaymentMethodType(
        List<PaymentLinkUpdateParams.PaymentMethodType> elements) {
      if (this.paymentMethodTypes == null || this.paymentMethodTypes instanceof EmptyParam) {
        this.paymentMethodTypes = new ArrayList<PaymentLinkUpdateParams.PaymentMethodType>();
      }
      ((List<PaymentLinkUpdateParams.PaymentMethodType>) this.paymentMethodTypes).addAll(elements);
      return this;
    }

    /**
     * The list of payment method types that customers can use. Pass an empty string to enable
     * automatic payment methods that use your <a
     * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
     */
    public Builder setPaymentMethodTypes(EmptyParam paymentMethodTypes) {
      this.paymentMethodTypes = paymentMethodTypes;
      return this;
    }

    /**
     * The list of payment method types that customers can use. Pass an empty string to enable
     * automatic payment methods that use your <a
     * href="https://dashboard.stripe.com/settings/payment_methods">payment method settings</a>.
     */
    public Builder setPaymentMethodTypes(
        List<PaymentLinkUpdateParams.PaymentMethodType> paymentMethodTypes) {
      this.paymentMethodTypes = paymentMethodTypes;
      return this;
    }

    /** Configuration for collecting the customer's shipping address. */
    public Builder setShippingAddressCollection(
        PaymentLinkUpdateParams.ShippingAddressCollection shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }

    /** Configuration for collecting the customer's shipping address. */
    public Builder setShippingAddressCollection(EmptyParam shippingAddressCollection) {
      this.shippingAddressCollection = shippingAddressCollection;
      return this;
    }
  }

  @Getter
  public static class AfterCompletion {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration when {@code type=hosted_confirmation}. */
    @SerializedName("hosted_confirmation")
    HostedConfirmation hostedConfirmation;

    /** Configuration when {@code type=redirect}. */
    @SerializedName("redirect")
    Redirect redirect;

    /**
     * The specified behavior after the purchase is complete. Either {@code redirect} or {@code
     * hosted_confirmation}.
     */
    @SerializedName("type")
    Type type;

    private AfterCompletion(
        Map<String, Object> extraParams,
        HostedConfirmation hostedConfirmation,
        Redirect redirect,
        Type type) {
      this.extraParams = extraParams;
      this.hostedConfirmation = hostedConfirmation;
      this.redirect = redirect;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private HostedConfirmation hostedConfirmation;

      private Redirect redirect;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.AfterCompletion build() {
        return new PaymentLinkUpdateParams.AfterCompletion(
            this.extraParams, this.hostedConfirmation, this.redirect, this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.AfterCompletion#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.AfterCompletion#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configuration when {@code type=hosted_confirmation}. */
      public Builder setHostedConfirmation(
          PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation hostedConfirmation) {
        this.hostedConfirmation = hostedConfirmation;
        return this;
      }

      /** Configuration when {@code type=redirect}. */
      public Builder setRedirect(PaymentLinkUpdateParams.AfterCompletion.Redirect redirect) {
        this.redirect = redirect;
        return this;
      }

      /**
       * The specified behavior after the purchase is complete. Either {@code redirect} or {@code
       * hosted_confirmation}.
       */
      public Builder setType(PaymentLinkUpdateParams.AfterCompletion.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    public static class HostedConfirmation {
      /** A custom message to display to the customer after the purchase is complete. */
      @SerializedName("custom_message")
      Object customMessage;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private HostedConfirmation(Object customMessage, Map<String, Object> extraParams) {
        this.customMessage = customMessage;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object customMessage;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation build() {
          return new PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation(
              this.customMessage, this.extraParams);
        }

        /** A custom message to display to the customer after the purchase is complete. */
        public Builder setCustomMessage(String customMessage) {
          this.customMessage = customMessage;
          return this;
        }

        /** A custom message to display to the customer after the purchase is complete. */
        public Builder setCustomMessage(EmptyParam customMessage) {
          this.customMessage = customMessage;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation#extraParams}
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
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.HostedConfirmation#extraParams}
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
    }

    @Getter
    public static class Redirect {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The URL the customer will be redirected to after the purchase is complete. You can embed
       * {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code id} of the completed <a
       * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
       * session</a> included.
       */
      @SerializedName("url")
      Object url;

      private Redirect(Map<String, Object> extraParams, Object url) {
        this.extraParams = extraParams;
        this.url = url;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object url;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.AfterCompletion.Redirect build() {
          return new PaymentLinkUpdateParams.AfterCompletion.Redirect(this.extraParams, this.url);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.Redirect#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.AfterCompletion.Redirect#extraParams} for the
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
         * The URL the customer will be redirected to after the purchase is complete. You can embed
         * {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code id} of the completed <a
         * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
         * session</a> included.
         */
        public Builder setUrl(String url) {
          this.url = url;
          return this;
        }

        /**
         * The URL the customer will be redirected to after the purchase is complete. You can embed
         * {@code {CHECKOUT_SESSION_ID}} into the URL to have the {@code id} of the completed <a
         * href="https://stripe.com/docs/api/checkout/sessions/object#checkout_session_object-id">checkout
         * session</a> included.
         */
        public Builder setUrl(EmptyParam url) {
          this.url = url;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("hosted_confirmation")
      HOSTED_CONFIRMATION("hosted_confirmation"),

      @SerializedName("redirect")
      REDIRECT("redirect");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class AutomaticTax {
    /** If {@code true}, tax will be calculated automatically using the customer's location. */
    @SerializedName("enabled")
    Boolean enabled;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AutomaticTax(Boolean enabled, Map<String, Object> extraParams) {
      this.enabled = enabled;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean enabled;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.AutomaticTax build() {
        return new PaymentLinkUpdateParams.AutomaticTax(this.enabled, this.extraParams);
      }

      /** If {@code true}, tax will be calculated automatically using the customer's location. */
      public Builder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.AutomaticTax#extraParams} for the field documentation.
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
  public static class CustomText {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Custom text that should be displayed alongside shipping address collection. */
    @SerializedName("shipping_address")
    Object shippingAddress;

    /** Custom text that should be displayed alongside the payment confirmation button. */
    @SerializedName("submit")
    Object submit;

    private CustomText(Map<String, Object> extraParams, Object shippingAddress, Object submit) {
      this.extraParams = extraParams;
      this.shippingAddress = shippingAddress;
      this.submit = submit;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Object shippingAddress;

      private Object submit;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.CustomText build() {
        return new PaymentLinkUpdateParams.CustomText(
            this.extraParams, this.shippingAddress, this.submit);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.CustomText#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.CustomText#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(
          PaymentLinkUpdateParams.CustomText.ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside shipping address collection. */
      public Builder setShippingAddress(EmptyParam shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(PaymentLinkUpdateParams.CustomText.Submit submit) {
        this.submit = submit;
        return this;
      }

      /** Custom text that should be displayed alongside the payment confirmation button. */
      public Builder setSubmit(EmptyParam submit) {
        this.submit = submit;
        return this;
      }
    }

    @Getter
    public static class ShippingAddress {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Text may be up to 500 characters in length. */
      @SerializedName("message")
      Object message;

      private ShippingAddress(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.ShippingAddress build() {
          return new PaymentLinkUpdateParams.CustomText.ShippingAddress(
              this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.ShippingAddress#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.ShippingAddress#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Text may be up to 500 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }

        /** Text may be up to 500 characters in length. */
        public Builder setMessage(EmptyParam message) {
          this.message = message;
          return this;
        }
      }
    }

    @Getter
    public static class Submit {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Text may be up to 500 characters in length. */
      @SerializedName("message")
      Object message;

      private Submit(Map<String, Object> extraParams, Object message) {
        this.extraParams = extraParams;
        this.message = message;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Object message;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.CustomText.Submit build() {
          return new PaymentLinkUpdateParams.CustomText.Submit(this.extraParams, this.message);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.CustomText.Submit#extraParams} for the field
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
         * map. See {@link PaymentLinkUpdateParams.CustomText.Submit#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Text may be up to 500 characters in length. */
        public Builder setMessage(String message) {
          this.message = message;
          return this;
        }

        /** Text may be up to 500 characters in length. */
        public Builder setMessage(EmptyParam message) {
          this.message = message;
          return this;
        }
      }
    }
  }

  @Getter
  public static class LineItem {
    /**
     * When set, provides configuration for this item’s quantity to be adjusted by the customer
     * during checkout.
     */
    @SerializedName("adjustable_quantity")
    AdjustableQuantity adjustableQuantity;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of an existing line item on the payment link. */
    @SerializedName("id")
    Object id;

    /** The quantity of the line item being purchased. */
    @SerializedName("quantity")
    Long quantity;

    private LineItem(
        AdjustableQuantity adjustableQuantity,
        Map<String, Object> extraParams,
        Object id,
        Long quantity) {
      this.adjustableQuantity = adjustableQuantity;
      this.extraParams = extraParams;
      this.id = id;
      this.quantity = quantity;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AdjustableQuantity adjustableQuantity;

      private Map<String, Object> extraParams;

      private Object id;

      private Long quantity;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.LineItem build() {
        return new PaymentLinkUpdateParams.LineItem(
            this.adjustableQuantity, this.extraParams, this.id, this.quantity);
      }

      /**
       * When set, provides configuration for this item’s quantity to be adjusted by the customer
       * during checkout.
       */
      public Builder setAdjustableQuantity(
          PaymentLinkUpdateParams.LineItem.AdjustableQuantity adjustableQuantity) {
        this.adjustableQuantity = adjustableQuantity;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.LineItem#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.LineItem#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of an existing line item on the payment link. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The ID of an existing line item on the payment link. */
      public Builder setId(EmptyParam id) {
        this.id = id;
        return this;
      }

      /** The quantity of the line item being purchased. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }
    }

    @Getter
    public static class AdjustableQuantity {
      /** Set to true if the quantity can be adjusted to any non-negative Integer. */
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
       * The maximum quantity the customer can purchase. By default this value is 99. You can
       * specify a value up to 99.
       */
      @SerializedName("maximum")
      Long maximum;

      /**
       * The minimum quantity the customer can purchase. By default this value is 0. You can specify
       * a value up to 98. If there is only one item in the cart then that item's quantity cannot go
       * down to 0.
       */
      @SerializedName("minimum")
      Long minimum;

      private AdjustableQuantity(
          Boolean enabled, Map<String, Object> extraParams, Long maximum, Long minimum) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.maximum = maximum;
        this.minimum = minimum;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Long maximum;

        private Long minimum;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentLinkUpdateParams.LineItem.AdjustableQuantity build() {
          return new PaymentLinkUpdateParams.LineItem.AdjustableQuantity(
              this.enabled, this.extraParams, this.maximum, this.minimum);
        }

        /** Set to true if the quantity can be adjusted to any non-negative Integer. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentLinkUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
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
         * map. See {@link PaymentLinkUpdateParams.LineItem.AdjustableQuantity#extraParams} for the
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
         * The maximum quantity the customer can purchase. By default this value is 99. You can
         * specify a value up to 99.
         */
        public Builder setMaximum(Long maximum) {
          this.maximum = maximum;
          return this;
        }

        /**
         * The minimum quantity the customer can purchase. By default this value is 0. You can
         * specify a value up to 98. If there is only one item in the cart then that item's quantity
         * cannot go down to 0.
         */
        public Builder setMinimum(Long minimum) {
          this.minimum = minimum;
          return this;
        }
      }
    }
  }

  @Getter
  public static class ShippingAddressCollection {
    /**
     * An array of two-letter ISO country codes representing which countries Checkout should provide
     * as options for shipping locations. Unsupported country codes: {@code AS, CX, CC, CU, HM, IR,
     * KP, MH, FM, NF, MP, PW, SD, SY, UM, VI}.
     */
    @SerializedName("allowed_countries")
    List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> allowedCountries;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ShippingAddressCollection(
        List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> allowedCountries,
        Map<String, Object> extraParams) {
      this.allowedCountries = allowedCountries;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry>
          allowedCountries;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentLinkUpdateParams.ShippingAddressCollection build() {
        return new PaymentLinkUpdateParams.ShippingAddressCollection(
            this.allowedCountries, this.extraParams);
      }

      /**
       * Add an element to `allowedCountries` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * PaymentLinkUpdateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllowedCountry(
          PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry element) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.add(element);
        return this;
      }

      /**
       * Add all elements to `allowedCountries` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link PaymentLinkUpdateParams.ShippingAddressCollection#allowedCountries} for the field
       * documentation.
       */
      public Builder addAllAllowedCountry(
          List<PaymentLinkUpdateParams.ShippingAddressCollection.AllowedCountry> elements) {
        if (this.allowedCountries == null) {
          this.allowedCountries = new ArrayList<>();
        }
        this.allowedCountries.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentLinkUpdateParams.ShippingAddressCollection#extraParams} for the field documentation.
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
       * See {@link PaymentLinkUpdateParams.ShippingAddressCollection#extraParams} for the field
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

    public enum AllowedCountry implements ApiRequestParams.EnumParam {
      @SerializedName("AC")
      AC("AC"),

      @SerializedName("AD")
      AD("AD"),

      @SerializedName("AE")
      AE("AE"),

      @SerializedName("AF")
      AF("AF"),

      @SerializedName("AG")
      AG("AG"),

      @SerializedName("AI")
      AI("AI"),

      @SerializedName("AL")
      AL("AL"),

      @SerializedName("AM")
      AM("AM"),

      @SerializedName("AO")
      AO("AO"),

      @SerializedName("AQ")
      AQ("AQ"),

      @SerializedName("AR")
      AR("AR"),

      @SerializedName("AT")
      AT("AT"),

      @SerializedName("AU")
      AU("AU"),

      @SerializedName("AW")
      AW("AW"),

      @SerializedName("AX")
      AX("AX"),

      @SerializedName("AZ")
      AZ("AZ"),

      @SerializedName("BA")
      BA("BA"),

      @SerializedName("BB")
      BB("BB"),

      @SerializedName("BD")
      BD("BD"),

      @SerializedName("BE")
      BE("BE"),

      @SerializedName("BF")
      BF("BF"),

      @SerializedName("BG")
      BG("BG"),

      @SerializedName("BH")
      BH("BH"),

      @SerializedName("BI")
      BI("BI"),

      @SerializedName("BJ")
      BJ("BJ"),

      @SerializedName("BL")
      BL("BL"),

      @SerializedName("BM")
      BM("BM"),

      @SerializedName("BN")
      BN("BN"),

      @SerializedName("BO")
      BO("BO"),

      @SerializedName("BQ")
      BQ("BQ"),

      @SerializedName("BR")
      BR("BR"),

      @SerializedName("BS")
      BS("BS"),

      @SerializedName("BT")
      BT("BT"),

      @SerializedName("BV")
      BV("BV"),

      @SerializedName("BW")
      BW("BW"),

      @SerializedName("BY")
      BY("BY"),

      @SerializedName("BZ")
      BZ("BZ"),

      @SerializedName("CA")
      CA("CA"),

      @SerializedName("CD")
      CD("CD"),

      @SerializedName("CF")
      CF("CF"),

      @SerializedName("CG")
      CG("CG"),

      @SerializedName("CH")
      CH("CH"),

      @SerializedName("CI")
      CI("CI"),

      @SerializedName("CK")
      CK("CK"),

      @SerializedName("CL")
      CL("CL"),

      @SerializedName("CM")
      CM("CM"),

      @SerializedName("CN")
      CN("CN"),

      @SerializedName("CO")
      CO("CO"),

      @SerializedName("CR")
      CR("CR"),

      @SerializedName("CV")
      CV("CV"),

      @SerializedName("CW")
      CW("CW"),

      @SerializedName("CY")
      CY("CY"),

      @SerializedName("CZ")
      CZ("CZ"),

      @SerializedName("DE")
      DE("DE"),

      @SerializedName("DJ")
      DJ("DJ"),

      @SerializedName("DK")
      DK("DK"),

      @SerializedName("DM")
      DM("DM"),

      @SerializedName("DO")
      DO("DO"),

      @SerializedName("DZ")
      DZ("DZ"),

      @SerializedName("EC")
      EC("EC"),

      @SerializedName("EE")
      EE("EE"),

      @SerializedName("EG")
      EG("EG"),

      @SerializedName("EH")
      EH("EH"),

      @SerializedName("ER")
      ER("ER"),

      @SerializedName("ES")
      ES("ES"),

      @SerializedName("ET")
      ET("ET"),

      @SerializedName("FI")
      FI("FI"),

      @SerializedName("FJ")
      FJ("FJ"),

      @SerializedName("FK")
      FK("FK"),

      @SerializedName("FO")
      FO("FO"),

      @SerializedName("FR")
      FR("FR"),

      @SerializedName("GA")
      GA("GA"),

      @SerializedName("GB")
      GB("GB"),

      @SerializedName("GD")
      GD("GD"),

      @SerializedName("GE")
      GE("GE"),

      @SerializedName("GF")
      GF("GF"),

      @SerializedName("GG")
      GG("GG"),

      @SerializedName("GH")
      GH("GH"),

      @SerializedName("GI")
      GI("GI"),

      @SerializedName("GL")
      GL("GL"),

      @SerializedName("GM")
      GM("GM"),

      @SerializedName("GN")
      GN("GN"),

      @SerializedName("GP")
      GP("GP"),

      @SerializedName("GQ")
      GQ("GQ"),

      @SerializedName("GR")
      GR("GR"),

      @SerializedName("GS")
      GS("GS"),

      @SerializedName("GT")
      GT("GT"),

      @SerializedName("GU")
      GU("GU"),

      @SerializedName("GW")
      GW("GW"),

      @SerializedName("GY")
      GY("GY"),

      @SerializedName("HK")
      HK("HK"),

      @SerializedName("HN")
      HN("HN"),

      @SerializedName("HR")
      HR("HR"),

      @SerializedName("HT")
      HT("HT"),

      @SerializedName("HU")
      HU("HU"),

      @SerializedName("ID")
      ID("ID"),

      @SerializedName("IE")
      IE("IE"),

      @SerializedName("IL")
      IL("IL"),

      @SerializedName("IM")
      IM("IM"),

      @SerializedName("IN")
      IN("IN"),

      @SerializedName("IO")
      IO("IO"),

      @SerializedName("IQ")
      IQ("IQ"),

      @SerializedName("IS")
      IS("IS"),

      @SerializedName("IT")
      IT("IT"),

      @SerializedName("JE")
      JE("JE"),

      @SerializedName("JM")
      JM("JM"),

      @SerializedName("JO")
      JO("JO"),

      @SerializedName("JP")
      JP("JP"),

      @SerializedName("KE")
      KE("KE"),

      @SerializedName("KG")
      KG("KG"),

      @SerializedName("KH")
      KH("KH"),

      @SerializedName("KI")
      KI("KI"),

      @SerializedName("KM")
      KM("KM"),

      @SerializedName("KN")
      KN("KN"),

      @SerializedName("KR")
      KR("KR"),

      @SerializedName("KW")
      KW("KW"),

      @SerializedName("KY")
      KY("KY"),

      @SerializedName("KZ")
      KZ("KZ"),

      @SerializedName("LA")
      LA("LA"),

      @SerializedName("LB")
      LB("LB"),

      @SerializedName("LC")
      LC("LC"),

      @SerializedName("LI")
      LI("LI"),

      @SerializedName("LK")
      LK("LK"),

      @SerializedName("LR")
      LR("LR"),

      @SerializedName("LS")
      LS("LS"),

      @SerializedName("LT")
      LT("LT"),

      @SerializedName("LU")
      LU("LU"),

      @SerializedName("LV")
      LV("LV"),

      @SerializedName("LY")
      LY("LY"),

      @SerializedName("MA")
      MA("MA"),

      @SerializedName("MC")
      MC("MC"),

      @SerializedName("MD")
      MD("MD"),

      @SerializedName("ME")
      ME("ME"),

      @SerializedName("MF")
      MF("MF"),

      @SerializedName("MG")
      MG("MG"),

      @SerializedName("MK")
      MK("MK"),

      @SerializedName("ML")
      ML("ML"),

      @SerializedName("MM")
      MM("MM"),

      @SerializedName("MN")
      MN("MN"),

      @SerializedName("MO")
      MO("MO"),

      @SerializedName("MQ")
      MQ("MQ"),

      @SerializedName("MR")
      MR("MR"),

      @SerializedName("MS")
      MS("MS"),

      @SerializedName("MT")
      MT("MT"),

      @SerializedName("MU")
      MU("MU"),

      @SerializedName("MV")
      MV("MV"),

      @SerializedName("MW")
      MW("MW"),

      @SerializedName("MX")
      MX("MX"),

      @SerializedName("MY")
      MY("MY"),

      @SerializedName("MZ")
      MZ("MZ"),

      @SerializedName("NA")
      NA("NA"),

      @SerializedName("NC")
      NC("NC"),

      @SerializedName("NE")
      NE("NE"),

      @SerializedName("NG")
      NG("NG"),

      @SerializedName("NI")
      NI("NI"),

      @SerializedName("NL")
      NL("NL"),

      @SerializedName("NO")
      NO("NO"),

      @SerializedName("NP")
      NP("NP"),

      @SerializedName("NR")
      NR("NR"),

      @SerializedName("NU")
      NU("NU"),

      @SerializedName("NZ")
      NZ("NZ"),

      @SerializedName("OM")
      OM("OM"),

      @SerializedName("PA")
      PA("PA"),

      @SerializedName("PE")
      PE("PE"),

      @SerializedName("PF")
      PF("PF"),

      @SerializedName("PG")
      PG("PG"),

      @SerializedName("PH")
      PH("PH"),

      @SerializedName("PK")
      PK("PK"),

      @SerializedName("PL")
      PL("PL"),

      @SerializedName("PM")
      PM("PM"),

      @SerializedName("PN")
      PN("PN"),

      @SerializedName("PR")
      PR("PR"),

      @SerializedName("PS")
      PS("PS"),

      @SerializedName("PT")
      PT("PT"),

      @SerializedName("PY")
      PY("PY"),

      @SerializedName("QA")
      QA("QA"),

      @SerializedName("RE")
      RE("RE"),

      @SerializedName("RO")
      RO("RO"),

      @SerializedName("RS")
      RS("RS"),

      @SerializedName("RU")
      RU("RU"),

      @SerializedName("RW")
      RW("RW"),

      @SerializedName("SA")
      SA("SA"),

      @SerializedName("SB")
      SB("SB"),

      @SerializedName("SC")
      SC("SC"),

      @SerializedName("SE")
      SE("SE"),

      @SerializedName("SG")
      SG("SG"),

      @SerializedName("SH")
      SH("SH"),

      @SerializedName("SI")
      SI("SI"),

      @SerializedName("SJ")
      SJ("SJ"),

      @SerializedName("SK")
      SK("SK"),

      @SerializedName("SL")
      SL("SL"),

      @SerializedName("SM")
      SM("SM"),

      @SerializedName("SN")
      SN("SN"),

      @SerializedName("SO")
      SO("SO"),

      @SerializedName("SR")
      SR("SR"),

      @SerializedName("SS")
      SS("SS"),

      @SerializedName("ST")
      ST("ST"),

      @SerializedName("SV")
      SV("SV"),

      @SerializedName("SX")
      SX("SX"),

      @SerializedName("SZ")
      SZ("SZ"),

      @SerializedName("TA")
      TA("TA"),

      @SerializedName("TC")
      TC("TC"),

      @SerializedName("TD")
      TD("TD"),

      @SerializedName("TF")
      TF("TF"),

      @SerializedName("TG")
      TG("TG"),

      @SerializedName("TH")
      TH("TH"),

      @SerializedName("TJ")
      TJ("TJ"),

      @SerializedName("TK")
      TK("TK"),

      @SerializedName("TL")
      TL("TL"),

      @SerializedName("TM")
      TM("TM"),

      @SerializedName("TN")
      TN("TN"),

      @SerializedName("TO")
      TO("TO"),

      @SerializedName("TR")
      TR("TR"),

      @SerializedName("TT")
      TT("TT"),

      @SerializedName("TV")
      TV("TV"),

      @SerializedName("TW")
      TW("TW"),

      @SerializedName("TZ")
      TZ("TZ"),

      @SerializedName("UA")
      UA("UA"),

      @SerializedName("UG")
      UG("UG"),

      @SerializedName("US")
      US("US"),

      @SerializedName("UY")
      UY("UY"),

      @SerializedName("UZ")
      UZ("UZ"),

      @SerializedName("VA")
      VA("VA"),

      @SerializedName("VC")
      VC("VC"),

      @SerializedName("VE")
      VE("VE"),

      @SerializedName("VG")
      VG("VG"),

      @SerializedName("VN")
      VN("VN"),

      @SerializedName("VU")
      VU("VU"),

      @SerializedName("WF")
      WF("WF"),

      @SerializedName("WS")
      WS("WS"),

      @SerializedName("XK")
      XK("XK"),

      @SerializedName("YE")
      YE("YE"),

      @SerializedName("YT")
      YT("YT"),

      @SerializedName("ZA")
      ZA("ZA"),

      @SerializedName("ZM")
      ZM("ZM"),

      @SerializedName("ZW")
      ZW("ZW"),

      @SerializedName("ZZ")
      ZZ("ZZ");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AllowedCountry(String value) {
        this.value = value;
      }
    }
  }

  public enum BillingAddressCollection implements ApiRequestParams.EnumParam {
    @SerializedName("auto")
    AUTO("auto"),

    @SerializedName("required")
    REQUIRED("required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    BillingAddressCollection(String value) {
      this.value = value;
    }
  }

  public enum CustomerCreation implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CustomerCreation(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodCollection implements ApiRequestParams.EnumParam {
    @SerializedName("always")
    ALWAYS("always"),

    @SerializedName("if_required")
    IF_REQUIRED("if_required");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodCollection(String value) {
      this.value = value;
    }
  }

  public enum PaymentMethodType implements ApiRequestParams.EnumParam {
    @SerializedName("affirm")
    AFFIRM("affirm"),

    @SerializedName("afterpay_clearpay")
    AFTERPAY_CLEARPAY("afterpay_clearpay"),

    @SerializedName("alipay")
    ALIPAY("alipay"),

    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("blik")
    BLIK("blik"),

    @SerializedName("boleto")
    BOLETO("boleto"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("klarna")
    KLARNA("klarna"),

    @SerializedName("konbini")
    KONBINI("konbini"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("paynow")
    PAYNOW("paynow"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay");

    @Getter(onMethod_ = {@Override})
    private final String value;

    PaymentMethodType(String value) {
      this.value = value;
    }
  }
}
