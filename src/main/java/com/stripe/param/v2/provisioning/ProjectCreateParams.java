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
public class ProjectCreateParams extends ApiRequestParams {
  /** Catalog partition to create the project in. */
  @SerializedName("catalog")
  Catalog catalog;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Human-readable name for the new project. */
  @SerializedName("name")
  String name;

  /** Identifier of the developer profile to associate with the new project. */
  @SerializedName("project_profile")
  String projectProfile;

  private ProjectCreateParams(
      Catalog catalog, Map<String, Object> extraParams, String name, String projectProfile) {
    this.catalog = catalog;
    this.extraParams = extraParams;
    this.name = name;
    this.projectProfile = projectProfile;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Catalog catalog;

    private Map<String, Object> extraParams;

    private String name;

    private String projectProfile;

    /** Finalize and obtain parameter instance from this builder. */
    public ProjectCreateParams build() {
      return new ProjectCreateParams(
          this.catalog, this.extraParams, this.name, this.projectProfile);
    }

    /** Catalog partition to create the project in. */
    public Builder setCatalog(ProjectCreateParams.Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProjectCreateParams#extraParams} for the field documentation.
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
     * See {@link ProjectCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> Human-readable name for the new project. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Identifier of the developer profile to associate with the new project. */
    public Builder setProjectProfile(String projectProfile) {
      this.projectProfile = projectProfile;
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
