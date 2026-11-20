// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyExistsException;
import com.stripe.exception.CannotProceedException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.Dispute;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.DisputeCreateParams;
import com.stripe.param.v2.moneymanagement.DisputeListParams;

public final class DisputeService extends ApiService {
  public DisputeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a list of Disputes. */
  public StripeCollection<Dispute> list(DisputeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Retrieves a list of Disputes. */
  public StripeCollection<Dispute> list(RequestOptions options) throws StripeException {
    return list((DisputeListParams) null, options);
  }
  /** Retrieves a list of Disputes. */
  public StripeCollection<Dispute> list() throws StripeException {
    return list((DisputeListParams) null, (RequestOptions) null);
  }
  /** Retrieves a list of Disputes. */
  public StripeCollection<Dispute> list(DisputeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Dispute>>() {}.getType());
  }
  /** Creates a Dispute for the specified money movement. */
  public Dispute create(DisputeCreateParams params)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a Dispute for the specified money movement. */
  public Dispute create(DisputeCreateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException, CannotProceedException {
    String path = "/v2/money_management/disputes";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Dispute.class);
  }
  /** Retrieves a Dispute. */
  public Dispute retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a Dispute. */
  public Dispute retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/money_management/disputes/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Dispute.class);
  }
}
