// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import com.stripe.param.FileRetrieveParams;

public final class FileService extends ApiService {
  public FileService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public StripeCollection<File> list(FileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public StripeCollection<File> list(RequestOptions options) throws StripeException {
    return list((FileListParams) null, options);
  }
  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public StripeCollection<File> list() throws StripeException {
    return list((FileListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public StripeCollection<File> list(FileListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, new TypeToken<StripeCollection<File>>() {}.getType());
  }
  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public File create(FileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public File create(FileCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/files";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, File.class);
  }
  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public File retrieve(String file, FileRetrieveParams params) throws StripeException {
    return retrieve(file, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public File retrieve(String file, RequestOptions options) throws StripeException {
    return retrieve(file, (FileRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public File retrieve(String file) throws StripeException {
    return retrieve(file, (FileRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public File retrieve(String file, FileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return this.request(request, File.class);
  }
}
