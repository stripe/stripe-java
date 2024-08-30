// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.Topup;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TopupCancelParams;
import com.stripe.param.TopupCreateParams;
import com.stripe.param.TopupListParams;
import com.stripe.param.TopupRetrieveParams;
import com.stripe.param.TopupUpdateParams;

public final class TopupService extends ApiService {
  public TopupService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of top-ups. */
  public StripeCollection<Topup> list(TopupListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of top-ups. */
  public StripeCollection<Topup> list(RequestOptions options) throws StripeException {
    return list((TopupListParams) null, options);
  }
  /** Returns a list of top-ups. */
  public StripeCollection<Topup> list() throws StripeException {
    return list((TopupListParams) null, (RequestOptions) null);
  }
  /** Returns a list of top-ups. */
  public StripeCollection<Topup> list(TopupListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/topups";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Topup>>() {}.getType());
  }
  /** Top up the balance of an account. */
  public Topup create(TopupCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Top up the balance of an account. */
  public Topup create(TopupCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/topups";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Topup.class);
  }
  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public Topup retrieve(String topup, TopupRetrieveParams params) throws StripeException {
    return retrieve(topup, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public Topup retrieve(String topup, RequestOptions options) throws StripeException {
    return retrieve(topup, (TopupRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public Topup retrieve(String topup) throws StripeException {
    return retrieve(topup, (TopupRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public Topup retrieve(String topup, TopupRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(topup));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Topup.class);
  }
  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(String topup, TopupUpdateParams params) throws StripeException {
    return update(topup, params, (RequestOptions) null);
  }
  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(String topup, RequestOptions options) throws StripeException {
    return update(topup, (TopupUpdateParams) null, options);
  }
  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(String topup) throws StripeException {
    return update(topup, (TopupUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(String topup, TopupUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(topup));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Topup.class);
  }
  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(String topup, TopupCancelParams params) throws StripeException {
    return cancel(topup, params, (RequestOptions) null);
  }
  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(String topup, RequestOptions options) throws StripeException {
    return cancel(topup, (TopupCancelParams) null, options);
  }
  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(String topup) throws StripeException {
    return cancel(topup, (TopupCancelParams) null, (RequestOptions) null);
  }
  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(String topup, TopupCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/topups/%s/cancel", ApiResource.urlEncodeId(topup));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Topup.class);
  }
}
