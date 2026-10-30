// File generated from our OpenAPI spec
package com.stripe.service.v2.risk;

import com.stripe.exception.StripeException;
import com.stripe.model.v2.risk.Form;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.risk.FormUpdateParams;

public final class FormService extends ApiService {
  public FormService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves a risk Form by ID. */
  public Form retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieves a risk Form by ID. */
  public Form retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, Form.class);
  }
  /** Submits a response to a risk Form. */
  public Form update(String id, FormUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Submits a response to a risk Form. */
  public Form update(String id, RequestOptions options) throws StripeException {
    return update(id, (FormUpdateParams) null, options);
  }
  /** Submits a response to a risk Form. */
  public Form update(String id) throws StripeException {
    return update(id, (FormUpdateParams) null, (RequestOptions) null);
  }
  /** Submits a response to a risk Form. */
  public Form update(String id, FormUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/risk/forms/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, Form.class);
  }
}
