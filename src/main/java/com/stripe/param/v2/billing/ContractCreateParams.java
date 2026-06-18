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

  /**
   * A list of one-time fees to create with the contract. Each fee is billed as individual invoice
   * items per its bill_schedule.
   */
  @SerializedName("one_time_fees")
  List<ContractCreateParams.OneTimeFee> oneTimeFees;

  /** <strong>Required.</strong> A list of pricing lines to create with the contract. */
  @SerializedName("pricing_lines")
  List<ContractCreateParams.PricingLine> pricingLines;

  /** A list of pricing overrides to create with the contract. */
  @SerializedName("pricing_overrides")
  List<ContractCreateParams.PricingOverride> pricingOverrides;

  private ContractCreateParams(
      BillingSettings billingSettings,
      String contractNumber,
      String currency,
      Map<String, Object> extraParams,
      List<ContractCreateParams.Include> include,
      Map<String, String> metadata,
      List<ContractCreateParams.OneTimeFee> oneTimeFees,
      List<ContractCreateParams.PricingLine> pricingLines,
      List<ContractCreateParams.PricingOverride> pricingOverrides) {
    this.billingSettings = billingSettings;
    this.contractNumber = contractNumber;
    this.currency = currency;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
    this.oneTimeFees = oneTimeFees;
    this.pricingLines = pricingLines;
    this.pricingOverrides = pricingOverrides;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillingSettings billingSettings;

    private String contractNumber;

    private String currency;

    private Map<String, Object> extraParams;

    private List<ContractCreateParams.Include> include;

    private Map<String, String> metadata;

    private List<ContractCreateParams.OneTimeFee> oneTimeFees;

    private List<ContractCreateParams.PricingLine> pricingLines;

    private List<ContractCreateParams.PricingOverride> pricingOverrides;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractCreateParams build() {
      return new ContractCreateParams(
          this.billingSettings,
          this.contractNumber,
          this.currency,
          this.extraParams,
          this.include,
          this.metadata,
          this.oneTimeFees,
          this.pricingLines,
          this.pricingOverrides);
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
     * Add an element to `oneTimeFees` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#oneTimeFees} for the field documentation.
     */
    public Builder addOneTimeFee(ContractCreateParams.OneTimeFee element) {
      if (this.oneTimeFees == null) {
        this.oneTimeFees = new ArrayList<>();
      }
      this.oneTimeFees.add(element);
      return this;
    }

    /**
     * Add all elements to `oneTimeFees` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ContractCreateParams#oneTimeFees} for the field documentation.
     */
    public Builder addAllOneTimeFee(List<ContractCreateParams.OneTimeFee> elements) {
      if (this.oneTimeFees == null) {
        this.oneTimeFees = new ArrayList<>();
      }
      this.oneTimeFees.addAll(elements);
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
  public static class BillingSettings {
    /** Billing settings details for the contract. */
    @SerializedName("contract_billing_details")
    ContractBillingDetails contractBillingDetails;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private BillingSettings(
        ContractBillingDetails contractBillingDetails, Map<String, Object> extraParams) {
      this.contractBillingDetails = contractBillingDetails;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ContractBillingDetails contractBillingDetails;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.BillingSettings build() {
        return new ContractCreateParams.BillingSettings(
            this.contractBillingDetails, this.extraParams);
      }

      /** Billing settings details for the contract. */
      public Builder setContractBillingDetails(
          ContractCreateParams.BillingSettings.ContractBillingDetails contractBillingDetails) {
        this.contractBillingDetails = contractBillingDetails;
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
    public static class ContractBillingDetails {
      /** The bill settings details. */
      @SerializedName("bill_settings_details")
      BillSettingsDetails billSettingsDetails;

      /** <strong>Required.</strong> The billing profile details. */
      @SerializedName("billing_profile_details")
      BillingProfileDetails billingProfileDetails;

      /** <strong>Required.</strong> The collection settings details. */
      @SerializedName("collection_settings_details")
      CollectionSettingsDetails collectionSettingsDetails;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private ContractBillingDetails(
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
        public ContractCreateParams.BillingSettings.ContractBillingDetails build() {
          return new ContractCreateParams.BillingSettings.ContractBillingDetails(
              this.billSettingsDetails,
              this.billingProfileDetails,
              this.collectionSettingsDetails,
              this.extraParams);
        }

        /** The bill settings details. */
        public Builder setBillSettingsDetails(
            ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                billSettingsDetails) {
          this.billSettingsDetails = billSettingsDetails;
          return this;
        }

        /** <strong>Required.</strong> The billing profile details. */
        public Builder setBillingProfileDetails(
            ContractCreateParams.BillingSettings.ContractBillingDetails.BillingProfileDetails
                billingProfileDetails) {
          this.billingProfileDetails = billingProfileDetails;
          return this;
        }

        /** <strong>Required.</strong> The collection settings details. */
        public Builder setCollectionSettingsDetails(
            ContractCreateParams.BillingSettings.ContractBillingDetails.CollectionSettingsDetails
                collectionSettingsDetails) {
          this.collectionSettingsDetails = collectionSettingsDetails;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.BillingSettings.ContractBillingDetails#extraParams}
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
         * map. See {@link ContractCreateParams.BillingSettings.ContractBillingDetails#extraParams}
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BillSettingsDetails {
        /** Calculation settings. */
        @SerializedName("calculation")
        Calculation calculation;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
              build() {
            return new ContractCreateParams.BillingSettings.ContractBillingDetails
                .BillSettingsDetails(this.calculation, this.extraParams, this.invoice);
          }

          /** Calculation settings. */
          public Builder setCalculation(
              ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                      .Calculation
                  calculation) {
            this.calculation = calculation;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails#extraParams}
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
           * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails#extraParams}
           * for the field documentation.
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
              ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                      .Invoice
                  invoice) {
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                    .Calculation
                build() {
              return new ContractCreateParams.BillingSettings.ContractBillingDetails
                  .BillSettingsDetails.Calculation(this.extraParams, this.tax);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Calculation#extraParams}
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
             * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Calculation#extraParams}
             * for the field documentation.
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
                ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                        .Calculation.Tax
                    tax) {
              this.tax = tax;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Tax {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
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
              public ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                      .Calculation.Tax
                  build() {
                return new ContractCreateParams.BillingSettings.ContractBillingDetails
                    .BillSettingsDetails.Calculation.Tax(this.extraParams, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Calculation.Tax#extraParams}
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
               * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Calculation.Tax#extraParams}
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
                  ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                          .Calculation.Tax.Type
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The number of time units before the invoice is past due. */
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
            public ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                    .Invoice
                build() {
              return new ContractCreateParams.BillingSettings.ContractBillingDetails
                  .BillSettingsDetails.Invoice(this.extraParams, this.timeUntilDue);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Invoice#extraParams}
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
             * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Invoice#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The number of time units before the invoice is past due. */
            public Builder setTimeUntilDue(
                ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                        .Invoice.TimeUntilDue
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
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
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
              public ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                      .Invoice.TimeUntilDue
                  build() {
                return new ContractCreateParams.BillingSettings.ContractBillingDetails
                    .BillSettingsDetails.Invoice.TimeUntilDue(
                    this.extraParams, this.interval, this.intervalCount);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
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
               * ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
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
                  ContractCreateParams.BillingSettings.ContractBillingDetails.BillSettingsDetails
                          .Invoice.TimeUntilDue.Interval
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.BillingSettings.ContractBillingDetails.BillingProfileDetails
              build() {
            return new ContractCreateParams.BillingSettings.ContractBillingDetails
                .BillingProfileDetails(this.customer, this.defaultPaymentMethod, this.extraParams);
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
           * map. See {@link
           * ContractCreateParams.BillingSettings.ContractBillingDetails.BillingProfileDetails#extraParams}
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
           * ContractCreateParams.BillingSettings.ContractBillingDetails.BillingProfileDetails#extraParams}
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
        /** <strong>Required.</strong> The collection method. */
        @SerializedName("collection_method")
        CollectionMethod collectionMethod;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
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
          public ContractCreateParams.BillingSettings.ContractBillingDetails
                  .CollectionSettingsDetails
              build() {
            return new ContractCreateParams.BillingSettings.ContractBillingDetails
                .CollectionSettingsDetails(
                this.collectionMethod, this.extraParams, this.paymentMethodConfiguration);
          }

          /** <strong>Required.</strong> The collection method. */
          public Builder setCollectionMethod(
              ContractCreateParams.BillingSettings.ContractBillingDetails.CollectionSettingsDetails
                      .CollectionMethod
                  collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractCreateParams.BillingSettings.ContractBillingDetails.CollectionSettingsDetails#extraParams}
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
           * ContractCreateParams.BillingSettings.ContractBillingDetails.CollectionSettingsDetails#extraParams}
           * for the field documentation.
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
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class OneTimeFee {
    /**
     * <strong>Required.</strong> The bill schedule for the fee. Each entry produces an individual
     * invoice item billed at {@code bill_at}.
     */
    @SerializedName("bill_schedule")
    List<ContractCreateParams.OneTimeFee.BillSchedule> billSchedule;

    /** <strong>Required.</strong> The type of billable item that this fee references. */
    @SerializedName("billable_item_type")
    BillableItemType billableItemType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Details for a product billable target. Required when {@code billable_item_type} is {@code
     * product}.
     */
    @SerializedName("product_details")
    ProductDetails productDetails;

    private OneTimeFee(
        List<ContractCreateParams.OneTimeFee.BillSchedule> billSchedule,
        BillableItemType billableItemType,
        Map<String, Object> extraParams,
        ProductDetails productDetails) {
      this.billSchedule = billSchedule;
      this.billableItemType = billableItemType;
      this.extraParams = extraParams;
      this.productDetails = productDetails;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<ContractCreateParams.OneTimeFee.BillSchedule> billSchedule;

      private BillableItemType billableItemType;

      private Map<String, Object> extraParams;

      private ProductDetails productDetails;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.OneTimeFee build() {
        return new ContractCreateParams.OneTimeFee(
            this.billSchedule, this.billableItemType, this.extraParams, this.productDetails);
      }

      /**
       * Add an element to `billSchedule` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ContractCreateParams.OneTimeFee#billSchedule} for the field documentation.
       */
      public Builder addBillSchedule(ContractCreateParams.OneTimeFee.BillSchedule element) {
        if (this.billSchedule == null) {
          this.billSchedule = new ArrayList<>();
        }
        this.billSchedule.add(element);
        return this;
      }

      /**
       * Add all elements to `billSchedule` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * ContractCreateParams.OneTimeFee#billSchedule} for the field documentation.
       */
      public Builder addAllBillSchedule(
          List<ContractCreateParams.OneTimeFee.BillSchedule> elements) {
        if (this.billSchedule == null) {
          this.billSchedule = new ArrayList<>();
        }
        this.billSchedule.addAll(elements);
        return this;
      }

      /** <strong>Required.</strong> The type of billable item that this fee references. */
      public Builder setBillableItemType(
          ContractCreateParams.OneTimeFee.BillableItemType billableItemType) {
        this.billableItemType = billableItemType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractCreateParams.OneTimeFee#extraParams} for the field documentation.
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
       * See {@link ContractCreateParams.OneTimeFee#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Details for a product billable target. Required when {@code billable_item_type} is {@code
       * product}.
       */
      public Builder setProductDetails(
          ContractCreateParams.OneTimeFee.ProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillSchedule {
      /** <strong>Required.</strong> When this entry should be billed. */
      @SerializedName("bill_at")
      BillAt billAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The amount to bill for this entry, in the smallest currency
       * unit.
       */
      @SerializedName("value")
      @JsonAdapter(StringInt64TypeAdapter.class)
      Long value;

      private BillSchedule(BillAt billAt, Map<String, Object> extraParams, Long value) {
        this.billAt = billAt;
        this.extraParams = extraParams;
        this.value = value;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private BillAt billAt;

        private Map<String, Object> extraParams;

        private Long value;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.OneTimeFee.BillSchedule build() {
          return new ContractCreateParams.OneTimeFee.BillSchedule(
              this.billAt, this.extraParams, this.value);
        }

        /** <strong>Required.</strong> When this entry should be billed. */
        public Builder setBillAt(ContractCreateParams.OneTimeFee.BillSchedule.BillAt billAt) {
          this.billAt = billAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.OneTimeFee.BillSchedule#extraParams} for the field
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
         * map. See {@link ContractCreateParams.OneTimeFee.BillSchedule#extraParams} for the field
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
         * <strong>Required.</strong> The amount to bill for this entry, in the smallest currency
         * unit.
         */
        public Builder setValue(Long value) {
          this.value = value;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class BillAt {
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
         * The datetime at which the entry should be billed. Required if {@code type} is {@code
         * datetime}.
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
          public ContractCreateParams.OneTimeFee.BillSchedule.BillAt build() {
            return new ContractCreateParams.OneTimeFee.BillSchedule.BillAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.OneTimeFee.BillSchedule.BillAt#extraParams} for
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
           * map. See {@link ContractCreateParams.OneTimeFee.BillSchedule.BillAt#extraParams} for
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
           * The datetime at which the entry should be billed. Required if {@code type} is {@code
           * datetime}.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> The type of the bill_at. */
          public Builder setType(ContractCreateParams.OneTimeFee.BillSchedule.BillAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("contract_start")
          CONTRACT_START("contract_start"),

          @SerializedName("datetime")
          DATETIME("datetime");

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
    public static class ProductDetails {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The ID of the v1 Product. */
      @SerializedName("product")
      String product;

      private ProductDetails(Map<String, Object> extraParams, String product) {
        this.extraParams = extraParams;
        this.product = product;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String product;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.OneTimeFee.ProductDetails build() {
          return new ContractCreateParams.OneTimeFee.ProductDetails(this.extraParams, this.product);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.OneTimeFee.ProductDetails#extraParams} for the field
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
         * map. See {@link ContractCreateParams.OneTimeFee.ProductDetails#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The ID of the v1 Product. */
        public Builder setProduct(String product) {
          this.product = product;
          return this;
        }
      }
    }

    public enum BillableItemType implements ApiRequestParams.EnumParam {
      @SerializedName("product")
      PRODUCT("product");

      @Getter(onMethod_ = {@Override})
      private final String value;

      BillableItemType(String value) {
        this.value = value;
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
        @SerializedName("contract_end")
        CONTRACT_END("contract_end"),

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

        /** <strong>Required.</strong> The ID of the V1 price. */
        @SerializedName("price")
        String price;

        /** Pricing overrides embedded directly on this pricing line. */
        @SerializedName("pricing_overrides")
        List<ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride>
            pricingOverrides;

        /**
         * Quantity changes for the pricing line. For now, at most one entry is allowed. A quantity
         * change clears all future quantity changes on this pricing line.
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

          /** <strong>Required.</strong> The ID of the V1 price. */
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

          /**
           * <strong>Required.</strong> The type of override. Currently only {@code overwrite_price}
           * is supported.
           */
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

            /**
             * <strong>Required.</strong> The type of override. Currently only {@code
             * overwrite_price} is supported.
             */
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
              @SerializedName("contract_end")
              CONTRACT_END("contract_end"),

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

            /** Defines whether the tiered price should be graduated or volume-based. */
            @SerializedName("tiering_mode")
            TieringMode tieringMode;

            /** Each element represents a pricing tier. */
            @SerializedName("tiers")
            List<
                    ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                        .OverwritePrice.Tier>
                tiers;

            /**
             * The per-unit amount to be charged, represented as a decimal string in minor currency
             * units.
             */
            @SerializedName("unit_amount")
            String unitAmount;

            private OverwritePrice(
                Map<String, Object> extraParams,
                TieringMode tieringMode,
                List<
                        ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                            .OverwritePrice.Tier>
                    tiers,
                String unitAmount) {
              this.extraParams = extraParams;
              this.tieringMode = tieringMode;
              this.tiers = tiers;
              this.unitAmount = unitAmount;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private TieringMode tieringMode;

              private List<
                      ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                          .OverwritePrice.Tier>
                  tiers;

              private String unitAmount;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                      .OverwritePrice
                  build() {
                return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                    .OverwritePrice(
                    this.extraParams, this.tieringMode, this.tiers, this.unitAmount);
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

              /** Defines whether the tiered price should be graduated or volume-based. */
              public Builder setTieringMode(
                  ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                          .OverwritePrice.TieringMode
                      tieringMode) {
                this.tieringMode = tieringMode;
                return this;
              }

              /**
               * Add an element to `tiers` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice#tiers}
               * for the field documentation.
               */
              public Builder addTier(
                  ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                          .OverwritePrice.Tier
                      element) {
                if (this.tiers == null) {
                  this.tiers = new ArrayList<>();
                }
                this.tiers.add(element);
                return this;
              }

              /**
               * Add all elements to `tiers` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice#tiers}
               * for the field documentation.
               */
              public Builder addAllTier(
                  List<
                          ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                              .OverwritePrice.Tier>
                      elements) {
                if (this.tiers == null) {
                  this.tiers = new ArrayList<>();
                }
                this.tiers.addAll(elements);
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

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Tier {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /**
               * Price for the entire tier, represented as a decimal string in minor currency units.
               */
              @SerializedName("flat_amount")
              String flatAmount;

              /**
               * Per-unit price for units included in this tier, represented as a decimal string in
               * minor currency units.
               */
              @SerializedName("unit_amount")
              String unitAmount;

              /** Up to and including this quantity will be contained in the tier. */
              @SerializedName("up_to_decimal")
              BigDecimal upToDecimal;

              /** No upper bound to this tier. */
              @SerializedName("up_to_inf")
              UpToInf upToInf;

              private Tier(
                  Map<String, Object> extraParams,
                  String flatAmount,
                  String unitAmount,
                  BigDecimal upToDecimal,
                  UpToInf upToInf) {
                this.extraParams = extraParams;
                this.flatAmount = flatAmount;
                this.unitAmount = unitAmount;
                this.upToDecimal = upToDecimal;
                this.upToInf = upToInf;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private String flatAmount;

                private String unitAmount;

                private BigDecimal upToDecimal;

                private UpToInf upToInf;

                /** Finalize and obtain parameter instance from this builder. */
                public ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                        .OverwritePrice.Tier
                    build() {
                  return new ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                      .OverwritePrice.Tier(
                      this.extraParams,
                      this.flatAmount,
                      this.unitAmount,
                      this.upToDecimal,
                      this.upToInf);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice.Tier#extraParams}
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
                 * first `put/putAll` call, and subsequent calls add additional key/value pairs to
                 * the original map. See {@link
                 * ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride.OverwritePrice.Tier#extraParams}
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
                 * Price for the entire tier, represented as a decimal string in minor currency
                 * units.
                 */
                public Builder setFlatAmount(String flatAmount) {
                  this.flatAmount = flatAmount;
                  return this;
                }

                /**
                 * Per-unit price for units included in this tier, represented as a decimal string
                 * in minor currency units.
                 */
                public Builder setUnitAmount(String unitAmount) {
                  this.unitAmount = unitAmount;
                  return this;
                }

                /** Up to and including this quantity will be contained in the tier. */
                public Builder setUpToDecimal(BigDecimal upToDecimal) {
                  this.upToDecimal = upToDecimal;
                  return this;
                }

                /** No upper bound to this tier. */
                public Builder setUpToInf(
                    ContractCreateParams.PricingLine.Pricing.PriceDetails.PricingOverride
                            .OverwritePrice.Tier.UpToInf
                        upToInf) {
                  this.upToInf = upToInf;
                  return this;
                }
              }

              public enum UpToInf implements ApiRequestParams.EnumParam {
                @SerializedName("inf")
                INF("inf");

                @Getter(onMethod_ = {@Override})
                private final String value;

                UpToInf(String value) {
                  this.value = value;
                }
              }
            }

            public enum TieringMode implements ApiRequestParams.EnumParam {
              @SerializedName("graduated")
              GRADUATED("graduated"),

              @SerializedName("volume")
              VOLUME("volume");

              @Getter(onMethod_ = {@Override})
              private final String value;

              TieringMode(String value) {
                this.value = value;
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
              @SerializedName("contract_start")
              CONTRACT_START("contract_start"),

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
        @SerializedName("contract_start")
        CONTRACT_START("contract_start"),

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

    /** Parameters for a multiplier override. Required if {@code type} is {@code multiplier}. */
    @SerializedName("multiplier")
    Multiplier multiplier;

    /**
     * <strong>Required.</strong> The priority of this override relative to others. The highest
     * priority is 0 and the lowest is 100.
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
        Multiplier multiplier,
        Long priority,
        StartsAt startsAt,
        Type type) {
      this.endsAt = endsAt;
      this.extraParams = extraParams;
      this.lookupKey = lookupKey;
      this.multiplier = multiplier;
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

      private Multiplier multiplier;

      private Long priority;

      private StartsAt startsAt;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractCreateParams.PricingOverride build() {
        return new ContractCreateParams.PricingOverride(
            this.endsAt,
            this.extraParams,
            this.lookupKey,
            this.multiplier,
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

      /** Parameters for a multiplier override. Required if {@code type} is {@code multiplier}. */
      public Builder setMultiplier(ContractCreateParams.PricingOverride.Multiplier multiplier) {
        this.multiplier = multiplier;
        return this;
      }

      /**
       * <strong>Required.</strong> The priority of this override relative to others. The highest
       * priority is 0 and the lowest is 100.
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
        @SerializedName("contract_end")
        CONTRACT_END("contract_end"),

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
    public static class Multiplier {
      /** Criteria determining which rates the multiplier applies to. */
      @SerializedName("criteria")
      List<ContractCreateParams.PricingOverride.Multiplier.Criterion> criteria;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> The multiplier factor, represented as a decimal string. e.g.
       * &quot;0.8&quot; for a 20% reduction.
       */
      @SerializedName("factor")
      String factor;

      private Multiplier(
          List<ContractCreateParams.PricingOverride.Multiplier.Criterion> criteria,
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
        private List<ContractCreateParams.PricingOverride.Multiplier.Criterion> criteria;

        private Map<String, Object> extraParams;

        private String factor;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractCreateParams.PricingOverride.Multiplier build() {
          return new ContractCreateParams.PricingOverride.Multiplier(
              this.criteria, this.extraParams, this.factor);
        }

        /**
         * Add an element to `criteria` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.PricingOverride.Multiplier#criteria} for the field documentation.
         */
        public Builder addCriterion(
            ContractCreateParams.PricingOverride.Multiplier.Criterion element) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.add(element);
          return this;
        }

        /**
         * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * ContractCreateParams.PricingOverride.Multiplier#criteria} for the field documentation.
         */
        public Builder addAllCriterion(
            List<ContractCreateParams.PricingOverride.Multiplier.Criterion> elements) {
          if (this.criteria == null) {
            this.criteria = new ArrayList<>();
          }
          this.criteria.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractCreateParams.PricingOverride.Multiplier#extraParams} for the
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
         * map. See {@link ContractCreateParams.PricingOverride.Multiplier#extraParams} for the
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
         * <strong>Required.</strong> The multiplier factor, represented as a decimal string. e.g.
         * &quot;0.8&quot; for a 20% reduction.
         */
        public Builder setFactor(String factor) {
          this.factor = factor;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Criterion {
        /** <strong>Required.</strong> Filter by billable item IDs. */
        @SerializedName("billable_item_ids")
        List<String> billableItemIds;

        /** <strong>Required.</strong> Filter by billable item lookup keys. */
        @SerializedName("billable_item_lookup_keys")
        List<String> billableItemLookupKeys;

        /** <strong>Required.</strong> Filter by billable item type. */
        @SerializedName("billable_item_types")
        List<ContractCreateParams.PricingOverride.Multiplier.Criterion.BillableItemType>
            billableItemTypes;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> Filter by metadata conditions. */
        @SerializedName("metadata_conditions")
        List<ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition>
            metadataConditions;

        /**
         * <strong>Required.</strong> Filter by rate card IDs. Only applicable for {@code
         * multiplier} overrides.
         */
        @SerializedName("rate_card_ids")
        List<String> rateCardIds;

        /**
         * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
         */
        @SerializedName("type")
        Type type;

        private Criterion(
            List<String> billableItemIds,
            List<String> billableItemLookupKeys,
            List<ContractCreateParams.PricingOverride.Multiplier.Criterion.BillableItemType>
                billableItemTypes,
            Map<String, Object> extraParams,
            List<ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition>
                metadataConditions,
            List<String> rateCardIds,
            Type type) {
          this.billableItemIds = billableItemIds;
          this.billableItemLookupKeys = billableItemLookupKeys;
          this.billableItemTypes = billableItemTypes;
          this.extraParams = extraParams;
          this.metadataConditions = metadataConditions;
          this.rateCardIds = rateCardIds;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<String> billableItemIds;

          private List<String> billableItemLookupKeys;

          private List<ContractCreateParams.PricingOverride.Multiplier.Criterion.BillableItemType>
              billableItemTypes;

          private Map<String, Object> extraParams;

          private List<ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition>
              metadataConditions;

          private List<String> rateCardIds;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractCreateParams.PricingOverride.Multiplier.Criterion build() {
            return new ContractCreateParams.PricingOverride.Multiplier.Criterion(
                this.billableItemIds,
                this.billableItemLookupKeys,
                this.billableItemTypes,
                this.extraParams,
                this.metadataConditions,
                this.rateCardIds,
                this.type);
          }

          /**
           * Add an element to `billableItemIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemIds}
           * for the field documentation.
           */
          public Builder addBillableItemId(String element) {
            if (this.billableItemIds == null) {
              this.billableItemIds = new ArrayList<>();
            }
            this.billableItemIds.add(element);
            return this;
          }

          /**
           * Add all elements to `billableItemIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemIds}
           * for the field documentation.
           */
          public Builder addAllBillableItemId(List<String> elements) {
            if (this.billableItemIds == null) {
              this.billableItemIds = new ArrayList<>();
            }
            this.billableItemIds.addAll(elements);
            return this;
          }

          /**
           * Add an element to `billableItemLookupKeys` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemLookupKeys} for
           * the field documentation.
           */
          public Builder addBillableItemLookupKey(String element) {
            if (this.billableItemLookupKeys == null) {
              this.billableItemLookupKeys = new ArrayList<>();
            }
            this.billableItemLookupKeys.add(element);
            return this;
          }

          /**
           * Add all elements to `billableItemLookupKeys` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemLookupKeys} for
           * the field documentation.
           */
          public Builder addAllBillableItemLookupKey(List<String> elements) {
            if (this.billableItemLookupKeys == null) {
              this.billableItemLookupKeys = new ArrayList<>();
            }
            this.billableItemLookupKeys.addAll(elements);
            return this;
          }

          /**
           * Add an element to `billableItemTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemTypes}
           * for the field documentation.
           */
          public Builder addBillableItemType(
              ContractCreateParams.PricingOverride.Multiplier.Criterion.BillableItemType element) {
            if (this.billableItemTypes == null) {
              this.billableItemTypes = new ArrayList<>();
            }
            this.billableItemTypes.add(element);
            return this;
          }

          /**
           * Add all elements to `billableItemTypes` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#billableItemTypes}
           * for the field documentation.
           */
          public Builder addAllBillableItemType(
              List<ContractCreateParams.PricingOverride.Multiplier.Criterion.BillableItemType>
                  elements) {
            if (this.billableItemTypes == null) {
              this.billableItemTypes = new ArrayList<>();
            }
            this.billableItemTypes.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#extraParams}
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
           * map. See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#extraParams}
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
           * Add an element to `metadataConditions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.Multiplier.Criterion#metadataConditions} for the
           * field documentation.
           */
          public Builder addMetadataCondition(
              ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition element) {
            if (this.metadataConditions == null) {
              this.metadataConditions = new ArrayList<>();
            }
            this.metadataConditions.add(element);
            return this;
          }

          /**
           * Add all elements to `metadataConditions` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * ContractCreateParams.PricingOverride.Multiplier.Criterion#metadataConditions} for the
           * field documentation.
           */
          public Builder addAllMetadataCondition(
              List<ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition>
                  elements) {
            if (this.metadataConditions == null) {
              this.metadataConditions = new ArrayList<>();
            }
            this.metadataConditions.addAll(elements);
            return this;
          }

          /**
           * Add an element to `rateCardIds` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractCreateParams.PricingOverride.Multiplier.Criterion#rateCardIds} for the field
           * documentation.
           */
          public Builder addRateCardId(String element) {
            if (this.rateCardIds == null) {
              this.rateCardIds = new ArrayList<>();
            }
            this.rateCardIds.add(element);
            return this;
          }

          /**
           * Add all elements to `rateCardIds` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link ContractCreateParams.PricingOverride.Multiplier.Criterion#rateCardIds} for
           * the field documentation.
           */
          public Builder addAllRateCardId(List<String> elements) {
            if (this.rateCardIds == null) {
              this.rateCardIds = new ArrayList<>();
            }
            this.rateCardIds.addAll(elements);
            return this;
          }

          /**
           * <strong>Required.</strong> Whether to include or exclude items matching these criteria.
           */
          public Builder setType(
              ContractCreateParams.PricingOverride.Multiplier.Criterion.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MetadataCondition {
          /** <strong>Required.</strong> All of these key-value conditions must match. */
          @SerializedName("all_of")
          List<ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition.AllOf>
              allOf;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private MetadataCondition(
              List<
                      ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition
                          .AllOf>
                  allOf,
              Map<String, Object> extraParams) {
            this.allOf = allOf;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private List<
                    ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition
                        .AllOf>
                allOf;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition
                build() {
              return new ContractCreateParams.PricingOverride.Multiplier.Criterion
                  .MetadataCondition(this.allOf, this.extraParams);
            }

            /**
             * Add an element to `allOf` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition#allOf}
             * for the field documentation.
             */
            public Builder addAllOf(
                ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition.AllOf
                    element) {
              if (this.allOf == null) {
                this.allOf = new ArrayList<>();
              }
              this.allOf.add(element);
              return this;
            }

            /**
             * Add all elements to `allOf` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition#allOf}
             * for the field documentation.
             */
            public Builder addAllAllOf(
                List<
                        ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition
                            .AllOf>
                    elements) {
              if (this.allOf == null) {
                this.allOf = new ArrayList<>();
              }
              this.allOf.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition#extraParams}
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
             * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition#extraParams}
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

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class AllOf {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The metadata key. */
            @SerializedName("key")
            String key;

            /** <strong>Required.</strong> The metadata value. */
            @SerializedName("value")
            String value;

            private AllOf(Map<String, Object> extraParams, String key, String value) {
              this.extraParams = extraParams;
              this.key = key;
              this.value = value;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String key;

              private String value;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition
                      .AllOf
                  build() {
                return new ContractCreateParams.PricingOverride.Multiplier.Criterion
                    .MetadataCondition.AllOf(this.extraParams, this.key, this.value);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition.AllOf#extraParams}
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
               * ContractCreateParams.PricingOverride.Multiplier.Criterion.MetadataCondition.AllOf#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The metadata key. */
              public Builder setKey(String key) {
                this.key = key;
                return this;
              }

              /** <strong>Required.</strong> The metadata value. */
              public Builder setValue(String value) {
                this.value = value;
                return this;
              }
            }
          }
        }

        public enum BillableItemType implements ApiRequestParams.EnumParam {
          @SerializedName("licensed")
          LICENSED("licensed"),

          @SerializedName("metered")
          METERED("metered");

          @Getter(onMethod_ = {@Override})
          private final String value;

          BillableItemType(String value) {
            this.value = value;
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
        @SerializedName("contract_start")
        CONTRACT_START("contract_start"),

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
      @SerializedName("multiplier")
      MULTIPLIER("multiplier");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
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
