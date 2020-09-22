// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TransferReversalCollectionCreateParams;
import com.stripe.param.TransferReversalCollectionListParams;
import com.stripe.param.TransferReversalCollectionRetrieveParams;
import java.util.Map;

public class TransferReversalCollection extends StripeCollection<TransferReversal> {
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, TransferReversal.class, options);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(TransferReversalCollectionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal create(
      TransferReversalCollectionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, TransferReversal.class, options);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the <code>limit</code> and <code>starting_after
   * </code> parameters to page through additional reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the <code>limit</code> and <code>starting_after
   * </code> parameters to page through additional reversals.
   */
  public TransferReversalCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, TransferReversalCollection.class, options);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the <code>limit</code> and <code>starting_after
   * </code> parameters to page through additional reversals.
   */
  public TransferReversalCollection list(TransferReversalCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the <code>limit</code> and <code>starting_after
   * </code> parameters to page through additional reversals.
   */
  public TransferReversalCollection list(
      TransferReversalCollectionListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), this.getUrl());
    return ApiResource.requestCollection(url, params, TransferReversalCollection.class, options);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, TransferReversal.class, options);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieve(
      String id, TransferReversalCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, TransferReversal.class, options);
  }
}
