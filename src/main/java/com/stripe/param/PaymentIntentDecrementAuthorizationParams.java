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
public class PaymentIntentDecrementAuthorizationParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> The updated total amount that you intend to collect from the
   * cardholder. This amount must be smaller than the currently authorized amount and greater than
   * the already captured amount.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * The amount of the application fee (if any) that will be requested to be applied to the payment
   * and transferred to the application owner's Stripe account. The amount of the application fee
   * collected will be capped at the total payment amount. For more information, see the
   * PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /** Automations to be run during the PaymentIntent lifecycle. */
  @SerializedName("async_workflows")
  AsyncWorkflows asyncWorkflows;

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
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The parameters used to automatically create a transfer after the payment is captured. Learn
   * more about the <a href="https://stripe.com/docs/payments/connected-accounts">use case for
   * connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private PaymentIntentDecrementAuthorizationParams(
      Long amount,
      Long applicationFeeAmount,
      AsyncWorkflows asyncWorkflows,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      TransferData transferData) {
    this.amount = amount;
    this.applicationFeeAmount = applicationFeeAmount;
    this.asyncWorkflows = asyncWorkflows;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long applicationFeeAmount;

    private AsyncWorkflows asyncWorkflows;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentDecrementAuthorizationParams build() {
      return new PaymentIntentDecrementAuthorizationParams(
          this.amount,
          this.applicationFeeAmount,
          this.asyncWorkflows,
          this.description,
          this.expand,
          this.extraParams,
          this.metadata,
          this.transferData);
    }

    /**
     * <strong>Required.</strong> The updated total amount that you intend to collect from the
     * cardholder. This amount must be smaller than the currently authorized amount and greater than
     * the already captured amount.
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The amount of the application fee (if any) that will be requested to be applied to the
     * payment and transferred to the application owner's Stripe account. The amount of the
     * application fee collected will be capped at the total payment amount. For more information,
     * see the PaymentIntents <a href="https://stripe.com/docs/payments/connected-accounts">use case
     * for connected accounts</a>.
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /** Automations to be run during the PaymentIntent lifecycle. */
    public Builder setAsyncWorkflows(
        PaymentIntentDecrementAuthorizationParams.AsyncWorkflows asyncWorkflows) {
      this.asyncWorkflows = asyncWorkflows;
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
     * PaymentIntentDecrementAuthorizationParams#expand} for the field documentation.
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
     * PaymentIntentDecrementAuthorizationParams#expand} for the field documentation.
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
     * PaymentIntentDecrementAuthorizationParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentDecrementAuthorizationParams#extraParams} for the field
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
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentDecrementAuthorizationParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentDecrementAuthorizationParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The parameters used to automatically create a transfer after the payment is captured. Learn
     * more about the <a href="https://stripe.com/docs/payments/connected-accounts">use case for
     * connected accounts</a>.
     */
    public Builder setTransferData(
        PaymentIntentDecrementAuthorizationParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  public static class AsyncWorkflows {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Arguments passed in automations. */
    @SerializedName("inputs")
    Inputs inputs;

    private AsyncWorkflows(Map<String, Object> extraParams, Inputs inputs) {
      this.extraParams = extraParams;
      this.inputs = inputs;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Inputs inputs;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentDecrementAuthorizationParams.AsyncWorkflows build() {
        return new PaymentIntentDecrementAuthorizationParams.AsyncWorkflows(
            this.extraParams, this.inputs);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentDecrementAuthorizationParams.AsyncWorkflows#extraParams} for the field
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
       * See {@link PaymentIntentDecrementAuthorizationParams.AsyncWorkflows#extraParams} for the
       * field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Arguments passed in automations. */
      public Builder setInputs(
          PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs inputs) {
        this.inputs = inputs;
        return this;
      }
    }

    @Getter
    public static class Inputs {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Tax arguments for automations. */
      @SerializedName("tax")
      Tax tax;

      private Inputs(Map<String, Object> extraParams, Tax tax) {
        this.extraParams = extraParams;
        this.tax = tax;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Tax tax;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs build() {
          return new PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs(
              this.extraParams, this.tax);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs#extraParams} for the
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
         * PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Tax arguments for automations. */
        public Builder setTax(
            PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs.Tax tax) {
          this.tax = tax;
          return this;
        }
      }

      @Getter
      public static class Tax {
        /**
         * <strong>Required.</strong> The <a
         * href="https://stripe.com/docs/api/tax/calculations">TaxCalculation</a> id
         */
        @SerializedName("calculation")
        Object calculation;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        private Tax(Object calculation, Map<String, Object> extraParams) {
          this.calculation = calculation;
          this.extraParams = extraParams;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object calculation;

          private Map<String, Object> extraParams;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs.Tax build() {
            return new PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs.Tax(
                this.calculation, this.extraParams);
          }

          /**
           * <strong>Required.</strong> The <a
           * href="https://stripe.com/docs/api/tax/calculations">TaxCalculation</a> id
           */
          public Builder setCalculation(String calculation) {
            this.calculation = calculation;
            return this;
          }

          /**
           * <strong>Required.</strong> The <a
           * href="https://stripe.com/docs/api/tax/calculations">TaxCalculation</a> id
           */
          public Builder setCalculation(EmptyParam calculation) {
            this.calculation = calculation;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs.Tax#extraParams} for
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
           * PaymentIntentDecrementAuthorizationParams.AsyncWorkflows.Inputs.Tax#extraParams} for
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
  public static class TransferData {
    /** The amount that will be transferred automatically when a charge succeeds. */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, Map<String, Object> extraParams) {
      this.amount = amount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentDecrementAuthorizationParams.TransferData build() {
        return new PaymentIntentDecrementAuthorizationParams.TransferData(
            this.amount, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentDecrementAuthorizationParams.TransferData#extraParams} for the field
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
       * See {@link PaymentIntentDecrementAuthorizationParams.TransferData#extraParams} for the
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
