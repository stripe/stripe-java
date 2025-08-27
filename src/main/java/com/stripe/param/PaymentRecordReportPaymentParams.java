// File generated from our OpenAPI spec
package com.stripe.param;

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
public class PaymentRecordReportPaymentParams extends ApiRequestParams {
  /** <strong>Required.</strong> The amount you initially requested for this payment. */
  @SerializedName("amount_requested")
  AmountRequested amountRequested;

  /** Customer information for this payment. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /** Indicates whether the customer was present in your checkout flow during this payment. */
  @SerializedName("customer_presence")
  CustomerPresence customerPresence;

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

  /** Information about the payment attempt failure. */
  @SerializedName("failed")
  Failed failed;

  /** Information about the payment attempt guarantee. */
  @SerializedName("guaranteed")
  Guaranteed guaranteed;

  /**
   * <strong>Required.</strong> When the reported payment was initiated. Measured in seconds since
   * the Unix epoch.
   */
  @SerializedName("initiated_at")
  Long initiatedAt;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** The outcome of the reported payment. */
  @SerializedName("outcome")
  Outcome outcome;

  /** <strong>Required.</strong> Information about the Payment Method debited for this payment. */
  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** Processor information for this payment. */
  @SerializedName("processor_details")
  ProcessorDetails processorDetails;

  /** Shipping information for this payment. */
  @SerializedName("shipping_details")
  ShippingDetails shippingDetails;

  private PaymentRecordReportPaymentParams(
      AmountRequested amountRequested,
      CustomerDetails customerDetails,
      CustomerPresence customerPresence,
      String description,
      List<String> expand,
      Map<String, Object> extraParams,
      Failed failed,
      Guaranteed guaranteed,
      Long initiatedAt,
      Object metadata,
      Outcome outcome,
      PaymentMethodDetails paymentMethodDetails,
      ProcessorDetails processorDetails,
      ShippingDetails shippingDetails) {
    this.amountRequested = amountRequested;
    this.customerDetails = customerDetails;
    this.customerPresence = customerPresence;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.failed = failed;
    this.guaranteed = guaranteed;
    this.initiatedAt = initiatedAt;
    this.metadata = metadata;
    this.outcome = outcome;
    this.paymentMethodDetails = paymentMethodDetails;
    this.processorDetails = processorDetails;
    this.shippingDetails = shippingDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AmountRequested amountRequested;

    private CustomerDetails customerDetails;

    private CustomerPresence customerPresence;

    private String description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Failed failed;

    private Guaranteed guaranteed;

    private Long initiatedAt;

    private Object metadata;

    private Outcome outcome;

    private PaymentMethodDetails paymentMethodDetails;

    private ProcessorDetails processorDetails;

    private ShippingDetails shippingDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentRecordReportPaymentParams build() {
      return new PaymentRecordReportPaymentParams(
          this.amountRequested,
          this.customerDetails,
          this.customerPresence,
          this.description,
          this.expand,
          this.extraParams,
          this.failed,
          this.guaranteed,
          this.initiatedAt,
          this.metadata,
          this.outcome,
          this.paymentMethodDetails,
          this.processorDetails,
          this.shippingDetails);
    }

    /** <strong>Required.</strong> The amount you initially requested for this payment. */
    public Builder setAmountRequested(
        PaymentRecordReportPaymentParams.AmountRequested amountRequested) {
      this.amountRequested = amountRequested;
      return this;
    }

    /** Customer information for this payment. */
    public Builder setCustomerDetails(
        PaymentRecordReportPaymentParams.CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    /** Indicates whether the customer was present in your checkout flow during this payment. */
    public Builder setCustomerPresence(
        PaymentRecordReportPaymentParams.CustomerPresence customerPresence) {
      this.customerPresence = customerPresence;
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
     * PaymentRecordReportPaymentParams#expand} for the field documentation.
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
     * PaymentRecordReportPaymentParams#expand} for the field documentation.
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
     * PaymentRecordReportPaymentParams#extraParams} for the field documentation.
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
     * See {@link PaymentRecordReportPaymentParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Information about the payment attempt failure. */
    public Builder setFailed(PaymentRecordReportPaymentParams.Failed failed) {
      this.failed = failed;
      return this;
    }

    /** Information about the payment attempt guarantee. */
    public Builder setGuaranteed(PaymentRecordReportPaymentParams.Guaranteed guaranteed) {
      this.guaranteed = guaranteed;
      return this;
    }

    /**
     * <strong>Required.</strong> When the reported payment was initiated. Measured in seconds since
     * the Unix epoch.
     */
    public Builder setInitiatedAt(Long initiatedAt) {
      this.initiatedAt = initiatedAt;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentRecordReportPaymentParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentRecordReportPaymentParams#metadata} for the field documentation.
     */
    @SuppressWarnings("unchecked")
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null || this.metadata instanceof EmptyParam) {
        this.metadata = new HashMap<String, String>();
      }
      ((Map<String, String>) this.metadata).putAll(map);
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(EmptyParam metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
     * to an object. This can be useful for storing additional information about the object in a
     * structured format. Individual keys can be unset by posting an empty value to them. All keys
     * can be unset by posting an empty value to {@code metadata}.
     */
    public Builder setMetadata(Map<String, String> metadata) {
      this.metadata = metadata;
      return this;
    }

    /** The outcome of the reported payment. */
    public Builder setOutcome(PaymentRecordReportPaymentParams.Outcome outcome) {
      this.outcome = outcome;
      return this;
    }

    /** <strong>Required.</strong> Information about the Payment Method debited for this payment. */
    public Builder setPaymentMethodDetails(
        PaymentRecordReportPaymentParams.PaymentMethodDetails paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    /** Processor information for this payment. */
    public Builder setProcessorDetails(
        PaymentRecordReportPaymentParams.ProcessorDetails processorDetails) {
      this.processorDetails = processorDetails;
      return this;
    }

    /** Shipping information for this payment. */
    public Builder setShippingDetails(
        PaymentRecordReportPaymentParams.ShippingDetails shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountRequested {
    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
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

    /**
     * <strong>Required.</strong> A positive integer representing the amount in the currency's <a
     * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
     * 100} can represent 1 USD or 100 JPY.
     */
    @SerializedName("value")
    Long value;

    private AmountRequested(String currency, Map<String, Object> extraParams, Long value) {
      this.currency = currency;
      this.extraParams = extraParams;
      this.value = value;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String currency;

      private Map<String, Object> extraParams;

      private Long value;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.AmountRequested build() {
        return new PaymentRecordReportPaymentParams.AmountRequested(
            this.currency, this.extraParams, this.value);
      }

      /**
       * <strong>Required.</strong> Three-letter <a
       * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in
       * lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.AmountRequested#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.AmountRequested#extraParams} for the field
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
       * <strong>Required.</strong> A positive integer representing the amount in the currency's <a
       * href="https://stripe.com/docs/currencies#zero-decimal">minor unit</a>. For example, {@code
       * 100} can represent 1 USD or 100 JPY.
       */
      public Builder setValue(Long value) {
        this.value = value;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails {
    /** The customer who made the payment. */
    @SerializedName("customer")
    String customer;

    /** The customer's phone number. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The customer's name. */
    @SerializedName("name")
    String name;

    /** The customer's phone number. */
    @SerializedName("phone")
    String phone;

    private CustomerDetails(
        String customer, String email, Map<String, Object> extraParams, String name, String phone) {
      this.customer = customer;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customer;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.CustomerDetails build() {
        return new PaymentRecordReportPaymentParams.CustomerDetails(
            this.customer, this.email, this.extraParams, this.name, this.phone);
      }

      /** The customer who made the payment. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** The customer's phone number. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.CustomerDetails#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.CustomerDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The customer's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Failed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the reported payment failed. Measured in seconds since the
     * Unix epoch.
     */
    @SerializedName("failed_at")
    Long failedAt;

    private Failed(Map<String, Object> extraParams, Long failedAt) {
      this.extraParams = extraParams;
      this.failedAt = failedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long failedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.Failed build() {
        return new PaymentRecordReportPaymentParams.Failed(this.extraParams, this.failedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.Failed#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.Failed#extraParams} for the field
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
       * <strong>Required.</strong> When the reported payment failed. Measured in seconds since the
       * Unix epoch.
       */
      public Builder setFailedAt(Long failedAt) {
        this.failedAt = failedAt;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Guaranteed {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> When the reported payment was guaranteed. Measured in seconds
     * since the Unix epoch.
     */
    @SerializedName("guaranteed_at")
    Long guaranteedAt;

    private Guaranteed(Map<String, Object> extraParams, Long guaranteedAt) {
      this.extraParams = extraParams;
      this.guaranteedAt = guaranteedAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long guaranteedAt;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.Guaranteed build() {
        return new PaymentRecordReportPaymentParams.Guaranteed(this.extraParams, this.guaranteedAt);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.Guaranteed#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.Guaranteed#extraParams} for the field
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
       * <strong>Required.</strong> When the reported payment was guaranteed. Measured in seconds
       * since the Unix epoch.
       */
      public Builder setGuaranteedAt(Long guaranteedAt) {
        this.guaranteedAt = guaranteedAt;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails {
    /** The billing details associated with the method of payment. */
    @SerializedName("billing_details")
    BillingDetails billingDetails;

    /** Information about the custom (user-defined) payment method used to make this payment. */
    @SerializedName("custom")
    Custom custom;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** ID of the Stripe Payment Method used to make this payment. */
    @SerializedName("payment_method")
    String paymentMethod;

    /**
     * The type of the payment method details. An additional hash is included on the
     * payment_method_details with a name matching this value. It contains additional information
     * specific to the type.
     */
    @SerializedName("type")
    Type type;

    private PaymentMethodDetails(
        BillingDetails billingDetails,
        Custom custom,
        Map<String, Object> extraParams,
        String paymentMethod,
        Type type) {
      this.billingDetails = billingDetails;
      this.custom = custom;
      this.extraParams = extraParams;
      this.paymentMethod = paymentMethod;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingDetails billingDetails;

      private Custom custom;

      private Map<String, Object> extraParams;

      private String paymentMethod;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.PaymentMethodDetails build() {
        return new PaymentRecordReportPaymentParams.PaymentMethodDetails(
            this.billingDetails, this.custom, this.extraParams, this.paymentMethod, this.type);
      }

      /** The billing details associated with the method of payment. */
      public Builder setBillingDetails(
          PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
        return this;
      }

      /** Information about the custom (user-defined) payment method used to make this payment. */
      public Builder setCustom(
          PaymentRecordReportPaymentParams.PaymentMethodDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.PaymentMethodDetails#extraParams} for the field
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
       * See {@link PaymentRecordReportPaymentParams.PaymentMethodDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** ID of the Stripe Payment Method used to make this payment. */
      public Builder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
      }

      /**
       * The type of the payment method details. An additional hash is included on the
       * payment_method_details with a name matching this value. It contains additional information
       * specific to the type.
       */
      public Builder setType(PaymentRecordReportPaymentParams.PaymentMethodDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingDetails {
      /** The billing address associated with the method of payment. */
      @SerializedName("address")
      Address address;

      /** The billing email associated with the method of payment. */
      @SerializedName("email")
      String email;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The billing name associated with the method of payment. */
      @SerializedName("name")
      String name;

      /** The billing phone number associated with the method of payment. */
      @SerializedName("phone")
      String phone;

      private BillingDetails(
          Address address,
          String email,
          Map<String, Object> extraParams,
          String name,
          String phone) {
        this.address = address;
        this.email = email;
        this.extraParams = extraParams;
        this.name = name;
        this.phone = phone;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private String email;

        private Map<String, Object> extraParams;

        private String name;

        private String phone;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails build() {
          return new PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails(
              this.address, this.email, this.extraParams, this.name, this.phone);
        }

        /** The billing address associated with the method of payment. */
        public Builder setAddress(
            PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails.Address address) {
          this.address = address;
          return this;
        }

        /** The billing email associated with the method of payment. */
        public Builder setEmail(String email) {
          this.email = email;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails#extraParams} for the
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
         * PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The billing name associated with the method of payment. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** The billing phone number associated with the method of payment. */
        public Builder setPhone(String phone) {
          this.phone = phone;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        String city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Address line 1 (e.g., street, PO Box, or company name). */
        @SerializedName("line1")
        String line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        String state;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state) {
          this.city = city;
          this.country = country;
          this.extraParams = extraParams;
          this.line1 = line1;
          this.line2 = line2;
          this.postalCode = postalCode;
          this.state = state;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String city;

          private String country;

          private Map<String, Object> extraParams;

          private String line1;

          private String line2;

          private String postalCode;

          private String state;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails.Address
              build() {
            return new PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails.Address(
                this.city,
                this.country,
                this.extraParams,
                this.line1,
                this.line2,
                this.postalCode,
                this.state);
          }

          /** City, district, suburb, town, or village. */
          public Builder setCity(String city) {
            this.city = city;
            return this;
          }

          /**
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(String country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails.Address#extraParams}
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
           * PaymentRecordReportPaymentParams.PaymentMethodDetails.BillingDetails.Address#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom {
      /**
       * Display name for the custom (user-defined) payment method type used to make this payment.
       */
      @SerializedName("display_name")
      String displayName;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The custom payment method type associated with this payment. */
      @SerializedName("type")
      String type;

      private Custom(String displayName, Map<String, Object> extraParams, String type) {
        this.displayName = displayName;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String displayName;

        private Map<String, Object> extraParams;

        private String type;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentParams.PaymentMethodDetails.Custom build() {
          return new PaymentRecordReportPaymentParams.PaymentMethodDetails.Custom(
              this.displayName, this.extraParams, this.type);
        }

        /**
         * Display name for the custom (user-defined) payment method type used to make this payment.
         */
        public Builder setDisplayName(String displayName) {
          this.displayName = displayName;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordReportPaymentParams.PaymentMethodDetails.Custom#extraParams}
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
         * map. See {@link PaymentRecordReportPaymentParams.PaymentMethodDetails.Custom#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The custom payment method type associated with this payment. */
        public Builder setType(String type) {
          this.type = type;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("custom")
      CUSTOM("custom");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ProcessorDetails {
    /** Information about the custom processor used to make this payment. */
    @SerializedName("custom")
    Custom custom;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> The type of the processor details. An additional hash is included
     * on processor_details with a name matching this value. It contains additional information
     * specific to the processor.
     */
    @SerializedName("type")
    Type type;

    private ProcessorDetails(Custom custom, Map<String, Object> extraParams, Type type) {
      this.custom = custom;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Custom custom;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.ProcessorDetails build() {
        return new PaymentRecordReportPaymentParams.ProcessorDetails(
            this.custom, this.extraParams, this.type);
      }

      /** Information about the custom processor used to make this payment. */
      public Builder setCustom(PaymentRecordReportPaymentParams.ProcessorDetails.Custom custom) {
        this.custom = custom;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.ProcessorDetails#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.ProcessorDetails#extraParams} for the field
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
       * <strong>Required.</strong> The type of the processor details. An additional hash is
       * included on processor_details with a name matching this value. It contains additional
       * information specific to the processor.
       */
      public Builder setType(PaymentRecordReportPaymentParams.ProcessorDetails.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Custom {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> An opaque string for manual reconciliation of this payment, for
       * example a check number or a payment processor ID.
       */
      @SerializedName("payment_reference")
      String paymentReference;

      private Custom(Map<String, Object> extraParams, String paymentReference) {
        this.extraParams = extraParams;
        this.paymentReference = paymentReference;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String paymentReference;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentParams.ProcessorDetails.Custom build() {
          return new PaymentRecordReportPaymentParams.ProcessorDetails.Custom(
              this.extraParams, this.paymentReference);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordReportPaymentParams.ProcessorDetails.Custom#extraParams} for
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
         * map. See {@link PaymentRecordReportPaymentParams.ProcessorDetails.Custom#extraParams} for
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
         * <strong>Required.</strong> An opaque string for manual reconciliation of this payment,
         * for example a check number or a payment processor ID.
         */
        public Builder setPaymentReference(String paymentReference) {
          this.paymentReference = paymentReference;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("custom")
      CUSTOM("custom");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ShippingDetails {
    /** The physical shipping address. */
    @SerializedName("address")
    Address address;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The shipping recipient's name. */
    @SerializedName("name")
    String name;

    /** The shipping recipient's phone number. */
    @SerializedName("phone")
    String phone;

    private ShippingDetails(
        Address address, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentRecordReportPaymentParams.ShippingDetails build() {
        return new PaymentRecordReportPaymentParams.ShippingDetails(
            this.address, this.extraParams, this.name, this.phone);
      }

      /** The physical shipping address. */
      public Builder setAddress(PaymentRecordReportPaymentParams.ShippingDetails.Address address) {
        this.address = address;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentRecordReportPaymentParams.ShippingDetails#extraParams} for the field documentation.
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
       * See {@link PaymentRecordReportPaymentParams.ShippingDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The shipping recipient's name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The shipping recipient's phone number. */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentRecordReportPaymentParams.ShippingDetails.Address build() {
          return new PaymentRecordReportPaymentParams.ShippingDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentRecordReportPaymentParams.ShippingDetails.Address#extraParams} for
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
         * map. See {@link PaymentRecordReportPaymentParams.ShippingDetails.Address#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  public enum CustomerPresence implements ApiRequestParams.EnumParam {
    @SerializedName("off_session")
    OFF_SESSION("off_session"),

    @SerializedName("on_session")
    ON_SESSION("on_session");

    @Getter(onMethod_ = {@Override})
    private final String value;

    CustomerPresence(String value) {
      this.value = value;
    }
  }

  public enum Outcome implements ApiRequestParams.EnumParam {
    @SerializedName("failed")
    FAILED("failed"),

    @SerializedName("guaranteed")
    GUARANTEED("guaranteed");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Outcome(String value) {
      this.value = value;
    }
  }
}
