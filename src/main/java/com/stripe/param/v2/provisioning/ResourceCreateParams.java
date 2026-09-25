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
public class ResourceCreateParams extends ApiRequestParams {
  /** Catalog partition to create the resource in. */
  @SerializedName("catalog")
  Catalog catalog;

  /** <strong>Required.</strong> Provider-specific configuration payload for the resource. */
  @SerializedName("configuration")
  Map<String, Object> configuration;

  /** Environment the resource should be created in. */
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
   * Whether the resource should use Stripe live-mode objects. When omitted, this resolves to false
   * for a sandbox target and true otherwise. Sandbox targets cannot create live-mode resources.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Human-readable name for the resource. */
  @SerializedName("name")
  String name;

  /** Identifier of the project to create the resource in. */
  @SerializedName("project")
  String project;

  /** <strong>Required.</strong> Identifier of the provider to create the resource with. */
  @SerializedName("provider")
  String provider;

  /** <strong>Required.</strong> Identifier of the provider service to create the resource from. */
  @SerializedName("service_ref")
  String serviceRef;

  private ResourceCreateParams(
      Catalog catalog,
      Map<String, Object> configuration,
      Environment environment,
      Map<String, Object> extraParams,
      Boolean livemode,
      String name,
      String project,
      String provider,
      String serviceRef) {
    this.catalog = catalog;
    this.configuration = configuration;
    this.environment = environment;
    this.extraParams = extraParams;
    this.livemode = livemode;
    this.name = name;
    this.project = project;
    this.provider = provider;
    this.serviceRef = serviceRef;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Catalog catalog;

    private Map<String, Object> configuration;

    private Environment environment;

    private Map<String, Object> extraParams;

    private Boolean livemode;

    private String name;

    private String project;

    private String provider;

    private String serviceRef;

    /** Finalize and obtain parameter instance from this builder. */
    public ResourceCreateParams build() {
      return new ResourceCreateParams(
          this.catalog,
          this.configuration,
          this.environment,
          this.extraParams,
          this.livemode,
          this.name,
          this.project,
          this.provider,
          this.serviceRef);
    }

    /** Catalog partition to create the resource in. */
    public Builder setCatalog(ResourceCreateParams.Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Add a key/value pair to `configuration` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceCreateParams#configuration} for the field documentation.
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
     * See {@link ResourceCreateParams#configuration} for the field documentation.
     */
    public Builder putAllConfiguration(Map<String, Object> map) {
      if (this.configuration == null) {
        this.configuration = new HashMap<>();
      }
      this.configuration.putAll(map);
      return this;
    }

    /** Environment the resource should be created in. */
    public Builder setEnvironment(ResourceCreateParams.Environment environment) {
      this.environment = environment;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceCreateParams#extraParams} for the field documentation.
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
     * See {@link ResourceCreateParams#extraParams} for the field documentation.
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
     * false for a sandbox target and true otherwise. Sandbox targets cannot create live-mode
     * resources.
     */
    public Builder setLivemode(Boolean livemode) {
      this.livemode = livemode;
      return this;
    }

    /** Human-readable name for the resource. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Identifier of the project to create the resource in. */
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    /** <strong>Required.</strong> Identifier of the provider to create the resource with. */
    public Builder setProvider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * <strong>Required.</strong> Identifier of the provider service to create the resource from.
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
