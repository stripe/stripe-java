// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.CannotProceedException;
import com.stripe.exception.CapabilityNotEnabledException;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.FundingIntent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.FundingIntentCreateParams;
import com.stripe.param.v2.moneymanagement.FundingIntentListParams;
import com.stripe.param.v2.moneymanagement.FundingIntentUpdateParams;

public final class FundingIntentService extends ApiService {
  public FundingIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists FundingIntents. */
  public StripeCollection<FundingIntent> list(FundingIntentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists FundingIntents. */
  public StripeCollection<FundingIntent> list(RequestOptions options) throws StripeException {
    return list((FundingIntentListParams) null, options);
  }
  /** Lists FundingIntents. */
  public StripeCollection<FundingIntent> list() throws StripeException {
    return list((FundingIntentListParams) null, (RequestOptions) null);
  }
  /** Lists FundingIntents. */
  public StripeCollection<FundingIntent> list(
      FundingIntentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/funding_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<FundingIntent>>() {}.getType());
  }
  /** Creates a FundingIntent that adds funds to a FinancialAccount. */
  public FundingIntent create(FundingIntentCreateParams params)
      throws StripeException, CannotProceedException, FeatureNotEnabledException,
          CapabilityNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a FundingIntent that adds funds to a FinancialAccount. */
  public FundingIntent create(FundingIntentCreateParams params, RequestOptions options)
      throws StripeException, CannotProceedException, FeatureNotEnabledException,
          CapabilityNotEnabledException {
    String path = "/v2/money_management/funding_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FundingIntent.class);
  }
  /** Retrieves a FundingIntent by ID. */
  public FundingIntent retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a FundingIntent by ID. */
  public FundingIntent retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format("/v2/money_management/funding_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, FundingIntent.class);
  }
  /** Updates the mutable details of a FundingIntent. */
  public FundingIntent update(String id, FundingIntentUpdateParams params)
      throws StripeException, CannotProceedException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates the mutable details of a FundingIntent. */
  public FundingIntent update(String id, RequestOptions options)
      throws StripeException, CannotProceedException {
    return update(id, (FundingIntentUpdateParams) null, options);
  }
  /** Updates the mutable details of a FundingIntent. */
  public FundingIntent update(String id) throws StripeException, CannotProceedException {
    return update(id, (FundingIntentUpdateParams) null, (RequestOptions) null);
  }
  /** Updates the mutable details of a FundingIntent. */
  public FundingIntent update(String id, FundingIntentUpdateParams params, RequestOptions options)
      throws StripeException, CannotProceedException {
    String path =
        String.format("/v2/money_management/funding_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FundingIntent.class);
  }
  /** Cancels a FundingIntent that can still be canceled. */
  public FundingIntent cancel(String id) throws StripeException, CannotProceedException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancels a FundingIntent that can still be canceled. */
  public FundingIntent cancel(String id, RequestOptions options)
      throws StripeException, CannotProceedException {
    String path =
        String.format(
            "/v2/money_management/funding_intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, FundingIntent.class);
  }
  /** Confirms a FundingIntent that is ready for processing. */
  public FundingIntent confirm(String id) throws StripeException, CannotProceedException {
    return confirm(id, (RequestOptions) null);
  }
  /** Confirms a FundingIntent that is ready for processing. */
  public FundingIntent confirm(String id, RequestOptions options)
      throws StripeException, CannotProceedException {
    String path =
        String.format(
            "/v2/money_management/funding_intents/%s/confirm", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, FundingIntent.class);
  }
}
