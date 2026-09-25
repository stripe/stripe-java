// File generated from our OpenAPI spec
package com.stripe.service.apps;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.apps.Install;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.apps.InstallCreateParams;
import com.stripe.param.apps.InstallListParams;
import com.stripe.param.apps.InstallRetrieveParams;
import com.stripe.param.apps.InstallUninstallParams;
import com.stripe.param.apps.InstallUpdateParams;

public final class InstallService extends ApiService {
  public InstallService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public StripeCollection<Install> list(InstallListParams params) throws StripeException {
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
  public StripeCollection<Install> list(RequestOptions options) throws StripeException {
    return list((InstallListParams) null, options);
  }
  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public StripeCollection<Install> list() throws StripeException {
    return list((InstallListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of app installs. An app developer or embedding platform filtering by its own app
   * sees the installs across the accounts that installed it; other callers see the installs on
   * their own account. The key selects the environment: a live key lists live installs, a sandbox
   * API key lists the installs on that sandbox, and the key of an app’s managed sandbox filtering
   * by {@code app} lists that app’s installs across every sandbox. For existing accounts that still
   * use legacy test mode, a test mode key lists legacy test mode installs.
   */
  public StripeCollection<Install> list(InstallListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apps/installs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Install>>() {}.getType());
  }
  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public Install create(InstallCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer or embedding platform acting on
   * a connected account through {@code Stripe-Account} installs or reinstalls its app there.
   * Creating an install for a private app that is already installed at the channel’s current
   * version with nothing pending returns the existing install.
   */
  public Install create(InstallCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apps/installs";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Install.class);
  }
  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public Install retrieve(String id, InstallRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public Install retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (InstallRetrieveParams) null, options);
  }
  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public Install retrieve(String id) throws StripeException {
    return retrieve(id, (InstallRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves an app install. The installing account, the app’s developer (with the keys of the
   * account that owns the app or of the app’s managed sandbox), and the embedding platform that
   * created the install can retrieve it.
   */
  public Install retrieve(String id, InstallRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Install.class);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(String id, InstallUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(String id, RequestOptions options) throws StripeException {
    return update(id, (InstallUpdateParams) null, options);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(String id) throws StripeException {
    return update(id, (InstallUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the latest published version of the app requests. An account
   * reauthorizes its own installs on any channel with its own key; app developers and embedding
   * platforms reauthorize installs on connected accounts through {@code Stripe-Account}. For
   * private apps, install a new version from the Dashboard to grant its permissions.
   */
  public Install update(String id, InstallUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apps/installs/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Install.class);
  }
  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(String id, InstallUninstallParams params) throws StripeException {
    return uninstall(id, params, (RequestOptions) null);
  }
  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(String id, RequestOptions options) throws StripeException {
    return uninstall(id, (InstallUninstallParams) null, options);
  }
  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(String id) throws StripeException {
    return uninstall(id, (InstallUninstallParams) null, (RequestOptions) null);
  }
  /** Uninstalls an app from the account that installed it. */
  public Install uninstall(String id, InstallUninstallParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apps/installs/%s/uninstall", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Install.class);
  }
}
