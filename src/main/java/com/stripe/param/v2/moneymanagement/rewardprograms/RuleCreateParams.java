// File generated from our OpenAPI spec
package com.stripe.param.v2.moneymanagement.rewardprograms;

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
public class RuleCreateParams extends ApiRequestParams {
  /**
   * Conditions that must be true for this rule to match a card transaction. Omitting this field, or
   * providing an empty condition, means the rule matches all transactions.
   */
  @SerializedName("condition")
  Condition condition;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Human-readable name for this rule. Max 250 characters. */
  @SerializedName("name")
  String name;

  /** <strong>Required.</strong> The reward to grant when this rule matches. */
  @SerializedName("reward")
  Reward reward;

  private RuleCreateParams(
      Condition condition, Map<String, Object> extraParams, String name, Reward reward) {
    this.condition = condition;
    this.extraParams = extraParams;
    this.name = name;
    this.reward = reward;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Condition condition;

    private Map<String, Object> extraParams;

    private String name;

    private Reward reward;

    /** Finalize and obtain parameter instance from this builder. */
    public RuleCreateParams build() {
      return new RuleCreateParams(this.condition, this.extraParams, this.name, this.reward);
    }

    /**
     * Conditions that must be true for this rule to match a card transaction. Omitting this field,
     * or providing an empty condition, means the rule matches all transactions.
     */
    public Builder setCondition(RuleCreateParams.Condition condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * RuleCreateParams#extraParams} for the field documentation.
     */
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
     * See {@link RuleCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Human-readable name for this rule. Max 250 characters. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** <strong>Required.</strong> The reward to grant when this rule matches. */
    public Builder setReward(RuleCreateParams.Reward reward) {
      this.reward = reward;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Condition {
    /** Card-spend specific matching condition. */
    @SerializedName("card_spend")
    CardSpend cardSpend;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Condition(CardSpend cardSpend, Map<String, Object> extraParams) {
      this.cardSpend = cardSpend;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private CardSpend cardSpend;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RuleCreateParams.Condition build() {
        return new RuleCreateParams.Condition(this.cardSpend, this.extraParams);
      }

      /** Card-spend specific matching condition. */
      public Builder setCardSpend(RuleCreateParams.Condition.CardSpend cardSpend) {
        this.cardSpend = cardSpend;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RuleCreateParams.Condition#extraParams} for the field documentation.
       */
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
       * See {@link RuleCreateParams.Condition#extraParams} for the field documentation.
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
    public static class CardSpend {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * Merchant Category Code include/exclude configuration. Omitted means the rule matches all
       * MCCs.
       */
      @SerializedName("merchant_category_codes")
      MerchantCategoryCodes merchantCategoryCodes;

      private CardSpend(
          Map<String, Object> extraParams, MerchantCategoryCodes merchantCategoryCodes) {
        this.extraParams = extraParams;
        this.merchantCategoryCodes = merchantCategoryCodes;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private MerchantCategoryCodes merchantCategoryCodes;

        /** Finalize and obtain parameter instance from this builder. */
        public RuleCreateParams.Condition.CardSpend build() {
          return new RuleCreateParams.Condition.CardSpend(
              this.extraParams, this.merchantCategoryCodes);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RuleCreateParams.Condition.CardSpend#extraParams} for the field
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
         * map. See {@link RuleCreateParams.Condition.CardSpend#extraParams} for the field
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
         * Merchant Category Code include/exclude configuration. Omitted means the rule matches all
         * MCCs.
         */
        public Builder setMerchantCategoryCodes(
            RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes merchantCategoryCodes) {
          this.merchantCategoryCodes = merchantCategoryCodes;
          return this;
        }
      }

      @Getter
      @EqualsAndHashCode(callSuper = false)
      public static class MerchantCategoryCodes {
        /**
         * <strong>Required.</strong> Four-digit Merchant Category Codes to explicitly exclude.
         * Takes precedence over {@code included}.
         */
        @SerializedName("excluded")
        List<String> excluded;

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
         * <strong>Required.</strong> Four-digit Merchant Category Codes to include. An empty list
         * matches all MCCs.
         */
        @SerializedName("included")
        List<String> included;

        private MerchantCategoryCodes(
            List<String> excluded, Map<String, Object> extraParams, List<String> included) {
          this.excluded = excluded;
          this.extraParams = extraParams;
          this.included = included;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private List<String> excluded;

          private Map<String, Object> extraParams;

          private List<String> included;

          /** Finalize and obtain parameter instance from this builder. */
          public RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes build() {
            return new RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes(
                this.excluded, this.extraParams, this.included);
          }

          /**
           * Add an element to `excluded` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#excluded} for the field
           * documentation.
           */
          public Builder addExcluded(String element) {
            if (this.excluded == null) {
              this.excluded = new ArrayList<>();
            }
            this.excluded.add(element);
            return this;
          }

          /**
           * Add all elements to `excluded` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#excluded} for the field
           * documentation.
           */
          public Builder addAllExcluded(List<String> elements) {
            if (this.excluded == null) {
              this.excluded = new ArrayList<>();
            }
            this.excluded.addAll(elements);
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#extraParams}
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
           * map. See {@link RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#extraParams}
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
           * Add an element to `included` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#included} for the field
           * documentation.
           */
          public Builder addIncluded(String element) {
            if (this.included == null) {
              this.included = new ArrayList<>();
            }
            this.included.add(element);
            return this;
          }

          /**
           * Add all elements to `included` list. A list is initialized for the first `add/addAll`
           * call, and subsequent calls adds additional elements to the original list. See {@link
           * RuleCreateParams.Condition.CardSpend.MerchantCategoryCodes#included} for the field
           * documentation.
           */
          public Builder addAllIncluded(List<String> elements) {
            if (this.included == null) {
              this.included = new ArrayList<>();
            }
            this.included.addAll(elements);
            return this;
          }
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Reward {
    /** <strong>Required.</strong> Cashback reward configuration. */
    @SerializedName("cashback")
    Cashback cashback;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Reward(Cashback cashback, Map<String, Object> extraParams) {
      this.cashback = cashback;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Cashback cashback;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public RuleCreateParams.Reward build() {
        return new RuleCreateParams.Reward(this.cashback, this.extraParams);
      }

      /** <strong>Required.</strong> Cashback reward configuration. */
      public Builder setCashback(RuleCreateParams.Reward.Cashback cashback) {
        this.cashback = cashback;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RuleCreateParams.Reward#extraParams} for the field documentation.
       */
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
       * See {@link RuleCreateParams.Reward#extraParams} for the field documentation.
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
    public static class Cashback {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Cashback rate as a percentage, represented as a decimal string.
       * For example, {@code "2"} represents 2% and {@code "1.5"} represents 1.5%. Must be greater
       * than {@code "0"} and less than or equal to {@code "100"}.
       */
      @SerializedName("rate")
      BigDecimal rate;

      private Cashback(Map<String, Object> extraParams, BigDecimal rate) {
        this.extraParams = extraParams;
        this.rate = rate;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private BigDecimal rate;

        /** Finalize and obtain parameter instance from this builder. */
        public RuleCreateParams.Reward.Cashback build() {
          return new RuleCreateParams.Reward.Cashback(this.extraParams, this.rate);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link RuleCreateParams.Reward.Cashback#extraParams} for the field
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
         * map. See {@link RuleCreateParams.Reward.Cashback#extraParams} for the field
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
         * <strong>Required.</strong> Cashback rate as a percentage, represented as a decimal
         * string. For example, {@code "2"} represents 2% and {@code "1.5"} represents 1.5%. Must be
         * greater than {@code "0"} and less than or equal to {@code "100"}.
         */
        public Builder setRate(BigDecimal rate) {
          this.rate = rate;
          return this;
        }
      }
    }
  }
}
