// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.stripe.model.StringInt64TypeAdapter;
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

  /**
   * <strong>Required.</strong> A unique user-provided contract number e.g. C-2026-0001. Maximum
   * length of 200 characters.
   */
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

  /** Terms to create with the contract. */
  @SerializedName("terms")
  List<ContractCreateParams.Term> terms;

  private ContractCreateParams(
      BillingCycleAnchor billingCycleAnchor,
      BillingSettings billingSettings,
      String contractNumber,
      String currency,
      Map<String, Object> extraParams,
      List<ContractCreateParams.Include> include,
      Map<String, String> metadata,
      List<ContractCreateParams.Term> terms) {
    this.billingCycleAnchor = billingCycleAnchor;
    this.billingSettings = billingSettings;
    this.contractNumber = contractNumber;
    this.currency = currency;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.terms = terms;
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

    private List<ContractCreateParams.Term> terms;

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
          this.terms);
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

    /**
     * <strong>Required.</strong> A unique user-provided contract number e.g. C-2026-0001. Maximum
     * length of 200 characters.
     */
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
     * Add an element to `terms` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#terms} for the field documentation.
     */
    public Builder addTerm(ContractCreateParams.Term element) {
      if (this.terms == null) {
        this.terms = new ArrayList<>();
      }
      this.terms.add(element);
      return this;
    }

    /**
     * Add all elements to `terms` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#terms} for the field documentation.
     */
    public Builder addAllTerm(List<ContractCreateParams.Term> elements) {
      if (this.terms == null) {
        this.terms = new ArrayList<>();
      }
      this.terms.addAll(elements);
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
  public static class Term {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Lookup key unique across all term types on the contract. */
    @SerializedName("lookup_key")
    String lookupKey;

    /** Set of key-value pairs attached to the term. */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /** Required when type is pricing_override. */
    @SerializedName("pricing_override")
    PricingOverride pricingOverride;

    /** Required when type is recurring_price. */
    @SerializedName("recurring_price")
    RecurringPrice recurringPrice;

    /** Required when type is scheduled_fee. */
    @SerializedName("scheduled_fee")
    ScheduledFee scheduledFee;

    /**
     * <strong>Required.</strong> The term type. Production types require exactly one matching
     * payload.
     */
    @SerializedName("type")
    Type type;

    private Term(
        Map<String, Object> extraParams,
        String lookupKey,
        Map<String, String> metadata,
        PricingOverride pricingOverride,
        RecurringPrice recurringPrice,
        ScheduledFee scheduledFee,
        Type type) {
      this.extraParams = extraParams;
      this.lookupKey = lookupKey;
      this.metadata = metadata;
      this.pricingOverride = pricingOverride;
      this.recurringPrice = recurringPrice;
      this.scheduledFee = scheduledFee;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String lookupKey;

      private Map<String, String> metadata;

      private PricingOverride pricingOverride;

      private RecurringPrice recurringPrice;

      private ScheduledFee scheduledFee;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.Term build() {
        return new ContractCreateParams.Term(
            this.extraParams,
            this.lookupKey,
            this.metadata,
            this.pricingOverride,
            this.recurringPrice,
            this.scheduledFee,
            this.type);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.Term#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.Term#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Lookup key unique across all term types on the contract. */
      public Builder setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
      }

      /**
       * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.Term#metadata} for the field documentation.
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
       * See {@link ContractCreateParams.Term#metadata} for the field documentation.
       */
      public Builder putAllMetadata(Map<String, String> map) {
        if (this.metadata == null) {
          this.metadata = new HashMap<>();
        }
        this.metadata.putAll(map);
        return this;
      }

      /** Required when type is pricing_override. */
      public Builder setPricingOverride(ContractCreateParams.Term.PricingOverride pricingOverride) {
        this.pricingOverride = pricingOverride;
        return this;
      }

      /** Required when type is recurring_price. */
      public Builder setRecurringPrice(ContractCreateParams.Term.RecurringPrice recurringPrice) {
        this.recurringPrice = recurringPrice;
        return this;
      }

      /** Required when type is scheduled_fee. */
      public Builder setScheduledFee(ContractCreateParams.Term.ScheduledFee scheduledFee) {
        this.scheduledFee = scheduledFee;
        return this;
      }

      /**
       * <strong>Required.</strong> The term type. Production types require exactly one matching
       * payload.
       */
      public Builder setType(ContractCreateParams.Term.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class PricingOverride {
      /**
       * Optional criteria selecting recurring or scheduled_fee terms. If omitted, the override
       * applies to all recurring and scheduled_fee terms.
       */
      @SerializedName("criteria")
      List<ContractCreateParams.Term.PricingOverride.Criterion> criteria;

      /** The exclusive end. Omitted means open-ended. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Required when type is multiply. */
      @SerializedName("multiply")
      Multiply multiply;

      /** Required when type is overwrite. */
      @SerializedName("overwrite")
      Overwrite overwrite;

      /** Lower numbers win; defaults to 50. */
      @SerializedName("priority")
      Long priority;

      /** <strong>Required.</strong> The inclusive start of the validity window. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      /**
       * <strong>Required.</strong> The pricing operation. Exactly one matching pricing payload is
       * required.
       */
      @SerializedName("type")
      Type type;

      private PricingOverride(
          List<ContractCreateParams.Term.PricingOverride.Criterion> criteria,
          EndsAt endsAt,
          Map<String, Object> extraParams,
          Multiply multiply,
          Overwrite overwrite,
          Long priority,
          StartsAt startsAt,
          Type type) {
        this.criteria = criteria;
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.multiply = multiply;
        this.overwrite = overwrite;
        this.priority = priority;
        this.startsAt = startsAt;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<ContractCreateParams.Term.PricingOverride.Criterion> criteria;

        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private Multiply multiply;

        private Overwrite overwrite;

        private Long priority;

        private StartsAt startsAt;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.Term.PricingOverride build() {
          return new ContractCreateParams.Term.PricingOverride(
              this.criteria,
              this.endsAt,
              this.extraParams,
              this.multiply,
              this.overwrite,
              this.priority,
              this.startsAt,
              this.type);
        }

        /**
         * Add an element to `criteria` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.Term.PricingOverride#criteria} for the field documentation.
         */
        public Builder addCriterion(ContractCreateParams.Term.PricingOverride.Criterion element) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.add(element);
          return this;
        }

        /**
         * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.Term.PricingOverride#criteria} for the field documentation.
         */
        public Builder addAllCriterion(
            List<ContractCreateParams.Term.PricingOverride.Criterion> elements) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.addAll(elements);
          return this;
        }

        /** The exclusive end. Omitted means open-ended. */
        public Builder setEndsAt(ContractCreateParams.Term.PricingOverride.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.Term.PricingOverride#extraParams} for the field
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
         * map. See {@link ContractCreateParams.Term.PricingOverride#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Required when type is multiply. */
        public Builder setMultiply(ContractCreateParams.Term.PricingOverride.Multiply multiply) {
          this.multiply = multiply;
          return this;
        }

        /** Required when type is overwrite. */
        public Builder setOverwrite(ContractCreateParams.Term.PricingOverride.Overwrite overwrite) {
          this.overwrite = overwrite;
          return this;
        }

        /** Lower numbers win; defaults to 50. */
        public Builder setPriority(Long priority) {
          this.priority = priority;
          return this;
        }

        /** <strong>Required.</strong> The inclusive start of the validity window. */
        public Builder setStartsAt(ContractCreateParams.Term.PricingOverride.StartsAt startsAt) {
          this.startsAt = startsAt;
          return this;
        }

        /**
         * <strong>Required.</strong> The pricing operation. Exactly one matching pricing payload is
         * required.
         */
        public Builder setType(ContractCreateParams.Term.PricingOverride.Type type) {
          this.type = type;
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

        /**
         * Term selectors. Each ID or lookup key resolves to one fixed term ID. Omitted or empty
         * selects all charge-bearing terms. Override terms cannot be targets.
         */
        @SerializedName("terms")
        List<ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm> terms;

        /**
         * <strong>Required.</strong> Whether to include or exclude the selected recurring or
         * scheduled_fee terms.
         */
        @SerializedName("type")
        Type type;

        private Criterion(
            Map<String, Object> extraParams,
            List<ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm> terms,
            Type type) {
          this.extraParams = extraParams;
          this.terms = terms;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private List<ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm> terms;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.Term.PricingOverride.Criterion build() {
            return new ContractCreateParams.Term.PricingOverride.Criterion(
                this.extraParams, this.terms, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.PricingOverride.Criterion#extraParams} for
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
           * map. See {@link ContractCreateParams.Term.PricingOverride.Criterion#extraParams} for
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
           * Add an element to `terms` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.PricingOverride.Criterion#terms} for the field documentation.
           */
          public Builder addTerm(
              ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm element) {
            if (this.terms == null) {
              this.terms = new ArrayList<>();
            }
            this.terms.add(element);
            return this;
          }

          /**
           * Add all elements to `terms` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.PricingOverride.Criterion#terms} for the field documentation.
           */
          public Builder addAllTerm(
              List<ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm> elements) {
            if (this.terms == null) {
              this.terms = new ArrayList<>();
            }
            this.terms.addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> Whether to include or exclude the selected recurring or
           * scheduled_fee terms.
           */
          public Builder setType(ContractCreateParams.Term.PricingOverride.Criterion.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class InnerTerm {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Select this term by its stable ID. */
          @SerializedName("id")
          String id;

          /** Select this term by its unique lookup key. */
          @SerializedName("lookup_key")
          String lookupKey;

          /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
          @SerializedName("type")
          Type type;

          private InnerTerm(
              Map<String, Object> extraParams, String id, String lookupKey, Type type) {
            this.extraParams = extraParams;
            this.id = id;
            this.lookupKey = lookupKey;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String id;

            private String lookupKey;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm build() {
              return new ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm(
                  this.extraParams, this.id, this.lookupKey, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm#extraParams} for the
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
             * ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Select this term by its stable ID. */
            public Builder setId(String id) {
              this.id = id;
              return this;
            }

            /** Select this term by its unique lookup key. */
            public Builder setLookupKey(String lookupKey) {
              this.lookupKey = lookupKey;
              return this;
            }

            /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
            public Builder setType(
                ContractCreateParams.Term.PricingOverride.Criterion.InnerTerm.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("id")
            ID("id"),

            @SerializedName("lookup_key")
            LOOKUP_KEY("lookup_key");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EndsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.Term.PricingOverride.EndsAt build() {
            return new ContractCreateParams.Term.PricingOverride.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.PricingOverride.EndsAt#extraParams} for the
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
           * map. See {@link ContractCreateParams.Term.PricingOverride.EndsAt#extraParams} for the
           * field documentation.
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
          public Builder setType(ContractCreateParams.Term.PricingOverride.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("never")
          NEVER("never"),

          @SerializedName("now")
          NOW("now"),

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
      public static class Multiply {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The multiplier, for example 0.85 for a 15% discount. */
        @SerializedName("factor")
        BigDecimal factor;

        private Multiply(Map<String, Object> extraParams, BigDecimal factor) {
          this.extraParams = extraParams;
          this.factor = factor;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private BigDecimal factor;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.Term.PricingOverride.Multiply build() {
            return new ContractCreateParams.Term.PricingOverride.Multiply(
                this.extraParams, this.factor);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.PricingOverride.Multiply#extraParams} for the
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
           * map. See {@link ContractCreateParams.Term.PricingOverride.Multiply#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The multiplier, for example 0.85 for a 15% discount. */
          public Builder setFactor(BigDecimal factor) {
            this.factor = factor;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Overwrite {
        /** Whether the replacement pricing is per unit or tiered. */
        @SerializedName("billing_scheme")
        BillingScheme billingScheme;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Replacement pricing tiers. */
        @SerializedName("tiers")
        List<ContractCreateParams.Term.PricingOverride.Overwrite.Tier> tiers;

        /** How the pricing tiers are applied. */
        @SerializedName("tiers_mode")
        TiersMode tiersMode;

        /** The replacement per-unit amount in minor currency units. */
        @SerializedName("unit_amount_decimal")
        BigDecimal unitAmountDecimal;

        private Overwrite(
            BillingScheme billingScheme,
            Map<String, Object> extraParams,
            List<ContractCreateParams.Term.PricingOverride.Overwrite.Tier> tiers,
            TiersMode tiersMode,
            BigDecimal unitAmountDecimal) {
          this.billingScheme = billingScheme;
          this.extraParams = extraParams;
          this.tiers = tiers;
          this.tiersMode = tiersMode;
          this.unitAmountDecimal = unitAmountDecimal;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BillingScheme billingScheme;

          private Map<String, Object> extraParams;

          private List<ContractCreateParams.Term.PricingOverride.Overwrite.Tier> tiers;

          private TiersMode tiersMode;

          private BigDecimal unitAmountDecimal;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.Term.PricingOverride.Overwrite build() {
            return new ContractCreateParams.Term.PricingOverride.Overwrite(
                this.billingScheme,
                this.extraParams,
                this.tiers,
                this.tiersMode,
                this.unitAmountDecimal);
          }

          /** Whether the replacement pricing is per unit or tiered. */
          public Builder setBillingScheme(
              ContractCreateParams.Term.PricingOverride.Overwrite.BillingScheme billingScheme) {
            this.billingScheme = billingScheme;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.PricingOverride.Overwrite#extraParams} for
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
           * map. See {@link ContractCreateParams.Term.PricingOverride.Overwrite#extraParams} for
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
           * Add an element to `tiers` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.PricingOverride.Overwrite#tiers} for the field documentation.
           */
          public Builder addTier(ContractCreateParams.Term.PricingOverride.Overwrite.Tier element) {
            if (this.tiers == null) {
              this.tiers = new ArrayList<>();
            }
            this.tiers.add(element);
            return this;
          }

          /**
           * Add all elements to `tiers` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.PricingOverride.Overwrite#tiers} for the field documentation.
           */
          public Builder addAllTier(
              List<ContractCreateParams.Term.PricingOverride.Overwrite.Tier> elements) {
            if (this.tiers == null) {
              this.tiers = new ArrayList<>();
            }
            this.tiers.addAll(elements);
            return this;
          }

          /** How the pricing tiers are applied. */
          public Builder setTiersMode(
              ContractCreateParams.Term.PricingOverride.Overwrite.TiersMode tiersMode) {
            this.tiersMode = tiersMode;
            return this;
          }

          /** The replacement per-unit amount in minor currency units. */
          public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
            this.unitAmountDecimal = unitAmountDecimal;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Tier {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Flat amount in minor currency units. */
          @SerializedName("flat_amount_decimal")
          BigDecimal flatAmountDecimal;

          /** Per-unit amount in minor currency units. */
          @SerializedName("unit_amount_decimal")
          BigDecimal unitAmountDecimal;

          /** Inclusive whole-number upper bound. Omitted for an unbounded final tier. */
          @SerializedName("up_to")
          @JsonAdapter(StringInt64TypeAdapter.class)
          Long upTo;

          private Tier(
              Map<String, Object> extraParams,
              BigDecimal flatAmountDecimal,
              BigDecimal unitAmountDecimal,
              Long upTo) {
            this.extraParams = extraParams;
            this.flatAmountDecimal = flatAmountDecimal;
            this.unitAmountDecimal = unitAmountDecimal;
            this.upTo = upTo;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private BigDecimal flatAmountDecimal;

            private BigDecimal unitAmountDecimal;

            private Long upTo;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.Term.PricingOverride.Overwrite.Tier build() {
              return new ContractCreateParams.Term.PricingOverride.Overwrite.Tier(
                  this.extraParams, this.flatAmountDecimal, this.unitAmountDecimal, this.upTo);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.Term.PricingOverride.Overwrite.Tier#extraParams} for the field
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
             * ContractCreateParams.Term.PricingOverride.Overwrite.Tier#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Flat amount in minor currency units. */
            public Builder setFlatAmountDecimal(BigDecimal flatAmountDecimal) {
              this.flatAmountDecimal = flatAmountDecimal;
              return this;
            }

            /** Per-unit amount in minor currency units. */
            public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
            }

            /** Inclusive whole-number upper bound. Omitted for an unbounded final tier. */
            public Builder setUpTo(Long upTo) {
              this.upTo = upTo;
              return this;
            }
          }
        }

        public enum BillingScheme implements ApiRequestParams.EnumParam {
          @SerializedName("per_unit")
          PER_UNIT("per_unit"),

          @SerializedName("tiered")
          TIERED("tiered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          BillingScheme(String value) {
            this.value = value;
          }
        }

        public enum TiersMode implements ApiRequestParams.EnumParam {
          @SerializedName("graduated")
          GRADUATED("graduated"),

          @SerializedName("volume")
          VOLUME("volume");

          @Getter(onMethod_ = {@Override})
          private final String value;

          TiersMode(String value) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.Term.PricingOverride.StartsAt build() {
            return new ContractCreateParams.Term.PricingOverride.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.PricingOverride.StartsAt#extraParams} for the
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
           * map. See {@link ContractCreateParams.Term.PricingOverride.StartsAt#extraParams} for the
           * field documentation.
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
          public Builder setType(ContractCreateParams.Term.PricingOverride.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("now")
          NOW("now"),

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
        @SerializedName("multiply")
        MULTIPLY("multiply"),

        @SerializedName("overwrite")
        OVERWRITE("overwrite");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RecurringPrice {
      /** The exclusive end. Omitted means open-ended. */
      @SerializedName("ends_at")
      EndsAt endsAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The V1 recurring Price. */
      @SerializedName("price")
      String price;

      /** Initial licensed quantity. Defaults to 1; must be omitted for metered Prices. */
      @SerializedName("quantity")
      BigDecimal quantity;

      /** <strong>Required.</strong> The inclusive start of the term. */
      @SerializedName("starts_at")
      StartsAt startsAt;

      private RecurringPrice(
          EndsAt endsAt,
          Map<String, Object> extraParams,
          String price,
          BigDecimal quantity,
          StartsAt startsAt) {
        this.endsAt = endsAt;
        this.extraParams = extraParams;
        this.price = price;
        this.quantity = quantity;
        this.startsAt = startsAt;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EndsAt endsAt;

        private Map<String, Object> extraParams;

        private String price;

        private BigDecimal quantity;

        private StartsAt startsAt;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.Term.RecurringPrice build() {
          return new ContractCreateParams.Term.RecurringPrice(
              this.endsAt, this.extraParams, this.price, this.quantity, this.startsAt);
        }

        /** The exclusive end. Omitted means open-ended. */
        public Builder setEndsAt(ContractCreateParams.Term.RecurringPrice.EndsAt endsAt) {
          this.endsAt = endsAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.Term.RecurringPrice#extraParams} for the field
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
         * map. See {@link ContractCreateParams.Term.RecurringPrice#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The V1 recurring Price. */
        public Builder setPrice(String price) {
          this.price = price;
          return this;
        }

        /** Initial licensed quantity. Defaults to 1; must be omitted for metered Prices. */
        public Builder setQuantity(BigDecimal quantity) {
          this.quantity = quantity;
          return this;
        }

        /** <strong>Required.</strong> The inclusive start of the term. */
        public Builder setStartsAt(ContractCreateParams.Term.RecurringPrice.StartsAt startsAt) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.Term.RecurringPrice.EndsAt build() {
            return new ContractCreateParams.Term.RecurringPrice.EndsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.RecurringPrice.EndsAt#extraParams} for the
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
           * map. See {@link ContractCreateParams.Term.RecurringPrice.EndsAt#extraParams} for the
           * field documentation.
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
          public Builder setType(ContractCreateParams.Term.RecurringPrice.EndsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("never")
          NEVER("never"),

          @SerializedName("now")
          NOW("now"),

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
      public static class StartsAt {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.Term.RecurringPrice.StartsAt build() {
            return new ContractCreateParams.Term.RecurringPrice.StartsAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.RecurringPrice.StartsAt#extraParams} for the
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
           * map. See {@link ContractCreateParams.Term.RecurringPrice.StartsAt#extraParams} for the
           * field documentation.
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
          public Builder setType(ContractCreateParams.Term.RecurringPrice.StartsAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("now")
          NOW("now"),

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
    public static class ScheduledFee {
      /** <strong>Required.</strong> Explicit bill dates and amounts. */
      @SerializedName("bill_schedule")
      BillSchedule billSchedule;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The V1 Product being billed. */
      @SerializedName("product")
      String product;

      /** Informational service period, independent of bill dates. */
      @SerializedName("service_period")
      ServicePeriod servicePeriod;

      private ScheduledFee(
          BillSchedule billSchedule,
          Map<String, Object> extraParams,
          String product,
          ServicePeriod servicePeriod) {
        this.billSchedule = billSchedule;
        this.extraParams = extraParams;
        this.product = product;
        this.servicePeriod = servicePeriod;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillSchedule billSchedule;

        private Map<String, Object> extraParams;

        private String product;

        private ServicePeriod servicePeriod;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.Term.ScheduledFee build() {
          return new ContractCreateParams.Term.ScheduledFee(
              this.billSchedule, this.extraParams, this.product, this.servicePeriod);
        }

        /** <strong>Required.</strong> Explicit bill dates and amounts. */
        public Builder setBillSchedule(
            ContractCreateParams.Term.ScheduledFee.BillSchedule billSchedule) {
          this.billSchedule = billSchedule;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.Term.ScheduledFee#extraParams} for the field
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
         * map. See {@link ContractCreateParams.Term.ScheduledFee#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The V1 Product being billed. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }

        /** Informational service period, independent of bill dates. */
        public Builder setServicePeriod(
            ContractCreateParams.Term.ScheduledFee.ServicePeriod servicePeriod) {
          this.servicePeriod = servicePeriod;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BillSchedule {
        /** Between one and ten installments. Empty schedules are allowed only on update. */
        @SerializedName("custom")
        List<ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom> custom;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The type of schedule. */
        @SerializedName("type")
        Type type;

        private BillSchedule(
            List<ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom> custom,
            Map<String, Object> extraParams,
            Type type) {
          this.custom = custom;
          this.extraParams = extraParams;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom> custom;

          private Map<String, Object> extraParams;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.Term.ScheduledFee.BillSchedule build() {
            return new ContractCreateParams.Term.ScheduledFee.BillSchedule(
                this.custom, this.extraParams, this.type);
          }

          /**
           * Add an element to `custom` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.ScheduledFee.BillSchedule#custom} for the field
           * documentation.
           */
          public Builder addCustom(
              ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom element) {
            if (this.custom == null) {
              this.custom = new ArrayList<>();
            }
            this.custom.add(element);
            return this;
          }

          /**
           * Add all elements to `custom` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.Term.ScheduledFee.BillSchedule#custom} for the field
           * documentation.
           */
          public Builder addAllCustom(
              List<ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom> elements) {
            if (this.custom == null) {
              this.custom = new ArrayList<>();
            }
            this.custom.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.ScheduledFee.BillSchedule#extraParams} for
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
           * map. See {@link ContractCreateParams.Term.ScheduledFee.BillSchedule#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The type of schedule. */
          public Builder setType(ContractCreateParams.Term.ScheduledFee.BillSchedule.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Custom {
          /**
           * <strong>Required.</strong> A finite bill date. Resolved once per request, including on
           * idempotent retries.
           */
          @SerializedName("bill_at")
          BillAt billAt;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Positive installment quantity. Defaults to 1 when omitted. */
          @SerializedName("quantity")
          BigDecimal quantity;

          /**
           * <strong>Required.</strong> Positive unit price in minor units of the contract's
           * currency, before multiplying by quantity.
           */
          @SerializedName("unit_amount_decimal")
          BigDecimal unitAmountDecimal;

          private Custom(
              BillAt billAt,
              Map<String, Object> extraParams,
              BigDecimal quantity,
              BigDecimal unitAmountDecimal) {
            this.billAt = billAt;
            this.extraParams = extraParams;
            this.quantity = quantity;
            this.unitAmountDecimal = unitAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BillAt billAt;

            private Map<String, Object> extraParams;

            private BigDecimal quantity;

            private BigDecimal unitAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom build() {
              return new ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom(
                  this.billAt, this.extraParams, this.quantity, this.unitAmountDecimal);
            }

            /**
             * <strong>Required.</strong> A finite bill date. Resolved once per request, including
             * on idempotent retries.
             */
            public Builder setBillAt(
                ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt billAt) {
              this.billAt = billAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom#extraParams} for the field
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
             * ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Positive installment quantity. Defaults to 1 when omitted. */
            public Builder setQuantity(BigDecimal quantity) {
              this.quantity = quantity;
              return this;
            }

            /**
             * <strong>Required.</strong> Positive unit price in minor units of the contract's
             * currency, before multiplying by quantity.
             */
            public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class BillAt {
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
             * The timestamp at which the entry should be billed. Required if {@code type} is {@code
             * timestamp}.
             */
            @SerializedName("timestamp")
            Instant timestamp;

            /** <strong>Required.</strong> The type of the bill_at. */
            @SerializedName("type")
            Type type;

            private BillAt(Map<String, Object> extraParams, Instant timestamp, Type type) {
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
              public ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt build() {
                return new ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt(
                    this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt#extraParams} for
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
               * ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt#extraParams} for
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
               * The timestamp at which the entry should be billed. Required if {@code type} is
               * {@code timestamp}.
               */
              public Builder setTimestamp(Instant timestamp) {
                this.timestamp = timestamp;
                return this;
              }

              /** <strong>Required.</strong> The type of the bill_at. */
              public Builder setType(
                  ContractCreateParams.Term.ScheduledFee.BillSchedule.Custom.BillAt.Type type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("now")
              NOW("now"),

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
      public static class ServicePeriod {
        /**
         * <strong>Required.</strong> The finite exclusive end; must be after starts_at. Never is
         * not supported.
         */
        @SerializedName("ends_at")
        EndsAt endsAt;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The finite inclusive start of the service period. */
        @SerializedName("starts_at")
        StartsAt startsAt;

        private ServicePeriod(EndsAt endsAt, Map<String, Object> extraParams, StartsAt startsAt) {
          this.endsAt = endsAt;
          this.extraParams = extraParams;
          this.startsAt = startsAt;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EndsAt endsAt;

          private Map<String, Object> extraParams;

          private StartsAt startsAt;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.Term.ScheduledFee.ServicePeriod build() {
            return new ContractCreateParams.Term.ScheduledFee.ServicePeriod(
                this.endsAt, this.extraParams, this.startsAt);
          }

          /**
           * <strong>Required.</strong> The finite exclusive end; must be after starts_at. Never is
           * not supported.
           */
          public Builder setEndsAt(
              ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt endsAt) {
            this.endsAt = endsAt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.Term.ScheduledFee.ServicePeriod#extraParams} for
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
           * map. See {@link ContractCreateParams.Term.ScheduledFee.ServicePeriod#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The finite inclusive start of the service period. */
          public Builder setStartsAt(
              ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt startsAt) {
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
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The timestamp when the item starts. Required if {@code type} is {@code timestamp}. */
          @SerializedName("timestamp")
          Instant timestamp;

          /** <strong>Required.</strong> The type of the starts_at. */
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
            public ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt build() {
              return new ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt#extraParams} for the
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
             * ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt#extraParams} for the
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
             * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
             */
            public Builder setTimestamp(Instant timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /** <strong>Required.</strong> The type of the starts_at. */
            public Builder setType(
                ContractCreateParams.Term.ScheduledFee.ServicePeriod.EndsAt.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("now")
            NOW("now"),

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
        public static class StartsAt {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt build() {
              return new ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt#extraParams} for the
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
             * ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt#extraParams} for the
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
             * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
             */
            public Builder setTimestamp(Instant timestamp) {
              this.timestamp = timestamp;
              return this;
            }

            /** <strong>Required.</strong> The type of the starts_at. */
            public Builder setType(
                ContractCreateParams.Term.ScheduledFee.ServicePeriod.StartsAt.Type type) {
              this.type = type;
              return this;
            }
          }

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("now")
            NOW("now"),

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
      @SerializedName("pricing_override")
      PRICING_OVERRIDE("pricing_override"),

      @SerializedName("recurring_price")
      RECURRING_PRICE("recurring_price"),

      @SerializedName("scheduled_fee")
      SCHEDULED_FEE("scheduled_fee");

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
    PRICING_OVERRIDES("pricing_overrides"),

    @SerializedName("terms")
    TERMS("terms");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
