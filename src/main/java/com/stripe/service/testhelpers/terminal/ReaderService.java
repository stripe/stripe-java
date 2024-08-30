// File generated from our OpenAPI spec
package com.stripe.service.testhelpers.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.Reader;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderPresentPaymentMethodParams;

public final class ReaderService extends ApiService {
  public ReaderService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader, ReaderPresentPaymentMethodParams params)
      throws StripeException {
    return presentPaymentMethod(reader, params, (RequestOptions) null);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader, RequestOptions options) throws StripeException {
    return presentPaymentMethod(reader, (ReaderPresentPaymentMethodParams) null, options);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(String reader) throws StripeException {
    return presentPaymentMethod(
        reader, (ReaderPresentPaymentMethodParams) null, (RequestOptions) null);
  }
  /**
   * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
   * saving a card or refunding a transaction.
   */
  public Reader presentPaymentMethod(
      String reader, ReaderPresentPaymentMethodParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/test_helpers/terminal/readers/%s/present_payment_method",
            ApiResource.urlEncodeId(reader));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, Reader.class);
  }
}
