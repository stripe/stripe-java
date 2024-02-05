// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.issuing;

import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Card;
import com.stripe.net.ApiMode;
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

public final class CardService extends ApiService {
  public CardService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String card, CardDeliverCardParams params) throws StripeException {
    return deliverCard(card, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String card, RequestOptions options) throws StripeException {
    return deliverCard(card, (CardDeliverCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String card) throws StripeException {
    return deliverCard(card, (CardDeliverCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code delivered}.
   */
  public Card deliverCard(String card, CardDeliverCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/deliver", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String card, CardFailCardParams params) throws StripeException {
    return failCard(card, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String card, RequestOptions options) throws StripeException {
    return failCard(card, (CardFailCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String card) throws StripeException {
    return failCard(card, (CardFailCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code failure}.
   */
  public Card failCard(String card, CardFailCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/fail", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String card, CardReturnCardParams params) throws StripeException {
    return returnCard(card, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String card, RequestOptions options) throws StripeException {
    return returnCard(card, (CardReturnCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String card) throws StripeException {
    return returnCard(card, (CardReturnCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code returned}.
   */
  public Card returnCard(String card, CardReturnCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/return", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String card, CardShipCardParams params) throws StripeException {
    return shipCard(card, params, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String card, RequestOptions options) throws StripeException {
    return shipCard(card, (CardShipCardParams) null, options);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String card) throws StripeException {
    return shipCard(card, (CardShipCardParams) null, (RequestOptions) null);
  }
  /**
   * Updates the shipping status of the specified Issuing {@code Card} object to {@code shipped}.
   */
  public Card shipCard(String card, CardShipCardParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/issuing/cards/%s/shipping/ship", ApiResource.urlEncodeId(card));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Card.class);
  }
}
