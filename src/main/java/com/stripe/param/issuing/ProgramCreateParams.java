// File generated from our OpenAPI spec
package com.stripe.param.issuing;

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
public class ProgramCreateParams extends ApiRequestParams {
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

  /** If true, makes the specified program the default for the given account. */
  @SerializedName("is_default")
  Boolean isDefault;

  /** <strong>Required.</strong> The program to use as the parent for the new program to create. */
  @SerializedName("platform_program")
  String platformProgram;

  private ProgramCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Boolean isDefault,
      String platformProgram) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.isDefault = isDefault;
    this.platformProgram = platformProgram;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Boolean isDefault;

    private String platformProgram;

    /** Finalize and obtain parameter instance from this builder. */
    public ProgramCreateParams build() {
      return new ProgramCreateParams(
          this.expand, this.extraParams, this.isDefault, this.platformProgram);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ProgramCreateParams#expand} for the field documentation.
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
     * ProgramCreateParams#expand} for the field documentation.
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
     * ProgramCreateParams#extraParams} for the field documentation.
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
     * See {@link ProgramCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** If true, makes the specified program the default for the given account. */
    public Builder setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    /**
     * <strong>Required.</strong> The program to use as the parent for the new program to create.
     */
    public Builder setPlatformProgram(String platformProgram) {
      this.platformProgram = platformProgram;
      return this;
    }
  }
}
