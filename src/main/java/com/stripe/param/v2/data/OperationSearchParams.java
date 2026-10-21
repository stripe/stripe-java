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
public class OperationSearchParams extends ApiRequestParams {
  /**
   * Restrict results to public resource catalogs. Defaults to all catalogs available to the caller.
   */
  @SerializedName("catalogs")
  List<OperationSearchParams.Catalog> catalogs;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Maximum results. Default: 5, Max: 20. */
  @SerializedName("limit")
  Long limit;

  /** The page token for pagination. */
  @SerializedName("page")
  String page;

  /** <strong>Required.</strong> Natural-language question. Required. */
  @SerializedName("query")
  String query;

  private OperationSearchParams(
      List<OperationSearchParams.Catalog> catalogs,
      Map<String, Object> extraParams,
      Long limit,
      String page,
      String query) {
    this.catalogs = catalogs;
    this.extraParams = extraParams;
    this.limit = limit;
    this.page = page;
    this.query = query;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<OperationSearchParams.Catalog> catalogs;

    private Map<String, Object> extraParams;

    private Long limit;

    private String page;

    private String query;

    /** Finalize and obtain parameter instance from this builder. */
    public OperationSearchParams build() {
      return new OperationSearchParams(
          this.catalogs, this.extraParams, this.limit, this.page, this.query);
    }

    /**
     * Add an element to `catalogs` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OperationSearchParams#catalogs} for the field documentation.
     */
    public Builder addCatalog(OperationSearchParams.Catalog element) {
      if (this.catalogs == null) {
        this.catalogs = new ArrayList<>();
      }
      this.catalogs.add(element);
      return this;
    }

    /**
     * Add all elements to `catalogs` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * OperationSearchParams#catalogs} for the field documentation.
     */
    public Builder addAllCatalog(List<OperationSearchParams.Catalog> elements) {
      if (this.catalogs == null) {
        this.catalogs = new ArrayList<>();
      }
      this.catalogs.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * OperationSearchParams#extraParams} for the field documentation.
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
     * See {@link OperationSearchParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Maximum results. Default: 5, Max: 20. */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** The page token for pagination. */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }

    /** <strong>Required.</strong> Natural-language question. Required. */
    public Builder setQuery(String query) {
      this.query = query;
      return this;
    }
  }

  public enum Catalog implements ApiRequestParams.EnumParam {
    @SerializedName("metrics")
    METRICS("metrics"),

    @SerializedName("reports")
    REPORTS("reports"),

    @SerializedName("schemas")
    SCHEMAS("schemas");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Catalog(String value) {
      this.value = value;
    }
  }
}
