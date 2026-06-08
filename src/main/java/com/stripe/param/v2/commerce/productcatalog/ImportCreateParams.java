// File generated from our OpenAPI spec
package com.stripe.param.v2.commerce.productcatalog;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ImportCreateParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> The type of catalog data to import. */
  @SerializedName("feed_type")
  FeedType feedType;

  /** <strong>Required.</strong> Additional information about the import in a structured format. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** <strong>Required.</strong> The strategy for handling existing catalog data during import. */
  @SerializedName("mode")
  Mode mode;

  private ImportCreateParams(
      Map<String, Object> extraParams, FeedType feedType, Map<String, String> metadata, Mode mode) {
    this.extraParams = extraParams;
    this.feedType = feedType;
    this.metadata = metadata;
    this.mode = mode;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private FeedType feedType;

    private Map<String, String> metadata;

    private Mode mode;

    /** Finalize and obtain parameter instance from this builder. */
    public ImportCreateParams build() {
      return new ImportCreateParams(this.extraParams, this.feedType, this.metadata, this.mode);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ImportCreateParams#extraParams} for the field documentation.
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
     * See {@link ImportCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The type of catalog data to import. */
    public Builder setFeedType(ImportCreateParams.FeedType feedType) {
      this.feedType = feedType;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ImportCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ImportCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The strategy for handling existing catalog data during import. */
    public Builder setMode(ImportCreateParams.Mode mode) {
      this.mode = mode;
      return this;
    }
  }

  public enum FeedType implements ApiRequestParams.EnumParam {
    @SerializedName("inventory")
    INVENTORY("inventory"),

    @SerializedName("pricing")
    PRICING("pricing"),

    @SerializedName("product")
    PRODUCT("product"),

    @SerializedName("promotion")
    PROMOTION("promotion");

    @Getter(onMethod_ = {@Override})
    private final String value;

    FeedType(String value) {
      this.value = value;
    }
  }

  public enum Mode implements ApiRequestParams.EnumParam {
    @SerializedName("replace")
    REPLACE("replace"),

    @SerializedName("upsert")
    UPSERT("upsert");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Mode(String value) {
      this.value = value;
    }
  }
}
