// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.billsettings;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.BillSettingVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.billsettings.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all BillSettingVersions by BillSetting ID. */
  public StripeCollection<BillSettingVersion> list(String billSettingId, VersionListParams params)
      throws StripeException {
    return list(billSettingId, params, (RequestOptions) null);
  }
  /** List all BillSettingVersions by BillSetting ID. */
  public StripeCollection<BillSettingVersion> list(String billSettingId, RequestOptions options)
      throws StripeException {
    return list(billSettingId, (VersionListParams) null, options);
  }
  /** List all BillSettingVersions by BillSetting ID. */
  public StripeCollection<BillSettingVersion> list(String billSettingId) throws StripeException {
    return list(billSettingId, (VersionListParams) null, (RequestOptions) null);
  }
  /** List all BillSettingVersions by BillSetting ID. */
  public StripeCollection<BillSettingVersion> list(
      String billSettingId, VersionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/bill_settings/%s/versions", ApiResource.urlEncodeId(billSettingId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<BillSettingVersion>>() {}.getType());
  }
  /** Retrieve a BillSettingVersion by ID. */
  public BillSettingVersion retrieve(String billSettingId, String id) throws StripeException {
    return retrieve(billSettingId, id, (RequestOptions) null);
  }
  /** Retrieve a BillSettingVersion by ID. */
  public BillSettingVersion retrieve(String billSettingId, String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/bill_settings/%s/versions/%s",
            ApiResource.urlEncodeId(billSettingId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, BillSettingVersion.class);
  }
}
