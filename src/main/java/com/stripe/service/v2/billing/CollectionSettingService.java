// File generated from our OpenAPI spec
package com.stripe.service.v2.billing;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.CollectionSetting;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.CollectionSettingCreateParams;
import com.stripe.param.v2.billing.CollectionSettingListParams;
import com.stripe.param.v2.billing.CollectionSettingUpdateParams;

public final class CollectionSettingService extends ApiService {
  public CollectionSettingService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all CollectionSetting objects. */
  public StripeCollection<CollectionSetting> list(CollectionSettingListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** List all CollectionSetting objects. */
  public StripeCollection<CollectionSetting> list(RequestOptions options) throws StripeException {
    return list((CollectionSettingListParams) null, options);
  }
  /** List all CollectionSetting objects. */
  public StripeCollection<CollectionSetting> list() throws StripeException {
    return list((CollectionSettingListParams) null, (RequestOptions) null);
  }
  /** List all CollectionSetting objects. */
  public StripeCollection<CollectionSetting> list(
      CollectionSettingListParams params, RequestOptions options) throws StripeException {
    String path = "/v2/billing/collection_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<CollectionSetting>>() {}.getType());
  }
  /** Create a CollectionSetting object. */
  public CollectionSetting create(CollectionSettingCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Create a CollectionSetting object. */
  public CollectionSetting create(RequestOptions options) throws StripeException {
    return create((CollectionSettingCreateParams) null, options);
  }
  /** Create a CollectionSetting object. */
  public CollectionSetting create() throws StripeException {
    return create((CollectionSettingCreateParams) null, (RequestOptions) null);
  }
  /** Create a CollectionSetting object. */
  public CollectionSetting create(CollectionSettingCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v2/billing/collection_settings";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CollectionSetting.class);
  }
  /** Retrieve a CollectionSetting by ID. */
  public CollectionSetting retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /** Retrieve a CollectionSetting by ID. */
  public CollectionSetting retrieve(String id, RequestOptions options) throws StripeException {
    String path = String.format("/v2/billing/collection_settings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CollectionSetting.class);
  }
  /** Update fields on an existing CollectionSetting. */
  public CollectionSetting update(String id, CollectionSettingUpdateParams params)
      throws StripeException {
    return update(id, params, (RequestOptions) null);
  }
  /** Update fields on an existing CollectionSetting. */
  public CollectionSetting update(String id, RequestOptions options) throws StripeException {
    return update(id, (CollectionSettingUpdateParams) null, options);
  }
  /** Update fields on an existing CollectionSetting. */
  public CollectionSetting update(String id) throws StripeException {
    return update(id, (CollectionSettingUpdateParams) null, (RequestOptions) null);
  }
  /** Update fields on an existing CollectionSetting. */
  public CollectionSetting update(
      String id, CollectionSettingUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v2/billing/collection_settings/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, CollectionSetting.class);
  }

  public com.stripe.service.v2.billing.collectionsettings.VersionService versions() {
    return new com.stripe.service.v2.billing.collectionsettings.VersionService(
        this.getResponseGetter());
  }
}
