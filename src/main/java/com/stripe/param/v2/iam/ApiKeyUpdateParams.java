// File generated from our OpenAPI spec
package com.stripe.param.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ApiKeyUpdateParams extends ApiRequestParams {
  /** List of connect permissions for this API key. */
  @SerializedName("connect_permissions")
  List<String> connectPermissions;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** Name to set for the API key. If blank, the field is left unchanged. */
  @SerializedName("name")
  Object name;

  /** Note or description to set for the API key. If blank, the field is left unchanged. */
  @SerializedName("note")
  Object note;

  /** List of permissions for this API key. */
  @SerializedName("permissions")
  List<String> permissions;

  private ApiKeyUpdateParams(
      List<String> connectPermissions,
      Map<String, Object> extraParams,
      Object name,
      Object note,
      List<String> permissions) {
    this.connectPermissions = connectPermissions;
    this.extraParams = extraParams;
    this.name = name;
    this.note = note;
    this.permissions = permissions;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> connectPermissions;

    private Map<String, Object> extraParams;

    private Object name;

    private Object note;

    private List<String> permissions;

    /** Finalize and obtain parameter instance from this builder. */
    public ApiKeyUpdateParams build() {
      return new ApiKeyUpdateParams(
          this.connectPermissions, this.extraParams, this.name, this.note, this.permissions);
    }

    /**
     * Add an element to `connectPermissions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ApiKeyUpdateParams#connectPermissions} for the field documentation.
     */
    public Builder addConnectPermission(String element) {
      if (this.connectPermissions == null) {
        this.connectPermissions = new ArrayList<>();
      }
      this.connectPermissions.add(element);
      return this;
    }

    /**
     * Add all elements to `connectPermissions` list. A list is initialized for the first
     * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
     * {@link ApiKeyUpdateParams#connectPermissions} for the field documentation.
     */
    public Builder addAllConnectPermission(List<String> elements) {
      if (this.connectPermissions == null) {
        this.connectPermissions = new ArrayList<>();
      }
      this.connectPermissions.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ApiKeyUpdateParams#extraParams} for the field documentation.
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
     * See {@link ApiKeyUpdateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** Name to set for the API key. If blank, the field is left unchanged. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** Name to set for the API key. If blank, the field is left unchanged. */
    public Builder setName(EmptyParam name) {
      this.name = name;
      return this;
    }

    /** Note or description to set for the API key. If blank, the field is left unchanged. */
    public Builder setNote(String note) {
      this.note = note;
      return this;
    }

    /** Note or description to set for the API key. If blank, the field is left unchanged. */
    public Builder setNote(EmptyParam note) {
      this.note = note;
      return this;
    }

    /**
     * Add an element to `permissions` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * ApiKeyUpdateParams#permissions} for the field documentation.
     */
    public Builder addPermission(String element) {
      if (this.permissions == null) {
        this.permissions = new ArrayList<>();
      }
      this.permissions.add(element);
      return this;
    }

    /**
     * Add all elements to `permissions` list. A list is initialized for the first `add/addAll`
     * call, and subsequent calls adds additional elements to the original list. See {@link
     * ApiKeyUpdateParams#permissions} for the field documentation.
     */
    public Builder addAllPermission(List<String> elements) {
      if (this.permissions == null) {
        this.permissions = new ArrayList<>();
      }
      this.permissions.addAll(elements);
      return this;
    }
  }
}
