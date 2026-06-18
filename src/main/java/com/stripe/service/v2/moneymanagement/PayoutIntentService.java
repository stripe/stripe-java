// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.NotCancelableException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.PayoutIntent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.PayoutIntentCreateParams;
import com.stripe.param.v2.moneymanagement.PayoutIntentListParams;
import com.stripe.param.v2.moneymanagement.PayoutIntentUpdateParams;

public final class PayoutIntentService extends ApiService {
  public PayoutIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of PayoutIntents. */
  public StripeCollection<PayoutIntent> list(PayoutIntentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of PayoutIntents. */
  public StripeCollection<PayoutIntent> list(RequestOptions options) throws StripeException {
    return list((PayoutIntentListParams) null, options);
  }
  /** Returns a list of PayoutIntents. */
  public StripeCollection<PayoutIntent> list() throws StripeException {
    return list((PayoutIntentListParams) null, (RequestOptions) null);
  }
  /** Returns a list of PayoutIntents. */
  public StripeCollection<PayoutIntent> list(PayoutIntentListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/money_management/payout_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<PayoutIntent>>() {}.getType());
  }
  /** Creates a PayoutIntent. */
  public PayoutIntent create(PayoutIntentCreateParams params)
      throws StripeException, FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a PayoutIntent. */
  public PayoutIntent create(PayoutIntentCreateParams params, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    String path = "/v2/money_management/payout_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PayoutIntent.class);
  }
  /** Retrieves the details of an existing PayoutIntent by passing the unique PayoutIntent ID. */
  public PayoutIntent retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves the details of an existing PayoutIntent by passing the unique PayoutIntent ID. */
  public PayoutIntent retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/payout_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
  /**
   * Updates a PayoutIntent. Only pending or requires_action PayoutIntents that are editable can be
   * updated.
   */
  public PayoutIntent update(String id, PayoutIntentUpdateParams params)
      throws StripeException, FeatureNotEnabledException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates a PayoutIntent. Only pending or requires_action PayoutIntents that are editable can be
   * updated.
   */
  public PayoutIntent update(String id, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    return update(id, (PayoutIntentUpdateParams) null, options);
  }
  /**
   * Updates a PayoutIntent. Only pending or requires_action PayoutIntents that are editable can be
   * updated.
   */
  public PayoutIntent update(String id) throws StripeException, FeatureNotEnabledException {
    return update(id, (PayoutIntentUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates a PayoutIntent. Only pending or requires_action PayoutIntents that are editable can be
   * updated.
   */
  public PayoutIntent update(String id, PayoutIntentUpdateParams params, RequestOptions options)
      throws StripeException, FeatureNotEnabledException {
    String path =
        String.format("/v2/money_management/payout_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, PayoutIntent.class);
  }
  /**
   * Cancels a PayoutIntent. Only pending PayoutIntents or processing PayoutIntents with cancelable
   * OutboundPayment/Transfer can be canceled.
   */
  public PayoutIntent cancel(String id) throws StripeException, NotCancelableException {
    return cancel(id, (RequestOptions) null);
  }
  /**
   * Cancels a PayoutIntent. Only pending PayoutIntents or processing PayoutIntents with cancelable
   * OutboundPayment/Transfer can be canceled.
   */
  public PayoutIntent cancel(String id, RequestOptions options)
      throws StripeException, NotCancelableException {
    String path =
        String.format("/v2/money_management/payout_intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
}
