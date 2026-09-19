// File generated from our OpenAPI spec
package com.stripe.service.capital;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.capital.FinancingOffer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.capital.FinancingOfferListParams;
import com.stripe.param.capital.FinancingOfferMarkDeliveredParams;
import com.stripe.param.capital.FinancingOfferRetrieveParams;

public final class FinancingOfferService extends ApiService {
  public FinancingOfferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public StripeCollection<FinancingOffer> list(FinancingOfferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public StripeCollection<FinancingOffer> list(RequestOptions options) throws StripeException {
    return list((FinancingOfferListParams) null, options);
  }
  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public StripeCollection<FinancingOffer> list() throws StripeException {
    return list((FinancingOfferListParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the financing offers available for Connected accounts that belong to your platform.
   */
  public StripeCollection<FinancingOffer> list(
      FinancingOfferListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/capital/financing_offers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FinancingOffer>>() {}.getType());
  }
  /** Get the details of the financing offer. */
  public FinancingOffer retrieve(String id, FinancingOfferRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Get the details of the financing offer. */
  public FinancingOffer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FinancingOfferRetrieveParams) null, options);
  }
  /** Get the details of the financing offer. */
  public FinancingOffer retrieve(String id) throws StripeException {
    return retrieve(id, (FinancingOfferRetrieveParams) null, (RequestOptions) null);
  }
  /** Get the details of the financing offer. */
  public FinancingOffer retrieve(
      String id, FinancingOfferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/capital/financing_offers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancingOffer.class);
  }
  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(String id, FinancingOfferMarkDeliveredParams params)
      throws StripeException {
    return markDelivered(id, params, (RequestOptions) null);
  }
  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(String id, RequestOptions options) throws StripeException {
    return markDelivered(id, (FinancingOfferMarkDeliveredParams) null, options);
  }
  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(String id) throws StripeException {
    return markDelivered(id, (FinancingOfferMarkDeliveredParams) null, (RequestOptions) null);
  }
  /**
   * Acknowledges that platform has received and delivered the financing_offer to the intended
   * merchant recipient.
   */
  public FinancingOffer markDelivered(
      String id, FinancingOfferMarkDeliveredParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/capital/financing_offers/%s/mark_delivered", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancingOffer.class);
  }
}
