// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.ReceivedDebitMandate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.ReceivedDebitMandateListParams;

public final class ReceivedDebitMandateService extends ApiService {
  public ReceivedDebitMandateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of ReceivedDebitMandates. */
  public StripeCollection<ReceivedDebitMandate> list(ReceivedDebitMandateListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of ReceivedDebitMandates. */
  public StripeCollection<ReceivedDebitMandate> list(RequestOptions options)
      throws StripeException {
    return list((ReceivedDebitMandateListParams) null, options);
  }
  /** Returns a list of ReceivedDebitMandates. */
  public StripeCollection<ReceivedDebitMandate> list() throws StripeException {
    return list((ReceivedDebitMandateListParams) null, (RequestOptions) null);
  }
  /** Returns a list of ReceivedDebitMandates. */
  public StripeCollection<ReceivedDebitMandate> list(
      ReceivedDebitMandateListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/received_debit_mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<ReceivedDebitMandate>>() {}.getType());
  }
  /** Retrieves the details of an existing ReceivedDebitMandate. */
  public ReceivedDebitMandate retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing ReceivedDebitMandate. */
  public ReceivedDebitMandate retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/received_debit_mandates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, ReceivedDebitMandate.class);
  }
  /** Cancels an active ReceivedDebitMandate. */
  public ReceivedDebitMandate cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels an active ReceivedDebitMandate. */
  public ReceivedDebitMandate cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/received_debit_mandates/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, ReceivedDebitMandate.class);
  }
}
