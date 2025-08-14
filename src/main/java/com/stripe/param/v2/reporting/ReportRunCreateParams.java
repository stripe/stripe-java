// File generated from our OpenAPI spec
package com.stripe.param.v2.reporting;

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
public class ReportRunCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The unique identifier of the {@code Report} being requested. */
  @SerializedName("report")
  String report;

  /**
   * <strong>Required.</strong> A map of parameter names to values, specifying how the report should
   * be customized. The accepted parameters depend on the specific {@code Report} being run.
   */
  @SerializedName("report_parameters")
  Map<String, ReportRunCreateParams.ReportParameter> reportParameters;

  /** Optional settings to customize the results of the {@code ReportRun}. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  private ReportRunCreateParams(
      Map<String, Object> extraParams,
      String report,
      Map<String, ReportRunCreateParams.ReportParameter> reportParameters,
      ResultOptions resultOptions) {
    this.extraParams = extraParams;
    this.report = report;
    this.reportParameters = reportParameters;
    this.resultOptions = resultOptions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private String report;

    private Map<String, ReportRunCreateParams.ReportParameter> reportParameters;

    private ResultOptions resultOptions;

    /** Finalize and obtain parameter instance from this builder. */
    public ReportRunCreateParams build() {
      return new ReportRunCreateParams(
          this.extraParams, this.report, this.reportParameters, this.resultOptions);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReportRunCreateParams#extraParams} for the field documentation.
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
     * See {@link ReportRunCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The unique identifier of the {@code Report} being requested. */
    public Builder setReport(String report) {
      this.report = report;
      return this;
    }

    /**
     * Add a key/value pair to `reportParameters` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ReportRunCreateParams#reportParameters} for the field documentation.
     */
    public Builder putReportParameter(String key, ReportRunCreateParams.ReportParameter value) {
      if (this.reportParameters == null) {
        this.reportParameters = new HashMap<>();
      }
      this.reportParameters.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `reportParameters` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ReportRunCreateParams#reportParameters} for the field documentation.
     */
    public Builder putAllReportParameter(Map<String, ReportRunCreateParams.ReportParameter> map) {
      if (this.reportParameters == null) {
        this.reportParameters = new HashMap<>();
      }
      this.reportParameters.putAll(map);
      return this;
    }

    /** Optional settings to customize the results of the {@code ReportRun}. */
    public Builder setResultOptions(ReportRunCreateParams.ResultOptions resultOptions) {
      this.resultOptions = resultOptions;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ReportParameter {
    /** Parameter with an array data type. */
    @SerializedName("array_value")
    ArrayValue arrayValue;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Parameter with a string data type. */
    @SerializedName("string_value")
    String stringValue;

    /** Parameter with a timestamp data type. */
    @SerializedName("timestamp_value")
    Instant timestampValue;

    private ReportParameter(
        ArrayValue arrayValue,
        Map<String, Object> extraParams,
        String stringValue,
        Instant timestampValue) {
      this.arrayValue = arrayValue;
      this.extraParams = extraParams;
      this.stringValue = stringValue;
      this.timestampValue = timestampValue;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private ArrayValue arrayValue;

      private Map<String, Object> extraParams;

      private String stringValue;

      private Instant timestampValue;

      /** Finalize and obtain parameter instance from this builder. */
      public ReportRunCreateParams.ReportParameter build() {
        return new ReportRunCreateParams.ReportParameter(
            this.arrayValue, this.extraParams, this.stringValue, this.timestampValue);
      }

      /** Parameter with an array data type. */
      public Builder setArrayValue(ReportRunCreateParams.ReportParameter.ArrayValue arrayValue) {
        this.arrayValue = arrayValue;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReportRunCreateParams.ReportParameter#extraParams} for the field documentation.
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
       * See {@link ReportRunCreateParams.ReportParameter#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Parameter with a string data type. */
      public Builder setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
      }

      /** Parameter with a timestamp data type. */
      public Builder setTimestampValue(Instant timestampValue) {
        this.timestampValue = timestampValue;
        return this;
      }
    }

    @Getter
    @EqualsAndHashCode(callSuper = false)
    public static class ArrayValue {
      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** <strong>Required.</strong> The list of string values in the array. */
      @SerializedName("items")
      List<String> items;

      private ArrayValue(Map<String, Object> extraParams, List<String> items) {
        this.extraParams = extraParams;
        this.items = items;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Map<String, Object> extraParams;

        private List<String> items;

        /** Finalize and obtain parameter instance from this builder. */
        public ReportRunCreateParams.ReportParameter.ArrayValue build() {
          return new ReportRunCreateParams.ReportParameter.ArrayValue(this.extraParams, this.items);
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ReportRunCreateParams.ReportParameter.ArrayValue#extraParams} for the
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
         * map. See {@link ReportRunCreateParams.ReportParameter.ArrayValue#extraParams} for the
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
         * Add an element to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ReportRunCreateParams.ReportParameter.ArrayValue#items} for the field documentation.
         */
        public Builder addItem(String element) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.add(element);
          return this;
        }

        /**
         * Add all elements to `items` list. A list is initialized for the first `add/addAll` call,
         * and subsequent calls adds additional elements to the original list. See {@link
         * ReportRunCreateParams.ReportParameter.ArrayValue#items} for the field documentation.
         */
        public Builder addAllItem(List<String> elements) {
          if (this.items == null) {
            this.items = new ArrayList<>();
          }
          this.items.addAll(elements);
          return this;
        }
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions {
    /**
     * If set, the generated report file will be compressed into a ZIP folder. This is useful for
     * reducing file size and download time for large reports.
     */
    @SerializedName("compress_file")
    Boolean compressFile;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ResultOptions(Boolean compressFile, Map<String, Object> extraParams) {
      this.compressFile = compressFile;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Boolean compressFile;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public ReportRunCreateParams.ResultOptions build() {
        return new ReportRunCreateParams.ResultOptions(this.compressFile, this.extraParams);
      }

      /**
       * If set, the generated report file will be compressed into a ZIP folder. This is useful for
       * reducing file size and download time for large reports.
       */
      public Builder setCompressFile(Boolean compressFile) {
        this.compressFile = compressFile;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReportRunCreateParams.ResultOptions#extraParams} for the field documentation.
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
       * See {@link ReportRunCreateParams.ResultOptions#extraParams} for the field documentation.
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
}
