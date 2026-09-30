// File generated from our OpenAPI spec
package com.stripe.param.v2.data;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
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

  /** <strong>Required.</strong> The file format for the result. */
  @SerializedName("format")
  Format format;

  /**
   * <strong>Required.</strong> A map of parameter names to values, specifying how the report should
   * be customized. The accepted parameters depend on the specific {@code Report} being run.
   */
  @SerializedName("parameters")
  Map<String, Object> parameters;

  /** <strong>Required.</strong> A reference to the {@code Report} to run, by ID or name. */
  @SerializedName("report")
  Report report;

  /** Optional settings that customize the generated result file. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  private ReportRunCreateParams(
      Map<String, Object> extraParams,
      Format format,
      Map<String, Object> parameters,
      Report report,
      ResultOptions resultOptions) {
    this.extraParams = extraParams;
    this.format = format;
    this.parameters = parameters;
    this.report = report;
    this.resultOptions = resultOptions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Format format;

    private Map<String, Object> parameters;

    private Report report;

    private ResultOptions resultOptions;

    /** Finalize and obtain parameter instance from this builder. */
    public ReportRunCreateParams build() {
      return new ReportRunCreateParams(
          this.extraParams, this.format, this.parameters, this.report, this.resultOptions);
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

    /** <strong>Required.</strong> The file format for the result. */
    public Builder setFormat(ReportRunCreateParams.Format format) {
      this.format = format;
      return this;
    }

    /**
     * Add a key/value pair to `parameters` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ReportRunCreateParams#parameters} for the field documentation.
     */
    public Builder putParameter(String key, Object value) {
      if (this.parameters == null) {
        this.parameters = new HashMap<>();
      }
      this.parameters.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `parameters` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ReportRunCreateParams#parameters} for the field documentation.
     */
    public Builder putAllParameter(Map<String, Object> map) {
      if (this.parameters == null) {
        this.parameters = new HashMap<>();
      }
      this.parameters.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> A reference to the {@code Report} to run, by ID or name. */
    public Builder setReport(ReportRunCreateParams.Report report) {
      this.report = report;
      return this;
    }

    /** Optional settings that customize the generated result file. */
    public Builder setResultOptions(ReportRunCreateParams.ResultOptions resultOptions) {
      this.resultOptions = resultOptions;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Report {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The unique identifier of the {@code Report}. */
    @SerializedName("id")
    String id;

    /** The human-readable name of the {@code Report}. */
    @SerializedName("name")
    String name;

    private Report(Map<String, Object> extraParams, String id, String name) {
      this.extraParams = extraParams;
      this.id = id;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String id;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public ReportRunCreateParams.Report build() {
        return new ReportRunCreateParams.Report(this.extraParams, this.id, this.name);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ReportRunCreateParams.Report#extraParams} for the field documentation.
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
       * See {@link ReportRunCreateParams.Report#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The unique identifier of the {@code Report}. */
      public Builder setId(String id) {
        this.id = id;
        return this;
      }

      /** The human-readable name of the {@code Report}. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions {
    /**
     * If set, the generated result file is compressed into a ZIP archive before it is stored. This
     * applies only to downloadable file results.
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
       * If set, the generated result file is compressed into a ZIP archive before it is stored.
       * This applies only to downloadable file results.
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

  public enum Format implements ApiRequestParams.EnumParam {
    @SerializedName("csv")
    CSV("csv");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Format(String value) {
      this.value = value;
    }
  }
}
