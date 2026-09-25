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
import com.stripe.param.apps.InstallCreateParams;
import com.stripe.param.apps.InstallListParams;
import com.stripe.param.apps.InstallRetrieveParams;
import com.stripe.param.apps.InstallUninstallParams;
import com.stripe.param.apps.InstallUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An app install represents a Stripe App that is installed on an account. It reports the
 * permissions, content security policy entries, and endpoints that the installing account has
 * authorized, along with any that the app's latest version requests but the account has not
 * authorized yet. Use the Install API to install, reauthorize, and uninstall apps, and to check the
 * state of existing installs.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Install extends ApiResource implements HasId {
  /** The ID of the account that the app install belongs to. */
  @SerializedName("account")
  String account;

  /** The ID of the app installed. */
  @SerializedName("app")
  String app;

  /**
   * Whether the installer must authorize pending permissions, content security policy entries, or
   * endpoints. For private apps, {@code approval_required} stays {@code false}. Install a new
   * version from the Dashboard to grant its permissions.
   */
  @SerializedName("approval_required")
  Boolean approvalRequired;

  /** The authorization code for an oauth app install. */
  @SerializedName("auth_code")
  String authCode;

  /**
   * The distribution channel associated with the app install.
   *
   * <p>One of {@code private_live}, {@code private_test}, {@code public}, {@code review}, or {@code
   * testing}.
   */
  @SerializedName("channel")
  String channel;

  @SerializedName("content_security_policy_granted")
  ContentSecurityPolicyGranted contentSecurityPolicyGranted;

  @SerializedName("content_security_policy_pending")
  ContentSecurityPolicyPending contentSecurityPolicyPending;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The ID of the embedding platform that created the install, if applicable. */
  @SerializedName("created_by")
  String createdBy;

  /** The endpoint URLs authorized by the installer. */
  @SerializedName("endpoints_granted")
  List<String> endpointsGranted;

  /**
   * The endpoint URLs requested by the latest app version that the installer has not authorized.
   */
  @SerializedName("endpoints_pending")
  List<String> endpointsPending;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code apps.install}.
   */
  @SerializedName("object")
  String object;

  /** The permissions authorized by the installer. */
  @SerializedName("permissions_granted")
  List<String> permissionsGranted;

  /** The permissions requested by the latest app version that the installer has not authorized. */
  @SerializedName("permissions_pending")
  List<String> permissionsPending;

  /**
   * The status of the app install.
   *
   * <p>One of {@code install_failed}, {@code installed}, {@code installing}, {@code
   * uninstall_failed}, or {@code uninstalling}.
   */
  @SerializedName("status")
  String status;

  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public static Install create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public static Install create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/installs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, Install.class);
  }

  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public static Install create(InstallCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public static Install create(InstallCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/installs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Install.class);
  }

  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public static InstallCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public static InstallCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/installs";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InstallCollection.class);
  }

  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public static InstallCollection list(InstallListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public static InstallCollection list(InstallListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/installs";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InstallCollection.class);
  }

  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public static Install retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public static Install retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public static Install retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Install.class);
  }

  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public static Install retrieve(String id, InstallRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Install.class);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall() throws StripeException {
    return uninstall((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(RequestOptions options) throws StripeException {
    return uninstall((Map<String, Object>) null, options);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(Map<String, Object> params) throws StripeException {
    return uninstall(params, (RequestOptions) null);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/apps/installs/%s/uninstall", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Install.class);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(InstallUninstallParams params) throws StripeException {
    return uninstall(params, (RequestOptions) null);
  }

  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(InstallUninstallParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/apps/installs/%s/uninstall", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Install.class);
  }

  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, Install.class);
  }

  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(InstallUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(InstallUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Install.class);
  }

  /**
   * For more details about ContentSecurityPolicyGranted, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContentSecurityPolicyGranted extends StripeObject {
    /** The URLs that the app can make network requests to. */
    @SerializedName("connect_src")
    List<String> connectSrc;

    /** The URLs that the app can load images from. */
    @SerializedName("image_src")
    List<String> imageSrc;
  }

  /**
   * For more details about ContentSecurityPolicyPending, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContentSecurityPolicyPending extends StripeObject {
    /** The URLs that the app can make network requests to. */
    @SerializedName("connect_src")
    List<String> connectSrc;

    /** The URLs that the app can load images from. */
    @SerializedName("image_src")
    List<String> imageSrc;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(contentSecurityPolicyGranted, responseGetter);
    trySetResponseGetter(contentSecurityPolicyPending, responseGetter);
  }
}
