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
public class QueryRunCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The dataset to query. */
  @SerializedName("dataset")
  Dataset dataset;

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
   * Named bind parameters for the query. Keys are parameter names referenced in the SQL (without
   * any prefix). Omit this field for a non-parameterized query. Values are strings, integers, or
   * booleans. Fractional numbers, timestamps, and dates should be passed as strings.
   */
  @SerializedName("parameters")
  Map<String, Object> parameters;

  /** <strong>Required.</strong> The query to execute. */
  @SerializedName("query")
  Query query;

  /** Optional settings that customize the generated result file. */
  @SerializedName("result_options")
  ResultOptions resultOptions;

  private QueryRunCreateParams(
      Dataset dataset,
      Map<String, Object> extraParams,
      Format format,
      Map<String, Object> parameters,
      Query query,
      ResultOptions resultOptions) {
    this.dataset = dataset;
    this.extraParams = extraParams;
    this.format = format;
    this.parameters = parameters;
    this.query = query;
    this.resultOptions = resultOptions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Dataset dataset;

    private Map<String, Object> extraParams;

    private Format format;

    private Map<String, Object> parameters;

    private Query query;

    private ResultOptions resultOptions;

    /** Finalize and obtain parameter instance from this builder. */
    public QueryRunCreateParams build() {
      return new QueryRunCreateParams(
          this.dataset,
          this.extraParams,
          this.format,
          this.parameters,
          this.query,
          this.resultOptions);
    }

    /** <strong>Required.</strong> The dataset to query. */
    public Builder setDataset(QueryRunCreateParams.Dataset dataset) {
      this.dataset = dataset;
      return this;
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

    /** <strong>Required.</strong> The file format for the result. */
    public Builder setFormat(QueryRunCreateParams.Format format) {
      this.format = format;
      return this;
    }

    /**
     * Add a key/value pair to `parameters` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QueryRunCreateParams#parameters} for the field documentation.
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
     * See {@link QueryRunCreateParams#parameters} for the field documentation.
     */
    public Builder putAllParameter(Map<String, Object> map) {
      if (this.parameters == null) {
        this.parameters = new HashMap<>();
      }
      this.parameters.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The query to execute. */
    public Builder setQuery(QueryRunCreateParams.Query query) {
      this.query = query;
      return this;
    }

    /** Optional settings that customize the generated result file. */
    public Builder setResultOptions(QueryRunCreateParams.ResultOptions resultOptions) {
      this.resultOptions = resultOptions;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Query {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Ad-hoc SQL to execute. The maximum length is 100,000 characters. */
    @SerializedName("sql")
    String sql;

    private Query(Map<String, Object> extraParams, String sql) {
      this.extraParams = extraParams;
      this.sql = sql;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String sql;

      /** Finalize and obtain parameter instance from this builder. */
      public QueryRunCreateParams.Query build() {
        return new QueryRunCreateParams.Query(this.extraParams, this.sql);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * QueryRunCreateParams.Query#extraParams} for the field documentation.
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
       * See {@link QueryRunCreateParams.Query#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Ad-hoc SQL to execute. The maximum length is 100,000 characters. */
      public Builder setSql(String sql) {
        this.sql = sql;
        return this;
      }
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class ResultOptions {
    /**
     * The compression applied to the generated result file. Defaults to {@code none}. This applies
     * only to downloadable file results.
     */
    @SerializedName("compression")
    Compression compression;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private ResultOptions(Compression compression, Map<String, Object> extraParams) {
      this.compression = compression;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Compression compression;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public QueryRunCreateParams.ResultOptions build() {
        return new QueryRunCreateParams.ResultOptions(this.compression, this.extraParams);
      }

      /**
       * The compression applied to the generated result file. Defaults to {@code none}. This
       * applies only to downloadable file results.
       */
      public Builder setCompression(QueryRunCreateParams.ResultOptions.Compression compression) {
        this.compression = compression;
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

    public enum Compression implements ApiRequestParams.EnumParam {
      @SerializedName("none")
      NONE("none"),

      @SerializedName("zip")
      ZIP("zip");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Compression(String value) {
        this.value = value;
      }
    }
  }

  public enum Dataset implements ApiRequestParams.EnumParam {
    @SerializedName("analytical")
    ANALYTICAL("analytical");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Dataset(String value) {
      this.value = value;
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
