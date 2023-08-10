// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItem;
import com.stripe.model.PaymentLink;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PaymentLinkListLineItemsParams;
import com.stripe.param.PaymentLinkListParams;
import com.stripe.param.PaymentLinkRetrieveParams;
import com.stripe.param.PaymentLinkUpdateParams;

public final class PaymentLinkService extends ApiService {
  public PaymentLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(PaymentLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(RequestOptions options) throws StripeException {
    return list((PaymentLinkListParams) null, options);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list() throws StripeException {
    return list((PaymentLinkListParams) null, (RequestOptions) null);
  }
  /** Returns a list of your payment links. */
  public StripeCollection<PaymentLink> list(PaymentLinkListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<PaymentLink>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /** Creates a payment link. */
  public PaymentLink create(PaymentLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a payment link. */
  public PaymentLink create(PaymentLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_links";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String paymentLink, PaymentLinkRetrieveParams params)
      throws StripeException {
    return retrieve(paymentLink, params, (RequestOptions) null);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String paymentLink, RequestOptions options) throws StripeException {
    return retrieve(paymentLink, (PaymentLinkRetrieveParams) null, options);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(String paymentLink) throws StripeException {
    return retrieve(paymentLink, (PaymentLinkRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve a payment link. */
  public PaymentLink retrieve(
      String paymentLink, PaymentLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
  }
  /** Updates a payment link. */
  public PaymentLink update(String paymentLink, PaymentLinkUpdateParams params)
      throws StripeException {
    return update(paymentLink, params, (RequestOptions) null);
  }
  /** Updates a payment link. */
  public PaymentLink update(String paymentLink, RequestOptions options) throws StripeException {
    return update(paymentLink, (PaymentLinkUpdateParams) null, options);
  }
  /** Updates a payment link. */
  public PaymentLink update(String paymentLink) throws StripeException {
    return update(paymentLink, (PaymentLinkUpdateParams) null, (RequestOptions) null);
  }
  /** Updates a payment link. */
  public PaymentLink update(
      String paymentLink, PaymentLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/payment_links/%s", ApiResource.urlEncodeId(paymentLink));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            PaymentLink.class,
            options,
            ApiMode.V1);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(
      String paymentLink, PaymentLinkListLineItemsParams params) throws StripeException {
    return listLineItems(paymentLink, params, (RequestOptions) null);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(String paymentLink, RequestOptions options)
      throws StripeException {
    return listLineItems(paymentLink, (PaymentLinkListLineItemsParams) null, options);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(String paymentLink) throws StripeException {
    return listLineItems(paymentLink, (PaymentLinkListLineItemsParams) null, (RequestOptions) null);
  }
  /**
   * When retrieving a payment link, there is an includable <strong>line_items</strong> property
   * containing the first handful of those items. There is also a URL where you can retrieve the
   * full (paginated) list of line items.
   */
  public StripeCollection<LineItem> listLineItems(
      String paymentLink, PaymentLinkListLineItemsParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_links/%s/line_items", ApiResource.urlEncodeId(paymentLink));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<LineItem>>() {}.getType(),
            options,
            ApiMode.V1);
  }
}
