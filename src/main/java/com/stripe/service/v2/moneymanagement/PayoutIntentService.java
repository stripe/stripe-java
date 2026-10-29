// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.CapabilityNotEnabledException;
import com.stripe.exception.FeatureNotEnabledException;
import com.stripe.exception.FxQuoteNeedsRefreshException;
import com.stripe.exception.NotCancelableException;
import com.stripe.exception.RecipientNotNotifiableException;
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
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a PayoutIntent. */
  public PayoutIntent create(PayoutIntentCreateParams params, RequestOptions options)
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
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
  /** Updates an editable PayoutIntent in the {@code pending} or {@code requires_action} state. */
  public PayoutIntent update(String id, PayoutIntentUpdateParams params)
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
    return update(id, params, (RequestOptions) null);
  }
  /** Updates an editable PayoutIntent in the {@code pending} or {@code requires_action} state. */
  public PayoutIntent update(String id, RequestOptions options)
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
    return update(id, (PayoutIntentUpdateParams) null, options);
  }
  /** Updates an editable PayoutIntent in the {@code pending} or {@code requires_action} state. */
  public PayoutIntent update(String id)
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
    return update(id, (PayoutIntentUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an editable PayoutIntent in the {@code pending} or {@code requires_action} state. */
  public PayoutIntent update(String id, PayoutIntentUpdateParams params, RequestOptions options)
      throws StripeException, CapabilityNotEnabledException, RecipientNotNotifiableException,
          FeatureNotEnabledException {
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
   * Cancels a PayoutIntent in the {@code pending} or {@code requires_action} state, or a {@code
   * processing} PayoutIntent with a cancelable OutboundPayment.
   */
  public PayoutIntent cancel(String id) throws StripeException, NotCancelableException {
    return cancel(id, (RequestOptions) null);
  }
  /**
   * Cancels a PayoutIntent in the {@code pending} or {@code requires_action} state, or a {@code
   * processing} PayoutIntent with a cancelable OutboundPayment.
   */
  public PayoutIntent cancel(String id, RequestOptions options)
      throws StripeException, NotCancelableException {
    String path =
        String.format("/v2/money_management/payout_intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
  /**
   * Confirms a PayoutIntent in the {@code requires_action} state, transitioning it to {@code
   * pending}.
   */
  public PayoutIntent confirm(String id) throws StripeException, FxQuoteNeedsRefreshException {
    return confirm(id, (RequestOptions) null);
  }
  /**
   * Confirms a PayoutIntent in the {@code requires_action} state, transitioning it to {@code
   * pending}.
   */
  public PayoutIntent confirm(String id, RequestOptions options)
      throws StripeException, FxQuoteNeedsRefreshException {
    String path =
        String.format(
            "/v2/money_management/payout_intents/%s/confirm", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
  /** Refreshes the FX quote for a PayoutIntent. */
  public PayoutIntent refreshFxQuote(String id) throws StripeException {
    return refreshFxQuote(id, (RequestOptions) null);
  }
  /** Refreshes the FX quote for a PayoutIntent. */
  public PayoutIntent refreshFxQuote(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/payout_intents/%s/refresh_fx_quote", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
  /** Refreshes the recipient verification for a PayoutIntent. */
  public PayoutIntent refreshRecipientVerification(String id) throws StripeException {
    return refreshRecipientVerification(id, (RequestOptions) null);
  }
  /** Refreshes the recipient verification for a PayoutIntent. */
  public PayoutIntent refreshRecipientVerification(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/payout_intents/%s/refresh_recipient_verification",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, PayoutIntent.class);
  }
}
