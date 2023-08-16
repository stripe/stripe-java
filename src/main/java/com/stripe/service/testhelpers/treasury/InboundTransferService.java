// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.treasury;

import com.stripe.exception.StripeException;
import com.stripe.model.treasury.InboundTransfer;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.InboundTransferFailParams;
import com.stripe.param.treasury.InboundTransferReturnInboundTransferParams;
import com.stripe.param.treasury.InboundTransferSucceedParams;

public final class InboundTransferService extends ApiService {
  public InboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Transitions a test mode created InboundTransfer to the {@code succeeded} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer succeed(String id, InboundTransferSucceedParams params)
      throws StripeException {
    return succeed(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code succeeded} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer succeed(String id, RequestOptions options) throws StripeException {
    return succeed(id, (InboundTransferSucceedParams) null, options);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code succeeded} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer succeed(String id) throws StripeException {
    return succeed(id, (InboundTransferSucceedParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code succeeded} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer succeed(
      String id, InboundTransferSucceedParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/inbound_transfers/%s/succeed", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InboundTransfer.class,
            options,
            ApiMode.V1);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code failed} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer fail(String id, InboundTransferFailParams params) throws StripeException {
    return fail(id, params, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code failed} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer fail(String id, RequestOptions options) throws StripeException {
    return fail(id, (InboundTransferFailParams) null, options);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code failed} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer fail(String id) throws StripeException {
    return fail(id, (InboundTransferFailParams) null, (RequestOptions) null);
  }
  /**
   * Transitions a test mode created InboundTransfer to the {@code failed} status. The
   * InboundTransfer must already be in the {@code processing} state.
   */
  public InboundTransfer fail(String id, InboundTransferFailParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/inbound_transfers/%s/fail", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InboundTransfer.class,
            options,
            ApiMode.V1);
  }
  /**
   * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
   * ReceivedDebit. The InboundTransfer must already be in the {@code succeeded} state.
   */
  public InboundTransfer returnInboundTransfer(
      String id, InboundTransferReturnInboundTransferParams params) throws StripeException {
    return returnInboundTransfer(id, params, (RequestOptions) null);
  }
  /**
   * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
   * ReceivedDebit. The InboundTransfer must already be in the {@code succeeded} state.
   */
  public InboundTransfer returnInboundTransfer(String id, RequestOptions options)
      throws StripeException {
    return returnInboundTransfer(id, (InboundTransferReturnInboundTransferParams) null, options);
  }
  /**
   * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
   * ReceivedDebit. The InboundTransfer must already be in the {@code succeeded} state.
   */
  public InboundTransfer returnInboundTransfer(String id) throws StripeException {
    return returnInboundTransfer(
        id, (InboundTransferReturnInboundTransferParams) null, (RequestOptions) null);
  }
  /**
   * Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a
   * ReceivedDebit. The InboundTransfer must already be in the {@code succeeded} state.
   */
  public InboundTransfer returnInboundTransfer(
      String id, InboundTransferReturnInboundTransferParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/treasury/inbound_transfers/%s/return", ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            InboundTransfer.class,
            options,
            ApiMode.V1);
  }
}
