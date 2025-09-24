// File generated from our OpenAPI spec
package com.stripe.param.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandboxCreateParams extends ApiRequestParams {
  /**
   * <strong>Required.</strong> If true, returns a key that can be used with <a
   * href="https://docs.stripe.com/mcp">Stripe's MCP server</a>.
   */
  @SerializedName("enable_mcp_access")
  Boolean enableMcpAccess;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * <strong>Required.</strong> Values that are prefilled when a user claims the sandbox. When a
   * user claims the sandbox, they will be able to update these values.
   */
  @SerializedName("prefill")
  Prefill prefill;

  private ClaimableSandboxCreateParams(
      Boolean enableMcpAccess, Map<String, Object> extraParams, Prefill prefill) {
    this.enableMcpAccess = enableMcpAccess;
    this.extraParams = extraParams;
    this.prefill = prefill;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Boolean enableMcpAccess;

    private Map<String, Object> extraParams;

    private Prefill prefill;

    /** Finalize and obtain parameter instance from this builder. */
    public ClaimableSandboxCreateParams build() {
      return new ClaimableSandboxCreateParams(this.enableMcpAccess, this.extraParams, this.prefill);
    }

    /**
     * <strong>Required.</strong> If true, returns a key that can be used with <a
     * href="https://docs.stripe.com/mcp">Stripe's MCP server</a>.
     */
    public Builder setEnableMcpAccess(Boolean enableMcpAccess) {
      this.enableMcpAccess = enableMcpAccess;
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ClaimableSandboxCreateParams#extraParams} for the field documentation.
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
     * See {@link ClaimableSandboxCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * <strong>Required.</strong> Values that are prefilled when a user claims the sandbox. When a
     * user claims the sandbox, they will be able to update these values.
     */
    public Builder setPrefill(ClaimableSandboxCreateParams.Prefill prefill) {
      this.prefill = prefill;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Prefill {
    /**
     * <strong>Required.</strong> Country in which the account holder resides, or in which the
     * business is legally established. Use two-letter country code (<a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    String country;

    /**
     * <strong>Required.</strong> Email that this sandbox is meant to be claimed by. Stripe will
     * notify this email address before the sandbox expires.
     */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Name for the sandbox. If not provided, this will be generated. */
    @SerializedName("name")
    String name;

    private Prefill(String country, String email, Map<String, Object> extraParams, String name) {
      this.country = country;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String country;

      private String email;

      private Map<String, Object> extraParams;

      private String name;

      /** Finalize and obtain parameter instance from this builder. */
      public ClaimableSandboxCreateParams.Prefill build() {
        return new ClaimableSandboxCreateParams.Prefill(
            this.country, this.email, this.extraParams, this.name);
      }

      /**
       * <strong>Required.</strong> Country in which the account holder resides, or in which the
       * business is legally established. Use two-letter country code (<a
       * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>).
       */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * <strong>Required.</strong> Email that this sandbox is meant to be claimed by. Stripe will
       * notify this email address before the sandbox expires.
       */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ClaimableSandboxCreateParams.Prefill#extraParams} for the field documentation.
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
       * See {@link ClaimableSandboxCreateParams.Prefill#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Name for the sandbox. If not provided, this will be generated. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }
    }
  }
}
