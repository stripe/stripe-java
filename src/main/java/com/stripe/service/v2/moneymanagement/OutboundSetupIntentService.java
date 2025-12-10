// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.BlockedByStripeException;
import com.stripe.exception.ControlledByAlternateResourceException;
import com.stripe.exception.InvalidPayoutMethodException;
import com.stripe.exception.QuotaExceededException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.moneymanagement.OutboundSetupIntent;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.OutboundSetupIntentCreateParams;
import com.stripe.param.v2.moneymanagement.OutboundSetupIntentListParams;
import com.stripe.param.v2.moneymanagement.OutboundSetupIntentUpdateParams;

public final class OutboundSetupIntentService extends ApiService {
  public OutboundSetupIntentService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List the OutboundSetupIntent objects. */
  public StripeCollection<OutboundSetupIntent> list(OutboundSetupIntentListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List the OutboundSetupIntent objects. */
  public StripeCollection<OutboundSetupIntent> list(RequestOptions options) throws StripeException {
    return list((OutboundSetupIntentListParams) null, options);
  }
  /** List the OutboundSetupIntent objects. */
  public StripeCollection<OutboundSetupIntent> list() throws StripeException {
    return list((OutboundSetupIntentListParams) null, (RequestOptions) null);
  }
  /** List the OutboundSetupIntent objects. */
  public StripeCollection<OutboundSetupIntent> list(
      OutboundSetupIntentListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/money_management/outbound_setup_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<OutboundSetupIntent>>() {}.getType());
  }
  /** Create an OutboundSetupIntent object. */
  public OutboundSetupIntent create(OutboundSetupIntentCreateParams params)
      throws StripeException, BlockedByStripeException, InvalidPayoutMethodException,
          QuotaExceededException, ControlledByAlternateResourceException {
    return create(params, (RequestOptions) null);
  }
  /** Create an OutboundSetupIntent object. */
  public OutboundSetupIntent create(RequestOptions options)
      throws StripeException, BlockedByStripeException, InvalidPayoutMethodException,
          QuotaExceededException, ControlledByAlternateResourceException {
    return create((OutboundSetupIntentCreateParams) null, options);
  }
  /** Create an OutboundSetupIntent object. */
  public OutboundSetupIntent create()
      throws StripeException, BlockedByStripeException, InvalidPayoutMethodException,
          QuotaExceededException, ControlledByAlternateResourceException {
    return create((OutboundSetupIntentCreateParams) null, (RequestOptions) null);
  }
  /** Create an OutboundSetupIntent object. */
  public OutboundSetupIntent create(OutboundSetupIntentCreateParams params, RequestOptions options)
      throws StripeException, BlockedByStripeException, InvalidPayoutMethodException,
          QuotaExceededException, ControlledByAlternateResourceException {
    String path = "/v2/money_management/outbound_setup_intents";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundSetupIntent.class);
  }
  /** Retrieve an OutboundSetupIntent object. */
  public OutboundSetupIntent retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve an OutboundSetupIntent object. */
  public OutboundSetupIntent retrieve(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/outbound_setup_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, OutboundSetupIntent.class);
  }
  /** Update an OutboundSetupIntent object. */
  public OutboundSetupIntent update(String id, OutboundSetupIntentUpdateParams params)
      throws StripeException, QuotaExceededException, BlockedByStripeException,
          InvalidPayoutMethodException, ControlledByAlternateResourceException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update an OutboundSetupIntent object. */
  public OutboundSetupIntent update(String id, RequestOptions options)
      throws StripeException, QuotaExceededException, BlockedByStripeException,
          InvalidPayoutMethodException, ControlledByAlternateResourceException {
    return update(id, (OutboundSetupIntentUpdateParams) null, options);
  }
  /** Update an OutboundSetupIntent object. */
  public OutboundSetupIntent update(String id)
      throws StripeException, QuotaExceededException, BlockedByStripeException,
          InvalidPayoutMethodException, ControlledByAlternateResourceException {
    return update(id, (OutboundSetupIntentUpdateParams) null, (RequestOptions) null);
  }
  /** Update an OutboundSetupIntent object. */
  public OutboundSetupIntent update(
      String id, OutboundSetupIntentUpdateParams params, RequestOptions options)
      throws StripeException, QuotaExceededException, BlockedByStripeException,
          InvalidPayoutMethodException, ControlledByAlternateResourceException {
    String path =
        String.format(
            "/v2/money_management/outbound_setup_intents/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, OutboundSetupIntent.class);
  }
  /** Cancel an OutboundSetupIntent object. */
  public OutboundSetupIntent cancel(String id) throws StripeException {
    return cancel(id, (RequestOptions) null);
  }
  /** Cancel an OutboundSetupIntent object. */
  public OutboundSetupIntent cancel(String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/money_management/outbound_setup_intents/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, null, options);
    return this.request(request, OutboundSetupIntent.class);
  }
}
