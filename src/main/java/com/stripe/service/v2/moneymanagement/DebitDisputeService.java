// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.DebitDispute;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.DebitDisputeCreateParams;
import com.stripe.param.v2.moneymanagement.DebitDisputeListParams;

public final class DebitDisputeService extends ApiService {
  public DebitDisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of DebitDisputes. */
  public StripeCollection<DebitDispute> list(DebitDisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of DebitDisputes. */
  public StripeCollection<DebitDispute> list(RequestOptions options) throws StripeException {
    return list((DebitDisputeListParams) null, options);
  }
  /** Retrieves a list of DebitDisputes. */
  public StripeCollection<DebitDispute> list() throws StripeException {
    return list((DebitDisputeListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of DebitDisputes. */
  public StripeCollection<DebitDispute> list(DebitDisputeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/debit_disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<DebitDispute>>() {}.getType());
  }
  /** Creates a new DebitDispute for a ReceivedDebit. */
  public DebitDispute create(DebitDisputeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new DebitDispute for a ReceivedDebit. */
  public DebitDispute create(DebitDisputeCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/debit_disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, DebitDispute.class);
  }
  /** Retrieves the details of an existing DebitDispute. */
  public DebitDispute retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing DebitDispute. */
  public DebitDispute retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/debit_disputes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, DebitDispute.class);
  }
}
