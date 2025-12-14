// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class IntentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Actions to be performed by this Billing Intent. */
  @SerializedName("actions")
  List<IntentCreateParams.Action> actions;

  /** ID of an existing Cadence to use. */
  @SerializedName("cadence")
  String cadence;

  /**
   * <strong>Required.</strong> Three-letter ISO currency code, in lowercase. Must be a supported
   * currency.
   */
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

  private IntentCreateParams(
      List<IntentCreateParams.Action> actions,
      String cadence,
      String currency,
      Map<String, Object> extraParams) {
    this.actions = actions;
    this.cadence = cadence;
    this.currency = currency;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<IntentCreateParams.Action> actions;

    private String cadence;

    private String currency;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public IntentCreateParams build() {
      return new IntentCreateParams(this.actions, this.cadence, this.currency, this.extraParams);
    }

    /**
     * Add an element to `actions` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * IntentCreateParams#actions} for the field documentation.
     */
    public Builder addAction(IntentCreateParams.Action element) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.add(element);
      return this;
    }

    /**
     * Add all elements to `actions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * IntentCreateParams#actions} for the field documentation.
     */
    public Builder addAllAction(List<IntentCreateParams.Action> elements) {
      if (this.actions == null) {
        this.actions = new ArrayList<>();
      }
      this.actions.addAll(elements);
      return this;
    }

    /** ID of an existing Cadence to use. */
    public Builder setCadence(String cadence) {
      this.cadence = cadence;
      return this;
    }

    /**
     * <strong>Required.</strong> Three-letter ISO currency code, in lowercase. Must be a supported
     * currency.
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * IntentCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link IntentCreateParams#extraParams} for the field documentation.
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
  public static class Action {
    /** Details for an apply action. */
    @SerializedName("apply")
    Apply apply;

    /** Details for a deactivate action. */
    @SerializedName("deactivate")
    Deactivate deactivate;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Details for a modify action. */
    @SerializedName("modify")
    Modify modify;

    /** Details for a remove action. */
    @SerializedName("remove")
    Remove remove;

    /** Details for a subscribe action. */
    @SerializedName("subscribe")
    Subscribe subscribe;

    /** <strong>Required.</strong> Type of the Billing Intent action. */
    @SerializedName("type")
    Type type;

    private Action(
        Apply apply,
        Deactivate deactivate,
        Map<String, Object> extraParams,
        Modify modify,
        Remove remove,
        Subscribe subscribe,
        Type type) {
      this.apply = apply;
      this.deactivate = deactivate;
      this.extraParams = extraParams;
      this.modify = modify;
      this.remove = remove;
      this.subscribe = subscribe;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Apply apply;

      private Deactivate deactivate;

      private Map<String, Object> extraParams;

      private Modify modify;

      private Remove remove;

      private Subscribe subscribe;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public IntentCreateParams.Action build() {
        return new IntentCreateParams.Action(
            this.apply,
            this.deactivate,
            this.extraParams,
            this.modify,
            this.remove,
            this.subscribe,
            this.type);
      }

      /** Details for an apply action. */
      public Builder setApply(IntentCreateParams.Action.Apply apply) {
        this.apply = apply;
        return this;
      }

      /** Details for a deactivate action. */
      public Builder setDeactivate(IntentCreateParams.Action.Deactivate deactivate) {
        this.deactivate = deactivate;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IntentCreateParams.Action#extraParams} for the field documentation.
       */
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
       * See {@link IntentCreateParams.Action#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Details for a modify action. */
      public Builder setModify(IntentCreateParams.Action.Modify modify) {
        this.modify = modify;
        return this;
      }

      /** Details for a remove action. */
      public Builder setRemove(IntentCreateParams.Action.Remove remove) {
        this.remove = remove;
        return this;
      }

      /** Details for a subscribe action. */
      public Builder setSubscribe(IntentCreateParams.Action.Subscribe subscribe) {
        this.subscribe = subscribe;
        return this;
      }

      /** <strong>Required.</strong> Type of the Billing Intent action. */
      public Builder setType(IntentCreateParams.Action.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Apply {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details for applying a discount rule to future invoices. */
      @SerializedName("invoice_discount_rule")
      InvoiceDiscountRule invoiceDiscountRule;

      /** <strong>Required.</strong> Type of the apply action details. */
      @SerializedName("type")
      Type type;

      private Apply(
          Map<String, Object> extraParams, InvoiceDiscountRule invoiceDiscountRule, Type type) {
        this.extraParams = extraParams;
        this.invoiceDiscountRule = invoiceDiscountRule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private InvoiceDiscountRule invoiceDiscountRule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Apply build() {
          return new IntentCreateParams.Action.Apply(
              this.extraParams, this.invoiceDiscountRule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.Action.Apply#extraParams} for the field documentation.
         */
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
         * map. See {@link IntentCreateParams.Action.Apply#extraParams} for the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details for applying a discount rule to future invoices. */
        public Builder setInvoiceDiscountRule(
            IntentCreateParams.Action.Apply.InvoiceDiscountRule invoiceDiscountRule) {
          this.invoiceDiscountRule = invoiceDiscountRule;
          return this;
        }

        /** <strong>Required.</strong> Type of the apply action details. */
        public Builder setType(IntentCreateParams.Action.Apply.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class InvoiceDiscountRule {
        /**
         * <strong>Required.</strong> The entity that the discount rule applies to, for example, the
         * cadence.
         */
        @SerializedName("applies_to")
        AppliesTo appliesTo;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Configuration for percentage off discount. */
        @SerializedName("percent_off")
        PercentOff percentOff;

        /** <strong>Required.</strong> Type of the discount rule. */
        @SerializedName("type")
        Type type;

        private InvoiceDiscountRule(
            AppliesTo appliesTo,
            Map<String, Object> extraParams,
            PercentOff percentOff,
            Type type) {
          this.appliesTo = appliesTo;
          this.extraParams = extraParams;
          this.percentOff = percentOff;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AppliesTo appliesTo;

          private Map<String, Object> extraParams;

          private PercentOff percentOff;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Apply.InvoiceDiscountRule build() {
            return new IntentCreateParams.Action.Apply.InvoiceDiscountRule(
                this.appliesTo, this.extraParams, this.percentOff, this.type);
          }

          /**
           * <strong>Required.</strong> The entity that the discount rule applies to, for example,
           * the cadence.
           */
          public Builder setAppliesTo(
              IntentCreateParams.Action.Apply.InvoiceDiscountRule.AppliesTo appliesTo) {
            this.appliesTo = appliesTo;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Apply.InvoiceDiscountRule#extraParams} for
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
           * map. See {@link IntentCreateParams.Action.Apply.InvoiceDiscountRule#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Configuration for percentage off discount. */
          public Builder setPercentOff(
              IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff percentOff) {
            this.percentOff = percentOff;
            return this;
          }

          /** <strong>Required.</strong> Type of the discount rule. */
          public Builder setType(IntentCreateParams.Action.Apply.InvoiceDiscountRule.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PercentOff {
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
           * <strong>Required.</strong> The maximum number of times this discount can be applied for
           * this cadence.
           */
          @SerializedName("maximum_applications")
          MaximumApplications maximumApplications;

          /**
           * <strong>Required.</strong> Percent that will be taken off of the amount. For example,
           * percent_off of 50.0 will make $100 amount $50 instead.
           */
          @SerializedName("percent_off")
          String percentOff;

          private PercentOff(
              Map<String, Object> extraParams,
              MaximumApplications maximumApplications,
              String percentOff) {
            this.extraParams = extraParams;
            this.maximumApplications = maximumApplications;
            this.percentOff = percentOff;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MaximumApplications maximumApplications;

            private String percentOff;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff build() {
              return new IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff(
                  this.extraParams, this.maximumApplications, this.percentOff);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff#extraParams} for the
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
             * IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff#extraParams} for the
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
             * <strong>Required.</strong> The maximum number of times this discount can be applied
             * for this cadence.
             */
            public Builder setMaximumApplications(
                IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff.MaximumApplications
                    maximumApplications) {
              this.maximumApplications = maximumApplications;
              return this;
            }

            /**
             * <strong>Required.</strong> Percent that will be taken off of the amount. For example,
             * percent_off of 50.0 will make $100 amount $50 instead.
             */
            public Builder setPercentOff(String percentOff) {
              this.percentOff = percentOff;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MaximumApplications {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The type of maximum applications configuration. */
            @SerializedName("type")
            Type type;

            private MaximumApplications(Map<String, Object> extraParams, Type type) {
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
              public IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff
                      .MaximumApplications
                  build() {
                return new IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff
                    .MaximumApplications(this.extraParams, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff.MaximumApplications#extraParams}
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
               * IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff.MaximumApplications#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The type of maximum applications configuration. */
              public Builder setType(
                  IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff.MaximumApplications
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("indefinite")
              INDEFINITE("indefinite");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }

        public enum AppliesTo implements ApiRequestParams.EnumParam {
          @SerializedName("cadence")
          CADENCE("cadence");

          @Getter(onMethod_ = {@Override})
          private final String value;

          AppliesTo(String value) {
            this.value = value;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("percent_off")
          PERCENT_OFF("percent_off");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("invoice_discount_rule")
        INVOICE_DISCOUNT_RULE("invoice_discount_rule");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Deactivate {
      /** Allows users to override the collect at behavior. */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the deactivate action will take effect. If not specified, the default behavior is
       * on_reserve.
       */
      @SerializedName("effective_at")
      EffectiveAt effectiveAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Details for deactivating a pricing plan subscription. */
      @SerializedName("pricing_plan_subscription_details")
      PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

      /** <strong>Required.</strong> Type of the action details. */
      @SerializedName("type")
      Type type;

      private Deactivate(
          CollectAt collectAt,
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails,
          Type type) {
        this.collectAt = collectAt;
        this.effectiveAt = effectiveAt;
        this.extraParams = extraParams;
        this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectAt collectAt;

        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Deactivate build() {
          return new IntentCreateParams.Action.Deactivate(
              this.collectAt,
              this.effectiveAt,
              this.extraParams,
              this.pricingPlanSubscriptionDetails,
              this.type);
        }

        /** Allows users to override the collect at behavior. */
        public Builder setCollectAt(IntentCreateParams.Action.Deactivate.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the deactivate action will take effect. If not specified, the default behavior is
         * on_reserve.
         */
        public Builder setEffectiveAt(
            IntentCreateParams.Action.Deactivate.EffectiveAt effectiveAt) {
          this.effectiveAt = effectiveAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.Action.Deactivate#extraParams} for the field
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
         * map. See {@link IntentCreateParams.Action.Deactivate#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Details for deactivating a pricing plan subscription. */
        public Builder setPricingPlanSubscriptionDetails(
            IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails
                pricingPlanSubscriptionDetails) {
          this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
          return this;
        }

        /** <strong>Required.</strong> Type of the action details. */
        public Builder setType(IntentCreateParams.Action.Deactivate.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EffectiveAt {
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
         * The timestamp at which the deactivate action will take effect. Only present if type is
         * timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the deactivate action will take effect. */
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
          public IntentCreateParams.Action.Deactivate.EffectiveAt build() {
            return new IntentCreateParams.Action.Deactivate.EffectiveAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Deactivate.EffectiveAt#extraParams} for the
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
           * map. See {@link IntentCreateParams.Action.Deactivate.EffectiveAt#extraParams} for the
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
           * The timestamp at which the deactivate action will take effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the deactivate action will take effect. */
          public Builder setType(IntentCreateParams.Action.Deactivate.EffectiveAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("current_billing_period_end")
          CURRENT_BILLING_PERIOD_END("current_billing_period_end"),

          @SerializedName("current_billing_period_start")
          CURRENT_BILLING_PERIOD_START("current_billing_period_start"),

          @SerializedName("on_reserve")
          ON_RESERVE("on_reserve"),

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
      public static class PricingPlanSubscriptionDetails {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Allows users to override the partial period behavior. */
        @SerializedName("overrides")
        Overrides overrides;

        /** <strong>Required.</strong> ID of the pricing plan subscription to deactivate. */
        @SerializedName("pricing_plan_subscription")
        String pricingPlanSubscription;

        private PricingPlanSubscriptionDetails(
            Map<String, Object> extraParams, Overrides overrides, String pricingPlanSubscription) {
          this.extraParams = extraParams;
          this.overrides = overrides;
          this.pricingPlanSubscription = pricingPlanSubscription;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private Overrides overrides;

          private String pricingPlanSubscription;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails build() {
            return new IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails(
                this.extraParams, this.overrides, this.pricingPlanSubscription);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails#extraParams} for
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
           * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails#extraParams} for
           * the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Allows users to override the partial period behavior. */
          public Builder setOverrides(
              IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                  overrides) {
            this.overrides = overrides;
            return this;
          }

          /** <strong>Required.</strong> ID of the pricing plan subscription to deactivate. */
          public Builder setPricingPlanSubscription(String pricingPlanSubscription) {
            this.pricingPlanSubscription = pricingPlanSubscription;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Overrides {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Override for the partial period behavior. */
          @SerializedName("partial_period_behaviors")
          List<
                  IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior>
              partialPeriodBehaviors;

          private Overrides(
              Map<String, Object> extraParams,
              List<
                      IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior>
                  partialPeriodBehaviors) {
            this.extraParams = extraParams;
            this.partialPeriodBehaviors = partialPeriodBehaviors;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<
                    IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior>
                partialPeriodBehaviors;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                build() {
              return new IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails
                  .Overrides(this.extraParams, this.partialPeriodBehaviors);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * Add an element to `partialPeriodBehaviors` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addPartialPeriodBehavior(
                IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior
                    element) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.add(element);
              return this;
            }

            /**
             * Add all elements to `partialPeriodBehaviors` list. A list is initialized for the
             * first `add/addAll` call, and subsequent calls adds additional elements to the
             * original list. See {@link
             * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addAllPartialPeriodBehavior(
                List<
                        IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails
                            .Overrides.PartialPeriodBehavior>
                    elements) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class PartialPeriodBehavior {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Override for the license fee. */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /** <strong>Required.</strong> Type of the partial period behavior override. */
            @SerializedName("type")
            Type type;

            private PartialPeriodBehavior(
                Map<String, Object> extraParams, LicenseFee licenseFee, Type type) {
              this.extraParams = extraParams;
              this.licenseFee = licenseFee;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private LicenseFee licenseFee;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior
                  build() {
                return new IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails
                    .Overrides.PartialPeriodBehavior(this.extraParams, this.licenseFee, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
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
               * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Override for the license fee. */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /** <strong>Required.</strong> Type of the partial period behavior override. */
              public Builder setType(
                  IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class LicenseFee {
              /**
               * <strong>Required.</strong> The proration behavior for the partial servicing period.
               * Defines how we prorate the license fee when the user is deactivating.
               */
              @SerializedName("credit_proration_behavior")
              CreditProrationBehavior creditProrationBehavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private LicenseFee(
                  CreditProrationBehavior creditProrationBehavior,
                  Map<String, Object> extraParams) {
                this.creditProrationBehavior = creditProrationBehavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private CreditProrationBehavior creditProrationBehavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior.LicenseFee
                    build() {
                  return new IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails
                      .Overrides.PartialPeriodBehavior.LicenseFee(
                      this.creditProrationBehavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The proration behavior for the partial servicing
                 * period. Defines how we prorate the license fee when the user is deactivating.
                 */
                public Builder setCreditProrationBehavior(
                    IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.LicenseFee.CreditProrationBehavior
                        creditProrationBehavior) {
                  this.creditProrationBehavior = creditProrationBehavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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
                 * IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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

              public enum CreditProrationBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("none")
                NONE("none"),

                @SerializedName("prorated")
                PRORATED("prorated");

                @Getter(onMethod_ = {@Override})
                private final String value;

                CreditProrationBehavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("license_fee")
              LICENSE_FEE("license_fee");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }
      }

      public enum CollectAt implements ApiRequestParams.EnumParam {
        @SerializedName("next_billing_date")
        NEXT_BILLING_DATE("next_billing_date"),

        @SerializedName("on_effective_at")
        ON_EFFECTIVE_AT("on_effective_at");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CollectAt(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("pricing_plan_subscription_details")
        PRICING_PLAN_SUBSCRIPTION_DETAILS("pricing_plan_subscription_details"),

        @SerializedName("v1_subscription_details")
        V1_SUBSCRIPTION_DETAILS("v1_subscription_details");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Modify {
      /** Allows users to override the collect at behavior. */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the modify action will take effect. If not specified, the default behavior is
       * on_reserve.
       */
      @SerializedName("effective_at")
      EffectiveAt effectiveAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> Details for modifying a pricing plan subscription. */
      @SerializedName("pricing_plan_subscription_details")
      PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

      /** <strong>Required.</strong> Type of the action details. */
      @SerializedName("type")
      Type type;

      private Modify(
          CollectAt collectAt,
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails,
          Type type) {
        this.collectAt = collectAt;
        this.effectiveAt = effectiveAt;
        this.extraParams = extraParams;
        this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectAt collectAt;

        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Modify build() {
          return new IntentCreateParams.Action.Modify(
              this.collectAt,
              this.effectiveAt,
              this.extraParams,
              this.pricingPlanSubscriptionDetails,
              this.type);
        }

        /** Allows users to override the collect at behavior. */
        public Builder setCollectAt(IntentCreateParams.Action.Modify.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the modify action will take effect. If not specified, the default behavior is
         * on_reserve.
         */
        public Builder setEffectiveAt(IntentCreateParams.Action.Modify.EffectiveAt effectiveAt) {
          this.effectiveAt = effectiveAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.Action.Modify#extraParams} for the field
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
         * map. See {@link IntentCreateParams.Action.Modify#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> Details for modifying a pricing plan subscription. */
        public Builder setPricingPlanSubscriptionDetails(
            IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                pricingPlanSubscriptionDetails) {
          this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
          return this;
        }

        /** <strong>Required.</strong> Type of the action details. */
        public Builder setType(IntentCreateParams.Action.Modify.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EffectiveAt {
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
         * The timestamp at which the modify action will take effect. Only present if type is
         * timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the modify action will take effect. */
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
          public IntentCreateParams.Action.Modify.EffectiveAt build() {
            return new IntentCreateParams.Action.Modify.EffectiveAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Modify.EffectiveAt#extraParams} for the field
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
           * map. See {@link IntentCreateParams.Action.Modify.EffectiveAt#extraParams} for the field
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
           * The timestamp at which the modify action will take effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the modify action will take effect. */
          public Builder setType(IntentCreateParams.Action.Modify.EffectiveAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("current_billing_period_start")
          CURRENT_BILLING_PERIOD_START("current_billing_period_start"),

          @SerializedName("on_reserve")
          ON_RESERVE("on_reserve"),

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
      public static class PricingPlanSubscriptionDetails {
        /** New configurations for the components of the pricing plan. */
        @SerializedName("component_configurations")
        List<IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.ComponentConfiguration>
            componentConfigurations;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the new Pricing Plan, if changing plans. */
        @SerializedName("new_pricing_plan")
        String newPricingPlan;

        /** The ID of the new Pricing Plan Version to use. */
        @SerializedName("new_pricing_plan_version")
        String newPricingPlanVersion;

        /** Allows users to override the partial period behavior. */
        @SerializedName("overrides")
        Overrides overrides;

        /** <strong>Required.</strong> The ID of the Pricing Plan Subscription to modify. */
        @SerializedName("pricing_plan_subscription")
        String pricingPlanSubscription;

        private PricingPlanSubscriptionDetails(
            List<
                    IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                        .ComponentConfiguration>
                componentConfigurations,
            Map<String, Object> extraParams,
            String newPricingPlan,
            String newPricingPlanVersion,
            Overrides overrides,
            String pricingPlanSubscription) {
          this.componentConfigurations = componentConfigurations;
          this.extraParams = extraParams;
          this.newPricingPlan = newPricingPlan;
          this.newPricingPlanVersion = newPricingPlanVersion;
          this.overrides = overrides;
          this.pricingPlanSubscription = pricingPlanSubscription;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                      .ComponentConfiguration>
              componentConfigurations;

          private Map<String, Object> extraParams;

          private String newPricingPlan;

          private String newPricingPlanVersion;

          private Overrides overrides;

          private String pricingPlanSubscription;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails build() {
            return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails(
                this.componentConfigurations,
                this.extraParams,
                this.newPricingPlan,
                this.newPricingPlanVersion,
                this.overrides,
                this.pricingPlanSubscription);
          }

          /**
           * Add an element to `componentConfigurations` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails#componentConfigurations}
           * for the field documentation.
           */
          public Builder addComponentConfiguration(
              IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.ComponentConfiguration
                  element) {
            if (this.componentConfigurations == null) {
              this.componentConfigurations = new ArrayList<>();
            }
            this.componentConfigurations.add(element);
            return this;
          }

          /**
           * Add all elements to `componentConfigurations` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails#componentConfigurations}
           * for the field documentation.
           */
          public Builder addAllComponentConfiguration(
              List<
                      IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                          .ComponentConfiguration>
                  elements) {
            if (this.componentConfigurations == null) {
              this.componentConfigurations = new ArrayList<>();
            }
            this.componentConfigurations.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails#extraParams} for the
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
           * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the new Pricing Plan, if changing plans. */
          public Builder setNewPricingPlan(String newPricingPlan) {
            this.newPricingPlan = newPricingPlan;
            return this;
          }

          /** The ID of the new Pricing Plan Version to use. */
          public Builder setNewPricingPlanVersion(String newPricingPlanVersion) {
            this.newPricingPlanVersion = newPricingPlanVersion;
            return this;
          }

          /** Allows users to override the partial period behavior. */
          public Builder setOverrides(
              IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides overrides) {
            this.overrides = overrides;
            return this;
          }

          /** <strong>Required.</strong> The ID of the Pricing Plan Subscription to modify. */
          public Builder setPricingPlanSubscription(String pricingPlanSubscription) {
            this.pricingPlanSubscription = pricingPlanSubscription;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ComponentConfiguration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Lookup key for the pricing plan component. */
          @SerializedName("lookup_key")
          String lookupKey;

          /** ID of the pricing plan component. */
          @SerializedName("pricing_plan_component")
          String pricingPlanComponent;

          /** Quantity of the component to be used. */
          @SerializedName("quantity")
          Long quantity;

          private ComponentConfiguration(
              Map<String, Object> extraParams,
              String lookupKey,
              String pricingPlanComponent,
              Long quantity) {
            this.extraParams = extraParams;
            this.lookupKey = lookupKey;
            this.pricingPlanComponent = pricingPlanComponent;
            this.quantity = quantity;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String lookupKey;

            private String pricingPlanComponent;

            private Long quantity;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                    .ComponentConfiguration
                build() {
              return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                  .ComponentConfiguration(
                  this.extraParams, this.lookupKey, this.pricingPlanComponent, this.quantity);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.ComponentConfiguration#extraParams}
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
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.ComponentConfiguration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Lookup key for the pricing plan component. */
            public Builder setLookupKey(String lookupKey) {
              this.lookupKey = lookupKey;
              return this;
            }

            /** ID of the pricing plan component. */
            public Builder setPricingPlanComponent(String pricingPlanComponent) {
              this.pricingPlanComponent = pricingPlanComponent;
              return this;
            }

            /** Quantity of the component to be used. */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Overrides {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Override for the partial period behavior. */
          @SerializedName("partial_period_behaviors")
          List<
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior>
              partialPeriodBehaviors;

          private Overrides(
              Map<String, Object> extraParams,
              List<
                      IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior>
                  partialPeriodBehaviors) {
            this.extraParams = extraParams;
            this.partialPeriodBehaviors = partialPeriodBehaviors;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<
                    IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior>
                partialPeriodBehaviors;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                build() {
              return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides(
                  this.extraParams, this.partialPeriodBehaviors);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * Add an element to `partialPeriodBehaviors` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addPartialPeriodBehavior(
                IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior
                    element) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.add(element);
              return this;
            }

            /**
             * Add all elements to `partialPeriodBehaviors` list. A list is initialized for the
             * first `add/addAll` call, and subsequent calls adds additional elements to the
             * original list. See {@link
             * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addAllPartialPeriodBehavior(
                List<
                        IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior>
                    elements) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class PartialPeriodBehavior {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Override for the license fee. */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /** <strong>Required.</strong> Type of the partial period behavior override. */
            @SerializedName("type")
            Type type;

            private PartialPeriodBehavior(
                Map<String, Object> extraParams, LicenseFee licenseFee, Type type) {
              this.extraParams = extraParams;
              this.licenseFee = licenseFee;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private LicenseFee licenseFee;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior
                  build() {
                return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                    .PartialPeriodBehavior(this.extraParams, this.licenseFee, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
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
               * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Override for the license fee. */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /** <strong>Required.</strong> Type of the partial period behavior override. */
              public Builder setType(
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class LicenseFee {
              /**
               * <strong>Required.</strong> The proration behavior for the partial servicing period.
               * Defines how we prorate the license fee when the user is upgrading.
               */
              @SerializedName("credit_proration_behavior")
              CreditProrationBehavior creditProrationBehavior;

              /**
               * <strong>Required.</strong> The proration behavior for the partial servicing period.
               * Defines how we prorate the license fee when the user is downgrading.
               */
              @SerializedName("debit_proration_behavior")
              DebitProrationBehavior debitProrationBehavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private LicenseFee(
                  CreditProrationBehavior creditProrationBehavior,
                  DebitProrationBehavior debitProrationBehavior,
                  Map<String, Object> extraParams) {
                this.creditProrationBehavior = creditProrationBehavior;
                this.debitProrationBehavior = debitProrationBehavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private CreditProrationBehavior creditProrationBehavior;

                private DebitProrationBehavior debitProrationBehavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior.LicenseFee
                    build() {
                  return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                      .Overrides.PartialPeriodBehavior.LicenseFee(
                      this.creditProrationBehavior, this.debitProrationBehavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The proration behavior for the partial servicing
                 * period. Defines how we prorate the license fee when the user is upgrading.
                 */
                public Builder setCreditProrationBehavior(
                    IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.LicenseFee.CreditProrationBehavior
                        creditProrationBehavior) {
                  this.creditProrationBehavior = creditProrationBehavior;
                  return this;
                }

                /**
                 * <strong>Required.</strong> The proration behavior for the partial servicing
                 * period. Defines how we prorate the license fee when the user is downgrading.
                 */
                public Builder setDebitProrationBehavior(
                    IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.LicenseFee.DebitProrationBehavior
                        debitProrationBehavior) {
                  this.debitProrationBehavior = debitProrationBehavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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
                 * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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

              public enum CreditProrationBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("none")
                NONE("none"),

                @SerializedName("prorated")
                PRORATED("prorated");

                @Getter(onMethod_ = {@Override})
                private final String value;

                CreditProrationBehavior(String value) {
                  this.value = value;
                }
              }

              public enum DebitProrationBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("none")
                NONE("none"),

                @SerializedName("prorated")
                PRORATED("prorated");

                @Getter(onMethod_ = {@Override})
                private final String value;

                DebitProrationBehavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("license_fee")
              LICENSE_FEE("license_fee");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }
        }
      }

      public enum CollectAt implements ApiRequestParams.EnumParam {
        @SerializedName("next_billing_date")
        NEXT_BILLING_DATE("next_billing_date"),

        @SerializedName("on_effective_at")
        ON_EFFECTIVE_AT("on_effective_at");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CollectAt(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("pricing_plan_subscription_details")
        PRICING_PLAN_SUBSCRIPTION_DETAILS("pricing_plan_subscription_details"),

        @SerializedName("v1_subscription_details")
        V1_SUBSCRIPTION_DETAILS("v1_subscription_details");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Remove {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The ID of the discount rule to remove for future invoices. */
      @SerializedName("invoice_discount_rule")
      String invoiceDiscountRule;

      /** <strong>Required.</strong> Type of the remove action. */
      @SerializedName("type")
      Type type;

      private Remove(Map<String, Object> extraParams, String invoiceDiscountRule, Type type) {
        this.extraParams = extraParams;
        this.invoiceDiscountRule = invoiceDiscountRule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private String invoiceDiscountRule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Remove build() {
          return new IntentCreateParams.Action.Remove(
              this.extraParams, this.invoiceDiscountRule, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.Action.Remove#extraParams} for the field
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
         * map. See {@link IntentCreateParams.Action.Remove#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The ID of the discount rule to remove for future invoices. */
        public Builder setInvoiceDiscountRule(String invoiceDiscountRule) {
          this.invoiceDiscountRule = invoiceDiscountRule;
          return this;
        }

        /** <strong>Required.</strong> Type of the remove action. */
        public Builder setType(IntentCreateParams.Action.Remove.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("invoice_discount_rule")
        INVOICE_DISCOUNT_RULE("invoice_discount_rule");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class Subscribe {
      /** Allows users to override the collect at behavior. */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the subscribe action will take effect. If not specified, the default behavior is
       * on_reserve.
       */
      @SerializedName("effective_at")
      EffectiveAt effectiveAt;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Details for subscribing to a pricing plan. */
      @SerializedName("pricing_plan_subscription_details")
      PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

      /** <strong>Required.</strong> Type of the action details. */
      @SerializedName("type")
      Type type;

      /** Details for subscribing to a v1 subscription. */
      @SerializedName("v1_subscription_details")
      V1SubscriptionDetails v1SubscriptionDetails;

      private Subscribe(
          CollectAt collectAt,
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails,
          Type type,
          V1SubscriptionDetails v1SubscriptionDetails) {
        this.collectAt = collectAt;
        this.effectiveAt = effectiveAt;
        this.extraParams = extraParams;
        this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
        this.type = type;
        this.v1SubscriptionDetails = v1SubscriptionDetails;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectAt collectAt;

        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

        private Type type;

        private V1SubscriptionDetails v1SubscriptionDetails;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Subscribe build() {
          return new IntentCreateParams.Action.Subscribe(
              this.collectAt,
              this.effectiveAt,
              this.extraParams,
              this.pricingPlanSubscriptionDetails,
              this.type,
              this.v1SubscriptionDetails);
        }

        /** Allows users to override the collect at behavior. */
        public Builder setCollectAt(IntentCreateParams.Action.Subscribe.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the subscribe action will take effect. If not specified, the default behavior is
         * on_reserve.
         */
        public Builder setEffectiveAt(IntentCreateParams.Action.Subscribe.EffectiveAt effectiveAt) {
          this.effectiveAt = effectiveAt;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.Action.Subscribe#extraParams} for the field
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
         * map. See {@link IntentCreateParams.Action.Subscribe#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Details for subscribing to a pricing plan. */
        public Builder setPricingPlanSubscriptionDetails(
            IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                pricingPlanSubscriptionDetails) {
          this.pricingPlanSubscriptionDetails = pricingPlanSubscriptionDetails;
          return this;
        }

        /** <strong>Required.</strong> Type of the action details. */
        public Builder setType(IntentCreateParams.Action.Subscribe.Type type) {
          this.type = type;
          return this;
        }

        /** Details for subscribing to a v1 subscription. */
        public Builder setV1SubscriptionDetails(
            IntentCreateParams.Action.Subscribe.V1SubscriptionDetails v1SubscriptionDetails) {
          this.v1SubscriptionDetails = v1SubscriptionDetails;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EffectiveAt {
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
         * The timestamp at which the subscribe action will take effect. Only present if type is
         * timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the subscribe action will take effect. */
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
          public IntentCreateParams.Action.Subscribe.EffectiveAt build() {
            return new IntentCreateParams.Action.Subscribe.EffectiveAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Subscribe.EffectiveAt#extraParams} for the
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
           * map. See {@link IntentCreateParams.Action.Subscribe.EffectiveAt#extraParams} for the
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
           * The timestamp at which the subscribe action will take effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the subscribe action will take effect. */
          public Builder setType(IntentCreateParams.Action.Subscribe.EffectiveAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("current_billing_period_start")
          CURRENT_BILLING_PERIOD_START("current_billing_period_start"),

          @SerializedName("on_reserve")
          ON_RESERVE("on_reserve"),

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
      public static class PricingPlanSubscriptionDetails {
        /** Configurations for the components of the pricing plan. */
        @SerializedName("component_configurations")
        List<
                IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                    .ComponentConfiguration>
            componentConfigurations;

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
         * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
         * attach to an object. This can be useful for storing additional information about the
         * object in a structured format.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        /** Allows users to override the partial period behavior. */
        @SerializedName("overrides")
        Overrides overrides;

        /** <strong>Required.</strong> ID of the Pricing Plan to subscribe to. */
        @SerializedName("pricing_plan")
        String pricingPlan;

        /** <strong>Required.</strong> Version of the Pricing Plan to use. */
        @SerializedName("pricing_plan_version")
        String pricingPlanVersion;

        private PricingPlanSubscriptionDetails(
            List<
                    IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                        .ComponentConfiguration>
                componentConfigurations,
            Map<String, Object> extraParams,
            Map<String, String> metadata,
            Overrides overrides,
            String pricingPlan,
            String pricingPlanVersion) {
          this.componentConfigurations = componentConfigurations;
          this.extraParams = extraParams;
          this.metadata = metadata;
          this.overrides = overrides;
          this.pricingPlan = pricingPlan;
          this.pricingPlanVersion = pricingPlanVersion;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                      .ComponentConfiguration>
              componentConfigurations;

          private Map<String, Object> extraParams;

          private Map<String, String> metadata;

          private Overrides overrides;

          private String pricingPlan;

          private String pricingPlanVersion;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails build() {
            return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails(
                this.componentConfigurations,
                this.extraParams,
                this.metadata,
                this.overrides,
                this.pricingPlan,
                this.pricingPlanVersion);
          }

          /**
           * Add an element to `componentConfigurations` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#componentConfigurations}
           * for the field documentation.
           */
          public Builder addComponentConfiguration(
              IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                      .ComponentConfiguration
                  element) {
            if (this.componentConfigurations == null) {
              this.componentConfigurations = new ArrayList<>();
            }
            this.componentConfigurations.add(element);
            return this;
          }

          /**
           * Add all elements to `componentConfigurations` list. A list is initialized for the first
           * `add/addAll` call, and subsequent calls adds additional elements to the original list.
           * See {@link
           * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#componentConfigurations}
           * for the field documentation.
           */
          public Builder addAllComponentConfiguration(
              List<
                      IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                          .ComponentConfiguration>
                  elements) {
            if (this.componentConfigurations == null) {
              this.componentConfigurations = new ArrayList<>();
            }
            this.componentConfigurations.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#extraParams} for the
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
           * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#extraParams} for the
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
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#metadata} for
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
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails#metadata} for the
           * field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }

          /** Allows users to override the partial period behavior. */
          public Builder setOverrides(
              IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                  overrides) {
            this.overrides = overrides;
            return this;
          }

          /** <strong>Required.</strong> ID of the Pricing Plan to subscribe to. */
          public Builder setPricingPlan(String pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
          }

          /** <strong>Required.</strong> Version of the Pricing Plan to use. */
          public Builder setPricingPlanVersion(String pricingPlanVersion) {
            this.pricingPlanVersion = pricingPlanVersion;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class ComponentConfiguration {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Lookup key for the pricing plan component. */
          @SerializedName("lookup_key")
          String lookupKey;

          /** ID of the pricing plan component. */
          @SerializedName("pricing_plan_component")
          String pricingPlanComponent;

          /** Quantity of the component to be used. */
          @SerializedName("quantity")
          Long quantity;

          private ComponentConfiguration(
              Map<String, Object> extraParams,
              String lookupKey,
              String pricingPlanComponent,
              Long quantity) {
            this.extraParams = extraParams;
            this.lookupKey = lookupKey;
            this.pricingPlanComponent = pricingPlanComponent;
            this.quantity = quantity;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private String lookupKey;

            private String pricingPlanComponent;

            private Long quantity;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                    .ComponentConfiguration
                build() {
              return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                  .ComponentConfiguration(
                  this.extraParams, this.lookupKey, this.pricingPlanComponent, this.quantity);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.ComponentConfiguration#extraParams}
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
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.ComponentConfiguration#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Lookup key for the pricing plan component. */
            public Builder setLookupKey(String lookupKey) {
              this.lookupKey = lookupKey;
              return this;
            }

            /** ID of the pricing plan component. */
            public Builder setPricingPlanComponent(String pricingPlanComponent) {
              this.pricingPlanComponent = pricingPlanComponent;
              return this;
            }

            /** Quantity of the component to be used. */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Overrides {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> Override for the partial period behavior. */
          @SerializedName("partial_period_behaviors")
          List<
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior>
              partialPeriodBehaviors;

          private Overrides(
              Map<String, Object> extraParams,
              List<
                      IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior>
                  partialPeriodBehaviors) {
            this.extraParams = extraParams;
            this.partialPeriodBehaviors = partialPeriodBehaviors;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private List<
                    IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior>
                partialPeriodBehaviors;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                build() {
              return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                  .Overrides(this.extraParams, this.partialPeriodBehaviors);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides#extraParams}
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
             * Add an element to `partialPeriodBehaviors` list. A list is initialized for the first
             * `add/addAll` call, and subsequent calls adds additional elements to the original
             * list. See {@link
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addPartialPeriodBehavior(
                IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior
                    element) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.add(element);
              return this;
            }

            /**
             * Add all elements to `partialPeriodBehaviors` list. A list is initialized for the
             * first `add/addAll` call, and subsequent calls adds additional elements to the
             * original list. See {@link
             * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides#partialPeriodBehaviors}
             * for the field documentation.
             */
            public Builder addAllPartialPeriodBehavior(
                List<
                        IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior>
                    elements) {
              if (this.partialPeriodBehaviors == null) {
                this.partialPeriodBehaviors = new ArrayList<>();
              }
              this.partialPeriodBehaviors.addAll(elements);
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class PartialPeriodBehavior {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Override for the license fee. */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /** <strong>Required.</strong> Type of the partial period behavior override. */
            @SerializedName("type")
            Type type;

            private PartialPeriodBehavior(
                Map<String, Object> extraParams, LicenseFee licenseFee, Type type) {
              this.extraParams = extraParams;
              this.licenseFee = licenseFee;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private LicenseFee licenseFee;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior
                  build() {
                return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                    .Overrides.PartialPeriodBehavior(this.extraParams, this.licenseFee, this.type);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
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
               * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Override for the license fee. */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /** <strong>Required.</strong> Type of the partial period behavior override. */
              public Builder setType(
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class LicenseFee {
              /**
               * <strong>Required.</strong> The proration behavior for the partial servicing period.
               * Defines how we prorate the license fee when the user is subscribing.
               */
              @SerializedName("debit_proration_behavior")
              DebitProrationBehavior debitProrationBehavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private LicenseFee(
                  DebitProrationBehavior debitProrationBehavior, Map<String, Object> extraParams) {
                this.debitProrationBehavior = debitProrationBehavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private DebitProrationBehavior debitProrationBehavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior.LicenseFee
                    build() {
                  return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                      .Overrides.PartialPeriodBehavior.LicenseFee(
                      this.debitProrationBehavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The proration behavior for the partial servicing
                 * period. Defines how we prorate the license fee when the user is subscribing.
                 */
                public Builder setDebitProrationBehavior(
                    IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.LicenseFee.DebitProrationBehavior
                        debitProrationBehavior) {
                  this.debitProrationBehavior = debitProrationBehavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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
                 * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.LicenseFee#extraParams}
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

              public enum DebitProrationBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("none")
                NONE("none"),

                @SerializedName("prorated")
                PRORATED("prorated");

                @Getter(onMethod_ = {@Override})
                private final String value;

                DebitProrationBehavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("license_fee")
              LICENSE_FEE("license_fee");

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
      public static class V1SubscriptionDetails {
        /**
         * The subscription’s description, meant to be displayable to the customer. Use this field
         * to optionally store an explanation of the subscription for rendering in Stripe surfaces
         * and certain local payment methods UIs.
         */
        @SerializedName("description")
        String description;

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
         * <strong>Required.</strong> A list of up to 20 subscription items, each with an attached
         * price.
         */
        @SerializedName("items")
        List<IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item> items;

        /**
         * Set of key-value pairs that you can attach to an object. This can be useful for storing
         * additional information about the object in a structured format.
         */
        @SerializedName("metadata")
        Map<String, String> metadata;

        private V1SubscriptionDetails(
            String description,
            Map<String, Object> extraParams,
            List<IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item> items,
            Map<String, String> metadata) {
          this.description = description;
          this.extraParams = extraParams;
          this.items = items;
          this.metadata = metadata;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String description;

          private Map<String, Object> extraParams;

          private List<IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item> items;

          private Map<String, String> metadata;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Subscribe.V1SubscriptionDetails build() {
            return new IntentCreateParams.Action.Subscribe.V1SubscriptionDetails(
                this.description, this.extraParams, this.items, this.metadata);
          }

          /**
           * The subscription’s description, meant to be displayable to the customer. Use this field
           * to optionally store an explanation of the subscription for rendering in Stripe surfaces
           * and certain local payment methods UIs.
           */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#extraParams}
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
           * map. See {@link IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#extraParams}
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
           * Add an element to `items` list. A list is initialized for the first `add/addAll` call,
           * and subsequent calls adds additional elements to the original list. See {@link
           * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#items} for the field
           * documentation.
           */
          public Builder addItem(
              IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item element) {
            if (this.items == null) {
              this.items = new ArrayList<>();
            }
            this.items.add(element);
            return this;
          }

          /**
           * Add all elements to `items` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#items} for the field
           * documentation.
           */
          public Builder addAllItem(
              List<IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item> elements) {
            if (this.items == null) {
              this.items = new ArrayList<>();
            }
            this.items.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll`
           * call, and subsequent calls add additional key/value pairs to the original map. See
           * {@link IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#metadata} for the
           * field documentation.
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
           * map. See {@link IntentCreateParams.Action.Subscribe.V1SubscriptionDetails#metadata} for
           * the field documentation.
           */
          public Builder putAllMetadata(Map<String, String> map) {
            if (this.metadata == null) {
              this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Item {
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
           * Set of key-value pairs that you can attach to an object. This can be useful for storing
           * additional information about the object in a structured format.
           */
          @SerializedName("metadata")
          Map<String, String> metadata;

          /** <strong>Required.</strong> The ID of the price object. */
          @SerializedName("price")
          String price;

          /** Quantity for this item. If not provided, will default to 1. */
          @SerializedName("quantity")
          Long quantity;

          private Item(
              Map<String, Object> extraParams,
              Map<String, String> metadata,
              String price,
              Long quantity) {
            this.extraParams = extraParams;
            this.metadata = metadata;
            this.price = price;
            this.quantity = quantity;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Map<String, String> metadata;

            private String price;

            private Long quantity;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item build() {
              return new IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item(
                  this.extraParams, this.metadata, this.price, this.quantity);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item#extraParams} for the
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
             * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item#extraParams} for the
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
             * Add a key/value pair to `metadata` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item#metadata} for the
             * field documentation.
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
             * IntentCreateParams.Action.Subscribe.V1SubscriptionDetails.Item#metadata} for the
             * field documentation.
             */
            public Builder putAllMetadata(Map<String, String> map) {
              if (this.metadata == null) {
                this.metadata = new HashMap<>();
              }
              this.metadata.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The ID of the price object. */
            public Builder setPrice(String price) {
              this.price = price;
              return this;
            }

            /** Quantity for this item. If not provided, will default to 1. */
            public Builder setQuantity(Long quantity) {
              this.quantity = quantity;
              return this;
            }
          }
        }
      }

      public enum CollectAt implements ApiRequestParams.EnumParam {
        @SerializedName("next_billing_date")
        NEXT_BILLING_DATE("next_billing_date"),

        @SerializedName("on_effective_at")
        ON_EFFECTIVE_AT("on_effective_at");

        @Getter(onMethod_ = {@Override})
        private final String value;

        CollectAt(String value) {
          this.value = value;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("pricing_plan_subscription_details")
        PRICING_PLAN_SUBSCRIPTION_DETAILS("pricing_plan_subscription_details"),

        @SerializedName("v1_subscription_details")
        V1_SUBSCRIPTION_DETAILS("v1_subscription_details");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("apply")
      APPLY("apply"),

      @SerializedName("deactivate")
      DEACTIVATE("deactivate"),

      @SerializedName("modify")
      MODIFY("modify"),

      @SerializedName("remove")
      REMOVE("remove"),

      @SerializedName("subscribe")
      SUBSCRIBE("subscribe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
