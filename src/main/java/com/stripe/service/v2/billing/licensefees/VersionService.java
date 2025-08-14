// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.licensefees;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.LicenseFeeVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.licensefees.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all versions of a LicenseFee objects. */
  public StripeCollection<LicenseFeeVersion> list(String licenseFeeId, VersionListParams params)
      throws StripeException {
    return list(licenseFeeId, params, (RequestOptions) null);
  }
  /** List all versions of a LicenseFee objects. */
  public StripeCollection<LicenseFeeVersion> list(String licenseFeeId, RequestOptions options)
      throws StripeException {
    return list(licenseFeeId, (VersionListParams) null, options);
  }
  /** List all versions of a LicenseFee objects. */
  public StripeCollection<LicenseFeeVersion> list(String licenseFeeId) throws StripeException {
    return list(licenseFeeId, (VersionListParams) null, (RequestOptions) null);
  }
  /** List all versions of a LicenseFee objects. */
  public StripeCollection<LicenseFeeVersion> list(
      String licenseFeeId, VersionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/license_fees/%s/versions", ApiResource.urlEncodeId(licenseFeeId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<LicenseFeeVersion>>() {}.getType());
  }
  /** Retrieve a LicenseFeeVersion object. */
  public LicenseFeeVersion retrieve(String licenseFeeId, String id) throws StripeException {
    return retrieve(licenseFeeId, id, (RequestOptions) null);
  }
  /** Retrieve a LicenseFeeVersion object. */
  public LicenseFeeVersion retrieve(String licenseFeeId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/license_fees/%s/versions/%s",
            ApiResource.urlEncodeId(licenseFeeId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, LicenseFeeVersion.class);
  }
}
