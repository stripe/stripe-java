// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyCanceledException;
import com.stripe.exception.InsufficientFundsException;
import com.stripe.exception.NotCancelableException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.OutboundTransfer;
import com.stripe.model.v2.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.OutboundTransferCreateParams;
import com.stripe.param.v2.moneymanagement.OutboundTransferListParams;

public final class OutboundTransferService extends ApiService {
  public OutboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Cancels an OutboundTransfer. Only processing OutboundTransfers can be canceled. */
  public OutboundTransfer cancel(String id)
      throws StripeException, AlreadyCanceledException, NotCancelableException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels an OutboundTransfer. Only processing OutboundTransfers can be canceled. */
  public OutboundTransfer cancel(String id, RequestOptions options)
      throws StripeException, AlreadyCanceledException, NotCancelableException {
    String path =
        String.format(
            "/v2/money_management/outbound_transfers/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, OutboundTransfer.class);
  }
  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params)
      throws StripeException, InsufficientFundsException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params, RequestOptions options)
      throws StripeException, InsufficientFundsException {
    String path = "/v2/money_management/outbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
  /** Returns a list of OutboundTransfers that match the provided filters. */
  public StripeCollection<OutboundTransfer> list(OutboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of OutboundTransfers that match the provided filters. */
  public StripeCollection<OutboundTransfer> list(RequestOptions options) throws StripeException {
    return list((OutboundTransferListParams) null, options);
  }
  /** Returns a list of OutboundTransfers that match the provided filters. */
  public StripeCollection<OutboundTransfer> list() throws StripeException {
    return list((OutboundTransferListParams) null, (RequestOptions) null);
  }
  /** Returns a list of OutboundTransfers that match the provided filters. */
  public StripeCollection<OutboundTransfer> list(
      OutboundTransferListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/outbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OutboundTransfer>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundPayment create or list response.
   */
  public OutboundTransfer retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundPayment create or list response.
   */
  public OutboundTransfer retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/outbound_transfers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OutboundTransfer.class);
  }
}
