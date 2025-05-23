// File generated from our OpenAPI spec
package com.stripe.param.apps;

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
public class SecretCreateParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** The Unix timestamp for the expiry time of the secret, after which the secret deletes. */
  @SerializedName("expires_at")
  Long expiresAt;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /** <strong>Required.</strong> A name for the secret that's unique within the scope. */
  @SerializedName("name")
  String name;

  /** <strong>Required.</strong> The plaintext secret value to be stored. */
  @SerializedName("payload")
  String payload;

  /**
   * <strong>Required.</strong> Specifies the scoping of the secret. Requests originating from UI
   * extensions can only access account-scoped secrets or secrets scoped to their own user.
   */
  @SerializedName("scope")
  Scope scope;

  private SecretCreateParams(
      List<String> expand,
      Long expiresAt,
      Map<String, Object> extraParams,
      String name,
      String payload,
      Scope scope) {
    this.expand = expand;
    this.expiresAt = expiresAt;
    this.extraParams = extraParams;
    this.name = name;
    this.payload = payload;
    this.scope = scope;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Long expiresAt;

    private Map<String, Object> extraParams;

    private String name;

    private String payload;

    private Scope scope;

    /** Finalize and obtain parameter instance from this builder. */
    public SecretCreateParams build() {
      return new SecretCreateParams(
          this.expand, this.expiresAt, this.extraParams, this.name, this.payload, this.scope);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SecretCreateParams#expand} for the field documentation.
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
     * SecretCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** The Unix timestamp for the expiry time of the secret, after which the secret deletes. */
    public Builder setExpiresAt(Long expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SecretCreateParams#extraParams} for the field documentation.
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
     * See {@link SecretCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> A name for the secret that's unique within the scope. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** <strong>Required.</strong> The plaintext secret value to be stored. */
    public Builder setPayload(String payload) {
      this.payload = payload;
      return this;
    }

    /**
     * <strong>Required.</strong> Specifies the scoping of the secret. Requests originating from UI
     * extensions can only access account-scoped secrets or secrets scoped to their own user.
     */
    public Builder setScope(SecretCreateParams.Scope scope) {
      this.scope = scope;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Scope {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** <strong>Required.</strong> The secret scope type. */
    @SerializedName("type")
    Type type;

    /**
     * The user ID. This field is required if {@code type} is set to {@code user}, and should not be
     * provided if {@code type} is set to {@code account}.
     */
    @SerializedName("user")
    String user;

    private Scope(Map<String, Object> extraParams, Type type, String user) {
      this.extraParams = extraParams;
      this.type = type;
      this.user = user;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private Type type;

      private String user;

      /** Finalize and obtain parameter instance from this builder. */
      public SecretCreateParams.Scope build() {
        return new SecretCreateParams.Scope(this.extraParams, this.type, this.user);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SecretCreateParams.Scope#extraParams} for the field documentation.
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
       * See {@link SecretCreateParams.Scope#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** <strong>Required.</strong> The secret scope type. */
      public Builder setType(SecretCreateParams.Scope.Type type) {
        this.type = type;
        return this;
      }

      /**
       * The user ID. This field is required if {@code type} is set to {@code user}, and should not
       * be provided if {@code type} is set to {@code account}.
       */
      public Builder setUser(String user) {
        this.user = user;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("account")
      ACCOUNT("account"),

      @SerializedName("user")
      USER("user");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}
