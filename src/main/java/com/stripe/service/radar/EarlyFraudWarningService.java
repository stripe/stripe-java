// File generated from our OpenAPI spec
package com.stripe.service.radar;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.radar.EarlyFraudWarning;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.radar.EarlyFraudWarningListParams;
import com.stripe.param.radar.EarlyFraudWarningRetrieveParams;

public final class EarlyFraudWarningService extends ApiService {
  public EarlyFraudWarningService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of early fraud warnings. */
  public StripeCollection<EarlyFraudWarning> list(EarlyFraudWarningListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of early fraud warnings. */
  public StripeCollection<EarlyFraudWarning> list(RequestOptions options) throws StripeException {
    return list((EarlyFraudWarningListParams) null, options);
  }
  /** Returns a list of early fraud warnings. */
  public StripeCollection<EarlyFraudWarning> list() throws StripeException {
    return list((EarlyFraudWarningListParams) null, (RequestOptions) null);
  }
  /** Returns a list of early fraud warnings. */
  public StripeCollection<EarlyFraudWarning> list(
      EarlyFraudWarningListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/radar/early_fraud_warnings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<EarlyFraudWarning>>() {}.getType());
  }
  /**
   * Retrieves the details of an early fraud warning that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#early_fraud_warning_object">early
   * fraud warning</a> object reference for more details.
   */
  public EarlyFraudWarning retrieve(
      String earlyFraudWarning, EarlyFraudWarningRetrieveParams params) throws StripeException {
    return retrieve(earlyFraudWarning, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an early fraud warning that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#early_fraud_warning_object">early
   * fraud warning</a> object reference for more details.
   */
  public EarlyFraudWarning retrieve(String earlyFraudWarning, RequestOptions options)
      throws StripeException {
    return retrieve(earlyFraudWarning, (EarlyFraudWarningRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an early fraud warning that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#early_fraud_warning_object">early
   * fraud warning</a> object reference for more details.
   */
  public EarlyFraudWarning retrieve(String earlyFraudWarning) throws StripeException {
    return retrieve(
        earlyFraudWarning, (EarlyFraudWarningRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an early fraud warning that has previously been created.
   *
   * <p>Please refer to the <a href="https://stripe.com/docs/api#early_fraud_warning_object">early
   * fraud warning</a> object reference for more details.
   */
  public EarlyFraudWarning retrieve(
      String earlyFraudWarning, EarlyFraudWarningRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/radar/early_fraud_warnings/%s", ApiResource.urlEncodeId(earlyFraudWarning));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.withAddedUsage("stripe_client");
    return getResponseGetter().request(request, EarlyFraudWarning.class);
  }
}
