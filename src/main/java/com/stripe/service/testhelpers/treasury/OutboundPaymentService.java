// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.OutboundPayment;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundPaymentFailParams;
import com.stripe.param.treasury.OutboundPaymentPostParams;
import com.stripe.param.treasury.OutboundPaymentReturnOutboundPaymentParams;

public final class OutboundPaymentService extends ApiService {
  public OutboundPaymentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Transitions a test mode created OutboundPayment to the {@code failed} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment fail(String id, OutboundPaymentFailParams params) throws StripeException {
    return fail(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code failed} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment fail(String id, RequestOptions options) throws StripeException {
    return fail(id, (OutboundPaymentFailParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code failed} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment fail(String id) throws StripeException {
    return fail(id, (OutboundPaymentFailParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code failed} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment fail(String id, OutboundPaymentFailParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_payments/%s/fail", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, OutboundPayment.class);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code posted} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment post(String id, OutboundPaymentPostParams params) throws StripeException {
    return post(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code posted} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment post(String id, RequestOptions options) throws StripeException {
    return post(id, (OutboundPaymentPostParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code posted} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment post(String id) throws StripeException {
    return post(id, (OutboundPaymentPostParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code posted} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment post(String id, OutboundPaymentPostParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_payments/%s/post", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, OutboundPayment.class);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code returned} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment returnOutboundPayment(
      String id, OutboundPaymentReturnOutboundPaymentParams params) throws StripeException {
    return returnOutboundPayment(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code returned} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment returnOutboundPayment(String id, RequestOptions options)
      throws StripeException {
    return returnOutboundPayment(id, (OutboundPaymentReturnOutboundPaymentParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code returned} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment returnOutboundPayment(String id) throws StripeException {
    return returnOutboundPayment(
        id, (OutboundPaymentReturnOutboundPaymentParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundPayment to the {@code returned} status. The
   * OutboundPayment must already be in the {@code processing} state.
   */
  public OutboundPayment returnOutboundPayment(
      String id, OutboundPaymentReturnOutboundPaymentParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_payments/%s/return", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, OutboundPayment.class);
  }
}
