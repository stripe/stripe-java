// File generated from our OpenAPI spec
package com.stripe.service.treasury;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.treasury.ReceivedCredit;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.treasury.ReceivedCreditListParams;
import com.stripe.param.treasury.ReceivedCreditRetrieveParams;

public final class ReceivedCreditService extends ApiService {
  public ReceivedCreditService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list(ReceivedCreditListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of ReceivedCredits. */
  public StripeCollection<ReceivedCredit> list(
      ReceivedCreditListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/treasury/received_credits";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<ReceivedCredit>>() {}.getType());
  }
  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public ReceivedCredit retrieve(String id, ReceivedCreditRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public ReceivedCredit retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (ReceivedCreditRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public ReceivedCredit retrieve(String id) throws StripeException {
    return retrieve(id, (ReceivedCreditRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID
   * from the ReceivedCredit list.
   */
  public ReceivedCredit retrieve(
      String id, ReceivedCreditRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/treasury/received_credits/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ReceivedCredit.class);
  }
}
