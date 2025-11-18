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

    /** Car rental data for this PaymentIntent. */
    @SerializedName("car_rental_data")
    Object carRentalData;

    /**
     * A unique value to identify the customer. This field is available only for card payments.
     *
     * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being sent
     * to card networks.
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

    /** Flight data for this PaymentIntent. */
    @SerializedName("flight_data")
    Object flightData;

    /** Lodging reservation details for this PaymentIntent. */
    @SerializedName("lodging")
    Lodging lodging;

    /** Lodging data for this PaymentIntent. */
    @SerializedName("lodging_data")
    Object lodgingData;

    /**
     * A unique value assigned by the business to identify the transaction. Required for L2 and L3
     * rates.
     *
     * <p>Required when the Payment Method Types array contains {@code card}, including when <a
     * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
     * is set to {@code true}.
     *
     * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces, before
     * being sent to card networks. For Klarna, this field is truncated to 255 characters and is
     * visible to customers when they view the order in the Klarna app.
     */
    @SerializedName("order_reference")
    Object orderReference;

    /** Subscription details for this PaymentIntent. */
    @SerializedName("subscription")
    Subscription subscription;

    private PaymentDetails(
        CarRental carRental,
        Object carRentalData,
        Object customerReference,
        EventDetails eventDetails,
        Map<String, Object> extraParams,
        Flight flight,
        Object flightData,
        Lodging lodging,
        Object lodgingData,
        Object orderReference,
        Subscription subscription) {
      this.carRental = carRental;
      this.carRentalData = carRentalData;
      this.customerReference = customerReference;
      this.eventDetails = eventDetails;
      this.extraParams = extraParams;
      this.flight = flight;
      this.flightData = flightData;
      this.lodging = lodging;
      this.lodgingData = lodgingData;
      this.orderReference = orderReference;
      this.subscription = subscription;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CarRental carRental;

      private Object carRentalData;

      private Object customerReference;

      private EventDetails eventDetails;

      private Map<String, Object> extraParams;

      private Flight flight;

      private Object flightData;

      private Lodging lodging;

      private Object lodgingData;

      private Object orderReference;

      private Subscription subscription;

      /** Finalize and obtain parameter instance from this builder. */
      public ChargeUpdateParams.PaymentDetails build() {
        return new ChargeUpdateParams.PaymentDetails(
            this.carRental,
            this.carRentalData,
            this.customerReference,
            this.eventDetails,
            this.extraParams,
            this.flight,
            this.flightData,
            this.lodging,
            this.lodgingData,
            this.orderReference,
            this.subscription);
      }

      /** Car rental details for this PaymentIntent. */
      public Builder setCarRental(ChargeUpdateParams.PaymentDetails.CarRental carRental) {
        this.carRental = carRental;
        return this;
      }

      /**
       * Add an element to `carRentalData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#carRentalData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addCarRentalData(ChargeUpdateParams.PaymentDetails.CarRentalData element) {
        if (this.carRentalData == null || this.carRentalData instanceof EmptyParam) {
          this.carRentalData = new ArrayList<ChargeUpdateParams.PaymentDetails.CarRentalData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.CarRentalData>) this.carRentalData).add(element);
        return this;
      }

      /**
       * Add all elements to `carRentalData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#carRentalData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllCarRentalData(
          List<ChargeUpdateParams.PaymentDetails.CarRentalData> elements) {
        if (this.carRentalData == null || this.carRentalData instanceof EmptyParam) {
          this.carRentalData = new ArrayList<ChargeUpdateParams.PaymentDetails.CarRentalData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.CarRentalData>) this.carRentalData)
            .addAll(elements);
        return this;
      }

      /** Car rental data for this PaymentIntent. */
      public Builder setCarRentalData(EmptyParam carRentalData) {
        this.carRentalData = carRentalData;
        return this;
      }

      /** Car rental data for this PaymentIntent. */
      public Builder setCarRentalData(
          List<ChargeUpdateParams.PaymentDetails.CarRentalData> carRentalData) {
        this.carRentalData = carRentalData;
        return this;
      }

      /**
       * A unique value to identify the customer. This field is available only for card payments.
       *
       * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being
       * sent to card networks.
       */
      public Builder setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
      }

      /**
       * A unique value to identify the customer. This field is available only for card payments.
       *
       * <p>This field is truncated to 25 alphanumeric characters, excluding spaces, before being
       * sent to card networks.
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

      /**
       * Add an element to `flightData` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#flightData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addFlightData(ChargeUpdateParams.PaymentDetails.FlightData element) {
        if (this.flightData == null || this.flightData instanceof EmptyParam) {
          this.flightData = new ArrayList<ChargeUpdateParams.PaymentDetails.FlightData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.FlightData>) this.flightData).add(element);
        return this;
      }

      /**
       * Add all elements to `flightData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#flightData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllFlightData(List<ChargeUpdateParams.PaymentDetails.FlightData> elements) {
        if (this.flightData == null || this.flightData instanceof EmptyParam) {
          this.flightData = new ArrayList<ChargeUpdateParams.PaymentDetails.FlightData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.FlightData>) this.flightData).addAll(elements);
        return this;
      }

      /** Flight data for this PaymentIntent. */
      public Builder setFlightData(EmptyParam flightData) {
        this.flightData = flightData;
        return this;
      }

      /** Flight data for this PaymentIntent. */
      public Builder setFlightData(List<ChargeUpdateParams.PaymentDetails.FlightData> flightData) {
        this.flightData = flightData;
        return this;
      }

      /** Lodging reservation details for this PaymentIntent. */
      public Builder setLodging(ChargeUpdateParams.PaymentDetails.Lodging lodging) {
        this.lodging = lodging;
        return this;
      }

      /**
       * Add an element to `lodgingData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#lodgingData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addLodgingData(ChargeUpdateParams.PaymentDetails.LodgingData element) {
        if (this.lodgingData == null || this.lodgingData instanceof EmptyParam) {
          this.lodgingData = new ArrayList<ChargeUpdateParams.PaymentDetails.LodgingData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.LodgingData>) this.lodgingData).add(element);
        return this;
      }

      /**
       * Add all elements to `lodgingData` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ChargeUpdateParams.PaymentDetails#lodgingData} for the field documentation.
       */
      @SuppressWarnings("unchecked")
      public Builder addAllLodgingData(
          List<ChargeUpdateParams.PaymentDetails.LodgingData> elements) {
        if (this.lodgingData == null || this.lodgingData instanceof EmptyParam) {
          this.lodgingData = new ArrayList<ChargeUpdateParams.PaymentDetails.LodgingData>();
        }
        ((List<ChargeUpdateParams.PaymentDetails.LodgingData>) this.lodgingData).addAll(elements);
        return this;
      }

      /** Lodging data for this PaymentIntent. */
      public Builder setLodgingData(EmptyParam lodgingData) {
        this.lodgingData = lodgingData;
        return this;
      }

      /** Lodging data for this PaymentIntent. */
      public Builder setLodgingData(
          List<ChargeUpdateParams.PaymentDetails.LodgingData> lodgingData) {
        this.lodgingData = lodgingData;
        return this;
      }

      /**
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates.
       *
       * <p>Required when the Payment Method Types array contains {@code card}, including when <a
       * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
       * is set to {@code true}.
       *
       * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks. For Klarna, this field is truncated to 255 characters
       * and is visible to customers when they view the order in the Klarna app.
       */
      public Builder setOrderReference(String orderReference) {
        this.orderReference = orderReference;
        return this;
      }

      /**
       * A unique value assigned by the business to identify the transaction. Required for L2 and L3
       * rates.
       *
       * <p>Required when the Payment Method Types array contains {@code card}, including when <a
       * href="https://stripe.com/api/payment_intents/create#create_payment_intent-automatic_payment_methods-enabled">automatic_payment_methods.enabled</a>
       * is set to {@code true}.
       *
       * <p>For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces,
       * before being sent to card networks. For Klarna, this field is truncated to 255 characters
       * and is visible to customers when they view the order in the Klarna app.
       */
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

      /** The details of the distance traveled during the rental period. */
      @SerializedName("distance")
      Distance distance;

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

      /** Name of the pickup location. */
      @SerializedName("pickup_location_name")
      Object pickupLocationName;

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

      /** Name of the return location. */
      @SerializedName("return_location_name")
      Object returnLocationName;

      /** Indicates whether the goods or services are tax-exempt or tax is not collected. */
      @SerializedName("tax_exempt")
      Boolean taxExempt;

      /** The vehicle identification number. */
      @SerializedName("vehicle_identification_number")
      Object vehicleIdentificationNumber;

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
          Distance distance,
          List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> drivers,
          List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> extraCharges,
          Map<String, Object> extraParams,
          Boolean noShow,
          PickupAddress pickupAddress,
          Long pickupAt,
          Object pickupLocationName,
          Long rateAmount,
          RateInterval rateInterval,
          Object renterName,
          ReturnAddress returnAddress,
          Long returnAt,
          Object returnLocationName,
          Boolean taxExempt,
          Object vehicleIdentificationNumber) {
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.carClassCode = carClassCode;
        this.carMake = carMake;
        this.carModel = carModel;
        this.company = company;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.daysRented = daysRented;
        this.delivery = delivery;
        this.distance = distance;
        this.drivers = drivers;
        this.extraCharges = extraCharges;
        this.extraParams = extraParams;
        this.noShow = noShow;
        this.pickupAddress = pickupAddress;
        this.pickupAt = pickupAt;
        this.pickupLocationName = pickupLocationName;
        this.rateAmount = rateAmount;
        this.rateInterval = rateInterval;
        this.renterName = renterName;
        this.returnAddress = returnAddress;
        this.returnAt = returnAt;
        this.returnLocationName = returnLocationName;
        this.taxExempt = taxExempt;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
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

        private Distance distance;

        private List<ChargeUpdateParams.PaymentDetails.CarRental.Driver> drivers;

        private List<ChargeUpdateParams.PaymentDetails.CarRental.ExtraCharge> extraCharges;

        private Map<String, Object> extraParams;

        private Boolean noShow;

        private PickupAddress pickupAddress;

        private Long pickupAt;

        private Object pickupLocationName;

        private Long rateAmount;

        private RateInterval rateInterval;

        private Object renterName;

        private ReturnAddress returnAddress;

        private Long returnAt;

        private Object returnLocationName;

        private Boolean taxExempt;

        private Object vehicleIdentificationNumber;

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
              this.distance,
              this.drivers,
              this.extraCharges,
              this.extraParams,
              this.noShow,
              this.pickupAddress,
              this.pickupAt,
              this.pickupLocationName,
              this.rateAmount,
              this.rateInterval,
              this.renterName,
              this.returnAddress,
              this.returnAt,
              this.returnLocationName,
              this.taxExempt,
              this.vehicleIdentificationNumber);
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

        /** The details of the distance traveled during the rental period. */
        public Builder setDistance(ChargeUpdateParams.PaymentDetails.CarRental.Distance distance) {
          this.distance = distance;
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

        /** Name of the pickup location. */
        public Builder setPickupLocationName(String pickupLocationName) {
          this.pickupLocationName = pickupLocationName;
          return this;
        }

        /** Name of the pickup location. */
        public Builder setPickupLocationName(EmptyParam pickupLocationName) {
          this.pickupLocationName = pickupLocationName;
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

        /** Name of the return location. */
        public Builder setReturnLocationName(String returnLocationName) {
          this.returnLocationName = returnLocationName;
          return this;
        }

        /** Name of the return location. */
        public Builder setReturnLocationName(EmptyParam returnLocationName) {
          this.returnLocationName = returnLocationName;
          return this;
        }

        /** Indicates whether the goods or services are tax-exempt or tax is not collected. */
        public Builder setTaxExempt(Boolean taxExempt) {
          this.taxExempt = taxExempt;
          return this;
        }

        /** The vehicle identification number. */
        public Builder setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
          this.vehicleIdentificationNumber = vehicleIdentificationNumber;
          return this;
        }

        /** The vehicle identification number. */
        public Builder setVehicleIdentificationNumber(EmptyParam vehicleIdentificationNumber) {
          this.vehicleIdentificationNumber = vehicleIdentificationNumber;
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
      public static class Distance {
        /** Distance traveled. */
        @SerializedName("amount")
        Long amount;

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
         * Unit of measurement for the distance traveled. One of {@code miles} or {@code
         * kilometers}.
         */
        @SerializedName("unit")
        Unit unit;

        private Distance(Long amount, Map<String, Object> extraParams, Unit unit) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.unit = unit;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private Unit unit;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.Distance build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.Distance(
                this.amount, this.extraParams, this.unit);
          }

          /** Distance traveled. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Distance#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRental.Distance#extraParams} for
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
           * Unit of measurement for the distance traveled. One of {@code miles} or {@code
           * kilometers}.
           */
          public Builder setUnit(ChargeUpdateParams.PaymentDetails.CarRental.Distance.Unit unit) {
            this.unit = unit;
            return this;
          }
        }

        public enum Unit implements ApiRequestParams.EnumParam {
          @SerializedName("kilometers")
          KILOMETERS("kilometers"),

          @SerializedName("miles")
          MILES("miles");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Unit(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Driver {
        /** Driver's identification number. */
        @SerializedName("driver_identification_number")
        Object driverIdentificationNumber;

        /** Driver's tax number. */
        @SerializedName("driver_tax_number")
        Object driverTaxNumber;

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

        private Driver(
            Object driverIdentificationNumber,
            Object driverTaxNumber,
            Map<String, Object> extraParams,
            Object name) {
          this.driverIdentificationNumber = driverIdentificationNumber;
          this.driverTaxNumber = driverTaxNumber;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object driverIdentificationNumber;

          private Object driverTaxNumber;

          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRental.Driver build() {
            return new ChargeUpdateParams.PaymentDetails.CarRental.Driver(
                this.driverIdentificationNumber, this.driverTaxNumber, this.extraParams, this.name);
          }

          /** Driver's identification number. */
          public Builder setDriverIdentificationNumber(String driverIdentificationNumber) {
            this.driverIdentificationNumber = driverIdentificationNumber;
            return this;
          }

          /** Driver's identification number. */
          public Builder setDriverIdentificationNumber(EmptyParam driverIdentificationNumber) {
            this.driverIdentificationNumber = driverIdentificationNumber;
            return this;
          }

          /** Driver's tax number. */
          public Builder setDriverTaxNumber(String driverTaxNumber) {
            this.driverTaxNumber = driverTaxNumber;
            return this;
          }

          /** Driver's tax number. */
          public Builder setDriverTaxNumber(EmptyParam driverTaxNumber) {
            this.driverTaxNumber = driverTaxNumber;
            return this;
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
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

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
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

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
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
    public static class CarRentalData {
      /** Affiliate (such as travel agency) details for the rental. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Booking confirmation number for the car rental. */
      @SerializedName("booking_number")
      Object bookingNumber;

      /** Name of the car rental company. */
      @SerializedName("carrier_name")
      Object carrierName;

      /** Customer service phone number for the car rental company. */
      @SerializedName("customer_service_phone_number")
      Object customerServicePhoneNumber;

      /** Number of days the car is being rented. */
      @SerializedName("days_rented")
      Long daysRented;

      /** Distance details for the rental. */
      @SerializedName("distance")
      Distance distance;

      /** List of drivers for the rental. */
      @SerializedName("drivers")
      List<ChargeUpdateParams.PaymentDetails.CarRentalData.Driver> drivers;

      /** <strong>Required.</strong> Drop-off location details. */
      @SerializedName("drop_off")
      DropOff dropOff;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Insurance details for the rental. */
      @SerializedName("insurances")
      List<ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance> insurances;

      /** Indicates if the customer was a no-show. */
      @SerializedName("no_show_indicator")
      Boolean noShowIndicator;

      /** <strong>Required.</strong> Pickup location details. */
      @SerializedName("pickup")
      Pickup pickup;

      /** Name of the person renting the vehicle. */
      @SerializedName("renter_name")
      Object renterName;

      /** <strong>Required.</strong> Total cost breakdown for the rental. */
      @SerializedName("total")
      Total total;

      /** Vehicle details for the rental. */
      @SerializedName("vehicle")
      Vehicle vehicle;

      private CarRentalData(
          Affiliate affiliate,
          Object bookingNumber,
          Object carrierName,
          Object customerServicePhoneNumber,
          Long daysRented,
          Distance distance,
          List<ChargeUpdateParams.PaymentDetails.CarRentalData.Driver> drivers,
          DropOff dropOff,
          Map<String, Object> extraParams,
          List<ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance> insurances,
          Boolean noShowIndicator,
          Pickup pickup,
          Object renterName,
          Total total,
          Vehicle vehicle) {
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.carrierName = carrierName;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.daysRented = daysRented;
        this.distance = distance;
        this.drivers = drivers;
        this.dropOff = dropOff;
        this.extraParams = extraParams;
        this.insurances = insurances;
        this.noShowIndicator = noShowIndicator;
        this.pickup = pickup;
        this.renterName = renterName;
        this.total = total;
        this.vehicle = vehicle;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private Object bookingNumber;

        private Object carrierName;

        private Object customerServicePhoneNumber;

        private Long daysRented;

        private Distance distance;

        private List<ChargeUpdateParams.PaymentDetails.CarRentalData.Driver> drivers;

        private DropOff dropOff;

        private Map<String, Object> extraParams;

        private List<ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance> insurances;

        private Boolean noShowIndicator;

        private Pickup pickup;

        private Object renterName;

        private Total total;

        private Vehicle vehicle;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.CarRentalData build() {
          return new ChargeUpdateParams.PaymentDetails.CarRentalData(
              this.affiliate,
              this.bookingNumber,
              this.carrierName,
              this.customerServicePhoneNumber,
              this.daysRented,
              this.distance,
              this.drivers,
              this.dropOff,
              this.extraParams,
              this.insurances,
              this.noShowIndicator,
              this.pickup,
              this.renterName,
              this.total,
              this.vehicle);
        }

        /** Affiliate (such as travel agency) details for the rental. */
        public Builder setAffiliate(
            ChargeUpdateParams.PaymentDetails.CarRentalData.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Booking confirmation number for the car rental. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Booking confirmation number for the car rental. */
        public Builder setBookingNumber(EmptyParam bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Name of the car rental company. */
        public Builder setCarrierName(String carrierName) {
          this.carrierName = carrierName;
          return this;
        }

        /** Name of the car rental company. */
        public Builder setCarrierName(EmptyParam carrierName) {
          this.carrierName = carrierName;
          return this;
        }

        /** Customer service phone number for the car rental company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** Customer service phone number for the car rental company. */
        public Builder setCustomerServicePhoneNumber(EmptyParam customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** Number of days the car is being rented. */
        public Builder setDaysRented(Long daysRented) {
          this.daysRented = daysRented;
          return this;
        }

        /** Distance details for the rental. */
        public Builder setDistance(
            ChargeUpdateParams.PaymentDetails.CarRentalData.Distance distance) {
          this.distance = distance;
          return this;
        }

        /**
         * Add an element to `drivers` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRentalData#drivers} for the field documentation.
         */
        public Builder addDriver(ChargeUpdateParams.PaymentDetails.CarRentalData.Driver element) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.add(element);
          return this;
        }

        /**
         * Add all elements to `drivers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRentalData#drivers} for the field documentation.
         */
        public Builder addAllDriver(
            List<ChargeUpdateParams.PaymentDetails.CarRentalData.Driver> elements) {
          if (this.drivers == null) {
            this.drivers = new ArrayList<>();
          }
          this.drivers.addAll(elements);
          return this;
        }

        /** <strong>Required.</strong> Drop-off location details. */
        public Builder setDropOff(ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff dropOff) {
          this.dropOff = dropOff;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData#extraParams} for the
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData#extraParams} for the
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
         * Add an element to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRentalData#insurances} for the field documentation.
         */
        public Builder addInsurance(
            ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance element) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.add(element);
          return this;
        }

        /**
         * Add all elements to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.CarRentalData#insurances} for the field documentation.
         */
        public Builder addAllInsurance(
            List<ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance> elements) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.addAll(elements);
          return this;
        }

        /** Indicates if the customer was a no-show. */
        public Builder setNoShowIndicator(Boolean noShowIndicator) {
          this.noShowIndicator = noShowIndicator;
          return this;
        }

        /** <strong>Required.</strong> Pickup location details. */
        public Builder setPickup(ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup pickup) {
          this.pickup = pickup;
          return this;
        }

        /** Name of the person renting the vehicle. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** Name of the person renting the vehicle. */
        public Builder setRenterName(EmptyParam renterName) {
          this.renterName = renterName;
          return this;
        }

        /** <strong>Required.</strong> Total cost breakdown for the rental. */
        public Builder setTotal(ChargeUpdateParams.PaymentDetails.CarRentalData.Total total) {
          this.total = total;
          return this;
        }

        /** Vehicle details for the rental. */
        public Builder setVehicle(ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle vehicle) {
          this.vehicle = vehicle;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Affiliate {
        /** Affiliate partner code. */
        @SerializedName("code")
        Object code;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of affiliate partner. */
        @SerializedName("name")
        Object name;

        private Affiliate(Object code, Map<String, Object> extraParams, Object name) {
          this.code = code;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object code;

          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Affiliate(
                this.code, this.extraParams, this.name);
          }

          /** Affiliate partner code. */
          public Builder setCode(String code) {
            this.code = code;
            return this;
          }

          /** Affiliate partner code. */
          public Builder setCode(EmptyParam code) {
            this.code = code;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Affiliate#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Affiliate#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of affiliate partner. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Name of affiliate partner. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Distance {
        /** <strong>Required.</strong> Distance traveled. */
        @SerializedName("amount")
        Long amount;

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
         * <strong>Required.</strong> Unit of measurement for the distance traveled. One of {@code
         * miles} or {@code kilometers}.
         */
        @SerializedName("unit")
        Unit unit;

        private Distance(Long amount, Map<String, Object> extraParams, Unit unit) {
          this.amount = amount;
          this.extraParams = extraParams;
          this.unit = unit;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Map<String, Object> extraParams;

          private Unit unit;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Distance build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Distance(
                this.amount, this.extraParams, this.unit);
          }

          /** <strong>Required.</strong> Distance traveled. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Distance#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Distance#extraParams}
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
           * <strong>Required.</strong> Unit of measurement for the distance traveled. One of {@code
           * miles} or {@code kilometers}.
           */
          public Builder setUnit(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Distance.Unit unit) {
            this.unit = unit;
            return this;
          }
        }

        public enum Unit implements ApiRequestParams.EnumParam {
          @SerializedName("kilometers")
          KILOMETERS("kilometers"),

          @SerializedName("miles")
          MILES("miles");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Unit(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Driver {
        /** Driver's date of birth. */
        @SerializedName("date_of_birth")
        DateOfBirth dateOfBirth;

        /** Driver's identification number. */
        @SerializedName("driver_identification_number")
        Object driverIdentificationNumber;

        /** Driver's tax number. */
        @SerializedName("driver_tax_number")
        Object driverTaxNumber;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Driver's full name. */
        @SerializedName("name")
        Object name;

        private Driver(
            DateOfBirth dateOfBirth,
            Object driverIdentificationNumber,
            Object driverTaxNumber,
            Map<String, Object> extraParams,
            Object name) {
          this.dateOfBirth = dateOfBirth;
          this.driverIdentificationNumber = driverIdentificationNumber;
          this.driverTaxNumber = driverTaxNumber;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private DateOfBirth dateOfBirth;

          private Object driverIdentificationNumber;

          private Object driverTaxNumber;

          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Driver build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Driver(
                this.dateOfBirth,
                this.driverIdentificationNumber,
                this.driverTaxNumber,
                this.extraParams,
                this.name);
          }

          /** Driver's date of birth. */
          public Builder setDateOfBirth(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Driver.DateOfBirth dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
          }

          /** Driver's identification number. */
          public Builder setDriverIdentificationNumber(String driverIdentificationNumber) {
            this.driverIdentificationNumber = driverIdentificationNumber;
            return this;
          }

          /** Driver's identification number. */
          public Builder setDriverIdentificationNumber(EmptyParam driverIdentificationNumber) {
            this.driverIdentificationNumber = driverIdentificationNumber;
            return this;
          }

          /** Driver's tax number. */
          public Builder setDriverTaxNumber(String driverTaxNumber) {
            this.driverTaxNumber = driverTaxNumber;
            return this;
          }

          /** Driver's tax number. */
          public Builder setDriverTaxNumber(EmptyParam driverTaxNumber) {
            this.driverTaxNumber = driverTaxNumber;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Driver#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Driver#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Driver's full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** <strong>Required.</strong> Driver's full name. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DateOfBirth {
          /** <strong>Required.</strong> Day of birth (1-31). */
          @SerializedName("day")
          Long day;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Month of birth (1-12). */
          @SerializedName("month")
          Long month;

          /** <strong>Required.</strong> Year of birth (must be greater than 1900). */
          @SerializedName("year")
          Long year;

          private DateOfBirth(Long day, Map<String, Object> extraParams, Long month, Long year) {
            this.day = day;
            this.extraParams = extraParams;
            this.month = month;
            this.year = year;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long day;

            private Map<String, Object> extraParams;

            private Long month;

            private Long year;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.CarRentalData.Driver.DateOfBirth build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.Driver.DateOfBirth(
                  this.day, this.extraParams, this.month, this.year);
            }

            /** <strong>Required.</strong> Day of birth (1-31). */
            public Builder setDay(Long day) {
              this.day = day;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Driver.DateOfBirth#extraParams} for
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
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Driver.DateOfBirth#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Month of birth (1-12). */
            public Builder setMonth(Long month) {
              this.month = month;
              return this;
            }

            /** <strong>Required.</strong> Year of birth (must be greater than 1900). */
            public Builder setYear(Long year) {
              this.year = year;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class DropOff {
        /** <strong>Required.</strong> Address of the rental location. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Location name. */
        @SerializedName("location_name")
        Object locationName;

        /** <strong>Required.</strong> Timestamp for the location. */
        @SerializedName("time")
        Long time;

        private DropOff(
            Address address, Map<String, Object> extraParams, Object locationName, Long time) {
          this.address = address;
          this.extraParams = extraParams;
          this.locationName = locationName;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Map<String, Object> extraParams;

          private Object locationName;

          private Long time;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff(
                this.address, this.extraParams, this.locationName, this.time);
          }

          /** <strong>Required.</strong> Address of the rental location. */
          public Builder setAddress(
              ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Location name. */
          public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
          }

          /** Location name. */
          public Builder setLocationName(EmptyParam locationName) {
            this.locationName = locationName;
            return this;
          }

          /** <strong>Required.</strong> Timestamp for the location. */
          public Builder setTime(Long time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          Object country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          Object line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          Object line2;

          /** <strong>Required.</strong> ZIP or postal code. */
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
            public ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff.Address build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(EmptyParam city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff.Address#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.CarRentalData.DropOff.Address#extraParams} for the
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /**
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(EmptyParam line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(EmptyParam line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Insurance {
        /** <strong>Required.</strong> Amount of the insurance coverage in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the insurance amount. */
        @SerializedName("currency")
        Object currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of the insurance company. */
        @SerializedName("insurance_company_name")
        Object insuranceCompanyName;

        /** <strong>Required.</strong> Type of insurance coverage. */
        @SerializedName("insurance_type")
        InsuranceType insuranceType;

        private Insurance(
            Long amount,
            Object currency,
            Map<String, Object> extraParams,
            Object insuranceCompanyName,
            InsuranceType insuranceType) {
          this.amount = amount;
          this.currency = currency;
          this.extraParams = extraParams;
          this.insuranceCompanyName = insuranceCompanyName;
          this.insuranceType = insuranceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object currency;

          private Map<String, Object> extraParams;

          private Object insuranceCompanyName;

          private InsuranceType insuranceType;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance(
                this.amount,
                this.currency,
                this.extraParams,
                this.insuranceCompanyName,
                this.insuranceType);
          }

          /** <strong>Required.</strong> Amount of the insurance coverage in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(String insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(EmptyParam insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** <strong>Required.</strong> Type of insurance coverage. */
          public Builder setInsuranceType(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Insurance.InsuranceType
                  insuranceType) {
            this.insuranceType = insuranceType;
            return this;
          }
        }

        public enum InsuranceType implements ApiRequestParams.EnumParam {
          @SerializedName("liability_supplement")
          LIABILITY_SUPPLEMENT("liability_supplement"),

          @SerializedName("loss_damage_waiver")
          LOSS_DAMAGE_WAIVER("loss_damage_waiver"),

          @SerializedName("other")
          OTHER("other"),

          @SerializedName("partial_damage_waiver")
          PARTIAL_DAMAGE_WAIVER("partial_damage_waiver"),

          @SerializedName("personal_accident")
          PERSONAL_ACCIDENT("personal_accident"),

          @SerializedName("personal_effects")
          PERSONAL_EFFECTS("personal_effects");

          @Getter(onMethod_ = {@Override})
          private final String value;

          InsuranceType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Pickup {
        /** <strong>Required.</strong> Address of the rental location. */
        @SerializedName("address")
        Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Location name. */
        @SerializedName("location_name")
        Object locationName;

        /** <strong>Required.</strong> Timestamp for the location. */
        @SerializedName("time")
        Long time;

        private Pickup(
            Address address, Map<String, Object> extraParams, Object locationName, Long time) {
          this.address = address;
          this.extraParams = extraParams;
          this.locationName = locationName;
          this.time = time;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Map<String, Object> extraParams;

          private Object locationName;

          private Long time;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup(
                this.address, this.extraParams, this.locationName, this.time);
          }

          /** <strong>Required.</strong> Address of the rental location. */
          public Builder setAddress(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup.Address address) {
            this.address = address;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Location name. */
          public Builder setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
          }

          /** Location name. */
          public Builder setLocationName(EmptyParam locationName) {
            this.locationName = locationName;
            return this;
          }

          /** <strong>Required.</strong> Timestamp for the location. */
          public Builder setTime(Long time) {
            this.time = time;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          Object country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          Object line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          Object line2;

          /** <strong>Required.</strong> ZIP or postal code. */
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
            public ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup.Address build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(EmptyParam city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup.Address#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Pickup.Address#extraParams} for the
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /**
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(EmptyParam line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(EmptyParam line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Total {
        /** <strong>Required.</strong> Total amount in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the amount. */
        @SerializedName("currency")
        Object currency;

        /** Discount details for the rental. */
        @SerializedName("discounts")
        Discounts discounts;

        /** Additional charges for the rental. */
        @SerializedName("extra_charges")
        List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge> extraCharges;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Rate per unit for the rental. */
        @SerializedName("rate_per_unit")
        Long ratePerUnit;

        /** Unit of measurement for the rate. */
        @SerializedName("rate_unit")
        RateUnit rateUnit;

        /** Tax breakdown for the rental. */
        @SerializedName("tax")
        Tax tax;

        private Total(
            Long amount,
            Object currency,
            Discounts discounts,
            List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge> extraCharges,
            Map<String, Object> extraParams,
            Long ratePerUnit,
            RateUnit rateUnit,
            Tax tax) {
          this.amount = amount;
          this.currency = currency;
          this.discounts = discounts;
          this.extraCharges = extraCharges;
          this.extraParams = extraParams;
          this.ratePerUnit = ratePerUnit;
          this.rateUnit = rateUnit;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object currency;

          private Discounts discounts;

          private List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge>
              extraCharges;

          private Map<String, Object> extraParams;

          private Long ratePerUnit;

          private RateUnit rateUnit;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Total build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Total(
                this.amount,
                this.currency,
                this.discounts,
                this.extraCharges,
                this.extraParams,
                this.ratePerUnit,
                this.rateUnit,
                this.tax);
          }

          /** <strong>Required.</strong> Total amount in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Currency of the amount. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /** Discount details for the rental. */
          public Builder setDiscounts(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Discounts discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ChargeUpdateParams.PaymentDetails.CarRentalData.Total#extraCharges} for the field
           * documentation.
           */
          public Builder addExtraCharge(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge element) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.add(element);
            return this;
          }

          /**
           * Add all elements to `extraCharges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Total#extraCharges} for the
           * field documentation.
           */
          public Builder addAllExtraCharge(
              List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge> elements) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Total#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Total#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Rate per unit for the rental. */
          public Builder setRatePerUnit(Long ratePerUnit) {
            this.ratePerUnit = ratePerUnit;
            return this;
          }

          /** Unit of measurement for the rate. */
          public Builder setRateUnit(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Total.RateUnit rateUnit) {
            this.rateUnit = rateUnit;
            return this;
          }

          /** Tax breakdown for the rental. */
          public Builder setTax(ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discounts {
          /** Corporate client discount code. */
          @SerializedName("corporate_client_code")
          Object corporateClientCode;

          /** Coupon code applied to the rental. */
          @SerializedName("coupon")
          Object coupon;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Maximum number of free miles or kilometers included. */
          @SerializedName("maximum_free_miles_or_kilometers")
          Long maximumFreeMilesOrKilometers;

          private Discounts(
              Object corporateClientCode,
              Object coupon,
              Map<String, Object> extraParams,
              Long maximumFreeMilesOrKilometers) {
            this.corporateClientCode = corporateClientCode;
            this.coupon = coupon;
            this.extraParams = extraParams;
            this.maximumFreeMilesOrKilometers = maximumFreeMilesOrKilometers;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object corporateClientCode;

            private Object coupon;

            private Map<String, Object> extraParams;

            private Long maximumFreeMilesOrKilometers;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Discounts build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Discounts(
                  this.corporateClientCode,
                  this.coupon,
                  this.extraParams,
                  this.maximumFreeMilesOrKilometers);
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(String corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(EmptyParam corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Coupon code applied to the rental. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** Coupon code applied to the rental. */
            public Builder setCoupon(EmptyParam coupon) {
              this.coupon = coupon;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Discounts#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Discounts#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Maximum number of free miles or kilometers included. */
            public Builder setMaximumFreeMilesOrKilometers(Long maximumFreeMilesOrKilometers) {
              this.maximumFreeMilesOrKilometers = maximumFreeMilesOrKilometers;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ExtraCharge {
          /** <strong>Required.</strong> Amount of the extra charge in cents. */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Type of extra charge. */
          @SerializedName("type")
          Type type;

          private ExtraCharge(Long amount, Map<String, Object> extraParams, Type type) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge(
                  this.amount, this.extraParams, this.type);
            }

            /** <strong>Required.</strong> Amount of the extra charge in cents. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge#extraParams} for
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
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> Type of extra charge. */
            public Builder setType(
                ChargeUpdateParams.PaymentDetails.CarRentalData.Total.ExtraCharge.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("extra_mileage")
            EXTRA_MILEAGE("extra_mileage"),

            @SerializedName("gas")
            GAS("gas"),

            @SerializedName("gps")
            GPS("gps"),

            @SerializedName("late_charge")
            LATE_CHARGE("late_charge"),

            @SerializedName("one_way_drop_off")
            ONE_WAY_DROP_OFF("one_way_drop_off"),

            @SerializedName("other")
            OTHER("other"),

            @SerializedName("parking")
            PARKING("parking"),

            @SerializedName("phone")
            PHONE("phone"),

            @SerializedName("regular_mileage")
            REGULAR_MILEAGE("regular_mileage"),

            @SerializedName("towing")
            TOWING("towing");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Indicates if the transaction is tax exempt. */
          @SerializedName("tax_exempt_indicator")
          Boolean taxExemptIndicator;

          /** Array of tax details. */
          @SerializedName("taxes")
          List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax> taxes;

          private Tax(
              Map<String, Object> extraParams,
              Boolean taxExemptIndicator,
              List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax> taxes) {
            this.extraParams = extraParams;
            this.taxExemptIndicator = taxExemptIndicator;
            this.taxes = taxes;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean taxExemptIndicator;

            private List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax> taxes;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax build() {
              return new ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax(
                  this.extraParams, this.taxExemptIndicator, this.taxes);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Indicates if the transaction is tax exempt. */
            public Builder setTaxExemptIndicator(Boolean taxExemptIndicator) {
              this.taxExemptIndicator = taxExemptIndicator;
              return this;
            }

            /**
             * Add an element to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addTax(
                ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax element) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.add(element);
              return this;
            }

            /**
             * Add all elements to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addAllTax(
                List<ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax> elements) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class InnerTax {
            /** Tax amount. */
            @SerializedName("amount")
            Long amount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Tax rate applied. */
            @SerializedName("rate")
            Long rate;

            /** Type of tax applied. */
            @SerializedName("type")
            Object type;

            private InnerTax(Long amount, Map<String, Object> extraParams, Long rate, Object type) {
              this.amount = amount;
              this.extraParams = extraParams;
              this.rate = rate;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private Map<String, Object> extraParams;

              private Long rate;

              private Object type;

              /** Finalize and obtain parameter instance from this builder. */
              public ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax build() {
                return new ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax(
                    this.amount, this.extraParams, this.rate, this.type);
              }

              /** Tax amount. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax#extraParams} for
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.CarRentalData.Total.Tax.InnerTax#extraParams} for
               * the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Tax rate applied. */
              public Builder setRate(Long rate) {
                this.rate = rate;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(String type) {
                this.type = type;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(EmptyParam type) {
                this.type = type;
                return this;
              }
            }
          }
        }

        public enum RateUnit implements ApiRequestParams.EnumParam {
          @SerializedName("days")
          DAYS("days"),

          @SerializedName("kilometers")
          KILOMETERS("kilometers"),

          @SerializedName("miles")
          MILES("miles"),

          @SerializedName("months")
          MONTHS("months"),

          @SerializedName("weeks")
          WEEKS("weeks");

          @Getter(onMethod_ = {@Override})
          private final String value;

          RateUnit(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Vehicle {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Make of the rental vehicle. */
        @SerializedName("make")
        Object make;

        /** Model of the rental vehicle. */
        @SerializedName("model")
        Object model;

        /** Odometer reading at the time of rental. */
        @SerializedName("odometer")
        Long odometer;

        /** Type of the rental vehicle. */
        @SerializedName("type")
        Type type;

        /** Class of the rental vehicle. */
        @SerializedName("vehicle_class")
        VehicleClass vehicleClass;

        /** Vehicle identification number (VIN). */
        @SerializedName("vehicle_identification_number")
        Object vehicleIdentificationNumber;

        private Vehicle(
            Map<String, Object> extraParams,
            Object make,
            Object model,
            Long odometer,
            Type type,
            VehicleClass vehicleClass,
            Object vehicleIdentificationNumber) {
          this.extraParams = extraParams;
          this.make = make;
          this.model = model;
          this.odometer = odometer;
          this.type = type;
          this.vehicleClass = vehicleClass;
          this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Object make;

          private Object model;

          private Long odometer;

          private Type type;

          private VehicleClass vehicleClass;

          private Object vehicleIdentificationNumber;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle build() {
            return new ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle(
                this.extraParams,
                this.make,
                this.model,
                this.odometer,
                this.type,
                this.vehicleClass,
                this.vehicleIdentificationNumber);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Make of the rental vehicle. */
          public Builder setMake(String make) {
            this.make = make;
            return this;
          }

          /** Make of the rental vehicle. */
          public Builder setMake(EmptyParam make) {
            this.make = make;
            return this;
          }

          /** Model of the rental vehicle. */
          public Builder setModel(String model) {
            this.model = model;
            return this;
          }

          /** Model of the rental vehicle. */
          public Builder setModel(EmptyParam model) {
            this.model = model;
            return this;
          }

          /** Odometer reading at the time of rental. */
          public Builder setOdometer(Long odometer) {
            this.odometer = odometer;
            return this;
          }

          /** Type of the rental vehicle. */
          public Builder setType(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle.Type type) {
            this.type = type;
            return this;
          }

          /** Class of the rental vehicle. */
          public Builder setVehicleClass(
              ChargeUpdateParams.PaymentDetails.CarRentalData.Vehicle.VehicleClass vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
          }

          /** Vehicle identification number (VIN). */
          public Builder setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
            this.vehicleIdentificationNumber = vehicleIdentificationNumber;
            return this;
          }

          /** Vehicle identification number (VIN). */
          public Builder setVehicleIdentificationNumber(EmptyParam vehicleIdentificationNumber) {
            this.vehicleIdentificationNumber = vehicleIdentificationNumber;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("cargo_van")
          CARGO_VAN("cargo_van"),

          @SerializedName("compact")
          COMPACT("compact"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("exotic")
          EXOTIC("exotic"),

          @SerializedName("exotic_suv")
          EXOTIC_SUV("exotic_suv"),

          @SerializedName("fifteen_passenger_van")
          FIFTEEN_PASSENGER_VAN("fifteen_passenger_van"),

          @SerializedName("four_wheel_drive")
          FOUR_WHEEL_DRIVE("four_wheel_drive"),

          @SerializedName("full_size")
          FULL_SIZE("full_size"),

          @SerializedName("intermediate")
          INTERMEDIATE("intermediate"),

          @SerializedName("large_suv")
          LARGE_SUV("large_suv"),

          @SerializedName("large_truck")
          LARGE_TRUCK("large_truck"),

          @SerializedName("luxury")
          LUXURY("luxury"),

          @SerializedName("medium_suv")
          MEDIUM_SUV("medium_suv"),

          @SerializedName("midsize")
          MIDSIZE("midsize"),

          @SerializedName("mini")
          MINI("mini"),

          @SerializedName("minivan")
          MINIVAN("minivan"),

          @SerializedName("miscellaneous")
          MISCELLANEOUS("miscellaneous"),

          @SerializedName("moped")
          MOPED("moped"),

          @SerializedName("moving_van")
          MOVING_VAN("moving_van"),

          @SerializedName("premium")
          PREMIUM("premium"),

          @SerializedName("regular")
          REGULAR("regular"),

          @SerializedName("small_medium_truck")
          SMALL_MEDIUM_TRUCK("small_medium_truck"),

          @SerializedName("small_suv")
          SMALL_SUV("small_suv"),

          @SerializedName("special")
          SPECIAL("special"),

          @SerializedName("standard")
          STANDARD("standard"),

          @SerializedName("stretch")
          STRETCH("stretch"),

          @SerializedName("subcompact")
          SUBCOMPACT("subcompact"),

          @SerializedName("taxi")
          TAXI("taxi"),

          @SerializedName("twelve_foot_truck")
          TWELVE_FOOT_TRUCK("twelve_foot_truck"),

          @SerializedName("twelve_passenger_van")
          TWELVE_PASSENGER_VAN("twelve_passenger_van"),

          @SerializedName("twenty_foot_truck")
          TWENTY_FOOT_TRUCK("twenty_foot_truck"),

          @SerializedName("twenty_four_foot_truck")
          TWENTY_FOUR_FOOT_TRUCK("twenty_four_foot_truck"),

          @SerializedName("twenty_six_foot_truck")
          TWENTY_SIX_FOOT_TRUCK("twenty_six_foot_truck"),

          @SerializedName("unique")
          UNIQUE("unique");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }

        public enum VehicleClass implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("first_class")
          FIRST_CLASS("first_class"),

          @SerializedName("premium_economy")
          PREMIUM_ECONOMY("premium_economy");

          @Getter(onMethod_ = {@Override})
          private final String value;

          VehicleClass(String value) {
            this.value = value;
          }
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
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

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
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
    public static class FlightData {
      /** Affiliate details if applicable. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Reservation reference. */
      @SerializedName("booking_number")
      Object bookingNumber;

      /** Computerized reservation system used to make the reservation and purchase the ticket. */
      @SerializedName("computerized_reservation_system")
      Object computerizedReservationSystem;

      /** Ticket restrictions. */
      @SerializedName("endorsements_and_restrictions")
      Object endorsementsAndRestrictions;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** List of insurances. */
      @SerializedName("insurances")
      List<ChargeUpdateParams.PaymentDetails.FlightData.Insurance> insurances;

      /** List of passengers. */
      @SerializedName("passengers")
      List<ChargeUpdateParams.PaymentDetails.FlightData.Passenger> passengers;

      /** <strong>Required.</strong> List of flight segments. */
      @SerializedName("segments")
      List<ChargeUpdateParams.PaymentDetails.FlightData.Segment> segments;

      /** Electronic ticket indicator. */
      @SerializedName("ticket_electronically_issued_indicator")
      Boolean ticketElectronicallyIssuedIndicator;

      /** <strong>Required.</strong> Total cost breakdown. */
      @SerializedName("total")
      Total total;

      /** Type of flight transaction. */
      @SerializedName("transaction_type")
      TransactionType transactionType;

      private FlightData(
          Affiliate affiliate,
          Object bookingNumber,
          Object computerizedReservationSystem,
          Object endorsementsAndRestrictions,
          Map<String, Object> extraParams,
          List<ChargeUpdateParams.PaymentDetails.FlightData.Insurance> insurances,
          List<ChargeUpdateParams.PaymentDetails.FlightData.Passenger> passengers,
          List<ChargeUpdateParams.PaymentDetails.FlightData.Segment> segments,
          Boolean ticketElectronicallyIssuedIndicator,
          Total total,
          TransactionType transactionType) {
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.computerizedReservationSystem = computerizedReservationSystem;
        this.endorsementsAndRestrictions = endorsementsAndRestrictions;
        this.extraParams = extraParams;
        this.insurances = insurances;
        this.passengers = passengers;
        this.segments = segments;
        this.ticketElectronicallyIssuedIndicator = ticketElectronicallyIssuedIndicator;
        this.total = total;
        this.transactionType = transactionType;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Affiliate affiliate;

        private Object bookingNumber;

        private Object computerizedReservationSystem;

        private Object endorsementsAndRestrictions;

        private Map<String, Object> extraParams;

        private List<ChargeUpdateParams.PaymentDetails.FlightData.Insurance> insurances;

        private List<ChargeUpdateParams.PaymentDetails.FlightData.Passenger> passengers;

        private List<ChargeUpdateParams.PaymentDetails.FlightData.Segment> segments;

        private Boolean ticketElectronicallyIssuedIndicator;

        private Total total;

        private TransactionType transactionType;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.FlightData build() {
          return new ChargeUpdateParams.PaymentDetails.FlightData(
              this.affiliate,
              this.bookingNumber,
              this.computerizedReservationSystem,
              this.endorsementsAndRestrictions,
              this.extraParams,
              this.insurances,
              this.passengers,
              this.segments,
              this.ticketElectronicallyIssuedIndicator,
              this.total,
              this.transactionType);
        }

        /** Affiliate details if applicable. */
        public Builder setAffiliate(
            ChargeUpdateParams.PaymentDetails.FlightData.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Reservation reference. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Reservation reference. */
        public Builder setBookingNumber(EmptyParam bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Computerized reservation system used to make the reservation and purchase the ticket. */
        public Builder setComputerizedReservationSystem(String computerizedReservationSystem) {
          this.computerizedReservationSystem = computerizedReservationSystem;
          return this;
        }

        /** Computerized reservation system used to make the reservation and purchase the ticket. */
        public Builder setComputerizedReservationSystem(EmptyParam computerizedReservationSystem) {
          this.computerizedReservationSystem = computerizedReservationSystem;
          return this;
        }

        /** Ticket restrictions. */
        public Builder setEndorsementsAndRestrictions(String endorsementsAndRestrictions) {
          this.endorsementsAndRestrictions = endorsementsAndRestrictions;
          return this;
        }

        /** Ticket restrictions. */
        public Builder setEndorsementsAndRestrictions(EmptyParam endorsementsAndRestrictions) {
          this.endorsementsAndRestrictions = endorsementsAndRestrictions;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData#extraParams} for the field
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
         * Add an element to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#insurances} for the field documentation.
         */
        public Builder addInsurance(
            ChargeUpdateParams.PaymentDetails.FlightData.Insurance element) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.add(element);
          return this;
        }

        /**
         * Add all elements to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#insurances} for the field documentation.
         */
        public Builder addAllInsurance(
            List<ChargeUpdateParams.PaymentDetails.FlightData.Insurance> elements) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.addAll(elements);
          return this;
        }

        /**
         * Add an element to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#passengers} for the field documentation.
         */
        public Builder addPassenger(
            ChargeUpdateParams.PaymentDetails.FlightData.Passenger element) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.add(element);
          return this;
        }

        /**
         * Add all elements to `passengers` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#passengers} for the field documentation.
         */
        public Builder addAllPassenger(
            List<ChargeUpdateParams.PaymentDetails.FlightData.Passenger> elements) {
          if (this.passengers == null) {
            this.passengers = new ArrayList<>();
          }
          this.passengers.addAll(elements);
          return this;
        }

        /**
         * Add an element to `segments` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#segments} for the field documentation.
         */
        public Builder addSegment(ChargeUpdateParams.PaymentDetails.FlightData.Segment element) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.add(element);
          return this;
        }

        /**
         * Add all elements to `segments` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.FlightData#segments} for the field documentation.
         */
        public Builder addAllSegment(
            List<ChargeUpdateParams.PaymentDetails.FlightData.Segment> elements) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.addAll(elements);
          return this;
        }

        /** Electronic ticket indicator. */
        public Builder setTicketElectronicallyIssuedIndicator(
            Boolean ticketElectronicallyIssuedIndicator) {
          this.ticketElectronicallyIssuedIndicator = ticketElectronicallyIssuedIndicator;
          return this;
        }

        /** <strong>Required.</strong> Total cost breakdown. */
        public Builder setTotal(ChargeUpdateParams.PaymentDetails.FlightData.Total total) {
          this.total = total;
          return this;
        }

        /** Type of flight transaction. */
        public Builder setTransactionType(
            ChargeUpdateParams.PaymentDetails.FlightData.TransactionType transactionType) {
          this.transactionType = transactionType;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Affiliate {
        /** Affiliate partner code. */
        @SerializedName("code")
        Object code;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of affiliate partner. */
        @SerializedName("name")
        Object name;

        /** Code provided by the company to a travel agent authorizing ticket issuance. */
        @SerializedName("travel_authorization_code")
        Object travelAuthorizationCode;

        private Affiliate(
            Object code,
            Map<String, Object> extraParams,
            Object name,
            Object travelAuthorizationCode) {
          this.code = code;
          this.extraParams = extraParams;
          this.name = name;
          this.travelAuthorizationCode = travelAuthorizationCode;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object code;

          private Map<String, Object> extraParams;

          private Object name;

          private Object travelAuthorizationCode;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.FlightData.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.FlightData.Affiliate(
                this.code, this.extraParams, this.name, this.travelAuthorizationCode);
          }

          /** Affiliate partner code. */
          public Builder setCode(String code) {
            this.code = code;
            return this;
          }

          /** Affiliate partner code. */
          public Builder setCode(EmptyParam code) {
            this.code = code;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Affiliate#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Affiliate#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of affiliate partner. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Name of affiliate partner. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }

          /** Code provided by the company to a travel agent authorizing ticket issuance. */
          public Builder setTravelAuthorizationCode(String travelAuthorizationCode) {
            this.travelAuthorizationCode = travelAuthorizationCode;
            return this;
          }

          /** Code provided by the company to a travel agent authorizing ticket issuance. */
          public Builder setTravelAuthorizationCode(EmptyParam travelAuthorizationCode) {
            this.travelAuthorizationCode = travelAuthorizationCode;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Insurance {
        /** <strong>Required.</strong> Insurance cost. */
        @SerializedName("amount")
        Long amount;

        /** Insurance currency. */
        @SerializedName("currency")
        Object currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Insurance company name. */
        @SerializedName("insurance_company_name")
        Object insuranceCompanyName;

        /** <strong>Required.</strong> Type of insurance. */
        @SerializedName("insurance_type")
        InsuranceType insuranceType;

        private Insurance(
            Long amount,
            Object currency,
            Map<String, Object> extraParams,
            Object insuranceCompanyName,
            InsuranceType insuranceType) {
          this.amount = amount;
          this.currency = currency;
          this.extraParams = extraParams;
          this.insuranceCompanyName = insuranceCompanyName;
          this.insuranceType = insuranceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object currency;

          private Map<String, Object> extraParams;

          private Object insuranceCompanyName;

          private InsuranceType insuranceType;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.FlightData.Insurance build() {
            return new ChargeUpdateParams.PaymentDetails.FlightData.Insurance(
                this.amount,
                this.currency,
                this.extraParams,
                this.insuranceCompanyName,
                this.insuranceType);
          }

          /** <strong>Required.</strong> Insurance cost. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Insurance currency. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Insurance currency. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Insurance#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Insurance#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Insurance company name. */
          public Builder setInsuranceCompanyName(String insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** Insurance company name. */
          public Builder setInsuranceCompanyName(EmptyParam insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** <strong>Required.</strong> Type of insurance. */
          public Builder setInsuranceType(
              ChargeUpdateParams.PaymentDetails.FlightData.Insurance.InsuranceType insuranceType) {
            this.insuranceType = insuranceType;
            return this;
          }
        }

        public enum InsuranceType implements ApiRequestParams.EnumParam {
          @SerializedName("baggage")
          BAGGAGE("baggage"),

          @SerializedName("bankruptcy")
          BANKRUPTCY("bankruptcy"),

          @SerializedName("cancelation")
          CANCELATION("cancelation"),

          @SerializedName("emergency")
          EMERGENCY("emergency"),

          @SerializedName("medical")
          MEDICAL("medical");

          @Getter(onMethod_ = {@Override})
          private final String value;

          InsuranceType(String value) {
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

        /** <strong>Required.</strong> Passenger's full name. */
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
          public ChargeUpdateParams.PaymentDetails.FlightData.Passenger build() {
            return new ChargeUpdateParams.PaymentDetails.FlightData.Passenger(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Passenger#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Passenger#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Passenger's full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** <strong>Required.</strong> Passenger's full name. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Segment {
        /** Segment fare amount. */
        @SerializedName("amount")
        Long amount;

        /** <strong>Required.</strong> Arrival details. */
        @SerializedName("arrival")
        Arrival arrival;

        /** <strong>Required.</strong> Airline carrier code. */
        @SerializedName("carrier_code")
        Object carrierCode;

        /** Carrier name. */
        @SerializedName("carrier_name")
        Object carrierName;

        /** Segment currency. */
        @SerializedName("currency")
        Object currency;

        /** <strong>Required.</strong> Departure details. */
        @SerializedName("departure")
        Departure departure;

        /** Exchange ticket number. */
        @SerializedName("exchange_ticket_number")
        Object exchangeTicketNumber;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Fare basis code. */
        @SerializedName("fare_basis_code")
        Object fareBasisCode;

        /** Additional fees. */
        @SerializedName("fees")
        Long fees;

        /** Flight number. */
        @SerializedName("flight_number")
        Object flightNumber;

        /** Stopover indicator. */
        @SerializedName("is_stop_over_indicator")
        Boolean isStopOverIndicator;

        /** Refundable ticket indicator. */
        @SerializedName("refundable")
        Boolean refundable;

        /** <strong>Required.</strong> Class of service. */
        @SerializedName("service_class")
        ServiceClass serviceClass;

        /** Tax amount for segment. */
        @SerializedName("tax_amount")
        Long taxAmount;

        /** Ticket number. */
        @SerializedName("ticket_number")
        Object ticketNumber;

        private Segment(
            Long amount,
            Arrival arrival,
            Object carrierCode,
            Object carrierName,
            Object currency,
            Departure departure,
            Object exchangeTicketNumber,
            Map<String, Object> extraParams,
            Object fareBasisCode,
            Long fees,
            Object flightNumber,
            Boolean isStopOverIndicator,
            Boolean refundable,
            ServiceClass serviceClass,
            Long taxAmount,
            Object ticketNumber) {
          this.amount = amount;
          this.arrival = arrival;
          this.carrierCode = carrierCode;
          this.carrierName = carrierName;
          this.currency = currency;
          this.departure = departure;
          this.exchangeTicketNumber = exchangeTicketNumber;
          this.extraParams = extraParams;
          this.fareBasisCode = fareBasisCode;
          this.fees = fees;
          this.flightNumber = flightNumber;
          this.isStopOverIndicator = isStopOverIndicator;
          this.refundable = refundable;
          this.serviceClass = serviceClass;
          this.taxAmount = taxAmount;
          this.ticketNumber = ticketNumber;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Arrival arrival;

          private Object carrierCode;

          private Object carrierName;

          private Object currency;

          private Departure departure;

          private Object exchangeTicketNumber;

          private Map<String, Object> extraParams;

          private Object fareBasisCode;

          private Long fees;

          private Object flightNumber;

          private Boolean isStopOverIndicator;

          private Boolean refundable;

          private ServiceClass serviceClass;

          private Long taxAmount;

          private Object ticketNumber;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.FlightData.Segment build() {
            return new ChargeUpdateParams.PaymentDetails.FlightData.Segment(
                this.amount,
                this.arrival,
                this.carrierCode,
                this.carrierName,
                this.currency,
                this.departure,
                this.exchangeTicketNumber,
                this.extraParams,
                this.fareBasisCode,
                this.fees,
                this.flightNumber,
                this.isStopOverIndicator,
                this.refundable,
                this.serviceClass,
                this.taxAmount,
                this.ticketNumber);
          }

          /** Segment fare amount. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** <strong>Required.</strong> Arrival details. */
          public Builder setArrival(
              ChargeUpdateParams.PaymentDetails.FlightData.Segment.Arrival arrival) {
            this.arrival = arrival;
            return this;
          }

          /** <strong>Required.</strong> Airline carrier code. */
          public Builder setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
            return this;
          }

          /** <strong>Required.</strong> Airline carrier code. */
          public Builder setCarrierCode(EmptyParam carrierCode) {
            this.carrierCode = carrierCode;
            return this;
          }

          /** Carrier name. */
          public Builder setCarrierName(String carrierName) {
            this.carrierName = carrierName;
            return this;
          }

          /** Carrier name. */
          public Builder setCarrierName(EmptyParam carrierName) {
            this.carrierName = carrierName;
            return this;
          }

          /** Segment currency. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Segment currency. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /** <strong>Required.</strong> Departure details. */
          public Builder setDeparture(
              ChargeUpdateParams.PaymentDetails.FlightData.Segment.Departure departure) {
            this.departure = departure;
            return this;
          }

          /** Exchange ticket number. */
          public Builder setExchangeTicketNumber(String exchangeTicketNumber) {
            this.exchangeTicketNumber = exchangeTicketNumber;
            return this;
          }

          /** Exchange ticket number. */
          public Builder setExchangeTicketNumber(EmptyParam exchangeTicketNumber) {
            this.exchangeTicketNumber = exchangeTicketNumber;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Segment#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Segment#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Fare basis code. */
          public Builder setFareBasisCode(String fareBasisCode) {
            this.fareBasisCode = fareBasisCode;
            return this;
          }

          /** Fare basis code. */
          public Builder setFareBasisCode(EmptyParam fareBasisCode) {
            this.fareBasisCode = fareBasisCode;
            return this;
          }

          /** Additional fees. */
          public Builder setFees(Long fees) {
            this.fees = fees;
            return this;
          }

          /** Flight number. */
          public Builder setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** Flight number. */
          public Builder setFlightNumber(EmptyParam flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** Stopover indicator. */
          public Builder setIsStopOverIndicator(Boolean isStopOverIndicator) {
            this.isStopOverIndicator = isStopOverIndicator;
            return this;
          }

          /** Refundable ticket indicator. */
          public Builder setRefundable(Boolean refundable) {
            this.refundable = refundable;
            return this;
          }

          /** <strong>Required.</strong> Class of service. */
          public Builder setServiceClass(
              ChargeUpdateParams.PaymentDetails.FlightData.Segment.ServiceClass serviceClass) {
            this.serviceClass = serviceClass;
            return this;
          }

          /** Tax amount for segment. */
          public Builder setTaxAmount(Long taxAmount) {
            this.taxAmount = taxAmount;
            return this;
          }

          /** Ticket number. */
          public Builder setTicketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
            return this;
          }

          /** Ticket number. */
          public Builder setTicketNumber(EmptyParam ticketNumber) {
            this.ticketNumber = ticketNumber;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Arrival {
          /** <strong>Required.</strong> Arrival airport IATA code. */
          @SerializedName("airport")
          Object airport;

          /** Arrival date/time. */
          @SerializedName("arrives_at")
          Long arrivesAt;

          /** Arrival city. */
          @SerializedName("city")
          Object city;

          /** Arrival country. */
          @SerializedName("country")
          Object country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Arrival(
              Object airport,
              Long arrivesAt,
              Object city,
              Object country,
              Map<String, Object> extraParams) {
            this.airport = airport;
            this.arrivesAt = arrivesAt;
            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object airport;

            private Long arrivesAt;

            private Object city;

            private Object country;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.FlightData.Segment.Arrival build() {
              return new ChargeUpdateParams.PaymentDetails.FlightData.Segment.Arrival(
                  this.airport, this.arrivesAt, this.city, this.country, this.extraParams);
            }

            /** <strong>Required.</strong> Arrival airport IATA code. */
            public Builder setAirport(String airport) {
              this.airport = airport;
              return this;
            }

            /** <strong>Required.</strong> Arrival airport IATA code. */
            public Builder setAirport(EmptyParam airport) {
              this.airport = airport;
              return this;
            }

            /** Arrival date/time. */
            public Builder setArrivesAt(Long arrivesAt) {
              this.arrivesAt = arrivesAt;
              return this;
            }

            /** Arrival city. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /** Arrival city. */
            public Builder setCity(EmptyParam city) {
              this.city = city;
              return this;
            }

            /** Arrival country. */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /** Arrival country. */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Segment.Arrival#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.FlightData.Segment.Arrival#extraParams} for the
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
        public static class Departure {
          /** <strong>Required.</strong> Departure airport IATA code. */
          @SerializedName("airport")
          Object airport;

          /** Departure city. */
          @SerializedName("city")
          Object city;

          /** Departure country. */
          @SerializedName("country")
          Object country;

          /** <strong>Required.</strong> Departure date/time. */
          @SerializedName("departs_at")
          Long departsAt;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Departure(
              Object airport,
              Object city,
              Object country,
              Long departsAt,
              Map<String, Object> extraParams) {
            this.airport = airport;
            this.city = city;
            this.country = country;
            this.departsAt = departsAt;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object airport;

            private Object city;

            private Object country;

            private Long departsAt;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.FlightData.Segment.Departure build() {
              return new ChargeUpdateParams.PaymentDetails.FlightData.Segment.Departure(
                  this.airport, this.city, this.country, this.departsAt, this.extraParams);
            }

            /** <strong>Required.</strong> Departure airport IATA code. */
            public Builder setAirport(String airport) {
              this.airport = airport;
              return this;
            }

            /** <strong>Required.</strong> Departure airport IATA code. */
            public Builder setAirport(EmptyParam airport) {
              this.airport = airport;
              return this;
            }

            /** Departure city. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /** Departure city. */
            public Builder setCity(EmptyParam city) {
              this.city = city;
              return this;
            }

            /** Departure country. */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /** Departure country. */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /** <strong>Required.</strong> Departure date/time. */
            public Builder setDepartsAt(Long departsAt) {
              this.departsAt = departsAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Segment.Departure#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.FlightData.Segment.Departure#extraParams} for the
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

        public enum ServiceClass implements ApiRequestParams.EnumParam {
          @SerializedName("business")
          BUSINESS("business"),

          @SerializedName("economy")
          ECONOMY("economy"),

          @SerializedName("first_class")
          FIRST_CLASS("first_class"),

          @SerializedName("premium_economy")
          PREMIUM_ECONOMY("premium_economy");

          @Getter(onMethod_ = {@Override})
          private final String value;

          ServiceClass(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Total {
        /** <strong>Required.</strong> Total flight amount. */
        @SerializedName("amount")
        Long amount;

        /** Reason for credit. */
        @SerializedName("credit_reason")
        CreditReason creditReason;

        /** Total currency. */
        @SerializedName("currency")
        Object currency;

        /** Discount details. */
        @SerializedName("discounts")
        Discounts discounts;

        /** Additional charges. */
        @SerializedName("extra_charges")
        List<ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge> extraCharges;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Tax breakdown. */
        @SerializedName("tax")
        Tax tax;

        private Total(
            Long amount,
            CreditReason creditReason,
            Object currency,
            Discounts discounts,
            List<ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge> extraCharges,
            Map<String, Object> extraParams,
            Tax tax) {
          this.amount = amount;
          this.creditReason = creditReason;
          this.currency = currency;
          this.discounts = discounts;
          this.extraCharges = extraCharges;
          this.extraParams = extraParams;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private CreditReason creditReason;

          private Object currency;

          private Discounts discounts;

          private List<ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge> extraCharges;

          private Map<String, Object> extraParams;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.FlightData.Total build() {
            return new ChargeUpdateParams.PaymentDetails.FlightData.Total(
                this.amount,
                this.creditReason,
                this.currency,
                this.discounts,
                this.extraCharges,
                this.extraParams,
                this.tax);
          }

          /** <strong>Required.</strong> Total flight amount. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Reason for credit. */
          public Builder setCreditReason(
              ChargeUpdateParams.PaymentDetails.FlightData.Total.CreditReason creditReason) {
            this.creditReason = creditReason;
            return this;
          }

          /** Total currency. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Total currency. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /** Discount details. */
          public Builder setDiscounts(
              ChargeUpdateParams.PaymentDetails.FlightData.Total.Discounts discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ChargeUpdateParams.PaymentDetails.FlightData.Total#extraCharges} for the field
           * documentation.
           */
          public Builder addExtraCharge(
              ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge element) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.add(element);
            return this;
          }

          /**
           * Add all elements to `extraCharges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ChargeUpdateParams.PaymentDetails.FlightData.Total#extraCharges} for the
           * field documentation.
           */
          public Builder addAllExtraCharge(
              List<ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge> elements) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Total#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.FlightData.Total#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Tax breakdown. */
          public Builder setTax(ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discounts {
          /** Corporate client discount code. */
          @SerializedName("corporate_client_code")
          Object corporateClientCode;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Discounts(Object corporateClientCode, Map<String, Object> extraParams) {
            this.corporateClientCode = corporateClientCode;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object corporateClientCode;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.FlightData.Total.Discounts build() {
              return new ChargeUpdateParams.PaymentDetails.FlightData.Total.Discounts(
                  this.corporateClientCode, this.extraParams);
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(String corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(EmptyParam corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Discounts#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Discounts#extraParams} for the
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
        public static class ExtraCharge {
          /** Amount of additional charges. */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Type of additional charges. */
          @SerializedName("type")
          Type type;

          private ExtraCharge(Long amount, Map<String, Object> extraParams, Type type) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge build() {
              return new ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge(
                  this.amount, this.extraParams, this.type);
            }

            /** Amount of additional charges. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Type of additional charges. */
            public Builder setType(
                ChargeUpdateParams.PaymentDetails.FlightData.Total.ExtraCharge.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("additional_fees")
            ADDITIONAL_FEES("additional_fees"),

            @SerializedName("ancillary_service_charges")
            ANCILLARY_SERVICE_CHARGES("ancillary_service_charges"),

            @SerializedName("exchange_fee")
            EXCHANGE_FEE("exchange_fee");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Array of tax details. */
          @SerializedName("taxes")
          List<ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax> taxes;

          private Tax(
              Map<String, Object> extraParams,
              List<ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax> taxes) {
            this.extraParams = extraParams;
            this.taxes = taxes;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax> taxes;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax build() {
              return new ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax(
                  this.extraParams, this.taxes);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax#extraParams} for the field
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
             * Add an element to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addTax(
                ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax element) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.add(element);
              return this;
            }

            /**
             * Add all elements to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addAllTax(
                List<ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax> elements) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class InnerTax {
            /** Tax amount. */
            @SerializedName("amount")
            Long amount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Tax rate. */
            @SerializedName("rate")
            Long rate;

            /** Type of tax. */
            @SerializedName("type")
            Object type;

            private InnerTax(Long amount, Map<String, Object> extraParams, Long rate, Object type) {
              this.amount = amount;
              this.extraParams = extraParams;
              this.rate = rate;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private Map<String, Object> extraParams;

              private Long rate;

              private Object type;

              /** Finalize and obtain parameter instance from this builder. */
              public ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax build() {
                return new ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax(
                    this.amount, this.extraParams, this.rate, this.type);
              }

              /** Tax amount. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax#extraParams} for
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.FlightData.Total.Tax.InnerTax#extraParams} for
               * the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Tax rate. */
              public Builder setRate(Long rate) {
                this.rate = rate;
                return this;
              }

              /** Type of tax. */
              public Builder setType(String type) {
                this.type = type;
                return this;
              }

              /** Type of tax. */
              public Builder setType(EmptyParam type) {
                this.type = type;
                return this;
              }
            }
          }
        }

        public enum CreditReason implements ApiRequestParams.EnumParam {
          @SerializedName("other")
          OTHER("other"),

          @SerializedName("partial_ticket_refund")
          PARTIAL_TICKET_REFUND("partial_ticket_refund"),

          @SerializedName("passenger_transport_ancillary_cancellation")
          PASSENGER_TRANSPORT_ANCILLARY_CANCELLATION("passenger_transport_ancillary_cancellation"),

          @SerializedName("ticket_and_ancillary_cancellation")
          TICKET_AND_ANCILLARY_CANCELLATION("ticket_and_ancillary_cancellation"),

          @SerializedName("ticket_cancellation")
          TICKET_CANCELLATION("ticket_cancellation");

          @Getter(onMethod_ = {@Override})
          private final String value;

          CreditReason(String value) {
            this.value = value;
          }
        }
      }

      public enum TransactionType implements ApiRequestParams.EnumParam {
        @SerializedName("exchange_ticket")
        EXCHANGE_TICKET("exchange_ticket"),

        @SerializedName("miscellaneous")
        MISCELLANEOUS("miscellaneous"),

        @SerializedName("refund")
        REFUND("refund"),

        @SerializedName("ticket_purchase")
        TICKET_PURCHASE("ticket_purchase");

        @Getter(onMethod_ = {@Override})
        private final String value;

        TransactionType(String value) {
          this.value = value;
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

        /** Address line 1, such as the street, PO Box, or company name. */
        @SerializedName("line1")
        Object line1;

        /** Address line 2, such as the apartment, suite, unit, or building. */
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

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(String line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 1, such as the street, PO Box, or company name. */
          public Builder setLine1(EmptyParam line1) {
            this.line1 = line1;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
          public Builder setLine2(String line2) {
            this.line2 = line2;
            return this;
          }

          /** Address line 2, such as the apartment, suite, unit, or building. */
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
    public static class LodgingData {
      /** Accommodation details for the lodging. */
      @SerializedName("accommodation")
      Accommodation accommodation;

      /** Affiliate details if applicable. */
      @SerializedName("affiliate")
      Affiliate affiliate;

      /** Booking confirmation number for the lodging. */
      @SerializedName("booking_number")
      Object bookingNumber;

      /** <strong>Required.</strong> Check-in date. */
      @SerializedName("checkin_at")
      Long checkinAt;

      /** <strong>Required.</strong> Check-out date. */
      @SerializedName("checkout_at")
      Long checkoutAt;

      /** Customer service phone number for the lodging company. */
      @SerializedName("customer_service_phone_number")
      Object customerServicePhoneNumber;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Whether the lodging is compliant with any hotel fire safety regulations. */
      @SerializedName("fire_safety_act_compliance_indicator")
      Boolean fireSafetyActComplianceIndicator;

      /** List of guests for the lodging. */
      @SerializedName("guests")
      List<ChargeUpdateParams.PaymentDetails.LodgingData.Guest> guests;

      /** Host details for the lodging. */
      @SerializedName("host")
      Host host;

      /** List of insurances for the lodging. */
      @SerializedName("insurances")
      List<ChargeUpdateParams.PaymentDetails.LodgingData.Insurance> insurances;

      /** Whether the renter is a no-show. */
      @SerializedName("no_show_indicator")
      Boolean noShowIndicator;

      /** Renter ID number for the lodging. */
      @SerializedName("renter_id_number")
      Object renterIdNumber;

      /** Renter name for the lodging. */
      @SerializedName("renter_name")
      Object renterName;

      /** <strong>Required.</strong> Total details for the lodging. */
      @SerializedName("total")
      Total total;

      private LodgingData(
          Accommodation accommodation,
          Affiliate affiliate,
          Object bookingNumber,
          Long checkinAt,
          Long checkoutAt,
          Object customerServicePhoneNumber,
          Map<String, Object> extraParams,
          Boolean fireSafetyActComplianceIndicator,
          List<ChargeUpdateParams.PaymentDetails.LodgingData.Guest> guests,
          Host host,
          List<ChargeUpdateParams.PaymentDetails.LodgingData.Insurance> insurances,
          Boolean noShowIndicator,
          Object renterIdNumber,
          Object renterName,
          Total total) {
        this.accommodation = accommodation;
        this.affiliate = affiliate;
        this.bookingNumber = bookingNumber;
        this.checkinAt = checkinAt;
        this.checkoutAt = checkoutAt;
        this.customerServicePhoneNumber = customerServicePhoneNumber;
        this.extraParams = extraParams;
        this.fireSafetyActComplianceIndicator = fireSafetyActComplianceIndicator;
        this.guests = guests;
        this.host = host;
        this.insurances = insurances;
        this.noShowIndicator = noShowIndicator;
        this.renterIdNumber = renterIdNumber;
        this.renterName = renterName;
        this.total = total;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Accommodation accommodation;

        private Affiliate affiliate;

        private Object bookingNumber;

        private Long checkinAt;

        private Long checkoutAt;

        private Object customerServicePhoneNumber;

        private Map<String, Object> extraParams;

        private Boolean fireSafetyActComplianceIndicator;

        private List<ChargeUpdateParams.PaymentDetails.LodgingData.Guest> guests;

        private Host host;

        private List<ChargeUpdateParams.PaymentDetails.LodgingData.Insurance> insurances;

        private Boolean noShowIndicator;

        private Object renterIdNumber;

        private Object renterName;

        private Total total;

        /** Finalize and obtain parameter instance from this builder. */
        public ChargeUpdateParams.PaymentDetails.LodgingData build() {
          return new ChargeUpdateParams.PaymentDetails.LodgingData(
              this.accommodation,
              this.affiliate,
              this.bookingNumber,
              this.checkinAt,
              this.checkoutAt,
              this.customerServicePhoneNumber,
              this.extraParams,
              this.fireSafetyActComplianceIndicator,
              this.guests,
              this.host,
              this.insurances,
              this.noShowIndicator,
              this.renterIdNumber,
              this.renterName,
              this.total);
        }

        /** Accommodation details for the lodging. */
        public Builder setAccommodation(
            ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation accommodation) {
          this.accommodation = accommodation;
          return this;
        }

        /** Affiliate details if applicable. */
        public Builder setAffiliate(
            ChargeUpdateParams.PaymentDetails.LodgingData.Affiliate affiliate) {
          this.affiliate = affiliate;
          return this;
        }

        /** Booking confirmation number for the lodging. */
        public Builder setBookingNumber(String bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** Booking confirmation number for the lodging. */
        public Builder setBookingNumber(EmptyParam bookingNumber) {
          this.bookingNumber = bookingNumber;
          return this;
        }

        /** <strong>Required.</strong> Check-in date. */
        public Builder setCheckinAt(Long checkinAt) {
          this.checkinAt = checkinAt;
          return this;
        }

        /** <strong>Required.</strong> Check-out date. */
        public Builder setCheckoutAt(Long checkoutAt) {
          this.checkoutAt = checkoutAt;
          return this;
        }

        /** Customer service phone number for the lodging company. */
        public Builder setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /** Customer service phone number for the lodging company. */
        public Builder setCustomerServicePhoneNumber(EmptyParam customerServicePhoneNumber) {
          this.customerServicePhoneNumber = customerServicePhoneNumber;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData#extraParams} for the field
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
         * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Whether the lodging is compliant with any hotel fire safety regulations. */
        public Builder setFireSafetyActComplianceIndicator(
            Boolean fireSafetyActComplianceIndicator) {
          this.fireSafetyActComplianceIndicator = fireSafetyActComplianceIndicator;
          return this;
        }

        /**
         * Add an element to `guests` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.LodgingData#guests} for the field documentation.
         */
        public Builder addGuest(ChargeUpdateParams.PaymentDetails.LodgingData.Guest element) {
          if (this.guests == null) {
            this.guests = new ArrayList<>();
          }
          this.guests.add(element);
          return this;
        }

        /**
         * Add all elements to `guests` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.LodgingData#guests} for the field documentation.
         */
        public Builder addAllGuest(
            List<ChargeUpdateParams.PaymentDetails.LodgingData.Guest> elements) {
          if (this.guests == null) {
            this.guests = new ArrayList<>();
          }
          this.guests.addAll(elements);
          return this;
        }

        /** Host details for the lodging. */
        public Builder setHost(ChargeUpdateParams.PaymentDetails.LodgingData.Host host) {
          this.host = host;
          return this;
        }

        /**
         * Add an element to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.LodgingData#insurances} for the field documentation.
         */
        public Builder addInsurance(
            ChargeUpdateParams.PaymentDetails.LodgingData.Insurance element) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.add(element);
          return this;
        }

        /**
         * Add all elements to `insurances` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ChargeUpdateParams.PaymentDetails.LodgingData#insurances} for the field documentation.
         */
        public Builder addAllInsurance(
            List<ChargeUpdateParams.PaymentDetails.LodgingData.Insurance> elements) {
          if (this.insurances == null) {
            this.insurances = new ArrayList<>();
          }
          this.insurances.addAll(elements);
          return this;
        }

        /** Whether the renter is a no-show. */
        public Builder setNoShowIndicator(Boolean noShowIndicator) {
          this.noShowIndicator = noShowIndicator;
          return this;
        }

        /** Renter ID number for the lodging. */
        public Builder setRenterIdNumber(String renterIdNumber) {
          this.renterIdNumber = renterIdNumber;
          return this;
        }

        /** Renter ID number for the lodging. */
        public Builder setRenterIdNumber(EmptyParam renterIdNumber) {
          this.renterIdNumber = renterIdNumber;
          return this;
        }

        /** Renter name for the lodging. */
        public Builder setRenterName(String renterName) {
          this.renterName = renterName;
          return this;
        }

        /** Renter name for the lodging. */
        public Builder setRenterName(EmptyParam renterName) {
          this.renterName = renterName;
          return this;
        }

        /** <strong>Required.</strong> Total details for the lodging. */
        public Builder setTotal(ChargeUpdateParams.PaymentDetails.LodgingData.Total total) {
          this.total = total;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Accommodation {
        /** Type of accommodation. */
        @SerializedName("accommodation_type")
        AccommodationType accommodationType;

        /** Bed type. */
        @SerializedName("bed_type")
        Object bedType;

        /** Daily accommodation rate in cents. */
        @SerializedName("daily_rate_amount")
        Long dailyRateAmount;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Number of nights. */
        @SerializedName("nights")
        Long nights;

        /** Number of rooms, cabanas, apartments, and so on. */
        @SerializedName("number_of_rooms")
        Long numberOfRooms;

        /** Rate type. */
        @SerializedName("rate_type")
        Object rateType;

        /** Whether smoking is allowed. */
        @SerializedName("smoking_indicator")
        Boolean smokingIndicator;

        private Accommodation(
            AccommodationType accommodationType,
            Object bedType,
            Long dailyRateAmount,
            Map<String, Object> extraParams,
            Long nights,
            Long numberOfRooms,
            Object rateType,
            Boolean smokingIndicator) {
          this.accommodationType = accommodationType;
          this.bedType = bedType;
          this.dailyRateAmount = dailyRateAmount;
          this.extraParams = extraParams;
          this.nights = nights;
          this.numberOfRooms = numberOfRooms;
          this.rateType = rateType;
          this.smokingIndicator = smokingIndicator;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AccommodationType accommodationType;

          private Object bedType;

          private Long dailyRateAmount;

          private Map<String, Object> extraParams;

          private Long nights;

          private Long numberOfRooms;

          private Object rateType;

          private Boolean smokingIndicator;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation(
                this.accommodationType,
                this.bedType,
                this.dailyRateAmount,
                this.extraParams,
                this.nights,
                this.numberOfRooms,
                this.rateType,
                this.smokingIndicator);
          }

          /** Type of accommodation. */
          public Builder setAccommodationType(
              ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation.AccommodationType
                  accommodationType) {
            this.accommodationType = accommodationType;
            return this;
          }

          /** Bed type. */
          public Builder setBedType(String bedType) {
            this.bedType = bedType;
            return this;
          }

          /** Bed type. */
          public Builder setBedType(EmptyParam bedType) {
            this.bedType = bedType;
            return this;
          }

          /** Daily accommodation rate in cents. */
          public Builder setDailyRateAmount(Long dailyRateAmount) {
            this.dailyRateAmount = dailyRateAmount;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation#extraParams} for the field
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
           * ChargeUpdateParams.PaymentDetails.LodgingData.Accommodation#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Number of nights. */
          public Builder setNights(Long nights) {
            this.nights = nights;
            return this;
          }

          /** Number of rooms, cabanas, apartments, and so on. */
          public Builder setNumberOfRooms(Long numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
          }

          /** Rate type. */
          public Builder setRateType(String rateType) {
            this.rateType = rateType;
            return this;
          }

          /** Rate type. */
          public Builder setRateType(EmptyParam rateType) {
            this.rateType = rateType;
            return this;
          }

          /** Whether smoking is allowed. */
          public Builder setSmokingIndicator(Boolean smokingIndicator) {
            this.smokingIndicator = smokingIndicator;
            return this;
          }
        }

        public enum AccommodationType implements ApiRequestParams.EnumParam {
          @SerializedName("apartment")
          APARTMENT("apartment"),

          @SerializedName("cabana")
          CABANA("cabana"),

          @SerializedName("house")
          HOUSE("house"),

          @SerializedName("penthouse")
          PENTHOUSE("penthouse"),

          @SerializedName("room")
          ROOM("room"),

          @SerializedName("standard")
          STANDARD("standard"),

          @SerializedName("suite")
          SUITE("suite"),

          @SerializedName("villa")
          VILLA("villa");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AccommodationType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Affiliate {
        /** Affiliate partner code. */
        @SerializedName("code")
        Object code;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Affiliate partner name. */
        @SerializedName("name")
        Object name;

        private Affiliate(Object code, Map<String, Object> extraParams, Object name) {
          this.code = code;
          this.extraParams = extraParams;
          this.name = name;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object code;

          private Map<String, Object> extraParams;

          private Object name;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.LodgingData.Affiliate build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Affiliate(
                this.code, this.extraParams, this.name);
          }

          /** Affiliate partner code. */
          public Builder setCode(String code) {
            this.code = code;
            return this;
          }

          /** Affiliate partner code. */
          public Builder setCode(EmptyParam code) {
            this.code = code;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Affiliate#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Affiliate#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Affiliate partner name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Affiliate partner name. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Guest {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Guest's full name. */
        @SerializedName("name")
        Object name;

        private Guest(Map<String, Object> extraParams, Object name) {
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
          public ChargeUpdateParams.PaymentDetails.LodgingData.Guest build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Guest(
                this.extraParams, this.name);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Guest#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Guest#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> Guest's full name. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** <strong>Required.</strong> Guest's full name. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Host {
        /** Address of the host. */
        @SerializedName("address")
        Address address;

        /** Host's country of domicile. */
        @SerializedName("country_of_domicile")
        Object countryOfDomicile;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Reference number for the host. */
        @SerializedName("host_reference")
        Object hostReference;

        /** Type of host. */
        @SerializedName("host_type")
        HostType hostType;

        /** Name of the lodging property or host. */
        @SerializedName("name")
        Object name;

        /** Total number of reservations for the host. */
        @SerializedName("number_of_reservations")
        Long numberOfReservations;

        /** Property phone number. */
        @SerializedName("property_phone_number")
        Object propertyPhoneNumber;

        /** Host's registration date. */
        @SerializedName("registered_at")
        Long registeredAt;

        private Host(
            Address address,
            Object countryOfDomicile,
            Map<String, Object> extraParams,
            Object hostReference,
            HostType hostType,
            Object name,
            Long numberOfReservations,
            Object propertyPhoneNumber,
            Long registeredAt) {
          this.address = address;
          this.countryOfDomicile = countryOfDomicile;
          this.extraParams = extraParams;
          this.hostReference = hostReference;
          this.hostType = hostType;
          this.name = name;
          this.numberOfReservations = numberOfReservations;
          this.propertyPhoneNumber = propertyPhoneNumber;
          this.registeredAt = registeredAt;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Address address;

          private Object countryOfDomicile;

          private Map<String, Object> extraParams;

          private Object hostReference;

          private HostType hostType;

          private Object name;

          private Long numberOfReservations;

          private Object propertyPhoneNumber;

          private Long registeredAt;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.LodgingData.Host build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Host(
                this.address,
                this.countryOfDomicile,
                this.extraParams,
                this.hostReference,
                this.hostType,
                this.name,
                this.numberOfReservations,
                this.propertyPhoneNumber,
                this.registeredAt);
          }

          /** Address of the host. */
          public Builder setAddress(
              ChargeUpdateParams.PaymentDetails.LodgingData.Host.Address address) {
            this.address = address;
            return this;
          }

          /** Host's country of domicile. */
          public Builder setCountryOfDomicile(String countryOfDomicile) {
            this.countryOfDomicile = countryOfDomicile;
            return this;
          }

          /** Host's country of domicile. */
          public Builder setCountryOfDomicile(EmptyParam countryOfDomicile) {
            this.countryOfDomicile = countryOfDomicile;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Host#extraParams} for the
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Host#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Reference number for the host. */
          public Builder setHostReference(String hostReference) {
            this.hostReference = hostReference;
            return this;
          }

          /** Reference number for the host. */
          public Builder setHostReference(EmptyParam hostReference) {
            this.hostReference = hostReference;
            return this;
          }

          /** Type of host. */
          public Builder setHostType(
              ChargeUpdateParams.PaymentDetails.LodgingData.Host.HostType hostType) {
            this.hostType = hostType;
            return this;
          }

          /** Name of the lodging property or host. */
          public Builder setName(String name) {
            this.name = name;
            return this;
          }

          /** Name of the lodging property or host. */
          public Builder setName(EmptyParam name) {
            this.name = name;
            return this;
          }

          /** Total number of reservations for the host. */
          public Builder setNumberOfReservations(Long numberOfReservations) {
            this.numberOfReservations = numberOfReservations;
            return this;
          }

          /** Property phone number. */
          public Builder setPropertyPhoneNumber(String propertyPhoneNumber) {
            this.propertyPhoneNumber = propertyPhoneNumber;
            return this;
          }

          /** Property phone number. */
          public Builder setPropertyPhoneNumber(EmptyParam propertyPhoneNumber) {
            this.propertyPhoneNumber = propertyPhoneNumber;
            return this;
          }

          /** Host's registration date. */
          public Builder setRegisteredAt(Long registeredAt) {
            this.registeredAt = registeredAt;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Address {
          /** <strong>Required.</strong> City, district, suburb, town, or village. */
          @SerializedName("city")
          Object city;

          /**
           * <strong>Required.</strong> Two-letter country code (<a
           * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
           */
          @SerializedName("country")
          Object country;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company name.
           */
          @SerializedName("line1")
          Object line1;

          /** Address line 2, such as the apartment, suite, unit, or building. */
          @SerializedName("line2")
          Object line2;

          /** <strong>Required.</strong> ZIP or postal code. */
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
            public ChargeUpdateParams.PaymentDetails.LodgingData.Host.Address build() {
              return new ChargeUpdateParams.PaymentDetails.LodgingData.Host.Address(
                  this.city,
                  this.country,
                  this.extraParams,
                  this.line1,
                  this.line2,
                  this.postalCode,
                  this.state);
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(String city) {
              this.city = city;
              return this;
            }

            /** <strong>Required.</strong> City, district, suburb, town, or village. */
            public Builder setCity(EmptyParam city) {
              this.city = city;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(String country) {
              this.country = country;
              return this;
            }

            /**
             * <strong>Required.</strong> Two-letter country code (<a
             * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
             */
            public Builder setCountry(EmptyParam country) {
              this.country = country;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Host.Address#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Host.Address#extraParams} for the field
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
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(String line1) {
              this.line1 = line1;
              return this;
            }

            /**
             * <strong>Required.</strong> Address line 1, such as the street, PO Box, or company
             * name.
             */
            public Builder setLine1(EmptyParam line1) {
              this.line1 = line1;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(String line2) {
              this.line2 = line2;
              return this;
            }

            /** Address line 2, such as the apartment, suite, unit, or building. */
            public Builder setLine2(EmptyParam line2) {
              this.line2 = line2;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
            public Builder setPostalCode(String postalCode) {
              this.postalCode = postalCode;
              return this;
            }

            /** <strong>Required.</strong> ZIP or postal code. */
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

        public enum HostType implements ApiRequestParams.EnumParam {
          @SerializedName("hostel")
          HOSTEL("hostel"),

          @SerializedName("hotel")
          HOTEL("hotel"),

          @SerializedName("owner")
          OWNER("owner"),

          @SerializedName("rental_agency")
          RENTAL_AGENCY("rental_agency");

          @Getter(onMethod_ = {@Override})
          private final String value;

          HostType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Insurance {
        /** <strong>Required.</strong> Price of the insurance coverage in cents. */
        @SerializedName("amount")
        Long amount;

        /** Currency of the insurance amount. */
        @SerializedName("currency")
        Object currency;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Name of the insurance company. */
        @SerializedName("insurance_company_name")
        Object insuranceCompanyName;

        /** <strong>Required.</strong> Type of insurance coverage. */
        @SerializedName("insurance_type")
        InsuranceType insuranceType;

        private Insurance(
            Long amount,
            Object currency,
            Map<String, Object> extraParams,
            Object insuranceCompanyName,
            InsuranceType insuranceType) {
          this.amount = amount;
          this.currency = currency;
          this.extraParams = extraParams;
          this.insuranceCompanyName = insuranceCompanyName;
          this.insuranceType = insuranceType;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Object currency;

          private Map<String, Object> extraParams;

          private Object insuranceCompanyName;

          private InsuranceType insuranceType;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.LodgingData.Insurance build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Insurance(
                this.amount,
                this.currency,
                this.extraParams,
                this.insuranceCompanyName,
                this.insuranceType);
          }

          /** <strong>Required.</strong> Price of the insurance coverage in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Currency of the insurance amount. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Insurance#extraParams}
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Insurance#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(String insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** Name of the insurance company. */
          public Builder setInsuranceCompanyName(EmptyParam insuranceCompanyName) {
            this.insuranceCompanyName = insuranceCompanyName;
            return this;
          }

          /** <strong>Required.</strong> Type of insurance coverage. */
          public Builder setInsuranceType(
              ChargeUpdateParams.PaymentDetails.LodgingData.Insurance.InsuranceType insuranceType) {
            this.insuranceType = insuranceType;
            return this;
          }
        }

        public enum InsuranceType implements ApiRequestParams.EnumParam {
          @SerializedName("bankruptcy")
          BANKRUPTCY("bankruptcy"),

          @SerializedName("cancelation")
          CANCELATION("cancelation"),

          @SerializedName("emergency")
          EMERGENCY("emergency"),

          @SerializedName("medical")
          MEDICAL("medical");

          @Getter(onMethod_ = {@Override})
          private final String value;

          InsuranceType(String value) {
            this.value = value;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Total {
        /** <strong>Required.</strong> Total price of the lodging reservation in cents. */
        @SerializedName("amount")
        Long amount;

        /** Cash advances in cents. */
        @SerializedName("cash_advances")
        Long cashAdvances;

        /** Currency of the total amount. */
        @SerializedName("currency")
        Object currency;

        /** Discount details for the lodging. */
        @SerializedName("discounts")
        Discounts discounts;

        /** Additional charges for the lodging. */
        @SerializedName("extra_charges")
        List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge> extraCharges;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Prepaid amount in cents. */
        @SerializedName("prepaid_amount")
        Long prepaidAmount;

        /** Tax breakdown for the lodging reservation. */
        @SerializedName("tax")
        Tax tax;

        private Total(
            Long amount,
            Long cashAdvances,
            Object currency,
            Discounts discounts,
            List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge> extraCharges,
            Map<String, Object> extraParams,
            Long prepaidAmount,
            Tax tax) {
          this.amount = amount;
          this.cashAdvances = cashAdvances;
          this.currency = currency;
          this.discounts = discounts;
          this.extraCharges = extraCharges;
          this.extraParams = extraParams;
          this.prepaidAmount = prepaidAmount;
          this.tax = tax;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Long amount;

          private Long cashAdvances;

          private Object currency;

          private Discounts discounts;

          private List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge>
              extraCharges;

          private Map<String, Object> extraParams;

          private Long prepaidAmount;

          private Tax tax;

          /** Finalize and obtain parameter instance from this builder. */
          public ChargeUpdateParams.PaymentDetails.LodgingData.Total build() {
            return new ChargeUpdateParams.PaymentDetails.LodgingData.Total(
                this.amount,
                this.cashAdvances,
                this.currency,
                this.discounts,
                this.extraCharges,
                this.extraParams,
                this.prepaidAmount,
                this.tax);
          }

          /** <strong>Required.</strong> Total price of the lodging reservation in cents. */
          public Builder setAmount(Long amount) {
            this.amount = amount;
            return this;
          }

          /** Cash advances in cents. */
          public Builder setCashAdvances(Long cashAdvances) {
            this.cashAdvances = cashAdvances;
            return this;
          }

          /** Currency of the total amount. */
          public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
          }

          /** Currency of the total amount. */
          public Builder setCurrency(EmptyParam currency) {
            this.currency = currency;
            return this;
          }

          /** Discount details for the lodging. */
          public Builder setDiscounts(
              ChargeUpdateParams.PaymentDetails.LodgingData.Total.Discounts discounts) {
            this.discounts = discounts;
            return this;
          }

          /**
           * Add an element to `extraCharges` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ChargeUpdateParams.PaymentDetails.LodgingData.Total#extraCharges} for the field
           * documentation.
           */
          public Builder addExtraCharge(
              ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge element) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.add(element);
            return this;
          }

          /**
           * Add all elements to `extraCharges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Total#extraCharges} for the
           * field documentation.
           */
          public Builder addAllExtraCharge(
              List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge> elements) {
            if (this.extraCharges == null) {
              this.extraCharges = new ArrayList<>();
            }
            this.extraCharges.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Total#extraParams} for
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
           * map. See {@link ChargeUpdateParams.PaymentDetails.LodgingData.Total#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Prepaid amount in cents. */
          public Builder setPrepaidAmount(Long prepaidAmount) {
            this.prepaidAmount = prepaidAmount;
            return this;
          }

          /** Tax breakdown for the lodging reservation. */
          public Builder setTax(ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax tax) {
            this.tax = tax;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Discounts {
          /** Corporate client discount code. */
          @SerializedName("corporate_client_code")
          Object corporateClientCode;

          /** Coupon code. */
          @SerializedName("coupon")
          Object coupon;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Discounts(
              Object corporateClientCode, Object coupon, Map<String, Object> extraParams) {
            this.corporateClientCode = corporateClientCode;
            this.coupon = coupon;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Object corporateClientCode;

            private Object coupon;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.LodgingData.Total.Discounts build() {
              return new ChargeUpdateParams.PaymentDetails.LodgingData.Total.Discounts(
                  this.corporateClientCode, this.coupon, this.extraParams);
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(String corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Corporate client discount code. */
            public Builder setCorporateClientCode(EmptyParam corporateClientCode) {
              this.corporateClientCode = corporateClientCode;
              return this;
            }

            /** Coupon code. */
            public Builder setCoupon(String coupon) {
              this.coupon = coupon;
              return this;
            }

            /** Coupon code. */
            public Builder setCoupon(EmptyParam coupon) {
              this.coupon = coupon;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Discounts#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Discounts#extraParams} for the
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
        public static class ExtraCharge {
          /** Amount of the extra charge in cents. */
          @SerializedName("amount")
          Long amount;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Type of extra charge. */
          @SerializedName("type")
          Type type;

          private ExtraCharge(Long amount, Map<String, Object> extraParams, Type type) {
            this.amount = amount;
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge build() {
              return new ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge(
                  this.amount, this.extraParams, this.type);
            }

            /** Amount of the extra charge in cents. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge#extraParams} for the
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
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Type of extra charge. */
            public Builder setType(
                ChargeUpdateParams.PaymentDetails.LodgingData.Total.ExtraCharge.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("gift_shop")
            GIFT_SHOP("gift_shop"),

            @SerializedName("laundry")
            LAUNDRY("laundry"),

            @SerializedName("mini_bar")
            MINI_BAR("mini_bar"),

            @SerializedName("other")
            OTHER("other"),

            @SerializedName("phone")
            PHONE("phone"),

            @SerializedName("restaurant")
            RESTAURANT("restaurant");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tax {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Indicates whether the transaction is tax exempt. */
          @SerializedName("tax_exempt_indicator")
          Boolean taxExemptIndicator;

          /** Tax details. */
          @SerializedName("taxes")
          List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax> taxes;

          private Tax(
              Map<String, Object> extraParams,
              Boolean taxExemptIndicator,
              List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax> taxes) {
            this.extraParams = extraParams;
            this.taxExemptIndicator = taxExemptIndicator;
            this.taxes = taxes;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Boolean taxExemptIndicator;

            private List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax> taxes;

            /** Finalize and obtain parameter instance from this builder. */
            public ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax build() {
              return new ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax(
                  this.extraParams, this.taxExemptIndicator, this.taxes);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax#extraParams} for the field
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Indicates whether the transaction is tax exempt. */
            public Builder setTaxExemptIndicator(Boolean taxExemptIndicator) {
              this.taxExemptIndicator = taxExemptIndicator;
              return this;
            }

            /**
             * Add an element to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addTax(
                ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax element) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.add(element);
              return this;
            }

            /**
             * Add all elements to `taxes` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax#taxes} for the field
             * documentation.
             */
            public Builder addAllTax(
                List<ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax> elements) {
              if (this.taxes == null) {
                this.taxes = new ArrayList<>();
              }
              this.taxes.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class InnerTax {
            /** Tax amount in cents. */
            @SerializedName("amount")
            Long amount;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Tax rate. */
            @SerializedName("rate")
            Long rate;

            /** Type of tax applied. */
            @SerializedName("type")
            Object type;

            private InnerTax(Long amount, Map<String, Object> extraParams, Long rate, Object type) {
              this.amount = amount;
              this.extraParams = extraParams;
              this.rate = rate;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private Map<String, Object> extraParams;

              private Long rate;

              private Object type;

              /** Finalize and obtain parameter instance from this builder. */
              public ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax build() {
                return new ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax(
                    this.amount, this.extraParams, this.rate, this.type);
              }

              /** Tax amount in cents. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax#extraParams} for
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ChargeUpdateParams.PaymentDetails.LodgingData.Total.Tax.InnerTax#extraParams} for
               * the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Tax rate. */
              public Builder setRate(Long rate) {
                this.rate = rate;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(String type) {
                this.type = type;
                return this;
              }

              /** Type of tax applied. */
              public Builder setType(EmptyParam type) {
                this.type = type;
                return this;
              }
            }
          }
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

      /** Address line 1, such as the street, PO Box, or company name. */
      @SerializedName("line1")
      Object line1;

      /** Address line 2, such as the apartment, suite, unit, or building. */
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

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 1, such as the street, PO Box, or company name. */
        public Builder setLine1(EmptyParam line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** Address line 2, such as the apartment, suite, unit, or building. */
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
