// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.OutboundTransfer;
import com.stripe.net.ApiMode;
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

  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates an OutboundTransfer. */
  public OutboundTransfer create(OutboundTransferCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/treasury/outbound_transfers";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            OutboundTransfer.class,
            options,
            ApiMode.V1);
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<OutboundTransfer>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String outboundTransfer, OutboundTransferRetrieveParams params)
      throws StripeException {
    return retrieve(outboundTransfer, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return retrieve(outboundTransfer, (OutboundTransferRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(String outboundTransfer) throws StripeException {
    return retrieve(outboundTransfer, (OutboundTransferRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID
   * from either the OutboundTransfer creation request or OutboundTransfer list.
   */
  public OutboundTransfer retrieve(
      String outboundTransfer, OutboundTransferRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s", ApiResource.urlEncodeId(outboundTransfer));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            OutboundTransfer.class,
            options,
            ApiMode.V1);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String outboundTransfer, OutboundTransferCancelParams params)
      throws StripeException {
    return cancel(outboundTransfer, params, (RequestOptions) null);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String outboundTransfer, RequestOptions options)
      throws StripeException {
    return cancel(outboundTransfer, (OutboundTransferCancelParams) null, options);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(String outboundTransfer) throws StripeException {
    return cancel(outboundTransfer, (OutboundTransferCancelParams) null, (RequestOptions) null);
  }
  /** An OutboundTransfer can be canceled if the funds have not yet been paid out. */
  public OutboundTransfer cancel(
      String outboundTransfer, OutboundTransferCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/treasury/outbound_transfers/%s/cancel", ApiResource.urlEncodeId(outboundTransfer));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            OutboundTransfer.class,
            options,
            ApiMode.V1);
  }
}
