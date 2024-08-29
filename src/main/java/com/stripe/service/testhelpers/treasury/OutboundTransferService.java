// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.OutboundTransfer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundTransferFailParams;
import com.stripe.param.treasury.OutboundTransferPostParams;
import com.stripe.param.treasury.OutboundTransferReturnOutboundTransferParams;
import com.stripe.param.treasury.OutboundTransferUpdateParams;

public final class OutboundTransferService extends ApiService {
  public OutboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
   * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
   */
  public OutboundTransfer update(String outboundTransfer, OutboundTransferUpdateParams params)
      throws StripeException {
    return update(outboundTransfer, params, (RequestOptions) null);
  }
  /**
   * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
   * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
   */
  public OutboundTransfer update(
      String outboundTransfer, OutboundTransferUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s",
            ApiResource.urlEncodeId(outboundTransfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String outboundTransfer, OutboundTransferFailParams params)
      throws StripeException {
    return fail(outboundTransfer, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return fail(outboundTransfer, (OutboundTransferFailParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String outboundTransfer) throws StripeException {
    return fail(outboundTransfer, (OutboundTransferFailParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(
      String outboundTransfer, OutboundTransferFailParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/fail",
            ApiResource.urlEncodeId(outboundTransfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String outboundTransfer, OutboundTransferPostParams params)
      throws StripeException {
    return post(outboundTransfer, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return post(outboundTransfer, (OutboundTransferPostParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String outboundTransfer) throws StripeException {
    return post(outboundTransfer, (OutboundTransferPostParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(
      String outboundTransfer, OutboundTransferPostParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/post",
            ApiResource.urlEncodeId(outboundTransfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(
      String outboundTransfer, OutboundTransferReturnOutboundTransferParams params)
      throws StripeException {
    return returnOutboundTransfer(outboundTransfer, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return returnOutboundTransfer(
        outboundTransfer, (OutboundTransferReturnOutboundTransferParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(String outboundTransfer) throws StripeException {
    return returnOutboundTransfer(
        outboundTransfer,
        (OutboundTransferReturnOutboundTransferParams) null,
        (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(
      String outboundTransfer,
      OutboundTransferReturnOutboundTransferParams params,
      RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/return",
            ApiResource.urlEncodeId(outboundTransfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
}
