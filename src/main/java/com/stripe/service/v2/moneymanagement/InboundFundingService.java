// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.InboundFunding;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.InboundFundingListParams;

public final class InboundFundingService extends ApiService {
  public InboundFundingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists InboundFundings. */
  public StripeCollection<InboundFunding> list(InboundFundingListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists InboundFundings. */
  public StripeCollection<InboundFunding> list(RequestOptions options) throws StripeException {
    return list((InboundFundingListParams) null, options);
  }
  /** Lists InboundFundings. */
  public StripeCollection<InboundFunding> list() throws StripeException {
    return list((InboundFundingListParams) null, (RequestOptions) null);
  }
  /** Lists InboundFundings. */
  public StripeCollection<InboundFunding> list(
      InboundFundingListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/inbound_fundings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<InboundFunding>>() {}.getType());
  }
  /** Retrieves an InboundFunding by ID. */
  public InboundFunding retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves an InboundFunding by ID. */
  public InboundFunding retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/inbound_fundings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, InboundFunding.class);
  }
}
