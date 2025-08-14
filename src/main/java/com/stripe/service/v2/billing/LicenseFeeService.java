// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.LicenseFee;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.LicenseFeeCreateParams;
import com.stripe.param.v2.billing.LicenseFeeListParams;
import com.stripe.param.v2.billing.LicenseFeeUpdateParams;

public final class LicenseFeeService extends ApiService {
  public LicenseFeeService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all LicenseFee objects. */
  public StripeCollection<LicenseFee> list(LicenseFeeListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all LicenseFee objects. */
  public StripeCollection<LicenseFee> list(LicenseFeeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/license_fees";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<LicenseFee>>() {}.getType());
  }
  /** Create a LicenseFee object. */
  public LicenseFee create(LicenseFeeCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a LicenseFee object. */
  public LicenseFee create(LicenseFeeCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/license_fees";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, LicenseFee.class);
  }
  /** Retrieve a LicenseFee object. */
  public LicenseFee retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a LicenseFee object. */
  public LicenseFee retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/license_fees/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, LicenseFee.class);
  }
  /** Update a LicenseFee object. */
  public LicenseFee update(String id, LicenseFeeUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update a LicenseFee object. */
  public LicenseFee update(String id, LicenseFeeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/license_fees/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, LicenseFee.class);
  }

  public com.stripe.service.v2.billing.licensefees.VersionService versions() {
    return new com.stripe.service.v2.billing.licensefees.VersionService(this.getResponseGetter());
  }
}
