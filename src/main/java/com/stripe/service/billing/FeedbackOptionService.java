// File generated from our OpenAPI spec
package com.stripe.service.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.billing.FeedbackOption;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.FeedbackOptionCreateParams;
import com.stripe.param.billing.FeedbackOptionDeactivateParams;
import com.stripe.param.billing.FeedbackOptionListParams;
import com.stripe.param.billing.FeedbackOptionRetrieveParams;
import com.stripe.param.billing.FeedbackOptionUpdateParams;

public final class FeedbackOptionService extends ApiService {
  public FeedbackOptionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** An API method for listing the feedback options model. */
  public StripeCollection<FeedbackOption> list(FeedbackOptionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** An API method for listing the feedback options model. */
  public StripeCollection<FeedbackOption> list(RequestOptions options) throws StripeException {
    return list((FeedbackOptionListParams) null, options);
  }
  /** An API method for listing the feedback options model. */
  public StripeCollection<FeedbackOption> list() throws StripeException {
    return list((FeedbackOptionListParams) null, (RequestOptions) null);
  }
  /** An API method for listing the feedback options model. */
  public StripeCollection<FeedbackOption> list(
      FeedbackOptionListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FeedbackOption>>() {}.getType());
  }
  /** Creates a new feedback option. */
  public FeedbackOption create(FeedbackOptionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new feedback option. */
  public FeedbackOption create(FeedbackOptionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/feedback_options";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FeedbackOption.class);
  }
  /** Retrieves a feedback options object given an ID. */
  public FeedbackOption retrieve(String id, FeedbackOptionRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a feedback options object given an ID. */
  public FeedbackOption retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (FeedbackOptionRetrieveParams) null, options);
  }
  /** Retrieves a feedback options object given an ID. */
  public FeedbackOption retrieve(String id) throws StripeException {
    return retrieve(id, (FeedbackOptionRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a feedback options object given an ID. */
  public FeedbackOption retrieve(
      String id, FeedbackOptionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FeedbackOption.class);
  }
  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(String id, FeedbackOptionUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(String id, RequestOptions options) throws StripeException {
    return update(id, (FeedbackOptionUpdateParams) null, options);
  }
  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(String id) throws StripeException {
    return update(id, (FeedbackOptionUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the description of an existing feedback option. */
  public FeedbackOption update(String id, FeedbackOptionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/billing/feedback_options/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FeedbackOption.class);
  }
  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(String id, FeedbackOptionDeactivateParams params)
      throws StripeException {
    return deactivate(id, params, (RequestOptions) null);
  }
  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(String id, RequestOptions options) throws StripeException {
    return deactivate(id, (FeedbackOptionDeactivateParams) null, options);
  }
  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(String id) throws StripeException {
    return deactivate(id, (FeedbackOptionDeactivateParams) null, (RequestOptions) null);
  }
  /**
   * Deactivates a feedback option. Deactivated feedback options cannot be used in portal
   * configurations.
   */
  public FeedbackOption deactivate(
      String id, FeedbackOptionDeactivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/billing/feedback_options/%s/deactivate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FeedbackOption.class);
  }
}
