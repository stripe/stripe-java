// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ContractCreateParams extends ApiRequestParams {
  /**
   * The billing cycle anchor for the contract. If not provided, defaults to the pricing line start
   * time. It is only at the top-level of the contract with no option to override at the pricing
   * line level.
   */
  @SerializedName("billing_cycle_anchor")
  BillingCycleAnchor billingCycleAnchor;

  /** The billing settings for the contract. */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /** <strong>Required.</strong> A unique user-provided contract number e.g. C-2026-0001. */
  @SerializedName("contract_number")
  String contractNumber;

  /** <strong>Required.</strong> Currency of the contract. */
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

  /** Additional fields to include in the response. */
  @SerializedName("include")
  List<ContractCreateParams.Include> include;

  /** Set of key-value pairs that you can attach to an object. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** A list of pricing lines to create with the contract. */
  @SerializedName("pricing_lines")
  List<ContractCreateParams.PricingLine> pricingLines;

  /** A list of pricing overrides to create with the contract. */
  @SerializedName("pricing_overrides")
  List<ContractCreateParams.PricingOverride> pricingOverrides;

  private ContractCreateParams(
      BillingCycleAnchor billingCycleAnchor,
      BillingSettings billingSettings,
      String contractNumber,
      String currency,
      Map<String, Object> extraParams,
      List<ContractCreateParams.Include> include,
      Map<String, String> metadata,
      List<ContractCreateParams.PricingLine> pricingLines,
      List<ContractCreateParams.PricingOverride> pricingOverrides) {
    this.billingCycleAnchor = billingCycleAnchor;
    this.billingSettings = billingSettings;
    this.contractNumber = contractNumber;
    this.currency = currency;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.pricingLines = pricingLines;
    this.pricingOverrides = pricingOverrides;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingCycleAnchor billingCycleAnchor;

    private BillingSettings billingSettings;

    private String contractNumber;

    private String currency;

    private Map<String, Object> extraParams;

    private List<ContractCreateParams.Include> include;

    private Map<String, String> metadata;

    private List<ContractCreateParams.PricingLine> pricingLines;

    private List<ContractCreateParams.PricingOverride> pricingOverrides;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractCreateParams build() {
      return new ContractCreateParams(
          this.billingCycleAnchor,
          this.billingSettings,
          this.contractNumber,
          this.currency,
          this.extraParams,
          this.include,
          this.metadata,
          this.pricingLines,
          this.pricingOverrides);
    }

    /**
     * The billing cycle anchor for the contract. If not provided, defaults to the pricing line
     * start time. It is only at the top-level of the contract with no option to override at the
     * pricing line level.
     */
    public Builder setBillingCycleAnchor(
        ContractCreateParams.BillingCycleAnchor billingCycleAnchor) {
      this.billingCycleAnchor = billingCycleAnchor;
      return this;
    }

    /** The billing settings for the contract. */
    public Builder setBillingSettings(ContractCreateParams.BillingSettings billingSettings) {
      this.billingSettings = billingSettings;
      return this;
    }

    /** <strong>Required.</strong> A unique user-provided contract number e.g. C-2026-0001. */
    public Builder setContractNumber(String contractNumber) {
      this.contractNumber = contractNumber;
      return this;
    }

    /** <strong>Required.</strong> Currency of the contract. */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractCreateParams#extraParams} for the field documentation.
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
     * See {@link ContractCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#include} for the field documentation.
     */
    public Builder addInclude(ContractCreateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<ContractCreateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractCreateParams#metadata} for the field documentation.
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
     * See {@link ContractCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Add an element to `pricingLines` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#pricingLines} for the field documentation.
     */
    public Builder addPricingLine(ContractCreateParams.PricingLine element) {
      if (this.pricingLines == null) {
        this.pricingLines = new ArrayList<>();
      }
      this.pricingLines.add(element);
      return this;
    }

    /**
     * Add all elements to `pricingLines` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#pricingLines} for the field documentation.
     */
    public Builder addAllPricingLine(List<ContractCreateParams.PricingLine> elements) {
      if (this.pricingLines == null) {
        this.pricingLines = new ArrayList<>();
      }
      this.pricingLines.addAll(elements);
      return this;
    }

    /**
     * Add an element to `pricingOverrides` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#pricingOverrides} for the field documentation.
     */
    public Builder addPricingOverride(ContractCreateParams.PricingOverride element) {
      if (this.pricingOverrides == null) {
        this.pricingOverrides = new ArrayList<>();
      }
      this.pricingOverrides.add(element);
      return this;
    }

    /**
     * Add all elements to `pricingOverrides` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#pricingOverrides} for the field documentation.
     */
    public Builder addAllPricingOverride(List<ContractCreateParams.PricingOverride> elements) {
      if (this.pricingOverrides == null) {
        this.pricingOverrides = new ArrayList<>();
      }
      this.pricingOverrides.addAll(elements);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingCycleAnchor {
    /** Configuration for determining the billing cycle anchor by calendar fields. */
    @SerializedName("config")
    Config config;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A specific timestamp to use as the billing cycle anchor. */
    @SerializedName("timestamp")
    Instant timestamp;

    /** <strong>Required.</strong> The type of billing cycle anchor. */
    @SerializedName("type")
    Type type;

    private BillingCycleAnchor(
        Config config, Map<String, Object> extraParams, Instant timestamp, Type type) {
      this.config = config;
      this.extraParams = extraParams;
      this.timestamp = timestamp;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Config config;

      private Map<String, Object> extraParams;

      private Instant timestamp;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.BillingCycleAnchor build() {
        return new ContractCreateParams.BillingCycleAnchor(
            this.config, this.extraParams, this.timestamp, this.type);
      }

      /** Configuration for determining the billing cycle anchor by calendar fields. */
      public Builder setConfig(ContractCreateParams.BillingCycleAnchor.Config config) {
        this.config = config;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.BillingCycleAnchor#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.BillingCycleAnchor#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A specific timestamp to use as the billing cycle anchor. */
      public Builder setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
      }

      /** <strong>Required.</strong> The type of billing cycle anchor. */
      public Builder setType(ContractCreateParams.BillingCycleAnchor.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Config {
      /** <strong>Required.</strong> Day of month (1-31). */
      @SerializedName("day_of_month")
      Long dayOfMonth;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Hour of day in UTC (0-23). */
      @SerializedName("hour")
      Long hour;

      /** Minute of hour (0-59). */
      @SerializedName("minute")
      Long minute;

      /** Month of year (1-12). */
      @SerializedName("month_of_year")
      Long monthOfYear;

      /** Second of minute (0-59). */
      @SerializedName("second")
      Long second;

      private Config(
          Long dayOfMonth,
          Map<String, Object> extraParams,
          Long hour,
          Long minute,
          Long monthOfYear,
          Long second) {
        this.dayOfMonth = dayOfMonth;
        this.extraParams = extraParams;
        this.hour = hour;
        this.minute = minute;
        this.monthOfYear = monthOfYear;
        this.second = second;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long dayOfMonth;

        private Map<String, Object> extraParams;

        private Long hour;

        private Long minute;

        private Long monthOfYear;

        private Long second;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.BillingCycleAnchor.Config build() {
          return new ContractCreateParams.BillingCycleAnchor.Config(
              this.dayOfMonth,
              this.extraParams,
              this.hour,
              this.minute,
              this.monthOfYear,
              this.second);
        }

        /** <strong>Required.</strong> Day of month (1-31). */
        public Builder setDayOfMonth(Long dayOfMonth) {
          this.dayOfMonth = dayOfMonth;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.BillingCycleAnchor.Config#extraParams} for the field
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
         * map. See {@link ContractCreateParams.BillingCycleAnchor.Config#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Hour of day in UTC (0-23). */
        public Builder setHour(Long hour) {
          this.hour = hour;
          return this;
        }

        /** Minute of hour (0-59). */
        public Builder setMinute(Long minute) {
          this.minute = minute;
          return this;
        }

        /** Month of year (1-12). */
        public Builder setMonthOfYear(Long monthOfYear) {
          this.monthOfYear = monthOfYear;
          return this;
        }

        /** Second of minute (0-59). */
        public Builder setSecond(Long second) {
          this.second = second;
          return this;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("config")
      CONFIG("config"),

      @SerializedName("timestamp")
      TIMESTAMP("timestamp");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingSettings {
    /** The bill settings details configures invoice and tax settings for the contract. */
    @SerializedName("bill_settings_details")
    BillSettingsDetails billSettingsDetails;

    /**
     * <strong>Required.</strong> The billing profile details configures who is charged for the
     * contract.
     */
    @SerializedName("billing_profile_details")
    BillingProfileDetails billingProfileDetails;

    /**
     * <strong>Required.</strong> The collection settings details configures how payments are
     * collected on the contract.
     */
    @SerializedName("collection_settings_details")
    CollectionSettingsDetails collectionSettingsDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private BillingSettings(
        BillSettingsDetails billSettingsDetails,
        BillingProfileDetails billingProfileDetails,
        CollectionSettingsDetails collectionSettingsDetails,
        Map<String, Object> extraParams) {
      this.billSettingsDetails = billSettingsDetails;
      this.billingProfileDetails = billingProfileDetails;
      this.collectionSettingsDetails = collectionSettingsDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillSettingsDetails billSettingsDetails;

      private BillingProfileDetails billingProfileDetails;

      private CollectionSettingsDetails collectionSettingsDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.BillingSettings build() {
        return new ContractCreateParams.BillingSettings(
            this.billSettingsDetails,
            this.billingProfileDetails,
            this.collectionSettingsDetails,
            this.extraParams);
      }

      /** The bill settings details configures invoice and tax settings for the contract. */
      public Builder setBillSettingsDetails(
          ContractCreateParams.BillingSettings.BillSettingsDetails billSettingsDetails) {
        this.billSettingsDetails = billSettingsDetails;
        return this;
      }

      /**
       * <strong>Required.</strong> The billing profile details configures who is charged for the
       * contract.
       */
      public Builder setBillingProfileDetails(
          ContractCreateParams.BillingSettings.BillingProfileDetails billingProfileDetails) {
        this.billingProfileDetails = billingProfileDetails;
        return this;
      }

      /**
       * <strong>Required.</strong> The collection settings details configures how payments are
       * collected on the contract.
       */
      public Builder setCollectionSettingsDetails(
          ContractCreateParams.BillingSettings.CollectionSettingsDetails
              collectionSettingsDetails) {
        this.collectionSettingsDetails = collectionSettingsDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.BillingSettings#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.BillingSettings#extraParams} for the field documentation.
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
    @EqualsAndHashCode(callSuper = false)
    public static class BillSettingsDetails {
      /** Calculation settings. */
      @SerializedName("calculation")
      Calculation calculation;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Invoice settings. */
      @SerializedName("invoice")
      Invoice invoice;

      private BillSettingsDetails(
          Calculation calculation, Map<String, Object> extraParams, Invoice invoice) {
        this.calculation = calculation;
        this.extraParams = extraParams;
        this.invoice = invoice;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Calculation calculation;

        private Map<String, Object> extraParams;

        private Invoice invoice;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.BillingSettings.BillSettingsDetails build() {
          return new ContractCreateParams.BillingSettings.BillSettingsDetails(
              this.calculation, this.extraParams, this.invoice);
        }

        /** Calculation settings. */
        public Builder setCalculation(
            ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation calculation) {
          this.calculation = calculation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.BillingSettings.BillSettingsDetails#extraParams} for
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
         * map. See {@link ContractCreateParams.BillingSettings.BillSettingsDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Invoice settings. */
        public Builder setInvoice(
            ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice invoice) {
          this.invoice = invoice;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Calculation {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Tax calculation settings. */
        @SerializedName("tax")
        Tax tax;

        private Calculation(Map<String, Object> extraParams, Tax tax) {
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
          public ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation build() {
            return new ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation(
                this.extraParams, this.tax);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation#extraParams} for
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
           * ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Tax calculation settings. */
          public Builder setTax(
              ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax tax) {
            this.tax = tax;
            return this;
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

          /** <strong>Required.</strong> The type of tax calculation. */
          @SerializedName("type")
          Type type;

          private Tax(Map<String, Object> extraParams, Type type) {
            this.extraParams = extraParams;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax
                build() {
              return new ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax(
                  this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax#extraParams}
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
             * ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The type of tax calculation. */
            public Builder setType(
                ContractCreateParams.BillingSettings.BillSettingsDetails.Calculation.Tax.Type
                    type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("manual")
            MANUAL("manual");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Invoice {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** How long the customer has to pay the invoice before it's past due. */
        @SerializedName("time_until_due")
        TimeUntilDue timeUntilDue;

        private Invoice(Map<String, Object> extraParams, TimeUntilDue timeUntilDue) {
          this.extraParams = extraParams;
          this.timeUntilDue = timeUntilDue;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private TimeUntilDue timeUntilDue;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice build() {
            return new ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice(
                this.extraParams, this.timeUntilDue);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice#extraParams} for the
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
           * ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** How long the customer has to pay the invoice before it's past due. */
          public Builder setTimeUntilDue(
              ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
                  timeUntilDue) {
            this.timeUntilDue = timeUntilDue;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class TimeUntilDue {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The interval unit. */
          @SerializedName("interval")
          Interval interval;

          /** <strong>Required.</strong> The number of intervals. */
          @SerializedName("interval_count")
          Long intervalCount;

          private TimeUntilDue(
              Map<String, Object> extraParams, Interval interval, Long intervalCount) {
            this.extraParams = extraParams;
            this.interval = interval;
            this.intervalCount = intervalCount;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Interval interval;

            private Long intervalCount;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
                build() {
              return new ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice
                  .TimeUntilDue(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
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
             * ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The interval unit. */
            public Builder setInterval(
                ContractCreateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
                        .Interval
                    interval) {
              this.interval = interval;
              return this;
            }

            /** <strong>Required.</strong> The number of intervals. */
            public Builder setIntervalCount(Long intervalCount) {
              this.intervalCount = intervalCount;
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
    public static class BillingProfileDetails {
      /** <strong>Required.</strong> The customer who pays for the contract invoice. */
      @SerializedName("customer")
      String customer;

      /** The default payment method for the contract. */
      @SerializedName("default_payment_method")
      String defaultPaymentMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BillingProfileDetails(
          String customer, String defaultPaymentMethod, Map<String, Object> extraParams) {
        this.customer = customer;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String customer;

        private String defaultPaymentMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.BillingSettings.BillingProfileDetails build() {
          return new ContractCreateParams.BillingSettings.BillingProfileDetails(
              this.customer, this.defaultPaymentMethod, this.extraParams);
        }

        /** <strong>Required.</strong> The customer who pays for the contract invoice. */
        public Builder setCustomer(String customer) {
          this.customer = customer;
          return this;
        }

        /** The default payment method for the contract. */
        public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
          this.defaultPaymentMethod = defaultPaymentMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.BillingSettings.BillingProfileDetails#extraParams}
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
         * map. See {@link ContractCreateParams.BillingSettings.BillingProfileDetails#extraParams}
         * for the field documentation.
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
    public static class CollectionSettingsDetails {
      /** <strong>Required.</strong> How payment is collected for the contract. */
      @SerializedName("collection_method")
      CollectionMethod collectionMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The payment method configuration. */
      @SerializedName("payment_method_configuration")
      String paymentMethodConfiguration;

      private CollectionSettingsDetails(
          CollectionMethod collectionMethod,
          Map<String, Object> extraParams,
          String paymentMethodConfiguration) {
        this.collectionMethod = collectionMethod;
        this.extraParams = extraParams;
        this.paymentMethodConfiguration = paymentMethodConfiguration;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectionMethod collectionMethod;

        private Map<String, Object> extraParams;

        private String paymentMethodConfiguration;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.BillingSettings.CollectionSettingsDetails build() {
          return new ContractCreateParams.BillingSettings.CollectionSettingsDetails(
              this.collectionMethod, this.extraParams, this.paymentMethodConfiguration);
        }

        /** <strong>Required.</strong> How payment is collected for the contract. */
        public Builder setCollectionMethod(
            ContractCreateParams.BillingSettings.CollectionSettingsDetails.CollectionMethod
                collectionMethod) {
          this.collectionMethod = collectionMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ContractCreateParams.BillingSettings.CollectionSettingsDetails#extraParams} for the field
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
         * ContractCreateParams.BillingSettings.CollectionSettingsDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The payment method configuration. */
        public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
          this.paymentMethodConfiguration = paymentMethodConfiguration;
          return this;
        }
      }

      public enum CollectionMethod implements ApiRequestParams.EnumParam {
        @SerializedName("charge_automatically")
        CHARGE_AUTOMATICALLY("charge_automatically"),

        @SerializedName("send_invoice")
        SEND_INVOICE("send_invoice");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CollectionMethod(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingLine {
    /** <strong>Required.</strong> When the pricing line ends. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A user-provided lookup key to reference this pricing line. */
    @SerializedName("lookup_key")
    String lookupKey;

    /** Set of key-value pairs that you can attach to an object. */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** <strong>Required.</strong> The pricing configuration for the pricing line. */
    @SerializedName("pricing")
    Pricing pricing;

    /** <strong>Required.</strong> When the pricing line starts. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    private PricingLine(
        EndsAt endsAt,
        Map<String, Object> extraParams,
        String lookupKey,
        Map<String, String> metadata,
        Pricing pricing,
        StartsAt startsAt) {
      this.endsAt = endsAt;
      this.extraParams = extraParams;
      this.lookupKey = lookupKey;
      this.metadata = metadata;
      this.pricing = pricing;
      this.startsAt = startsAt;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private EndsAt endsAt;

      private Map<String, Object> extraParams;

      private String lookupKey;

      private Map<String, String> metadata;

      private Pricing pricing;

      private StartsAt startsAt;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.PricingLine build() {
        return new ContractCreateParams.PricingLine(
            this.endsAt,
            this.extraParams,
            this.lookupKey,
            this.metadata,
            this.pricing,
            this.startsAt);
      }

      /** <strong>Required.</strong> When the pricing line ends. */
      public Builder setEndsAt(ContractCreateParams.PricingLine.EndsAt endsAt) {
        this.endsAt = endsAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.PricingLine#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.PricingLine#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A user-provided lookup key to reference this pricing line. */
      public Builder setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.PricingLine#metadata} for the field documentation.
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
       * See {@link ContractCreateParams.PricingLine#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The pricing configuration for the pricing line. */
      public Builder setPricing(ContractCreateParams.PricingLine.Pricing pricing) {
        this.pricing = pricing;
        return this;
      }

      /** <strong>Required.</strong> When the pricing line starts. */
      public Builder setStartsAt(ContractCreateParams.PricingLine.StartsAt startsAt) {
        this.startsAt = startsAt;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EndsAt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp when the item ends. Required if {@code type} is {@code timestamp}. */
      @SerializedName("timestamp")
      Instant timestamp;

      /** <strong>Required.</strong> The type of the ends_at. */
      @SerializedName("type")
      Type type;

      private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Instant timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingLine.EndsAt build() {
          return new ContractCreateParams.PricingLine.EndsAt(
              this.extraParams, this.timestamp, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingLine.EndsAt#extraParams} for the field
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
         * map. See {@link ContractCreateParams.PricingLine.EndsAt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp when the item ends. Required if {@code type} is {@code timestamp}. */
        public Builder setTimestamp(Instant timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> The type of the ends_at. */
        public Builder setType(ContractCreateParams.PricingLine.EndsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Pricing {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** V1 price details. Required if {@code type} is {@code price}. */
      @SerializedName("price_details")
      PriceDetails priceDetails;

      /** <strong>Required.</strong> The type of pricing. */
      @SerializedName("type")
      Type type;

      private Pricing(Map<String, Object> extraParams, PriceDetails priceDetails, Type type) {
        this.extraParams = extraParams;
        this.priceDetails = priceDetails;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private PriceDetails priceDetails;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingLine.Pricing build() {
          return new ContractCreateParams.PricingLine.Pricing(
              this.extraParams, this.priceDetails, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingLine.Pricing#extraParams} for the field
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
         * map. See {@link ContractCreateParams.PricingLine.Pricing#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** V1 price details. Required if {@code type} is {@code price}. */
        public Builder setPriceDetails(
            ContractCreateParams.PricingLine.Pricing.PriceDetails priceDetails) {
          this.priceDetails = priceDetails;
          return this;
        }

        /** <strong>Required.</strong> The type of pricing. */
        public Builder setType(ContractCreateParams.PricingLine.Pricing.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PriceDetails {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The id of the price. */
        @SerializedName("price")
        String price;

        /** Pricing overrides embedded directly on this pricing line. */
        @SerializedName("pricing_overrides")
        List<ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride>
            pricingOverrides;

        /**
         * Quantity changes for the pricing line. For now, at most one entry is allowed. A quantity
         * change clears all future quantity changes on this pricing line. Defaults to 1.
         */
        @SerializedName("quantity_changes")
        List<ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange> quantityChanges;

        private PriceDetails(
            Map<String, Object> extraParams,
            String price,
            List<ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride>
                pricingOverrides,
            List<ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange>
                quantityChanges) {
          this.extraParams = extraParams;
          this.price = price;
          this.pricingOverrides = pricingOverrides;
          this.quantityChanges = quantityChanges;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String price;

          private List<ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride>
              pricingOverrides;

          private List<ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange>
              quantityChanges;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.PricingLine.Pricing.PriceDetails build() {
            return new ContractCreateParams.PricingLine.Pricing.PriceDetails(
                this.extraParams, this.price, this.pricingOverrides, this.quantityChanges);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#extraParams} for
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
           * map. See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The id of the price. */
          public Builder setPrice(String price) {
            this.price = price;
            return this;
          }

          /**
           * Add an element to `pricingOverrides` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#pricingOverrides} for
           * the field documentation.
           */
          public Builder addPricingOverride(
              ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride element) {
            if (this.pricingOverrides == null) {
              this.pricingOverrides = new ArrayList<>();
            }
            this.pricingOverrides.add(element);
            return this;
          }

          /**
           * Add all elements to `pricingOverrides` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#pricingOverrides} for
           * the field documentation.
           */
          public Builder addAllPricingOverride(
              List<ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride>
                  elements) {
            if (this.pricingOverrides == null) {
              this.pricingOverrides = new ArrayList<>();
            }
            this.pricingOverrides.addAll(elements);
            return this;
          }

          /**
           * Add an element to `quantityChanges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#quantityChanges} for
           * the field documentation.
           */
          public Builder addQuantityChange(
              ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange element) {
            if (this.quantityChanges == null) {
              this.quantityChanges = new ArrayList<>();
            }
            this.quantityChanges.add(element);
            return this;
          }

          /**
           * Add all elements to `quantityChanges` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingLine.Pricing.PriceDetails#quantityChanges} for
           * the field documentation.
           */
          public Builder addAllQuantityChange(
              List<ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange> elements) {
            if (this.quantityChanges == null) {
              this.quantityChanges = new ArrayList<>();
            }
            this.quantityChanges.addAll(elements);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PricingOverride {
          /** When the override ends. Defaults to the pricing line's end if not specified. */
          @SerializedName("ends_at")
          EndsAt endsAt;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** A user-provided lookup key to reference this override. */
          @SerializedName("lookup_key")
          String lookupKey;

          /** Set of key-value pairs that you can attach to an object. */
          @SerializedName("metadata")
          Map<String, String> metadata;

          /**
           * Parameters for the overwrite_price override. Required if {@code type} is {@code
           * overwrite_price}.
           */
          @SerializedName("overwrite_price")
          OverwritePrice overwritePrice;

          /**
           * The priority of this override relative to others. 0 is highest, 100 is lowest. Defaults
           * to 50.
           */
          @SerializedName("priority")
          Long priority;

          /** When the override starts. Defaults to the pricing line's start if not specified. */
          @SerializedName("starts_at")
          StartsAt startsAt;

          /** <strong>Required.</strong> The type of override. */
          @SerializedName("type")
          Type type;

          private PricingOverride(
              EndsAt endsAt,
              Map<String, Object> extraParams,
              String lookupKey,
              Map<String, String> metadata,
              OverwritePrice overwritePrice,
              Long priority,
              StartsAt startsAt,
              Type type) {
            this.endsAt = endsAt;
            this.extraParams = extraParams;
            this.lookupKey = lookupKey;
            this.metadata = metadata;
            this.overwritePrice = overwritePrice;
            this.priority = priority;
            this.startsAt = startsAt;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private EndsAt endsAt;

            private Map<String, Object> extraParams;

            private String lookupKey;

            private Map<String, String> metadata;

            private OverwritePrice overwritePrice;

            private Long priority;

            private StartsAt startsAt;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride build() {
              return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride(
                  this.endsAt,
                  this.extraParams,
                  this.lookupKey,
                  this.metadata,
                  this.overwritePrice,
                  this.priority,
                  this.startsAt,
                  this.type);
            }

            /** When the override ends. Defaults to the pricing line's end if not specified. */
            public Builder setEndsAt(
                ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.EndsAt
                    endsAt) {
              this.endsAt = endsAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride#extraParams}
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
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** A user-provided lookup key to reference this override. */
            public Builder setLookupKey(String lookupKey) {
              this.lookupKey = lookupKey;
              return this;
            }

            /**
             * Add a key/value pair to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride#metadata} for
             * the field documentation.
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
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride#metadata} for
             * the field documentation.
             */
            public Builder putAllMetadata(Map<String, String> map) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.putAll(map);
              return this;
            }

            /**
             * Parameters for the overwrite_price override. Required if {@code type} is {@code
             * overwrite_price}.
             */
            public Builder setOverwritePrice(
                ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice
                    overwritePrice) {
              this.overwritePrice = overwritePrice;
              return this;
            }

            /**
             * The priority of this override relative to others. 0 is highest, 100 is lowest.
             * Defaults to 50.
             */
            public Builder setPriority(Long priority) {
              this.priority = priority;
              return this;
            }

            /** When the override starts. Defaults to the pricing line's start if not specified. */
            public Builder setStartsAt(
                ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.StartsAt
                    startsAt) {
              this.startsAt = startsAt;
              return this;
            }

            /** <strong>Required.</strong> The type of override. */
            public Builder setType(
                ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class EndsAt {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** The timestamp when the item ends. Required if {@code type} is {@code timestamp}. */
            @SerializedName("timestamp")
            Instant timestamp;

            /** <strong>Required.</strong> The type of the ends_at. */
            @SerializedName("type")
            Type type;

            private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Instant timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.EndsAt
                  build() {
                return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                    .EndsAt(this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.EndsAt#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.EndsAt#extraParams}
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
               * The timestamp when the item ends. Required if {@code type} is {@code timestamp}.
               */
              public Builder setTimestamp(Instant timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /** <strong>Required.</strong> The type of the ends_at. */
              public Builder setType(
                  ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.EndsAt.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class OverwritePrice {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * The per-unit amount to be charged, represented as a decimal string in minor currency
             * units.
             */
            @SerializedName("unit_amount")
            String unitAmount;

            private OverwritePrice(Map<String, Object> extraParams, String unitAmount) {
              this.extraParams = extraParams;
              this.unitAmount = unitAmount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String unitAmount;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                      .OverwritePrice
                  build() {
                return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                    .OverwritePrice(this.extraParams, this.unitAmount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice#extraParams}
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
               * The per-unit amount to be charged, represented as a decimal string in minor
               * currency units.
               */
              public Builder setUnitAmount(String unitAmount) {
                this.unitAmount = unitAmount;
                return this;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class StartsAt {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
             */
            @SerializedName("timestamp")
            Instant timestamp;

            /** <strong>Required.</strong> The type of the starts_at. */
            @SerializedName("type")
            Type type;

            private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Instant timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.StartsAt
                  build() {
                return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                    .StartsAt(this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.StartsAt#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.StartsAt#extraParams}
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
               * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
               */
              public Builder setTimestamp(Instant timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /** <strong>Required.</strong> The type of the starts_at. */
              public Builder setType(
                  ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.StartsAt
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("overwrite_price")
            OVERWRITE_PRICE("overwrite_price");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class QuantityChange {
          /** <strong>Required.</strong> When this quantity change takes effect. */
          @SerializedName("effective_at")
          EffectiveAt effectiveAt;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The quantity to set. */
          @SerializedName("set")
          BigDecimal set;

          private QuantityChange(
              EffectiveAt effectiveAt, Map<String, Object> extraParams, BigDecimal set) {
            this.effectiveAt = effectiveAt;
            this.extraParams = extraParams;
            this.set = set;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private EffectiveAt effectiveAt;

            private Map<String, Object> extraParams;

            private BigDecimal set;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange build() {
              return new ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange(
                  this.effectiveAt, this.extraParams, this.set);
            }

            /** <strong>Required.</strong> When this quantity change takes effect. */
            public Builder setEffectiveAt(
                ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange.EffectiveAt
                    effectiveAt) {
              this.effectiveAt = effectiveAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange#extraParams} for
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
             * ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The quantity to set. */
            public Builder setSet(BigDecimal set) {
              this.set = set;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class EffectiveAt {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** The timestamp for the effective at. */
            @SerializedName("timestamp")
            Instant timestamp;

            /** <strong>Required.</strong> The type of the effective at. */
            @SerializedName("type")
            Type type;

            private EffectiveAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
              this.extraParams = extraParams;
              this.timestamp = timestamp;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Instant timestamp;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange
                      .EffectiveAt
                  build() {
                return new ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange
                    .EffectiveAt(this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
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
               * Add all map key/value pairs to `extraParams` map. A map is initialized for the
               * first `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange.EffectiveAt#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** The timestamp for the effective at. */
              public Builder setTimestamp(Instant timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /** <strong>Required.</strong> The type of the effective at. */
              public Builder setType(
                  ContractCreateParams.PricingLine.Pricing.PriceDetails.QuantityChange.EffectiveAt
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("timestamp")
              TIMESTAMP("timestamp");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("price")
        PRICE("price");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp when the item starts. Required if {@code type} is {@code timestamp}. */
      @SerializedName("timestamp")
      Instant timestamp;

      /** <strong>Required.</strong> The type of the starts_at. */
      @SerializedName("type")
      Type type;

      private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Instant timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingLine.StartsAt build() {
          return new ContractCreateParams.PricingLine.StartsAt(
              this.extraParams, this.timestamp, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingLine.StartsAt#extraParams} for the field
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
         * map. See {@link ContractCreateParams.PricingLine.StartsAt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp when the item starts. Required if {@code type} is {@code timestamp}. */
        public Builder setTimestamp(Instant timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> The type of the starts_at. */
        public Builder setType(ContractCreateParams.PricingLine.StartsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class PricingOverride {
    /** <strong>Required.</strong> When the pricing override ends. */
    @SerializedName("ends_at")
    EndsAt endsAt;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** A user-provided lookup key to reference this pricing override. */
    @SerializedName("lookup_key")
    String lookupKey;

    /**
     * Parameters for a multiply_pricing override. Required if {@code type} is {@code
     * multiply_pricing}.
     */
    @SerializedName("multiply_pricing")
    MultiplyPricing multiplyPricing;

    /**
     * The priority of this override relative to others. The highest priority is 0 and the lowest is
     * 100.
     */
    @SerializedName("priority")
    Long priority;

    /** <strong>Required.</strong> When the pricing override starts. */
    @SerializedName("starts_at")
    StartsAt startsAt;

    /** <strong>Required.</strong> The type of pricing override. */
    @SerializedName("type")
    Type type;

    private PricingOverride(
        EndsAt endsAt,
        Map<String, Object> extraParams,
        String lookupKey,
        MultiplyPricing multiplyPricing,
        Long priority,
        StartsAt startsAt,
        Type type) {
      this.endsAt = endsAt;
      this.extraParams = extraParams;
      this.lookupKey = lookupKey;
      this.multiplyPricing = multiplyPricing;
      this.priority = priority;
      this.startsAt = startsAt;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private EndsAt endsAt;

      private Map<String, Object> extraParams;

      private String lookupKey;

      private MultiplyPricing multiplyPricing;

      private Long priority;

      private StartsAt startsAt;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.PricingOverride build() {
        return new ContractCreateParams.PricingOverride(
            this.endsAt,
            this.extraParams,
            this.lookupKey,
            this.multiplyPricing,
            this.priority,
            this.startsAt,
            this.type);
      }

      /** <strong>Required.</strong> When the pricing override ends. */
      public Builder setEndsAt(ContractCreateParams.PricingOverride.EndsAt endsAt) {
        this.endsAt = endsAt;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.PricingOverride#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.PricingOverride#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** A user-provided lookup key to reference this pricing override. */
      public Builder setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
      }

      /**
       * Parameters for a multiply_pricing override. Required if {@code type} is {@code
       * multiply_pricing}.
       */
      public Builder setMultiplyPricing(
          ContractCreateParams.PricingOverride.MultiplyPricing multiplyPricing) {
        this.multiplyPricing = multiplyPricing;
        return this;
      }

      /**
       * The priority of this override relative to others. The highest priority is 0 and the lowest
       * is 100.
       */
      public Builder setPriority(Long priority) {
        this.priority = priority;
        return this;
      }

      /** <strong>Required.</strong> When the pricing override starts. */
      public Builder setStartsAt(ContractCreateParams.PricingOverride.StartsAt startsAt) {
        this.startsAt = startsAt;
        return this;
      }

      /** <strong>Required.</strong> The type of pricing override. */
      public Builder setType(ContractCreateParams.PricingOverride.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class EndsAt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp when the item ends. Required if {@code type} is {@code timestamp}. */
      @SerializedName("timestamp")
      Instant timestamp;

      /** <strong>Required.</strong> The type of the ends_at. */
      @SerializedName("type")
      Type type;

      private EndsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Instant timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingOverride.EndsAt build() {
          return new ContractCreateParams.PricingOverride.EndsAt(
              this.extraParams, this.timestamp, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingOverride.EndsAt#extraParams} for the field
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
         * map. See {@link ContractCreateParams.PricingOverride.EndsAt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp when the item ends. Required if {@code type} is {@code timestamp}. */
        public Builder setTimestamp(Instant timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> The type of the ends_at. */
        public Builder setType(ContractCreateParams.PricingOverride.EndsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class MultiplyPricing {
      /** Criteria determining which rates the multiply_pricing override applies to. */
      @SerializedName("criteria")
      List<ContractCreateParams.PricingOverride.MultiplyPricing.Criterion> criteria;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The multiply_pricing factor, represented as a decimal string.
       * e.g. &quot;0.8&quot; for a 20% reduction.
       */
      @SerializedName("factor")
      String factor;

      private MultiplyPricing(
          List<ContractCreateParams.PricingOverride.MultiplyPricing.Criterion> criteria,
          Map<String, Object> extraParams,
          String factor) {
        this.criteria = criteria;
        this.extraParams = extraParams;
        this.factor = factor;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<ContractCreateParams.PricingOverride.MultiplyPricing.Criterion> criteria;

        private Map<String, Object> extraParams;

        private String factor;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingOverride.MultiplyPricing build() {
          return new ContractCreateParams.PricingOverride.MultiplyPricing(
              this.criteria, this.extraParams, this.factor);
        }

        /**
         * Add an element to `criteria` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.PricingOverride.MultiplyPricing#criteria} for the field
         * documentation.
         */
        public Builder addCriterion(
            ContractCreateParams.PricingOverride.MultiplyPricing.Criterion element) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.add(element);
          return this;
        }

        /**
         * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.PricingOverride.MultiplyPricing#criteria} for the field
         * documentation.
         */
        public Builder addAllCriterion(
            List<ContractCreateParams.PricingOverride.MultiplyPricing.Criterion> elements) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingOverride.MultiplyPricing#extraParams} for the
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
         * map. See {@link ContractCreateParams.PricingOverride.MultiplyPricing#extraParams} for the
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
         * <strong>Required.</strong> The multiply_pricing factor, represented as a decimal string.
         * e.g. &quot;0.8&quot; for a 20% reduction.
         */
        public Builder setFactor(String factor) {
          this.factor = factor;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Criterion {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Filter by pricing line IDs. */
        @SerializedName("pricing_line_ids")
        List<String> pricingLineIds;

        /** Filter by pricing line lookup keys. */
        @SerializedName("pricing_line_lookup_keys")
        List<String> pricingLineLookupKeys;

        /**
         * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
         */
        @SerializedName("type")
        Type type;

        private Criterion(
            Map<String, Object> extraParams,
            List<String> pricingLineIds,
            List<String> pricingLineLookupKeys,
            Type type) {
          this.extraParams = extraParams;
          this.pricingLineIds = pricingLineIds;
          this.pricingLineLookupKeys = pricingLineLookupKeys;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<String> pricingLineIds;

          private List<String> pricingLineLookupKeys;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.PricingOverride.MultiplyPricing.Criterion build() {
            return new ContractCreateParams.PricingOverride.MultiplyPricing.Criterion(
                this.extraParams, this.pricingLineIds, this.pricingLineLookupKeys, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#extraParams} for the
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
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#extraParams} for the
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
           * Add an element to `pricingLineIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#pricingLineIds} for the
           * field documentation.
           */
          public Builder addPricingLineId(String element) {
            if (this.pricingLineIds == null) {
              this.pricingLineIds = new ArrayList<>();
            }
            this.pricingLineIds.add(element);
            return this;
          }

          /**
           * Add all elements to `pricingLineIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#pricingLineIds} for the
           * field documentation.
           */
          public Builder addAllPricingLineId(List<String> elements) {
            if (this.pricingLineIds == null) {
              this.pricingLineIds = new ArrayList<>();
            }
            this.pricingLineIds.addAll(elements);
            return this;
          }

          /**
           * Add an element to `pricingLineLookupKeys` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#pricingLineLookupKeys}
           * for the field documentation.
           */
          public Builder addPricingLineLookupKey(String element) {
            if (this.pricingLineLookupKeys == null) {
              this.pricingLineLookupKeys = new ArrayList<>();
            }
            this.pricingLineLookupKeys.add(element);
            return this;
          }

          /**
           * Add all elements to `pricingLineLookupKeys` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.MultiplyPricing.Criterion#pricingLineLookupKeys}
           * for the field documentation.
           */
          public Builder addAllPricingLineLookupKey(List<String> elements) {
            if (this.pricingLineLookupKeys == null) {
              this.pricingLineLookupKeys = new ArrayList<>();
            }
            this.pricingLineLookupKeys.addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
           */
          public Builder setType(
              ContractCreateParams.PricingOverride.MultiplyPricing.Criterion.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("exclude")
          EXCLUDE("exclude"),

          @SerializedName("include")
          INCLUDE("include");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class StartsAt {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The timestamp when the item starts. Required if {@code type} is {@code timestamp}. */
      @SerializedName("timestamp")
      Instant timestamp;

      /** <strong>Required.</strong> The type of the starts_at. */
      @SerializedName("type")
      Type type;

      private StartsAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
        this.extraParams = extraParams;
        this.timestamp = timestamp;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Instant timestamp;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingOverride.StartsAt build() {
          return new ContractCreateParams.PricingOverride.StartsAt(
              this.extraParams, this.timestamp, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingOverride.StartsAt#extraParams} for the field
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
         * map. See {@link ContractCreateParams.PricingOverride.StartsAt#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The timestamp when the item starts. Required if {@code type} is {@code timestamp}. */
        public Builder setTimestamp(Instant timestamp) {
          this.timestamp = timestamp;
          return this;
        }

        /** <strong>Required.</strong> The type of the starts_at. */
        public Builder setType(ContractCreateParams.PricingOverride.StartsAt.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("timestamp")
        TIMESTAMP("timestamp");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("multiply_pricing")
      MULTIPLY_PRICING("multiply_pricing");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("billing_settings")
    BILLING_SETTINGS("billing_settings"),

    @SerializedName("one_time_fees")
    ONE_TIME_FEES("one_time_fees"),

    @SerializedName("pricing_lines")
    PRICING_LINES("pricing_lines"),

    @SerializedName("pricing_overrides")
    PRICING_OVERRIDES("pricing_overrides");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
