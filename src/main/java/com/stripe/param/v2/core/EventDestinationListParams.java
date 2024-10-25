// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class EventDestinationListParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Additional fields to include in the response. Currently supports {@code webhook_endpoint.url}.
   */
  @SerializedName("include")
  List<EventDestinationListParams.Include> include;

  /** The page size. */
  @SerializedName("limit")
  Integer limit;

  /** The requested page. */
  @SerializedName("page")
  String page;

  private EventDestinationListParams(
      Map<String, Object> extraParams,
      List<EventDestinationListParams.Include> include,
      Integer limit,
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

    private List<EventDestinationListParams.Include> include;

    private Integer limit;

    private String page;

    /** Finalize and obtain parameter instance from this builder. */
    public EventDestinationListParams build() {
      return new EventDestinationListParams(this.extraParams, this.include, this.limit, this.page);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * EventDestinationListParams#extraParams} for the field documentation.
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
     * See {@link EventDestinationListParams#extraParams} for the field documentation.
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
     * EventDestinationListParams#include} for the field documentation.
     */
    public Builder addInclude(EventDestinationListParams.Include element) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.add(element);
      return this;
    }

    /**
     * Add all elements to `include` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * EventDestinationListParams#include} for the field documentation.
     */
    public Builder addAllInclude(List<EventDestinationListParams.Include> elements) {
      if (this.include == null) {
        this.include = new ArrayList<>();
      }
      this.include.addAll(elements);
      return this;
    }

    /** The page size. */
    public Builder setLimit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /** The requested page. */
    public Builder setPage(String page) {
      this.page = page;
      return this;
    }
  }

  public enum Include implements ApiRequestParams.EnumParam {
    @SerializedName("webhook_endpoint.url")
    WEBHOOK_ENDPOINT__URL("webhook_endpoint.url");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Include(String value) {
      this.value = value;
    }
  }
}
