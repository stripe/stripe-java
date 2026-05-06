// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLocation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLocationCreateParams;
import com.stripe.param.PaymentLocationRetrieveParams;
import com.stripe.param.PaymentLocationUpdateParams;

public final class PaymentLocationService extends ApiService {
  public PaymentLocationService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Delete a Payment Location. */
  public PaymentLocation delete(String id) throws StripeException {
    return delete(id, (RequestOptions) null);
  }
  /** Delete a Payment Location. */
  public PaymentLocation delete(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v1/payment_locations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, null, options);
    return this.request(request, PaymentLocation.class);
  }
  /** Retrieve a Payment Location. */
  public PaymentLocation retrieve(String id, PaymentLocationRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a Payment Location. */
  public PaymentLocation retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentLocationRetrieveParams) null, options);
  }
  /** Retrieve a Payment Location. */
  public PaymentLocation retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentLocationRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a Payment Location. */
  public PaymentLocation retrieve(
      String id, PaymentLocationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_locations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocation.class);
  }
  /** Update a Payment Location. */
  public PaymentLocation update(String id, PaymentLocationUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a Payment Location. */
  public PaymentLocation update(String id, RequestOptions options) throws StripeException {
    return update(id, (PaymentLocationUpdateParams) null, options);
  }
  /** Update a Payment Location. */
  public PaymentLocation update(String id) throws StripeException {
    return update(id, (PaymentLocationUpdateParams) null, (RequestOptions) null);
  }
  /** Update a Payment Location. */
  public PaymentLocation update(
      String id, PaymentLocationUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_locations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocation.class);
  }
  /** Create a Payment Location. */
  public PaymentLocation create(PaymentLocationCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a Payment Location. */
  public PaymentLocation create(PaymentLocationCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_locations";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLocation.class);
  }
}
