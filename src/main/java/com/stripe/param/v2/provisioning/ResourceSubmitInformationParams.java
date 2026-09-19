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
public class ResourceSubmitInformationParams extends ApiRequestParams {
  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> Additional information being submitted for the resource. */
  @SerializedName("submitted_information")
  Map<String, Object> submittedInformation;

  private ResourceSubmitInformationParams(
      Map<String, Object> extraParams, Map<String, Object> submittedInformation) {
    this.extraParams = extraParams;
    this.submittedInformation = submittedInformation;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Map<String, Object> extraParams;

    private Map<String, Object> submittedInformation;

    /** Finalize and obtain parameter instance from this builder. */
    public ResourceSubmitInformationParams build() {
      return new ResourceSubmitInformationParams(this.extraParams, this.submittedInformation);
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ResourceSubmitInformationParams#extraParams} for the field documentation.
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
     * See {@link ResourceSubmitInformationParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `submittedInformation` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ResourceSubmitInformationParams#submittedInformation} for the field documentation.
     */
    public Builder putSubmittedInformation(String key, Object value) {
      if (this.submittedInformation == null) {
        this.submittedInformation = new HashMap<>();
      }
      this.submittedInformation.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `submittedInformation` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ResourceSubmitInformationParams#submittedInformation} for the field documentation.
     */
    public Builder putAllSubmittedInformation(Map<String, Object> map) {
      if (this.submittedInformation == null) {
        this.submittedInformation = new HashMap<>();
      }
      this.submittedInformation.putAll(map);
      return this;
    }
  }
}
