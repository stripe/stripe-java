// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.StripeCollection;
import com.stripe.model.StripeSearchResult;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ChargeCaptureParams;
import com.stripe.param.ChargeCreateParams;
import com.stripe.param.ChargeListParams;
import com.stripe.param.ChargeRetrieveParams;
import com.stripe.param.ChargeSearchParams;
import com.stripe.param.ChargeUpdateParams;

public final class ChargeService extends ApiService {
  public ChargeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(ChargeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(RequestOptions options) throws StripeException {
    return list((ChargeListParams) null, options);
  }
  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list() throws StripeException {
    return list((ChargeListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of charges you’ve previously created. The charges are returned in sorted order,
   * with the most recent charges appearing first.
   */
  public StripeCollection<Charge> list(ChargeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Charge>>() {}.getType());
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge create(ChargeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge create(RequestOptions options) throws StripeException {
    return create((ChargeCreateParams) null, options);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge create() throws StripeException {
    return create((ChargeCreateParams) null, (RequestOptions) null);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge create(ChargeCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/charges";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Charge.class);
  }
  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String id, ChargeRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ChargeRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String id) throws StripeException {
    return retrieve(id, (ChargeRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of a charge that has previously been created. Supply the unique charge ID
   * that was returned from your previous request, and Stripe will return the corresponding charge
   * information. The same information is returned when creating or refunding the charge.
   */
  public Charge retrieve(String id, ChargeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Charge.class);
  }
  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String id, ChargeUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String id, RequestOptions options) throws StripeException {
    return update(id, (ChargeUpdateParams) null, options);
  }
  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String id) throws StripeException {
    return update(id, (ChargeUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified charge by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   */
  public Charge update(String id, ChargeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/charges/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Charge.class);
  }
  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Charge> search(ChargeSearchParams params) throws StripeException {
    return search(params, (RequestOptions) null);
  }
  /**
   * Search for charges you’ve previously created using Stripe’s <a
   * href="https://stripe.com/docs/search#search-query-language">Search Query Language</a>. Don’t
   * use search in read-after-write flows where strict consistency is necessary. Under normal
   * operating conditions, data is searchable in less than a minute. Occasionally, propagation of
   * new or updated data can be up to an hour behind during outages. Search functionality is not
   * available to merchants in India.
   */
  public StripeSearchResult<Charge> search(ChargeSearchParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/charges/search";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeSearchResult<Charge>>() {}.getType());
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge capture(String id, ChargeCaptureParams params) throws StripeException {
    return capture(id, params, (RequestOptions) null);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge capture(String id, RequestOptions options) throws StripeException {
    return capture(id, (ChargeCaptureParams) null, options);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge capture(String id) throws StripeException {
    return capture(id, (ChargeCaptureParams) null, (RequestOptions) null);
  }
  /**
   * This method is deprecated and will be removed soon. If your integration uses it, you need to
   * update it to use a different payment flow, such as <a
   * href="https://stripe.com/docs/payments/payment-intents">the Payment Intents API</a>.
   */
  public Charge capture(String id, ChargeCaptureParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/charges/%s/capture", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Charge.class);
  }
}
