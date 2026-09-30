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
   * Returns a list of app installs. An app developer filtering by its own app with its own key sees
   * that app’s installs across the accounts that installed it. An app developer acting on a
   * connected account through {@code Stripe-Account} and filtering by its app sees that account’s
   * installs of the app, and an embedding platform acting on a connected account sees only the
   * installs it created there. Other callers see the installs on their own account. A live key
   * lists live installs and a test key lists test installs; the key of an app’s managed sandbox
   * filtering by {@code app} lists that app’s installs across every sandbox.
   */
  public StripeCollection<Install> list(InstallListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of app installs. An app developer filtering by its own app with its own key sees
   * that app’s installs across the accounts that installed it. An app developer acting on a
   * connected account through {@code Stripe-Account} and filtering by its app sees that account’s
   * installs of the app, and an embedding platform acting on a connected account sees only the
   * installs it created there. Other callers see the installs on their own account. A live key
   * lists live installs and a test key lists test installs; the key of an app’s managed sandbox
   * filtering by {@code app} lists that app’s installs across every sandbox.
   */
  public StripeCollection<Install> list(RequestOptions options) throws StripeException {
    return list((InstallListParams) null, options);
  }
  /**
   * Returns a list of app installs. An app developer filtering by its own app with its own key sees
   * that app’s installs across the accounts that installed it. An app developer acting on a
   * connected account through {@code Stripe-Account} and filtering by its app sees that account’s
   * installs of the app, and an embedding platform acting on a connected account sees only the
   * installs it created there. Other callers see the installs on their own account. A live key
   * lists live installs and a test key lists test installs; the key of an app’s managed sandbox
   * filtering by {@code app} lists that app’s installs across every sandbox.
   */
  public StripeCollection<Install> list() throws StripeException {
    return list((InstallListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of app installs. An app developer filtering by its own app with its own key sees
   * that app’s installs across the accounts that installed it. An app developer acting on a
   * connected account through {@code Stripe-Account} and filtering by its app sees that account’s
   * installs of the app, and an embedding platform acting on a connected account sees only the
   * installs it created there. Other callers see the installs on their own account. A live key
   * lists live installs and a test key lists test installs; the key of an app’s managed sandbox
   * filtering by {@code app} lists that app’s installs across every sandbox.
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
   * testing installs are made from the Dashboard. An app developer acting on a connected account
   * through {@code Stripe-Account} installs or reinstalls its app there, and an embedding platform
   * can do the same once the app’s developer approves its request to embed the app. For a private
   * app, creating an install installs the newest completed upload; when that version is already
   * installed with nothing pending, the existing install is returned.
   */
  public Install create(InstallCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an app install. An account installs its own private app with its own key; public and
   * testing installs are made from the Dashboard. An app developer acting on a connected account
   * through {@code Stripe-Account} installs or reinstalls its app there, and an embedding platform
   * can do the same once the app’s developer approves its request to embed the app. For a private
   * app, creating an install installs the newest completed upload; when that version is already
   * installed with nothing pending, the existing install is returned.
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
   * entries, and endpoints that the version being installed requests. An account reauthorizes its
   * own installs on any channel with its own key, which grants all of that access, so only give
   * {@code app_install_write} to keys that may approve an app’s access. App developers and
   * embedding platforms reauthorize installs on connected accounts through {@code Stripe-Account}.
   * An app developer can’t grant new access. An embedding platform can grant new access only once
   * the app’s developer approves its request to embed the app. For private apps, the version being
   * installed is the newest completed upload.
   */
  public Install update(String id, InstallUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the version being installed requests. An account reauthorizes its
   * own installs on any channel with its own key, which grants all of that access, so only give
   * {@code app_install_write} to keys that may approve an app’s access. App developers and
   * embedding platforms reauthorize installs on connected accounts through {@code Stripe-Account}.
   * An app developer can’t grant new access. An embedding platform can grant new access only once
   * the app’s developer approves its request to embed the app. For private apps, the version being
   * installed is the newest completed upload.
   */
  public Install update(String id, RequestOptions options) throws StripeException {
    return update(id, (InstallUpdateParams) null, options);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the version being installed requests. An account reauthorizes its
   * own installs on any channel with its own key, which grants all of that access, so only give
   * {@code app_install_write} to keys that may approve an app’s access. App developers and
   * embedding platforms reauthorize installs on connected accounts through {@code Stripe-Account}.
   * An app developer can’t grant new access. An embedding platform can grant new access only once
   * the app’s developer approves its request to embed the app. For private apps, the version being
   * installed is the newest completed upload.
   */
  public Install update(String id) throws StripeException {
    return update(id, (InstallUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Reauthorizes an app install. The installer grants the permissions, content security policy
   * entries, and endpoints that the version being installed requests. An account reauthorizes its
   * own installs on any channel with its own key, which grants all of that access, so only give
   * {@code app_install_write} to keys that may approve an app’s access. App developers and
   * embedding platforms reauthorize installs on connected accounts through {@code Stripe-Account}.
   * An app developer can’t grant new access. An embedding platform can grant new access only once
   * the app’s developer approves its request to embed the app. For private apps, the version being
   * installed is the newest completed upload.
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
