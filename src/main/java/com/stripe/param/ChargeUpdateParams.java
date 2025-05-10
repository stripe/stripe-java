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
public class ChargeUpdateParams extends ApiRequestParams {
  /**
   * The ID of an existing customer that will be associated with this request. This field may only
   * be updated if there is no existing associated customer with this charge.
   */
  @SerializedName("customer")
  Object customer;

  /**
   * An arbitrary string which you can attach to a charge object. It is displayed when in the web
   * interface alongside the charge. Note that if you use Stripe to send automatic email receipts to
   * your customers, your receipt emails will include the {@code description} of the charge(s) that
   * they are describing.
   */
  @SerializedName("description")
  Object description;

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
   * A set of key-value pairs you can attach to a charge giving information about its riskiness. If
   * you believe a charge is fraudulent, include a {@code user_report} key with a value of {@code
   * fraudulent}. If you believe a charge is safe, include a {@code user_report} key with a value of
   * {@code safe}. Stripe will use the information you send to improve our fraud detection
   * algorithms.
   */
  @SerializedName("fraud_details")
  FraudDetails fraudDetails;

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
  PaymentDetails paymentDetails;

  /**
   * This is the email address that the receipt for this charge will be sent to. If this field is
   * updated, then a new email receipt will be sent to the updated address.
   */
  @SerializedName("receipt_email")
  Object receiptEmail;

  /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * A string that identifies this transaction as part of a group. {@code transfer_group} may only
   * be provided if it has not been set. See the <a
   * href="https://stripe.com/docs/connect/separate-charges-and-transfers#transfer-options">Connect
   * documentation</a> for details.
   */
  @SerializedName("transfer_group")
  Object transferGroup;

  private ChargeUpdateParams(
      Object customer,
      Object description,
      List<String> expand,
      Map<String, Object> extraParams,
      FraudDetails fraudDetails,
      Object metadata,
      PaymentDetails paymentDetails,
      Object receiptEmail,
      Shipping shipping,
      Object transferGroup) {
    this.customer = customer;
    this.description = description;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fraudDetails = fraudDetails;
    this.metadata = metadata;
    this.paymentDetails = paymentDetails;
    this.receiptEmail = receiptEmail;
    this.shipping = shipping;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Object customer;

    private Object description;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private FraudDetails fraudDetails;

    private Object metadata;

    private PaymentDetails paymentDetails;

    private Object receiptEmail;

    private Shipping shipping;

    private Object transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public ChargeUpdateParams build() {
      return new ChargeUpdateParams(
          this.customer,
          this.description,
          this.expand,
          this.extraParams,
          this.fraudDetails,
          this.metadata,
          this.paymentDetails,
          this.receiptEmail,
          this.shipping,
          this.transferGroup);
    }

    /**
     * The ID of an existing customer that will be associated with this request. This field may only
     * be updated if there is no existing associated customer with this charge.
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * The ID of an existing customer that will be associated with this request. This field may only
     * be updated if there is no existing associated customer with this charge.
     */
    public Builder setCustomer(EmptyParam customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web
     * interface alongside the charge. Note that if you use Stripe to send automatic email receipts
     * to your customers, your receipt emails will include the {@code description} of the charge(s)
     * that they are describing.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web
     * interface alongside the charge. Note that if you use Stripe to send automatic email receipts
     * to your customers, your receipt emails will include the {@code description} of the charge(s)
     * that they are describing.
     */
    public Builder setDescription(EmptyParam description) {
      this.description = description;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeUpdateParams#expand} for the field documentation.
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
     * ChargeUpdateParams#expand} for the field documentation.
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
     * ChargeUpdateParams#extraParams} for the field documentation.
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
     * See {@link ChargeUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A set of key-value pairs you can attach to a charge giving information about its riskiness.
     * If you believe a charge is fraudulent, include a {@code user_report} key with a value of
     * {@code fraudulent}. If you believe a charge is safe, include a {@code user_report} key with a
     * value of {@code safe}. Stripe will use the information you send to improve our fraud
     * detection algorithms.
     */
    public Builder setFraudDetails(ChargeUpdateParams.FraudDetails fraudDetails) {
      this.fraudDetails = fraudDetails;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeUpdateParams#metadata} for the field documentation.
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
     * See {@link ChargeUpdateParams#metadata} for the field documentation.
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
    public Builder setPaymentDetails(ChargeUpdateParams.PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is
     * updated, then a new email receipt will be sent to the updated address.
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is
     * updated, then a new email receipt will be sent to the updated address.
     */
    public Builder setReceiptEmail(EmptyParam receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
    public Builder setShipping(ChargeUpdateParams.Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. {@code transfer_group} may only
     * be provided if it has not been set. See the <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers#transfer-options">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. {@code transfer_group} may only
     * be provided if it has not been set. See the <a
     * href="https://stripe.com/docs/connect/separate-charges-and-transfers#transfer-options">Connect
     * documentation</a> for details.
     */
    public Builder setTransferGroup(EmptyParam transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class FraudDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Either {@code safe} or {@code fraudulent}. */
    @SerializedName("user_report")
    ApiRequestParams.EnumParam userReport;

    private FraudDetails(Map<String, Object> extraParams, ApiRequestParams.EnumParam userReport) {
      this.extraParams = extraParams;
      this.userReport = userReport;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private ApiRequestParams.EnumParam userReport;

      /** Finalize and obtain parameter instance from this builder. */
      public ChargeUpdateParams.FraudDetails build() {
        return new ChargeUpdateParams.FraudDetails(this.extraParams, this.userReport);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.FraudDetails#extraParams} for the field documentation.
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
       * See {@link ChargeUpdateParams.FraudDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Either {@code safe} or {@code fraudulent}. */
      public Builder setUserReport(ChargeUpdateParams.FraudDetails.UserReport userReport) {
        this.userReport = userReport;
        return this;
      }

      /** <strong>Required.</strong> Either {@code safe} or {@code fraudulent}. */
      public Builder setUserReport(EmptyParam userReport) {
        this.userReport = userReport;
        return this;
      }
    }

    public enum UserReport implements ApiRequestParams.EnumParam {
      @SerializedName("fraudulent")
      FRAUDULENT("fraudulent"),

      @SerializedName("safe")
      SAFE("safe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      UserReport(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentDetails {
    /** Car rental details for this PaymentIntent. */
    @SerializedName("car_rental")
    CarRental carRental;

    /**
     * Some customers might be required by their company or organization to provide this
     * information. If so, provide this value. Otherwise you can ignore this field.
     */
    @SerializedName("customer_reference")
    Object customerReference;

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

    /** A unique value assigned by the business to identify the transaction. */
    @SerializedName("order_reference")
    Object orderReference;

    /** Subscription details for this PaymentIntent. */
    @SerializedName("subscription")
    Subscription subscription;

    private PaymentDetails(
        CarRental carRental,
        Object customerReference,
        EventDetails eventDetails,
        Map<String, Object> extraParams,
        Flight flight,
        Lodging lodging,
        Object orderReference,
        Subscription subscription) {
      this.carRental = carRental;
      this.customerReference = customerReference;
      this.eventDetails = eventDetails;
      this.extraParams = extraParams;
      this.flight = flight;
      this.lodging = lodging;
      this.orderReference = orderReference;
      this.subscription = subscription;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CarRental carRental;

      private Object customerReference;

      private EventDetails eventDetails;

      private Map<String, Object> extraParams;

      private Flight flight;

      private Lodging lodging;

      private Object orderReference;

      private Subscription subscription;

      /** Finalize and obtain parameter instance from this builder. */
      public ChargeUpdateParams.PaymentDetails build() {
        return new ChargeUpdateParams.PaymentDetails(
            this.carRental,
            this.customerReference,
            this.eventDetails,
            this.extraParams,
            this.flight,
            this.lodging,
            this.orderReference,
            this.subscription);
      }

      /** Car rental details for this PaymentIntent. */
      public Builder setCarRental(ChargeUpdateParams.PaymentDetails.CarRental carRental) {
        this.carRental = carRental;
        return this;
      }

      /**
       * Some customers might be required by their company or organization to provide this
       * information. If so, provide this value. Otherwise you can ignore this field.
       */
      public Builder setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /**
       * Some customers might be required by their company or organization to provide this
       * information. If so, provide this value. Otherwise you can ignore this field.
       */
      public Builder setCustomerReference(EmptyParam customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /** Event details for this PaymentIntent. */
      public Builder setEventDetails(ChargeUpdateParams.PaymentDetails.EventDetails eventDetails) {
        this.eventDetails = eventDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.PaymentDetails#extraParams} for the field documentation.
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
       * See {@link ChargeUpdateParams.PaymentDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Flight reservation details for this PaymentIntent. */
      public Builder setFlight(ChargeUpdateParams.PaymentDetails.Flight flight) {
        this.flight = flight;
        return this;
      }

      /** Lodging reservation details for this PaymentIntent. */
      public Builder setLodging(ChargeUpdateParams.PaymentDetails.Lodging lodging) {
        this.lodging = lodging;
        return this;
      }

      /** A unique value assigned by the business to identify the transaction. */
      public Builder setOrderReference(String orderReference) {
        this.orderReference = orderReference;
        return this;
      }

      /** A unique value assigned by the business to identify the transaction. */
      public Builder setOrderReference(EmptyParam orderReference) {
        this.orderReference = orderReference;
        return this;
      }

      /** Subscription details for this PaymentIntent. */
      public Builder setSubscription(ChargeUpdateParams.PaymentDetails.Subscription subscription) {
        this.subscription = subscription;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CarRental {
      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** <strong>Required.</strong> The booking number associated with the car rental. */
      @SerializedName("booking_number")
      Object bookingNumber;

      /** Class code of the car. */
      @SerializedName("car_class_code")
      Object carClassCode;

      /** Make of the car. */
      @SerializedName("car_make")
      Object carMake;

      /** Model of the car. */
      @SerializedName("car_model")
      Object carModel;

      /** The name of the rental car company. */
      @SerializedName("company")
      Object company;

      /** The customer service phone number of the car rental company. */
      @SerializedName("customer_service_phone_number")
      Object customerServicePhoneNumber;

      /** <strong>Required.</strong> Number of days the car is being rented. */
      @SerializedName("days_rented")
      Long daysRented;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /** The details of the passengers in the travel reservation. */
      @SerializedName("drivers")
      List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> drivers;

      /** List of additional charges being billed. */
      @SerializedName("extra_charges")
      List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> extraCharges;

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
      Object renterName;

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
          Object bookingNumber,
          Object carClassCode,
          Object carMake,
          Object carModel,
          Object company,
          Object customerServicePhoneNumber,
          Long daysRented,
          Delivery delivery,
          List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> drivers,
          List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> extraCharges,
          Map<String, Object> extraParams,
          Boolean noShow,
          PickupAddress pickupAddress,
          Long pickupAt,
          Long rateAmount,
          RateInterval rateInterval,
          Object renterName,
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

        private Object bookingNumber;

        private Object carClassCode;

        private Object carMake;

        private Object carModel;

        private Object company;

        private Object customerServicePhoneNumber;

        private Long daysRented;

        private Delivery delivery;

        private List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> drivers;

        private List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> extraCharges;

        private Map<String, Object> extraParams;

        private Boolean noShow;

        private PickupAddress pickupAddress;

        private Long pickupAt;

        private Long rateAmount;

        private RateInterval rateInterval;

        private Object renterName;

        private ReturnAddress returnAddress;

        private Long returnAt;

        private Boolean taxExempt;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.CarRental build() {
          return new ChargeUpdateParams.PaymentDetails.CarRental(
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
            ChargeUpdateParams.PaymentDetails.CarRental.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** <strong>Required.</strong> The booking number associated with the car rental. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** <strong>Required.</strong> The booking number associated with the car rental. */
        public Builder setBookingNumber(EmptyParam bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Class code of the car. */
        public Builder setCarClassCode(String carClassCode) {
          this.carClassCode = carClassCode;
          return this;
        }

        /** Class code of the car. */
        public Builder setCarClassCode(EmptyParam carClassCode) {
          this.carClassCode = carClassCode;
          return this;
        }

        /** Make of the car. */
        public Builder setCarMake(String carMake) {
          this.carMake = carMake;
          return this;
        }

        /** Make of the car. */
        public Builder setCarMake(EmptyParam carMake) {
          this.carMake = carMake;
          return this;
        }

        /** Model of the car. */
        public Builder setCarModel(String carModel) {
          this.carModel = carModel;
          return this;
        }

        /** Model of the car. */
        public Builder setCarModel(EmptyParam carModel) {
          this.carModel = carModel;
          return this;
        }

        /** The name of the rental car company. */
        public Builder setCompany(String company) {
          this.company = company;
          return this;
        }

        /** The name of the rental car company. */
        public Builder setCompany(EmptyParam company) {
          this.company = company;
          return this;
        }

        /** The customer service phone number of the car rental company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** The customer service phone number of the car rental company. */
        public Builder setCustomerServicePhoneNumber(EmptyParam customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** <strong>Required.</strong> Number of days the car is being rented. */
        public Builder setDaysRented(Long daysRented) {
          this.daysRented = daysRented;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(ChargeUpdateParams.PaymentDetails.CarRental.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add an element to `drivers` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRental#drivers} for the field documentation.
         */
        public Builder addDriver(ChargeUpdateParams.PaymentDetails.CarRental.Driver element) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.add(element);
          return this;
        }

        /**
         * Add all elements to `drivers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRental#drivers} for the field documentation.
         */
        public Builder addAllDriver(
            List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> elements) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.addAll(elements);
          return this;
        }

        /**
         * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRental#extraCharges} for the field documentation.
         */
        public Builder addExtraCharge(
            ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge element) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.add(element);
          return this;
        }

        /**
         * Add all elements to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRental#extraCharges} for the field documentation.
         */
        public Builder addAllExtraCharge(
            List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> elements) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental#extraParams} for the field
         * documentation.
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
            ChargeUpdateParams.PaymentDetails.CarRental.PickupAddress pickupAddress) {
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
            ChargeUpdateParams.PaymentDetails.CarRental.RateInterval rateInterval) {
          this.rateInterval = rateInterval;
          return this;
        }

        /** The name of the person or entity renting the car. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** The name of the person or entity renting the car. */
        public Builder setRenterName(EmptyParam renterName) {
          this.renterName = renterName;
          return this;
        }

        /** Car return address. */
        public Builder setReturnAddress(
            ChargeUpdateParams.PaymentDetails.CarRental.ReturnAddress returnAddress) {
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
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Affiliate(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Affiliate#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Affiliate#extraParams} for
           * the field documentation.
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

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public ChargeUpdateParams.PaymentDetails.CarRental.Delivery build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Delivery#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Delivery#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The delivery method for the payment. */
          public Builder setMode(ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          Object email;

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
          Object name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          Object phone;

          private Recipient(
              Object email, Map<String, Object> extraParams, Object name, Object phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object email;

            private Map<String, Object> extraParams;

            private Object name;

            private Object phone;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Recipient build() {
              return new ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(EmptyParam email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Recipient#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRental.Delivery.Recipient#extraParams} for the
             * field documentation.
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

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(EmptyParam name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(EmptyParam phone) {
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
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Driver(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.Driver build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.Driver(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Driver#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Driver#extraParams} for the
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
           * <strong>Required.</strong> Full name of the person or entity on the car reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> Full name of the person or entity on the car reservation.
           */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PickupAddress {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

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
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        private PickupAddress(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
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
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.PickupAddress build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.PickupAddress(
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

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
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
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.PickupAddress#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.PickupAddress#extraParams}
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

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ReturnAddress {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

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
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        private ReturnAddress(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
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
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.ReturnAddress build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.ReturnAddress(
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

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
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
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.ReturnAddress#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.ReturnAddress#extraParams}
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

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
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
    @EqualsAndHashCode(callSuper = false)
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
      Object company;

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
      Object genre;

      /** <strong>Required.</strong> The name of the event. */
      @SerializedName("name")
      Object name;

      /** Event start time. Measured in seconds since the Unix epoch. */
      @SerializedName("starts_at")
      Long startsAt;

      private EventDetails(
          Boolean accessControlledVenue,
          Address address,
          Affiliate affiliate,
          Object company,
          Delivery delivery,
          Long endsAt,
          Map<String, Object> extraParams,
          Object genre,
          Object name,
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

        private Object company;

        private Delivery delivery;

        private Long endsAt;

        private Map<String, Object> extraParams;

        private Object genre;

        private Object name;

        private Long startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.EventDetails build() {
          return new ChargeUpdateParams.PaymentDetails.EventDetails(
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
        public Builder setAddress(ChargeUpdateParams.PaymentDetails.EventDetails.Address address) {
          this.address = address;
          return this;
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(
            ChargeUpdateParams.PaymentDetails.EventDetails.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** The name of the company. */
        public Builder setCompany(String company) {
          this.company = company;
          return this;
        }

        /** The name of the company. */
        public Builder setCompany(EmptyParam company) {
          this.company = company;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(
            ChargeUpdateParams.PaymentDetails.EventDetails.Delivery delivery) {
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails#extraParams} for the field
         * documentation.
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

        /** Type of the event entertainment (concert, sports event etc). */
        public Builder setGenre(EmptyParam genre) {
          this.genre = genre;
          return this;
        }

        /** <strong>Required.</strong> The name of the event. */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /** <strong>Required.</strong> The name of the event. */
        public Builder setName(EmptyParam name) {
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
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

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
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        private Address(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
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
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.EventDetails.Address build() {
            return new ChargeUpdateParams.PaymentDetails.EventDetails.Address(
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

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
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
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Address#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Address#extraParams} for
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

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Affiliate(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.EventDetails.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.EventDetails.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Affiliate#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Affiliate#extraParams}
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

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public ChargeUpdateParams.PaymentDetails.EventDetails.Delivery build() {
            return new ChargeUpdateParams.PaymentDetails.EventDetails.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Delivery#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.EventDetails.Delivery#extraParams}
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
              ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          Object email;

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
          Object name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          Object phone;

          private Recipient(
              Object email, Map<String, Object> extraParams, Object name, Object phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object email;

            private Map<String, Object> extraParams;

            private Object name;

            private Object phone;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Recipient build() {
              return new ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(EmptyParam email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Recipient#extraParams} for
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
             * ChargeUpdateParams.PaymentDetails.EventDetails.Delivery.Recipient#extraParams} for
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

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(EmptyParam name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(EmptyParam phone) {
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
    @EqualsAndHashCode(callSuper = false)
    public static class Flight {
      /** Affiliate details for this purchase. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /**
       * The agency number (i.e. International Air Transport Association (IATA) agency number) of
       * the travel agency that made the booking.
       */
      @SerializedName("agency_number")
      Object agencyNumber;

      /**
       * The International Air Transport Association (IATA) carrier code of the carrier that issued
       * the ticket.
       */
      @SerializedName("carrier")
      Object carrier;

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
      Object passengerName;

      /** The details of the passengers in the travel reservation. */
      @SerializedName("passengers")
      List<ChargeUpdateParams.PaymentDetails.Flight.Passenger> passengers;

      /** <strong>Required.</strong> The individual flight segments associated with the trip. */
      @SerializedName("segments")
      List<ChargeUpdateParams.PaymentDetails.Flight.Segment> segments;

      /** The ticket number associated with the travel reservation. */
      @SerializedName("ticket_number")
      Object ticketNumber;

      private Flight(
          Affiliate affiliate,
          Object agencyNumber,
          Object carrier,
          Delivery delivery,
          Map<String, Object> extraParams,
          Object passengerName,
          List<ChargeUpdateParams.PaymentDetails.Flight.Passenger> passengers,
          List<ChargeUpdateParams.PaymentDetails.Flight.Segment> segments,
          Object ticketNumber) {
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

        private Object agencyNumber;

        private Object carrier;

        private Delivery delivery;

        private Map<String, Object> extraParams;

        private Object passengerName;

        private List<ChargeUpdateParams.PaymentDetails.Flight.Passenger> passengers;

        private List<ChargeUpdateParams.PaymentDetails.Flight.Segment> segments;

        private Object ticketNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.Flight build() {
          return new ChargeUpdateParams.PaymentDetails.Flight(
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
        public Builder setAffiliate(ChargeUpdateParams.PaymentDetails.Flight.Affiliate affiliate) {
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
         * The agency number (i.e. International Air Transport Association (IATA) agency number) of
         * the travel agency that made the booking.
         */
        public Builder setAgencyNumber(EmptyParam agencyNumber) {
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

        /**
         * The International Air Transport Association (IATA) carrier code of the carrier that
         * issued the ticket.
         */
        public Builder setCarrier(EmptyParam carrier) {
          this.carrier = carrier;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(ChargeUpdateParams.PaymentDetails.Flight.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.Flight#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.Flight#extraParams} for the field
         * documentation.
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

        /** The name of the person or entity on the reservation. */
        public Builder setPassengerName(EmptyParam passengerName) {
          this.passengerName = passengerName;
          return this;
        }

        /**
         * Add an element to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Flight#passengers} for the field documentation.
         */
        public Builder addPassenger(ChargeUpdateParams.PaymentDetails.Flight.Passenger element) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.add(element);
          return this;
        }

        /**
         * Add all elements to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Flight#passengers} for the field documentation.
         */
        public Builder addAllPassenger(
            List<ChargeUpdateParams.PaymentDetails.Flight.Passenger> elements) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.addAll(elements);
          return this;
        }

        /**
         * Add an element to `segments` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Flight#segments} for the field documentation.
         */
        public Builder addSegment(ChargeUpdateParams.PaymentDetails.Flight.Segment element) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.add(element);
          return this;
        }

        /**
         * Add all elements to `segments` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Flight#segments} for the field documentation.
         */
        public Builder addAllSegment(
            List<ChargeUpdateParams.PaymentDetails.Flight.Segment> elements) {
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

        /** The ticket number associated with the travel reservation. */
        public Builder setTicketNumber(EmptyParam ticketNumber) {
          this.ticketNumber = ticketNumber;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Affiliate(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Flight.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.Flight.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Affiliate#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Affiliate#extraParams} for the
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

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public ChargeUpdateParams.PaymentDetails.Flight.Delivery build() {
            return new ChargeUpdateParams.PaymentDetails.Flight.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Delivery#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Delivery#extraParams} for the
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
          public Builder setMode(ChargeUpdateParams.PaymentDetails.Flight.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              ChargeUpdateParams.PaymentDetails.Flight.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          Object email;

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
          Object name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          Object phone;

          private Recipient(
              Object email, Map<String, Object> extraParams, Object name, Object phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object email;

            private Map<String, Object> extraParams;

            private Object name;

            private Object phone;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.Flight.Delivery.Recipient build() {
              return new ChargeUpdateParams.PaymentDetails.Flight.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(EmptyParam email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.Flight.Delivery.Recipient#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.Flight.Delivery.Recipient#extraParams} for the
             * field documentation.
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

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(EmptyParam name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(EmptyParam phone) {
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
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Passenger(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Flight.Passenger build() {
            return new ChargeUpdateParams.PaymentDetails.Flight.Passenger(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Passenger#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Passenger#extraParams} for the
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
           * <strong>Required.</strong> Full name of the person or entity on the flight reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> Full name of the person or entity on the flight reservation.
           */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Segment {
        /** The flight segment amount. */
        @SerializedName("amount")
        Long amount;

        /**
         * The International Air Transport Association (IATA) airport code for the arrival airport.
         */
        @SerializedName("arrival_airport")
        Object arrivalAirport;

        /** The arrival time for the flight segment. Measured in seconds since the Unix epoch. */
        @SerializedName("arrives_at")
        Long arrivesAt;

        /**
         * The International Air Transport Association (IATA) carrier code of the carrier operating
         * the flight segment.
         */
        @SerializedName("carrier")
        Object carrier;

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
        Object departureAirport;

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
        Object flightNumber;

        /** The fare class for the segment. */
        @SerializedName("service_class")
        ServiceClass serviceClass;

        private Segment(
            Long amount,
            Object arrivalAirport,
            Long arrivesAt,
            Object carrier,
            Long departsAt,
            Object departureAirport,
            Map<String, Object> extraParams,
            Object flightNumber,
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

          private Object arrivalAirport;

          private Long arrivesAt;

          private Object carrier;

          private Long departsAt;

          private Object departureAirport;

          private Map<String, Object> extraParams;

          private Object flightNumber;

          private ServiceClass serviceClass;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Flight.Segment build() {
            return new ChargeUpdateParams.PaymentDetails.Flight.Segment(
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

          /**
           * The International Air Transport Association (IATA) airport code for the arrival
           * airport.
           */
          public Builder setArrivalAirport(EmptyParam arrivalAirport) {
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
           * The International Air Transport Association (IATA) carrier code of the carrier
           * operating the flight segment.
           */
          public Builder setCarrier(EmptyParam carrier) {
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
           * The International Air Transport Association (IATA) airport code for the departure
           * airport.
           */
          public Builder setDepartureAirport(EmptyParam departureAirport) {
            this.departureAirport = departureAirport;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Segment#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Flight.Segment#extraParams} for the
           * field documentation.
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

          /** The flight number associated with the segment. */
          public Builder setFlightNumber(EmptyParam flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** The fare class for the segment. */
          public Builder setServiceClass(
              ChargeUpdateParams.PaymentDetails.Flight.Segment.ServiceClass serviceClass) {
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
    @EqualsAndHashCode(callSuper = false)
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
      Object bookingNumber;

      /** The lodging category. */
      @SerializedName("category")
      Category category;

      /**
       * <strong>Required.</strong> Lodging check-in time. Measured in seconds since the Unix epoch.
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
      Object customerServicePhoneNumber;

      /** The daily lodging room rate. */
      @SerializedName("daily_room_rate_amount")
      Long dailyRoomRateAmount;

      /** Delivery details for this purchase. */
      @SerializedName("delivery")
      Delivery delivery;

      /** List of additional charges being billed. */
      @SerializedName("extra_charges")
      List<ChargeUpdateParams.PaymentDetails.Lodging.ExtraCharge> extraCharges;

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
      Object name;

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
      List<ChargeUpdateParams.PaymentDetails.Lodging.Passenger> passengers;

      /** The phone number of the lodging location. */
      @SerializedName("property_phone_number")
      Object propertyPhoneNumber;

      /** The room class for this purchase. */
      @SerializedName("room_class")
      Object roomClass;

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
          Object bookingNumber,
          Category category,
          Long checkinAt,
          Long checkoutAt,
          Object customerServicePhoneNumber,
          Long dailyRoomRateAmount,
          Delivery delivery,
          List<ChargeUpdateParams.PaymentDetails.Lodging.ExtraCharge> extraCharges,
          Map<String, Object> extraParams,
          Boolean fireSafetyActCompliance,
          Object name,
          Boolean noShow,
          Long numberOfRooms,
          List<ChargeUpdateParams.PaymentDetails.Lodging.Passenger> passengers,
          Object propertyPhoneNumber,
          Object roomClass,
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

        private Object bookingNumber;

        private Category category;

        private Long checkinAt;

        private Long checkoutAt;

        private Object customerServicePhoneNumber;

        private Long dailyRoomRateAmount;

        private Delivery delivery;

        private List<ChargeUpdateParams.PaymentDetails.Lodging.ExtraCharge> extraCharges;

        private Map<String, Object> extraParams;

        private Boolean fireSafetyActCompliance;

        private Object name;

        private Boolean noShow;

        private Long numberOfRooms;

        private List<ChargeUpdateParams.PaymentDetails.Lodging.Passenger> passengers;

        private Object propertyPhoneNumber;

        private Object roomClass;

        private Long roomNights;

        private Long totalRoomTaxAmount;

        private Long totalTaxAmount;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.Lodging build() {
          return new ChargeUpdateParams.PaymentDetails.Lodging(
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
        public Builder setAddress(ChargeUpdateParams.PaymentDetails.Lodging.Address address) {
          this.address = address;
          return this;
        }

        /** The number of adults on the booking. */
        public Builder setAdults(Long adults) {
          this.adults = adults;
          return this;
        }

        /** Affiliate details for this purchase. */
        public Builder setAffiliate(ChargeUpdateParams.PaymentDetails.Lodging.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** The booking number associated with the lodging reservation. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** The booking number associated with the lodging reservation. */
        public Builder setBookingNumber(EmptyParam bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** The lodging category. */
        public Builder setCategory(ChargeUpdateParams.PaymentDetails.Lodging.Category category) {
          this.category = category;
          return this;
        }

        /**
         * <strong>Required.</strong> Lodging check-in time. Measured in seconds since the Unix
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

        /** The customer service phone number of the lodging company. */
        public Builder setCustomerServicePhoneNumber(EmptyParam customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** The daily lodging room rate. */
        public Builder setDailyRoomRateAmount(Long dailyRoomRateAmount) {
          this.dailyRoomRateAmount = dailyRoomRateAmount;
          return this;
        }

        /** Delivery details for this purchase. */
        public Builder setDelivery(ChargeUpdateParams.PaymentDetails.Lodging.Delivery delivery) {
          this.delivery = delivery;
          return this;
        }

        /**
         * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Lodging#extraCharges} for the field documentation.
         */
        public Builder addExtraCharge(
            ChargeUpdateParams.PaymentDetails.Lodging.ExtraCharge element) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.add(element);
          return this;
        }

        /**
         * Add all elements to `extraCharges` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Lodging#extraCharges} for the field documentation.
         */
        public Builder addAllExtraCharge(
            List<ChargeUpdateParams.PaymentDetails.Lodging.ExtraCharge> elements) {
          if (this.extraCharges == null) {
            this.extraCharges = new ArrayList<>();
          }
          this.extraCharges.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging#extraParams} for the field
         * documentation.
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

        /** The name of the lodging location. */
        public Builder setName(EmptyParam name) {
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
         * ChargeUpdateParams.PaymentDetails.Lodging#passengers} for the field documentation.
         */
        public Builder addPassenger(ChargeUpdateParams.PaymentDetails.Lodging.Passenger element) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.add(element);
          return this;
        }

        /**
         * Add all elements to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.Lodging#passengers} for the field documentation.
         */
        public Builder addAllPassenger(
            List<ChargeUpdateParams.PaymentDetails.Lodging.Passenger> elements) {
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

        /** The phone number of the lodging location. */
        public Builder setPropertyPhoneNumber(EmptyParam propertyPhoneNumber) {
          this.propertyPhoneNumber = propertyPhoneNumber;
          return this;
        }

        /** The room class for this purchase. */
        public Builder setRoomClass(String roomClass) {
          this.roomClass = roomClass;
          return this;
        }

        /** The room class for this purchase. */
        public Builder setRoomClass(EmptyParam roomClass) {
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
      @EqualsAndHashCode(callSuper = false)
      public static class Address {
        /** City, district, suburb, town, or village. */
        @SerializedName("city")
        Object city;

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        @SerializedName("country")
        Object country;

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
        Object line1;

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        @SerializedName("line2")
        Object line2;

        /** ZIP or postal code. */
        @SerializedName("postal_code")
        Object postalCode;

        /** State, county, province, or region. */
        @SerializedName("state")
        Object state;

        private Address(
            Object city,
            Object country,
            Map<String, Object> extraParams,
            Object line1,
            Object line2,
            Object postalCode,
            Object state) {
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
          private Object city;

          private Object country;

          private Map<String, Object> extraParams;

          private Object line1;

          private Object line2;

          private Object postalCode;

          private Object state;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Lodging.Address build() {
            return new ChargeUpdateParams.PaymentDetails.Lodging.Address(
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

          /** City, district, suburb, town, or village. */
          public Builder setCity(EmptyParam city) {
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
           * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
           * 3166-1 alpha-2</a>).
           */
          public Builder setCountry(EmptyParam country) {
            this.country = country;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Address#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Address#extraParams} for the
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

          /** Address line 1 (e.g., street, PO Box, or company name). */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2 (e.g., apartment, suite, unit, or building). */
          public Builder setLine2(EmptyParam line2) {
            this.line2 = line2;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** ZIP or postal code. */
          public Builder setPostalCode(EmptyParam postalCode) {
            this.postalCode = postalCode;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(String state) {
            this.state = state;
            return this;
          }

          /** State, county, province, or region. */
          public Builder setState(EmptyParam state) {
            this.state = state;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Affiliate(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Lodging.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.Lodging.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Affiliate#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Affiliate#extraParams} for
           * the field documentation.
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

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public ChargeUpdateParams.PaymentDetails.Lodging.Delivery build() {
            return new ChargeUpdateParams.PaymentDetails.Lodging.Delivery(
                this.extraParams, this.mode, this.recipient);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Delivery#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Delivery#extraParams} for the
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
          public Builder setMode(ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Mode mode) {
            this.mode = mode;
            return this;
          }

          /** Details of the recipient. */
          public Builder setRecipient(
              ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Recipient recipient) {
            this.recipient = recipient;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Recipient {
          /** The email of the recipient the ticket is delivered to. */
          @SerializedName("email")
          Object email;

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
          Object name;

          /** The phone number of the recipient the ticket is delivered to. */
          @SerializedName("phone")
          Object phone;

          private Recipient(
              Object email, Map<String, Object> extraParams, Object name, Object phone) {
            this.email = email;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object email;

            private Map<String, Object> extraParams;

            private Object name;

            private Object phone;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Recipient build() {
              return new ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Recipient(
                  this.email, this.extraParams, this.name, this.phone);
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(String email) {
              this.email = email;
              return this;
            }

            /** The email of the recipient the ticket is delivered to. */
            public Builder setEmail(EmptyParam email) {
              this.email = email;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Recipient#extraParams} for the
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.Lodging.Delivery.Recipient#extraParams} for the
             * field documentation.
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

            /** The name of the recipient the ticket is delivered to. */
            public Builder setName(EmptyParam name) {
              this.name = name;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(String phone) {
              this.phone = phone;
              return this;
            }

            /** The phone number of the recipient the ticket is delivered to. */
            public Builder setPhone(EmptyParam phone) {
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
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Passenger(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Lodging.Passenger build() {
            return new ChargeUpdateParams.PaymentDetails.Lodging.Passenger(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Passenger#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Lodging.Passenger#extraParams} for
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
           * <strong>Required.</strong> Full name of the person or entity on the lodging
           * reservation.
           */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /**
           * <strong>Required.</strong> Full name of the person or entity on the lodging
           * reservation.
           */
          public Builder setName(EmptyParam name) {
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
    @EqualsAndHashCode(callSuper = false)
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
      Object name;

      /** Subscription start time. Measured in seconds since the Unix epoch. */
      @SerializedName("starts_at")
      Long startsAt;

      private Subscription(
          Affiliate affiliate,
          Boolean autoRenewal,
          BillingInterval billingInterval,
          Long endsAt,
          Map<String, Object> extraParams,
          Object name,
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

        private Object name;

        private Long startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.Subscription build() {
          return new ChargeUpdateParams.PaymentDetails.Subscription(
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
            ChargeUpdateParams.PaymentDetails.Subscription.Affiliate affiliate) {
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
            ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval billingInterval) {
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.Subscription#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.Subscription#extraParams} for the field
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
         * <strong>Required.</strong> Name of the product on subscription. e.g. Apple Music
         * Subscription
         */
        public Builder setName(String name) {
          this.name = name;
          return this;
        }

        /**
         * <strong>Required.</strong> Name of the product on subscription. e.g. Apple Music
         * Subscription
         */
        public Builder setName(EmptyParam name) {
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
      @EqualsAndHashCode(callSuper = false)
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
        Object name;

        private Affiliate(Map<String, Object> extraParams, Object name) {
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.Subscription.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.Subscription.Affiliate(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.Subscription.Affiliate#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.Subscription.Affiliate#extraParams}
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

          /** <strong>Required.</strong> The name of the affiliate that originated the purchase. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
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
          public ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval build() {
            return new ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval(
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
           * ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval#extraParams} for the
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
           * ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval#extraParams} for the
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
           * <strong>Required.</strong> Specifies a type of interval unit. Either {@code day},
           * {@code week}, {@code month} or {@code year}.
           */
          public Builder setInterval(
              ChargeUpdateParams.PaymentDetails.Subscription.BillingInterval.Interval interval) {
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
  @EqualsAndHashCode(callSuper = false)
  public static class Shipping {
    /** <strong>Required.</strong> Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    Object carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Recipient name. */
    @SerializedName("name")
    Object name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    Object phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    Object trackingNumber;

    private Shipping(
        Address address,
        Object carrier,
        Map<String, Object> extraParams,
        Object name,
        Object phone,
        Object trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private Object carrier;

      private Map<String, Object> extraParams;

      private Object name;

      private Object phone;

      private Object trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public ChargeUpdateParams.Shipping build() {
        return new ChargeUpdateParams.Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** <strong>Required.</strong> Shipping address. */
      public Builder setAddress(ChargeUpdateParams.Shipping.Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(EmptyParam carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeUpdateParams.Shipping#extraParams} for the field documentation.
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
       * See {@link ChargeUpdateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** <strong>Required.</strong> Recipient name. */
      public Builder setName(EmptyParam name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(EmptyParam phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(EmptyParam trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      Object city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      Object country;

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
      Object line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      Object line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      Object postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      Object state;

      private Address(
          Object city,
          Object country,
          Map<String, Object> extraParams,
          Object line1,
          Object line2,
          Object postalCode,
          Object state) {
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
        private Object city;

        private Object country;

        private Map<String, Object> extraParams;

        private Object line1;

        private Object line2;

        private Object postalCode;

        private Object state;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.Shipping.Address build() {
          return new ChargeUpdateParams.Shipping.Address(
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

        /** City, district, suburb, town, or village. */
        public Builder setCity(EmptyParam city) {
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
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(EmptyParam country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.Shipping.Address#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.Shipping.Address#extraParams} for the field
         * documentation.
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

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(EmptyParam line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(EmptyParam postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(EmptyParam state) {
          this.state = state;
          return this;
        }
      }
    }
  }
}
