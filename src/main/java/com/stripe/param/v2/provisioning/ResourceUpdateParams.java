// File generated from our OpenAPI spec
package com.stripe.param.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ResourceUpdateParams extends ApiRequestParams {
  /** Catalog partition of the resource. */
  @SerializedName("catalog")
  Catalog catalog;

  /** New provider-specific configuration payload for the resource. */
  @SerializedName("configuration")
  Map<String, Object> configuration;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Provider's service id to switch the resource to. If omitted, the resource's existing service is
   * retained and this is treated as a config-only update.
   */
  @SerializedName("service_ref")
  Object serviceRef;

  private ResourceUpdateParams(
      Catalog catalog,
      Map<String, Object> configuration,
      Map<String, Object> extraParams,
      Object serviceRef) {
    this.catalog = catalog;
    this.configuration = configuration;
    this.extraParams = extraParams;
    this.serviceRef = serviceRef;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Catalog catalog;

    private Map<String, Object> configuration;

    private Map<String, Object> extraParams;

    private Object serviceRef;

    /** Finalize and obtain parameter instance from this builder. */
    public ResourceUpdateParams build() {
      return new ResourceUpdateParams(
          this.catalog, this.configuration, this.extraParams, this.serviceRef);
    }

    /** Catalog partition of the resource. */
    public Builder setCatalog(ResourceUpdateParams.Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Add a key/value pair to `configuration` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceUpdateParams#configuration} for the field documentation.
     */
    public Builder putConfiguration(String key, Object value) {
      if (this.configuration == null) {
        this.configuration = new HashMap<>();
      }
      this.configuration.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `configuration` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ResourceUpdateParams#configuration} for the field documentation.
     */
    public Builder putAllConfiguration(Map<String, Object> map) {
      if (this.configuration == null) {
        this.configuration = new HashMap<>();
      }
      this.configuration.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceUpdateParams#extraParams} for the field documentation.
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
     * See {@link ResourceUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Provider's service id to switch the resource to. If omitted, the resource's existing service
     * is retained and this is treated as a config-only update.
     */
    public Builder setServiceRef(String serviceRef) {
      this.serviceRef = serviceRef;
      return this;
    }

    /**
     * Provider's service id to switch the resource to. If omitted, the resource's existing service
     * is retained and this is treated as a config-only update.
     */
    public Builder setServiceRef(EmptyParam serviceRef) {
      this.serviceRef = serviceRef;
      return this;
    }
  }

  public enum Catalog implements ApiRequestParams.EnumParam {
    @SerializedName("dev")
    DEV("dev"),

    @SerializedName("prod")
    PROD("prod"),

    @SerializedName("testing")
    TESTING("testing");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Catalog(String value) {
      this.value = value;
    }
  }
}
