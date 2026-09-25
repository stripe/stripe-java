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
public class InstallCreateParams extends ApiRequestParams {
  /** <strong>Required.</strong> The ID of the app to install. */
  @SerializedName("app")
  String app;

  /**
   * The distribution channel to install from. Defaults to {@code public}. A private app must be
   * installed on {@code private_test} or {@code private_live}, matching the mode of the API key.
   */
  @SerializedName("channel")
  Channel channel;

  /**
   * For OAuth apps, the PKCE code challenge used to issue the {@code auth_code} returned on the
   * install. Must be 43 to 128 characters and contain only letters, numbers, {@code -}, {@code .},
   * {@code _}, and {@code ~}. Only applies to installs made by the app developer or an embedding
   * platform; ignored when an account installs its own private app.
   */
  @SerializedName("code_challenge")
  String codeChallenge;

  /**
   * The method used to derive {@code code_challenge}. Required when {@code code_challenge} is
   * provided, and must be {@code S256}.
   */
  @SerializedName("code_challenge_method")
  String codeChallengeMethod;

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

  private InstallCreateParams(
      String app,
      Channel channel,
      String codeChallenge,
      String codeChallengeMethod,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.app = app;
    this.channel = channel;
    this.codeChallenge = codeChallenge;
    this.codeChallengeMethod = codeChallengeMethod;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String app;

    private Channel channel;

    private String codeChallenge;

    private String codeChallengeMethod;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public InstallCreateParams build() {
      return new InstallCreateParams(
          this.app,
          this.channel,
          this.codeChallenge,
          this.codeChallengeMethod,
          this.expand,
          this.extraParams);
    }

    /** <strong>Required.</strong> The ID of the app to install. */
    public Builder setApp(String app) {
      this.app = app;
      return this;
    }

    /**
     * The distribution channel to install from. Defaults to {@code public}. A private app must be
     * installed on {@code private_test} or {@code private_live}, matching the mode of the API key.
     */
    public Builder setChannel(InstallCreateParams.Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * For OAuth apps, the PKCE code challenge used to issue the {@code auth_code} returned on the
     * install. Must be 43 to 128 characters and contain only letters, numbers, {@code -}, {@code
     * .}, {@code _}, and {@code ~}. Only applies to installs made by the app developer or an
     * embedding platform; ignored when an account installs its own private app.
     */
    public Builder setCodeChallenge(String codeChallenge) {
      this.codeChallenge = codeChallenge;
      return this;
    }

    /**
     * The method used to derive {@code code_challenge}. Required when {@code code_challenge} is
     * provided, and must be {@code S256}.
     */
    public Builder setCodeChallengeMethod(String codeChallengeMethod) {
      this.codeChallengeMethod = codeChallengeMethod;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InstallCreateParams#expand} for the field documentation.
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
     * InstallCreateParams#expand} for the field documentation.
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
     * InstallCreateParams#extraParams} for the field documentation.
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
     * See {@link InstallCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }

  public enum Channel implements ApiRequestParams.EnumParam {
    @SerializedName("private_live")
    PRIVATE_LIVE("private_live"),

    @SerializedName("private_test")
    PRIVATE_TEST("private_test"),

    @SerializedName("public")
    PUBLIC("public"),

    @SerializedName("testing")
    TESTING("testing");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Channel(String value) {
      this.value = value;
    }
  }
}
