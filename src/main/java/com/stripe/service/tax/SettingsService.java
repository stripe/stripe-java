// File generated from our OpenAPI spec
package com.stripe.service.tax;

import com.stripe.exception.StripeException;
import com.stripe.model.tax.Settings;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.tax.SettingsRetrieveParams;
import com.stripe.param.tax.SettingsUpdateParams;

public final class SettingsService extends ApiService {
  public SettingsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves Tax {@code Settings} for a merchant. */
  public Settings retrieve(SettingsRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /** Retrieves Tax {@code Settings} for a merchant. */
  public Settings retrieve(RequestOptions options) throws StripeException {
    return retrieve((SettingsRetrieveParams) null, options);
  }
  /** Retrieves Tax {@code Settings} for a merchant. */
  public Settings retrieve() throws StripeException {
    return retrieve((SettingsRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves Tax {@code Settings} for a merchant. */
  public Settings retrieve(SettingsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Settings.class,
            options,
            ApiMode.V1);
  }
  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public Settings update(SettingsUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }
  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public Settings update(RequestOptions options) throws StripeException {
    return update((SettingsUpdateParams) null, options);
  }
  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public Settings update() throws StripeException {
    return update((SettingsUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates Tax {@code Settings} parameters used in tax calculations. All parameters are editable
   * but none can be removed once set.
   */
  public Settings update(SettingsUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/settings";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Settings.class,
            options,
            ApiMode.V1);
  }
}
