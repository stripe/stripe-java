// File generated from our OpenAPI spec
package com.stripe.service.v2.risk;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.risk.Inquiry;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.risk.InquiryListParams;
import com.stripe.param.v2.risk.InquiryUpdateParams;

public final class InquiryService extends ApiService {
  public InquiryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Lists risk inquiries for a connected account. */
  public StripeCollection<Inquiry> list(InquiryListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Lists risk inquiries for a connected account. */
  public StripeCollection<Inquiry> list(InquiryListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/risk/inquiries";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<Inquiry>>() {}.getType());
  }
  /** Retrieves a risk inquiry by ID. */
  public Inquiry retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a risk inquiry by ID. */
  public Inquiry retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/risk/inquiries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Inquiry.class);
  }
  /** Submits a response to a risk inquiry. */
  public Inquiry update(String id, InquiryUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Submits a response to a risk inquiry. */
  public Inquiry update(String id, RequestOptions options) throws StripeException {
    return update(id, (InquiryUpdateParams) null, options);
  }
  /** Submits a response to a risk inquiry. */
  public Inquiry update(String id) throws StripeException {
    return update(id, (InquiryUpdateParams) null, (RequestOptions) null);
  }
  /** Submits a response to a risk inquiry. */
  public Inquiry update(String id, InquiryUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/risk/inquiries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Inquiry.class);
  }
}
