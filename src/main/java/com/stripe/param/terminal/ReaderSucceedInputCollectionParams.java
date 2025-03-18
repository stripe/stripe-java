// File generated from our OpenAPI spec
package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ReaderSucceedInputCollectionParams extends ApiRequestParams {
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

  /** Skip behavior for input collection. */
  @SerializedName("skip_non_required_inputs")
  SkipNonRequiredInputs skipNonRequiredInputs;

  private ReaderSucceedInputCollectionParams(
      List<String> expand,
      Map<String, Object> extraParams,
      SkipNonRequiredInputs skipNonRequiredInputs) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.skipNonRequiredInputs = skipNonRequiredInputs;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private SkipNonRequiredInputs skipNonRequiredInputs;

    /** Finalize and obtain parameter instance from this builder. */
    public ReaderSucceedInputCollectionParams build() {
      return new ReaderSucceedInputCollectionParams(
          this.expand, this.extraParams, this.skipNonRequiredInputs);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ReaderSucceedInputCollectionParams#expand} for the field documentation.
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
     * ReaderSucceedInputCollectionParams#expand} for the field documentation.
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
     * ReaderSucceedInputCollectionParams#extraParams} for the field documentation.
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
     * See {@link ReaderSucceedInputCollectionParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Skip behavior for input collection. */
    public Builder setSkipNonRequiredInputs(
        ReaderSucceedInputCollectionParams.SkipNonRequiredInputs skipNonRequiredInputs) {
      this.skipNonRequiredInputs = skipNonRequiredInputs;
      return this;
    }
  }

  public enum SkipNonRequiredInputs implements ApiRequestParams.EnumParam {
    @SerializedName("all")
    ALL("all"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    SkipNonRequiredInputs(String value) {
      this.value = value;
    }
  }
}
