// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.GiftCard;
import com.stripe.model.GiftCardOperation;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.GiftCardActivateParams;
import com.stripe.param.GiftCardCashoutParams;
import com.stripe.param.GiftCardCheckBalanceParams;
import com.stripe.param.GiftCardCreateParams;
import com.stripe.param.GiftCardReloadParams;
import com.stripe.param.GiftCardRetrieveParams;
import com.stripe.param.GiftCardVoidOperationParams;

public final class GiftCardService extends ApiService {
  public GiftCardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String id, GiftCardRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (GiftCardRetrieveParams) null, options);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String id) throws StripeException {
    return retrieve(id, (GiftCardRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String id, GiftCardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCard.class);
  }
  /** Creates a gift card object. */
  public GiftCard create(GiftCardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a gift card object. */
  public GiftCard create(GiftCardCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCard.class);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(String id, GiftCardActivateParams params)
      throws StripeException {
    return activate(id, params, (RequestOptions) null);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(String id, RequestOptions options) throws StripeException {
    return activate(id, (GiftCardActivateParams) null, options);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(String id) throws StripeException {
    return activate(id, (GiftCardActivateParams) null, (RequestOptions) null);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(
      String id, GiftCardActivateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/%s/activate", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String id, GiftCardCashoutParams params) throws StripeException {
    return cashout(id, params, (RequestOptions) null);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String id, RequestOptions options) throws StripeException {
    return cashout(id, (GiftCardCashoutParams) null, options);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String id) throws StripeException {
    return cashout(id, (GiftCardCashoutParams) null, (RequestOptions) null);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String id, GiftCardCashoutParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/cashout", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(String id, GiftCardCheckBalanceParams params)
      throws StripeException {
    return checkBalance(id, params, (RequestOptions) null);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(String id, RequestOptions options) throws StripeException {
    return checkBalance(id, (GiftCardCheckBalanceParams) null, options);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(String id) throws StripeException {
    return checkBalance(id, (GiftCardCheckBalanceParams) null, (RequestOptions) null);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(
      String id, GiftCardCheckBalanceParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/%s/check_balance", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(String id, GiftCardReloadParams params) throws StripeException {
    return reload(id, params, (RequestOptions) null);
  }
  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(String id, GiftCardReloadParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/reload", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(String id, GiftCardVoidOperationParams params)
      throws StripeException {
    return voidOperation(id, params, (RequestOptions) null);
  }
  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(
      String id, GiftCardVoidOperationParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/void_operation", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, GiftCardOperation.class);
  }
}
