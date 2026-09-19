// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Card;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.CardDeliverCardParams;
import com.stripe.param.issuing.CardFailCardParams;
import com.stripe.param.issuing.CardReturnCardParams;
import com.stripe.param.issuing.CardShipCardParams;
import com.stripe.param.issuing.CardSubmitCardParams;

public final class CardService extends ApiService {
  public CardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String id, CardDeliverCardParams params) throws StripeException {
    return deliverCard(id, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String id, RequestOptions options) throws StripeException {
    return deliverCard(id, (CardDeliverCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String id) throws StripeException {
    return deliverCard(id, (CardDeliverCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String id, CardDeliverCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/deliver", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String id, CardFailCardParams params) throws StripeException {
    return failCard(id, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String id, RequestOptions options) throws StripeException {
    return failCard(id, (CardFailCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String id) throws StripeException {
    return failCard(id, (CardFailCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String id, CardFailCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/fail", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String id, CardReturnCardParams params) throws StripeException {
    return returnCard(id, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String id, RequestOptions options) throws StripeException {
    return returnCard(id, (CardReturnCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String id) throws StripeException {
    return returnCard(id, (CardReturnCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String id, CardReturnCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/return", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String id, CardShipCardParams params) throws StripeException {
    return shipCard(id, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String id, RequestOptions options) throws StripeException {
    return shipCard(id, (CardShipCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String id) throws StripeException {
    return shipCard(id, (CardShipCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String id, CardShipCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/ship", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code submitted}.
   * This method requires Stripe Version ‘2024-09-30.acacia’ or later.
   */
  public Card submitCard(String id, CardSubmitCardParams params) throws StripeException {
    return submitCard(id, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code submitted}.
   * This method requires Stripe Version ‘2024-09-30.acacia’ or later.
   */
  public Card submitCard(String id, RequestOptions options) throws StripeException {
    return submitCard(id, (CardSubmitCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code submitted}.
   * This method requires Stripe Version ‘2024-09-30.acacia’ or later.
   */
  public Card submitCard(String id) throws StripeException {
    return submitCard(id, (CardSubmitCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code submitted}.
   * This method requires Stripe Version ‘2024-09-30.acacia’ or later.
   */
  public Card submitCard(String id, CardSubmitCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/submit", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Card.class);
  }
}
