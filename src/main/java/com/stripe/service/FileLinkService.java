// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.FileLink;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FileLinkCreateParams;
import com.stripe.param.FileLinkListParams;
import com.stripe.param.FileLinkRetrieveParams;
import com.stripe.param.FileLinkUpdateParams;

public final class FileLinkService extends ApiService {
  public FileLinkService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link, FileLinkRetrieveParams params) throws StripeException {
    return retrieve(link, params, (RequestOptions) null);
  }
  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link, RequestOptions options) throws StripeException {
    return retrieve(link, (FileLinkRetrieveParams) null, options);
  }
  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link) throws StripeException {
    return retrieve(link, (FileLinkRetrieveParams) null, (RequestOptions) null);
  }
  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link, FileLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/file_links/%s", ApiResource.urlEncodeId(link));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FileLink.class);
  }
  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link, FileLinkUpdateParams params) throws StripeException {
    return update(link, params, (RequestOptions) null);
  }
  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link, RequestOptions options) throws StripeException {
    return update(link, (FileLinkUpdateParams) null, options);
  }
  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link) throws StripeException {
    return update(link, (FileLinkUpdateParams) null, (RequestOptions) null);
  }
  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link, FileLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/file_links/%s", ApiResource.urlEncodeId(link));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FileLink.class);
  }
  /** Creates a new file link object. */
  public FileLink create(FileLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /** Creates a new file link object. */
  public FileLink create(FileLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/file_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, FileLink.class);
  }
  /** Returns a list of file links. */
  public StripeCollection<FileLink> list(FileLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /** Returns a list of file links. */
  public StripeCollection<FileLink> list(RequestOptions options) throws StripeException {
    return list((FileLinkListParams) null, options);
  }
  /** Returns a list of file links. */
  public StripeCollection<FileLink> list() throws StripeException {
    return list((FileLinkListParams) null, (RequestOptions) null);
  }
  /** Returns a list of file links. */
  public StripeCollection<FileLink> list(FileLinkListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/file_links";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter()
        .request(request, new TypeToken<StripeCollection<FileLink>>() {}.getType());
  }
}
