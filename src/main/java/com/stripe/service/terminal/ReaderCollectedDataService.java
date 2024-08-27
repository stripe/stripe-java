// File generated from our OpenAPI spec
package com.stripe.service.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.terminal.ReaderCollectedData;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.terminal.ReaderCollectedDataRetrieveParams;

public final class ReaderCollectedDataService extends ApiService {
  public ReaderCollectedDataService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieve data collected using Reader hardware. */
  public ReaderCollectedData retrieve(
      String readerCollectedData, ReaderCollectedDataRetrieveParams params) throws StripeException {
    return retrieve(readerCollectedData, params, (RequestOptions) null);
  }
  /** Retrieve data collected using Reader hardware. */
  public ReaderCollectedData retrieve(String readerCollectedData, RequestOptions options)
      throws StripeException {
    return retrieve(readerCollectedData, (ReaderCollectedDataRetrieveParams) null, options);
  }
  /** Retrieve data collected using Reader hardware. */
  public ReaderCollectedData retrieve(String readerCollectedData) throws StripeException {
    return retrieve(
        readerCollectedData, (ReaderCollectedDataRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieve data collected using Reader hardware. */
  public ReaderCollectedData retrieve(
      String readerCollectedData, ReaderCollectedDataRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/terminal/reader_collected_data/%s", ApiResource.urlEncodeId(readerCollectedData));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, ReaderCollectedData.class);
  }
}
