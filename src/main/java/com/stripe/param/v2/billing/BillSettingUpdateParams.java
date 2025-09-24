// File generated from our OpenAPI spec
package com.stripe.param.v2.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class BillSettingUpdateParams extends ApiRequestParams {
  /** Settings related to calculating a bill. */
  @SerializedName("calculation")
  Calculation calculation;

  /**
   * An optional customer-facing display name for the BillSetting object. To remove the display
   * name, set it to an empty string in the request. Maximum length of 250 characters.
   */
  @SerializedName("display_name")
  Object displayName;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Settings related to invoice behavior. */
  @SerializedName("invoice")
  Invoice invoice;

  /** The ID of the invoice rendering template to be used when generating invoices. */
  @SerializedName("invoice_rendering_template")
  Object invoiceRenderingTemplate;

  /**
   * Optionally change the live version of the BillSetting. Providing {@code live_version =
   * "latest"} will set the BillSetting' {@code live_version} to its latest version.
   */
  @SerializedName("live_version")
  Object liveVersion;

  /**
   * A lookup key used to retrieve settings dynamically from a static string. This may be up to 200
   * characters.
   */
  @SerializedName("lookup_key")
  Object lookupKey;

  private BillSettingUpdateParams(
      Calculation calculation,
      Object displayName,
      Map<String, Object> extraParams,
      Invoice invoice,
      Object invoiceRenderingTemplate,
      Object liveVersion,
      Object lookupKey) {
    this.calculation = calculation;
    this.displayName = displayName;
    this.extraParams = extraParams;
    this.invoice = invoice;
    this.invoiceRenderingTemplate = invoiceRenderingTemplate;
    this.liveVersion = liveVersion;
    this.lookupKey = lookupKey;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Calculation calculation;

    private Object displayName;

    private Map<String, Object> extraParams;

    private Invoice invoice;

    private Object invoiceRenderingTemplate;

    private Object liveVersion;

    private Object lookupKey;

    /** Finalize and obtain parameter instance from this builder. */
    public BillSettingUpdateParams build() {
      return new BillSettingUpdateParams(
          this.calculation,
          this.displayName,
          this.extraParams,
          this.invoice,
          this.invoiceRenderingTemplate,
          this.liveVersion,
          this.lookupKey);
    }

    /** Settings related to calculating a bill. */
    public Builder setCalculation(BillSettingUpdateParams.Calculation calculation) {
      this.calculation = calculation;
      return this;
    }

    /**
     * An optional customer-facing display name for the BillSetting object. To remove the display
     * name, set it to an empty string in the request. Maximum length of 250 characters.
     */
    public Builder setDisplayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * An optional customer-facing display name for the BillSetting object. To remove the display
     * name, set it to an empty string in the request. Maximum length of 250 characters.
     */
    public Builder setDisplayName(EmptyParam displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * BillSettingUpdateParams#extraParams} for the field documentation.
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
     * See {@link BillSettingUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Settings related to invoice behavior. */
    public Builder setInvoice(BillSettingUpdateParams.Invoice invoice) {
      this.invoice = invoice;
      return this;
    }

    /** The ID of the invoice rendering template to be used when generating invoices. */
    public Builder setInvoiceRenderingTemplate(String invoiceRenderingTemplate) {
      this.invoiceRenderingTemplate = invoiceRenderingTemplate;
      return this;
    }

    /** The ID of the invoice rendering template to be used when generating invoices. */
    public Builder setInvoiceRenderingTemplate(EmptyParam invoiceRenderingTemplate) {
      this.invoiceRenderingTemplate = invoiceRenderingTemplate;
      return this;
    }

    /**
     * Optionally change the live version of the BillSetting. Providing {@code live_version =
     * "latest"} will set the BillSetting' {@code live_version} to its latest version.
     */
    public Builder setLiveVersion(String liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * Optionally change the live version of the BillSetting. Providing {@code live_version =
     * "latest"} will set the BillSetting' {@code live_version} to its latest version.
     */
    public Builder setLiveVersion(EmptyParam liveVersion) {
      this.liveVersion = liveVersion;
      return this;
    }

    /**
     * A lookup key used to retrieve settings dynamically from a static string. This may be up to
     * 200 characters.
     */
    public Builder setLookupKey(String lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }

    /**
     * A lookup key used to retrieve settings dynamically from a static string. This may be up to
     * 200 characters.
     */
    public Builder setLookupKey(EmptyParam lookupKey) {
      this.lookupKey = lookupKey;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Calculation {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Settings for calculating tax. */
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
      public BillSettingUpdateParams.Calculation build() {
        return new BillSettingUpdateParams.Calculation(this.extraParams, this.tax);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BillSettingUpdateParams.Calculation#extraParams} for the field documentation.
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
       * See {@link BillSettingUpdateParams.Calculation#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Settings for calculating tax. */
      public Builder setTax(BillSettingUpdateParams.Calculation.Tax tax) {
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /**
       * <strong>Required.</strong> Determines if tax will be calculated automatically based on a
       * PTC or manually based on rules defined by the merchant. Defaults to &quot;manual&quot;.
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
        public BillSettingUpdateParams.Calculation.Tax build() {
          return new BillSettingUpdateParams.Calculation.Tax(this.extraParams, this.type);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BillSettingUpdateParams.Calculation.Tax#extraParams} for the field
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
         * map. See {@link BillSettingUpdateParams.Calculation.Tax#extraParams} for the field
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
         * <strong>Required.</strong> Determines if tax will be calculated automatically based on a
         * PTC or manually based on rules defined by the merchant. Defaults to &quot;manual&quot;.
         */
        public Builder setType(BillSettingUpdateParams.Calculation.Tax.Type type) {
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
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The amount of time until the invoice will be overdue for payment. */
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
      public BillSettingUpdateParams.Invoice build() {
        return new BillSettingUpdateParams.Invoice(this.extraParams, this.timeUntilDue);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * BillSettingUpdateParams.Invoice#extraParams} for the field documentation.
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
       * See {@link BillSettingUpdateParams.Invoice#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The amount of time until the invoice will be overdue for payment. */
      public Builder setTimeUntilDue(BillSettingUpdateParams.Invoice.TimeUntilDue timeUntilDue) {
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
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The interval unit for the time until due. */
      @SerializedName("interval")
      Interval interval;

      /**
       * <strong>Required.</strong> The number of interval units. For example, if interval=day and
       * interval_count=30, the invoice will be due in 30 days.
       */
      @SerializedName("interval_count")
      Long intervalCount;

      private TimeUntilDue(Map<String, Object> extraParams, Interval interval, Long intervalCount) {
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
        public BillSettingUpdateParams.Invoice.TimeUntilDue build() {
          return new BillSettingUpdateParams.Invoice.TimeUntilDue(
              this.extraParams, this.interval, this.intervalCount);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link BillSettingUpdateParams.Invoice.TimeUntilDue#extraParams} for the field
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
         * map. See {@link BillSettingUpdateParams.Invoice.TimeUntilDue#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** <strong>Required.</strong> The interval unit for the time until due. */
        public Builder setInterval(BillSettingUpdateParams.Invoice.TimeUntilDue.Interval interval) {
          this.interval = interval;
          return this;
        }

        /**
         * <strong>Required.</strong> The number of interval units. For example, if interval=day and
         * interval_count=30, the invoice will be due in 30 days.
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
  }
}
