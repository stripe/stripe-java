// File generated from our OpenAPI spec
package com.stripe.param.radar;

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
public class PaymentEvaluationCreateParams extends ApiRequestParams {
  /** Details about the Client Device Metadata to associate with the payment evaluation. */
  @SerializedName("client_device_metadata_details")
  ClientDeviceMetadataDetails clientDeviceMetadataDetails;

  /**
   * <strong>Required.</strong> Details about the customer associated with the payment evaluation.
   */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> Details about the payment. */
  @SerializedName("payment_details")
  PaymentDetails paymentDetails;

  private PaymentEvaluationCreateParams(
      ClientDeviceMetadataDetails clientDeviceMetadataDetails,
      CustomerDetails customerDetails,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      PaymentDetails paymentDetails) {
    this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
    this.customerDetails = customerDetails;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.paymentDetails = paymentDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private ClientDeviceMetadataDetails clientDeviceMetadataDetails;

    private CustomerDetails customerDetails;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private PaymentDetails paymentDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentEvaluationCreateParams build() {
      return new PaymentEvaluationCreateParams(
          this.clientDeviceMetadataDetails,
          this.customerDetails,
          this.expand,
          this.extraParams,
          this.metadata,
          this.paymentDetails);
    }

    /** Details about the Client Device Metadata to associate with the payment evaluation. */
    public Builder setClientDeviceMetadataDetails(
        PaymentEvaluationCreateParams.ClientDeviceMetadataDetails clientDeviceMetadataDetails) {
      this.clientDeviceMetadataDetails = clientDeviceMetadataDetails;
      return this;
    }

    /**
     * <strong>Required.</strong> Details about the customer associated with the payment evaluation.
     */
    public Builder setCustomerDetails(
        PaymentEvaluationCreateParams.CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentEvaluationCreateParams#expand} for the field documentation.
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
     * PaymentEvaluationCreateParams#expand} for the field documentation.
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
     * PaymentEvaluationCreateParams#extraParams} for the field documentation.
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
     * See {@link PaymentEvaluationCreateParams#extraParams} for the field documentation.
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
     * PaymentEvaluationCreateParams#metadata} for the field documentation.
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
     * See {@link PaymentEvaluationCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Details about the payment. */
    public Builder setPaymentDetails(PaymentEvaluationCreateParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ClientDeviceMetadataDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <strong>Required.</strong> ID for the Radar Session to associate with the payment evaluation.
     * A <a href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a snapshot of
     * the browser metadata and device details that help Radar make more accurate predictions on
     * your payments.
     */
    @SerializedName("radar_session")
    String radarSession;

    private ClientDeviceMetadataDetails(Map<String, Object> extraParams, String radarSession) {
      this.extraParams = extraParams;
      this.radarSession = radarSession;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String radarSession;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentEvaluationCreateParams.ClientDeviceMetadataDetails build() {
        return new PaymentEvaluationCreateParams.ClientDeviceMetadataDetails(
            this.extraParams, this.radarSession);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentEvaluationCreateParams.ClientDeviceMetadataDetails#extraParams} for the field
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
       * See {@link PaymentEvaluationCreateParams.ClientDeviceMetadataDetails#extraParams} for the
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
       * <strong>Required.</strong> ID for the Radar Session to associate with the payment
       * evaluation. A <a href="https://docs.stripe.com/radar/radar-session">Radar Session</a> is a
       * snapshot of the browser metadata and device details that help Radar make more accurate
       * predictions on your payments.
       */
      public Builder setRadarSession(String radarSession) {
        this.radarSession = radarSession;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails {
    /** The ID of the customer associated with the payment evaluation. */
    @SerializedName("customer")
    String customer;

    /** The ID of the Account representing the customer associated with the payment evaluation. */
    @SerializedName("customer_account")
    String customerAccount;

    /** The customer's email address. */
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

    /** The customer's full name or business name. */
    @SerializedName("name")
    String name;

    /** The customer's phone number. */
    @SerializedName("phone")
    String phone;

    private CustomerDetails(
        String customer,
        String customerAccount,
        String email,
        Map<String, Object> extraParams,
        String name,
        String phone) {
      this.customer = customer;
      this.customerAccount = customerAccount;
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

      private String customerAccount;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentEvaluationCreateParams.CustomerDetails build() {
        return new PaymentEvaluationCreateParams.CustomerDetails(
            this.customer,
            this.customerAccount,
            this.email,
            this.extraParams,
            this.name,
            this.phone);
      }

      /** The ID of the customer associated with the payment evaluation. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /** The ID of the Account representing the customer associated with the payment evaluation. */
      public Builder setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
      }

      /** The customer's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentEvaluationCreateParams.CustomerDetails#extraParams} for the field documentation.
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
       * See {@link PaymentEvaluationCreateParams.CustomerDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The customer's full name or business name. */
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
  public static class PaymentDetails {
    /**
     * <strong>Required.</strong> The intended amount to collect with this payment. A positive
     * integer representing how much to charge in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a> (for
     * example, 100 cents to charge 1.00 USD or 100 to charge 100 Yen, a zero-decimal currency).
     */
    @SerializedName("amount")
    Long amount;

    /**
     * <strong>Required.</strong> Three-letter <a
     * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
     * Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
     */
    @SerializedName("currency")
    String currency;

    /** An arbitrary string attached to the object. Often useful for displaying to users. */
    @SerializedName("description")
    String description;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Details about the payment's customer presence and type. */
    @SerializedName("money_movement_details")
    MoneyMovementDetails moneyMovementDetails;

    /** <strong>Required.</strong> Details about the payment method to use for the payment. */
    @SerializedName("payment_method_details")
    PaymentMethodDetails paymentMethodDetails;

    /** Shipping details for the payment evaluation. */
    @SerializedName("shipping_details")
    ShippingDetails shippingDetails;

    /** Payment statement descriptor. */
    @SerializedName("statement_descriptor")
    String statementDescriptor;

    private PaymentDetails(
        Long amount,
        String currency,
        String description,
        Map<String, Object> extraParams,
        MoneyMovementDetails moneyMovementDetails,
        PaymentMethodDetails paymentMethodDetails,
        ShippingDetails shippingDetails,
        String statementDescriptor) {
      this.amount = amount;
      this.currency = currency;
      this.description = description;
      this.extraParams = extraParams;
      this.moneyMovementDetails = moneyMovementDetails;
      this.paymentMethodDetails = paymentMethodDetails;
      this.shippingDetails = shippingDetails;
      this.statementDescriptor = statementDescriptor;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String currency;

      private String description;

      private Map<String, Object> extraParams;

      private MoneyMovementDetails moneyMovementDetails;

      private PaymentMethodDetails paymentMethodDetails;

      private ShippingDetails shippingDetails;

      private String statementDescriptor;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentEvaluationCreateParams.PaymentDetails build() {
        return new PaymentEvaluationCreateParams.PaymentDetails(
            this.amount,
            this.currency,
            this.description,
            this.extraParams,
            this.moneyMovementDetails,
            this.paymentMethodDetails,
            this.shippingDetails,
            this.statementDescriptor);
      }

      /**
       * <strong>Required.</strong> The intended amount to collect with this payment. A positive
       * integer representing how much to charge in the <a
       * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a> (for
       * example, 100 cents to charge 1.00 USD or 100 to charge 100 Yen, a zero-decimal currency).
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
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

      /** An arbitrary string attached to the object. Often useful for displaying to users. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentEvaluationCreateParams.PaymentDetails#extraParams} for the field documentation.
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
       * See {@link PaymentEvaluationCreateParams.PaymentDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Details about the payment's customer presence and type. */
      public Builder setMoneyMovementDetails(
          PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails moneyMovementDetails) {
        this.moneyMovementDetails = moneyMovementDetails;
        return this;
      }

      /** <strong>Required.</strong> Details about the payment method to use for the payment. */
      public Builder setPaymentMethodDetails(
          PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails paymentMethodDetails) {
        this.paymentMethodDetails = paymentMethodDetails;
        return this;
      }

      /** Shipping details for the payment evaluation. */
      public Builder setShippingDetails(
          PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
      }

      /** Payment statement descriptor. */
      public Builder setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MoneyMovementDetails {
      /** Describes card money movement details for the payment evaluation. */
      @SerializedName("card")
      Card card;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Describes the type of money movement. Currently only {@code
       * card} is supported.
       */
      @SerializedName("money_movement_type")
      MoneyMovementType moneyMovementType;

      private MoneyMovementDetails(
          Card card, Map<String, Object> extraParams, MoneyMovementType moneyMovementType) {
        this.card = card;
        this.extraParams = extraParams;
        this.moneyMovementType = moneyMovementType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Card card;

        private Map<String, Object> extraParams;

        private MoneyMovementType moneyMovementType;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails build() {
          return new PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails(
              this.card, this.extraParams, this.moneyMovementType);
        }

        /** Describes card money movement details for the payment evaluation. */
        public Builder setCard(
            PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card card) {
          this.card = card;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails#extraParams} for the
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
         * PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails#extraParams} for the
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
         * <strong>Required.</strong> Describes the type of money movement. Currently only {@code
         * card} is supported.
         */
        public Builder setMoneyMovementType(
            PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.MoneyMovementType
                moneyMovementType) {
          this.moneyMovementType = moneyMovementType;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Card {
        /** Describes the presence of the customer during the payment. */
        @SerializedName("customer_presence")
        CustomerPresence customerPresence;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Describes the type of payment. */
        @SerializedName("payment_type")
        PaymentType paymentType;

        private Card(
            CustomerPresence customerPresence,
            Map<String, Object> extraParams,
            PaymentType paymentType) {
          this.customerPresence = customerPresence;
          this.extraParams = extraParams;
          this.paymentType = paymentType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private CustomerPresence customerPresence;

          private Map<String, Object> extraParams;

          private PaymentType paymentType;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card build() {
            return new PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card(
                this.customerPresence, this.extraParams, this.paymentType);
          }

          /** Describes the presence of the customer during the payment. */
          public Builder setCustomerPresence(
              PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card
                      .CustomerPresence
                  customerPresence) {
            this.customerPresence = customerPresence;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card#extraParams} for
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
           * PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Describes the type of payment. */
          public Builder setPaymentType(
              PaymentEvaluationCreateParams.PaymentDetails.MoneyMovementDetails.Card.PaymentType
                  paymentType) {
            this.paymentType = paymentType;
            return this;
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

        public enum PaymentType implements ApiRequestParams.EnumParam {
          @SerializedName("one_off")
          ONE_OFF("one_off"),

          @SerializedName("recurring")
          RECURRING("recurring"),

          @SerializedName("setup_one_off")
          SETUP_ONE_OFF("setup_one_off"),

          @SerializedName("setup_recurring")
          SETUP_RECURRING("setup_recurring");

          @Getter(onMethod_ = {@Override})
          private final String value;

          PaymentType(String value) {
            this.value = value;
          }
        }
      }

      public enum MoneyMovementType implements ApiRequestParams.EnumParam {
        @SerializedName("card")
        CARD("card");

        @Getter(onMethod_ = {@Override})
        private final String value;

        MoneyMovementType(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethodDetails {
      /** Billing information associated with the payment evaluation. */
      @SerializedName("billing_details")
      BillingDetails billingDetails;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> ID of the payment method used in this payment evaluation. */
      @SerializedName("payment_method")
      String paymentMethod;

      private PaymentMethodDetails(
          BillingDetails billingDetails, Map<String, Object> extraParams, String paymentMethod) {
        this.billingDetails = billingDetails;
        this.extraParams = extraParams;
        this.paymentMethod = paymentMethod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillingDetails billingDetails;

        private Map<String, Object> extraParams;

        private String paymentMethod;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails build() {
          return new PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails(
              this.billingDetails, this.extraParams, this.paymentMethod);
        }

        /** Billing information associated with the payment evaluation. */
        public Builder setBillingDetails(
            PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails
                billingDetails) {
          this.billingDetails = billingDetails;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails#extraParams} for the
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
         * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> ID of the payment method used in this payment evaluation. */
        public Builder setPaymentMethod(String paymentMethod) {
          this.paymentMethod = paymentMethod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BillingDetails {
        /** Billing address. */
        @SerializedName("address")
        Address address;

        /** Email address. */
        @SerializedName("email")
        String email;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Full name. */
        @SerializedName("name")
        String name;

        /** Billing phone number (including extension). */
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
          public PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails
              build() {
            return new PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails
                .BillingDetails(this.address, this.email, this.extraParams, this.name, this.phone);
          }

          /** Billing address. */
          public Builder setAddress(
              PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails
                      .Address
                  address) {
            this.address = address;
            return this;
          }

          /** Email address. */
          public Builder setEmail(String email) {
            this.email = email;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails#extraParams}
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
           * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Billing phone number (including extension). */
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Address line 1, such as the street, PO Box, or company name. */
          @SerializedName("line1")
          String line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          String line2;

          /** ZIP or postal code. */
          @SerializedName("postal_code")
          String postalCode;

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
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
            public PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails
                    .Address
                build() {
              return new PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails
                  .BillingDetails.Address(
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
             * Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails.Address#extraParams}
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentEvaluationCreateParams.PaymentDetails.PaymentMethodDetails.BillingDetails.Address#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Address line 1, such as the street, PO Box, or company name. */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /**
             * State, county, province, or region (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
             */
            public Builder setState(String state) {
              this.state = state;
              return this;
            }
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ShippingDetails {
      /** Shipping address. */
      @SerializedName("address")
      Address address;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Shipping name. */
      @SerializedName("name")
      String name;

      /** Shipping phone number. */
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
        public PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails build() {
          return new PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails(
              this.address, this.extraParams, this.name, this.phone);
        }

        /** Shipping address. */
        public Builder setAddress(
            PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails.Address address) {
          this.address = address;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails#extraParams}
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
         * map. See {@link PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Shipping name. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Shipping phone number. */
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        String line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
        @SerializedName("line2")
        String line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        String postalCode;

        /**
         * State, county, province, or region (<a
         * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
         */
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
          public PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails.Address build() {
            return new PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails.Address(
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
           * PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails.Address#extraParams} for
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
           * PaymentEvaluationCreateParams.PaymentDetails.ShippingDetails.Address#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /**
           * State, county, province, or region (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>).
           */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }
        }
      }
    }
  }
}
