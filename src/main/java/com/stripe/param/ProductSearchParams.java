// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ProductSearchParams extends ApiRequestParams {
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
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for pagination across multiple pages of results. Don't include this parameter on the
   * first call. Use the next_page value returned in a previous response to request subsequent
   * results.
   */
  @SerializedName("page")
  String page;

  /**
   * <strong>Required.</strong> The search query string. See <a
   * href="https://stripe.com/docs/search#search-query-language">search query language</a> and the
   * list of supported <a href="https://stripe.com/docs/search#query-fields-for-products">query
   * fields for products</a>.
   */
  @SerializedName("query")
  String query;

  private ProductSearchParams(
      List<String> expand, Map<String, Object> extraParams, Long limit, String page, String query) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.page = page;
    this.query = query;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String page;

    private String query;

    /** Finalize and obtain parameter instance from this builder. */
    public ProductSearchParams build() {
      return new ProductSearchParams(
          this.expand, this.extraParams, this.limit, this.page, this.query);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProductSearchParams#expand} for the field documentation.
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
     * ProductSearchParams#expand} for the field documentation.
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
     * ProductSearchParams#extraParams} for the field documentation.
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
     * See {@link ProductSearchParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * A cursor for pagination across multiple pages of results. Don't include this parameter on the
     * first call. Use the next_page value returned in a previous response to request subsequent
     * results.
     */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }

    /**
     * <strong>Required.</strong> The search query string. See <a
     * href="https://stripe.com/docs/search#search-query-language">search query language</a> and the
     * list of supported <a href="https://stripe.com/docs/search#query-fields-for-products">query
     * fields for products</a>.
     */
    public Builder setQuery(String query) {
      this.query = query;
      return this;
    }
  }
}
