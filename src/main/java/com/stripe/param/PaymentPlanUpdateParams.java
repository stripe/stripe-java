// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class PaymentPlanUpdateParams extends ApiRequestParams {
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
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** The new schedule for this payment plan. */
  @SerializedName("schedule")
  Schedule schedule;

  private PaymentPlanUpdateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      Schedule schedule) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.schedule = schedule;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private Schedule schedule;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentPlanUpdateParams build() {
      return new PaymentPlanUpdateParams(
          this.expand, this.extraParams, this.metadata, this.schedule);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentPlanUpdateParams#expand} for the field documentation.
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
     * PaymentPlanUpdateParams#expand} for the field documentation.
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
     * PaymentPlanUpdateParams#extraParams} for the field documentation.
     */
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
     * See {@link PaymentPlanUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentPlanUpdateParams#metadata} for the field documentation.
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
     * See {@link PaymentPlanUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** The new schedule for this payment plan. */
    public Builder setSchedule(PaymentPlanUpdateParams.Schedule schedule) {
      this.schedule = schedule;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Schedule {
    /** <strong>Required.</strong> Required when type is 'amounts_due'. */
    @SerializedName("amounts_due")
    AmountsDue amountsDue;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The schedule type. Currently only 'amounts_due' is supported. */
    @SerializedName("type")
    Type type;

    private Schedule(AmountsDue amountsDue, Map<String, Object> extraParams, Type type) {
      this.amountsDue = amountsDue;
      this.extraParams = extraParams;
      this.type = type;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AmountsDue amountsDue;

      private Map<String, Object> extraParams;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentPlanUpdateParams.Schedule build() {
        return new PaymentPlanUpdateParams.Schedule(this.amountsDue, this.extraParams, this.type);
      }

      /** <strong>Required.</strong> Required when type is 'amounts_due'. */
      public Builder setAmountsDue(PaymentPlanUpdateParams.Schedule.AmountsDue amountsDue) {
        this.amountsDue = amountsDue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentPlanUpdateParams.Schedule#extraParams} for the field documentation.
       */
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
       * See {@link PaymentPlanUpdateParams.Schedule#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * <strong>Required.</strong> The schedule type. Currently only 'amounts_due' is supported.
       */
      public Builder setType(PaymentPlanUpdateParams.Schedule.Type type) {
        this.type = type;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class AmountsDue {
      /** <strong>Required.</strong> The list of installment entries. */
      @SerializedName("amounts")
      List<PaymentPlanUpdateParams.Schedule.AmountsDue.Amount> amounts;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      private AmountsDue(
          List<PaymentPlanUpdateParams.Schedule.AmountsDue.Amount> amounts,
          Map<String, Object> extraParams) {
        this.amounts = amounts;
        this.extraParams = extraParams;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private List<PaymentPlanUpdateParams.Schedule.AmountsDue.Amount> amounts;

        private Map<String, Object> extraParams;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentPlanUpdateParams.Schedule.AmountsDue build() {
          return new PaymentPlanUpdateParams.Schedule.AmountsDue(this.amounts, this.extraParams);
        }

        /**
         * Add an element to `amounts` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * PaymentPlanUpdateParams.Schedule.AmountsDue#amounts} for the field documentation.
         */
        public Builder addAmount(PaymentPlanUpdateParams.Schedule.AmountsDue.Amount element) {
          if (this.amounts == null) {
            this.amounts = new ArrayList<>();
          }
          this.amounts.add(element);
          return this;
        }

        /**
         * Add all elements to `amounts` list. A list is initialized for the first `add/addAll`
         * call, and subsequent calls adds additional elements to the original list. See {@link
         * PaymentPlanUpdateParams.Schedule.AmountsDue#amounts} for the field documentation.
         */
        public Builder addAllAmount(
            List<PaymentPlanUpdateParams.Schedule.AmountsDue.Amount> elements) {
          if (this.amounts == null) {
            this.amounts = new ArrayList<>();
          }
          this.amounts.addAll(elements);
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentPlanUpdateParams.Schedule.AmountsDue#extraParams} for the field
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
         * map. See {@link PaymentPlanUpdateParams.Schedule.AmountsDue#extraParams} for the field
         * documentation.
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
        /** Optional description for this installment. */
        @SerializedName("description")
        Object description;

        /** When this installment is due. */
        @SerializedName("due_date")
        DueDate dueDate;

        /**
         * Map of extra parameters for custom features not available in this client library. The
         * content in this map is not serialized under this field's {@code @SerializedName} value.
         * Instead, each key/value pair is serialized as if the key is a root-level field
         * (serialized) name in this param object. Effectively, this map is flattened to its parent
         * instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /** Required when type is 'fixed_amount'. */
        @SerializedName("fixed_amount")
        FixedAmount fixedAmount;

        /** Optional stable identifier for the installment entry. */
        @SerializedName("id")
        Object id;

        /** The installment percentage of the total. Required when type is 'percentage'. */
        @SerializedName("percentage")
        BigDecimal percentage;

        /** <strong>Required.</strong> Either 'fixed_amount' or 'percentage'. */
        @SerializedName("type")
        Type type;

        private Amount(
            Object description,
            DueDate dueDate,
            Map<String, Object> extraParams,
            FixedAmount fixedAmount,
            Object id,
            BigDecimal percentage,
            Type type) {
          this.description = description;
          this.dueDate = dueDate;
          this.extraParams = extraParams;
          this.fixedAmount = fixedAmount;
          this.id = id;
          this.percentage = percentage;
          this.type = type;
        }

        public static Builder builder() {
          return new Builder();
        }

        public static class Builder {
          private Object description;

          private DueDate dueDate;

          private Map<String, Object> extraParams;

          private FixedAmount fixedAmount;

          private Object id;

          private BigDecimal percentage;

          private Type type;

          /** Finalize and obtain parameter instance from this builder. */
          public PaymentPlanUpdateParams.Schedule.AmountsDue.Amount build() {
            return new PaymentPlanUpdateParams.Schedule.AmountsDue.Amount(
                this.description,
                this.dueDate,
                this.extraParams,
                this.fixedAmount,
                this.id,
                this.percentage,
                this.type);
          }

          /** Optional description for this installment. */
          public Builder setDescription(String description) {
            this.description = description;
            return this;
          }

          /** Optional description for this installment. */
          public Builder setDescription(EmptyParam description) {
            this.description = description;
            return this;
          }

          /** When this installment is due. */
          public Builder setDueDate(
              PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate dueDate) {
            this.dueDate = dueDate;
            return this;
          }

          /**
           * Add a key/value pair to `extraParams` map. A map is initialized for the first
           * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
           * map. See {@link PaymentPlanUpdateParams.Schedule.AmountsDue.Amount#extraParams} for the
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
           * map. See {@link PaymentPlanUpdateParams.Schedule.AmountsDue.Amount#extraParams} for the
           * field documentation.
           */
          public Builder putAllExtraParam(Map<String, Object> map) {
            if (this.extraParams == null) {
              this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
          }

          /** Required when type is 'fixed_amount'. */
          public Builder setFixedAmount(
              PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.FixedAmount fixedAmount) {
            this.fixedAmount = fixedAmount;
            return this;
          }

          /** Optional stable identifier for the installment entry. */
          public Builder setId(String id) {
            this.id = id;
            return this;
          }

          /** Optional stable identifier for the installment entry. */
          public Builder setId(EmptyParam id) {
            this.id = id;
            return this;
          }

          /** The installment percentage of the total. Required when type is 'percentage'. */
          public Builder setPercentage(BigDecimal percentage) {
            this.percentage = percentage;
            return this;
          }

          /** <strong>Required.</strong> Either 'fixed_amount' or 'percentage'. */
          public Builder setType(PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.Type type) {
            this.type = type;
            return this;
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class DueDate {
          /** Unix timestamp. Required when type is 'absolute'. */
          @SerializedName("absolute")
          Long absolute;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          /** Required when type is 'relative'. */
          @SerializedName("relative")
          Relative relative;

          /** <strong>Required.</strong> Either 'absolute' or 'relative'. */
          @SerializedName("type")
          Type type;

          private DueDate(
              Long absolute, Map<String, Object> extraParams, Relative relative, Type type) {
            this.absolute = absolute;
            this.extraParams = extraParams;
            this.relative = relative;
            this.type = type;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long absolute;

            private Map<String, Object> extraParams;

            private Relative relative;

            private Type type;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate build() {
              return new PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate(
                  this.absolute, this.extraParams, this.relative, this.type);
            }

            /** Unix timestamp. Required when type is 'absolute'. */
            public Builder setAbsolute(Long absolute) {
              this.absolute = absolute;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate#extraParams} for the field
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
             * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate#extraParams} for the field
             * documentation.
             */
            public Builder putAllExtraParam(Map<String, Object> map) {
              if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
              }
              this.extraParams.putAll(map);
              return this;
            }

            /** Required when type is 'relative'. */
            public Builder setRelative(
                PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative relative) {
              this.relative = relative;
              return this;
            }

            /** <strong>Required.</strong> Either 'absolute' or 'relative'. */
            public Builder setType(
                PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Type type) {
              this.type = type;
              return this;
            }
          }

          @Getter
          @EqualsAndHashCode(callSuper = false)
          public static class Relative {
            /** <strong>Required.</strong> The number of intervals after finalization. */
            @SerializedName("count")
            Long count;

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

            private Relative(Long count, Map<String, Object> extraParams, Interval interval) {
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
              public PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative build() {
                return new PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative(
                    this.count, this.extraParams, this.interval);
              }

              /** <strong>Required.</strong> The number of intervals after finalization. */
              public Builder setCount(Long count) {
                this.count = count;
                return this;
              }

              /**
               * Add a key/value pair to `extraParams` map. A map is initialized for the first
               * `put/putAll` call, and subsequent calls add additional key/value pairs to the
               * original map. See {@link
               * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative#extraParams}
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
               * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative#extraParams}
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
                  PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.DueDate.Relative.Interval
                      interval) {
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

          public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("absolute")
            ABSOLUTE("absolute"),

            @SerializedName("relative")
            RELATIVE("relative");

            @Getter(onMethod_ = {@Override})
            private final String value;

            Type(String value) {
              this.value = value;
            }
          }
        }

        @Getter
        @EqualsAndHashCode(callSuper = false)
        public static class FixedAmount {
          /** <strong>Required.</strong> The installment amount in minor units. */
          @SerializedName("amount")
          Long amount;

          /** <strong>Required.</strong> Three-letter ISO currency code. */
          @SerializedName("currency")
          Object currency;

          /**
           * Map of extra parameters for custom features not available in this client library. The
           * content in this map is not serialized under this field's {@code @SerializedName} value.
           * Instead, each key/value pair is serialized as if the key is a root-level field
           * (serialized) name in this param object. Effectively, this map is flattened to its
           * parent instance.
           */
          @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
          Map<String, Object> extraParams;

          private FixedAmount(Long amount, Object currency, Map<String, Object> extraParams) {
            this.amount = amount;
            this.currency = currency;
            this.extraParams = extraParams;
          }

          public static Builder builder() {
            return new Builder();
          }

          public static class Builder {
            private Long amount;

            private Object currency;

            private Map<String, Object> extraParams;

            /** Finalize and obtain parameter instance from this builder. */
            public PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.FixedAmount build() {
              return new PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.FixedAmount(
                  this.amount, this.currency, this.extraParams);
            }

            /** <strong>Required.</strong> The installment amount in minor units. */
            public Builder setAmount(Long amount) {
              this.amount = amount;
              return this;
            }

            /** <strong>Required.</strong> Three-letter ISO currency code. */
            public Builder setCurrency(String currency) {
              this.currency = currency;
              return this;
            }

            /** <strong>Required.</strong> Three-letter ISO currency code. */
            public Builder setCurrency(EmptyParam currency) {
              this.currency = currency;
              return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first
             * `put/putAll` call, and subsequent calls add additional key/value pairs to the
             * original map. See {@link
             * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.FixedAmount#extraParams} for the
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
             * PaymentPlanUpdateParams.Schedule.AmountsDue.Amount.FixedAmount#extraParams} for the
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

        public enum Type implements ApiRequestParams.EnumParam {
          @SerializedName("fixed_amount")
          FIXED_AMOUNT("fixed_amount"),

          @SerializedName("percentage")
          PERCENTAGE("percentage");

          @Getter(onMethod_ = {@Override})
          private final String value;

          Type(String value) {
            this.value = value;
          }
        }
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("amounts_due")
      AMOUNTS_DUE("amounts_due");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
