// File generated from our OpenAPI spec
package com.stripe.param.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AlertCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The type of alert to create. */
  @SerializedName("alert_type")
  AlertType alertType;

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

  /** Filters to limit the scope of an alert. */
  @SerializedName("filter")
  Filter filter;

  /** The configuration of the spend threshold. */
  @SerializedName("spend_threshold_config")
  SpendThresholdConfig spendThresholdConfig;

  /** <strong>Required.</strong> The title of the alert. */
  @SerializedName("title")
  String title;

  /** The configuration of the usage threshold. */
  @SerializedName("usage_threshold_config")
  UsageThresholdConfig usageThresholdConfig;

  private AlertCreateParams(
      AlertType alertType,
      List<String> expand,
      Map<String, Object> extraParams,
      Filter filter,
      SpendThresholdConfig spendThresholdConfig,
      String title,
      UsageThresholdConfig usageThresholdConfig) {
    this.alertType = alertType;
    this.expand = expand;
    this.extraParams = extraParams;
    this.filter = filter;
    this.spendThresholdConfig = spendThresholdConfig;
    this.title = title;
    this.usageThresholdConfig = usageThresholdConfig;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AlertType alertType;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Filter filter;

    private SpendThresholdConfig spendThresholdConfig;

    private String title;

    private UsageThresholdConfig usageThresholdConfig;

    /** Finalize and obtain parameter instance from this builder. */
    public AlertCreateParams build() {
      return new AlertCreateParams(
          this.alertType,
          this.expand,
          this.extraParams,
          this.filter,
          this.spendThresholdConfig,
          this.title,
          this.usageThresholdConfig);
    }

    /** <strong>Required.</strong> The type of alert to create. */
    public Builder setAlertType(AlertCreateParams.AlertType alertType) {
      this.alertType = alertType;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AlertCreateParams#expand} for the field documentation.
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
     * AlertCreateParams#expand} for the field documentation.
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
     * AlertCreateParams#extraParams} for the field documentation.
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
     * See {@link AlertCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Filters to limit the scope of an alert. */
    public Builder setFilter(AlertCreateParams.Filter filter) {
      this.filter = filter;
      return this;
    }

    /** The configuration of the spend threshold. */
    public Builder setSpendThresholdConfig(
        AlertCreateParams.SpendThresholdConfig spendThresholdConfig) {
      this.spendThresholdConfig = spendThresholdConfig;
      return this;
    }

    /** <strong>Required.</strong> The title of the alert. */
    public Builder setTitle(String title) {
      this.title = title;
      return this;
    }

    /** The configuration of the usage threshold. */
    public Builder setUsageThresholdConfig(
        AlertCreateParams.UsageThresholdConfig usageThresholdConfig) {
      this.usageThresholdConfig = usageThresholdConfig;
      return this;
    }
  }

  @Getter
  public static class Filter {
    /** Limit the scope to this alert only to this customer. */
    @SerializedName("customer")
    String customer;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Filter(String customer, Map<String, Object> extraParams) {
      this.customer = customer;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String customer;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertCreateParams.Filter build() {
        return new AlertCreateParams.Filter(this.customer, this.extraParams);
      }

      /** Limit the scope to this alert only to this customer. */
      public Builder setCustomer(String customer) {
        this.customer = customer;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertCreateParams.Filter#extraParams} for the field documentation.
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
       * See {@link AlertCreateParams.Filter#extraParams} for the field documentation.
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
  public static class SpendThresholdConfig {
    /**
     * <strong>Required.</strong> Whether the spend should be aggregated across items in a
     * subscription or whether each subscription item is considered alone.
     */
    @SerializedName("aggregation")
    Aggregation aggregation;

    /**
     * <strong>Required.</strong> Currency for which this spend alert is configured. This alert will
     * only trigger for subscriptions matching this currency.
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

    /** <strong>Required.</strong> Defines at which value the alert will fire. */
    @SerializedName("gte")
    Long gte;

    /**
     * <strong>Required.</strong> Whether the alert should only fire only once, or once per billing
     * cycle.
     */
    @SerializedName("recurrence")
    Recurrence recurrence;

    private SpendThresholdConfig(
        Aggregation aggregation,
        String currency,
        Map<String, Object> extraParams,
        Long gte,
        Recurrence recurrence) {
      this.aggregation = aggregation;
      this.currency = currency;
      this.extraParams = extraParams;
      this.gte = gte;
      this.recurrence = recurrence;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Aggregation aggregation;

      private String currency;

      private Map<String, Object> extraParams;

      private Long gte;

      private Recurrence recurrence;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertCreateParams.SpendThresholdConfig build() {
        return new AlertCreateParams.SpendThresholdConfig(
            this.aggregation, this.currency, this.extraParams, this.gte, this.recurrence);
      }

      /**
       * <strong>Required.</strong> Whether the spend should be aggregated across items in a
       * subscription or whether each subscription item is considered alone.
       */
      public Builder setAggregation(
          AlertCreateParams.SpendThresholdConfig.Aggregation aggregation) {
        this.aggregation = aggregation;
        return this;
      }

      /**
       * <strong>Required.</strong> Currency for which this spend alert is configured. This alert
       * will only trigger for subscriptions matching this currency.
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertCreateParams.SpendThresholdConfig#extraParams} for the field documentation.
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
       * See {@link AlertCreateParams.SpendThresholdConfig#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Defines at which value the alert will fire. */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /**
       * <strong>Required.</strong> Whether the alert should only fire only once, or once per
       * billing cycle.
       */
      public Builder setRecurrence(AlertCreateParams.SpendThresholdConfig.Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
      }
    }

    public enum Aggregation implements ApiRequestParams.EnumParam {
      @SerializedName("subscription")
      SUBSCRIPTION("subscription"),

      @SerializedName("subscription_item")
      SUBSCRIPTION_ITEM("subscription_item");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Aggregation(String value) {
        this.value = value;
      }
    }

    public enum Recurrence implements ApiRequestParams.EnumParam {
      @SerializedName("one_time")
      ONE_TIME("one_time");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Recurrence(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class UsageThresholdConfig {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> Defines at which value the alert will fire. */
    @SerializedName("gte")
    Long gte;

    /**
     * The <a href="https://stripe.com/api/billing/meter">Billing Meter</a> ID whose usage is
     * monitored.
     */
    @SerializedName("meter")
    String meter;

    /**
     * <strong>Required.</strong> Whether the alert should only fire only once, or once per billing
     * cycle.
     */
    @SerializedName("recurrence")
    Recurrence recurrence;

    private UsageThresholdConfig(
        Map<String, Object> extraParams, Long gte, String meter, Recurrence recurrence) {
      this.extraParams = extraParams;
      this.gte = gte;
      this.meter = meter;
      this.recurrence = recurrence;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Long gte;

      private String meter;

      private Recurrence recurrence;

      /** Finalize and obtain parameter instance from this builder. */
      public AlertCreateParams.UsageThresholdConfig build() {
        return new AlertCreateParams.UsageThresholdConfig(
            this.extraParams, this.gte, this.meter, this.recurrence);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * AlertCreateParams.UsageThresholdConfig#extraParams} for the field documentation.
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
       * See {@link AlertCreateParams.UsageThresholdConfig#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> Defines at which value the alert will fire. */
      public Builder setGte(Long gte) {
        this.gte = gte;
        return this;
      }

      /**
       * The <a href="https://stripe.com/api/billing/meter">Billing Meter</a> ID whose usage is
       * monitored.
       */
      public Builder setMeter(String meter) {
        this.meter = meter;
        return this;
      }

      /**
       * <strong>Required.</strong> Whether the alert should only fire only once, or once per
       * billing cycle.
       */
      public Builder setRecurrence(AlertCreateParams.UsageThresholdConfig.Recurrence recurrence) {
        this.recurrence = recurrence;
        return this;
      }
    }

    public enum Recurrence implements ApiRequestParams.EnumParam {
      @SerializedName("one_time")
      ONE_TIME("one_time");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Recurrence(String value) {
        this.value = value;
      }
    }
  }

  public enum AlertType implements ApiRequestParams.EnumParam {
    @SerializedName("spend_threshold")
    SPEND_THRESHOLD("spend_threshold"),

    @SerializedName("usage_threshold")
    USAGE_THRESHOLD("usage_threshold");

    @Getter(onMethod_ = {@Override})
    private final String value;

    AlertType(String value) {
      this.value = value;
    }
  }
}
