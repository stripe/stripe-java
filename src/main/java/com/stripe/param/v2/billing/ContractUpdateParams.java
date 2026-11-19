// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import com.stripe.v2.Amount;
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
public class ContractUpdateParams extends ApiRequestParams {
  /** Apply all term actions atomically. */
  @SerializedName("actions")
  List<ContractUpdateParams.Action> actions;

  /** The billing settings to update on the contract. */
  @SerializedName("billing_settings")
  BillingSettings billingSettings;

  /**
   * The unique user-provided contract number. This can only be changed while the contract is in
   * draft.
   */
  @SerializedName("contract_number")
  Object contractNumber;

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
  List<ContractUpdateParams.Include> include;

  /** Set of key-value pairs. */
  @SerializedName("metadata")
  Map<String, Object> metadata;

  private ContractUpdateParams(
      List<ContractUpdateParams.Action> actions,
      BillingSettings billingSettings,
      Object contractNumber,
      Map<String, Object> extraParams,
      List<ContractUpdateParams.Include> include,
      Map<String, Object> metadata) {
    this.actions = actions;
    this.billingSettings = billingSettings;
    this.contractNumber = contractNumber;
    this.extraParams = extraParams;
    this.include = include;
    this.metadata = metadata;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<ContractUpdateParams.Action> actions;

    private BillingSettings billingSettings;

    private Object contractNumber;

    private Map<String, Object> extraParams;

    private List<ContractUpdateParams.Include> include;

    private Map<String, Object> metadata;

    /** Finalize and obtain parameter instance from this builder. */
    public ContractUpdateParams build() {
      return new ContractUpdateParams(
          this.actions,
          this.billingSettings,
          this.contractNumber,
          this.extraParams,
          this.include,
          this.metadata);
    }

    /**
     * Add an element to `actions` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#actions} for the field documentation.
     */
    public Builder addAction(ContractUpdateParams.Action element) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.add(element);
      return this;
    }

    /**
     * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#actions} for the field documentation.
     */
    public Builder addAllAction(List<ContractUpdateParams.Action> elements) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.addAll(elements);
      return this;
    }

    /** The billing settings to update on the contract. */
    public Builder setBillingSettings(ContractUpdateParams.BillingSettings billingSettings) {
      this.billingSettings = billingSettings;
      return this;
    }

    /**
     * The unique user-provided contract number. This can only be changed while the contract is in
     * draft.
     */
    public Builder setContractNumber(String contractNumber) {
      this.contractNumber = contractNumber;
      return this;
    }

    /**
     * The unique user-provided contract number. This can only be changed while the contract is in
     * draft.
     */
    public Builder setContractNumber(EmptyParam contractNumber) {
      this.contractNumber = contractNumber;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#extraParams} for the field documentation.
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
     * See {@link ContractUpdateParams#extraParams} for the field documentation.
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
     * ContractUpdateParams#include} for the field documentation.
     */
    public Builder addInclude(ContractUpdateParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ContractUpdateParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<ContractUpdateParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, EmptyParam value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * Map values can only be one of the following types: `String`, `EmptyParam`. See {@link
     * ContractUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, Object> map) {
      if (!map.values().stream().allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
        throw new IllegalArgumentException(
            "All map values must one of the following types: String, EmptyParam");
      }
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Action {
    /** Prepend a term, preserving relative order among additions in this request. */
    @SerializedName("add_term")
    AddTerm addTerm;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Remove a term that has not started. */
    @SerializedName("remove_term")
    RemoveTerm removeTerm;

    /** <strong>Required.</strong> The action type. Exactly one matching payload is required. */
    @SerializedName("type")
    Type type;

    /** Edit a term without changing its display position. */
    @SerializedName("update_term")
    UpdateTerm updateTerm;

    private Action(
        AddTerm addTerm,
        Map<String, Object> extraParams,
        RemoveTerm removeTerm,
        Type type,
        UpdateTerm updateTerm) {
      this.addTerm = addTerm;
      this.extraParams = extraParams;
      this.removeTerm = removeTerm;
      this.type = type;
      this.updateTerm = updateTerm;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AddTerm addTerm;

      private Map<String, Object> extraParams;

      private RemoveTerm removeTerm;

      private Type type;

      private UpdateTerm updateTerm;

      /** Finalize and obtain parameter instance from this builder. */
      public ContractUpdateParams.Action build() {
        return new ContractUpdateParams.Action(
            this.addTerm, this.extraParams, this.removeTerm, this.type, this.updateTerm);
      }

      /** Prepend a term, preserving relative order among additions in this request. */
      public Builder setAddTerm(ContractUpdateParams.Action.AddTerm addTerm) {
        this.addTerm = addTerm;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractUpdateParams.Action#extraParams} for the field documentation.
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
       * See {@link ContractUpdateParams.Action#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Remove a term that has not started. */
      public Builder setRemoveTerm(ContractUpdateParams.Action.RemoveTerm removeTerm) {
        this.removeTerm = removeTerm;
        return this;
      }

      /** <strong>Required.</strong> The action type. Exactly one matching payload is required. */
      public Builder setType(ContractUpdateParams.Action.Type type) {
        this.type = type;
        return this;
      }

      /** Edit a term without changing its display position. */
      public Builder setUpdateTerm(ContractUpdateParams.Action.UpdateTerm updateTerm) {
        this.updateTerm = updateTerm;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AddTerm {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Lookup key unique across all term types on the contract. */
      @SerializedName("lookup_key")
      Object lookupKey;

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

      private AddTerm(
          Map<String, Object> extraParams,
          Object lookupKey,
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

        private Object lookupKey;

        private Map<String, String> metadata;

        private PricingOverride pricingOverride;

        private RecurringPrice recurringPrice;

        private ScheduledFee scheduledFee;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.Action.AddTerm build() {
          return new ContractUpdateParams.Action.AddTerm(
              this.extraParams,
              this.lookupKey,
              this.metadata,
              this.pricingOverride,
              this.recurringPrice,
              this.scheduledFee,
              this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.Action.AddTerm#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.Action.AddTerm#extraParams} for the field
         * documentation.
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

        /** Lookup key unique across all term types on the contract. */
        public Builder setLookupKey(EmptyParam lookupKey) {
          this.lookupKey = lookupKey;
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.Action.AddTerm#metadata} for the field documentation.
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
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.Action.AddTerm#metadata} for the field
         * documentation.
         */
        public Builder putAllMetadata(Map<String, String> map) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** Required when type is pricing_override. */
        public Builder setPricingOverride(
            ContractUpdateParams.Action.AddTerm.PricingOverride pricingOverride) {
          this.pricingOverride = pricingOverride;
          return this;
        }

        /** Required when type is recurring_price. */
        public Builder setRecurringPrice(
            ContractUpdateParams.Action.AddTerm.RecurringPrice recurringPrice) {
          this.recurringPrice = recurringPrice;
          return this;
        }

        /** Required when type is scheduled_fee. */
        public Builder setScheduledFee(
            ContractUpdateParams.Action.AddTerm.ScheduledFee scheduledFee) {
          this.scheduledFee = scheduledFee;
          return this;
        }

        /**
         * <strong>Required.</strong> The term type. Production types require exactly one matching
         * payload.
         */
        public Builder setType(ContractUpdateParams.Action.AddTerm.Type type) {
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
        List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion> criteria;

        /** The exclusive end. Omitted means open-ended. */
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
            List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion> criteria,
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
          private List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion> criteria;

          private EndsAt endsAt;

          private Map<String, Object> extraParams;

          private Multiply multiply;

          private Overwrite overwrite;

          private Long priority;

          private StartsAt startsAt;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.AddTerm.PricingOverride build() {
            return new ContractUpdateParams.Action.AddTerm.PricingOverride(
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
           * Add an element to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.Action.AddTerm.PricingOverride#criteria} for the field
           * documentation.
           */
          public Builder addCriterion(
              ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion element) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.add(element);
            return this;
          }

          /**
           * Add all elements to `criteria` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * ContractUpdateParams.Action.AddTerm.PricingOverride#criteria} for the field
           * documentation.
           */
          public Builder addAllCriterion(
              List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion> elements) {
            if (this.criteria == null) {
              this.criteria = new ArrayList<>();
            }
            this.criteria.addAll(elements);
            return this;
          }

          /** The exclusive end. Omitted means open-ended. */
          public Builder setEndsAt(
              ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt endsAt) {
            this.endsAt = endsAt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.AddTerm.PricingOverride#extraParams} for
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
           * map. See {@link ContractUpdateParams.Action.AddTerm.PricingOverride#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Required when type is multiply. */
          public Builder setMultiply(
              ContractUpdateParams.Action.AddTerm.PricingOverride.Multiply multiply) {
            this.multiply = multiply;
            return this;
          }

          /** Required when type is overwrite. */
          public Builder setOverwrite(
              ContractUpdateParams.Action.AddTerm.PricingOverride.Overwrite overwrite) {
            this.overwrite = overwrite;
            return this;
          }

          /** Lower numbers win; defaults to 50. */
          public Builder setPriority(Long priority) {
            this.priority = priority;
            return this;
          }

          /** <strong>Required.</strong> The inclusive start of the validity window. */
          public Builder setStartsAt(
              ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt startsAt) {
            this.startsAt = startsAt;
            return this;
          }

          /**
           * <strong>Required.</strong> The pricing operation. Exactly one matching pricing payload
           * is required.
           */
          public Builder setType(ContractUpdateParams.Action.AddTerm.PricingOverride.Type type) {
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /**
           * Term selectors. Each ID or lookup key resolves to one fixed term ID. Omitted or empty
           * selects all charge-bearing terms. Override terms cannot be targets.
           */
          @SerializedName("terms")
          List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term> terms;

          /**
           * <strong>Required.</strong> Whether to include or exclude the selected recurring or
           * scheduled_fee terms.
           */
          @SerializedName("type")
          Type type;

          private Criterion(
              Map<String, Object> extraParams,
              List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term> terms,
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

            private List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term> terms;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion build() {
              return new ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion(
                  this.extraParams, this.terms, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion#extraParams} for the
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
             * Add an element to `terms` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion#terms} for the field
             * documentation.
             */
            public Builder addTerm(
                ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term element) {
              if (this.terms == null) {
                this.terms = new ArrayList<>();
              }
              this.terms.add(element);
              return this;
            }

            /**
             * Add all elements to `terms` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion#terms} for the field
             * documentation.
             */
            public Builder addAllTerm(
                List<ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term> elements) {
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
            public Builder setType(
                ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Term {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Select this term by its stable ID. */
            @SerializedName("id")
            Object id;

            /** Select this term by its unique lookup key. */
            @SerializedName("lookup_key")
            Object lookupKey;

            /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
            @SerializedName("type")
            Type type;

            private Term(Map<String, Object> extraParams, Object id, Object lookupKey, Type type) {
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

              private Object id;

              private Object lookupKey;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term build() {
                return new ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term(
                    this.extraParams, this.id, this.lookupKey, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term#extraParams} for
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
               * ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term#extraParams} for
               * the field documentation.
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

              /** Select this term by its stable ID. */
              public Builder setId(EmptyParam id) {
                this.id = id;
                return this;
              }

              /** Select this term by its unique lookup key. */
              public Builder setLookupKey(String lookupKey) {
                this.lookupKey = lookupKey;
                return this;
              }

              /** Select this term by its unique lookup key. */
              public Builder setLookupKey(EmptyParam lookupKey) {
                this.lookupKey = lookupKey;
                return this;
              }

              /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
              public Builder setType(
                  ContractUpdateParams.Action.AddTerm.PricingOverride.Criterion.Term.Type type) {
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
            public ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt build() {
              return new ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt#extraParams} for the field
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
             * ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt#extraParams} for the field
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
            public Builder setType(
                ContractUpdateParams.Action.AddTerm.PricingOverride.EndsAt.Type type) {
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The multiplier, for example 0.85 for a 15% discount. */
          @SerializedName("factor")
          Object factor;

          private Multiply(Map<String, Object> extraParams, Object factor) {
            this.extraParams = extraParams;
            this.factor = factor;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object factor;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.Action.AddTerm.PricingOverride.Multiply build() {
              return new ContractUpdateParams.Action.AddTerm.PricingOverride.Multiply(
                  this.extraParams, this.factor);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Multiply#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Multiply#extraParams} for the
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

            /** <strong>Required.</strong> The multiplier, for example 0.85 for a 15% discount. */
            public Builder setFactor(EmptyParam factor) {
              this.factor = factor;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Overwrite {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** The replacement per-unit amount in minor currency units. */
          @SerializedName("unit_amount_decimal")
          Object unitAmountDecimal;

          private Overwrite(Map<String, Object> extraParams, Object unitAmountDecimal) {
            this.extraParams = extraParams;
            this.unitAmountDecimal = unitAmountDecimal;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Object unitAmountDecimal;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.Action.AddTerm.PricingOverride.Overwrite build() {
              return new ContractUpdateParams.Action.AddTerm.PricingOverride.Overwrite(
                  this.extraParams, this.unitAmountDecimal);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Overwrite#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.PricingOverride.Overwrite#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** The replacement per-unit amount in minor currency units. */
            public Builder setUnitAmountDecimal(BigDecimal unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
            }

            /** The replacement per-unit amount in minor currency units. */
            public Builder setUnitAmountDecimal(EmptyParam unitAmountDecimal) {
              this.unitAmountDecimal = unitAmountDecimal;
              return this;
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
            public ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt build() {
              return new ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt#extraParams} for the
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
                ContractUpdateParams.Action.AddTerm.PricingOverride.StartsAt.Type type) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The V1 recurring Price. */
        @SerializedName("price")
        Object price;

        /** Initial licensed quantity. Defaults to 1; must be omitted for metered Prices. */
        @SerializedName("quantity")
        Object quantity;

        /** <strong>Required.</strong> The inclusive start of the term. */
        @SerializedName("starts_at")
        StartsAt startsAt;

        private RecurringPrice(
            EndsAt endsAt,
            Map<String, Object> extraParams,
            Object price,
            Object quantity,
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

          private Object price;

          private Object quantity;

          private StartsAt startsAt;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.AddTerm.RecurringPrice build() {
            return new ContractUpdateParams.Action.AddTerm.RecurringPrice(
                this.endsAt, this.extraParams, this.price, this.quantity, this.startsAt);
          }

          /** The exclusive end. Omitted means open-ended. */
          public Builder setEndsAt(
              ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt endsAt) {
            this.endsAt = endsAt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.AddTerm.RecurringPrice#extraParams} for the
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
           * map. See {@link ContractUpdateParams.Action.AddTerm.RecurringPrice#extraParams} for the
           * field documentation.
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

          /** <strong>Required.</strong> The V1 recurring Price. */
          public Builder setPrice(EmptyParam price) {
            this.price = price;
            return this;
          }

          /** Initial licensed quantity. Defaults to 1; must be omitted for metered Prices. */
          public Builder setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
            return this;
          }

          /** Initial licensed quantity. Defaults to 1; must be omitted for metered Prices. */
          public Builder setQuantity(EmptyParam quantity) {
            this.quantity = quantity;
            return this;
          }

          /** <strong>Required.</strong> The inclusive start of the term. */
          public Builder setStartsAt(
              ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt startsAt) {
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
            public ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt build() {
              return new ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt#extraParams} for the field
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
             * ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt#extraParams} for the field
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
            public Builder setType(
                ContractUpdateParams.Action.AddTerm.RecurringPrice.EndsAt.Type type) {
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
            public ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt build() {
              return new ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt#extraParams} for the
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
                ContractUpdateParams.Action.AddTerm.RecurringPrice.StartsAt.Type type) {
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
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The V1 Product being billed. */
        @SerializedName("product")
        Object product;

        /** Informational service period, independent of bill dates. */
        @SerializedName("service_period")
        ServicePeriod servicePeriod;

        private ScheduledFee(
            BillSchedule billSchedule,
            Map<String, Object> extraParams,
            Object product,
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

          private Object product;

          private ServicePeriod servicePeriod;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.AddTerm.ScheduledFee build() {
            return new ContractUpdateParams.Action.AddTerm.ScheduledFee(
                this.billSchedule, this.extraParams, this.product, this.servicePeriod);
          }

          /** <strong>Required.</strong> Explicit bill dates and amounts. */
          public Builder setBillSchedule(
              ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule billSchedule) {
            this.billSchedule = billSchedule;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.AddTerm.ScheduledFee#extraParams} for the
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
           * map. See {@link ContractUpdateParams.Action.AddTerm.ScheduledFee#extraParams} for the
           * field documentation.
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

          /** <strong>Required.</strong> The V1 Product being billed. */
          public Builder setProduct(EmptyParam product) {
            this.product = product;
            return this;
          }

          /** Informational service period, independent of bill dates. */
          public Builder setServicePeriod(
              ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BillSchedule {
          /** Between one and ten installments. Empty schedules are allowed only on update. */
          @SerializedName("custom")
          List<ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom> custom;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The type of schedule. */
          @SerializedName("type")
          Type type;

          private BillSchedule(
              List<ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom> custom,
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
            private List<ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom>
                custom;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule build() {
              return new ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule(
                  this.custom, this.extraParams, this.type);
            }

            /**
             * Add an element to `custom` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule#custom} for the field
             * documentation.
             */
            public Builder addCustom(
                ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom element) {
              if (this.custom == null) {
                this.custom = new ArrayList<>();
              }
              this.custom.add(element);
              return this;
            }

            /**
             * Add all elements to `custom` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule#custom} for the field
             * documentation.
             */
            public Builder addAllCustom(
                List<ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom>
                    elements) {
              if (this.custom == null) {
                this.custom = new ArrayList<>();
              }
              this.custom.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The type of schedule. */
            public Builder setType(
                ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Custom {
            /**
             * <strong>Required.</strong> Non-negative amount with an explicit currency that must
             * match the contract's currency.
             */
            @SerializedName("amount")
            Amount amount;

            /**
             * <strong>Required.</strong> A finite bill date. Resolved once per request, including
             * on idempotent retries.
             */
            @SerializedName("bill_at")
            BillAt billAt;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Custom(Amount amount, BillAt billAt, Map<String, Object> extraParams) {
              this.amount = amount;
              this.billAt = billAt;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Amount amount;

              private BillAt billAt;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom build() {
                return new ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom(
                    this.amount, this.billAt, this.extraParams);
              }

              /**
               * <strong>Required.</strong> Non-negative amount with an explicit currency that must
               * match the contract's currency.
               */
              public Builder setAmount(Amount amount) {
                this.amount = amount;
                return this;
              }

              /**
               * <strong>Required.</strong> A finite bill date. Resolved once per request, including
               * on idempotent retries.
               */
              public Builder setBillAt(
                  ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom.BillAt
                      billAt) {
                this.billAt = billAt;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom#extraParams}
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
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom#extraParams}
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
            public static class BillAt {
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
               * The timestamp at which the entry should be billed. Required if {@code type} is
               * {@code timestamp}.
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
                public ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom.BillAt
                    build() {
                  return new ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom
                      .BillAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom.BillAt#extraParams}
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
                 * ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom.BillAt#extraParams}
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
                 * The timestamp at which the entry should be billed. Required if {@code type} is
                 * {@code timestamp}.
                 */
                public Builder setTimestamp(Instant timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /** <strong>Required.</strong> The type of the bill_at. */
                public Builder setType(
                    ContractUpdateParams.Action.AddTerm.ScheduledFee.BillSchedule.Custom.BillAt.Type
                        type) {
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod build() {
              return new ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod(
                  this.endsAt, this.extraParams, this.startsAt);
            }

            /**
             * <strong>Required.</strong> The finite exclusive end; must be after starts_at. Never
             * is not supported.
             */
            public Builder setEndsAt(
                ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt endsAt) {
              this.endsAt = endsAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod#extraParams} for the
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
             * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod#extraParams} for the
             * field documentation.
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
                ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt startsAt) {
              this.startsAt = startsAt;
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

            /**
             * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
             */
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
              public ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt build() {
                return new ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt(
                    this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt#extraParams}
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
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt#extraParams}
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
                  ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.EndsAt.Type type) {
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
              public ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt
                  build() {
                return new ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt(
                    this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt#extraParams}
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
               * ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt#extraParams}
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
                  ContractUpdateParams.Action.AddTerm.ScheduledFee.ServicePeriod.StartsAt.Type
                      type) {
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class RemoveTerm {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Select a term by ID or its unique lookup key. */
      @SerializedName("term")
      Term term;

      private RemoveTerm(Map<String, Object> extraParams, Term term) {
        this.extraParams = extraParams;
        this.term = term;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Term term;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.Action.RemoveTerm build() {
          return new ContractUpdateParams.Action.RemoveTerm(this.extraParams, this.term);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.Action.RemoveTerm#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.Action.RemoveTerm#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Select a term by ID or its unique lookup key. */
        public Builder setTerm(ContractUpdateParams.Action.RemoveTerm.Term term) {
          this.term = term;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Term {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Select this term by its stable ID. */
        @SerializedName("id")
        Object id;

        /** Select this term by its unique lookup key. */
        @SerializedName("lookup_key")
        Object lookupKey;

        /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
        @SerializedName("type")
        Type type;

        private Term(Map<String, Object> extraParams, Object id, Object lookupKey, Type type) {
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

          private Object id;

          private Object lookupKey;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.RemoveTerm.Term build() {
            return new ContractUpdateParams.Action.RemoveTerm.Term(
                this.extraParams, this.id, this.lookupKey, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.RemoveTerm.Term#extraParams} for the field
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
           * map. See {@link ContractUpdateParams.Action.RemoveTerm.Term#extraParams} for the field
           * documentation.
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

          /** Select this term by its stable ID. */
          public Builder setId(EmptyParam id) {
            this.id = id;
            return this;
          }

          /** Select this term by its unique lookup key. */
          public Builder setLookupKey(String lookupKey) {
            this.lookupKey = lookupKey;
            return this;
          }

          /** Select this term by its unique lookup key. */
          public Builder setLookupKey(EmptyParam lookupKey) {
            this.lookupKey = lookupKey;
            return this;
          }

          /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
          public Builder setType(ContractUpdateParams.Action.RemoveTerm.Term.Type type) {
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
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UpdateTerm {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Metadata changes to apply immediately. */
      @SerializedName("metadata")
      Map<String, Object> metadata;

      /** Only validity dates can change; pricing, criteria, and priority are immutable. */
      @SerializedName("pricing_override")
      PricingOverride pricingOverride;

      /** Must match the existing term's type. */
      @SerializedName("recurring_price")
      RecurringPrice recurringPrice;

      /** Must match the existing term's type. */
      @SerializedName("scheduled_fee")
      ScheduledFee scheduledFee;

      /** <strong>Required.</strong> Select a term by ID or its unique lookup key. */
      @SerializedName("term")
      Term term;

      private UpdateTerm(
          Map<String, Object> extraParams,
          Map<String, Object> metadata,
          PricingOverride pricingOverride,
          RecurringPrice recurringPrice,
          ScheduledFee scheduledFee,
          Term term) {
        this.extraParams = extraParams;
        this.metadata = metadata;
        this.pricingOverride = pricingOverride;
        this.recurringPrice = recurringPrice;
        this.scheduledFee = scheduledFee;
        this.term = term;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private Map<String, Object> metadata;

        private PricingOverride pricingOverride;

        private RecurringPrice recurringPrice;

        private ScheduledFee scheduledFee;

        private Term term;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.Action.UpdateTerm build() {
          return new ContractUpdateParams.Action.UpdateTerm(
              this.extraParams,
              this.metadata,
              this.pricingOverride,
              this.recurringPrice,
              this.scheduledFee,
              this.term);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.Action.UpdateTerm#extraParams} for the field
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
         * map. See {@link ContractUpdateParams.Action.UpdateTerm#extraParams} for the field
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
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.Action.UpdateTerm#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, String value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
         * call, and subsequent calls add additional key/value pairs to the original map. See {@link
         * ContractUpdateParams.Action.UpdateTerm#metadata} for the field documentation.
         */
        public Builder putMetadata(String key, EmptyParam value) {
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. Map values can only be one of the following types: `String`, `EmptyParam`. See
         * {@link ContractUpdateParams.Action.UpdateTerm#metadata} for the field documentation.
         */
        public Builder putAllMetadata(Map<String, Object> map) {
          if (!map.values().stream()
              .allMatch(v -> v instanceof String || v instanceof EmptyParam)) {
            throw new IllegalArgumentException(
                "All map values must one of the following types: String, EmptyParam");
          }
          if (this.metadata == null) {
            this.metadata = new HashMap<>();
          }
          this.metadata.putAll(map);
          return this;
        }

        /** Only validity dates can change; pricing, criteria, and priority are immutable. */
        public Builder setPricingOverride(
            ContractUpdateParams.Action.UpdateTerm.PricingOverride pricingOverride) {
          this.pricingOverride = pricingOverride;
          return this;
        }

        /** Must match the existing term's type. */
        public Builder setRecurringPrice(
            ContractUpdateParams.Action.UpdateTerm.RecurringPrice recurringPrice) {
          this.recurringPrice = recurringPrice;
          return this;
        }

        /** Must match the existing term's type. */
        public Builder setScheduledFee(
            ContractUpdateParams.Action.UpdateTerm.ScheduledFee scheduledFee) {
          this.scheduledFee = scheduledFee;
          return this;
        }

        /** <strong>Required.</strong> Select a term by ID or its unique lookup key. */
        public Builder setTerm(ContractUpdateParams.Action.UpdateTerm.Term term) {
          this.term = term;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PricingOverride {
        /** Omission leaves the end unchanged; never requests an open end. */
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

        /** Can change only before the override starts. Accepts timestamp or now. */
        @SerializedName("starts_at")
        StartsAt startsAt;

        private PricingOverride(EndsAt endsAt, Map<String, Object> extraParams, StartsAt startsAt) {
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
          public ContractUpdateParams.Action.UpdateTerm.PricingOverride build() {
            return new ContractUpdateParams.Action.UpdateTerm.PricingOverride(
                this.endsAt, this.extraParams, this.startsAt);
          }

          /** Omission leaves the end unchanged; never requests an open end. */
          public Builder setEndsAt(
              ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt endsAt) {
            this.endsAt = endsAt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.PricingOverride#extraParams} for
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
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.PricingOverride#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Can change only before the override starts. Accepts timestamp or now. */
          public Builder setStartsAt(
              ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt startsAt) {
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
            public ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt build() {
              return new ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt#extraParams} for the
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
             * ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt#extraParams} for the
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
            public Builder setType(
                ContractUpdateParams.Action.UpdateTerm.PricingOverride.EndsAt.Type type) {
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
            public ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt build() {
              return new ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt#extraParams} for the
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
             * ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt#extraParams} for the
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
                ContractUpdateParams.Action.UpdateTerm.PricingOverride.StartsAt.Type type) {
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
      public static class RecurringPrice {
        /** Omission leaves the end unchanged; never requests an open end. */
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

        /**
         * Update an active term's licensed quantity at the contract's current clock time, or an
         * unstarted term's initial quantity, preserving its ID. Ended terms cannot change quantity.
         */
        @SerializedName("quantity")
        Object quantity;

        /** Reschedule an unstarted term in place. */
        @SerializedName("starts_at")
        StartsAt startsAt;

        private RecurringPrice(
            EndsAt endsAt, Map<String, Object> extraParams, Object quantity, StartsAt startsAt) {
          this.endsAt = endsAt;
          this.extraParams = extraParams;
          this.quantity = quantity;
          this.startsAt = startsAt;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private EndsAt endsAt;

          private Map<String, Object> extraParams;

          private Object quantity;

          private StartsAt startsAt;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.UpdateTerm.RecurringPrice build() {
            return new ContractUpdateParams.Action.UpdateTerm.RecurringPrice(
                this.endsAt, this.extraParams, this.quantity, this.startsAt);
          }

          /** Omission leaves the end unchanged; never requests an open end. */
          public Builder setEndsAt(
              ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt endsAt) {
            this.endsAt = endsAt;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.RecurringPrice#extraParams} for
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
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.RecurringPrice#extraParams} for
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
           * Update an active term's licensed quantity at the contract's current clock time, or an
           * unstarted term's initial quantity, preserving its ID. Ended terms cannot change
           * quantity.
           */
          public Builder setQuantity(BigDecimal quantity) {
            this.quantity = quantity;
            return this;
          }

          /**
           * Update an active term's licensed quantity at the contract's current clock time, or an
           * unstarted term's initial quantity, preserving its ID. Ended terms cannot change
           * quantity.
           */
          public Builder setQuantity(EmptyParam quantity) {
            this.quantity = quantity;
            return this;
          }

          /** Reschedule an unstarted term in place. */
          public Builder setStartsAt(
              ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt startsAt) {
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
            public ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt build() {
              return new ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt#extraParams} for the
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
             * ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt#extraParams} for the
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
            public Builder setType(
                ContractUpdateParams.Action.UpdateTerm.RecurringPrice.EndsAt.Type type) {
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
            public ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt build() {
              return new ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt(
                  this.extraParams, this.timestamp, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt#extraParams} for the
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
             * ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt#extraParams} for the
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
                ContractUpdateParams.Action.UpdateTerm.RecurringPrice.StartsAt.Type type) {
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
        /** Replace remaining unbilled installments. Billed entries remain immutable. */
        @SerializedName("bill_schedule")
        BillSchedule billSchedule;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Informational service period; cannot change historical billing. */
        @SerializedName("service_period")
        ServicePeriod servicePeriod;

        private ScheduledFee(
            BillSchedule billSchedule,
            Map<String, Object> extraParams,
            ServicePeriod servicePeriod) {
          this.billSchedule = billSchedule;
          this.extraParams = extraParams;
          this.servicePeriod = servicePeriod;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private BillSchedule billSchedule;

          private Map<String, Object> extraParams;

          private ServicePeriod servicePeriod;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.UpdateTerm.ScheduledFee build() {
            return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee(
                this.billSchedule, this.extraParams, this.servicePeriod);
          }

          /** Replace remaining unbilled installments. Billed entries remain immutable. */
          public Builder setBillSchedule(
              ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule billSchedule) {
            this.billSchedule = billSchedule;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.ScheduledFee#extraParams} for
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
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.ScheduledFee#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Informational service period; cannot change historical billing. */
          public Builder setServicePeriod(
              ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod servicePeriod) {
            this.servicePeriod = servicePeriod;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class BillSchedule {
          /**
           * Full replacement of up to ten unbilled installments. An explicit empty array cancels
           * all of them.
           */
          @SerializedName("custom")
          List<ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom> custom;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The type of schedule. */
          @SerializedName("type")
          Type type;

          private BillSchedule(
              List<ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom> custom,
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
            private List<ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom>
                custom;

            private Map<String, Object> extraParams;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule build() {
              return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule(
                  this.custom, this.extraParams, this.type);
            }

            /**
             * Add an element to `custom` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule#custom} for the
             * field documentation.
             */
            public Builder addCustom(
                ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom element) {
              if (this.custom == null) {
                this.custom = new ArrayList<>();
              }
              this.custom.add(element);
              return this;
            }

            /**
             * Add all elements to `custom` list. A list is initialized for the first `add/addAll`
             * call, and subsequent calls adds additional elements to the original list. See {@link
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule#custom} for the
             * field documentation.
             */
            public Builder addAllCustom(
                List<ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom>
                    elements) {
              if (this.custom == null) {
                this.custom = new ArrayList<>();
              }
              this.custom.addAll(elements);
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule#extraParams} for the
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
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule#extraParams} for the
             * field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The type of schedule. */
            public Builder setType(
                ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Custom {
            /**
             * <strong>Required.</strong> Non-negative amount with an explicit currency that must
             * match the contract's currency.
             */
            @SerializedName("amount")
            Amount amount;

            /**
             * <strong>Required.</strong> A finite bill date. Resolved once per request, including
             * on idempotent retries.
             */
            @SerializedName("bill_at")
            BillAt billAt;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private Custom(Amount amount, BillAt billAt, Map<String, Object> extraParams) {
              this.amount = amount;
              this.billAt = billAt;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Amount amount;

              private BillAt billAt;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom
                  build() {
                return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom(
                    this.amount, this.billAt, this.extraParams);
              }

              /**
               * <strong>Required.</strong> Non-negative amount with an explicit currency that must
               * match the contract's currency.
               */
              public Builder setAmount(Amount amount) {
                this.amount = amount;
                return this;
              }

              /**
               * <strong>Required.</strong> A finite bill date. Resolved once per request, including
               * on idempotent retries.
               */
              public Builder setBillAt(
                  ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom.BillAt
                      billAt) {
                this.billAt = billAt;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom#extraParams}
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
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom#extraParams}
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
            public static class BillAt {
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
               * The timestamp at which the entry should be billed. Required if {@code type} is
               * {@code timestamp}.
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
                public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom
                        .BillAt
                    build() {
                  return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom
                      .BillAt(this.extraParams, this.timestamp, this.type);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom.BillAt#extraParams}
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
                 * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom.BillAt#extraParams}
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
                 * The timestamp at which the entry should be billed. Required if {@code type} is
                 * {@code timestamp}.
                 */
                public Builder setTimestamp(Instant timestamp) {
                  this.timestamp = timestamp;
                  return this;
                }

                /** <strong>Required.</strong> The type of the bill_at. */
                public Builder setType(
                    ContractUpdateParams.Action.UpdateTerm.ScheduledFee.BillSchedule.Custom.BillAt
                            .Type
                        type) {
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
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
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
            public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod build() {
              return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod(
                  this.endsAt, this.extraParams, this.startsAt);
            }

            /**
             * <strong>Required.</strong> The finite exclusive end; must be after starts_at. Never
             * is not supported.
             */
            public Builder setEndsAt(
                ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt endsAt) {
              this.endsAt = endsAt;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod#extraParams} for
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
             * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod#extraParams} for
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
                ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.StartsAt
                    startsAt) {
              this.startsAt = startsAt;
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

            /**
             * The timestamp when the item starts. Required if {@code type} is {@code timestamp}.
             */
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
              public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt
                  build() {
                return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt(
                    this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt#extraParams}
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
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt#extraParams}
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
                  ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.EndsAt.Type
                      type) {
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
              public ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.StartsAt
                  build() {
                return new ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod
                    .StartsAt(this.extraParams, this.timestamp, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.StartsAt#extraParams}
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
               * ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.StartsAt#extraParams}
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
                  ContractUpdateParams.Action.UpdateTerm.ScheduledFee.ServicePeriod.StartsAt.Type
                      type) {
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class Term {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Select this term by its stable ID. */
        @SerializedName("id")
        Object id;

        /** Select this term by its unique lookup key. */
        @SerializedName("lookup_key")
        Object lookupKey;

        /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
        @SerializedName("type")
        Type type;

        private Term(Map<String, Object> extraParams, Object id, Object lookupKey, Type type) {
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

          private Object id;

          private Object lookupKey;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public ContractUpdateParams.Action.UpdateTerm.Term build() {
            return new ContractUpdateParams.Action.UpdateTerm.Term(
                this.extraParams, this.id, this.lookupKey, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.Term#extraParams} for the field
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
           * map. See {@link ContractUpdateParams.Action.UpdateTerm.Term#extraParams} for the field
           * documentation.
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

          /** Select this term by its stable ID. */
          public Builder setId(EmptyParam id) {
            this.id = id;
            return this;
          }

          /** Select this term by its unique lookup key. */
          public Builder setLookupKey(String lookupKey) {
            this.lookupKey = lookupKey;
            return this;
          }

          /** Select this term by its unique lookup key. */
          public Builder setLookupKey(EmptyParam lookupKey) {
            this.lookupKey = lookupKey;
            return this;
          }

          /** <strong>Required.</strong> Whether the selector uses a term ID or lookup key. */
          public Builder setType(ContractUpdateParams.Action.UpdateTerm.Term.Type type) {
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
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("add_term")
      ADD_TERM("add_term"),

      @SerializedName("remove_term")
      REMOVE_TERM("remove_term"),

      @SerializedName("update_term")
      UPDATE_TERM("update_term");

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
    /** The bill settings to update (tax calculation type and/or invoice time until due). */
    @SerializedName("bill_settings_details")
    BillSettingsDetails billSettingsDetails;

    /** The billing profile details to update. */
    @SerializedName("billing_profile_details")
    BillingProfileDetails billingProfileDetails;

    /** The collection settings details to update on the contract. */
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
      public ContractUpdateParams.BillingSettings build() {
        return new ContractUpdateParams.BillingSettings(
            this.billSettingsDetails,
            this.billingProfileDetails,
            this.collectionSettingsDetails,
            this.extraParams);
      }

      /** The bill settings to update (tax calculation type and/or invoice time until due). */
      public Builder setBillSettingsDetails(
          ContractUpdateParams.BillingSettings.BillSettingsDetails billSettingsDetails) {
        this.billSettingsDetails = billSettingsDetails;
        return this;
      }

      /** The billing profile details to update. */
      public Builder setBillingProfileDetails(
          ContractUpdateParams.BillingSettings.BillingProfileDetails billingProfileDetails) {
        this.billingProfileDetails = billingProfileDetails;
        return this;
      }

      /** The collection settings details to update on the contract. */
      public Builder setCollectionSettingsDetails(
          ContractUpdateParams.BillingSettings.CollectionSettingsDetails
              collectionSettingsDetails) {
        this.collectionSettingsDetails = collectionSettingsDetails;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ContractUpdateParams.BillingSettings#extraParams} for the field documentation.
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
       * See {@link ContractUpdateParams.BillingSettings#extraParams} for the field documentation.
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
      /** The tax calculation settings to update. */
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

      /** The invoice settings to update. */
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
        public ContractUpdateParams.BillingSettings.BillSettingsDetails build() {
          return new ContractUpdateParams.BillingSettings.BillSettingsDetails(
              this.calculation, this.extraParams, this.invoice);
        }

        /** The tax calculation settings to update. */
        public Builder setCalculation(
            ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation calculation) {
          this.calculation = calculation;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.BillingSettings.BillSettingsDetails#extraParams} for
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
         * map. See {@link ContractUpdateParams.BillingSettings.BillSettingsDetails#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The invoice settings to update. */
        public Builder setInvoice(
            ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice invoice) {
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
          public ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation build() {
            return new ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation(
                this.extraParams, this.tax);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation#extraParams} for
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
           * ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation#extraParams} for
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
              ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax tax) {
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
            public ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax
                build() {
              return new ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax(
                  this.extraParams, this.type);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax#extraParams}
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
             * ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax#extraParams}
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
                ContractUpdateParams.BillingSettings.BillSettingsDetails.Calculation.Tax.Type
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
          public ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice build() {
            return new ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice(
                this.extraParams, this.timeUntilDue);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice#extraParams} for the
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
           * ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice#extraParams} for the
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
              ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
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
            public ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
                build() {
              return new ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice
                  .TimeUntilDue(this.extraParams, this.interval, this.intervalCount);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
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
             * ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue#extraParams}
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
                ContractUpdateParams.BillingSettings.BillSettingsDetails.Invoice.TimeUntilDue
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
      /** The default payment method to charge for the contract. */
      @SerializedName("default_payment_method")
      Object defaultPaymentMethod;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private BillingProfileDetails(Object defaultPaymentMethod, Map<String, Object> extraParams) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Object defaultPaymentMethod;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.BillingSettings.BillingProfileDetails build() {
          return new ContractUpdateParams.BillingSettings.BillingProfileDetails(
              this.defaultPaymentMethod, this.extraParams);
        }

        /** The default payment method to charge for the contract. */
        public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
          this.defaultPaymentMethod = defaultPaymentMethod;
          return this;
        }

        /** The default payment method to charge for the contract. */
        public Builder setDefaultPaymentMethod(EmptyParam defaultPaymentMethod) {
          this.defaultPaymentMethod = defaultPaymentMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ContractUpdateParams.BillingSettings.BillingProfileDetails#extraParams}
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
         * map. See {@link ContractUpdateParams.BillingSettings.BillingProfileDetails#extraParams}
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
      /**
       * How payment is collected for the contract. An omitted value leaves the collection method
       * unchanged.
       */
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
      Object paymentMethodConfiguration;

      private CollectionSettingsDetails(
          CollectionMethod collectionMethod,
          Map<String, Object> extraParams,
          Object paymentMethodConfiguration) {
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

        private Object paymentMethodConfiguration;

        /** Finalize and obtain parameter instance from this builder. */
        public ContractUpdateParams.BillingSettings.CollectionSettingsDetails build() {
          return new ContractUpdateParams.BillingSettings.CollectionSettingsDetails(
              this.collectionMethod, this.extraParams, this.paymentMethodConfiguration);
        }

        /**
         * How payment is collected for the contract. An omitted value leaves the collection method
         * unchanged.
         */
        public Builder setCollectionMethod(
            ContractUpdateParams.BillingSettings.CollectionSettingsDetails.CollectionMethod
                collectionMethod) {
          this.collectionMethod = collectionMethod;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link
         * ContractUpdateParams.BillingSettings.CollectionSettingsDetails#extraParams} for the field
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
         * ContractUpdateParams.BillingSettings.CollectionSettingsDetails#extraParams} for the field
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

        /** The payment method configuration. */
        public Builder setPaymentMethodConfiguration(EmptyParam paymentMethodConfiguration) {
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
