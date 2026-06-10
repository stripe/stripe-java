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
  public GiftCard retrieve(String giftCard, GiftCardRetrieveParams params) throws StripeException {
    return retrieve(giftCard, params, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String giftCard, RequestOptions options) throws StripeException {
    return retrieve(giftCard, (GiftCardRetrieveParams) null, options);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String giftCard) throws StripeException {
    return retrieve(giftCard, (GiftCardRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves a third-party gift card object. */
  public GiftCard retrieve(String giftCard, GiftCardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s", ApiResource.urlEncodeId(giftCard));
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
  public GiftCardOperation activate(String giftCard, GiftCardActivateParams params)
      throws StripeException {
    return activate(giftCard, params, (RequestOptions) null);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(String giftCard, RequestOptions options)
      throws StripeException {
    return activate(giftCard, (GiftCardActivateParams) null, options);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(String giftCard) throws StripeException {
    return activate(giftCard, (GiftCardActivateParams) null, (RequestOptions) null);
  }
  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(
      String giftCard, GiftCardActivateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/activate", ApiResource.urlEncodeId(giftCard));
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
  public GiftCardOperation cashout(String giftCard, GiftCardCashoutParams params)
      throws StripeException {
    return cashout(giftCard, params, (RequestOptions) null);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String giftCard, RequestOptions options) throws StripeException {
    return cashout(giftCard, (GiftCardCashoutParams) null, options);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(String giftCard) throws StripeException {
    return cashout(giftCard, (GiftCardCashoutParams) null, (RequestOptions) null);
  }
  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(
      String giftCard, GiftCardCashoutParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/cashout", ApiResource.urlEncodeId(giftCard));
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
  public GiftCardOperation checkBalance(String giftCard, GiftCardCheckBalanceParams params)
      throws StripeException {
    return checkBalance(giftCard, params, (RequestOptions) null);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(String giftCard, RequestOptions options)
      throws StripeException {
    return checkBalance(giftCard, (GiftCardCheckBalanceParams) null, options);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(String giftCard) throws StripeException {
    return checkBalance(giftCard, (GiftCardCheckBalanceParams) null, (RequestOptions) null);
  }
  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(
      String giftCard, GiftCardCheckBalanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/check_balance", ApiResource.urlEncodeId(giftCard));
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
  public GiftCardOperation reload(String giftCard, GiftCardReloadParams params)
      throws StripeException {
    return reload(giftCard, params, (RequestOptions) null);
  }
  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(
      String giftCard, GiftCardReloadParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/%s/reload", ApiResource.urlEncodeId(giftCard));
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
  public GiftCardOperation voidOperation(String giftCard, GiftCardVoidOperationParams params)
      throws StripeException {
    return voidOperation(giftCard, params, (RequestOptions) null);
  }
  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(
      String giftCard, GiftCardVoidOperationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/void_operation", ApiResource.urlEncodeId(giftCard));
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
