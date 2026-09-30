// File generated from our OpenAPI spec
package com.stripe.param.v2.data;

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
public class QueryRunRetrieveParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Any optional includes (see https://docs.stripe.com/api-includable-response-values). */
  @SerializedName("include")
  List<QueryRunRetrieveParams.Include> include;

  /**
   * The maximum number of inline {@code QueryRun} result rows to return. Defaults to 10. Maximum is
   * 1000.
   */
  @SerializedName("limit")
  Long limit;

  /** The page token for paginating the inline {@code QueryRun} result rows. */
  @SerializedName("page")
  String page;

  private QueryRunRetrieveParams(
      Map<String, Object> extraParams,
      List<QueryRunRetrieveParams.Include> include,
      Long limit,
      String page) {
    this.extraParams = extraParams;
    this.include = include;
    this.limit = limit;
    this.page = page;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private List<QueryRunRetrieveParams.Include> include;

    private Long limit;

    private String page;

    /** Finalize and obtain parameter instance from this builder. */
    public QueryRunRetrieveParams build() {
      return new QueryRunRetrieveParams(this.extraParams, this.include, this.limit, this.page);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * QueryRunRetrieveParams#extraParams} for the field documentation.
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
     * See {@link QueryRunRetrieveParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add an element to `include` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * QueryRunRetrieveParams#include} for the field documentation.
     */
    public Builder addInclude(QueryRunRetrieveParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * QueryRunRetrieveParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<QueryRunRetrieveParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /**
     * The maximum number of inline {@code QueryRun} result rows to return. Defaults to 10. Maximum
     * is 1000.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** The page token for paginating the inline {@code QueryRun} result rows. */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("result.inline")
    RESULT__INLINE("result.inline");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
