// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class AuthorizationFinalizeAmountParams extends ApiRequestParams {
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
   * <strong>Required.</strong> The final authorization amount that will be captured by the
   * merchant. This amount is in the authorization currency and in the <a
   * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("final_amount")
  Long finalAmount;

  /** Fleet-specific information for authorizations using Fleet cards. */
  @SerializedName("fleet")
  Fleet fleet;

  /** Information about fuel that was purchased with this transaction. */
  @SerializedName("fuel")
  Fuel fuel;

  private AuthorizationFinalizeAmountParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Long finalAmount,
      Fleet fleet,
      Fuel fuel) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.finalAmount = finalAmount;
    this.fleet = fleet;
    this.fuel = fuel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long finalAmount;

    private Fleet fleet;

    private Fuel fuel;

    /** Finalize and obtain parameter instance from this builder. */
    public AuthorizationFinalizeAmountParams build() {
      return new AuthorizationFinalizeAmountParams(
          this.expand, this.extraParams, this.finalAmount, this.fleet, this.fuel);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AuthorizationFinalizeAmountParams#expand} for the field documentation.
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
     * AuthorizationFinalizeAmountParams#expand} for the field documentation.
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
     * AuthorizationFinalizeAmountParams#extraParams} for the field documentation.
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
     * See {@link AuthorizationFinalizeAmountParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> The final authorization amount that will be captured by the
     * merchant. This amount is in the authorization currency and in the <a
     * href="https://docs.stripe.com/currencies#zero-decimal">smallest currency unit</a>.
     */
    public Builder setFinalAmount(Long finalAmount) {
      this.finalAmount = finalAmount;
      return this;
    }

    /** Fleet-specific information for authorizations using Fleet cards. */
    public Builder setFleet(AuthorizationFinalizeAmountParams.Fleet fleet) {
      this.fleet = fleet;
      return this;
    }

    /** Information about fuel that was purchased with this transaction. */
    public Builder setFuel(AuthorizationFinalizeAmountParams.Fuel fuel) {
      this.fuel = fuel;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Fleet {
    /**
     * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary
     * depending on the configuration of your physical fleet cards. Typical points of sale support
     * only numeric entry.
     */
    @SerializedName("cardholder_prompt_data")
    CardholderPromptData cardholderPromptData;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The type of purchase. One of {@code fuel_purchase}, {@code non_fuel_purchase}, or {@code
     * fuel_and_non_fuel_purchase}.
     */
    @SerializedName("purchase_type")
    PurchaseType purchaseType;

    /**
     * More information about the total amount. This information is not guaranteed to be accurate as
     * some merchants may provide unreliable data.
     */
    @SerializedName("reported_breakdown")
    ReportedBreakdown reportedBreakdown;

    /**
     * The type of fuel service. One of {@code non_fuel_transaction}, {@code full_service}, or
     * {@code self_service}.
     */
    @SerializedName("service_type")
    ServiceType serviceType;

    private Fleet(
        CardholderPromptData cardholderPromptData,
        Map<String, Object> extraParams,
        PurchaseType purchaseType,
        ReportedBreakdown reportedBreakdown,
        ServiceType serviceType) {
      this.cardholderPromptData = cardholderPromptData;
      this.extraParams = extraParams;
      this.purchaseType = purchaseType;
      this.reportedBreakdown = reportedBreakdown;
      this.serviceType = serviceType;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CardholderPromptData cardholderPromptData;

      private Map<String, Object> extraParams;

      private PurchaseType purchaseType;

      private ReportedBreakdown reportedBreakdown;

      private ServiceType serviceType;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthorizationFinalizeAmountParams.Fleet build() {
        return new AuthorizationFinalizeAmountParams.Fleet(
            this.cardholderPromptData,
            this.extraParams,
            this.purchaseType,
            this.reportedBreakdown,
            this.serviceType);
      }

      /**
       * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary
       * depending on the configuration of your physical fleet cards. Typical points of sale support
       * only numeric entry.
       */
      public Builder setCardholderPromptData(
          AuthorizationFinalizeAmountParams.Fleet.CardholderPromptData cardholderPromptData) {
        this.cardholderPromptData = cardholderPromptData;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthorizationFinalizeAmountParams.Fleet#extraParams} for the field documentation.
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
       * See {@link AuthorizationFinalizeAmountParams.Fleet#extraParams} for the field
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
       * The type of purchase. One of {@code fuel_purchase}, {@code non_fuel_purchase}, or {@code
       * fuel_and_non_fuel_purchase}.
       */
      public Builder setPurchaseType(
          AuthorizationFinalizeAmountParams.Fleet.PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
        return this;
      }

      /**
       * More information about the total amount. This information is not guaranteed to be accurate
       * as some merchants may provide unreliable data.
       */
      public Builder setReportedBreakdown(
          AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown reportedBreakdown) {
        this.reportedBreakdown = reportedBreakdown;
        return this;
      }

      /**
       * The type of fuel service. One of {@code non_fuel_transaction}, {@code full_service}, or
       * {@code self_service}.
       */
      public Builder setServiceType(
          AuthorizationFinalizeAmountParams.Fleet.ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class CardholderPromptData {
      /** Driver ID. */
      @SerializedName("driver_id")
      String driverId;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Odometer reading. */
      @SerializedName("odometer")
      Long odometer;

      /**
       * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is
       * entered by the cardholder, but the merchant or card network did not specify the prompt
       * type.
       */
      @SerializedName("unspecified_id")
      String unspecifiedId;

      /** User ID. */
      @SerializedName("user_id")
      String userId;

      /** Vehicle number. */
      @SerializedName("vehicle_number")
      String vehicleNumber;

      private CardholderPromptData(
          String driverId,
          Map<String, Object> extraParams,
          Long odometer,
          String unspecifiedId,
          String userId,
          String vehicleNumber) {
        this.driverId = driverId;
        this.extraParams = extraParams;
        this.odometer = odometer;
        this.unspecifiedId = unspecifiedId;
        this.userId = userId;
        this.vehicleNumber = vehicleNumber;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String driverId;

        private Map<String, Object> extraParams;

        private Long odometer;

        private String unspecifiedId;

        private String userId;

        private String vehicleNumber;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationFinalizeAmountParams.Fleet.CardholderPromptData build() {
          return new AuthorizationFinalizeAmountParams.Fleet.CardholderPromptData(
              this.driverId,
              this.extraParams,
              this.odometer,
              this.unspecifiedId,
              this.userId,
              this.vehicleNumber);
        }

        /** Driver ID. */
        public Builder setDriverId(String driverId) {
          this.driverId = driverId;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationFinalizeAmountParams.Fleet.CardholderPromptData#extraParams}
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
         * map. See {@link AuthorizationFinalizeAmountParams.Fleet.CardholderPromptData#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Odometer reading. */
        public Builder setOdometer(Long odometer) {
          this.odometer = odometer;
          return this;
        }

        /**
         * An alphanumeric ID. This field is used when a vehicle ID, driver ID, or generic ID is
         * entered by the cardholder, but the merchant or card network did not specify the prompt
         * type.
         */
        public Builder setUnspecifiedId(String unspecifiedId) {
          this.unspecifiedId = unspecifiedId;
          return this;
        }

        /** User ID. */
        public Builder setUserId(String userId) {
          this.userId = userId;
          return this;
        }

        /** Vehicle number. */
        public Builder setVehicleNumber(String vehicleNumber) {
          this.vehicleNumber = vehicleNumber;
          return this;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ReportedBreakdown {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Breakdown of fuel portion of the purchase. */
      @SerializedName("fuel")
      Fuel fuel;

      /** Breakdown of non-fuel portion of the purchase. */
      @SerializedName("non_fuel")
      NonFuel nonFuel;

      /** Information about tax included in this transaction. */
      @SerializedName("tax")
      Tax tax;

      private ReportedBreakdown(
          Map<String, Object> extraParams, Fuel fuel, NonFuel nonFuel, Tax tax) {
        this.extraParams = extraParams;
        this.fuel = fuel;
        this.nonFuel = nonFuel;
        this.tax = tax;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Fuel fuel;

        private NonFuel nonFuel;

        private Tax tax;

        /** Finalize and obtain parameter instance from this builder. */
        public AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown build() {
          return new AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown(
              this.extraParams, this.fuel, this.nonFuel, this.tax);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown#extraParams}
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
         * map. See {@link AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown#extraParams}
         * for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Breakdown of fuel portion of the purchase. */
        public Builder setFuel(
            AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Fuel fuel) {
          this.fuel = fuel;
          return this;
        }

        /** Breakdown of non-fuel portion of the purchase. */
        public Builder setNonFuel(
            AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.NonFuel nonFuel) {
          this.nonFuel = nonFuel;
          return this;
        }

        /** Information about tax included in this transaction. */
        public Builder setTax(AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Tax tax) {
          this.tax = tax;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Fuel {
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
         * Gross fuel amount that should equal Fuel Volume multipled by Fuel Unit Cost, inclusive of
         * taxes.
         */
        @SerializedName("gross_amount_decimal")
        BigDecimal grossAmountDecimal;

        private Fuel(Map<String, Object> extraParams, BigDecimal grossAmountDecimal) {
          this.extraParams = extraParams;
          this.grossAmountDecimal = grossAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private BigDecimal grossAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Fuel build() {
            return new AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Fuel(
                this.extraParams, this.grossAmountDecimal);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Fuel#extraParams} for the
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
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Fuel#extraParams} for the
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
           * Gross fuel amount that should equal Fuel Volume multipled by Fuel Unit Cost, inclusive
           * of taxes.
           */
          public Builder setGrossAmountDecimal(BigDecimal grossAmountDecimal) {
            this.grossAmountDecimal = grossAmountDecimal;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class NonFuel {
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
         * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
         */
        @SerializedName("gross_amount_decimal")
        BigDecimal grossAmountDecimal;

        private NonFuel(Map<String, Object> extraParams, BigDecimal grossAmountDecimal) {
          this.extraParams = extraParams;
          this.grossAmountDecimal = grossAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private BigDecimal grossAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.NonFuel build() {
            return new AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.NonFuel(
                this.extraParams, this.grossAmountDecimal);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.NonFuel#extraParams} for the
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
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.NonFuel#extraParams} for the
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
           * Gross non-fuel amount that should equal the sum of the line items, inclusive of taxes.
           */
          public Builder setGrossAmountDecimal(BigDecimal grossAmountDecimal) {
            this.grossAmountDecimal = grossAmountDecimal;
            return this;
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
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Amount of state or provincial Sales Tax included in the transaction amount. Null if not
         * reported by merchant or not subject to tax.
         */
        @SerializedName("local_amount_decimal")
        BigDecimal localAmountDecimal;

        /**
         * Amount of national Sales Tax or VAT included in the transaction amount. Null if not
         * reported by merchant or not subject to tax.
         */
        @SerializedName("national_amount_decimal")
        BigDecimal nationalAmountDecimal;

        private Tax(
            Map<String, Object> extraParams,
            BigDecimal localAmountDecimal,
            BigDecimal nationalAmountDecimal) {
          this.extraParams = extraParams;
          this.localAmountDecimal = localAmountDecimal;
          this.nationalAmountDecimal = nationalAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private BigDecimal localAmountDecimal;

          private BigDecimal nationalAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Tax build() {
            return new AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Tax(
                this.extraParams, this.localAmountDecimal, this.nationalAmountDecimal);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Tax#extraParams} for the
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
           * AuthorizationFinalizeAmountParams.Fleet.ReportedBreakdown.Tax#extraParams} for the
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
           * Amount of state or provincial Sales Tax included in the transaction amount. Null if not
           * reported by merchant or not subject to tax.
           */
          public Builder setLocalAmountDecimal(BigDecimal localAmountDecimal) {
            this.localAmountDecimal = localAmountDecimal;
            return this;
          }

          /**
           * Amount of national Sales Tax or VAT included in the transaction amount. Null if not
           * reported by merchant or not subject to tax.
           */
          public Builder setNationalAmountDecimal(BigDecimal nationalAmountDecimal) {
            this.nationalAmountDecimal = nationalAmountDecimal;
            return this;
          }
        }
      }
    }

    public enum PurchaseType implements ApiRequestParams.EnumParam {
      @SerializedName("fuel_and_non_fuel_purchase")
      FUEL_AND_NON_FUEL_PURCHASE("fuel_and_non_fuel_purchase"),

      @SerializedName("fuel_purchase")
      FUEL_PURCHASE("fuel_purchase"),

      @SerializedName("non_fuel_purchase")
      NON_FUEL_PURCHASE("non_fuel_purchase");

      @Getter(onMethod_ = {@Override})
      private final String value;

      PurchaseType(String value) {
        this.value = value;
      }
    }

    public enum ServiceType implements ApiRequestParams.EnumParam {
      @SerializedName("full_service")
      FULL_SERVICE("full_service"),

      @SerializedName("non_fuel_transaction")
      NON_FUEL_TRANSACTION("non_fuel_transaction"),

      @SerializedName("self_service")
      SELF_SERVICE("self_service");

      @Getter(onMethod_ = {@Override})
      private final String value;

      ServiceType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Fuel {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * <a href="https://www.conexxus.org/conexxus-payment-system-product-codes">Conexxus Payment
     * System Product Code</a> identifying the primary fuel product purchased.
     */
    @SerializedName("industry_product_code")
    String industryProductCode;

    /**
     * The quantity of {@code unit}s of fuel that was dispensed, represented as a decimal string
     * with at most 12 decimal places.
     */
    @SerializedName("quantity_decimal")
    BigDecimal quantityDecimal;

    /**
     * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
     * unleaded_regular}, {@code unleaded_super}, or {@code other}.
     */
    @SerializedName("type")
    Type type;

    /**
     * The units for {@code quantity_decimal}. One of {@code charging_minute}, {@code
     * imperial_gallon}, {@code kilogram}, {@code kilowatt_hour}, {@code liter}, {@code pound},
     * {@code us_gallon}, or {@code other}.
     */
    @SerializedName("unit")
    Unit unit;

    /**
     * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
     * decimal places.
     */
    @SerializedName("unit_cost_decimal")
    BigDecimal unitCostDecimal;

    private Fuel(
        Map<String, Object> extraParams,
        String industryProductCode,
        BigDecimal quantityDecimal,
        Type type,
        Unit unit,
        BigDecimal unitCostDecimal) {
      this.extraParams = extraParams;
      this.industryProductCode = industryProductCode;
      this.quantityDecimal = quantityDecimal;
      this.type = type;
      this.unit = unit;
      this.unitCostDecimal = unitCostDecimal;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String industryProductCode;

      private BigDecimal quantityDecimal;

      private Type type;

      private Unit unit;

      private BigDecimal unitCostDecimal;

      /** Finalize and obtain parameter instance from this builder. */
      public AuthorizationFinalizeAmountParams.Fuel build() {
        return new AuthorizationFinalizeAmountParams.Fuel(
            this.extraParams,
            this.industryProductCode,
            this.quantityDecimal,
            this.type,
            this.unit,
            this.unitCostDecimal);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AuthorizationFinalizeAmountParams.Fuel#extraParams} for the field documentation.
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
       * See {@link AuthorizationFinalizeAmountParams.Fuel#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <a href="https://www.conexxus.org/conexxus-payment-system-product-codes">Conexxus Payment
       * System Product Code</a> identifying the primary fuel product purchased.
       */
      public Builder setIndustryProductCode(String industryProductCode) {
        this.industryProductCode = industryProductCode;
        return this;
      }

      /**
       * The quantity of {@code unit}s of fuel that was dispensed, represented as a decimal string
       * with at most 12 decimal places.
       */
      public Builder setQuantityDecimal(BigDecimal quantityDecimal) {
        this.quantityDecimal = quantityDecimal;
        return this;
      }

      /**
       * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
       * unleaded_regular}, {@code unleaded_super}, or {@code other}.
       */
      public Builder setType(AuthorizationFinalizeAmountParams.Fuel.Type type) {
        this.type = type;
        return this;
      }

      /**
       * The units for {@code quantity_decimal}. One of {@code charging_minute}, {@code
       * imperial_gallon}, {@code kilogram}, {@code kilowatt_hour}, {@code liter}, {@code pound},
       * {@code us_gallon}, or {@code other}.
       */
      public Builder setUnit(AuthorizationFinalizeAmountParams.Fuel.Unit unit) {
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
      @SerializedName("charging_minute")
      CHARGING_MINUTE("charging_minute"),

      @SerializedName("imperial_gallon")
      IMPERIAL_GALLON("imperial_gallon"),

      @SerializedName("kilogram")
      KILOGRAM("kilogram"),

      @SerializedName("kilowatt_hour")
      KILOWATT_HOUR("kilowatt_hour"),

      @SerializedName("liter")
      LITER("liter"),

      @SerializedName("other")
      OTHER("other"),

      @SerializedName("pound")
      POUND("pound"),

      @SerializedName("us_gallon")
      US_GALLON("us_gallon");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Unit(String value) {
        this.value = value;
      }
    }
  }
}
