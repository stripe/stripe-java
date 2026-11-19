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
public class IntentCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> Actions to be performed by this Billing Intent. */
  @SerializedName("actions")
  List<IntentCreateParams.Action> actions;

  /** ID of an existing Billing Group to use. */
  @SerializedName("billing_group")
  String billingGroup;

  /** Data for creating a new Billing Group. */
  @SerializedName("billing_group_data")
  BillingGroupData billingGroupData;

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
      String billingGroup,
      BillingGroupData billingGroupData,
      String currency,
      Map<String, Object> extraParams) {
    this.actions = actions;
    this.billingGroup = billingGroup;
    this.billingGroupData = billingGroupData;
    this.currency = currency;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<IntentCreateParams.Action> actions;

    private String billingGroup;

    private BillingGroupData billingGroupData;

    private String currency;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public IntentCreateParams build() {
      return new IntentCreateParams(
          this.actions, this.billingGroup, this.billingGroupData, this.currency, this.extraParams);
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

    /** ID of an existing Billing Group to use. */
    public Builder setBillingGroup(String billingGroup) {
      this.billingGroup = billingGroup;
      return this;
    }

    /** Data for creating a new Billing Group. */
    public Builder setBillingGroupData(IntentCreateParams.BillingGroupData billingGroupData) {
      this.billingGroupData = billingGroupData;
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
      /** Details for applying a discount. */
      @SerializedName("discount")
      Discount discount;

      /** When the apply action takes effect. If not specified, defaults to on_reserve. */
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

      /** Details for applying a discount rule to future invoices. */
      @SerializedName("invoice_discount_rule")
      InvoiceDiscountRule invoiceDiscountRule;

      /**
       * Details for applying a spend modifier rule. Only present if type is spend_modifier_rule.
       */
      @SerializedName("spend_modifier_rule")
      SpendModifierRule spendModifierRule;

      /** <strong>Required.</strong> Type of the apply action details. */
      @SerializedName("type")
      Type type;

      private Apply(
          Discount discount,
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          InvoiceDiscountRule invoiceDiscountRule,
          SpendModifierRule spendModifierRule,
          Type type) {
        this.discount = discount;
        this.effectiveAt = effectiveAt;
        this.extraParams = extraParams;
        this.invoiceDiscountRule = invoiceDiscountRule;
        this.spendModifierRule = spendModifierRule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Discount discount;

        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private InvoiceDiscountRule invoiceDiscountRule;

        private SpendModifierRule spendModifierRule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Apply build() {
          return new IntentCreateParams.Action.Apply(
              this.discount,
              this.effectiveAt,
              this.extraParams,
              this.invoiceDiscountRule,
              this.spendModifierRule,
              this.type);
        }

        /** Details for applying a discount. */
        public Builder setDiscount(IntentCreateParams.Action.Apply.Discount discount) {
          this.discount = discount;
          return this;
        }

        /** When the apply action takes effect. If not specified, defaults to on_reserve. */
        public Builder setEffectiveAt(IntentCreateParams.Action.Apply.EffectiveAt effectiveAt) {
          this.effectiveAt = effectiveAt;
          return this;
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

        /**
         * Details for applying a spend modifier rule. Only present if type is spend_modifier_rule.
         */
        public Builder setSpendModifierRule(
            IntentCreateParams.Action.Apply.SpendModifierRule spendModifierRule) {
          this.spendModifierRule = spendModifierRule;
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
      public static class Discount {
        /** The ID of the Coupon to apply. */
        @SerializedName("coupon")
        String coupon;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The ID of the PromotionCode to apply. */
        @SerializedName("promotion_code")
        String promotionCode;

        /** <strong>Required.</strong> Type of the discount. */
        @SerializedName("type")
        Type type;

        private Discount(
            String coupon, Map<String, Object> extraParams, String promotionCode, Type type) {
          this.coupon = coupon;
          this.extraParams = extraParams;
          this.promotionCode = promotionCode;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String coupon;

          private Map<String, Object> extraParams;

          private String promotionCode;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Apply.Discount build() {
            return new IntentCreateParams.Action.Apply.Discount(
                this.coupon, this.extraParams, this.promotionCode, this.type);
          }

          /** The ID of the Coupon to apply. */
          public Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Apply.Discount#extraParams} for the field
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
           * map. See {@link IntentCreateParams.Action.Apply.Discount#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The ID of the PromotionCode to apply. */
          public Builder setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
          }

          /** <strong>Required.</strong> Type of the discount. */
          public Builder setType(IntentCreateParams.Action.Apply.Discount.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("coupon")
          COUPON("coupon"),

          @SerializedName("promotion_code")
          PROMOTION_CODE("promotion_code");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
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
         * The timestamp at which the apply action takes effect. Only present if type is timestamp.
         * Only allowed for discount actions.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the apply action takes effect. */
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
          public IntentCreateParams.Action.Apply.EffectiveAt build() {
            return new IntentCreateParams.Action.Apply.EffectiveAt(
                this.extraParams, this.timestamp, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Apply.EffectiveAt#extraParams} for the field
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
           * map. See {@link IntentCreateParams.Action.Apply.EffectiveAt#extraParams} for the field
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
           * The timestamp at which the apply action takes effect. Only present if type is
           * timestamp. Only allowed for discount actions.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the apply action takes effect. */
          public Builder setType(IntentCreateParams.Action.Apply.EffectiveAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("current_billing_period_end")
          CURRENT_BILLING_PERIOD_END("current_billing_period_end"),

          @SerializedName("current_billing_period_start")
          CURRENT_BILLING_PERIOD_START("current_billing_period_start"),

          @SerializedName("next_billing_period_start")
          NEXT_BILLING_PERIOD_START("next_billing_period_start"),

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
      public static class InvoiceDiscountRule {
        /**
         * <strong>Required.</strong> The entity that the discount rule applies to, for example, the
         * billing group.
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
           * the billing group.
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
           * this billing group.
           */
          @SerializedName("maximum_applications")
          MaximumApplications maximumApplications;

          /**
           * <strong>Required.</strong> Percent that is taken off the amount. For example, a
           * percent_off of 50.0 reduces a 100 USD amount to 50 USD.
           */
          @SerializedName("percent_off")
          BigDecimal percentOff;

          private PercentOff(
              Map<String, Object> extraParams,
              MaximumApplications maximumApplications,
              BigDecimal percentOff) {
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

            private BigDecimal percentOff;

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
             * for this billing group.
             */
            public Builder setMaximumApplications(
                IntentCreateParams.Action.Apply.InvoiceDiscountRule.PercentOff.MaximumApplications
                    maximumApplications) {
              this.maximumApplications = maximumApplications;
              return this;
            }

            /**
             * <strong>Required.</strong> Percent that is taken off the amount. For example, a
             * percent_off of 50.0 reduces a 100 USD amount to 50 USD.
             */
            public Builder setPercentOff(BigDecimal percentOff) {
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
          CADENCE("cadence"),

          @SerializedName("group")
          GROUP("group");

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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class SpendModifierRule {
        /** <strong>Required.</strong> What the spend modifier applies to. */
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

        /**
         * Details for max billing period spend modifier. Only present if type is
         * max_billing_period_spend.
         */
        @SerializedName("max_billing_period_spend")
        MaxBillingPeriodSpend maxBillingPeriodSpend;

        /** <strong>Required.</strong> Type of the spend modifier. */
        @SerializedName("type")
        Type type;

        private SpendModifierRule(
            AppliesTo appliesTo,
            Map<String, Object> extraParams,
            MaxBillingPeriodSpend maxBillingPeriodSpend,
            Type type) {
          this.appliesTo = appliesTo;
          this.extraParams = extraParams;
          this.maxBillingPeriodSpend = maxBillingPeriodSpend;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AppliesTo appliesTo;

          private Map<String, Object> extraParams;

          private MaxBillingPeriodSpend maxBillingPeriodSpend;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Apply.SpendModifierRule build() {
            return new IntentCreateParams.Action.Apply.SpendModifierRule(
                this.appliesTo, this.extraParams, this.maxBillingPeriodSpend, this.type);
          }

          /** <strong>Required.</strong> What the spend modifier applies to. */
          public Builder setAppliesTo(
              IntentCreateParams.Action.Apply.SpendModifierRule.AppliesTo appliesTo) {
            this.appliesTo = appliesTo;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Apply.SpendModifierRule#extraParams} for the
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
           * map. See {@link IntentCreateParams.Action.Apply.SpendModifierRule#extraParams} for the
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
           * Details for max billing period spend modifier. Only present if type is
           * max_billing_period_spend.
           */
          public Builder setMaxBillingPeriodSpend(
              IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                  maxBillingPeriodSpend) {
            this.maxBillingPeriodSpend = maxBillingPeriodSpend;
            return this;
          }

          /** <strong>Required.</strong> Type of the spend modifier. */
          public Builder setType(IntentCreateParams.Action.Apply.SpendModifierRule.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class MaxBillingPeriodSpend {
          /** <strong>Required.</strong> The maximum amount allowed for the billing period. */
          @SerializedName("amount")
          Amount amount;

          /**
           * <strong>Required.</strong> The configuration for the overage rate for the custom
           * pricing unit.
           */
          @SerializedName("custom_pricing_unit_overage_rate")
          CustomPricingUnitOverageRate customPricingUnitOverageRate;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private MaxBillingPeriodSpend(
              Amount amount,
              CustomPricingUnitOverageRate customPricingUnitOverageRate,
              Map<String, Object> extraParams) {
            this.amount = amount;
            this.customPricingUnitOverageRate = customPricingUnitOverageRate;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Amount amount;

            private CustomPricingUnitOverageRate customPricingUnitOverageRate;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend build() {
              return new IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend(
                  this.amount, this.customPricingUnitOverageRate, this.extraParams);
            }

            /** <strong>Required.</strong> The maximum amount allowed for the billing period. */
            public Builder setAmount(
                IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount
                    amount) {
              this.amount = amount;
              return this;
            }

            /**
             * <strong>Required.</strong> The configuration for the overage rate for the custom
             * pricing unit.
             */
            public Builder setCustomPricingUnitOverageRate(
                IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                        .CustomPricingUnitOverageRate
                    customPricingUnitOverageRate) {
              this.customPricingUnitOverageRate = customPricingUnitOverageRate;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend#extraParams}
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
             * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend#extraParams}
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
          public static class Amount {
            /** The custom pricing unit amount. */
            @SerializedName("custom_pricing_unit")
            CustomPricingUnit customPricingUnit;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The type of the amount. */
            @SerializedName("type")
            Type type;

            private Amount(
                CustomPricingUnit customPricingUnit, Map<String, Object> extraParams, Type type) {
              this.customPricingUnit = customPricingUnit;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private CustomPricingUnit customPricingUnit;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount
                  build() {
                return new IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                    .Amount(this.customPricingUnit, this.extraParams, this.type);
              }

              /** The custom pricing unit amount. */
              public Builder setCustomPricingUnit(
                  IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount
                          .CustomPricingUnit
                      customPricingUnit) {
                this.customPricingUnit = customPricingUnit;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount#extraParams}
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
               * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The type of the amount. */
              public Builder setType(
                  IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount
                          .Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class CustomPricingUnit {
              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              /** The id of the custom pricing unit. */
              @SerializedName("id")
              String id;

              /** <strong>Required.</strong> The value of the custom pricing unit. */
              @SerializedName("value")
              String value;

              private CustomPricingUnit(Map<String, Object> extraParams, String id, String value) {
                this.extraParams = extraParams;
                this.id = id;
                this.value = value;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Map<String, Object> extraParams;

                private String id;

                private String value;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                        .Amount.CustomPricingUnit
                    build() {
                  return new IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                      .Amount.CustomPricingUnit(this.extraParams, this.id, this.value);
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount.CustomPricingUnit#extraParams}
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
                 * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.Amount.CustomPricingUnit#extraParams}
                 * for the field documentation.
                 */
                public Builder putAllExtraParam(Map<String, Object> map) {
                  if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                  }
                  this.extraParams.putAll(map);
                  return this;
                }

                /** The id of the custom pricing unit. */
                public Builder setId(String id) {
                  this.id = id;
                  return this;
                }

                /** <strong>Required.</strong> The value of the custom pricing unit. */
                public Builder setValue(String value) {
                  this.value = value;
                  return this;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("custom_pricing_unit")
              CUSTOM_PRICING_UNIT("custom_pricing_unit");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class CustomPricingUnitOverageRate {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> ID of the custom pricing unit overage rate. */
            @SerializedName("id")
            String id;

            private CustomPricingUnitOverageRate(Map<String, Object> extraParams, String id) {
              this.extraParams = extraParams;
              this.id = id;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private String id;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                      .CustomPricingUnitOverageRate
                  build() {
                return new IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend
                    .CustomPricingUnitOverageRate(this.extraParams, this.id);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.CustomPricingUnitOverageRate#extraParams}
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
               * IntentCreateParams.Action.Apply.SpendModifierRule.MaxBillingPeriodSpend.CustomPricingUnitOverageRate#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> ID of the custom pricing unit overage rate. */
              public Builder setId(String id) {
                this.id = id;
                return this;
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
          @SerializedName("max_billing_period_spend")
          MAX_BILLING_PERIOD_SPEND("max_billing_period_spend");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("discount")
        DISCOUNT("discount"),

        @SerializedName("invoice_discount_rule")
        INVOICE_DISCOUNT_RULE("invoice_discount_rule"),

        @SerializedName("spend_modifier_rule")
        SPEND_MODIFIER_RULE("spend_modifier_rule");

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
      /** Details about why the cancellation is being requested. */
      @SerializedName("cancellation_details")
      CancellationDetails cancellationDetails;

      /**
       * When the invoice is collected. If not specified, the default behavior is on_effective_at.
       */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the deactivate action takes effect. If not specified, the default behavior is
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
          CancellationDetails cancellationDetails,
          CollectAt collectAt,
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails,
          Type type) {
        this.cancellationDetails = cancellationDetails;
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
        private CancellationDetails cancellationDetails;

        private CollectAt collectAt;

        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private PricingPlanSubscriptionDetails pricingPlanSubscriptionDetails;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Deactivate build() {
          return new IntentCreateParams.Action.Deactivate(
              this.cancellationDetails,
              this.collectAt,
              this.effectiveAt,
              this.extraParams,
              this.pricingPlanSubscriptionDetails,
              this.type);
        }

        /** Details about why the cancellation is being requested. */
        public Builder setCancellationDetails(
            IntentCreateParams.Action.Deactivate.CancellationDetails cancellationDetails) {
          this.cancellationDetails = cancellationDetails;
          return this;
        }

        /**
         * When the invoice is collected. If not specified, the default behavior is on_effective_at.
         */
        public Builder setCollectAt(IntentCreateParams.Action.Deactivate.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the deactivate action takes effect. If not specified, the default behavior is
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
      public static class CancellationDetails {
        /**
         * Additional comments about why the user canceled the subscription, if the subscription was
         * canceled explicitly by the user.
         */
        @SerializedName("comment")
        String comment;

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
         * The customer submitted reason for why they canceled, if the subscription was canceled
         * explicitly by the user.
         */
        @SerializedName("feedback")
        Feedback feedback;

        private CancellationDetails(
            String comment, Map<String, Object> extraParams, Feedback feedback) {
          this.comment = comment;
          this.extraParams = extraParams;
          this.feedback = feedback;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private String comment;

          private Map<String, Object> extraParams;

          private Feedback feedback;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.Action.Deactivate.CancellationDetails build() {
            return new IntentCreateParams.Action.Deactivate.CancellationDetails(
                this.comment, this.extraParams, this.feedback);
          }

          /**
           * Additional comments about why the user canceled the subscription, if the subscription
           * was canceled explicitly by the user.
           */
          public Builder setComment(String comment) {
            this.comment = comment;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Deactivate.CancellationDetails#extraParams}
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
           * map. See {@link IntentCreateParams.Action.Deactivate.CancellationDetails#extraParams}
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
           * The customer submitted reason for why they canceled, if the subscription was canceled
           * explicitly by the user.
           */
          public Builder setFeedback(
              IntentCreateParams.Action.Deactivate.CancellationDetails.Feedback feedback) {
            this.feedback = feedback;
            return this;
          }
        }

        public enum Feedback implements ApiRequestParams.EnumParam {
          @SerializedName("customer_service")
          CUSTOMER_SERVICE("customer_service"),

          @SerializedName("low_quality")
          LOW_QUALITY("low_quality"),

          @SerializedName("missing_features")
          MISSING_FEATURES("missing_features"),

          @SerializedName("other")
          OTHER("other"),

          @SerializedName("switched_service")
          SWITCHED_SERVICE("switched_service"),

          @SerializedName("too_complex")
          TOO_COMPLEX("too_complex"),

          @SerializedName("too_expensive")
          TOO_EXPENSIVE("too_expensive"),

          @SerializedName("unused")
          UNUSED("unused");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Feedback(String value) {
            this.value = value;
          }
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
         * The timestamp at which the deactivate action takes effect. Only present if type is
         * timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the deactivate action takes effect. */
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
           * The timestamp at which the deactivate action takes effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the deactivate action takes effect. */
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

        /** Configurations for overriding behaviors related to the subscription. */
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

          /** Configurations for overriding behaviors related to the subscription. */
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

          /**
           * <strong>Required.</strong> Configurations for behaviors when the action takes effect
           * during the service period.
           */
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

            /**
             * Overrides the behavior for license fee components when the action takes effect during
             * the service period.
             */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /** <strong>Required.</strong> The type of behavior to override. */
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

              /**
               * Overrides the behavior for license fee components when the action takes effect
               * during the service period.
               */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Deactivate.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /** <strong>Required.</strong> The type of behavior to override. */
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
               * Defines how we prorate the license fee when the user is deactivating. If not
               * specified, defaults to none.
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
                 * period. Defines how we prorate the license fee when the user is deactivating. If
                 * not specified, defaults to none.
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
              LICENSE_FEE("license_fee"),

              @SerializedName("recurring_credit_grant")
              RECURRING_CREDIT_GRANT("recurring_credit_grant");

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
      /**
       * When the invoice is collected. If not specified, the default behavior is next_billing_date.
       */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the modify action takes effect. If not specified, the default behavior is on_reserve.
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

        /**
         * When the invoice is collected. If not specified, the default behavior is
         * next_billing_date.
         */
        public Builder setCollectAt(IntentCreateParams.Action.Modify.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the modify action takes effect. If not specified, the default behavior is
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
         * The timestamp at which the modify action takes effect. Only present if type is timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the modify action takes effect. */
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
           * The timestamp at which the modify action takes effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the modify action takes effect. */
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

        /** Configurations for overriding behaviors related to the subscription. */
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

          /** Configurations for overriding behaviors related to the subscription. */
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

          /**
           * <strong>Required.</strong> Configurations for behaviors when the action takes effect
           * during the service period.
           */
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

            /**
             * Overrides the behavior for license fee components when the action takes effect during
             * the service period.
             */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /**
             * Overrides the behavior for recurring credit grant components when the action takes
             * effect during the service period.
             */
            @SerializedName("recurring_credit_grant")
            RecurringCreditGrant recurringCreditGrant;

            /** <strong>Required.</strong> The type of behavior to override. */
            @SerializedName("type")
            Type type;

            private PartialPeriodBehavior(
                Map<String, Object> extraParams,
                LicenseFee licenseFee,
                RecurringCreditGrant recurringCreditGrant,
                Type type) {
              this.extraParams = extraParams;
              this.licenseFee = licenseFee;
              this.recurringCreditGrant = recurringCreditGrant;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private LicenseFee licenseFee;

              private RecurringCreditGrant recurringCreditGrant;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior
                  build() {
                return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                    .PartialPeriodBehavior(
                    this.extraParams, this.licenseFee, this.recurringCreditGrant, this.type);
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

              /**
               * Overrides the behavior for license fee components when the action takes effect
               * during the service period.
               */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /**
               * Overrides the behavior for recurring credit grant components when the action takes
               * effect during the service period.
               */
              public Builder setRecurringCreditGrant(
                  IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.RecurringCreditGrant
                      recurringCreditGrant) {
                this.recurringCreditGrant = recurringCreditGrant;
                return this;
              }

              /** <strong>Required.</strong> The type of behavior to override. */
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
               * Defines how we prorate the license fee when the user modifies the subscription. If
               * not specified, defaults to prorated.
               */
              @SerializedName("credit_proration_behavior")
              CreditProrationBehavior creditProrationBehavior;

              /**
               * <strong>Required.</strong> The proration behavior for the partial servicing period.
               * Defines how we prorate the license fee when the user modifies the subscription. If
               * not specified, defaults to prorated.
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
                 * period. Defines how we prorate the license fee when the user modifies the
                 * subscription. If not specified, defaults to prorated.
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
                 * period. Defines how we prorate the license fee when the user modifies the
                 * subscription. If not specified, defaults to prorated.
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

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class RecurringCreditGrant {
              /**
               * <strong>Required.</strong> Controls credit grant creation behavior during partial
               * periods. If not specified, defaults to full_credits.
               */
              @SerializedName("create_behavior")
              CreateBehavior createBehavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private RecurringCreditGrant(
                  CreateBehavior createBehavior, Map<String, Object> extraParams) {
                this.createBehavior = createBehavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private CreateBehavior createBehavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior.RecurringCreditGrant
                    build() {
                  return new IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails
                      .Overrides.PartialPeriodBehavior.RecurringCreditGrant(
                      this.createBehavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> Controls credit grant creation behavior during partial
                 * periods. If not specified, defaults to full_credits.
                 */
                public Builder setCreateBehavior(
                    IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.RecurringCreditGrant.CreateBehavior
                        createBehavior) {
                  this.createBehavior = createBehavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.RecurringCreditGrant#extraParams}
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
                 * IntentCreateParams.Action.Modify.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.RecurringCreditGrant#extraParams}
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

              public enum CreateBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("full_credits")
                FULL_CREDITS("full_credits"),

                @SerializedName("none")
                NONE("none");

                @Getter(onMethod_ = {@Override})
                private final String value;

                CreateBehavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("license_fee")
              LICENSE_FEE("license_fee"),

              @SerializedName("recurring_credit_grant")
              RECURRING_CREDIT_GRANT("recurring_credit_grant");

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
      /** When the remove action takes effect. If not specified, defaults to on_reserve. */
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

      /** The ID of the discount rule to remove for future invoices. */
      @SerializedName("invoice_discount_rule")
      String invoiceDiscountRule;

      /** The ID of the spend modifier rule to remove. */
      @SerializedName("spend_modifier_rule")
      String spendModifierRule;

      /** <strong>Required.</strong> Type of the remove action. */
      @SerializedName("type")
      Type type;

      private Remove(
          EffectiveAt effectiveAt,
          Map<String, Object> extraParams,
          String invoiceDiscountRule,
          String spendModifierRule,
          Type type) {
        this.effectiveAt = effectiveAt;
        this.extraParams = extraParams;
        this.invoiceDiscountRule = invoiceDiscountRule;
        this.spendModifierRule = spendModifierRule;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private EffectiveAt effectiveAt;

        private Map<String, Object> extraParams;

        private String invoiceDiscountRule;

        private String spendModifierRule;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.Action.Remove build() {
          return new IntentCreateParams.Action.Remove(
              this.effectiveAt,
              this.extraParams,
              this.invoiceDiscountRule,
              this.spendModifierRule,
              this.type);
        }

        /** When the remove action takes effect. If not specified, defaults to on_reserve. */
        public Builder setEffectiveAt(IntentCreateParams.Action.Remove.EffectiveAt effectiveAt) {
          this.effectiveAt = effectiveAt;
          return this;
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

        /** The ID of the spend modifier rule to remove. */
        public Builder setSpendModifierRule(String spendModifierRule) {
          this.spendModifierRule = spendModifierRule;
          return this;
        }

        /** <strong>Required.</strong> Type of the remove action. */
        public Builder setType(IntentCreateParams.Action.Remove.Type type) {
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

        /** <strong>Required.</strong> When the remove action takes effect. */
        @SerializedName("type")
        Type type;

        private EffectiveAt(Map<String, Object> extraParams, Type type) {
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
          public IntentCreateParams.Action.Remove.EffectiveAt build() {
            return new IntentCreateParams.Action.Remove.EffectiveAt(this.extraParams, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.Action.Remove.EffectiveAt#extraParams} for the field
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
           * map. See {@link IntentCreateParams.Action.Remove.EffectiveAt#extraParams} for the field
           * documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> When the remove action takes effect. */
          public Builder setType(IntentCreateParams.Action.Remove.EffectiveAt.Type type) {
            this.type = type;
            return this;
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("current_billing_period_end")
          CURRENT_BILLING_PERIOD_END("current_billing_period_end"),

          @SerializedName("on_reserve")
          ON_RESERVE("on_reserve");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("invoice_discount_rule")
        INVOICE_DISCOUNT_RULE("invoice_discount_rule"),

        @SerializedName("spend_modifier_rule")
        SPEND_MODIFIER_RULE("spend_modifier_rule");

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
      /** When the invoice is collected. If not specified, defaults to on_effective_at. */
      @SerializedName("collect_at")
      CollectAt collectAt;

      /**
       * When the subscribe action takes effect. If not specified, the default behavior is
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

        /** When the invoice is collected. If not specified, defaults to on_effective_at. */
        public Builder setCollectAt(IntentCreateParams.Action.Subscribe.CollectAt collectAt) {
          this.collectAt = collectAt;
          return this;
        }

        /**
         * When the subscribe action takes effect. If not specified, the default behavior is
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
         * The timestamp at which the subscribe action takes effect. Only present if type is
         * timestamp.
         */
        @SerializedName("timestamp")
        Instant timestamp;

        /** <strong>Required.</strong> When the subscribe action takes effect. */
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
           * The timestamp at which the subscribe action takes effect. Only present if type is
           * timestamp.
           */
          public Builder setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
            return this;
          }

          /** <strong>Required.</strong> When the subscribe action takes effect. */
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

        /** Configurations for overriding behaviors related to the subscription. */
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

          /** Configurations for overriding behaviors related to the subscription. */
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

          /**
           * <strong>Required.</strong> Configurations for behaviors when the action takes effect
           * during the service period.
           */
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

            /**
             * Overrides the behavior for license fee components when the action takes effect during
             * the service period.
             */
            @SerializedName("license_fee")
            LicenseFee licenseFee;

            /**
             * Overrides the behavior for recurring credit grant components when the action takes
             * effect during the service period.
             */
            @SerializedName("recurring_credit_grant")
            RecurringCreditGrant recurringCreditGrant;

            /** <strong>Required.</strong> The type of behavior to override. */
            @SerializedName("type")
            Type type;

            private PartialPeriodBehavior(
                Map<String, Object> extraParams,
                LicenseFee licenseFee,
                RecurringCreditGrant recurringCreditGrant,
                Type type) {
              this.extraParams = extraParams;
              this.licenseFee = licenseFee;
              this.recurringCreditGrant = recurringCreditGrant;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private LicenseFee licenseFee;

              private RecurringCreditGrant recurringCreditGrant;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                      .PartialPeriodBehavior
                  build() {
                return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                    .Overrides.PartialPeriodBehavior(
                    this.extraParams, this.licenseFee, this.recurringCreditGrant, this.type);
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

              /**
               * Overrides the behavior for license fee components when the action takes effect
               * during the service period.
               */
              public Builder setLicenseFee(
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.LicenseFee
                      licenseFee) {
                this.licenseFee = licenseFee;
                return this;
              }

              /**
               * Overrides the behavior for recurring credit grant components when the action takes
               * effect during the service period.
               */
              public Builder setRecurringCreditGrant(
                  IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                          .PartialPeriodBehavior.RecurringCreditGrant
                      recurringCreditGrant) {
                this.recurringCreditGrant = recurringCreditGrant;
                return this;
              }

              /** <strong>Required.</strong> The type of behavior to override. */
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
               * Defines how we prorate the license fee when the user is subscribing. If not
               * specified, defaults to prorated.
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
                 * period. Defines how we prorate the license fee when the user is subscribing. If
                 * not specified, defaults to prorated.
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

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class RecurringCreditGrant {
              /**
               * <strong>Required.</strong> Controls credit grant creation behavior during partial
               * periods. If not specified, defaults to full_credits.
               */
              @SerializedName("create_behavior")
              CreateBehavior createBehavior;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private RecurringCreditGrant(
                  CreateBehavior createBehavior, Map<String, Object> extraParams) {
                this.createBehavior = createBehavior;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private CreateBehavior createBehavior;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                        .PartialPeriodBehavior.RecurringCreditGrant
                    build() {
                  return new IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails
                      .Overrides.PartialPeriodBehavior.RecurringCreditGrant(
                      this.createBehavior, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> Controls credit grant creation behavior during partial
                 * periods. If not specified, defaults to full_credits.
                 */
                public Builder setCreateBehavior(
                    IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides
                            .PartialPeriodBehavior.RecurringCreditGrant.CreateBehavior
                        createBehavior) {
                  this.createBehavior = createBehavior;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.RecurringCreditGrant#extraParams}
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
                 * IntentCreateParams.Action.Subscribe.PricingPlanSubscriptionDetails.Overrides.PartialPeriodBehavior.RecurringCreditGrant#extraParams}
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

              public enum CreateBehavior implements ApiRequestParams.EnumParam {
                @SerializedName("full_credits")
                FULL_CREDITS("full_credits"),

                @SerializedName("none")
                NONE("none");

                @Getter(onMethod_ = {@Override})
                private final String value;

                CreateBehavior(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("license_fee")
              LICENSE_FEE("license_fee"),

              @SerializedName("recurring_credit_grant")
              RECURRING_CREDIT_GRANT("recurring_credit_grant");

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

          /** Quantity for this item. If not provided, defaults to 1. */
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

            /** Quantity for this item. If not provided, defaults to 1. */
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

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillingGroupData {
    /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
    @SerializedName("billing_settings")
    BillingSettings billingSettings;

    /** <strong>Required.</strong> The ID of the Customer object whose invoices are grouped. */
    @SerializedName("customer")
    String customer;

    /**
     * The ID of the PaymentMethod object used by default. If unset, the customer's default payment
     * method is used.
     */
    @SerializedName("default_payment_method")
    String defaultPaymentMethod;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The strategy used to group member invoices. */
    @SerializedName("grouping_behavior")
    GroupingBehavior groupingBehavior;

    /**
     * An internal key you can use to find a particular billing group. Maximum length of 200
     * characters.
     */
    @SerializedName("lookup_key")
    String lookupKey;

    private BillingGroupData(
        BillingSettings billingSettings,
        String customer,
        String defaultPaymentMethod,
        Map<String, Object> extraParams,
        GroupingBehavior groupingBehavior,
        String lookupKey) {
      this.billingSettings = billingSettings;
      this.customer = customer;
      this.defaultPaymentMethod = defaultPaymentMethod;
      this.extraParams = extraParams;
      this.groupingBehavior = groupingBehavior;
      this.lookupKey = lookupKey;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private BillingSettings billingSettings;

      private String customer;

      private String defaultPaymentMethod;

      private Map<String, Object> extraParams;

      private GroupingBehavior groupingBehavior;

      private String lookupKey;

      /** Finalize and obtain parameter instance from this builder. */
      public IntentCreateParams.BillingGroupData build() {
        return new IntentCreateParams.BillingGroupData(
            this.billingSettings,
            this.customer,
            this.defaultPaymentMethod,
            this.extraParams,
            this.groupingBehavior,
            this.lookupKey);
      }

      /** Billing setting overrides for the group. If omitted, the applicable defaults are used. */
      public Builder setBillingSettings(
          IntentCreateParams.BillingGroupData.BillingSettings billingSettings) {
        this.billingSettings = billingSettings;
        return this;
      }

      /** <strong>Required.</strong> The ID of the Customer object whose invoices are grouped. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * The ID of the PaymentMethod object used by default. If unset, the customer's default
       * payment method is used.
       */
      public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * IntentCreateParams.BillingGroupData#extraParams} for the field documentation.
       */
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
       * See {@link IntentCreateParams.BillingGroupData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The strategy used to group member invoices. */
      public Builder setGroupingBehavior(
          IntentCreateParams.BillingGroupData.GroupingBehavior groupingBehavior) {
        this.groupingBehavior = groupingBehavior;
        return this;
      }

      /**
       * An internal key you can use to find a particular billing group. Maximum length of 200
       * characters.
       */
      public Builder setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class BillingSettings {
      /** How Stripe collects payment. */
      @SerializedName("collection_method")
      CollectionMethod collectionMethod;

      /** Email delivery setting. */
      @SerializedName("email_delivery")
      EmailDelivery emailDelivery;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Settings for invoice presentation. */
      @SerializedName("invoice_presentation")
      InvoicePresentation invoicePresentation;

      /** The amount of time until the invoice is overdue for payment. */
      @SerializedName("invoice_time_until_due")
      InvoiceTimeUntilDue invoiceTimeUntilDue;

      /**
       * The ID of the payment method configuration, which controls which payment methods are
       * displayed to your customers.
       */
      @SerializedName("payment_method_configuration")
      String paymentMethodConfiguration;

      /** Payment Method specific configuration to be stored on the object. */
      @SerializedName("payment_method_options")
      PaymentMethodOptions paymentMethodOptions;

      /** Settings for calculating tax. */
      @SerializedName("tax")
      Tax tax;

      private BillingSettings(
          CollectionMethod collectionMethod,
          EmailDelivery emailDelivery,
          Map<String, Object> extraParams,
          InvoicePresentation invoicePresentation,
          InvoiceTimeUntilDue invoiceTimeUntilDue,
          String paymentMethodConfiguration,
          PaymentMethodOptions paymentMethodOptions,
          Tax tax) {
        this.collectionMethod = collectionMethod;
        this.emailDelivery = emailDelivery;
        this.extraParams = extraParams;
        this.invoicePresentation = invoicePresentation;
        this.invoiceTimeUntilDue = invoiceTimeUntilDue;
        this.paymentMethodConfiguration = paymentMethodConfiguration;
        this.paymentMethodOptions = paymentMethodOptions;
        this.tax = tax;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private CollectionMethod collectionMethod;

        private EmailDelivery emailDelivery;

        private Map<String, Object> extraParams;

        private InvoicePresentation invoicePresentation;

        private InvoiceTimeUntilDue invoiceTimeUntilDue;

        private String paymentMethodConfiguration;

        private PaymentMethodOptions paymentMethodOptions;

        private Tax tax;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.BillingGroupData.BillingSettings build() {
          return new IntentCreateParams.BillingGroupData.BillingSettings(
              this.collectionMethod,
              this.emailDelivery,
              this.extraParams,
              this.invoicePresentation,
              this.invoiceTimeUntilDue,
              this.paymentMethodConfiguration,
              this.paymentMethodOptions,
              this.tax);
        }

        /** How Stripe collects payment. */
        public Builder setCollectionMethod(
            IntentCreateParams.BillingGroupData.BillingSettings.CollectionMethod collectionMethod) {
          this.collectionMethod = collectionMethod;
          return this;
        }

        /** Email delivery setting. */
        public Builder setEmailDelivery(
            IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery emailDelivery) {
          this.emailDelivery = emailDelivery;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.BillingGroupData.BillingSettings#extraParams} for the
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
         * map. See {@link IntentCreateParams.BillingGroupData.BillingSettings#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Settings for invoice presentation. */
        public Builder setInvoicePresentation(
            IntentCreateParams.BillingGroupData.BillingSettings.InvoicePresentation
                invoicePresentation) {
          this.invoicePresentation = invoicePresentation;
          return this;
        }

        /** The amount of time until the invoice is overdue for payment. */
        public Builder setInvoiceTimeUntilDue(
            IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue
                invoiceTimeUntilDue) {
          this.invoiceTimeUntilDue = invoiceTimeUntilDue;
          return this;
        }

        /**
         * The ID of the payment method configuration, which controls which payment methods are
         * displayed to your customers.
         */
        public Builder setPaymentMethodConfiguration(String paymentMethodConfiguration) {
          this.paymentMethodConfiguration = paymentMethodConfiguration;
          return this;
        }

        /** Payment Method specific configuration to be stored on the object. */
        public Builder setPaymentMethodOptions(
            IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                paymentMethodOptions) {
          this.paymentMethodOptions = paymentMethodOptions;
          return this;
        }

        /** Settings for calculating tax. */
        public Builder setTax(IntentCreateParams.BillingGroupData.BillingSettings.Tax tax) {
          this.tax = tax;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class EmailDelivery {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Controls emails for when the payment is due. Omit to use the applicable default. */
        @SerializedName("payment_due")
        PaymentDue paymentDue;

        private EmailDelivery(Map<String, Object> extraParams, PaymentDue paymentDue) {
          this.extraParams = extraParams;
          this.paymentDue = paymentDue;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private PaymentDue paymentDue;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery build() {
            return new IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery(
                this.extraParams, this.paymentDue);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery#extraParams} for the
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
           * IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Controls emails for when the payment is due. Omit to use the applicable default. */
          public Builder setPaymentDue(
              IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery.PaymentDue
                  paymentDue) {
            this.paymentDue = paymentDue;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class PaymentDue {
          /** If true an email for the invoice would be generated and sent out. */
          @SerializedName("enabled")
          Boolean enabled;

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
           * If true the payment link to hosted invoice page would be included in email and PDF of
           * the invoice.
           */
          @SerializedName("include_payment_link")
          Boolean includePaymentLink;

          private PaymentDue(
              Boolean enabled, Map<String, Object> extraParams, Boolean includePaymentLink) {
            this.enabled = enabled;
            this.extraParams = extraParams;
            this.includePaymentLink = includePaymentLink;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Boolean enabled;

            private Map<String, Object> extraParams;

            private Boolean includePaymentLink;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery.PaymentDue
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery
                  .PaymentDue(this.enabled, this.extraParams, this.includePaymentLink);
            }

            /** If true an email for the invoice would be generated and sent out. */
            public Builder setEnabled(Boolean enabled) {
              this.enabled = enabled;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery.PaymentDue#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.EmailDelivery.PaymentDue#extraParams}
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
             * If true the payment link to hosted invoice page would be included in email and PDF of
             * the invoice.
             */
            public Builder setIncludePaymentLink(Boolean includePaymentLink) {
              this.includePaymentLink = includePaymentLink;
              return this;
            }
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class InvoicePresentation {
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
         * The ID of the invoice rendering template to be used when generating invoices. Omit to use
         * the applicable default.
         */
        @SerializedName("invoice_rendering_template")
        String invoiceRenderingTemplate;

        private InvoicePresentation(
            Map<String, Object> extraParams, String invoiceRenderingTemplate) {
          this.extraParams = extraParams;
          this.invoiceRenderingTemplate = invoiceRenderingTemplate;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Map<String, Object> extraParams;

          private String invoiceRenderingTemplate;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.BillingGroupData.BillingSettings.InvoicePresentation build() {
            return new IntentCreateParams.BillingGroupData.BillingSettings.InvoicePresentation(
                this.extraParams, this.invoiceRenderingTemplate);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.BillingGroupData.BillingSettings.InvoicePresentation#extraParams}
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
           * IntentCreateParams.BillingGroupData.BillingSettings.InvoicePresentation#extraParams}
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
           * The ID of the invoice rendering template to be used when generating invoices. Omit to
           * use the applicable default.
           */
          public Builder setInvoiceRenderingTemplate(String invoiceRenderingTemplate) {
            this.invoiceRenderingTemplate = invoiceRenderingTemplate;
            return this;
          }
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class InvoiceTimeUntilDue {
        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** <strong>Required.</strong> The interval unit for the time until due. */
        @SerializedName("interval")
        Interval interval;

        /**
         * <strong>Required.</strong> The number of interval units. For example, if interval=day and
         * interval_count=30, the invoice is due in 30 days.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        private InvoiceTimeUntilDue(
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
          public IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue build() {
            return new IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue(
                this.extraParams, this.interval, this.intervalCount);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue#extraParams}
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
           * IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** <strong>Required.</strong> The interval unit for the time until due. */
          public Builder setInterval(
              IntentCreateParams.BillingGroupData.BillingSettings.InvoiceTimeUntilDue.Interval
                  interval) {
            this.interval = interval;
            return this;
          }

          /**
           * <strong>Required.</strong> The number of interval units. For example, if interval=day
           * and interval_count=30, the invoice is due in 30 days.
           */
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

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class PaymentMethodOptions {
        /**
         * This sub-hash contains details about the Canadian pre-authorized debit payment method
         * options.
         */
        @SerializedName("acss_debit")
        AcssDebit acssDebit;

        /** This sub-hash contains details about the Bancontact payment method. */
        @SerializedName("bancontact")
        Bancontact bancontact;

        /** This sub-hash contains details about the Card payment method options. */
        @SerializedName("card")
        Card card;

        /** This sub-hash contains details about the Bank transfer payment method options. */
        @SerializedName("customer_balance")
        CustomerBalance customerBalance;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** This sub-hash contains details about the Konbini payment method options. */
        @SerializedName("konbini")
        Konbini konbini;

        /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
        @SerializedName("sepa_debit")
        SepaDebit sepaDebit;

        /** This sub-hash contains details about the ACH direct debit payment method options. */
        @SerializedName("us_bank_account")
        UsBankAccount usBankAccount;

        private PaymentMethodOptions(
            AcssDebit acssDebit,
            Bancontact bancontact,
            Card card,
            CustomerBalance customerBalance,
            Map<String, Object> extraParams,
            Konbini konbini,
            SepaDebit sepaDebit,
            UsBankAccount usBankAccount) {
          this.acssDebit = acssDebit;
          this.bancontact = bancontact;
          this.card = card;
          this.customerBalance = customerBalance;
          this.extraParams = extraParams;
          this.konbini = konbini;
          this.sepaDebit = sepaDebit;
          this.usBankAccount = usBankAccount;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private AcssDebit acssDebit;

          private Bancontact bancontact;

          private Card card;

          private CustomerBalance customerBalance;

          private Map<String, Object> extraParams;

          private Konbini konbini;

          private SepaDebit sepaDebit;

          private UsBankAccount usBankAccount;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions build() {
            return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions(
                this.acssDebit,
                this.bancontact,
                this.card,
                this.customerBalance,
                this.extraParams,
                this.konbini,
                this.sepaDebit,
                this.usBankAccount);
          }

          /**
           * This sub-hash contains details about the Canadian pre-authorized debit payment method
           * options.
           */
          public Builder setAcssDebit(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit
                  acssDebit) {
            this.acssDebit = acssDebit;
            return this;
          }

          /** This sub-hash contains details about the Bancontact payment method. */
          public Builder setBancontact(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Bancontact
                  bancontact) {
            this.bancontact = bancontact;
            return this;
          }

          /** This sub-hash contains details about the Card payment method options. */
          public Builder setCard(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card card) {
            this.card = card;
            return this;
          }

          /** This sub-hash contains details about the Bank transfer payment method options. */
          public Builder setCustomerBalance(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                      .CustomerBalance
                  customerBalance) {
            this.customerBalance = customerBalance;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions#extraParams}
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
           * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions#extraParams}
           * for the field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** This sub-hash contains details about the Konbini payment method options. */
          public Builder setKonbini(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Konbini
                  konbini) {
            this.konbini = konbini;
            return this;
          }

          /** This sub-hash contains details about the SEPA Direct Debit payment method options. */
          public Builder setSepaDebit(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.SepaDebit
                  sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
          }

          /** This sub-hash contains details about the ACH direct debit payment method options. */
          public Builder setUsBankAccount(
              IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount
                  usBankAccount) {
            this.usBankAccount = usBankAccount;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class AcssDebit {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Additional fields for Mandate creation. */
          @SerializedName("mandate_options")
          MandateOptions mandateOptions;

          /** Verification method. */
          @SerializedName("verification_method")
          VerificationMethod verificationMethod;

          private AcssDebit(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              VerificationMethod verificationMethod) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.verificationMethod = verificationMethod;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private VerificationMethod verificationMethod;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .AcssDebit
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .AcssDebit(this.extraParams, this.mandateOptions, this.verificationMethod);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Additional fields for Mandate creation. */
            public Builder setMandateOptions(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit
                        .MandateOptions
                    mandateOptions) {
              this.mandateOptions = mandateOptions;
              return this;
            }

            /** Verification method. */
            public Builder setVerificationMethod(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit
                        .VerificationMethod
                    verificationMethod) {
              this.verificationMethod = verificationMethod;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MandateOptions {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** Transaction type of the mandate. */
            @SerializedName("transaction_type")
            TransactionType transactionType;

            private MandateOptions(
                Map<String, Object> extraParams, TransactionType transactionType) {
              this.extraParams = extraParams;
              this.transactionType = transactionType;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private TransactionType transactionType;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                      .AcssDebit.MandateOptions
                  build() {
                return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .AcssDebit.MandateOptions(this.extraParams, this.transactionType);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
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
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit.MandateOptions#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** Transaction type of the mandate. */
              public Builder setTransactionType(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.AcssDebit
                          .MandateOptions.TransactionType
                      transactionType) {
                this.transactionType = transactionType;
                return this;
              }
            }

            public enum TransactionType implements ApiRequestParams.EnumParam {
              @SerializedName("business")
              BUSINESS("business"),

              @SerializedName("personal")
              PERSONAL("personal");

              @Getter(onMethod_ = {@Override})
              private final String value;

              TransactionType(String value) {
                this.value = value;
              }
            }
          }

          public enum VerificationMethod implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("instant")
            INSTANT("instant"),

            @SerializedName("microdeposits")
            MICRODEPOSITS("microdeposits");

            @Getter(onMethod_ = {@Override})
            private final String value;

            VerificationMethod(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Bancontact {
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
           * Preferred language of the Bancontact authorization page that the customer is redirected
           * to.
           */
          @SerializedName("preferred_language")
          PreferredLanguage preferredLanguage;

          private Bancontact(Map<String, Object> extraParams, PreferredLanguage preferredLanguage) {
            this.extraParams = extraParams;
            this.preferredLanguage = preferredLanguage;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private PreferredLanguage preferredLanguage;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .Bancontact
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .Bancontact(this.extraParams, this.preferredLanguage);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Bancontact#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Bancontact#extraParams}
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
             * Preferred language of the Bancontact authorization page that the customer is
             * redirected to.
             */
            public Builder setPreferredLanguage(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Bancontact
                        .PreferredLanguage
                    preferredLanguage) {
              this.preferredLanguage = preferredLanguage;
              return this;
            }
          }

          public enum PreferredLanguage implements ApiRequestParams.EnumParam {
            @SerializedName("de")
            DE("de"),

            @SerializedName("en")
            EN("en"),

            @SerializedName("fr")
            FR("fr"),

            @SerializedName("nl")
            NL("nl");

            @Getter(onMethod_ = {@Override})
            private final String value;

            PreferredLanguage(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Card {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Configuration options for setting up an eMandate for cards issued in India. */
          @SerializedName("mandate_options")
          MandateOptions mandateOptions;

          /**
           * Selected network to process the payment on. Depends on the available networks of the
           * card.
           */
          @SerializedName("network")
          String network;

          /**
           * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine to
           * automatically prompt your customers for authentication based on risk level and <a
           * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
           * However, if you wish to request 3D Secure based on logic from your own fraud engine,
           * provide this option. Read our guide on <a
           * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
           * requesting 3D Secure</a> for more information on how this configuration interacts with
           * Radar and our SCA Engine.
           */
          @SerializedName("request_three_d_secure")
          RequestThreeDSecure requestThreeDSecure;

          private Card(
              Map<String, Object> extraParams,
              MandateOptions mandateOptions,
              String network,
              RequestThreeDSecure requestThreeDSecure) {
            this.extraParams = extraParams;
            this.mandateOptions = mandateOptions;
            this.network = network;
            this.requestThreeDSecure = requestThreeDSecure;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private MandateOptions mandateOptions;

            private String network;

            private RequestThreeDSecure requestThreeDSecure;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .Card(
                  this.extraParams, this.mandateOptions, this.network, this.requestThreeDSecure);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card#extraParams}
             * for the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Configuration options for setting up an eMandate for cards issued in India. */
            public Builder setMandateOptions(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card
                        .MandateOptions
                    mandateOptions) {
              this.mandateOptions = mandateOptions;
              return this;
            }

            /**
             * Selected network to process the payment on. Depends on the available networks of the
             * card.
             */
            public Builder setNetwork(String network) {
              this.network = network;
              return this;
            }

            /**
             * An advanced option 3D Secure. We strongly recommend that you rely on our SCA Engine
             * to automatically prompt your customers for authentication based on risk level and <a
             * href="https://docs.stripe.com/strong-customer-authentication">other requirements</a>.
             * However, if you wish to request 3D Secure based on logic from your own fraud engine,
             * provide this option. Read our guide on <a
             * href="https://docs.stripe.com/payments/3d-secure/authentication-flow#manual-three-ds">manually
             * requesting 3D Secure</a> for more information on how this configuration interacts
             * with Radar and our SCA Engine.
             */
            public Builder setRequestThreeDSecure(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card
                        .RequestThreeDSecure
                    requestThreeDSecure) {
              this.requestThreeDSecure = requestThreeDSecure;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class MandateOptions {
            /** Amount to be charged for future payments. */
            @SerializedName("amount")
            @JsonAdapter(StringInt64TypeAdapter.class)
            Long amount;

            /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
            @SerializedName("amount_type")
            AmountType amountType;

            /** A description of the mandate that is meant to be displayed to the customer. */
            @SerializedName("description")
            String description;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            private MandateOptions(
                Long amount,
                AmountType amountType,
                String description,
                Map<String, Object> extraParams) {
              this.amount = amount;
              this.amountType = amountType;
              this.description = description;
              this.extraParams = extraParams;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Long amount;

              private AmountType amountType;

              private String description;

              private Map<String, Object> extraParams;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card
                      .MandateOptions
                  build() {
                return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .Card.MandateOptions(
                    this.amount, this.amountType, this.description, this.extraParams);
              }

              /** Amount to be charged for future payments. */
              public Builder setAmount(Long amount) {
                this.amount = amount;
                return this;
              }

              /** The AmountType for the mandate. One of {@code fixed} or {@code maximum}. */
              public Builder setAmountType(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card
                          .MandateOptions.AmountType
                      amountType) {
                this.amountType = amountType;
                return this;
              }

              /** A description of the mandate that is meant to be displayed to the customer. */
              public Builder setDescription(String description) {
                this.description = description;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card.MandateOptions#extraParams}
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
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Card.MandateOptions#extraParams}
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

            public enum AmountType implements ApiRequestParams.EnumParam {
              @SerializedName("fixed")
              FIXED("fixed"),

              @SerializedName("maximum")
              MAXIMUM("maximum");

              @Getter(onMethod_ = {@Override})
              private final String value;

              AmountType(String value) {
                this.value = value;
              }
            }
          }

          public enum RequestThreeDSecure implements ApiRequestParams.EnumParam {
            @SerializedName("any")
            ANY("any"),

            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("challenge")
            CHALLENGE("challenge");

            @Getter(onMethod_ = {@Override})
            private final String value;

            RequestThreeDSecure(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class CustomerBalance {
          /**
           * Configuration for the bank transfer funding type, if the {@code funding_type} is set to
           * {@code bank_transfer}.
           */
          @SerializedName("bank_transfer")
          BankTransfer bankTransfer;

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
           * The funding method type to be used when there are not enough funds in the customer
           * balance. Currently the only supported value is {@code bank_transfer}.
           */
          @SerializedName("funding_type")
          FundingType fundingType;

          private CustomerBalance(
              BankTransfer bankTransfer, Map<String, Object> extraParams, FundingType fundingType) {
            this.bankTransfer = bankTransfer;
            this.extraParams = extraParams;
            this.fundingType = fundingType;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private BankTransfer bankTransfer;

            private Map<String, Object> extraParams;

            private FundingType fundingType;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .CustomerBalance
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .CustomerBalance(this.bankTransfer, this.extraParams, this.fundingType);
            }

            /**
             * Configuration for the bank transfer funding type, if the {@code funding_type} is set
             * to {@code bank_transfer}.
             */
            public Builder setBankTransfer(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .CustomerBalance.BankTransfer
                    bankTransfer) {
              this.bankTransfer = bankTransfer;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance#extraParams}
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
             * The funding method type to be used when there are not enough funds in the customer
             * balance. Currently the only supported value is {@code bank_transfer}.
             */
            public Builder setFundingType(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .CustomerBalance.FundingType
                    fundingType) {
              this.fundingType = fundingType;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class BankTransfer {
            /**
             * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type} is
             * {@code eu_bank_transfer}.
             */
            @SerializedName("eu_bank_transfer")
            EuBankTransfer euBankTransfer;

            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** The bank transfer type that can be used for funding. */
            @SerializedName("type")
            Type type;

            private BankTransfer(
                EuBankTransfer euBankTransfer, Map<String, Object> extraParams, Type type) {
              this.euBankTransfer = euBankTransfer;
              this.extraParams = extraParams;
              this.type = type;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private EuBankTransfer euBankTransfer;

              private Map<String, Object> extraParams;

              private Type type;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                      .CustomerBalance.BankTransfer
                  build() {
                return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .CustomerBalance.BankTransfer(this.euBankTransfer, this.extraParams, this.type);
              }

              /**
               * Configuration for {@code eu_bank_transfer} funding type. Required if {@code type}
               * is {@code eu_bank_transfer}.
               */
              public Builder setEuBankTransfer(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .CustomerBalance.BankTransfer.EuBankTransfer
                      euBankTransfer) {
                this.euBankTransfer = euBankTransfer;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
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
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** The bank transfer type that can be used for funding. */
              public Builder setType(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .CustomerBalance.BankTransfer.Type
                      type) {
                this.type = type;
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class EuBankTransfer {
              /**
               * <strong>Required.</strong> The desired country code of the bank account
               * information.
               */
              @SerializedName("country")
              Country country;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private EuBankTransfer(Country country, Map<String, Object> extraParams) {
                this.country = country;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private Country country;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .CustomerBalance.BankTransfer.EuBankTransfer
                    build() {
                  return new IntentCreateParams.BillingGroupData.BillingSettings
                      .PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer(
                      this.country, this.extraParams);
                }

                /**
                 * <strong>Required.</strong> The desired country code of the bank account
                 * information.
                 */
                public Builder setCountry(
                    IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                            .CustomerBalance.BankTransfer.EuBankTransfer.Country
                        country) {
                  this.country = country;
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.CustomerBalance.BankTransfer.EuBankTransfer#extraParams}
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

              public enum Country implements ApiRequestParams.EnumParam {
                @SerializedName("BE")
                BE("BE"),

                @SerializedName("DE")
                DE("DE"),

                @SerializedName("ES")
                ES("ES"),

                @SerializedName("FR")
                FR("FR"),

                @SerializedName("IE")
                IE("IE"),

                @SerializedName("NL")
                NL("NL");

                @Getter(onMethod_ = {@Override})
                private final String value;

                Country(String value) {
                  this.value = value;
                }
              }
            }

            public enum Type implements ApiRequestParams.EnumParam {
              @SerializedName("eu_bank_transfer")
              EU_BANK_TRANSFER("eu_bank_transfer"),

              @SerializedName("gb_bank_transfer")
              GB_BANK_TRANSFER("gb_bank_transfer"),

              @SerializedName("jp_bank_transfer")
              JP_BANK_TRANSFER("jp_bank_transfer"),

              @SerializedName("mx_bank_transfer")
              MX_BANK_TRANSFER("mx_bank_transfer"),

              @SerializedName("us_bank_transfer")
              US_BANK_TRANSFER("us_bank_transfer");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Type(String value) {
                this.value = value;
              }
            }
          }

          public enum FundingType implements ApiRequestParams.EnumParam {
            @SerializedName("bank_transfer")
            BANK_TRANSFER("bank_transfer");

            @Getter(onMethod_ = {@Override})
            private final String value;

            FundingType(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Konbini {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private Konbini(Map<String, Object> extraParams) {
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Konbini
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .Konbini(this.extraParams);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Konbini#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.Konbini#extraParams}
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
        public static class SepaDebit {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private SepaDebit(Map<String, Object> extraParams) {
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .SepaDebit
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .SepaDebit(this.extraParams);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.SepaDebit#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.SepaDebit#extraParams}
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
        public static class UsBankAccount {
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
           * <strong>Required.</strong> Additional fields for Financial Connections Session
           * creation.
           */
          @SerializedName("financial_connections")
          FinancialConnections financialConnections;

          /** <strong>Required.</strong> Verification method. */
          @SerializedName("verification_method")
          VerificationMethod verificationMethod;

          private UsBankAccount(
              Map<String, Object> extraParams,
              FinancialConnections financialConnections,
              VerificationMethod verificationMethod) {
            this.extraParams = extraParams;
            this.financialConnections = financialConnections;
            this.verificationMethod = verificationMethod;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private FinancialConnections financialConnections;

            private VerificationMethod verificationMethod;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .UsBankAccount
                build() {
              return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                  .UsBankAccount(
                  this.extraParams, this.financialConnections, this.verificationMethod);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount#extraParams}
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
             * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount#extraParams}
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
             * <strong>Required.</strong> Additional fields for Financial Connections Session
             * creation.
             */
            public Builder setFinancialConnections(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .UsBankAccount.FinancialConnections
                    financialConnections) {
              this.financialConnections = financialConnections;
              return this;
            }

            /** <strong>Required.</strong> Verification method. */
            public Builder setVerificationMethod(
                IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .UsBankAccount.VerificationMethod
                    verificationMethod) {
              this.verificationMethod = verificationMethod;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class FinancialConnections {
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
             * Provide filters for the linked accounts that the customer can select for the payment
             * method.
             */
            @SerializedName("filters")
            Filters filters;

            /**
             * The list of permissions to request. If this parameter is passed, the {@code
             * payment_method} permission must be included.
             */
            @SerializedName("permissions")
            List<
                    IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .UsBankAccount.FinancialConnections.Permission>
                permissions;

            /** List of data features that you would like to retrieve upon account creation. */
            @SerializedName("prefetch")
            List<
                    IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .UsBankAccount.FinancialConnections.Prefetch>
                prefetch;

            private FinancialConnections(
                Map<String, Object> extraParams,
                Filters filters,
                List<
                        IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                            .UsBankAccount.FinancialConnections.Permission>
                    permissions,
                List<
                        IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                            .UsBankAccount.FinancialConnections.Prefetch>
                    prefetch) {
              this.extraParams = extraParams;
              this.filters = filters;
              this.permissions = permissions;
              this.prefetch = prefetch;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Filters filters;

              private List<
                      IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Permission>
                  permissions;

              private List<
                      IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Prefetch>
                  prefetch;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                      .UsBankAccount.FinancialConnections
                  build() {
                return new IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                    .UsBankAccount.FinancialConnections(
                    this.extraParams, this.filters, this.permissions, this.prefetch);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#extraParams}
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
               * Provide filters for the linked accounts that the customer can select for the
               * payment method.
               */
              public Builder setFilters(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Filters
                      filters) {
                this.filters = filters;
                return this;
              }

              /**
               * Add an element to `permissions` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
               * for the field documentation.
               */
              public Builder addPermission(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Permission
                      element) {
                if (this.permissions == null) {
                  this.permissions = new ArrayList<>();
                }
                this.permissions.add(element);
                return this;
              }

              /**
               * Add all elements to `permissions` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#permissions}
               * for the field documentation.
               */
              public Builder addAllPermission(
                  List<
                          IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                              .UsBankAccount.FinancialConnections.Permission>
                      elements) {
                if (this.permissions == null) {
                  this.permissions = new ArrayList<>();
                }
                this.permissions.addAll(elements);
                return this;
              }

              /**
               * Add an element to `prefetch` list. A list is initialized for the first `add/addAll`
               * call, and subsequent calls adds additional elements to the original list. See
               * {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
               * for the field documentation.
               */
              public Builder addPrefetch(
                  IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Prefetch
                      element) {
                if (this.prefetch == null) {
                  this.prefetch = new ArrayList<>();
                }
                this.prefetch.add(element);
                return this;
              }

              /**
               * Add all elements to `prefetch` list. A list is initialized for the first
               * `add/addAll` call, and subsequent calls adds additional elements to the original
               * list. See {@link
               * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections#prefetch}
               * for the field documentation.
               */
              public Builder addAllPrefetch(
                  List<
                          IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                              .UsBankAccount.FinancialConnections.Prefetch>
                      elements) {
                if (this.prefetch == null) {
                  this.prefetch = new ArrayList<>();
                }
                this.prefetch.addAll(elements);
                return this;
              }
            }

            @Getter
            @EqualsAndHashCode(callSuper = false)
            public static class Filters {
              /** The account subcategories to use to filter for selectable accounts. */
              @SerializedName("account_subcategories")
              List<
                      IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                          .UsBankAccount.FinancialConnections.Filters.AccountSubcategory>
                  accountSubcategories;

              /**
               * Map of extra parameters for custom features not available in this client library.
               * The content in this map is not serialized under this field's
               * {@code @SerializedName} value. Instead, each key/value pair is serialized as if the
               * key is a root-level field (serialized) name in this param object. Effectively, this
               * map is flattened to its parent instance.
               */
              @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
              Map<String, Object> extraParams;

              private Filters(
                  List<
                          IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                              .UsBankAccount.FinancialConnections.Filters.AccountSubcategory>
                      accountSubcategories,
                  Map<String, Object> extraParams) {
                this.accountSubcategories = accountSubcategories;
                this.extraParams = extraParams;
              }

              public static Builder builder() {
                return new Builder();
              }

              public static class Builder {
                private List<
                        IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                            .UsBankAccount.FinancialConnections.Filters.AccountSubcategory>
                    accountSubcategories;

                private Map<String, Object> extraParams;

                /** Finalize and obtain parameter instance from this builder. */
                public IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                        .UsBankAccount.FinancialConnections.Filters
                    build() {
                  return new IntentCreateParams.BillingGroupData.BillingSettings
                      .PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters(
                      this.accountSubcategories, this.extraParams);
                }

                /**
                 * Add an element to `accountSubcategories` list. A list is initialized for the
                 * first `add/addAll` call, and subsequent calls adds additional elements to the
                 * original list. See {@link
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
                 * for the field documentation.
                 */
                public Builder addAccountSubcategory(
                    IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                            .UsBankAccount.FinancialConnections.Filters.AccountSubcategory
                        element) {
                  if (this.accountSubcategories == null) {
                    this.accountSubcategories = new ArrayList<>();
                  }
                  this.accountSubcategories.add(element);
                  return this;
                }

                /**
                 * Add all elements to `accountSubcategories` list. A list is initialized for the
                 * first `add/addAll` call, and subsequent calls adds additional elements to the
                 * original list. See {@link
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#accountSubcategories}
                 * for the field documentation.
                 */
                public Builder addAllAccountSubcategory(
                    List<
                            IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions
                                .UsBankAccount.FinancialConnections.Filters.AccountSubcategory>
                        elements) {
                  if (this.accountSubcategories == null) {
                    this.accountSubcategories = new ArrayList<>();
                  }
                  this.accountSubcategories.addAll(elements);
                  return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first
                 * `put/putAll` call, and subsequent calls add additional key/value pairs to the
                 * original map. See {@link
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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
                 * IntentCreateParams.BillingGroupData.BillingSettings.PaymentMethodOptions.UsBankAccount.FinancialConnections.Filters#extraParams}
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

              public enum AccountSubcategory implements ApiRequestParams.EnumParam {
                @SerializedName("checking")
                CHECKING("checking"),

                @SerializedName("savings")
                SAVINGS("savings");

                @Getter(onMethod_ = {@Override})
                private final String value;

                AccountSubcategory(String value) {
                  this.value = value;
                }
              }
            }

            public enum Permission implements ApiRequestParams.EnumParam {
              @SerializedName("balances")
              BALANCES("balances"),

              @SerializedName("ownership")
              OWNERSHIP("ownership"),

              @SerializedName("payment_method")
              PAYMENT_METHOD("payment_method"),

              @SerializedName("transactions")
              TRANSACTIONS("transactions");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Permission(String value) {
                this.value = value;
              }
            }

            public enum Prefetch implements ApiRequestParams.EnumParam {
              @SerializedName("balances")
              BALANCES("balances"),

              @SerializedName("ownership")
              OWNERSHIP("ownership"),

              @SerializedName("transactions")
              TRANSACTIONS("transactions");

              @Getter(onMethod_ = {@Override})
              private final String value;

              Prefetch(String value) {
                this.value = value;
              }
            }
          }

          public enum VerificationMethod implements ApiRequestParams.EnumParam {
            @SerializedName("automatic")
            AUTOMATIC("automatic"),

            @SerializedName("instant")
            INSTANT("instant"),

            @SerializedName("microdeposits")
            MICRODEPOSITS("microdeposits");

            @Getter(onMethod_ = {@Override})
            private final String value;

            VerificationMethod(String value) {
              this.value = value;
            }
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
         * Determines if tax is calculated automatically based on a product tax code or manually
         * based on rules defined by the business. Omit to use the applicable default.
         */
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
          public IntentCreateParams.BillingGroupData.BillingSettings.Tax build() {
            return new IntentCreateParams.BillingGroupData.BillingSettings.Tax(
                this.extraParams, this.type);
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link IntentCreateParams.BillingGroupData.BillingSettings.Tax#extraParams}
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
           * map. See {@link IntentCreateParams.BillingGroupData.BillingSettings.Tax#extraParams}
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
           * Determines if tax is calculated automatically based on a product tax code or manually
           * based on rules defined by the business. Omit to use the applicable default.
           */
          public Builder setType(
              IntentCreateParams.BillingGroupData.BillingSettings.Tax.Type type) {
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

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class GroupingBehavior {
      /** The cadence configuration when type is {@code by_cadence}. */
      @SerializedName("by_cadence")
      ByCadence byCadence;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The grouping strategy. */
      @SerializedName("type")
      Type type;

      private GroupingBehavior(ByCadence byCadence, Map<String, Object> extraParams, Type type) {
        this.byCadence = byCadence;
        this.extraParams = extraParams;
        this.type = type;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private ByCadence byCadence;

        private Map<String, Object> extraParams;

        private Type type;

        /** Finalize and obtain parameter instance from this builder. */
        public IntentCreateParams.BillingGroupData.GroupingBehavior build() {
          return new IntentCreateParams.BillingGroupData.GroupingBehavior(
              this.byCadence, this.extraParams, this.type);
        }

        /** The cadence configuration when type is {@code by_cadence}. */
        public Builder setByCadence(
            IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence byCadence) {
          this.byCadence = byCadence;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link IntentCreateParams.BillingGroupData.GroupingBehavior#extraParams} for the
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
         * map. See {@link IntentCreateParams.BillingGroupData.GroupingBehavior#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The grouping strategy. */
        public Builder setType(IntentCreateParams.BillingGroupData.GroupingBehavior.Type type) {
          this.type = type;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class ByCadence {
        /** Timestamp that anchors the recurring grouping cadence. */
        @SerializedName("billing_cycle_anchor")
        Instant billingCycleAnchor;

        /** Daily cadence details. */
        @SerializedName("day")
        Day day;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** The number of interval units between groups. Defaults to 1. */
        @SerializedName("interval_count")
        Long intervalCount;

        /** Monthly cadence details. */
        @SerializedName("month")
        Month month;

        /** <strong>Required.</strong> The interval unit for the cadence. */
        @SerializedName("type")
        Type type;

        /** Weekly cadence details. */
        @SerializedName("week")
        Week week;

        /** Yearly cadence details. */
        @SerializedName("year")
        Year year;

        private ByCadence(
            Instant billingCycleAnchor,
            Day day,
            Map<String, Object> extraParams,
            Long intervalCount,
            Month month,
            Type type,
            Week week,
            Year year) {
          this.billingCycleAnchor = billingCycleAnchor;
          this.day = day;
          this.extraParams = extraParams;
          this.intervalCount = intervalCount;
          this.month = month;
          this.type = type;
          this.week = week;
          this.year = year;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Instant billingCycleAnchor;

          private Day day;

          private Map<String, Object> extraParams;

          private Long intervalCount;

          private Month month;

          private Type type;

          private Week week;

          private Year year;

          /** Finalize and obtain parameter instance from this builder. */
          public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence build() {
            return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence(
                this.billingCycleAnchor,
                this.day,
                this.extraParams,
                this.intervalCount,
                this.month,
                this.type,
                this.week,
                this.year);
          }

          /** Timestamp that anchors the recurring grouping cadence. */
          public Builder setBillingCycleAnchor(Instant billingCycleAnchor) {
            this.billingCycleAnchor = billingCycleAnchor;
            return this;
          }

          /** Daily cadence details. */
          public Builder setDay(
              IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day day) {
            this.day = day;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link
           * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence#extraParams} for the
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
           * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** The number of interval units between groups. Defaults to 1. */
          public Builder setIntervalCount(Long intervalCount) {
            this.intervalCount = intervalCount;
            return this;
          }

          /** Monthly cadence details. */
          public Builder setMonth(
              IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month month) {
            this.month = month;
            return this;
          }

          /** <strong>Required.</strong> The interval unit for the cadence. */
          public Builder setType(
              IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Type type) {
            this.type = type;
            return this;
          }

          /** Weekly cadence details. */
          public Builder setWeek(
              IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week week) {
            this.week = week;
            return this;
          }

          /** Yearly cadence details. */
          public Builder setYear(
              IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year year) {
            this.year = year;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Day {
          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The time at which the daily grouping interval begins. */
          @SerializedName("time")
          Time time;

          private Day(Map<String, Object> extraParams, Time time) {
            this.extraParams = extraParams;
            this.time = time;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Map<String, Object> extraParams;

            private Time time;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day build() {
              return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day(
                  this.extraParams, this.time);
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day#extraParams} for
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
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The time at which the daily grouping interval begins. */
            public Builder setTime(
                IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day.Time time) {
              this.time = time;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Time {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** <strong>Required.</strong> The second, from 0 through 59. */
            @SerializedName("second")
            Long second;

            private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
              this.extraParams = extraParams;
              this.hour = hour;
              this.minute = minute;
              this.second = second;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Long hour;

              private Long minute;

              private Long second;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day.Time
                  build() {
                return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day.Time(
                    this.extraParams, this.hour, this.minute, this.second);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day.Time#extraParams}
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
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Day.Time#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The hour, from 0 through 23. */
              public Builder setHour(Long hour) {
                this.hour = hour;
                return this;
              }

              /** <strong>Required.</strong> The minute, from 0 through 59. */
              public Builder setMinute(Long minute) {
                this.minute = minute;
                return this;
              }

              /** <strong>Required.</strong> The second, from 0 through 59. */
              public Builder setSecond(Long second) {
                this.second = second;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Month {
          /**
           * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
           * cadence anchors to the month's last day.
           */
          @SerializedName("day_of_month")
          Long dayOfMonth;

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
           * The month of year, from 1 through 12, from which occurrences are calculated. Defaults
           * to the month when the billing group was created.
           */
          @SerializedName("month_of_year")
          Long monthOfYear;

          /**
           * The time at which the monthly grouping interval begins. Defaults to the time the
           * billing group is created, in UTC.
           */
          @SerializedName("time")
          Time time;

          private Month(
              Long dayOfMonth, Map<String, Object> extraParams, Long monthOfYear, Time time) {
            this.dayOfMonth = dayOfMonth;
            this.extraParams = extraParams;
            this.monthOfYear = monthOfYear;
            this.time = time;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long dayOfMonth;

            private Map<String, Object> extraParams;

            private Long monthOfYear;

            private Time time;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month build() {
              return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month(
                  this.dayOfMonth, this.extraParams, this.monthOfYear, this.time);
            }

            /**
             * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months,
             * the cadence anchors to the month's last day.
             */
            public Builder setDayOfMonth(Long dayOfMonth) {
              this.dayOfMonth = dayOfMonth;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month#extraParams} for
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
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month#extraParams} for
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
             * The month of year, from 1 through 12, from which occurrences are calculated. Defaults
             * to the month when the billing group was created.
             */
            public Builder setMonthOfYear(Long monthOfYear) {
              this.monthOfYear = monthOfYear;
              return this;
            }

            /**
             * The time at which the monthly grouping interval begins. Defaults to the time the
             * billing group is created, in UTC.
             */
            public Builder setTime(
                IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month.Time time) {
              this.time = time;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Time {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** <strong>Required.</strong> The second, from 0 through 59. */
            @SerializedName("second")
            Long second;

            private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
              this.extraParams = extraParams;
              this.hour = hour;
              this.minute = minute;
              this.second = second;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Long hour;

              private Long minute;

              private Long second;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month.Time
                  build() {
                return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month
                    .Time(this.extraParams, this.hour, this.minute, this.second);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month.Time#extraParams}
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
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Month.Time#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The hour, from 0 through 23. */
              public Builder setHour(Long hour) {
                this.hour = hour;
                return this;
              }

              /** <strong>Required.</strong> The minute, from 0 through 59. */
              public Builder setMinute(Long minute) {
                this.minute = minute;
                return this;
              }

              /** <strong>Required.</strong> The second, from 0 through 59. */
              public Builder setSecond(Long second) {
                this.second = second;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Week {
          /**
           * <strong>Required.</strong> The ISO-8601 day of week, from 1 for Monday through 7 for
           * Sunday.
           */
          @SerializedName("day_of_week")
          Long dayOfWeek;

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
           * The time at which the weekly grouping interval begins. Defaults to the time the billing
           * group is created, in UTC.
           */
          @SerializedName("time")
          Time time;

          private Week(Long dayOfWeek, Map<String, Object> extraParams, Time time) {
            this.dayOfWeek = dayOfWeek;
            this.extraParams = extraParams;
            this.time = time;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long dayOfWeek;

            private Map<String, Object> extraParams;

            private Time time;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week build() {
              return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week(
                  this.dayOfWeek, this.extraParams, this.time);
            }

            /**
             * <strong>Required.</strong> The ISO-8601 day of week, from 1 for Monday through 7 for
             * Sunday.
             */
            public Builder setDayOfWeek(Long dayOfWeek) {
              this.dayOfWeek = dayOfWeek;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week#extraParams} for
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
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week#extraParams} for
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
             * The time at which the weekly grouping interval begins. Defaults to the time the
             * billing group is created, in UTC.
             */
            public Builder setTime(
                IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week.Time time) {
              this.time = time;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Time {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** <strong>Required.</strong> The second, from 0 through 59. */
            @SerializedName("second")
            Long second;

            private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
              this.extraParams = extraParams;
              this.hour = hour;
              this.minute = minute;
              this.second = second;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Long hour;

              private Long minute;

              private Long second;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week.Time
                  build() {
                return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week.Time(
                    this.extraParams, this.hour, this.minute, this.second);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week.Time#extraParams}
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
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Week.Time#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The hour, from 0 through 23. */
              public Builder setHour(Long hour) {
                this.hour = hour;
                return this;
              }

              /** <strong>Required.</strong> The minute, from 0 through 59. */
              public Builder setMinute(Long minute) {
                this.minute = minute;
                return this;
              }

              /** <strong>Required.</strong> The second, from 0 through 59. */
              public Builder setSecond(Long second) {
                this.second = second;
                return this;
              }
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class Year {
          /**
           * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months, the
           * cadence anchors to the month's last day.
           */
          @SerializedName("day_of_month")
          Long dayOfMonth;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** <strong>Required.</strong> The month of year, from 1 through 12. */
          @SerializedName("month_of_year")
          Long monthOfYear;

          /**
           * The time at which the yearly grouping interval begins. Defaults to the time the billing
           * group is created, in UTC.
           */
          @SerializedName("time")
          Time time;

          private Year(
              Long dayOfMonth, Map<String, Object> extraParams, Long monthOfYear, Time time) {
            this.dayOfMonth = dayOfMonth;
            this.extraParams = extraParams;
            this.monthOfYear = monthOfYear;
            this.time = time;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long dayOfMonth;

            private Map<String, Object> extraParams;

            private Long monthOfYear;

            private Time time;

            /** Finalize and obtain parameter instance from this builder. */
            public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year build() {
              return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year(
                  this.dayOfMonth, this.extraParams, this.monthOfYear, this.time);
            }

            /**
             * <strong>Required.</strong> The day of month, from 1 through 31. For shorter months,
             * the cadence anchors to the month's last day.
             */
            public Builder setDayOfMonth(Long dayOfMonth) {
              this.dayOfMonth = dayOfMonth;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year#extraParams} for
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
             * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year#extraParams} for
             * the field documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** <strong>Required.</strong> The month of year, from 1 through 12. */
            public Builder setMonthOfYear(Long monthOfYear) {
              this.monthOfYear = monthOfYear;
              return this;
            }

            /**
             * The time at which the yearly grouping interval begins. Defaults to the time the
             * billing group is created, in UTC.
             */
            public Builder setTime(
                IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year.Time time) {
              this.time = time;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Time {
            /**
             * Map of extra parameters for custom features not available in this client library. The
             * content in this map is not serialized under this field's {@code @SerializedName}
             * value. Instead, each key/value pair is serialized as if the key is a root-level field
             * (serialized) name in this param object. Effectively, this map is flattened to its
             * parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /** <strong>Required.</strong> The hour, from 0 through 23. */
            @SerializedName("hour")
            Long hour;

            /** <strong>Required.</strong> The minute, from 0 through 59. */
            @SerializedName("minute")
            Long minute;

            /** <strong>Required.</strong> The second, from 0 through 59. */
            @SerializedName("second")
            Long second;

            private Time(Map<String, Object> extraParams, Long hour, Long minute, Long second) {
              this.extraParams = extraParams;
              this.hour = hour;
              this.minute = minute;
              this.second = second;
            }

            public static Builder builder() {
              return new Builder();
            }

            public static class Builder {
              private Map<String, Object> extraParams;

              private Long hour;

              private Long minute;

              private Long second;

              /** Finalize and obtain parameter instance from this builder. */
              public IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year.Time
                  build() {
                return new IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year.Time(
                    this.extraParams, this.hour, this.minute, this.second);
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year.Time#extraParams}
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
               * IntentCreateParams.BillingGroupData.GroupingBehavior.ByCadence.Year.Time#extraParams}
               * for the field documentation.
               */
              public Builder putAllExtraParam(Map<String, Object> map) {
                if (this.extraParams == null) {
                  this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
              }

              /** <strong>Required.</strong> The hour, from 0 through 23. */
              public Builder setHour(Long hour) {
                this.hour = hour;
                return this;
              }

              /** <strong>Required.</strong> The minute, from 0 through 59. */
              public Builder setMinute(Long minute) {
                this.minute = minute;
                return this;
              }

              /** <strong>Required.</strong> The second, from 0 through 59. */
              public Builder setSecond(Long second) {
                this.second = second;
                return this;
              }
            }
          }
        }

        public enum Type implements ApiRequestParams.EnumParam {
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

          Type(String value) {
            this.value = value;
          }
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("by_cadence")
        BY_CADENCE("by_cadence");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }
}
