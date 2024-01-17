// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.InboundTransfer;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.InboundTransferCancelParams;
import com.stripe.param.treasury.InboundTransferCreateParams;
import com.stripe.param.treasury.InboundTransferListParams;
import com.stripe.param.treasury.InboundTransferRetrieveParams;

public final class InboundTransferService extends ApiService {
  public InboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public StripeCollection<InboundTransfer> list(InboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of InboundTransfers sent from the specified FinancialAccount. */
  public StripeCollection<InboundTransfer> list(
      InboundTransferListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/inbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<InboundTransfer>>() {}.getType());
  }
  /** Creates an InboundTransfer. */
  public InboundTransfer create(InboundTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an InboundTransfer. */
  public InboundTransfer create(InboundTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/inbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, InboundTransfer.class);
  }
  /** Retrieves the details of an existing InboundTransfer. */
  public InboundTransfer retrieve(String id, InboundTransferRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves the details of an existing InboundTransfer. */
  public InboundTransfer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (InboundTransferRetrieveParams) null, options);
  }
  /** Retrieves the details of an existing InboundTransfer. */
  public InboundTransfer retrieve(String id) throws StripeException {
    return retrieve(id, (InboundTransferRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the details of an existing InboundTransfer. */
  public InboundTransfer retrieve(
      String id, InboundTransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/inbound_transfers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, InboundTransfer.class);
  }
  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(String inboundTransfer, InboundTransferCancelParams params)
      throws StripeException {
    return cancel(inboundTransfer, params, (RequestOptions) null);
  }
  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(String inboundTransfer, RequestOptions options)
      throws StripeException {
    return cancel(inboundTransfer, (InboundTransferCancelParams) null, options);
  }
  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(String inboundTransfer) throws StripeException {
    return cancel(inboundTransfer, (InboundTransferCancelParams) null, (RequestOptions) null);
  }
  /** Cancels an InboundTransfer. */
  public InboundTransfer cancel(
      String inboundTransfer, InboundTransferCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/inbound_transfers/%s/cancel", ApiResource.urlEncodeId(inboundTransfer));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, InboundTransfer.class);
  }
}
