// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, InvoicePaymentCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoicePaymentCollection.class);
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
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, InvoicePayment.class);
  }

  /** Retrieves the invoice payment with the given ID. */
  public InvoicePayment retrieve(
      String id, InvoicePaymentCollectionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, InvoicePayment.class);
  }
}
