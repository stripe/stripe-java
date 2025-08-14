// File generated from our OpenAPI spec
package com.stripe.service.v2.billing.collectionsettings;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.StripeCollection;
import com.stripe.model.v2.billing.CollectionSettingVersion;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.billing.collectionsettings.VersionListParams;

public final class VersionService extends ApiService {
  public VersionService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** List all CollectionSettingVersions by CollectionSetting ID. */
  public StripeCollection<CollectionSettingVersion> list(
      String collectionSettingId, VersionListParams params) throws StripeException {
    return list(collectionSettingId, params, (RequestOptions) null);
  }
  /** List all CollectionSettingVersions by CollectionSetting ID. */
  public StripeCollection<CollectionSettingVersion> list(
      String collectionSettingId, RequestOptions options) throws StripeException {
    return list(collectionSettingId, (VersionListParams) null, options);
  }
  /** List all CollectionSettingVersions by CollectionSetting ID. */
  public StripeCollection<CollectionSettingVersion> list(String collectionSettingId)
      throws StripeException {
    return list(collectionSettingId, (VersionListParams) null, (RequestOptions) null);
  }
  /** List all CollectionSettingVersions by CollectionSetting ID. */
  public StripeCollection<CollectionSettingVersion> list(
      String collectionSettingId, VersionListParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/billing/collection_settings/%s/versions",
            ApiResource.urlEncodeId(collectionSettingId));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(
        request, new TypeToken<StripeCollection<CollectionSettingVersion>>() {}.getType());
  }
  /** Retrieve a CollectionSetting Version by ID. */
  public CollectionSettingVersion retrieve(String collectionSettingId, String id)
      throws StripeException {
    return retrieve(collectionSettingId, id, (RequestOptions) null);
  }
  /** Retrieve a CollectionSetting Version by ID. */
  public CollectionSettingVersion retrieve(
      String collectionSettingId, String id, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v2/billing/collection_settings/%s/versions/%s",
            ApiResource.urlEncodeId(collectionSettingId), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, CollectionSettingVersion.class);
  }
}
