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
   * <strong>Required.</strong> The ID of an existing customer for which to create the customer
   * session.
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
     * <strong>Required.</strong> The ID of an existing customer for which to create the customer
     * session.
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

    /** Configuration for the payment element. */
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

      /** Configuration for the payment element. */
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
      /** <strong>Required.</strong> Whether the payment element is enabled. */
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

      /** This hash defines whether the payment element supports certain features. */
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

        /** <strong>Required.</strong> Whether the payment element is enabled. */
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

        /** This hash defines whether the payment element supports certain features. */
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

        /** Controls whether the Payment Element allows the removal of a saved payment method. */
        @SerializedName("payment_method_remove")
        PaymentMethodRemove paymentMethodRemove;

        /** Controls whether the Payment Element offers to save a new payment method. */
        @SerializedName("payment_method_save")
        PaymentMethodSave paymentMethodSave;

        /** Controls whether the Payment Element offers to set a payment method as the default. */
        @SerializedName("payment_method_set_as_default")
        PaymentMethodSetAsDefault paymentMethodSetAsDefault;

        /** Controls whether the Payment Element allows the updating of a saved payment method. */
        @SerializedName("payment_method_update")
        PaymentMethodUpdate paymentMethodUpdate;

        private Features(
            Map<String, Object> extraParams,
            PaymentMethodRemove paymentMethodRemove,
            PaymentMethodSave paymentMethodSave,
            PaymentMethodSetAsDefault paymentMethodSetAsDefault,
            PaymentMethodUpdate paymentMethodUpdate) {
          this.extraParams = extraParams;
          this.paymentMethodRemove = paymentMethodRemove;
          this.paymentMethodSave = paymentMethodSave;
          this.paymentMethodSetAsDefault = paymentMethodSetAsDefault;
          this.paymentMethodUpdate = paymentMethodUpdate;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PaymentMethodRemove paymentMethodRemove;

          private PaymentMethodSave paymentMethodSave;

          private PaymentMethodSetAsDefault paymentMethodSetAsDefault;

          private PaymentMethodUpdate paymentMethodUpdate;

          /** Finalize and obtain parameter instance from this builder. */
          public CustomerSessionCreateParams.Components.PaymentElement.Features build() {
            return new CustomerSessionCreateParams.Components.PaymentElement.Features(
                this.extraParams,
                this.paymentMethodRemove,
                this.paymentMethodSave,
                this.paymentMethodSetAsDefault,
                this.paymentMethodUpdate);
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

          /** Controls whether the Payment Element allows the removal of a saved payment method. */
          public Builder setPaymentMethodRemove(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodRemove
                  paymentMethodRemove) {
            this.paymentMethodRemove = paymentMethodRemove;
            return this;
          }

          /** Controls whether the Payment Element offers to save a new payment method. */
          public Builder setPaymentMethodSave(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodSave
                  paymentMethodSave) {
            this.paymentMethodSave = paymentMethodSave;
            return this;
          }

          /** Controls whether the Payment Element offers to set a payment method as the default. */
          public Builder setPaymentMethodSetAsDefault(
              CustomerSessionCreateParams.Components.PaymentElement.Features
                      .PaymentMethodSetAsDefault
                  paymentMethodSetAsDefault) {
            this.paymentMethodSetAsDefault = paymentMethodSetAsDefault;
            return this;
          }

          /** Controls whether the Payment Element allows the updating of a saved payment method. */
          public Builder setPaymentMethodUpdate(
              CustomerSessionCreateParams.Components.PaymentElement.Features.PaymentMethodUpdate
                  paymentMethodUpdate) {
            this.paymentMethodUpdate = paymentMethodUpdate;
            return this;
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

        public enum PaymentMethodSetAsDefault implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodSetAsDefault(String value) {
            this.value = value;
          }
        }

        public enum PaymentMethodUpdate implements ApiRequestParams.EnumParam {
          @SerializedName("disabled")
          DISABLED("disabled"),

          @SerializedName("enabled")
          ENABLED("enabled");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentMethodUpdate(String value) {
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
