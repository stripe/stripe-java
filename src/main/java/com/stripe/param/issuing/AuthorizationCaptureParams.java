// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AuthorizationCaptureParams extends ApiRequestParams {
  /**
   * The amount to capture from the authorization. If not provided, the full amount of the
   * authorization will be captured. This amount is in the authorization currency and in the <a
   * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("capture_amount")
  Long captureAmount;

  /**
   * Whether to close the authorization after capture. Defaults to true. Set to false to enable
   * multi-capture flows.
   */
  @SerializedName("close_authorization")
  Boolean closeAuthorization;

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

  /** Additional purchase information that is optionally provided by the merchant. */
  @SerializedName("purchase_details")
  PurchaseDetails purchaseDetails;

  private AuthorizationCaptureParams(
      Long captureAmount,
      Boolean closeAuthorization,
      List<String> expand,
      Map<String, Object> extraParams,
      PurchaseDetails purchaseDetails) {
    this.captureAmount = captureAmount;
    this.closeAuthorization = closeAuthorization;
    this.expand = expand;
    this.extraParams = extraParams;
    this.purchaseDetails = purchaseDetails;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long captureAmount;

    private Boolean closeAuthorization;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private PurchaseDetails purchaseDetails;

    /** Finalize and obtain parameter instance from this builder. */
    public AuthorizationCaptureParams build() {
      return new AuthorizationCaptureParams(
          this.captureAmount,
          this.closeAuthorization,
          this.expand,
          this.extraParams,
          this.purchaseDetails);
    }

    /**
     * The amount to capture from the authorization. If not provided, the full amount of the
     * authorization will be captured. This amount is in the authorization currency and in the <a
     * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
     */
    public Builder setCaptureAmount(Long captureAmount) {
      this.captureAmount = captureAmount;
      return this;
    }

    /**
     * Whether to close the authorization after capture. Defaults to true. Set to false to enable
     * multi-capture flows.
     */
    public Builder setCloseAuthorization(Boolean closeAuthorization) {
      this.closeAuthorization = closeAuthorization;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationCaptureParams#expand} for the field documentation.
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
     * AuthorizationCaptureParams#expand} for the field documentation.
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
     * AuthorizationCaptureParams#extraParams} for the field documentation.
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
     * See {@link AuthorizationCaptureParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Additional purchase information that is optionally provided by the merchant. */
    public Builder setPurchaseDetails(AuthorizationCaptureParams.PurchaseDetails purchaseDetails) {
      this.purchaseDetails = purchaseDetails;
      return this;
    }
  }

  @Getter
  public static class PurchaseDetails {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Information about the flight that was purchased with this transaction. */
    @SerializedName("flight")
    Flight flight;

    /** Information about fuel that was purchased with this transaction. */
    @SerializedName("fuel")
    Fuel fuel;

    /** Information about lodging that was purchased with this transaction. */
    @SerializedName("lodging")
    Lodging lodging;

    /** The line items in the purchase. */
    @SerializedName("receipt")
    List<AuthorizationCaptureParams.PurchaseDetails.Receipt> receipt;

    /** A merchant-specific order number. */
    @SerializedName("reference")
    String reference;

    private PurchaseDetails(
        Map<String, Object> extraParams,
        Flight flight,
        Fuel fuel,
        Lodging lodging,
        List<AuthorizationCaptureParams.PurchaseDetails.Receipt> receipt,
        String reference) {
      this.extraParams = extraParams;
      this.flight = flight;
      this.fuel = fuel;
      this.lodging = lodging;
      this.receipt = receipt;
      this.reference = reference;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Flight flight;

      private Fuel fuel;

      private Lodging lodging;

      private List<AuthorizationCaptureParams.PurchaseDetails.Receipt> receipt;

      private String reference;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthorizationCaptureParams.PurchaseDetails build() {
        return new AuthorizationCaptureParams.PurchaseDetails(
            this.extraParams, this.flight, this.fuel, this.lodging, this.receipt, this.reference);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthorizationCaptureParams.PurchaseDetails#extraParams} for the field documentation.
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
       * See {@link AuthorizationCaptureParams.PurchaseDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Information about the flight that was purchased with this transaction. */
      public Builder setFlight(AuthorizationCaptureParams.PurchaseDetails.Flight flight) {
        this.flight = flight;
        return this;
      }

      /** Information about fuel that was purchased with this transaction. */
      public Builder setFuel(AuthorizationCaptureParams.PurchaseDetails.Fuel fuel) {
        this.fuel = fuel;
        return this;
      }

      /** Information about lodging that was purchased with this transaction. */
      public Builder setLodging(AuthorizationCaptureParams.PurchaseDetails.Lodging lodging) {
        this.lodging = lodging;
        return this;
      }

      /**
       * Add an element to `receipt` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AuthorizationCaptureParams.PurchaseDetails#receipt} for the field documentation.
       */
      public Builder addReceipt(AuthorizationCaptureParams.PurchaseDetails.Receipt element) {
        if (this.receipt == null) {
          this.receipt = new ArrayList<>();
        }
        this.receipt.add(element);
        return this;
      }

      /**
       * Add all elements to `receipt` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * AuthorizationCaptureParams.PurchaseDetails#receipt} for the field documentation.
       */
      public Builder addAllReceipt(
          List<AuthorizationCaptureParams.PurchaseDetails.Receipt> elements) {
        if (this.receipt == null) {
          this.receipt = new ArrayList<>();
        }
        this.receipt.addAll(elements);
        return this;
      }

      /** A merchant-specific order number. */
      public Builder setReference(String reference) {
        this.reference = reference;
        return this;
      }
    }

    @Getter
    public static class Flight {
      /** The time that the flight departed. */
      @SerializedName("departure_at")
      Long departureAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The name of the passenger. */
      @SerializedName("passenger_name")
      String passengerName;

      /** Whether the ticket is refundable. */
      @SerializedName("refundable")
      Boolean refundable;

      /** The legs of the trip. */
      @SerializedName("segments")
      List<AuthorizationCaptureParams.PurchaseDetails.Flight.Segment> segments;

      /** The travel agency that issued the ticket. */
      @SerializedName("travel_agency")
      String travelAgency;

      private Flight(
          Long departureAt,
          Map<String, Object> extraParams,
          String passengerName,
          Boolean refundable,
          List<AuthorizationCaptureParams.PurchaseDetails.Flight.Segment> segments,
          String travelAgency) {
        this.departureAt = departureAt;
        this.extraParams = extraParams;
        this.passengerName = passengerName;
        this.refundable = refundable;
        this.segments = segments;
        this.travelAgency = travelAgency;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long departureAt;

        private Map<String, Object> extraParams;

        private String passengerName;

        private Boolean refundable;

        private List<AuthorizationCaptureParams.PurchaseDetails.Flight.Segment> segments;

        private String travelAgency;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationCaptureParams.PurchaseDetails.Flight build() {
          return new AuthorizationCaptureParams.PurchaseDetails.Flight(
              this.departureAt,
              this.extraParams,
              this.passengerName,
              this.refundable,
              this.segments,
              this.travelAgency);
        }

        /** The time that the flight departed. */
        public Builder setDepartureAt(Long departureAt) {
          this.departureAt = departureAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Flight#extraParams} for the
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
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Flight#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The name of the passenger. */
        public Builder setPassengerName(String passengerName) {
          this.passengerName = passengerName;
          return this;
        }

        /** Whether the ticket is refundable. */
        public Builder setRefundable(Boolean refundable) {
          this.refundable = refundable;
          return this;
        }

        /**
         * Add an element to `segments` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * AuthorizationCaptureParams.PurchaseDetails.Flight#segments} for the field documentation.
         */
        public Builder addSegment(
            AuthorizationCaptureParams.PurchaseDetails.Flight.Segment element) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.add(element);
          return this;
        }

        /**
         * Add all elements to `segments` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * AuthorizationCaptureParams.PurchaseDetails.Flight#segments} for the field documentation.
         */
        public Builder addAllSegment(
            List<AuthorizationCaptureParams.PurchaseDetails.Flight.Segment> elements) {
          if (this.segments == null) {
            this.segments = new ArrayList<>();
          }
          this.segments.addAll(elements);
          return this;
        }

        /** The travel agency that issued the ticket. */
        public Builder setTravelAgency(String travelAgency) {
          this.travelAgency = travelAgency;
          return this;
        }
      }

      @Getter
      public static class Segment {
        /** The three-letter IATA airport code of the flight's destination. */
        @SerializedName("arrival_airport_code")
        String arrivalAirportCode;

        /** The airline carrier code. */
        @SerializedName("carrier")
        String carrier;

        /** The three-letter IATA airport code that the flight departed from. */
        @SerializedName("departure_airport_code")
        String departureAirportCode;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The flight number. */
        @SerializedName("flight_number")
        String flightNumber;

        /** The flight's service class. */
        @SerializedName("service_class")
        String serviceClass;

        /** Whether a stopover is allowed on this flight. */
        @SerializedName("stopover_allowed")
        Boolean stopoverAllowed;

        private Segment(
            String arrivalAirportCode,
            String carrier,
            String departureAirportCode,
            Map<String, Object> extraParams,
            String flightNumber,
            String serviceClass,
            Boolean stopoverAllowed) {
          this.arrivalAirportCode = arrivalAirportCode;
          this.carrier = carrier;
          this.departureAirportCode = departureAirportCode;
          this.extraParams = extraParams;
          this.flightNumber = flightNumber;
          this.serviceClass = serviceClass;
          this.stopoverAllowed = stopoverAllowed;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String arrivalAirportCode;

          private String carrier;

          private String departureAirportCode;

          private Map<String, Object> extraParams;

          private String flightNumber;

          private String serviceClass;

          private Boolean stopoverAllowed;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthorizationCaptureParams.PurchaseDetails.Flight.Segment build() {
            return new AuthorizationCaptureParams.PurchaseDetails.Flight.Segment(
                this.arrivalAirportCode,
                this.carrier,
                this.departureAirportCode,
                this.extraParams,
                this.flightNumber,
                this.serviceClass,
                this.stopoverAllowed);
          }

          /** The three-letter IATA airport code of the flight's destination. */
          public Builder setArrivalAirportCode(String arrivalAirportCode) {
            this.arrivalAirportCode = arrivalAirportCode;
            return this;
          }

          /** The airline carrier code. */
          public Builder setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
          }

          /** The three-letter IATA airport code that the flight departed from. */
          public Builder setDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Flight.Segment#extraParams}
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
           * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Flight.Segment#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The flight number. */
          public Builder setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
          }

          /** The flight's service class. */
          public Builder setServiceClass(String serviceClass) {
            this.serviceClass = serviceClass;
            return this;
          }

          /** Whether a stopover is allowed on this flight. */
          public Builder setStopoverAllowed(Boolean stopoverAllowed) {
            this.stopoverAllowed = stopoverAllowed;
            return this;
          }
        }
      }
    }

    @Getter
    public static class Fuel {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
       * unleaded_regular}, {@code unleaded_super}, or {@code other}.
       */
      @SerializedName("type")
      Type type;

      /** The units for {@code volume_decimal}. One of {@code us_gallon} or {@code liter}. */
      @SerializedName("unit")
      Unit unit;

      /**
       * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
       * decimal places.
       */
      @SerializedName("unit_cost_decimal")
      BigDecimal unitCostDecimal;

      /**
       * The volume of the fuel that was pumped, represented as a decimal string with at most 12
       * decimal places.
       */
      @SerializedName("volume_decimal")
      BigDecimal volumeDecimal;

      private Fuel(
          Map<String, Object> extraParams,
          Type type,
          Unit unit,
          BigDecimal unitCostDecimal,
          BigDecimal volumeDecimal) {
        this.extraParams = extraParams;
        this.type = type;
        this.unit = unit;
        this.unitCostDecimal = unitCostDecimal;
        this.volumeDecimal = volumeDecimal;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Type type;

        private Unit unit;

        private BigDecimal unitCostDecimal;

        private BigDecimal volumeDecimal;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationCaptureParams.PurchaseDetails.Fuel build() {
          return new AuthorizationCaptureParams.PurchaseDetails.Fuel(
              this.extraParams, this.type, this.unit, this.unitCostDecimal, this.volumeDecimal);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Fuel#extraParams} for the
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
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Fuel#extraParams} for the
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
         * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
         * unleaded_regular}, {@code unleaded_super}, or {@code other}.
         */
        public Builder setType(AuthorizationCaptureParams.PurchaseDetails.Fuel.Type type) {
          this.type = type;
          return this;
        }

        /** The units for {@code volume_decimal}. One of {@code us_gallon} or {@code liter}. */
        public Builder setUnit(AuthorizationCaptureParams.PurchaseDetails.Fuel.Unit unit) {
          this.unit = unit;
          return this;
        }

        /**
         * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
         * decimal places.
         */
        public Builder setUnitCostDecimal(BigDecimal unitCostDecimal) {
          this.unitCostDecimal = unitCostDecimal;
          return this;
        }

        /**
         * The volume of the fuel that was pumped, represented as a decimal string with at most 12
         * decimal places.
         */
        public Builder setVolumeDecimal(BigDecimal volumeDecimal) {
          this.volumeDecimal = volumeDecimal;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("diesel")
        DIESEL("diesel"),

        @SerializedName("other")
        OTHER("other"),

        @SerializedName("unleaded_plus")
        UNLEADED_PLUS("unleaded_plus"),

        @SerializedName("unleaded_regular")
        UNLEADED_REGULAR("unleaded_regular"),

        @SerializedName("unleaded_super")
        UNLEADED_SUPER("unleaded_super");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }

      public enum Unit implements ApiRequestParams.EnumParam {
        @SerializedName("liter")
        LITER("liter"),

        @SerializedName("us_gallon")
        US_GALLON("us_gallon");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Unit(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    public static class Lodging {
      /** The time of checking into the lodging. */
      @SerializedName("check_in_at")
      Long checkInAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The number of nights stayed at the lodging. */
      @SerializedName("nights")
      Long nights;

      private Lodging(Long checkInAt, Map<String, Object> extraParams, Long nights) {
        this.checkInAt = checkInAt;
        this.extraParams = extraParams;
        this.nights = nights;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long checkInAt;

        private Map<String, Object> extraParams;

        private Long nights;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationCaptureParams.PurchaseDetails.Lodging build() {
          return new AuthorizationCaptureParams.PurchaseDetails.Lodging(
              this.checkInAt, this.extraParams, this.nights);
        }

        /** The time of checking into the lodging. */
        public Builder setCheckInAt(Long checkInAt) {
          this.checkInAt = checkInAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Lodging#extraParams} for the
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
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Lodging#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The number of nights stayed at the lodging. */
        public Builder setNights(Long nights) {
          this.nights = nights;
          return this;
        }
      }
    }

    @Getter
    public static class Receipt {
      @SerializedName("description")
      String description;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("quantity")
      BigDecimal quantity;

      @SerializedName("total")
      Long total;

      @SerializedName("unit_cost")
      Long unitCost;

      private Receipt(
          String description,
          Map<String, Object> extraParams,
          BigDecimal quantity,
          Long total,
          Long unitCost) {
        this.description = description;
        this.extraParams = extraParams;
        this.quantity = quantity;
        this.total = total;
        this.unitCost = unitCost;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String description;

        private Map<String, Object> extraParams;

        private BigDecimal quantity;

        private Long total;

        private Long unitCost;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationCaptureParams.PurchaseDetails.Receipt build() {
          return new AuthorizationCaptureParams.PurchaseDetails.Receipt(
              this.description, this.extraParams, this.quantity, this.total, this.unitCost);
        }

        public Builder setDescription(String description) {
          this.description = description;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Receipt#extraParams} for the
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
         * map. See {@link AuthorizationCaptureParams.PurchaseDetails.Receipt#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setQuantity(BigDecimal quantity) {
          this.quantity = quantity;
          return this;
        }

        public Builder setTotal(Long total) {
          this.total = total;
          return this;
        }

        public Builder setUnitCost(Long unitCost) {
          this.unitCost = unitCost;
          return this;
        }
      }
    }
  }
}
