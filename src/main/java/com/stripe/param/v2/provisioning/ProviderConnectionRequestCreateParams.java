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
public class ProviderConnectionRequestCreateParams extends ApiRequestParams {
  /**
   * PKCE code challenge: BASE64URL(SHA256(code_verifier)). Optional; when present the OAuth
   * callback must supply the matching code_verifier. Not a secret (it is a hash of the verifier).
   */
  @SerializedName("code_challenge")
  String codeChallenge;

  /** PKCE code challenge method. Only &quot;S256&quot; is supported. */
  @SerializedName("code_challenge_method")
  String codeChallengeMethod;

  /** <strong>Required.</strong> Provider-specific configuration payload for the connection. */
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
   * Project this provider connection is created for. Used to infer the catalog partition for
   * provider calls. Optional; when absent the provider connection defaults to the prod catalog.
   */
  @SerializedName("project")
  String project;

  /** Identifier of the provider to connect to. */
  @SerializedName("provider")
  String provider;

  /** Deprecated identifier of the provider to connect to; use {@code provider} instead. */
  @SerializedName("provider_name")
  String providerName;

  private ProviderConnectionRequestCreateParams(
      String codeChallenge,
      String codeChallengeMethod,
      Map<String, Object> configuration,
      Map<String, Object> extraParams,
      String project,
      String provider,
      String providerName) {
    this.codeChallenge = codeChallenge;
    this.codeChallengeMethod = codeChallengeMethod;
    this.configuration = configuration;
    this.extraParams = extraParams;
    this.project = project;
    this.provider = provider;
    this.providerName = providerName;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String codeChallenge;

    private String codeChallengeMethod;

    private Map<String, Object> configuration;

    private Map<String, Object> extraParams;

    private String project;

    private String provider;

    private String providerName;

    /** Finalize and obtain parameter instance from this builder. */
    public ProviderConnectionRequestCreateParams build() {
      return new ProviderConnectionRequestCreateParams(
          this.codeChallenge,
          this.codeChallengeMethod,
          this.configuration,
          this.extraParams,
          this.project,
          this.provider,
          this.providerName);
    }

    /**
     * PKCE code challenge: BASE64URL(SHA256(code_verifier)). Optional; when present the OAuth
     * callback must supply the matching code_verifier. Not a secret (it is a hash of the verifier).
     */
    public Builder setCodeChallenge(String codeChallenge) {
      this.codeChallenge = codeChallenge;
      return this;
    }

    /** PKCE code challenge method. Only &quot;S256&quot; is supported. */
    public Builder setCodeChallengeMethod(String codeChallengeMethod) {
      this.codeChallengeMethod = codeChallengeMethod;
      return this;
    }

    /**
     * Add a key/value pair to `configuration` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ProviderConnectionRequestCreateParams#configuration} for the field documentation.
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
     * See {@link ProviderConnectionRequestCreateParams#configuration} for the field documentation.
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
     * ProviderConnectionRequestCreateParams#extraParams} for the field documentation.
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
     * See {@link ProviderConnectionRequestCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Project this provider connection is created for. Used to infer the catalog partition for
     * provider calls. Optional; when absent the provider connection defaults to the prod catalog.
     */
    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    /** Identifier of the provider to connect to. */
    public Builder setProvider(String provider) {
      this.provider = provider;
      return this;
    }

    /** Deprecated identifier of the provider to connect to; use {@code provider} instead. */
    public Builder setProviderName(String providerName) {
      this.providerName = providerName;
      return this;
    }
  }
}
