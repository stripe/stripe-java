// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.Payout;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PayoutCancelParams;
import com.stripe.param.PayoutCreateParams;
import com.stripe.param.PayoutListParams;
import com.stripe.param.PayoutRetrieveParams;
import com.stripe.param.PayoutReverseParams;
import com.stripe.param.PayoutUpdateParams;

public final class PayoutService extends ApiService {
  public PayoutService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public StripeCollection<Payout> list(PayoutListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public StripeCollection<Payout> list(RequestOptions options) throws StripeException {
    return list((PayoutListParams) null, options);
  }
  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public StripeCollection<Payout> list() throws StripeException {
    return list((PayoutListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of existing payouts sent to third-party bank accounts or payouts that Stripe
   * sent to you. The payouts return in sorted order, with the most recently created payouts
   * appearing first.
   */
  public StripeCollection<Payout> list(PayoutListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payouts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Payout>>() {}.getType());
  }
  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/api/balances/object">balance object</a> details available and pending
   * amounts by source type.
   */
  public Payout create(PayoutCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To send funds to your own bank account, create a new payout object. Your <a
   * href="https://stripe.com/docs/api#balance">Stripe balance</a> must cover the payout amount. If
   * it doesn’t, you receive an “Insufficient Funds” error.
   *
   * <p>If your API key is in test mode, money won’t actually be sent, though every other action
   * occurs as if you’re in live mode.
   *
   * <p>If you create a manual payout on a Stripe account that uses multiple payment source types,
   * you need to specify the source type balance that the payout draws from. The <a
   * href="https://stripe.com/api/balances/object">balance object</a> details available and pending
   * amounts by source type.
   */
  public Payout create(PayoutCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payouts";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Payout.class);
  }
  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public Payout retrieve(String id, PayoutRetrieveParams params) throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public Payout retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (PayoutRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public Payout retrieve(String id) throws StripeException {
    return retrieve(id, (PayoutRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing payout. Supply the unique payout ID from either a payout
   * creation request or the payout list. Stripe returns the corresponding payout information.
   */
  public Payout retrieve(String id, PayoutRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Payout.class);
  }
  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(String id, PayoutUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(String id, RequestOptions options) throws StripeException {
    return update(id, (PayoutUpdateParams) null, options);
  }
  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(String id) throws StripeException {
    return update(id, (PayoutUpdateParams) null, (RequestOptions) null);
  }
  /**
   * Updates the specified payout by setting the values of the parameters you pass. We don’t change
   * parameters that you don’t provide. This request only accepts the metadata as arguments.
   */
  public Payout update(String id, PayoutUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Payout.class);
  }
  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(String id, PayoutCancelParams params) throws StripeException {
    return cancel(id, params, (RequestOptions) null);
  }
  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(String id, RequestOptions options) throws StripeException {
    return cancel(id, (PayoutCancelParams) null, options);
  }
  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(String id) throws StripeException {
    return cancel(id, (PayoutCancelParams) null, (RequestOptions) null);
  }
  /**
   * You can cancel a previously created payout if its status is {@code pending}. Stripe refunds the
   * funds to your available balance. You can’t cancel automatic Stripe payouts.
   */
  public Payout cancel(String id, PayoutCancelParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s/cancel", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Payout.class);
  }
  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US and Canadian bank accounts. If the payout is manual and in
   * the {@code pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(String id, PayoutReverseParams params) throws StripeException {
    return reverse(id, params, (RequestOptions) null);
  }
  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US and Canadian bank accounts. If the payout is manual and in
   * the {@code pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(String id, RequestOptions options) throws StripeException {
    return reverse(id, (PayoutReverseParams) null, options);
  }
  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US and Canadian bank accounts. If the payout is manual and in
   * the {@code pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(String id) throws StripeException {
    return reverse(id, (PayoutReverseParams) null, (RequestOptions) null);
  }
  /**
   * Reverses a payout by debiting the destination bank account. At this time, you can only reverse
   * payouts for connected accounts to US and Canadian bank accounts. If the payout is manual and in
   * the {@code pending} status, use {@code /v1/payouts/:id/cancel} instead.
   *
   * <p>By requesting a reversal through {@code /v1/payouts/:id/reverse}, you confirm that the
   * authorized signatory of the selected bank account authorizes the debit on the bank account and
   * that no other authorization is required.
   */
  public Payout reverse(String id, PayoutReverseParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payouts/%s/reverse", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Payout.class);
  }
}
