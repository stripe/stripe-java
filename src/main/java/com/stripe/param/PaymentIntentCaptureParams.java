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
public class PaymentIntentCaptureParams extends ApiRequestParams {
  /**
   * The amount to capture from the PaymentIntent, which must be less than or equal to the original
   * amount. Any additional amount is automatically refunded. Defaults to the full {@code
   * amount_capturable} if it's not provided.
   */
  @SerializedName("amount_to_capture")
  Long amountToCapture;

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
   * Defaults to {@code true}. When capturing a PaymentIntent, setting {@code final_capture} to
   * {@code false} notifies Stripe to not release the remaining uncaptured funds to make sure that
   * they're captured in future requests. You can only use this setting when <a
   * href="https://stripe.com/docs/payments/multicapture">multicapture</a> is available for
   * PaymentIntents.
   */
  @SerializedName("final_capture")
  Boolean finalCapture;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Object metadata;

  /** Provides industry-specific information about the charge. */
  @SerializedName("payment_details")
  Object paymentDetails;

  /**
   * Text that appears on the customer's statement as the statement descriptor for a non-card
   * charge. This value overrides the account's default statement descriptor. For information about
   * requirements, including the 22-character limit, see <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
   * Descriptor docs</a>.
   *
   * <p>Setting this value for a card charge returns an error. For card charges, set the <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
   * instead.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about a card charge. Concatenated to the account's <a
   * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
   * descriptor prefix</a> to form the complete statement descriptor that appears on the customer's
   * statement.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * The parameters that you can use to automatically create a transfer after the payment is
   * captured. Learn more about the <a
   * href="https://stripe.com/docs/payments/connected-accounts">use case for connected accounts</a>.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  private PaymentIntentCaptureParams(
      Long amountToCapture,
      Long applicationFeeAmount,
      AsyncWorkflows asyncWorkflows,
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean finalCapture,
      Object metadata,
      Object paymentDetails,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData) {
    this.amountToCapture = amountToCapture;
    this.applicationFeeAmount = applicationFeeAmount;
    this.asyncWorkflows = asyncWorkflows;
    this.expand = expand;
    this.extraParams = extraParams;
    this.finalCapture = finalCapture;
    this.metadata = metadata;
    this.paymentDetails = paymentDetails;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amountToCapture;

    private Long applicationFeeAmount;

    private AsyncWorkflows asyncWorkflows;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean finalCapture;

    private Object metadata;

    private Object paymentDetails;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentIntentCaptureParams build() {
      return new PaymentIntentCaptureParams(
          this.amountToCapture,
          this.applicationFeeAmount,
          this.asyncWorkflows,
          this.expand,
          this.extraParams,
          this.finalCapture,
          this.metadata,
          this.paymentDetails,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData);
    }

    /**
     * The amount to capture from the PaymentIntent, which must be less than or equal to the
     * original amount. Any additional amount is automatically refunded. Defaults to the full {@code
     * amount_capturable} if it's not provided.
     */
    public Builder setAmountToCapture(Long amountToCapture) {
      this.amountToCapture = amountToCapture;
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
    public Builder setAsyncWorkflows(PaymentIntentCaptureParams.AsyncWorkflows asyncWorkflows) {
      this.asyncWorkflows = asyncWorkflows;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentIntentCaptureParams#expand} for the field documentation.
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
     * PaymentIntentCaptureParams#expand} for the field documentation.
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
     * PaymentIntentCaptureParams#extraParams} for the field documentation.
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
     * See {@link PaymentIntentCaptureParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Defaults to {@code true}. When capturing a PaymentIntent, setting {@code final_capture} to
     * {@code false} notifies Stripe to not release the remaining uncaptured funds to make sure that
     * they're captured in future requests. You can only use this setting when <a
     * href="https://stripe.com/docs/payments/multicapture">multicapture</a> is available for
     * PaymentIntents.
     */
    public Builder setFinalCapture(Boolean finalCapture) {
      this.finalCapture = finalCapture;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentIntentCaptureParams#metadata} for the field documentation.
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
     * See {@link PaymentIntentCaptureParams#metadata} for the field documentation.
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

    /** Provides industry-specific information about the charge. */
    public Builder setPaymentDetails(PaymentIntentCaptureParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /** Provides industry-specific information about the charge. */
    public Builder setPaymentDetails(EmptyParam paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /**
     * Text that appears on the customer's statement as the statement descriptor for a non-card
     * charge. This value overrides the account's default statement descriptor. For information
     * about requirements, including the 22-character limit, see <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors">the Statement
     * Descriptor docs</a>.
     *
     * <p>Setting this value for a card charge returns an error. For card charges, set the <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#dynamic">statement_descriptor_suffix</a>
     * instead.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Provides information about a card charge. Concatenated to the account's <a
     * href="https://docs.stripe.com/get-started/account/statement-descriptors#static">statement
     * descriptor prefix</a> to form the complete statement descriptor that appears on the
     * customer's statement.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * The parameters that you can use to automatically create a transfer after the payment is
     * captured. Learn more about the <a
     * href="https://stripe.com/docs/payments/connected-accounts">use case for connected
     * accounts</a>.
     */
    public Builder setTransferData(PaymentIntentCaptureParams.TransferData transferData) {
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
      public PaymentIntentCaptureParams.AsyncWorkflows build() {
        return new PaymentIntentCaptureParams.AsyncWorkflows(this.extraParams, this.inputs);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.AsyncWorkflows#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.AsyncWorkflows#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Arguments passed in automations. */
      public Builder setInputs(PaymentIntentCaptureParams.AsyncWorkflows.Inputs inputs) {
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
        public PaymentIntentCaptureParams.AsyncWorkflows.Inputs build() {
          return new PaymentIntentCaptureParams.AsyncWorkflows.Inputs(this.extraParams, this.tax);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.AsyncWorkflows.Inputs#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.AsyncWorkflows.Inputs#extraParams} for the
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
        public Builder setTax(PaymentIntentCaptureParams.AsyncWorkflows.Inputs.Tax tax) {
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
          public PaymentIntentCaptureParams.AsyncWorkflows.Inputs.Tax build() {
            return new PaymentIntentCaptureParams.AsyncWorkflows.Inputs.Tax(
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
           * map. See {@link PaymentIntentCaptureParams.AsyncWorkflows.Inputs.Tax#extraParams} for
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
           * map. See {@link PaymentIntentCaptureParams.AsyncWorkflows.Inputs.Tax#extraParams} for
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
  public static class PaymentDetails {
    /** Car rental details for this PaymentIntent. */
    @SerializedName("car_rental")
    CarRental carRental;

    /** Event details for this PaymentIntent. */
    @SerializedName("event_details")
    EventDetails eventDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Flight reservation details for this PaymentIntent. */
    @SerializedName("flight")
    Flight flight;

    /** Lodging reservation details for this PaymentIntent. */
    @SerializedName("lodging")
    Lodging lodging;

    /** Subscription details for this PaymentIntent. */
    @SerializedName("subscription")
    Subscription subscription;

    private PaymentDetails(
        CarRental carRental,
        EventDetails eventDetails,
        Map<String, Object> extraParams,
        Flight flight,
        Lodging lodging,
        Subscription subscription) {
      this.carRental = carRental;
      this.eventDetails = eventDetails;
      this.extraParams = extraParams;
      this.flight = flight;
      this.lodging = lodging;
      this.subscription = subscription;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CarRental carRental;

      private EventDetails eventDetails;

      private Map<String, Object> extraParams;

      private Flight flight;

      private Lodging lodging;

      private Subscription subscription;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentIntentCaptureParams.PaymentDetails build() {
        return new PaymentIntentCaptureParams.PaymentDetails(
            this.carRental,
            this.eventDetails,
            this.extraParams,
            this.flight,
            this.lodging,
            this.subscription);
      }

      /** Car rental details for this PaymentIntent. */
      public Builder setCarRental(PaymentIntentCaptureParams.PaymentDetails.CarRental carRental) {
        this.carRental = carRental;
        return this;
      }

      /** Event details for this PaymentIntent. */
      public Builder setEventDetails(
          PaymentIntentCaptureParams.PaymentDetails.EventDetails eventDetails) {
        this.eventDetails = eventDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.PaymentDetails#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.PaymentDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Flight reservation details for this PaymentIntent. */
      public Builder setFlight(PaymentIntentCaptureParams.PaymentDetails.Flight flight) {
        this.flight = flight;
        return this;
      }

      /** Lodging reservation details for this PaymentIntent. */
      public Builder setLodging(PaymentIntentCaptureParams.PaymentDetails.Lodging lodging) {
        this.lodging = lodging;
        return this;
      }

      /** Subscription details for this PaymentIntent. */
      public Builder setSubscription(
          PaymentIntentCaptureParams.PaymentDetails.Subscription subscription) {
        this.subscription = subscription;
        return this;
      }
    }

    @Getter
    public static class CarRental {
      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** <strong>Required.</strong> The booking number associated with the car rental. */
      @SerializedName("booking_number")
      String bookingNumber;

      /** Class code of the car. */
      @SerializedName("car_class_code")
      String carClassCode;

      /** Make of the car. */
      @SerializedName("car_make")
      String carMake;

      /** Model of the car. */
      @SerializedName("car_model")
      String carModel;

      /** The name of the rental car company. */
      @SerializedName("company")
      String company;

      /** The customer service phone number of the car rental company. */
      @SerializedName("customer_service_phone_number")
      String customerServicePhoneNumber;

      /** <strong>Required.</strong> Number of days the car is being rented. */
      @SerializedName("days_rented")
      Long daysRented;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /** The details of the passengers in the travel reservation. */
      @SerializedName("drivers")
      List<PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver> drivers;

      /** List of additional charges being billed. */
      @SerializedName("extra_charges")
      List<PaymentIntentCaptureParams.PaymentDetails.CarRental.ExtraCharge> extraCharges;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Indicates if the customer did not keep nor cancel their booking. */
      @SerializedName("no_show")
      Boolean noShow;

      /** Car pick-up address. */
      @SerializedName("pickup_address")
      PickupAddress pickupAddress;

      /** <strong>Required.</strong> Car pick-up time. Measured in seconds since the Unix epoch. */
      @SerializedName("pickup_at")
      Long pickupAt;

      /** Rental rate. */
      @SerializedName("rate_amount")
      Long rateAmount;

      /**
       * The frequency at which the rate amount is applied. One of {@code day}, {@code week} or
       * {@code month}
       */
      @SerializedName("rate_interval")
      RateInterval rateInterval;

      /** The name of the person or entity renting the car. */
      @SerializedName("renter_name")
      String renterName;

      /** Car return address. */
      @SerializedName("return_address")
      ReturnAddress returnAddress;

      /** <strong>Required.</strong> Car return time. Measured in seconds since the Unix epoch. */
      @SerializedName("return_at")
      Long returnAt;

      /** Indicates whether the goods or services are tax-exempt or tax is not collected. */
      @SerializedName("tax_exempt")
      Boolean taxExempt;

      private CarRental(
          Affiliate affiliate,
          String bookingNumber,
          String carClassCode,
          String carMake,
          String carModel,
          String company,
          String customerServicePhoneNumber,
          Long daysRented,
          Delivery delivery,
          List<PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver> drivers,
          List<PaymentIntentCaptureParams.PaymentDetails.CarRental.ExtraCharge> extraCharges,
          Map<String, Object> extraParams,
          Boolean noShow,
          PickupAddress pickupAddress,
          Long pickupAt,
          Long rateAmount,
          RateInterval rateInterval,
          String renterName,
          ReturnAddress returnAddress,
          Long returnAt,
          Boolean taxExempt) {
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.carClassCode = carClassCode;
        this.carMake = carMake;
        this.carModel = carModel;
        this.company = company;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.daysRented = daysRented;
        this.delivery = delivery;
        this.drivers = drivers;
        this.extraCharges = extraCharges;
        this.extraParams = extraParams;
        this.noShow = noShow;
        this.pickupAddress = pickupAddress;
        this.pickupAt = pickupAt;
        this.rateAmount = rateAmount;
        this.rateInterval = rateInterval;
        this.renterName = renterName;
        this.returnAddress = returnAddress;
        this.returnAt = returnAt;
        this.taxExempt = taxExempt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private String bookingNumber;

        private String carClassCode;

        private String carMake;

        private String carModel;

        private String company;

        private String customerServicePhoneNumber;

        private Long daysRented;

        private Delivery delivery;

        private List<PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver> drivers;

        private List<PaymentIntentCaptureParams.PaymentDetails.CarRental.ExtraCharge> extraCharges;

        private Map<String, Object> extraParams;

        private Boolean noShow;

        private PickupAddress pickupAddress;

        private Long pickupAt;

        private Long rateAmount;

        private RateInterval rateInterval;

        private String renterName;

        private ReturnAddress returnAddress;

        private Long returnAt;

        private Boolean taxExempt;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.CarRental build() {
          return new PaymentIntentCaptureParams.PaymentDetails.CarRental(
              this.affiliate,
              this.bookingNumber,
              this.carClassCode,
              this.carMake,
              this.carModel,
              this.company,
              this.customerServicePhoneNumber,
              this.daysRented,
              this.delivery,
              this.drivers,
              this.extraCharges,
              this.extraParams,
              this.noShow,
              this.pickupAddress,
              this.pickupAt,
              this.rateAmount,
              this.rateInterval,
              this.renterName,
              this.returnAddress,
              this.returnAt,
              this.taxExempt);
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** <strong>Required.</strong> The booking number associated with the car rental. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Class code of the car. */
        public Builder setCarClassCode(String carClassCode) {
          this.carClassCode = carClassCode;
          return this;
        }

        /** Make of the car. */
        public Builder setCarMake(String carMake) {
          this.carMake = carMake;
          return this;
        }

        /** Model of the car. */
        public Builder setCarModel(String carModel) {
          this.carModel = carModel;
          return this;
        }

        /** The name of the rental car company. */
        public Builder setCompany(String company) {
          this.company = company;
          return this;
        }

        /** The customer service phone number of the car rental company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** <strong>Required.</strong> Number of days the car is being rented. */
        public Builder setDaysRented(Long daysRented) {
          this.daysRented = daysRented;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add an element to `drivers` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRental#drivers} for the field documentation.
         */
        public Builder addDriver(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver element) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.add(element);
          return this;
        }

        /**
         * Add all elements to `drivers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRental#drivers} for the field documentation.
         */
        public Builder addAllDriver(
            List<PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver> elements) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.addAll(elements);
          return this;
        }

        /**
         * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRental#extraCharges} for the field
         * documentation.
         */
        public Builder addExtraCharge(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.ExtraCharge element) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.add(element);
          return this;
        }

        /**
         * Add all elements to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.CarRental#extraCharges} for the field
         * documentation.
         */
        public Builder addAllExtraCharge(
            List<PaymentIntentCaptureParams.PaymentDetails.CarRental.ExtraCharge> elements) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRental#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRental#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Indicates if the customer did not keep nor cancel their booking. */
        public Builder setNoShow(Boolean noShow) {
          this.noShow = noShow;
          return this;
        }

        /** Car pick-up address. */
        public Builder setPickupAddress(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.PickupAddress pickupAddress) {
          this.pickupAddress = pickupAddress;
          return this;
        }

        /**
         * <strong>Required.</strong> Car pick-up time. Measured in seconds since the Unix epoch.
         */
        public Builder setPickupAt(Long pickupAt) {
          this.pickupAt = pickupAt;
          return this;
        }

        /** Rental rate. */
        public Builder setRateAmount(Long rateAmount) {
          this.rateAmount = rateAmount;
          return this;
        }

        /**
         * The frequency at which the rate amount is applied. One of {@code day}, {@code week} or
         * {@code month}
         */
        public Builder setRateInterval(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.RateInterval rateInterval) {
          this.rateInterval = rateInterval;
          return this;
        }

        /** The name of the person or entity renting the car. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** Car return address. */
        public Builder setReturnAddress(
            PaymentIntentCaptureParams.PaymentDetails.CarRental.ReturnAddress returnAddress) {
          this.returnAddress = returnAddress;
          return this;
        }

        /** <strong>Required.</strong> Car return time. Measured in seconds since the Unix epoch. */
        public Builder setReturnAt(Long returnAt) {
          this.returnAt = returnAt;
          return this;
        }

        /** Indicates whether the goods or services are tax-exempt or tax is not collected. */
        public Builder setTaxExempt(Boolean taxExempt) {
          this.taxExempt = taxExempt;
          return this;
        }
      }

      @Getter
      public static class Affiliate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
        @SerializedName("name")
        String name;

        private Affiliate(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRental.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRental.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.Affiliate#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.Affiliate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class Delivery {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The delivery method for the payment. */
        @SerializedName("mode")
        Mode mode;

        /** Details of the recipient. */
        @SerializedName("recipient")
        Recipient recipient;

        private Delivery(Map<String, Object> extraParams, Mode mode, Recipient recipient) {
          this.extraParams = extraParams;
          this.mode = mode;
          this.recipient = recipient;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Mode mode;

          private Recipient recipient;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery#extraParams} for the field
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The delivery method for the payment. */
          public Builder setMode(
              PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          String email;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The name of the recipient the ticket is delivered to. */
          @SerializedName("name")
          String name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          String phone;

          private Recipient(
              String email, Map<String, Object> extraParams, String name, String phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String email;

            private Map<String, Object> extraParams;

            private String name;

            private String phone;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Recipient build() {
              return new PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Recipient#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.CarRental.Delivery.Recipient#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(String name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }
          }
        }

        public enum Mode implements ApiRequestParams.EnumParam {
          @SerializedName("email")
          EMAIL("email"),

          @SerializedName("phone")
          PHONE("phone"),

          @SerializedName("pickup")
          PICKUP("pickup"),

          @SerializedName("post")
          POST("post");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Mode(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class Driver {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Full name of the person or entity on the car reservation. */
        @SerializedName("name")
        String name;

        private Driver(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.CarRental.Driver#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Full name of the person or entity on the car reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class PickupAddress {
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

        private PickupAddress(
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
          public PaymentIntentCaptureParams.PaymentDetails.CarRental.PickupAddress build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRental.PickupAddress(
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.PickupAddress#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.PickupAddress#extraParams} for the
           * field documentation.
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

      @Getter
      public static class ReturnAddress {
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

        private ReturnAddress(
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
          public PaymentIntentCaptureParams.PaymentDetails.CarRental.ReturnAddress build() {
            return new PaymentIntentCaptureParams.PaymentDetails.CarRental.ReturnAddress(
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.ReturnAddress#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.CarRental.ReturnAddress#extraParams} for the
           * field documentation.
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

      public enum ExtraCharge implements ApiRequestParams.EnumParam {
        @SerializedName("extra_mileage")
        EXTRA_MILEAGE("extra_mileage"),

        @SerializedName("gas")
        GAS("gas"),

        @SerializedName("late_return")
        LATE_RETURN("late_return"),

        @SerializedName("one_way_service")
        ONE_WAY_SERVICE("one_way_service"),

        @SerializedName("parking_violation")
        PARKING_VIOLATION("parking_violation");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ExtraCharge(String value) {
          this.value = value;
        }
      }

      public enum RateInterval implements ApiRequestParams.EnumParam {
        @SerializedName("day")
        DAY("day"),

        @SerializedName("month")
        MONTH("month"),

        @SerializedName("week")
        WEEK("week");

        @Getter(onMethod_ = {@Override})
        private final String value;

        RateInterval(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class EventDetails {
      /** Indicates if the tickets are digitally checked when entering the venue. */
      @SerializedName("access_controlled_venue")
      Boolean accessControlledVenue;

      /** The event location's address. */
      @SerializedName("address")
      Address address;

      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** The name of the company. */
      @SerializedName("company")
      String company;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /** Event end time. Measured in seconds since the Unix epoch. */
      @SerializedName("ends_at")
      Long endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Type of the event entertainment (concert, sports event etc). */
      @SerializedName("genre")
      String genre;

      /** <strong>Required.</strong> The name of the event. */
      @SerializedName("name")
      String name;

      /** Event start time. Measured in seconds since the Unix epoch. */
      @SerializedName("starts_at")
      Long startsAt;

      private EventDetails(
          Boolean accessControlledVenue,
          Address address,
          Affiliate affiliate,
          String company,
          Delivery delivery,
          Long endsAt,
          Map<String, Object> extraParams,
          String genre,
          String name,
          Long startsAt) {
        this.accessControlledVenue = accessControlledVenue;
        this.address = address;
        this.affiliate = affiliate;
        this.company = company;
        this.delivery = delivery;
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.genre = genre;
        this.name = name;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Boolean accessControlledVenue;

        private Address address;

        private Affiliate affiliate;

        private String company;

        private Delivery delivery;

        private Long endsAt;

        private Map<String, Object> extraParams;

        private String genre;

        private String name;

        private Long startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.EventDetails build() {
          return new PaymentIntentCaptureParams.PaymentDetails.EventDetails(
              this.accessControlledVenue,
              this.address,
              this.affiliate,
              this.company,
              this.delivery,
              this.endsAt,
              this.extraParams,
              this.genre,
              this.name,
              this.startsAt);
        }

        /** Indicates if the tickets are digitally checked when entering the venue. */
        public Builder setAccessControlledVenue(Boolean accessControlledVenue) {
          this.accessControlledVenue = accessControlledVenue;
          return this;
        }

        /** The event location's address. */
        public Builder setAddress(
            PaymentIntentCaptureParams.PaymentDetails.EventDetails.Address address) {
          this.address = address;
          return this;
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.EventDetails.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** The name of the company. */
        public Builder setCompany(String company) {
          this.company = company;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(
            PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /** Event end time. Measured in seconds since the Unix epoch. */
        public Builder setEndsAt(Long endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.EventDetails#extraParams} for
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.EventDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Type of the event entertainment (concert, sports event etc). */
        public Builder setGenre(String genre) {
          this.genre = genre;
          return this;
        }

        /** <strong>Required.</strong> The name of the event. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Event start time. Measured in seconds since the Unix epoch. */
        public Builder setStartsAt(Long startsAt) {
          this.startsAt = startsAt;
          return this;
        }
      }

      @Getter
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
          public PaymentIntentCaptureParams.PaymentDetails.EventDetails.Address build() {
            return new PaymentIntentCaptureParams.PaymentDetails.EventDetails.Address(
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
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Address#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Address#extraParams} for the
           * field documentation.
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

      @Getter
      public static class Affiliate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
        @SerializedName("name")
        String name;

        private Affiliate(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.EventDetails.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.EventDetails.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Affiliate#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Affiliate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class Delivery {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The delivery method for the payment. */
        @SerializedName("mode")
        Mode mode;

        /** Details of the recipient. */
        @SerializedName("recipient")
        Recipient recipient;

        private Delivery(Map<String, Object> extraParams, Mode mode, Recipient recipient) {
          this.extraParams = extraParams;
          this.mode = mode;
          this.recipient = recipient;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Mode mode;

          private Recipient recipient;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery build() {
            return new PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The delivery method for the payment. */
          public Builder setMode(
              PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          String email;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The name of the recipient the ticket is delivered to. */
          @SerializedName("name")
          String name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          String phone;

          private Recipient(
              String email, Map<String, Object> extraParams, String name, String phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String email;

            private Map<String, Object> extraParams;

            private String name;

            private String phone;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Recipient
                build() {
              return new PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Recipient#extraParams}
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
             * PaymentIntentCaptureParams.PaymentDetails.EventDetails.Delivery.Recipient#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(String name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }
          }
        }

        public enum Mode implements ApiRequestParams.EnumParam {
          @SerializedName("email")
          EMAIL("email"),

          @SerializedName("phone")
          PHONE("phone"),

          @SerializedName("pickup")
          PICKUP("pickup"),

          @SerializedName("post")
          POST("post");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Mode(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class Flight {
      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /**
       * The agency number (i.e. International Air Transport Association (IATA) agency number) of
       * the travel agency that made the booking.
       */
      @SerializedName("agency_number")
      String agencyNumber;

      /**
       * The International Air Transport Association (IATA) carrier code of the carrier that issued
       * the ticket.
       */
      @SerializedName("carrier")
      String carrier;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The name of the person or entity on the reservation. */
      @SerializedName("passenger_name")
      String passengerName;

      /** The details of the passengers in the travel reservation. */
      @SerializedName("passengers")
      List<PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger> passengers;

      /** <strong>Required.</strong> The individual flight segments associated with the trip. */
      @SerializedName("segments")
      List<PaymentIntentCaptureParams.PaymentDetails.Flight.Segment> segments;

      /** The ticket number associated with the travel reservation. */
      @SerializedName("ticket_number")
      String ticketNumber;

      private Flight(
          Affiliate affiliate,
          String agencyNumber,
          String carrier,
          Delivery delivery,
          Map<String, Object> extraParams,
          String passengerName,
          List<PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger> passengers,
          List<PaymentIntentCaptureParams.PaymentDetails.Flight.Segment> segments,
          String ticketNumber) {
        this.affiliate = affiliate;
        this.agencyNumber = agencyNumber;
        this.carrier = carrier;
        this.delivery = delivery;
        this.extraParams = extraParams;
        this.passengerName = passengerName;
        this.passengers = passengers;
        this.segments = segments;
        this.ticketNumber = ticketNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private String agencyNumber;

        private String carrier;

        private Delivery delivery;

        private Map<String, Object> extraParams;

        private String passengerName;

        private List<PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger> passengers;

        private List<PaymentIntentCaptureParams.PaymentDetails.Flight.Segment> segments;

        private String ticketNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.Flight build() {
          return new PaymentIntentCaptureParams.PaymentDetails.Flight(
              this.affiliate,
              this.agencyNumber,
              this.carrier,
              this.delivery,
              this.extraParams,
              this.passengerName,
              this.passengers,
              this.segments,
              this.ticketNumber);
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.Flight.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /**
         * The agency number (i.e. International Air Transport Association (IATA) agency number) of
         * the travel agency that made the booking.
         */
        public Builder setAgencyNumber(String agencyNumber) {
          this.agencyNumber = agencyNumber;
          return this;
        }

        /**
         * The International Air Transport Association (IATA) carrier code of the carrier that
         * issued the ticket.
         */
        public Builder setCarrier(String carrier) {
          this.carrier = carrier;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(
            PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name of the person or entity on the reservation. */
        public Builder setPassengerName(String passengerName) {
          this.passengerName = passengerName;
          return this;
        }

        /**
         * Add an element to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Flight#passengers} for the field documentation.
         */
        public Builder addPassenger(
            PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger element) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.add(element);
          return this;
        }

        /**
         * Add all elements to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Flight#passengers} for the field documentation.
         */
        public Builder addAllPassenger(
            List<PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger> elements) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.addAll(elements);
          return this;
        }

        /**
         * Add an element to `segments` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Flight#segments} for the field documentation.
         */
        public Builder addSegment(
            PaymentIntentCaptureParams.PaymentDetails.Flight.Segment element) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.add(element);
          return this;
        }

        /**
         * Add all elements to `segments` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Flight#segments} for the field documentation.
         */
        public Builder addAllSegment(
            List<PaymentIntentCaptureParams.PaymentDetails.Flight.Segment> elements) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.addAll(elements);
          return this;
        }

        /** The ticket number associated with the travel reservation. */
        public Builder setTicketNumber(String ticketNumber) {
          this.ticketNumber = ticketNumber;
          return this;
        }
      }

      @Getter
      public static class Affiliate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
        @SerializedName("name")
        String name;

        private Affiliate(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Flight.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Flight.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Affiliate#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Affiliate#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class Delivery {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The delivery method for the payment. */
        @SerializedName("mode")
        Mode mode;

        /** Details of the recipient. */
        @SerializedName("recipient")
        Recipient recipient;

        private Delivery(Map<String, Object> extraParams, Mode mode, Recipient recipient) {
          this.extraParams = extraParams;
          this.mode = mode;
          this.recipient = recipient;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Mode mode;

          private Recipient recipient;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The delivery method for the payment. */
          public Builder setMode(
              PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          String email;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The name of the recipient the ticket is delivered to. */
          @SerializedName("name")
          String name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          String phone;

          private Recipient(
              String email, Map<String, Object> extraParams, String name, String phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String email;

            private Map<String, Object> extraParams;

            private String name;

            private String phone;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Recipient build() {
              return new PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Recipient#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.Flight.Delivery.Recipient#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(String name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }
          }
        }

        public enum Mode implements ApiRequestParams.EnumParam {
          @SerializedName("email")
          EMAIL("email"),

          @SerializedName("phone")
          PHONE("phone"),

          @SerializedName("pickup")
          PICKUP("pickup"),

          @SerializedName("post")
          POST("post");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Mode(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class Passenger {
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
         * <strong>Required.</strong> Full name of the person or entity on the flight reservation.
         */
        @SerializedName("name")
        String name;

        private Passenger(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Passenger#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /**
           * <strong>Required.</strong> Full name of the person or entity on the flight reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class Segment {
        /** The flight segment amount. */
        @SerializedName("amount")
        Long amount;

        /**
         * The International Air Transport Association (IATA) airport code for the arrival airport.
         */
        @SerializedName("arrival_airport")
        String arrivalAirport;

        /** The arrival time for the flight segment. Measured in seconds since the Unix epoch. */
        @SerializedName("arrives_at")
        Long arrivesAt;

        /**
         * The International Air Transport Association (IATA) carrier code of the carrier operating
         * the flight segment.
         */
        @SerializedName("carrier")
        String carrier;

        /**
         * <strong>Required.</strong> The departure time for the flight segment. Measured in seconds
         * since the Unix epoch.
         */
        @SerializedName("departs_at")
        Long departsAt;

        /**
         * The International Air Transport Association (IATA) airport code for the departure
         * airport.
         */
        @SerializedName("departure_airport")
        String departureAirport;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The flight number associated with the segment. */
        @SerializedName("flight_number")
        String flightNumber;

        /** The fare class for the segment. */
        @SerializedName("service_class")
        ServiceClass serviceClass;

        private Segment(
            Long amount,
            String arrivalAirport,
            Long arrivesAt,
            String carrier,
            Long departsAt,
            String departureAirport,
            Map<String, Object> extraParams,
            String flightNumber,
            ServiceClass serviceClass) {
          this.amount = amount;
          this.arrivalAirport = arrivalAirport;
          this.arrivesAt = arrivesAt;
          this.carrier = carrier;
          this.departsAt = departsAt;
          this.departureAirport = departureAirport;
          this.extraParams = extraParams;
          this.flightNumber = flightNumber;
          this.serviceClass = serviceClass;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private String arrivalAirport;

          private Long arrivesAt;

          private String carrier;

          private Long departsAt;

          private String departureAirport;

          private Map<String, Object> extraParams;

          private String flightNumber;

          private ServiceClass serviceClass;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Flight.Segment build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Flight.Segment(
                this.amount,
                this.arrivalAirport,
                this.arrivesAt,
                this.carrier,
                this.departsAt,
                this.departureAirport,
                this.extraParams,
                this.flightNumber,
                this.serviceClass);
          }

          /** The flight segment amount. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * The International Air Transport Association (IATA) airport code for the arrival
           * airport.
           */
          public Builder setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
          }

          /** The arrival time for the flight segment. Measured in seconds since the Unix epoch. */
          public Builder setArrivesAt(Long arrivesAt) {
            this.arrivesAt = arrivesAt;
            return this;
          }

          /**
           * The International Air Transport Association (IATA) carrier code of the carrier
           * operating the flight segment.
           */
          public Builder setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
          }

          /**
           * <strong>Required.</strong> The departure time for the flight segment. Measured in
           * seconds since the Unix epoch.
           */
          public Builder setDepartsAt(Long departsAt) {
            this.departsAt = departsAt;
            return this;
          }

          /**
           * The International Air Transport Association (IATA) airport code for the departure
           * airport.
           */
          public Builder setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Segment#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Flight.Segment#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The flight number associated with the segment. */
          public Builder setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** The fare class for the segment. */
          public Builder setServiceClass(
              PaymentIntentCaptureParams.PaymentDetails.Flight.Segment.ServiceClass serviceClass) {
            this.serviceClass = serviceClass;
            return this;
          }
        }

        public enum ServiceClass implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("first")
          FIRST("first"),

          @SerializedName("premium_economy")
          PREMIUM_ECONOMY("premium_economy");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ServiceClass(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    public static class Lodging {
      /** The lodging location's address. */
      @SerializedName("address")
      Address address;

      /** The number of adults on the booking. */
      @SerializedName("adults")
      Long adults;

      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** The booking number associated with the lodging reservation. */
      @SerializedName("booking_number")
      String bookingNumber;

      /** The lodging category. */
      @SerializedName("category")
      Category category;

      /**
       * <strong>Required.</strong> Loding check-in time. Measured in seconds since the Unix epoch.
       */
      @SerializedName("checkin_at")
      Long checkinAt;

      /**
       * <strong>Required.</strong> Lodging check-out time. Measured in seconds since the Unix
       * epoch.
       */
      @SerializedName("checkout_at")
      Long checkoutAt;

      /** The customer service phone number of the lodging company. */
      @SerializedName("customer_service_phone_number")
      String customerServicePhoneNumber;

      /** The daily lodging room rate. */
      @SerializedName("daily_room_rate_amount")
      Long dailyRoomRateAmount;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /** List of additional charges being billed. */
      @SerializedName("extra_charges")
      List<PaymentIntentCaptureParams.PaymentDetails.Lodging.ExtraCharge> extraCharges;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Indicates whether the lodging location is compliant with the Fire Safety Act. */
      @SerializedName("fire_safety_act_compliance")
      Boolean fireSafetyActCompliance;

      /** The name of the lodging location. */
      @SerializedName("name")
      String name;

      /**
       * Indicates if the customer did not keep their booking while failing to cancel the
       * reservation.
       */
      @SerializedName("no_show")
      Boolean noShow;

      /** The number of rooms on the booking. */
      @SerializedName("number_of_rooms")
      Long numberOfRooms;

      /** The details of the passengers in the travel reservation. */
      @SerializedName("passengers")
      List<PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger> passengers;

      /** The phone number of the lodging location. */
      @SerializedName("property_phone_number")
      String propertyPhoneNumber;

      /** The room class for this purchase. */
      @SerializedName("room_class")
      String roomClass;

      /** The number of room nights. */
      @SerializedName("room_nights")
      Long roomNights;

      /** The total tax amount associating with the room reservation. */
      @SerializedName("total_room_tax_amount")
      Long totalRoomTaxAmount;

      /** The total tax amount. */
      @SerializedName("total_tax_amount")
      Long totalTaxAmount;

      private Lodging(
          Address address,
          Long adults,
          Affiliate affiliate,
          String bookingNumber,
          Category category,
          Long checkinAt,
          Long checkoutAt,
          String customerServicePhoneNumber,
          Long dailyRoomRateAmount,
          Delivery delivery,
          List<PaymentIntentCaptureParams.PaymentDetails.Lodging.ExtraCharge> extraCharges,
          Map<String, Object> extraParams,
          Boolean fireSafetyActCompliance,
          String name,
          Boolean noShow,
          Long numberOfRooms,
          List<PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger> passengers,
          String propertyPhoneNumber,
          String roomClass,
          Long roomNights,
          Long totalRoomTaxAmount,
          Long totalTaxAmount) {
        this.address = address;
        this.adults = adults;
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.category = category;
        this.checkinAt = checkinAt;
        this.checkoutAt = checkoutAt;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.dailyRoomRateAmount = dailyRoomRateAmount;
        this.delivery = delivery;
        this.extraCharges = extraCharges;
        this.extraParams = extraParams;
        this.fireSafetyActCompliance = fireSafetyActCompliance;
        this.name = name;
        this.noShow = noShow;
        this.numberOfRooms = numberOfRooms;
        this.passengers = passengers;
        this.propertyPhoneNumber = propertyPhoneNumber;
        this.roomClass = roomClass;
        this.roomNights = roomNights;
        this.totalRoomTaxAmount = totalRoomTaxAmount;
        this.totalTaxAmount = totalTaxAmount;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Address address;

        private Long adults;

        private Affiliate affiliate;

        private String bookingNumber;

        private Category category;

        private Long checkinAt;

        private Long checkoutAt;

        private String customerServicePhoneNumber;

        private Long dailyRoomRateAmount;

        private Delivery delivery;

        private List<PaymentIntentCaptureParams.PaymentDetails.Lodging.ExtraCharge> extraCharges;

        private Map<String, Object> extraParams;

        private Boolean fireSafetyActCompliance;

        private String name;

        private Boolean noShow;

        private Long numberOfRooms;

        private List<PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger> passengers;

        private String propertyPhoneNumber;

        private String roomClass;

        private Long roomNights;

        private Long totalRoomTaxAmount;

        private Long totalTaxAmount;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.Lodging build() {
          return new PaymentIntentCaptureParams.PaymentDetails.Lodging(
              this.address,
              this.adults,
              this.affiliate,
              this.bookingNumber,
              this.category,
              this.checkinAt,
              this.checkoutAt,
              this.customerServicePhoneNumber,
              this.dailyRoomRateAmount,
              this.delivery,
              this.extraCharges,
              this.extraParams,
              this.fireSafetyActCompliance,
              this.name,
              this.noShow,
              this.numberOfRooms,
              this.passengers,
              this.propertyPhoneNumber,
              this.roomClass,
              this.roomNights,
              this.totalRoomTaxAmount,
              this.totalTaxAmount);
        }

        /** The lodging location's address. */
        public Builder setAddress(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.Address address) {
          this.address = address;
          return this;
        }

        /** The number of adults on the booking. */
        public Builder setAdults(Long adults) {
          this.adults = adults;
          return this;
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** The booking number associated with the lodging reservation. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** The lodging category. */
        public Builder setCategory(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.Category category) {
          this.category = category;
          return this;
        }

        /**
         * <strong>Required.</strong> Loding check-in time. Measured in seconds since the Unix
         * epoch.
         */
        public Builder setCheckinAt(Long checkinAt) {
          this.checkinAt = checkinAt;
          return this;
        }

        /**
         * <strong>Required.</strong> Lodging check-out time. Measured in seconds since the Unix
         * epoch.
         */
        public Builder setCheckoutAt(Long checkoutAt) {
          this.checkoutAt = checkoutAt;
          return this;
        }

        /** The customer service phone number of the lodging company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** The daily lodging room rate. */
        public Builder setDailyRoomRateAmount(Long dailyRoomRateAmount) {
          this.dailyRoomRateAmount = dailyRoomRateAmount;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Lodging#extraCharges} for the field
         * documentation.
         */
        public Builder addExtraCharge(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.ExtraCharge element) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.add(element);
          return this;
        }

        /**
         * Add all elements to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Lodging#extraCharges} for the field
         * documentation.
         */
        public Builder addAllExtraCharge(
            List<PaymentIntentCaptureParams.PaymentDetails.Lodging.ExtraCharge> elements) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging#extraParams} for the
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Indicates whether the lodging location is compliant with the Fire Safety Act. */
        public Builder setFireSafetyActCompliance(Boolean fireSafetyActCompliance) {
          this.fireSafetyActCompliance = fireSafetyActCompliance;
          return this;
        }

        /** The name of the lodging location. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * Indicates if the customer did not keep their booking while failing to cancel the
         * reservation.
         */
        public Builder setNoShow(Boolean noShow) {
          this.noShow = noShow;
          return this;
        }

        /** The number of rooms on the booking. */
        public Builder setNumberOfRooms(Long numberOfRooms) {
          this.numberOfRooms = numberOfRooms;
          return this;
        }

        /**
         * Add an element to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Lodging#passengers} for the field
         * documentation.
         */
        public Builder addPassenger(
            PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger element) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.add(element);
          return this;
        }

        /**
         * Add all elements to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentIntentCaptureParams.PaymentDetails.Lodging#passengers} for the field
         * documentation.
         */
        public Builder addAllPassenger(
            List<PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger> elements) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.addAll(elements);
          return this;
        }

        /** The phone number of the lodging location. */
        public Builder setPropertyPhoneNumber(String propertyPhoneNumber) {
          this.propertyPhoneNumber = propertyPhoneNumber;
          return this;
        }

        /** The room class for this purchase. */
        public Builder setRoomClass(String roomClass) {
          this.roomClass = roomClass;
          return this;
        }

        /** The number of room nights. */
        public Builder setRoomNights(Long roomNights) {
          this.roomNights = roomNights;
          return this;
        }

        /** The total tax amount associating with the room reservation. */
        public Builder setTotalRoomTaxAmount(Long totalRoomTaxAmount) {
          this.totalRoomTaxAmount = totalRoomTaxAmount;
          return this;
        }

        /** The total tax amount. */
        public Builder setTotalTaxAmount(Long totalTaxAmount) {
          this.totalTaxAmount = totalTaxAmount;
          return this;
        }
      }

      @Getter
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
          public PaymentIntentCaptureParams.PaymentDetails.Lodging.Address build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Lodging.Address(
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging.Address#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging.Address#extraParams}
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

      @Getter
      public static class Affiliate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
        @SerializedName("name")
        String name;

        private Affiliate(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Lodging.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Lodging.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.Lodging.Affiliate#extraParams} for the field
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
           * PaymentIntentCaptureParams.PaymentDetails.Lodging.Affiliate#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class Delivery {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The delivery method for the payment. */
        @SerializedName("mode")
        Mode mode;

        /** Details of the recipient. */
        @SerializedName("recipient")
        Recipient recipient;

        private Delivery(Map<String, Object> extraParams, Mode mode, Recipient recipient) {
          this.extraParams = extraParams;
          this.mode = mode;
          this.recipient = recipient;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Mode mode;

          private Recipient recipient;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery#extraParams}
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
           * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The delivery method for the payment. */
          public Builder setMode(
              PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          String email;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The name of the recipient the ticket is delivered to. */
          @SerializedName("name")
          String name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          String phone;

          private Recipient(
              String email, Map<String, Object> extraParams, String name, String phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private String email;

            private Map<String, Object> extraParams;

            private String name;

            private String phone;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Recipient build() {
              return new PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Recipient#extraParams} for
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentIntentCaptureParams.PaymentDetails.Lodging.Delivery.Recipient#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(String name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }
          }
        }

        public enum Mode implements ApiRequestParams.EnumParam {
          @SerializedName("email")
          EMAIL("email"),

          @SerializedName("phone")
          PHONE("phone"),

          @SerializedName("pickup")
          PICKUP("pickup"),

          @SerializedName("post")
          POST("post");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Mode(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      public static class Passenger {
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
         * <strong>Required.</strong> Full name of the person or entity on the lodging reservation.
         */
        @SerializedName("name")
        String name;

        private Passenger(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger#extraParams} for the field
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
           * PaymentIntentCaptureParams.PaymentDetails.Lodging.Passenger#extraParams} for the field
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
           * <strong>Required.</strong> Full name of the person or entity on the lodging
           * reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      public enum Category implements ApiRequestParams.EnumParam {
        @SerializedName("hotel")
        HOTEL("hotel"),

        @SerializedName("vacation_rental")
        VACATION_RENTAL("vacation_rental");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Category(String value) {
          this.value = value;
        }
      }

      public enum ExtraCharge implements ApiRequestParams.EnumParam {
        @SerializedName("gift_shop")
        GIFT_SHOP("gift_shop"),

        @SerializedName("laundry")
        LAUNDRY("laundry"),

        @SerializedName("mini_bar")
        MINI_BAR("mini_bar"),

        @SerializedName("other")
        OTHER("other"),

        @SerializedName("restaurant")
        RESTAURANT("restaurant"),

        @SerializedName("telephone")
        TELEPHONE("telephone");

        @Getter(onMethod_ = {@Override})
        private final String value;

        ExtraCharge(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Subscription {
      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Info whether the subscription will be auto renewed upon expiry. */
      @SerializedName("auto_renewal")
      Boolean autoRenewal;

      /** Subscription billing details for this purchase. */
      @SerializedName("billing_interval")
      BillingInterval billingInterval;

      /** Subscription end time. Measured in seconds since the Unix epoch. */
      @SerializedName("ends_at")
      Long endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Name of the product on subscription. e.g. Apple Music
       * Subscription
       */
      @SerializedName("name")
      String name;

      /** Subscription start time. Measured in seconds since the Unix epoch. */
      @SerializedName("starts_at")
      Long startsAt;

      private Subscription(
          Affiliate affiliate,
          Boolean autoRenewal,
          BillingInterval billingInterval,
          Long endsAt,
          Map<String, Object> extraParams,
          String name,
          Long startsAt) {
        this.affiliate = affiliate;
        this.autoRenewal = autoRenewal;
        this.billingInterval = billingInterval;
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.name = name;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private Boolean autoRenewal;

        private BillingInterval billingInterval;

        private Long endsAt;

        private Map<String, Object> extraParams;

        private String name;

        private Long startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentIntentCaptureParams.PaymentDetails.Subscription build() {
          return new PaymentIntentCaptureParams.PaymentDetails.Subscription(
              this.affiliate,
              this.autoRenewal,
              this.billingInterval,
              this.endsAt,
              this.extraParams,
              this.name,
              this.startsAt);
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            PaymentIntentCaptureParams.PaymentDetails.Subscription.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Info whether the subscription will be auto renewed upon expiry. */
        public Builder setAutoRenewal(Boolean autoRenewal) {
          this.autoRenewal = autoRenewal;
          return this;
        }

        /** Subscription billing details for this purchase. */
        public Builder setBillingInterval(
            PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval
                billingInterval) {
          this.billingInterval = billingInterval;
          return this;
        }

        /** Subscription end time. Measured in seconds since the Unix epoch. */
        public Builder setEndsAt(Long endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Subscription#extraParams} for
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
         * map. See {@link PaymentIntentCaptureParams.PaymentDetails.Subscription#extraParams} for
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
         * <strong>Required.</strong> Name of the product on subscription. e.g. Apple Music
         * Subscription
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** Subscription start time. Measured in seconds since the Unix epoch. */
        public Builder setStartsAt(Long startsAt) {
          this.startsAt = startsAt;
          return this;
        }
      }

      @Getter
      public static class Affiliate {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
        @SerializedName("name")
        String name;

        private Affiliate(Map<String, Object> extraParams, String name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String name;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Subscription.Affiliate build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Subscription.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.Subscription.Affiliate#extraParams} for the
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
           * PaymentIntentCaptureParams.PaymentDetails.Subscription.Affiliate#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      public static class BillingInterval {
        /**
         * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
         * Stripe multiplies this by the interval type to get the overall duration.
         */
        @SerializedName("count")
        Long count;

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
         * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day}, {@code
         * week}, {@code month} or {@code year}.
         */
        @SerializedName("interval")
        Interval interval;

        private BillingInterval(Long count, Map<String, Object> extraParams, Interval interval) {
          this.count = count;
          this.extraParams = extraParams;
          this.interval = interval;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long count;

          private Map<String, Object> extraParams;

          private Interval interval;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval build() {
            return new PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval(
                this.count, this.extraParams, this.interval);
          }

          /**
           * <strong>Required.</strong> The number of intervals, as an whole number greater than 0.
           * Stripe multiplies this by the interval type to get the overall duration.
           */
          public Builder setCount(Long count) {
            this.count = count;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval#extraParams} for
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
           * PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval#extraParams} for
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              PaymentIntentCaptureParams.PaymentDetails.Subscription.BillingInterval.Interval
                  interval) {
            this.interval = interval;
            return this;
          }
        }

        public enum Interval implements ApiRequestParams.EnumParam {
          @SerializedName("day")
          DAY("day"),

          @SerializedName("month")
          MONTH("month"),

          @SerializedName("week")
          WEEK("week"),

          @SerializedName("year")
          YEAR("year");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Interval(String value) {
            this.value = value;
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
      public PaymentIntentCaptureParams.TransferData build() {
        return new PaymentIntentCaptureParams.TransferData(this.amount, this.extraParams);
      }

      /** The amount that will be transferred automatically when a charge succeeds. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentIntentCaptureParams.TransferData#extraParams} for the field documentation.
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
       * See {@link PaymentIntentCaptureParams.TransferData#extraParams} for the field
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
