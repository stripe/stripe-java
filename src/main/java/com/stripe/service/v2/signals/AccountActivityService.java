// File generated from our OpenAPI spec
package com.stripe.service.v2.signals;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.DeletedObject;
import com.stripe.model.v2.signals.AccountActivity;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.signals.AccountActivityCreateParams;

public final class AccountActivityService extends ApiService {
  public AccountActivityService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Creates a new account activity to report account registration, login, or evaluation follow-up
   * activity.
   */
  public AccountActivity create(AccountActivityCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates a new account activity to report account registration, login, or evaluation follow-up
   * activity.
   */
  public AccountActivity create(AccountActivityCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/signals/account_activity";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, AccountActivity.class);
  }
  /** Deletes an AccountActivity by its ID. */
  public DeletedObject delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Deletes an AccountActivity by its ID. */
  public DeletedObject delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/signals/account_activity/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, DeletedObject.class);
  }
  /** Retrieves an AccountActivity by its ID. */
  public AccountActivity retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an AccountActivity by its ID. */
  public AccountActivity retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/signals/account_activity/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, AccountActivity.class);
  }
}
