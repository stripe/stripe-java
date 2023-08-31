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
public class AccountSessionCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The identifier of the account to create an Account Session for. */
  @SerializedName("account")
  String account;

  /**
   * <strong>Required.</strong> Each key of the dictionary represents an embedded component, and
   * each embedded component maps to its configuration (e.g. whether it has been enabled or not).
   */
  @SerializedName("components")
  Components components;

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

  private AccountSessionCreateParams(
      String account, Components components, List<String> expand, Map<String, Object> extraParams) {
    this.account = account;
    this.components = components;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Components components;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountSessionCreateParams build() {
      return new AccountSessionCreateParams(
          this.account, this.components, this.expand, this.extraParams);
    }

    /**
     * <strong>Required.</strong> The identifier of the account to create an Account Session for.
     */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * <strong>Required.</strong> Each key of the dictionary represents an embedded component, and
     * each embedded component maps to its configuration (e.g. whether it has been enabled or not).
     */
    public Builder setComponents(AccountSessionCreateParams.Components components) {
      this.components = components;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountSessionCreateParams#expand} for the field documentation.
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
     * AccountSessionCreateParams#expand} for the field documentation.
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
     * AccountSessionCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountSessionCreateParams#extraParams} for the field documentation.
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
    /** Configuration for the account onboarding embedded component. */
    @SerializedName("account_onboarding")
    AccountOnboarding accountOnboarding;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Configuration for the payment details embedded component. */
    @SerializedName("payment_details")
    PaymentDetails paymentDetails;

    /** Configuration for the payments embedded component. */
    @SerializedName("payments")
    Payments payments;

    /** Configuration for the payouts embedded component. */
    @SerializedName("payouts")
    Payouts payouts;

    private Components(
        AccountOnboarding accountOnboarding,
        Map<String, Object> extraParams,
        PaymentDetails paymentDetails,
        Payments payments,
        Payouts payouts) {
      this.accountOnboarding = accountOnboarding;
      this.extraParams = extraParams;
      this.paymentDetails = paymentDetails;
      this.payments = payments;
      this.payouts = payouts;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountOnboarding accountOnboarding;

      private Map<String, Object> extraParams;

      private PaymentDetails paymentDetails;

      private Payments payments;

      private Payouts payouts;

      /** Finalize and obtain parameter instance from this builder. */
      public AccountSessionCreateParams.Components build() {
        return new AccountSessionCreateParams.Components(
            this.accountOnboarding,
            this.extraParams,
            this.paymentDetails,
            this.payments,
            this.payouts);
      }

      /** Configuration for the account onboarding embedded component. */
      public Builder setAccountOnboarding(
          AccountSessionCreateParams.Components.AccountOnboarding accountOnboarding) {
        this.accountOnboarding = accountOnboarding;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AccountSessionCreateParams.Components#extraParams} for the field documentation.
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
       * See {@link AccountSessionCreateParams.Components#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Configuration for the payment details embedded component. */
      public Builder setPaymentDetails(
          AccountSessionCreateParams.Components.PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
      }

      /** Configuration for the payments embedded component. */
      public Builder setPayments(AccountSessionCreateParams.Components.Payments payments) {
        this.payments = payments;
        return this;
      }

      /** Configuration for the payouts embedded component. */
      public Builder setPayouts(AccountSessionCreateParams.Components.Payouts payouts) {
        this.payouts = payouts;
        return this;
      }
    }

    @Getter
    public static class AccountOnboarding {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      private AccountOnboarding(Boolean enabled, Map<String, Object> extraParams) {
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
        public AccountSessionCreateParams.Components.AccountOnboarding build() {
          return new AccountSessionCreateParams.Components.AccountOnboarding(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.AccountOnboarding#extraParams} for
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
         * map. See {@link AccountSessionCreateParams.Components.AccountOnboarding#extraParams} for
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

    @Getter
    public static class PaymentDetails {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      private PaymentDetails(Boolean enabled, Map<String, Object> extraParams) {
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
        public AccountSessionCreateParams.Components.PaymentDetails build() {
          return new AccountSessionCreateParams.Components.PaymentDetails(
              this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.PaymentDetails#extraParams} for the
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
         * map. See {@link AccountSessionCreateParams.Components.PaymentDetails#extraParams} for the
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
    public static class Payments {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      private Payments(Boolean enabled, Map<String, Object> extraParams) {
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
        public AccountSessionCreateParams.Components.Payments build() {
          return new AccountSessionCreateParams.Components.Payments(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payments#extraParams} for the field
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
         * map. See {@link AccountSessionCreateParams.Components.Payments#extraParams} for the field
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
    }

    @Getter
    public static class Payouts {
      /** <strong>Required.</strong> Whether the embedded component is enabled. */
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

      private Payouts(Boolean enabled, Map<String, Object> extraParams) {
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
        public AccountSessionCreateParams.Components.Payouts build() {
          return new AccountSessionCreateParams.Components.Payouts(this.enabled, this.extraParams);
        }

        /** <strong>Required.</strong> Whether the embedded component is enabled. */
        public Builder setEnabled(Boolean enabled) {
          this.enabled = enabled;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AccountSessionCreateParams.Components.Payouts#extraParams} for the field
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
         * map. See {@link AccountSessionCreateParams.Components.Payouts#extraParams} for the field
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
    }
  }
}
