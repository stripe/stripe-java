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
  public OutboundTransfer update(String id, OutboundTransferUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must
   * not be cancelable, and cannot be in the {@code canceled} or {@code failed} states.
   */
  public OutboundTransfer update(
      String id, OutboundTransferUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s", ApiResource.urlEncodeId(id));
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
  public OutboundTransfer fail(String id, OutboundTransferFailParams params)
      throws StripeException {
    return fail(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String id, RequestOptions options) throws StripeException {
    return fail(id, (OutboundTransferFailParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String id) throws StripeException {
    return fail(id, (OutboundTransferFailParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code failed} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer fail(String id, OutboundTransferFailParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/fail", ApiResource.urlEncodeId(id));
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
  public OutboundTransfer post(String id, OutboundTransferPostParams params)
      throws StripeException {
    return post(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String id, RequestOptions options) throws StripeException {
    return post(id, (OutboundTransferPostParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String id) throws StripeException {
    return post(id, (OutboundTransferPostParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code posted} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer post(String id, OutboundTransferPostParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/post", ApiResource.urlEncodeId(id));
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
      String id, OutboundTransferReturnOutboundTransferParams params) throws StripeException {
    return returnOutboundTransfer(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(String id, RequestOptions options)
      throws StripeException {
    return returnOutboundTransfer(id, (OutboundTransferReturnOutboundTransferParams) null, options);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(String id) throws StripeException {
    return returnOutboundTransfer(
        id, (OutboundTransferReturnOutboundTransferParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created OutboundTransfer to the {@code returned} status. The
   * OutboundTransfer must already be in the {@code processing} state.
   */
  public OutboundTransfer returnOutboundTransfer(
      String id, OutboundTransferReturnOutboundTransferParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/outbound_transfers/%s/return", ApiResource.urlEncodeId(id));
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
