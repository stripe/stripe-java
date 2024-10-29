// File generated from our OpenAPI spec
package com.stripe.model.apps;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.apps.SecretCreateParams;
import com.stripe.param.apps.SecretDeleteWhereParams;
import com.stripe.param.apps.SecretFindParams;
import com.stripe.param.apps.SecretListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Secret Store is an API that allows Stripe Apps developers to securely persist secrets for use by
 * UI Extensions and app backends.
 *
 * <p>The primary resource in Secret Store is a {@code secret}. Other apps can't view secrets
 * created by an app. Additionally, secrets are scoped to provide further permission control.
 *
 * <p>All Dashboard users and the app backend share {@code account} scoped secrets. Use the {@code
 * account} scope for secrets that don't change per-user, like a third-party API key.
 *
 * <p>A {@code user} scoped secret is accessible by the app backend and one specific Dashboard user.
 * Use the {@code user} scope for per-user secrets like per-user OAuth tokens, where different users
 * might have different permissions.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/stripe-apps/store-auth-data-custom-objects">Store data between page
 * reloads</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Secret extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** If true, indicates that this secret has been deleted. */
  @SerializedName("deleted")
  Boolean deleted;

  /** The Unix timestamp for the expiry time of the secret, after which the secret deletes. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** A name for the secret that's unique within the scope. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code apps.secret}.
   */
  @SerializedName("object")
  String object;

  /** The plaintext secret value to be stored. */
  @SerializedName("payload")
  String payload;

  @SerializedName("scope")
  Scope scope;

  /** Create or replace a secret in the secret store. */
  public static Secret create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create or replace a secret in the secret store. */
  public static Secret create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** Create or replace a secret in the secret store. */
  public static Secret create(SecretCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create or replace a secret in the secret store. */
  public static Secret create(SecretCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** Deletes a secret from the secret store by name and scope. */
  public static Secret deleteWhere(Map<String, Object> params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }

  /** Deletes a secret from the secret store by name and scope. */
  public static Secret deleteWhere(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/delete";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** Deletes a secret from the secret store by name and scope. */
  public static Secret deleteWhere(SecretDeleteWhereParams params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }

  /** Deletes a secret from the secret store by name and scope. */
  public static Secret deleteWhere(SecretDeleteWhereParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/delete";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** Finds a secret in the secret store by name and scope. */
  public static Secret find(Map<String, Object> params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a secret in the secret store by name and scope. */
  public static Secret find(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/find";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** Finds a secret in the secret store by name and scope. */
  public static Secret find(SecretFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a secret in the secret store by name and scope. */
  public static Secret find(SecretFindParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets/find";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Secret.class);
  }

  /** List all secrets stored on the given scope. */
  public static SecretCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all secrets stored on the given scope. */
  public static SecretCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SecretCollection.class);
  }

  /** List all secrets stored on the given scope. */
  public static SecretCollection list(SecretListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List all secrets stored on the given scope. */
  public static SecretCollection list(SecretListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/secrets";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SecretCollection.class);
  }

  /**
   * For more details about Scope, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Scope extends StripeObject {
    /**
     * The secret scope type.
     *
     * <p>One of {@code account}, or {@code user}.
     */
    @SerializedName("type")
    String type;

    /** The user ID, if type is set to &quot;user&quot;. */
    @SerializedName("user")
    String user;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(scope, responseGetter);
  }
}
