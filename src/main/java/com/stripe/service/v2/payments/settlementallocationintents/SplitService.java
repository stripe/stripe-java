// File generated from our OpenAPI spec
package com.stripe.service.v2.payments.settlementallocationintents;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.payments.SettlementAllocationIntentSplit;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.payments.settlementallocationintents.SplitCreateParams;
import com.stripe.param.v2.payments.settlementallocationintents.SplitListParams;

public final class SplitService extends ApiService {
  public SplitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List SettlementAllocationIntentSplits API. */
  public StripeCollection<SettlementAllocationIntentSplit> list(
      String settlementAllocationIntentId, SplitListParams params) throws StripeException {
    return list(settlementAllocationIntentId, params, (RequestOptions) null);
  }
  /** List SettlementAllocationIntentSplits API. */
  public StripeCollection<SettlementAllocationIntentSplit> list(
      String settlementAllocationIntentId, RequestOptions options) throws StripeException {
    return list(settlementAllocationIntentId, (SplitListParams) null, options);
  }
  /** List SettlementAllocationIntentSplits API. */
  public StripeCollection<SettlementAllocationIntentSplit> list(String settlementAllocationIntentId)
      throws StripeException {
    return list(settlementAllocationIntentId, (SplitListParams) null, (RequestOptions) null);
  }
  /** List SettlementAllocationIntentSplits API. */
  public StripeCollection<SettlementAllocationIntentSplit> list(
      String settlementAllocationIntentId, SplitListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/splits",
            ApiResource.urlEncodeId(settlementAllocationIntentId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<SettlementAllocationIntentSplit>>() {}.getType());
  }
  /** Create SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit create(
      String settlementAllocationIntentId, SplitCreateParams params) throws StripeException {
    return create(settlementAllocationIntentId, params, (RequestOptions) null);
  }
  /** Create SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit create(
      String settlementAllocationIntentId, SplitCreateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/splits",
            ApiResource.urlEncodeId(settlementAllocationIntentId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SettlementAllocationIntentSplit.class);
  }
  /** Retrieve SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit retrieve(String settlementAllocationIntentId, String id)
      throws StripeException {
    return retrieve(settlementAllocationIntentId, id, (RequestOptions) null);
  }
  /** Retrieve SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit retrieve(
      String settlementAllocationIntentId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/splits/%s",
            ApiResource.urlEncodeId(settlementAllocationIntentId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, SettlementAllocationIntentSplit.class);
  }
  /** Cancel SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit cancel(String settlementAllocationIntentId, String id)
      throws StripeException {
    return cancel(settlementAllocationIntentId, id, (RequestOptions) null);
  }
  /** Cancel SettlementAllocationIntentSplit API. */
  public SettlementAllocationIntentSplit cancel(
      String settlementAllocationIntentId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/payments/settlement_allocation_intents/%s/splits/%s/cancel",
            ApiResource.urlEncodeId(settlementAllocationIntentId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, SettlementAllocationIntentSplit.class);
  }
}
