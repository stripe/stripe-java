// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.InvoicePaymentCollectionListParams;
import com.stripe.param.InvoicePaymentCollectionRetrieveParams;
import java.util.Map;

public class InvoicePaymentCollection extends StripeCollection<InvoicePayment> {
  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public InvoicePaymentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public InvoicePaymentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            InvoicePaymentCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public InvoicePaymentCollection list(InvoicePaymentCollectionListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * When retrieving an invoice, there is an includable payments property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of
   * payments.
   */
  public InvoicePaymentCollection list(
      InvoicePaymentCollectionListParams params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoicePaymentCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            InvoicePayment.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(
      String id, InvoicePaymentCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            InvoicePayment.class,
            options,
            ApiMode.V1);
  }
}
