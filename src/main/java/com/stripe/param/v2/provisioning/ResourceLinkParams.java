// File generated from our OpenAPI spec
package com.stripe.param.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ResourceLinkParams extends ApiRequestParams {
  /** Catalog partition of the existing resource. */
  @SerializedName("catalog")
  Catalog catalog;

  /** Environment the existing resource runs in. */
  @SerializedName("environment")
  Environment environment;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Whether the resource should use Stripe live-mode objects. When omitted, this resolves to true.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Identifier of the project to link the resource to. */
  @SerializedName("project")
  String project;

  /** <strong>Required.</strong> Identifier of the provider that hosts the existing resource. */
  @SerializedName("provider")
  String provider;

  /**
   * <strong>Required.</strong> Identifier of the provider service the existing resource belongs to.
   */
  @SerializedName("service_ref")
  String serviceRef;

  private ResourceLinkParams(
      Catalog catalog,
      Environment environment,
      Map<String, Object> extraParams,
      Boolean livemode,
      String project,
      String provider,
      String serviceRef) {
    this.catalog = catalog;
    this.environment = environment;
    this.extraParams = extraParams;
    this.livemode = livemode;
    this.project = project;
    this.provider = provider;
    this.serviceRef = serviceRef;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Catalog catalog;

    private Environment environment;

    private Map<String, Object> extraParams;

    private Boolean livemode;

    private String project;

    private String provider;

    private String serviceRef;

    /** Finalize and obtain parameter instance from this builder. */
    public ResourceLinkParams build() {
      return new ResourceLinkParams(
          this.catalog,
          this.environment,
          this.extraParams,
          this.livemode,
          this.project,
          this.provider,
          this.serviceRef);
    }

    /** Catalog partition of the existing resource. */
    public Builder setCatalog(ResourceLinkParams.Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /** Environment the existing resource runs in. */
    public Builder setEnvironment(ResourceLinkParams.Environment environment) {
      this.environment = environment;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceLinkParams#extraParams} for the field documentation.
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
     * See {@link ResourceLinkParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Whether the resource should use Stripe live-mode objects. When omitted, this resolves to
     * true.
     */
    public Builder setLivemode(Boolean livemode) {
      this.livemode = livemode;
      return this;
    }

    /** Identifier of the project to link the resource to. */
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    /** <strong>Required.</strong> Identifier of the provider that hosts the existing resource. */
    public Builder setProvider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * <strong>Required.</strong> Identifier of the provider service the existing resource belongs
     * to.
     */
    public Builder setServiceRef(String serviceRef) {
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

  public enum Environment implements ApiRequestParams.EnumParam {
    @SerializedName("dev")
    DEV("dev"),

    @SerializedName("prod")
    PROD("prod");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Environment(String value) {
      this.value = value;
    }
  }
}
