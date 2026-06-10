// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
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
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Represents third-party gift cards that can be used as a payment method through Stripe. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GiftCard extends ApiResource implements HasId {
  /**
   * The brand of the gift card.
   *
   * <p>One of {@code fiserv_valuelink}, {@code givex}, or {@code svs}.
   */
  @SerializedName("brand")
  String brand;

  /** The expiration month of the gift card. */
  @SerializedName("exp_month")
  Long expMonth;

  /** The expiration year of the gift card. */
  @SerializedName("exp_year")
  Long expYear;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last four digits of the gift card number. */
  @SerializedName("last4")
  String last4;

  /** The last operation performed on this gift card. */
  @SerializedName("last_operation")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<GiftCardOperation> lastOperation;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code gift_card}.
   */
  @SerializedName("object")
  String object;

  /** Get ID of expandable {@code lastOperation} object. */
  public String getLastOperation() {
    return (this.lastOperation != null) ? this.lastOperation.getId() : null;
  }

  public void setLastOperation(String id) {
    this.lastOperation = ApiResource.setExpandableFieldId(id, this.lastOperation);
  }

  /** Get expanded {@code lastOperation}. */
  public GiftCardOperation getLastOperationObject() {
    return (this.lastOperation != null) ? this.lastOperation.getExpanded() : null;
  }

  public void setLastOperationObject(GiftCardOperation expandableObject) {
    this.lastOperation =
        new ExpandableField<GiftCardOperation>(expandableObject.getId(), expandableObject);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate() throws StripeException {
    return activate((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(RequestOptions options) throws StripeException {
    return activate((Map<String, Object>) null, options);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(Map<String, Object> params) throws StripeException {
    return activate(params, (RequestOptions) null);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/activate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(GiftCardActivateParams params) throws StripeException {
    return activate(params, (RequestOptions) null);
  }

  /** Activates a third-party gift card and optionally sets its balance. */
  public GiftCardOperation activate(GiftCardActivateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/activate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout() throws StripeException {
    return cashout((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(RequestOptions options) throws StripeException {
    return cashout((Map<String, Object>) null, options);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(Map<String, Object> params) throws StripeException {
    return cashout(params, (RequestOptions) null);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/cashout", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(GiftCardCashoutParams params) throws StripeException {
    return cashout(params, (RequestOptions) null);
  }

  /** Cashout a third-party gift card by zeroing its balance. */
  public GiftCardOperation cashout(GiftCardCashoutParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/cashout", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance() throws StripeException {
    return checkBalance((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(RequestOptions options) throws StripeException {
    return checkBalance((Map<String, Object>) null, options);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(Map<String, Object> params) throws StripeException {
    return checkBalance(params, (RequestOptions) null);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/check_balance", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(GiftCardCheckBalanceParams params) throws StripeException {
    return checkBalance(params, (RequestOptions) null);
  }

  /** Checks the balance of a third-party gift card. */
  public GiftCardOperation checkBalance(GiftCardCheckBalanceParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/check_balance", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Creates a gift card object. */
  public static GiftCard create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a gift card object. */
  public static GiftCard create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, GiftCard.class);
  }

  /** Creates a gift card object. */
  public static GiftCard create(GiftCardCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a gift card object. */
  public static GiftCard create(GiftCardCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/gift_cards";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, GiftCard.class);
  }

  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(Map<String, Object> params) throws StripeException {
    return reload(params, (RequestOptions) null);
  }

  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/reload", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(GiftCardReloadParams params) throws StripeException {
    return reload(params, (RequestOptions) null);
  }

  /** Reloads a third-party gift card by adding the specified amount to its balance. */
  public GiftCardOperation reload(GiftCardReloadParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s/reload", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Retrieves a third-party gift card object. */
  public static GiftCard retrieve(String giftCard) throws StripeException {
    return retrieve(giftCard, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a third-party gift card object. */
  public static GiftCard retrieve(String giftCard, RequestOptions options) throws StripeException {
    return retrieve(giftCard, (Map<String, Object>) null, options);
  }

  /** Retrieves a third-party gift card object. */
  public static GiftCard retrieve(
      String giftCard, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_cards/%s", ApiResource.urlEncodeId(giftCard));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, GiftCard.class);
  }

  /** Retrieves a third-party gift card object. */
  public static GiftCard retrieve(
      String giftCard, GiftCardRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_cards/%s", ApiResource.urlEncodeId(giftCard));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, GiftCard.class);
  }

  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(Map<String, Object> params) throws StripeException {
    return voidOperation(params, (RequestOptions) null);
  }

  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/void_operation", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(GiftCardVoidOperationParams params)
      throws StripeException {
    return voidOperation(params, (RequestOptions) null);
  }

  /** Voids a previously performed gift card operation. */
  public GiftCardOperation voidOperation(GiftCardVoidOperationParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/gift_cards/%s/void_operation", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, GiftCardOperation.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(lastOperation, responseGetter);
  }
}
