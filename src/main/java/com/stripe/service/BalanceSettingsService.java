// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.BalanceSettings;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BalanceSettingsRetrieveParams;
import com.stripe.param.BalanceSettingsUpdateParams;

public final class BalanceSettingsService extends ApiService {
  public BalanceSettingsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings retrieve(BalanceSettingsRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }
  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings retrieve(RequestOptions options) throws StripeException {
    return retrieve((BalanceSettingsRetrieveParams) null, options);
  }
  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings retrieve() throws StripeException {
    return retrieve((BalanceSettingsRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings retrieve(BalanceSettingsRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BalanceSettings.class);
  }
  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings update(BalanceSettingsUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }
  /**
   * Updates balance settings for a given connected account. Related guide: <a
   * href="https://stripe.com/connect/authentication">Making API calls for connected accounts</a>
   */
  public BalanceSettings update(BalanceSettingsUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/balance_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BalanceSettings.class);
  }
}
