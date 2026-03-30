// File generated from our OpenAPI spec
package com.stripe.param.v2.data.reporting;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class QueryRunCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Optional settings to customize the results of the {@code QueryRun}. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  /** <strong>Required.</strong> The SQL to execute. */
  @SerializedName("sql")
  String sql;

  private QueryRunCreateParams(
      Map<String, Object> extraParams, ResultOptions resultOptions, String sql) {
    this.extraParams = extraParams;
    this.resultOptions = resultOptions;
    this.sql = sql;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private ResultOptions resultOptions;

    private String sql;

    /** Finalize and obtain parameter instance from this builder. */
    public QueryRunCreateParams build() {
      return new QueryRunCreateParams(this.extraParams, this.resultOptions, this.sql);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QueryRunCreateParams#extraParams} for the field documentation.
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
     * See {@link QueryRunCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Optional settings to customize the results of the {@code QueryRun}. */
    public Builder setResultOptions(QueryRunCreateParams.ResultOptions resultOptions) {
      this.resultOptions = resultOptions;
      return this;
    }

    /** <strong>Required.</strong> The SQL to execute. */
    public Builder setSql(String sql) {
      this.sql = sql;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions {
    /**
     * If set, the generated results file will be compressed into a ZIP folder. This is useful for
     * reducing file size and download time for large results.
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
      public QueryRunCreateParams.ResultOptions build() {
        return new QueryRunCreateParams.ResultOptions(this.compressFile, this.extraParams);
      }

      /**
       * If set, the generated results file will be compressed into a ZIP folder. This is useful for
       * reducing file size and download time for large results.
       */
      public Builder setCompressFile(Boolean compressFile) {
        this.compressFile = compressFile;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QueryRunCreateParams.ResultOptions#extraParams} for the field documentation.
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
       * See {@link QueryRunCreateParams.ResultOptions#extraParams} for the field documentation.
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
