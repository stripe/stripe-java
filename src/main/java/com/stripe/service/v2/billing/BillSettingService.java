// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.BillSetting;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.BillSettingCreateParams;
import com.stripe.param.v2.billing.BillSettingListParams;
import com.stripe.param.v2.billing.BillSettingUpdateParams;

public final class BillSettingService extends ApiService {
  public BillSettingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all BillSetting objects. */
  public StripeCollection<BillSetting> list(BillSettingListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all BillSetting objects. */
  public StripeCollection<BillSetting> list(RequestOptions options) throws StripeException {
    return list((BillSettingListParams) null, options);
  }
  /** List all BillSetting objects. */
  public StripeCollection<BillSetting> list() throws StripeException {
    return list((BillSettingListParams) null, (RequestOptions) null);
  }
  /** List all BillSetting objects. */
  public StripeCollection<BillSetting> list(BillSettingListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/bill_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<BillSetting>>() {}.getType());
  }
  /** Create a BillSetting object. */
  public BillSetting create(BillSettingCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a BillSetting object. */
  public BillSetting create(RequestOptions options) throws StripeException {
    return create((BillSettingCreateParams) null, options);
  }
  /** Create a BillSetting object. */
  public BillSetting create() throws StripeException {
    return create((BillSettingCreateParams) null, (RequestOptions) null);
  }
  /** Create a BillSetting object. */
  public BillSetting create(BillSettingCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/bill_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BillSetting.class);
  }
  /** Retrieve a BillSetting object by ID. */
  public BillSetting retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a BillSetting object by ID. */
  public BillSetting retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/bill_settings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, BillSetting.class);
  }
  /** Update fields on an existing BillSetting object. */
  public BillSetting update(String id, BillSettingUpdateParams params) throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update fields on an existing BillSetting object. */
  public BillSetting update(String id, RequestOptions options) throws StripeException {
    return update(id, (BillSettingUpdateParams) null, options);
  }
  /** Update fields on an existing BillSetting object. */
  public BillSetting update(String id) throws StripeException {
    return update(id, (BillSettingUpdateParams) null, (RequestOptions) null);
  }
  /** Update fields on an existing BillSetting object. */
  public BillSetting update(String id, BillSettingUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/bill_settings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BillSetting.class);
  }

  public com.stripe.service.v2.billing.billsettings.VersionService versions() {
    return new com.stripe.service.v2.billing.billsettings.VersionService(this.getResponseGetter());
  }
}
