// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PaymentLinkListParams;
import com.stripe.param.PaymentLinkRetrieveParams;
import com.stripe.param.PaymentLinkUpdateParams;

public final class PaymentLinkService extends ApiService {
  public PaymentLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(PaymentLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(RequestOptions options) throws StripeException {
    return list((PaymentLinkListParams) null, options);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list() throws StripeException {
    return list((PaymentLinkListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(PaymentLinkListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PaymentLink>>() {}.getType());
  }
  /** Creates a payment link. */
  public PaymentLink create(PaymentLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a payment link. */
  public PaymentLink create(PaymentLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLink.class);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String id, PaymentLinkRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PaymentLinkRetrieveParams) null, options);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String id) throws StripeException {
    return retrieve(id, (PaymentLinkRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String id, PaymentLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLink.class);
  }
  /** Updates a payment link. */
  public PaymentLink update(String id, PaymentLinkUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates a payment link. */
  public PaymentLink update(String id, RequestOptions options) throws StripeException {
    return update(id, (PaymentLinkUpdateParams) null, options);
  }
  /** Updates a payment link. */
  public PaymentLink update(String id) throws StripeException {
    return update(id, (PaymentLinkUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a payment link. */
  public PaymentLink update(String id, PaymentLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PaymentLink.class);
  }

  public com.stripe.service.PaymentLinkLineItemService lineItems() {
    return new com.stripe.service.PaymentLinkLineItemService(this.getResponseGetter());
  }
}
