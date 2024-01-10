// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.ApplicationFee;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.ApplicationFeeListParams;
import com.stripe.param.ApplicationFeeRetrieveParams;

public final class ApplicationFeeService extends ApiService {
  public ApplicationFeeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public StripeCollection<ApplicationFee> list(ApplicationFeeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public StripeCollection<ApplicationFee> list(RequestOptions options) throws StripeException {
    return list((ApplicationFeeListParams) null, options);
  }
  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public StripeCollection<ApplicationFee> list() throws StripeException {
    return list((ApplicationFeeListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of application fees you’ve previously collected. The application fees are
   * returned in sorted order, with the most recent fees appearing first.
   */
  public StripeCollection<ApplicationFee> list(
      ApplicationFeeListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/application_fees";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<ApplicationFee>>() {}.getType());
  }
  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public ApplicationFee retrieve(String id, ApplicationFeeRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public ApplicationFee retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ApplicationFeeRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public ApplicationFee retrieve(String id) throws StripeException {
    return retrieve(id, (ApplicationFeeRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an application fee that your account has collected. The same
   * information is returned when refunding the application fee.
   */
  public ApplicationFee retrieve(
      String id, ApplicationFeeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/application_fees/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, ApplicationFee.class);
  }

  public com.stripe.service.FeeRefundService feeRefunds() {
    return new com.stripe.service.FeeRefundService(this.getResponseGetter());
  }
}
