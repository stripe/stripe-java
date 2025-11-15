// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class CustomerSessionCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> Configuration for each component. Exactly 1 component must be
   * enabled.
   */
  @SerializedName("components")
  Components components;

  /** The ID of an existing customer for which to create the Customer Session. */
  @SerializedName("customer")
  String customer;

  /** The ID of an existing Account for which to create the Customer Session. */
  @SerializedName("customer_account")
  String customerAccount;

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
      String customerAccount,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.components = components;
    this.customer = customer;
    this.customerAccount = customerAccount;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Components components;

    private String customer;

    private String customerAccount;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerSessionCreateParams build() {
      return new CustomerSessionCreateParams(
          this.components, this.customer, this.customerAccount, this.expand, this.extraParams);
    }

    /**
     * <strong>Required.</strong> Configuration for each component. Exactly 1 component must be
     * enabled.
     */
    public Builder setComponents(CustomerSessionCreateParams.Components components) {
      this.components = components;
      return this;
    }

    /** The ID of an existing customer for which to create the Customer Session. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** The ID of an existing Account for which to create the Customer Session. */
    public Builder setCustomerAccount(String customerAccount) {
      this.customerAccount = customerAccount;
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
  @EqualsAndHashCode(callSuper = false)
  public static class Components {
    /** Configuration for buy button. */
    @SerializedName("buy_button")
    BuyButton buyButton;

    /** Configuration for the customer sheet. */
    @SerializedName("customer_sheet")
    CustomerSheet customerSheet;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration for the mobile payment element. */
    @SerializedName("mobile_payment_element")
    MobilePaymentElement mobilePaymentElement;

    /** Configuration for the Payment Element. */
    @SerializedName("payment_element")
    PaymentElement paymentElement;

    /** Configuration for the pricing table. */
    @SerializedName("pricing_table")
    PricingTable pricingTable;

    /** Configuration for the Tax ID Element. */
    @SerializedName("tax_id_element")
    TaxIdElement taxIdElement;

    private Components(
        BuyButton buyButton,
        CustomerSheet customerSheet,
        Map<String, Object> extraParams,
        MobilePaymentElement mobilePaymentElement,
        PaymentElement paymentElement,
        PricingTable pricingTable,
        TaxIdElement taxIdElement) {
      this.buyButton = buyButton;
      this.customerSheet = customerSheet;
      this.extraParams = extraParams;
      this.mobilePaymentElement = mobilePaymentElement;
      this.paymentElement = paymentElement;
      this.pricingTable = pricingTable;
      this.taxIdElement = taxIdElement;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BuyButton buyButton;

      private CustomerSheet customerSheet;

      private Map<String, Object> extraParams;

      private MobilePaymentElement mobilePaymentElement;

      private PaymentElement paymentElement;

      private PricingTable pricingTable;

      private TaxIdElement taxIdElement;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomerSessionCreateParams.Components build() {
        return new CustomerSessionCreateParams.Components(
            this.buyButton,
            this.customerSheet,
            this.extraParams,
            this.mobilePaymentElement,
            this.paymentElement,
            this.pricingTable,
            this.taxIdElement);
      }

      /** Configuration for buy button. */
      public Builder setBuyButton(CustomerSessionCreateParams.Components.BuyButton buyButton) {
        this.buyButton = buyButton;
        return this;
      }

      /** Configuration for the customer sheet. */
      public Builder setCustomerSheet(
          CustomerSessionCreateParams.Components.CustomerSheet customerSheet) {
        this.customerSheet = customerSheet;
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

      /** Configuration for the mobile payment element. */
      public Builder setMobilePaymentElement(
          CustomerSessionCreateParams.Components.MobilePaymentElement mobilePaymentElement) {
        this.mobilePaymentElement = mobilePaymentElement;
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

      /** Configuration for the Tax ID Element. */
      public Builder setTaxIdElement(
          CustomerSessionCreateParams.Components.TaxIdElement taxIdElement) {
        this.taxIdElement = taxIdElement;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
    @EqualsAndHashCode(callSuper = false)
    public static class CustomerSheet {
      /** <strong>Required.</strong> Whether the customer sheet is enabled. */
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

      /** This hash defines whether the customer sheet supports certain features. */
      @SerializedName("features")
      Features features;

      private CustomerSheet(Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public CustomerSessionCreateParams.Components.CustomerSheet build() {
          return new CustomerSessionCreateParams.Components.CustomerSheet(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the customer sheet is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.CustomerSheet#extraParams} for the
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
         * map. See {@link CustomerSessionCreateParams.Components.CustomerSheet#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This hash defines whether the customer sheet supports certain features. */
        public Builder setFeatures(
            CustomerSessionCreateParams.Components.CustomerSheet.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
         * allow_redisplay}</a> values that controls which saved payment methods the customer sheet
         * displays by filtering to only show payment methods with an {@code allow_redisplay} value
         * that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<
                CustomerSessionCreateParams.Components.CustomerSheet.Features
                    .PaymentMethodAllowRedisplayFilter>
            paymentMethodAllowRedisplayFilters;

        /**
         * Controls whether the customer sheet displays the option to remove a saved payment
         * method.&quot;
         *
         * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
         * depend on that payment method. Removing the payment method detaches the <a
         * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
         * customer} object</a> from that <a
         * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
         */
        @SerializedName("payment_method_remove")
        PaymentMethodRemove paymentMethodRemove;

        private Features(
            Map<String, Object> extraParams,
            List<
                    CustomerSessionCreateParams.Components.CustomerSheet.Features
                        .PaymentMethodAllowRedisplayFilter>
                paymentMethodAllowRedisplayFilters,
            PaymentMethodRemove paymentMethodRemove) {
          this.extraParams = extraParams;
          this.paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters;
          this.paymentMethodRemove = paymentMethodRemove;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  CustomerSessionCreateParams.Components.CustomerSheet.Features
                      .PaymentMethodAllowRedisplayFilter>
              paymentMethodAllowRedisplayFilters;

          private PaymentMethodRemove paymentMethodRemove;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerSessionCreateParams.Components.CustomerSheet.Features build() {
            return new CustomerSessionCreateParams.Components.CustomerSheet.Features(
                this.extraParams,
                this.paymentMethodAllowRedisplayFilters,
                this.paymentMethodRemove);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerSessionCreateParams.Components.CustomerSheet.Features#extraParams} for the
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
           * CustomerSessionCreateParams.Components.CustomerSheet.Features#extraParams} for the
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
           * CustomerSessionCreateParams.Components.CustomerSheet.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addPaymentMethodAllowRedisplayFilter(
              CustomerSessionCreateParams.Components.CustomerSheet.Features
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
           * CustomerSessionCreateParams.Components.CustomerSheet.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addAllPaymentMethodAllowRedisplayFilter(
              List<
                      CustomerSessionCreateParams.Components.CustomerSheet.Features
                          .PaymentMethodAllowRedisplayFilter>
                  elements) {
            if (this.paymentMethodAllowRedisplayFilters == null) {
              this.paymentMethodAllowRedisplayFilters = new ArrayList<>();
            }
            this.paymentMethodAllowRedisplayFilters.addAll(elements);
            return this;
          }

          /**
           * Controls whether the customer sheet displays the option to remove a saved payment
           * method.&quot;
           *
           * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
           * depend on that payment method. Removing the payment method detaches the <a
           * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
           * customer} object</a> from that <a
           * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
           */
          public Builder setPaymentMethodRemove(
              CustomerSessionCreateParams.Components.CustomerSheet.Features.PaymentMethodRemove
                  paymentMethodRemove) {
            this.paymentMethodRemove = paymentMethodRemove;
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
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MobilePaymentElement {
      /** <strong>Required.</strong> Whether the mobile payment element is enabled. */
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

      /** This hash defines whether the mobile payment element supports certain features. */
      @SerializedName("features")
      Features features;

      private MobilePaymentElement(
          Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public CustomerSessionCreateParams.Components.MobilePaymentElement build() {
          return new CustomerSessionCreateParams.Components.MobilePaymentElement(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the mobile payment element is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.MobilePaymentElement#extraParams}
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
         * map. See {@link CustomerSessionCreateParams.Components.MobilePaymentElement#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This hash defines whether the mobile payment element supports certain features. */
        public Builder setFeatures(
            CustomerSessionCreateParams.Components.MobilePaymentElement.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
         * allow_redisplay}</a> values that controls which saved payment methods the mobile payment
         * element displays by filtering to only show payment methods with an {@code
         * allow_redisplay} value that is present in this list.
         *
         * <p>If not specified, defaults to [&quot;always&quot;]. In order to display all saved
         * payment methods, specify [&quot;always&quot;, &quot;limited&quot;,
         * &quot;unspecified&quot;].
         */
        @SerializedName("payment_method_allow_redisplay_filters")
        List<
                CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                    .PaymentMethodAllowRedisplayFilter>
            paymentMethodAllowRedisplayFilters;

        /** Controls whether or not the mobile payment element shows saved payment methods. */
        @SerializedName("payment_method_redisplay")
        PaymentMethodRedisplay paymentMethodRedisplay;

        /**
         * Controls whether the mobile payment element displays the option to remove a saved payment
         * method.&quot;
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
         * Controls whether the mobile payment element displays a checkbox offering to save a new
         * payment method.
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
         * Allows overriding the value of allow_override when saving a new payment method when
         * payment_method_save is set to disabled. Use values: &quot;always&quot;,
         * &quot;limited&quot;, or &quot;unspecified&quot;.
         *
         * <p>If not specified, defaults to {@code nil} (no override value).
         */
        @SerializedName("payment_method_save_allow_redisplay_override")
        PaymentMethodSaveAllowRedisplayOverride paymentMethodSaveAllowRedisplayOverride;

        private Features(
            Map<String, Object> extraParams,
            List<
                    CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                        .PaymentMethodAllowRedisplayFilter>
                paymentMethodAllowRedisplayFilters,
            PaymentMethodRedisplay paymentMethodRedisplay,
            PaymentMethodRemove paymentMethodRemove,
            PaymentMethodSave paymentMethodSave,
            PaymentMethodSaveAllowRedisplayOverride paymentMethodSaveAllowRedisplayOverride) {
          this.extraParams = extraParams;
          this.paymentMethodAllowRedisplayFilters = paymentMethodAllowRedisplayFilters;
          this.paymentMethodRedisplay = paymentMethodRedisplay;
          this.paymentMethodRemove = paymentMethodRemove;
          this.paymentMethodSave = paymentMethodSave;
          this.paymentMethodSaveAllowRedisplayOverride = paymentMethodSaveAllowRedisplayOverride;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<
                  CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                      .PaymentMethodAllowRedisplayFilter>
              paymentMethodAllowRedisplayFilters;

          private PaymentMethodRedisplay paymentMethodRedisplay;

          private PaymentMethodRemove paymentMethodRemove;

          private PaymentMethodSave paymentMethodSave;

          private PaymentMethodSaveAllowRedisplayOverride paymentMethodSaveAllowRedisplayOverride;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerSessionCreateParams.Components.MobilePaymentElement.Features build() {
            return new CustomerSessionCreateParams.Components.MobilePaymentElement.Features(
                this.extraParams,
                this.paymentMethodAllowRedisplayFilters,
                this.paymentMethodRedisplay,
                this.paymentMethodRemove,
                this.paymentMethodSave,
                this.paymentMethodSaveAllowRedisplayOverride);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerSessionCreateParams.Components.MobilePaymentElement.Features#extraParams} for
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
           * CustomerSessionCreateParams.Components.MobilePaymentElement.Features#extraParams} for
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
           * Add an element to `paymentMethodAllowRedisplayFilters` list. A list is initialized for
           * the first `add/addAll` call, and subsequent calls adds additional elements to the
           * original list. See {@link
           * CustomerSessionCreateParams.Components.MobilePaymentElement.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addPaymentMethodAllowRedisplayFilter(
              CustomerSessionCreateParams.Components.MobilePaymentElement.Features
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
           * CustomerSessionCreateParams.Components.MobilePaymentElement.Features#paymentMethodAllowRedisplayFilters}
           * for the field documentation.
           */
          public Builder addAllPaymentMethodAllowRedisplayFilter(
              List<
                      CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                          .PaymentMethodAllowRedisplayFilter>
                  elements) {
            if (this.paymentMethodAllowRedisplayFilters == null) {
              this.paymentMethodAllowRedisplayFilters = new ArrayList<>();
            }
            this.paymentMethodAllowRedisplayFilters.addAll(elements);
            return this;
          }

          /** Controls whether or not the mobile payment element shows saved payment methods. */
          public Builder setPaymentMethodRedisplay(
              CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                      .PaymentMethodRedisplay
                  paymentMethodRedisplay) {
            this.paymentMethodRedisplay = paymentMethodRedisplay;
            return this;
          }

          /**
           * Controls whether the mobile payment element displays the option to remove a saved
           * payment method.&quot;
           *
           * <p>Allowing buyers to remove their saved payment methods impacts subscriptions that
           * depend on that payment method. Removing the payment method detaches the <a
           * href="https://docs.stripe.com/api/payment_methods/object#payment_method_object-customer">{@code
           * customer} object</a> from that <a
           * href="https://docs.stripe.com/api/payment_methods">PaymentMethod</a>.
           */
          public Builder setPaymentMethodRemove(
              CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                      .PaymentMethodRemove
                  paymentMethodRemove) {
            this.paymentMethodRemove = paymentMethodRemove;
            return this;
          }

          /**
           * Controls whether the mobile payment element displays a checkbox offering to save a new
           * payment method.
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
              CustomerSessionCreateParams.Components.MobilePaymentElement.Features.PaymentMethodSave
                  paymentMethodSave) {
            this.paymentMethodSave = paymentMethodSave;
            return this;
          }

          /**
           * Allows overriding the value of allow_override when saving a new payment method when
           * payment_method_save is set to disabled. Use values: &quot;always&quot;,
           * &quot;limited&quot;, or &quot;unspecified&quot;.
           *
           * <p>If not specified, defaults to {@code nil} (no override value).
           */
          public Builder setPaymentMethodSaveAllowRedisplayOverride(
              CustomerSessionCreateParams.Components.MobilePaymentElement.Features
                      .PaymentMethodSaveAllowRedisplayOverride
                  paymentMethodSaveAllowRedisplayOverride) {
            this.paymentMethodSaveAllowRedisplayOverride = paymentMethodSaveAllowRedisplayOverride;
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

        public enum PaymentMethodSaveAllowRedisplayOverride implements ApiRequestParams.EnumParam {
          @SerializedName("always")
          ALWAYS("always"),

          @SerializedName("limited")
          LIMITED("limited"),

          @SerializedName("unspecified")
          UNSPECIFIED("unspecified");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodSaveAllowRedisplayOverride(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
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
      @EqualsAndHashCode(callSuper = false)
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
         * This parameter defaults to {@code 3}. The maximum redisplay limit is {@code 10}.
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
           * This parameter defaults to {@code 3}. The maximum redisplay limit is {@code 10}.
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
    @EqualsAndHashCode(callSuper = false)
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxIdElement {
      /** <strong>Required.</strong> Whether the Tax ID Element is enabled. */
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

      /** This hash defines whether the Tax ID Element supports certain features. */
      @SerializedName("features")
      Features features;

      private TaxIdElement(Boolean enabled, Map<String, Object> extraParams, Features features) {
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
        public CustomerSessionCreateParams.Components.TaxIdElement build() {
          return new CustomerSessionCreateParams.Components.TaxIdElement(
              this.enabled, this.extraParams, this.features);
        }

        /** <strong>Required.</strong> Whether the Tax ID Element is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link CustomerSessionCreateParams.Components.TaxIdElement#extraParams} for the
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
         * map. See {@link CustomerSessionCreateParams.Components.TaxIdElement#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** This hash defines whether the Tax ID Element supports certain features. */
        public Builder setFeatures(
            CustomerSessionCreateParams.Components.TaxIdElement.Features features) {
          this.features = features;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
         * Controls whether the Tax ID Element displays saved tax IDs for the customer. This
         * parameter defaults to {@code disabled}.
         *
         * <p>When enabled, the Tax ID Element will show existing tax IDs associated with the
         * customer, allowing them to select from previously saved tax identification numbers.
         */
        @SerializedName("tax_id_redisplay")
        TaxIdRedisplay taxIdRedisplay;

        /**
         * Controls whether the Tax ID Element allows merchants to save new tax IDs for their
         * customer. This parameter defaults to {@code disabled}.
         *
         * <p>When enabled, customers can enter and save new tax identification numbers during the
         * payment flow, which will be stored securely and associated with their customer object for
         * future use.
         */
        @SerializedName("tax_id_save")
        TaxIdSave taxIdSave;

        private Features(
            Map<String, Object> extraParams, TaxIdRedisplay taxIdRedisplay, TaxIdSave taxIdSave) {
          this.extraParams = extraParams;
          this.taxIdRedisplay = taxIdRedisplay;
          this.taxIdSave = taxIdSave;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private TaxIdRedisplay taxIdRedisplay;

          private TaxIdSave taxIdSave;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerSessionCreateParams.Components.TaxIdElement.Features build() {
            return new CustomerSessionCreateParams.Components.TaxIdElement.Features(
                this.extraParams, this.taxIdRedisplay, this.taxIdSave);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * CustomerSessionCreateParams.Components.TaxIdElement.Features#extraParams} for the field
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
           * CustomerSessionCreateParams.Components.TaxIdElement.Features#extraParams} for the field
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
           * Controls whether the Tax ID Element displays saved tax IDs for the customer. This
           * parameter defaults to {@code disabled}.
           *
           * <p>When enabled, the Tax ID Element will show existing tax IDs associated with the
           * customer, allowing them to select from previously saved tax identification numbers.
           */
          public Builder setTaxIdRedisplay(
              CustomerSessionCreateParams.Components.TaxIdElement.Features.TaxIdRedisplay
                  taxIdRedisplay) {
            this.taxIdRedisplay = taxIdRedisplay;
            return this;
          }

          /**
           * Controls whether the Tax ID Element allows merchants to save new tax IDs for their
           * customer. This parameter defaults to {@code disabled}.
           *
           * <p>When enabled, customers can enter and save new tax identification numbers during the
           * payment flow, which will be stored securely and associated with their customer object
           * for future use.
           */
          public Builder setTaxIdSave(
              CustomerSessionCreateParams.Components.TaxIdElement.Features.TaxIdSave taxIdSave) {
            this.taxIdSave = taxIdSave;
            return this;
          }
        }

        public enum TaxIdRedisplay implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxIdRedisplay(String value) {
            this.value = value;
          }
        }

        public enum TaxIdSave implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TaxIdSave(String value) {
            this.value = value;
          }
        }
      }
    }
  }
}
