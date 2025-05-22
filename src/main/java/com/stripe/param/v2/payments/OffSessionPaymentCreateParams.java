// File generated from our OpenAPI spec
package com.stripe.param.v2.payments;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.v2.Amount;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class OffSessionPaymentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Amount you want to collect. */
  @SerializedName("amount")
  Amount amount;

  /** <strong>Required.</strong> The frequency of the OSP. */
  @SerializedName("cadence")
  Cadence cadence;

  /** <strong>Required.</strong> Customer that owns the provided payment method. */
  @SerializedName("customer")
  String customer;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Any of your internal data you want to track here. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The OBO merchant you want to use. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * <strong>Required.</strong> Payment method you want to debit. Must be attached to a customer and
   * set up for off-session usage.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** How you want stripe to retry the OSP. */
  @SerializedName("retry_details")
  RetryDetails retryDetails;

  /** String you want to appear on your customer's statement. */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /** Suffix appended to your account level descriptor. */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /** Test clock to be used for testing your retry handling. Only usable in a sandbox. */
  @SerializedName("test_clock")
  String testClock;

  /** How you want to transfer the funds to your connected accounts. */
  @SerializedName("transfer_data")
  TransferData transferData;

  private OffSessionPaymentCreateParams(
      Amount amount,
      Cadence cadence,
      String customer,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String onBehalfOf,
      String paymentMethod,
      RetryDetails retryDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      String testClock,
      TransferData transferData) {
    this.amount = amount;
    this.cadence = cadence;
    this.customer = customer;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.paymentMethod = paymentMethod;
    this.retryDetails = retryDetails;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.testClock = testClock;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Amount amount;

    private Cadence cadence;

    private String customer;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String paymentMethod;

    private RetryDetails retryDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private String testClock;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public OffSessionPaymentCreateParams build() {
      return new OffSessionPaymentCreateParams(
          this.amount,
          this.cadence,
          this.customer,
          this.extraParams,
          this.metadata,
          this.onBehalfOf,
          this.paymentMethod,
          this.retryDetails,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.testClock,
          this.transferData);
    }

    /** <strong>Required.</strong> Amount you want to collect. */
    public Builder setAmount(Amount amount) {
      this.amount = amount;
      return this;
    }

    /** <strong>Required.</strong> The frequency of the OSP. */
    public Builder setCadence(OffSessionPaymentCreateParams.Cadence cadence) {
      this.cadence = cadence;
      return this;
    }

    /** <strong>Required.</strong> Customer that owns the provided payment method. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OffSessionPaymentCreateParams#extraParams} for the field documentation.
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
     * See {@link OffSessionPaymentCreateParams#extraParams} for the field documentation.
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
     * OffSessionPaymentCreateParams#metadata} for the field documentation.
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
     * See {@link OffSessionPaymentCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The OBO merchant you want to use. */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * <strong>Required.</strong> Payment method you want to debit. Must be attached to a customer
     * and set up for off-session usage.
     */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /** How you want stripe to retry the OSP. */
    public Builder setRetryDetails(OffSessionPaymentCreateParams.RetryDetails retryDetails) {
      this.retryDetails = retryDetails;
      return this;
    }

    /** String you want to appear on your customer's statement. */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /** Suffix appended to your account level descriptor. */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /** Test clock to be used for testing your retry handling. Only usable in a sandbox. */
    public Builder setTestClock(String testClock) {
      this.testClock = testClock;
      return this;
    }

    /** How you want to transfer the funds to your connected accounts. */
    public Builder setTransferData(OffSessionPaymentCreateParams.TransferData transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class RetryDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> How you want Stripe to retry the payment. */
    @SerializedName("retry_strategy")
    RetryStrategy retryStrategy;

    private RetryDetails(Map<String, Object> extraParams, RetryStrategy retryStrategy) {
      this.extraParams = extraParams;
      this.retryStrategy = retryStrategy;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private RetryStrategy retryStrategy;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.RetryDetails build() {
        return new OffSessionPaymentCreateParams.RetryDetails(this.extraParams, this.retryStrategy);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.RetryDetails#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.RetryDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> How you want Stripe to retry the payment. */
      public Builder setRetryStrategy(
          OffSessionPaymentCreateParams.RetryDetails.RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
      }
    }

    public enum RetryStrategy implements ApiRequestParams.EnumParam {
      @SerializedName("none")
      NONE("none"),

      @SerializedName("smart")
      SMART("smart");

      @Getter(onMethod_ = {@Override})
      private final String value;

      RetryStrategy(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class TransferData {
    /** <strong>Required.</strong> Amount in minor units that you want to transfer. */
    @SerializedName("amount")
    Integer amount;

    /** <strong>Required.</strong> ID of the connected account where you want money to go. */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Integer amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Integer amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public OffSessionPaymentCreateParams.TransferData build() {
        return new OffSessionPaymentCreateParams.TransferData(
            this.amount, this.destination, this.extraParams);
      }

      /** <strong>Required.</strong> Amount in minor units that you want to transfer. */
      public Builder setAmount(Integer amount) {
        this.amount = amount;
        return this;
      }

      /** <strong>Required.</strong> ID of the connected account where you want money to go. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * OffSessionPaymentCreateParams.TransferData#extraParams} for the field documentation.
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
       * See {@link OffSessionPaymentCreateParams.TransferData#extraParams} for the field
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

  public enum Cadence implements ApiRequestParams.EnumParam {
    @SerializedName("recurring")
    RECURRING("recurring"),

    @SerializedName("unscheduled")
    UNSCHEDULED("unscheduled");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Cadence(String value) {
      this.value = value;
    }
  }
}
