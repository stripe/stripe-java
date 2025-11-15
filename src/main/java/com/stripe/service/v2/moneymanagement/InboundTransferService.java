// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.BlockedByStripeException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.InboundTransfer;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.InboundTransferCreateParams;
import com.stripe.param.v2.moneymanagement.InboundTransferListParams;

public final class InboundTransferService extends ApiService {
  public InboundTransferService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of InboundTransfers. */
  public StripeCollection<InboundTransfer> list(InboundTransferListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of InboundTransfers. */
  public StripeCollection<InboundTransfer> list(RequestOptions options) throws StripeException {
    return list((InboundTransferListParams) null, options);
  }
  /** Retrieves a list of InboundTransfers. */
  public StripeCollection<InboundTransfer> list() throws StripeException {
    return list((InboundTransferListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of InboundTransfers. */
  public StripeCollection<InboundTransfer> list(
      InboundTransferListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/inbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<InboundTransfer>>() {}.getType());
  }
  /** InboundTransfers APIs are used to create, retrieve or list InboundTransfers. */
  public InboundTransfer create(InboundTransferCreateParams params)
      throws StripeException, BlockedByStripeException {
    return create(params, (RequestOptions) null);
  }
  /** InboundTransfers APIs are used to create, retrieve or list InboundTransfers. */
  public InboundTransfer create(InboundTransferCreateParams params, RequestOptions options)
      throws StripeException, BlockedByStripeException {
    String path = "/v2/money_management/inbound_transfers";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, InboundTransfer.class);
  }
  /** Retrieve an InboundTransfer by ID. */
  public InboundTransfer retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an InboundTransfer by ID. */
  public InboundTransfer retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/inbound_transfers/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, InboundTransfer.class);
  }
}
