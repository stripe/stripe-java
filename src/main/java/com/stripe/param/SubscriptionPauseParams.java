// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionPauseParams extends ApiRequestParams {
  /** Controls what to bill for when pausing the subscription. */
  @SerializedName("bill_for")
  BillFor billFor;

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
   * Determines how to handle debits and credits when pausing. The default is {@code
   * pending_invoice_item}.
   */
  @SerializedName("invoicing_behavior")
  InvoicingBehavior invoicingBehavior;

  /** <strong>Required.</strong> The type of pause to apply. */
  @SerializedName("type")
  Type type;

  private SubscriptionPauseParams(
      BillFor billFor,
      List<String> expand,
      Map<String, Object> extraParams,
      InvoicingBehavior invoicingBehavior,
      Type type) {
    this.billFor = billFor;
    this.expand = expand;
    this.extraParams = extraParams;
    this.invoicingBehavior = invoicingBehavior;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private BillFor billFor;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private InvoicingBehavior invoicingBehavior;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public SubscriptionPauseParams build() {
      return new SubscriptionPauseParams(
          this.billFor, this.expand, this.extraParams, this.invoicingBehavior, this.type);
    }

    /** Controls what to bill for when pausing the subscription. */
    public Builder setBillFor(SubscriptionPauseParams.BillFor billFor) {
      this.billFor = billFor;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SubscriptionPauseParams#expand} for the field documentation.
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
     * SubscriptionPauseParams#expand} for the field documentation.
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
     * SubscriptionPauseParams#extraParams} for the field documentation.
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
     * See {@link SubscriptionPauseParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Determines how to handle debits and credits when pausing. The default is {@code
     * pending_invoice_item}.
     */
    public Builder setInvoicingBehavior(
        SubscriptionPauseParams.InvoicingBehavior invoicingBehavior) {
      this.invoicingBehavior = invoicingBehavior;
      return this;
    }

    /** <strong>Required.</strong> The type of pause to apply. */
    public Builder setType(SubscriptionPauseParams.Type type) {
      this.type = type;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class BillFor {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * Controls when to bill for metered usage in the current period. Defaults to {@code { type:
     * "now" }}.
     */
    @SerializedName("outstanding_usage_through")
    OutstandingUsageThrough outstandingUsageThrough;

    /**
     * Controls when to credit for unused time on licensed items. Defaults to {@code { type: "now"
     * }}.
     */
    @SerializedName("unused_time_from")
    UnusedTimeFrom unusedTimeFrom;

    private BillFor(
        Map<String, Object> extraParams,
        OutstandingUsageThrough outstandingUsageThrough,
        UnusedTimeFrom unusedTimeFrom) {
      this.extraParams = extraParams;
      this.outstandingUsageThrough = outstandingUsageThrough;
      this.unusedTimeFrom = unusedTimeFrom;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private OutstandingUsageThrough outstandingUsageThrough;

      private UnusedTimeFrom unusedTimeFrom;

      /** Finalize and obtain parameter instance from this builder. */
      public SubscriptionPauseParams.BillFor build() {
        return new SubscriptionPauseParams.BillFor(
            this.extraParams, this.outstandingUsageThrough, this.unusedTimeFrom);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SubscriptionPauseParams.BillFor#extraParams} for the field documentation.
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
       * See {@link SubscriptionPauseParams.BillFor#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Controls when to bill for metered usage in the current period. Defaults to {@code { type:
       * "now" }}.
       */
      public Builder setOutstandingUsageThrough(
          SubscriptionPauseParams.BillFor.OutstandingUsageThrough outstandingUsageThrough) {
        this.outstandingUsageThrough = outstandingUsageThrough;
        return this;
      }

      /**
       * Controls when to credit for unused time on licensed items. Defaults to {@code { type: "now"
       * }}.
       */
      public Builder setUnusedTimeFrom(
          SubscriptionPauseParams.BillFor.UnusedTimeFrom unusedTimeFrom) {
        this.unusedTimeFrom = unusedTimeFrom;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class OutstandingUsageThrough {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> When to bill metered usage in the current period. */
      @SerializedName("type")
      Type type;

      private OutstandingUsageThrough(Map<String, Object> extraParams, Type type) {
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
        public SubscriptionPauseParams.BillFor.OutstandingUsageThrough build() {
          return new SubscriptionPauseParams.BillFor.OutstandingUsageThrough(
              this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionPauseParams.BillFor.OutstandingUsageThrough#extraParams} for
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
         * map. See {@link SubscriptionPauseParams.BillFor.OutstandingUsageThrough#extraParams} for
         * the field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> When to bill metered usage in the current period. */
        public Builder setType(SubscriptionPauseParams.BillFor.OutstandingUsageThrough.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("none")
        NONE("none"),

        @SerializedName("now")
        NOW("now");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class UnusedTimeFrom {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> When to credit for unused time. */
      @SerializedName("type")
      Type type;

      private UnusedTimeFrom(Map<String, Object> extraParams, Type type) {
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
        public SubscriptionPauseParams.BillFor.UnusedTimeFrom build() {
          return new SubscriptionPauseParams.BillFor.UnusedTimeFrom(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link SubscriptionPauseParams.BillFor.UnusedTimeFrom#extraParams} for the field
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
         * map. See {@link SubscriptionPauseParams.BillFor.UnusedTimeFrom#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> When to credit for unused time. */
        public Builder setType(SubscriptionPauseParams.BillFor.UnusedTimeFrom.Type type) {
          this.type = type;
          return this;
        }
      }

      public enum Type implements ApiRequestParams.EnumParam {
        @SerializedName("item_current_period_start")
        ITEM_CURRENT_PERIOD_START("item_current_period_start"),

        @SerializedName("none")
        NONE("none"),

        @SerializedName("now")
        NOW("now");

        @Getter(onMethod_ = {@Override})
        private final String value;

        Type(String value) {
          this.value = value;
        }
      }
    }
  }

  public enum InvoicingBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("invoice")
    INVOICE("invoice"),

    @SerializedName("pending_invoice_item")
    PENDING_INVOICE_ITEM("pending_invoice_item");

    @Getter(onMethod_ = {@Override})
    private final String value;

    InvoicingBehavior(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("subscription")
    SUBSCRIPTION("subscription");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
