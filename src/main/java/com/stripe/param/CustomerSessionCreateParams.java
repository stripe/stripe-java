// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CustomerSessionCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Configuration for each component. Exactly 1 component must be
   * enabled.
   */
  @SerializedName("components")
  Components components;

  /**
   * <strong>Required.</strong> The ID of an existing customer for which to create the Customer
   * Session.
   */
  @SerializedName("customer")
  String customer;

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

  private CustomerSessionCreateParams(
      Components components,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.components = components;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Components components;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerSessionCreateParams build() {
      return new CustomerSessionCreateParams(
          this.components, this.customer, this.expand, this.extraParams);
    }

    /**
     * <strong>Required.</strong> Configuration for each component. Exactly 1 component must be
     * enabled.
     */
    public Builder setComponents(CustomerSessionCreateParams.Components components) {
      this.components = components;
      return this;
    }

    /**
     * <strong>Required.</strong> The ID of an existing customer for which to create the Customer
     * Session.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerSessionCreateParams#expand} for the field documentation.
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
     * CustomerSessionCreateParams#expand} for the field documentation.
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
     * CustomerSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link CustomerSessionCreateParams#extraParams} for the field documentation.
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
  public static class Components {
    /** Configuration for buy button. */
    @SerializedName("buy_button")
    BuyButton buyButton;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration for the Payment Element. */
    @SerializedName("payment_element")
    PaymentElement paymentElement;

    /** Configuration for the pricing table. */
    @SerializedName("pricing_table")
    PricingTable pricingTable;

    private Components(
        BuyButton buyButton,
        Map<String, Object> extraParams,
        PaymentElement paymentElement,
        PricingTable pricingTable) {
      this.buyButton = buyButton;
      this.extraParams = extraParams;
      this.paymentElement = paymentElement;
      this.pricingTable = pricingTable;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BuyButton buyButton;

      private Map<String, Object> extraParams;

      private PaymentElement paymentElement;

      private PricingTable pricingTable;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerSessionCreateParams.Components build() {
        return new CustomerSessionCreateParams.Components(
            this.buyButton, this.extraParams, this.paymentElement, this.pricingTable);
      }

      /** Configuration for buy button. */
      public Builder setBuyButton(CustomerSessionCreateParams.Components.BuyButton buyButton) {
        this.buyButton = buyButton;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * CustomerSessionCreateParams.Components#extraParams} for the field documentation.
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
       * See {@link CustomerSessionCreateParams.Components#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configuration for the Payment Element. */
      public Builder setPaymentElement(
          CustomerSessionCreateParams.Components.PaymentElement paymentElement) {
        this.paymentElement = paymentElement;
        return this;
      }

      /** Configuration for the pricing table. */
      public Builder setPricingTable(
          CustomerSessionCreateParams.Components.PricingTable pricingTable) {
        this.pricingTable = pricingTable;
        return this;
      }
    }

    @Getter
    public static class BuyButton {
      /** <strong>Required.</strong> Whether the buy button is enabled. */
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

      private BuyButton(Boolean enabled, Map<String, Object> extraParams) {
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
        public CustomerSessionCreateParams.Components.BuyButton build() {
          return new CustomerSessionCreateParams.Components.BuyButton(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the buy button is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.BuyButton#extraParams} for the
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
         * map. See {@link CustomerSessionCreateParams.Components.BuyButton#extraParams} for the
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
    public static class PaymentElement {
      /** <strong>Required.</strong> Whether the Payment Element is enabled. */
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

      /** This hash defines whether the Payment Element supports certain features. */
      @SerializedName("features")
      Features features;

      private PaymentElement(Boolean enabled, Map<String, Object> extraParams, Features features) {
        this.enabled = enabled;
        this.extraParams = extraParams;
        this.features = features;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean enabled;

        private Map<String, Object> extraParams;

        private Features features;

        /** Finalize and obtain parameter instance from this builder. */
        public CustomerSessionCreateParams.Components.PaymentElement build() {
          return new CustomerSessionCreateParams.Components.PaymentElement(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the Payment Element is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.PaymentElement#extraParams} for
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
         * map. See {@link CustomerSessionCreateParams.Components.PaymentElement#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This hash defines whether the Payment Element supports certain features. */
        public Builder setFeatures(
            CustomerSessionCreateParams.Components.PaymentElement.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      public static class Features {
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
         * A list of <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> values that controls which saved payment methods the Payment Element
         * displays by filtering to only show payment methods with an {@code allow_redisplay} value
         * that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<
                CustomerSessionCreateParams.Components.PaymentElement.Features
                    .PaymentMethodAllowRedisplayFilter>
            paymentMethodAllowRedisplayFilters;

        /**
         * Controls whether or not the Payment Element shows saved payment methods. This parameter
         * defaults to {@code disabled}.
         */
        @SerializedName("payment_method_redisplay")
        PaymentMethodRedisplay paymentMethodRedisplay;

        /**
         * Determines the max number of saved payment methods for the Payment Element to display.
         * This parameter defaults to {@code 10}.
         */
        @SerializedName("payment_method_redisplay_limit")
        Long paymentMethodRedisplayLimit;

        /**
         * Controls whether the Payment Element displays the option to remove a saved payment
         * method. This parameter defaults to {@code disabled}.
         *
         * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
         * depend on that payment method. Removing the payment method detaches the <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
         * customer} object</a> from that <a
         * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
         */
        @SerializedName("payment_method_remove")
        PaymentMethodRemove paymentMethodRemove;

        /**
         * Controls whether the Payment Element displays a checkbox offering to save a new payment
         * method. This parameter defaults to {@code disabled}.
         *
         * <p>If a customer checks the box, the <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
         * allow_redisplay}</a> value on the PaymentMethod is set to {@code 'always'} at
         * confirmation time. For PaymentIntents, the <a
         * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
         * setup_future_usage}</a> value is also set to the value defined in {@code
         * payment_method_save_usage}.
         */
        @SerializedName("payment_method_save")
        PaymentMethodSave paymentMethodSave;

        /**
         * When using PaymentIntents and the customer checks the save checkbox, this field
         * determines the <a
         * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
         * setup_future_usage}</a> value used to confirm the PaymentIntent.
         *
         * <p>When using SetupIntents, directly configure the <a
         * href="https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage">{@code
         * usage}</a> value on SetupIntent creation.
         */
        @SerializedName("payment_method_save_usage")
        PaymentMethodSaveUsage paymentMethodSaveUsage;

        private Features(
            Map<String, Object> extraParams,
            List<
                    CustomerSessionCreateParams.Components.PaymentElement.Features
                        .PaymentMethodAllowRedisplayFilter>
                paymentMethodAllowRedisplayFilters,
            PaymentMethodRedisplay paymentMethodRedisplay,
            Long paymentMethodRedisplayLimit,
            PaymentMethodRemove paymentMethodRemove,
            PaymentMethodSave paymentMethodSave,
            PaymentMethodSaveUsage paymentMethodSaveUsage) {
          this.extraParams = extraParams;
          this.paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters;
          this.paymentMethodRedisplay = paymentMethodRedisplay;
          this.paymentMethodRedisplayLimit = paymentMethodRedisplayLimit;
          this.paymentMethodRemove = paymentMethodRemove;
          this.paymentMethodSave = paymentMethodSave;
          this.paymentMethodSaveUsage = paymentMethodSaveUsage;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  CustomerSessionCreateParams.Components.PaymentElement.Features
                      .PaymentMethodAllowRedisplayFilter>
              paymentMethodAllowRedisplayFilters;

          private PaymentMethodRedisplay paymentMethodRedisplay;

          private Long paymentMethodRedisplayLimit;

          private PaymentMethodRemove paymentMethodRemove;

          private PaymentMethodSave paymentMethodSave;

          private PaymentMethodSaveUsage paymentMethodSaveUsage;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerSessionCreateParams.Components.PaymentElement.Features build() {
            return new CustomerSessionCreateParams.Components.PaymentElement.Features(
                this.extraParams,
                this.paymentMethodAllowRedisplayFilters,
                this.paymentMethodRedisplay,
                this.paymentMethodRedisplayLimit,
                this.paymentMethodRemove,
                this.paymentMethodSave,
                this.paymentMethodSaveUsage);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerSessionCreateParams.Components.PaymentElement.Features#extraParams} for the
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
           * CustomerSessionCreateParams.Components.PaymentElement.Features#extraParams} for the
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
           * Add an element to `paymentMethodAllowRedisplayFilters` list. A list is initialized for
           * the first `add/addAll` call, and subsequent calls adds additional elements to the
           * original list. See {@link
           * CustomerSessionCreateParams.Components.PaymentElement.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addPaymentMethodAllowRedisplayFilter(
              CustomerSessionCreateParams.Components.PaymentElement.Features
                      .PaymentMethodAllowRedisplayFilter
                  element) {
            if (this.paymentMethodAllowRedisplayFilters == null) {
              this.paymentMethodAllowRedisplayFilters = new ArrayList<>();
            }
            this.paymentMethodAllowRedisplayFilters.add(element);
            return this;
          }

          /**
           * Add all elements to `paymentMethodAllowRedisplayFilters` list. A list is initialized
           * for the first `add/addAll` call, and subsequent calls adds additional elements to the
           * original list. See {@link
           * CustomerSessionCreateParams.Components.PaymentElement.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addAllPaymentMethodAllowRedisplayFilter(
              List<
                      CustomerSessionCreateParams.Components.PaymentElement.Features
                          .PaymentMethodAllowRedisplayFilter>
                  elements) {
            if (this.paymentMethodAllowRedisplayFilters == null) {
              this.paymentMethodAllowRedisplayFilters = new ArrayList<>();
            }
            this.paymentMethodAllowRedisplayFilters.addAll(elements);
            return this;
          }

          /**
           * Controls whether or not the Payment Element shows saved payment methods. This parameter
           * defaults to {@code disabled}.
           */
          public Builder setPaymentMethodRedisplay(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodRedisplay
                  paymentMethodRedisplay) {
            this.paymentMethodRedisplay = paymentMethodRedisplay;
            return this;
          }

          /**
           * Determines the max number of saved payment methods for the Payment Element to display.
           * This parameter defaults to {@code 10}.
           */
          public Builder setPaymentMethodRedisplayLimit(Long paymentMethodRedisplayLimit) {
            this.paymentMethodRedisplayLimit = paymentMethodRedisplayLimit;
            return this;
          }

          /**
           * Controls whether the Payment Element displays the option to remove a saved payment
           * method. This parameter defaults to {@code disabled}.
           *
           * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
           * depend on that payment method. Removing the payment method detaches the <a
           * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
           * customer} object</a> from that <a
           * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
           */
          public Builder setPaymentMethodRemove(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodRemove
                  paymentMethodRemove) {
            this.paymentMethodRemove = paymentMethodRemove;
            return this;
          }

          /**
           * Controls whether the Payment Element displays a checkbox offering to save a new payment
           * method. This parameter defaults to {@code disabled}.
           *
           * <p>If a customer checks the box, the <a
           * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-allow_redisplay">{@code
           * allow_redisplay}</a> value on the PaymentMethod is set to {@code 'always'} at
           * confirmation time. For PaymentIntents, the <a
           * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
           * setup_future_usage}</a> value is also set to the value defined in {@code
           * payment_method_save_usage}.
           */
          public Builder setPaymentMethodSave(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodSave
                  paymentMethodSave) {
            this.paymentMethodSave = paymentMethodSave;
            return this;
          }

          /**
           * When using PaymentIntents and the customer checks the save checkbox, this field
           * determines the <a
           * href="https://docs.stripe.com/api/payment_intents/object#payment_intent_object-setup_future_usage">{@code
           * setup_future_usage}</a> value used to confirm the PaymentIntent.
           *
           * <p>When using SetupIntents, directly configure the <a
           * href="https://docs.stripe.com/api/setup_intents/object#setup_intent_object-usage">{@code
           * usage}</a> value on SetupIntent creation.
           */
          public Builder setPaymentMethodSaveUsage(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodSaveUsage
                  paymentMethodSaveUsage) {
            this.paymentMethodSaveUsage = paymentMethodSaveUsage;
            return this;
          }
        }

        public enum PaymentMethodAllowRedisplayFilter implements ApiRequestParams.EnumParam {
          @SerializedName("always")
          ALWAYS("always"),

          @SerializedName("limited")
          LIMITED("limited"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodAllowRedisplayFilter(String value) {
            this.value = value;
          }
        }

        public enum PaymentMethodRedisplay implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodRedisplay(String value) {
            this.value = value;
          }
        }

        public enum PaymentMethodRemove implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodRemove(String value) {
            this.value = value;
          }
        }

        public enum PaymentMethodSave implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodSave(String value) {
            this.value = value;
          }
        }

        public enum PaymentMethodSaveUsage implements ApiRequestParams.EnumParam {
          @SerializedName("off_session")
          OFF_SESSION("off_session"),

          @SerializedName("on_session")
          ON_SESSION("on_session");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodSaveUsage(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class PricingTable {
      /** <strong>Required.</strong> Whether the pricing table is enabled. */
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

      private PricingTable(Boolean enabled, Map<String, Object> extraParams) {
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
        public CustomerSessionCreateParams.Components.PricingTable build() {
          return new CustomerSessionCreateParams.Components.PricingTable(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the pricing table is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.PricingTable#extraParams} for the
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
         * map. See {@link CustomerSessionCreateParams.Components.PricingTable#extraParams} for the
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
  }
}
