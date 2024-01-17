// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.ReceivedDebit;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.ReceivedDebitListParams;
import com.stripe.param.treasury.ReceivedDebitRetrieveParams;

public final class ReceivedDebitService extends ApiService {
  public ReceivedDebitService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of ReceivedDebits. */
  public StripeCollection<ReceivedDebit> list(ReceivedDebitListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of ReceivedDebits. */
  public StripeCollection<ReceivedDebit> list(
      ReceivedDebitListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/received_debits";
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
        .request(request, new TypeToken<StripeCollection<ReceivedDebit>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public ReceivedDebit retrieve(String id, ReceivedDebitRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public ReceivedDebit retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReceivedDebitRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public ReceivedDebit retrieve(String id) throws StripeException {
    return retrieve(id, (ReceivedDebitRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from
   * the ReceivedDebit list.
   */
  public ReceivedDebit retrieve(
      String id, ReceivedDebitRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/received_debits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    request = request.addUsage("stripe_client");
    return getResponseGetter().request(request, ReceivedDebit.class);
  }
}
