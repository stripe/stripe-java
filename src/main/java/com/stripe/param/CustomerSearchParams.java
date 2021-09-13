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
public class CustomerSearchParams extends ApiRequestParams {
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
   * Whether to include {@code total_count} in the results. Note that counts max out at 10,000
   * results and searches with greater than 10,000 results will return {@code total_count: 10000}
   */
  @SerializedName("include_count")
  Boolean includeCount;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /**
   * A cursor for pagination across multiple pages of results. Do not include this parameter on the
   * first call. Use the next_page value returned in a response to request subsequent results.
   */
  @SerializedName("next_page")
  String nextPage;

  /**
   * The search query string. See <a
   * href="https://stripe.com/docs/search-api#search-query-language">search query language</a>
   */
  @SerializedName("query")
  String query;

  /** The trailing window to search over. */
  @SerializedName("search_window")
  SearchWindow searchWindow;

  /** The order (ascending or descending) that results are listed in. Default: {@code desc} */
  @SerializedName("sort_order")
  SortOrder sortOrder;

  private CustomerSearchParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean includeCount,
      Long limit,
      String nextPage,
      String query,
      SearchWindow searchWindow,
      SortOrder sortOrder) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.includeCount = includeCount;
    this.limit = limit;
    this.nextPage = nextPage;
    this.query = query;
    this.searchWindow = searchWindow;
    this.sortOrder = sortOrder;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean includeCount;

    private Long limit;

    private String nextPage;

    private String query;

    private SearchWindow searchWindow;

    private SortOrder sortOrder;

    /** Finalize and obtain parameter instance from this builder. */
    public CustomerSearchParams build() {
      return new CustomerSearchParams(
          this.expand,
          this.extraParams,
          this.includeCount,
          this.limit,
          this.nextPage,
          this.query,
          this.searchWindow,
          this.sortOrder);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CustomerSearchParams#expand} for the field documentation.
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
     * CustomerSearchParams#expand} for the field documentation.
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
     * CustomerSearchParams#extraParams} for the field documentation.
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
     * See {@link CustomerSearchParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Whether to include {@code total_count} in the results. Note that counts max out at 10,000
     * results and searches with greater than 10,000 results will return {@code total_count: 10000}
     */
    public Builder setIncludeCount(Boolean includeCount) {
      this.includeCount = includeCount;
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
     * A cursor for pagination across multiple pages of results. Do not include this parameter on
     * the first call. Use the next_page value returned in a response to request subsequent results.
     */
    public Builder setNextPage(String nextPage) {
      this.nextPage = nextPage;
      return this;
    }

    /**
     * The search query string. See <a
     * href="https://stripe.com/docs/search-api#search-query-language">search query language</a>
     */
    public Builder setQuery(String query) {
      this.query = query;
      return this;
    }

    /** The trailing window to search over. */
    public Builder setSearchWindow(SearchWindow searchWindow) {
      this.searchWindow = searchWindow;
      return this;
    }

    /** The order (ascending or descending) that results are listed in. Default: {@code desc} */
    public Builder setSortOrder(SortOrder sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }
  }

  public enum SearchWindow implements ApiRequestParams.EnumParam {
    @SerializedName("all_time")
    ALL_TIME("all_time"),

    @SerializedName("last_year")
    LAST_YEAR("last_year");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SearchWindow(String value) {
      this.value = value;
    }
  }

  public enum SortOrder implements ApiRequestParams.EnumParam {
    @SerializedName("asc")
    ASC("asc"),

    @SerializedName("desc")
    DESC("desc");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SortOrder(String value) {
      this.value = value;
    }
  }
}
