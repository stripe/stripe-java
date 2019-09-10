package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FeeRefundCollectionCreateParams;
import com.stripe.param.FeeRefundCollectionListParams;
import com.stripe.param.FeeRefundCollectionRetrieveParams;
import java.util.Map;

public class FeeRefundCollection extends StripeCollection<FeeRefund> {
  /**
   * <p>Refunds an application fee that has previously been collected but not yet refunded.
   * Funds will be refunded to the Stripe account from which the fee was originally collected.</p>
   *
   * <p>You can optionally refund only part of an application fee.
   * You can do so multiple times, until the entire fee has been refunded.</p>
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again.
   * This method will raise an error when called on an already-refunded application fee,
   * or when trying to refund more money than is left on an application fee.</p>
   */
  public FeeRefund create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Refunds an application fee that has previously been collected but not yet refunded.
   * Funds will be refunded to the Stripe account from which the fee was originally collected.</p>
   *
   * <p>You can optionally refund only part of an application fee.
   * You can do so multiple times, until the entire fee has been refunded.</p>
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again.
   * This method will raise an error when called on an already-refunded application fee,
   * or when trying to refund more money than is left on an application fee.</p>
   */
  public FeeRefund create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      FeeRefund.class,
      options
    );
  }

  /**
   * <p>Refunds an application fee that has previously been collected but not yet refunded.
   * Funds will be refunded to the Stripe account from which the fee was originally collected.</p>
   *
   * <p>You can optionally refund only part of an application fee.
   * You can do so multiple times, until the entire fee has been refunded.</p>
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again.
   * This method will raise an error when called on an already-refunded application fee,
   * or when trying to refund more money than is left on an application fee.</p>
   */
  public FeeRefund create(FeeRefundCollectionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Refunds an application fee that has previously been collected but not yet refunded.
   * Funds will be refunded to the Stripe account from which the fee was originally collected.</p>
   *
   * <p>You can optionally refund only part of an application fee.
   * You can do so multiple times, until the entire fee has been refunded.</p>
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again.
   * This method will raise an error when called on an already-refunded application fee,
   * or when trying to refund more money than is left on an application fee.</p>
   */
  public FeeRefund create(
      FeeRefundCollectionCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      FeeRefund.class,
      options
    );
  }

  /**
   * <p>You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available by default on the application fee object. If you need more than those 10, you can use this API method and the <code>limit</code> and <code>starting_after</code> parameters to page through additional refunds.</p>
   */
  public FeeRefundCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available by default on the application fee object. If you need more than those 10, you can use this API method and the <code>limit</code> and <code>starting_after</code> parameters to page through additional refunds.</p>
   */
  public FeeRefundCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, FeeRefundCollection.class, options);
  }

  /**
   * <p>You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available by default on the application fee object. If you need more than those 10, you can use this API method and the <code>limit</code> and <code>starting_after</code> parameters to page through additional refunds.</p>
   */
  public FeeRefundCollection list(FeeRefundCollectionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available by default on the application fee object. If you need more than those 10, you can use this API method and the <code>limit</code> and <code>starting_after</code> parameters to page through additional refunds.</p>
   */
  public FeeRefundCollection list(
      FeeRefundCollectionListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, FeeRefundCollection.class, options);
  }

  /**
   * <p>By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details about a specific refund stored on the application fee.</p>
   */
  public FeeRefund retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details about a specific refund stored on the application fee.</p>
   */
  public FeeRefund retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * <p>By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details about a specific refund stored on the application fee.</p>
   */
  public FeeRefund retrieve(
      String id,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      FeeRefund.class,
      options
    );
  }

  /**
   * <p>By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details about a specific refund stored on the application fee.</p>
   */
  public FeeRefund retrieve(
      String id,
      FeeRefundCollectionRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      FeeRefund.class,
      options
    );
  }
}