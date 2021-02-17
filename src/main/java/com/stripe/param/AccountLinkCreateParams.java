// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class AccountLinkCreateParams extends ApiRequestParams {
  /** The identifier of the account to create an account link for. */
  @SerializedName("account")
  String account;

  /**
   * Which information the platform needs to collect from the user. One of {@code currently_due} or
   * {@code eventually_due}. Default is {@code currently_due}.
   */
  @SerializedName("collect")
  Collect collect;

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

  /**
   * The URL the user will be redirected to if the account link is expired, has been
   * previously-visited, or is otherwise invalid. The URL you specify should attempt to generate a
   * new account link with the same parameters used to create the original account link, then
   * redirect the user to the new account link's URL so they can continue with Connect Onboarding.
   * If a new account link cannot be generated or the redirect fails you should display a useful
   * error to the user.
   */
  @SerializedName("refresh_url")
  String refreshUrl;

  /** The URL that the user will be redirected to upon leaving or completing the linked flow. */
  @SerializedName("return_url")
  String returnUrl;

  /**
   * The type of account link the user is requesting. Possible values are {@code account_onboarding}
   * or {@code account_update}.
   */
  @SerializedName("type")
  Type type;

  private AccountLinkCreateParams(
      String account,
      Collect collect,
      List<String> expand,
      Map<String, Object> extraParams,
      String refreshUrl,
      String returnUrl,
      Type type) {
    this.account = account;
    this.collect = collect;
    this.expand = expand;
    this.extraParams = extraParams;
    this.refreshUrl = refreshUrl;
    this.returnUrl = returnUrl;
    this.type = type;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String account;

    private Collect collect;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String refreshUrl;

    private String returnUrl;

    private Type type;

    /** Finalize and obtain parameter instance from this builder. */
    public AccountLinkCreateParams build() {
      return new AccountLinkCreateParams(
          this.account,
          this.collect,
          this.expand,
          this.extraParams,
          this.refreshUrl,
          this.returnUrl,
          this.type);
    }

    /** The identifier of the account to create an account link for. */
    public Builder setAccount(String account) {
      this.account = account;
      return this;
    }

    /**
     * Which information the platform needs to collect from the user. One of {@code currently_due}
     * or {@code eventually_due}. Default is {@code currently_due}.
     */
    public Builder setCollect(Collect collect) {
      this.collect = collect;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * AccountLinkCreateParams#expand} for the field documentation.
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
     * AccountLinkCreateParams#expand} for the field documentation.
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
     * AccountLinkCreateParams#extraParams} for the field documentation.
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
     * See {@link AccountLinkCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The URL the user will be redirected to if the account link is expired, has been
     * previously-visited, or is otherwise invalid. The URL you specify should attempt to generate a
     * new account link with the same parameters used to create the original account link, then
     * redirect the user to the new account link's URL so they can continue with Connect Onboarding.
     * If a new account link cannot be generated or the redirect fails you should display a useful
     * error to the user.
     */
    public Builder setRefreshUrl(String refreshUrl) {
      this.refreshUrl = refreshUrl;
      return this;
    }

    /** The URL that the user will be redirected to upon leaving or completing the linked flow. */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * The type of account link the user is requesting. Possible values are {@code
     * account_onboarding} or {@code account_update}.
     */
    public Builder setType(Type type) {
      this.type = type;
      return this;
    }
  }

  public enum Collect implements ApiRequestParams.EnumParam {
    @SerializedName("currently_due")
    CURRENTLY_DUE("currently_due"),

    @SerializedName("eventually_due")
    EVENTUALLY_DUE("eventually_due");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Collect(String value) {
      this.value = value;
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("account_onboarding")
    ACCOUNT_ONBOARDING("account_onboarding"),

    @SerializedName("account_update")
    ACCOUNT_UPDATE("account_update"),

    @SerializedName("custom_account_update")
    CUSTOM_ACCOUNT_UPDATE("custom_account_update"),

    @SerializedName("custom_account_verification")
    CUSTOM_ACCOUNT_VERIFICATION("custom_account_verification");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
