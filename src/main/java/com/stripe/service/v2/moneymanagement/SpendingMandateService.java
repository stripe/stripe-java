// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.AlreadyExistsException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.SpendingMandate;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.SpendingMandateCreateParams;
import com.stripe.param.v2.moneymanagement.SpendingMandateListParams;
import com.stripe.param.v2.moneymanagement.SpendingMandateUpdateParams;

public final class SpendingMandateService extends ApiService {
  public SpendingMandateService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of SpendingMandates. */
  public StripeCollection<SpendingMandate> list(SpendingMandateListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of SpendingMandates. */
  public StripeCollection<SpendingMandate> list(RequestOptions options) throws StripeException {
    return list((SpendingMandateListParams) null, options);
  }
  /** Returns a list of SpendingMandates. */
  public StripeCollection<SpendingMandate> list() throws StripeException {
    return list((SpendingMandateListParams) null, (RequestOptions) null);
  }
  /** Returns a list of SpendingMandates. */
  public StripeCollection<SpendingMandate> list(
      SpendingMandateListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/spending_mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<SpendingMandate>>() {}.getType());
  }
  /**
   * Creates an active SpendingMandate authorizing an ACH originator to debit a Financial Account.
   */
  public SpendingMandate create(SpendingMandateCreateParams params)
      throws StripeException, AlreadyExistsException {
    return create(params, (RequestOptions) null);
  }
  /**
   * Creates an active SpendingMandate authorizing an ACH originator to debit a Financial Account.
   */
  public SpendingMandate create(SpendingMandateCreateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException {
    String path = "/v2/money_management/spending_mandates";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SpendingMandate.class);
  }
  /** Retrieves the details of an existing SpendingMandate. */
  public SpendingMandate retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing SpendingMandate. */
  public SpendingMandate retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/spending_mandates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, SpendingMandate.class);
  }
  /** Updates an active ACH SpendingMandate. */
  public SpendingMandate update(String id, SpendingMandateUpdateParams params)
      throws StripeException, AlreadyExistsException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an active ACH SpendingMandate. */
  public SpendingMandate update(String id, RequestOptions options)
      throws StripeException, AlreadyExistsException {
    return update(id, (SpendingMandateUpdateParams) null, options);
  }
  /** Updates an active ACH SpendingMandate. */
  public SpendingMandate update(String id) throws StripeException, AlreadyExistsException {
    return update(id, (SpendingMandateUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an active ACH SpendingMandate. */
  public SpendingMandate update(
      String id, SpendingMandateUpdateParams params, RequestOptions options)
      throws StripeException, AlreadyExistsException {
    String path =
        String.format("/v2/money_management/spending_mandates/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, SpendingMandate.class);
  }
  /** Cancels an active SpendingMandate. */
  public SpendingMandate cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels an active SpendingMandate. */
  public SpendingMandate cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/spending_mandates/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, SpendingMandate.class);
  }
}
