// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.OutboundTransfer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.OutboundTransferCancelParams;
import com.stripe.param.treasury.OutboundTransferCreateParams;
import com.stripe.param.treasury.OutboundTransferListParams;
import com.stripe.param.treasury.OutboundTransferRetrieveParams;

public final class OutboundTransferService extends ApiService {
  public OutboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public StripeCollection<OutboundTransfer> list(OutboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of OutboundTransfers sent from the specified FinancialAccount. */
  public StripeCollection<OutboundTransfer> list(
      OutboundTransferListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<OutboundTransfer>>() {}.getType());
  }
  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
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
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String id, OutboundTransferRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (OutboundTransferRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String id) throws StripeException {
    return retrieve(id, (OutboundTransferRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(
      String id, OutboundTransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/outbound_transfers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundTransfer.class);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String id, OutboundTransferCancelParams params)
      throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (OutboundTransferCancelParams) null, options);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String id) throws StripeException {
    return cancel(id, (OutboundTransferCancelParams) null, (RequestOptions) null);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(
      String id, OutboundTransferCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/treasury/outbound_transfers/%s/cancel", ApiResource.urlEncodeId(id));
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
