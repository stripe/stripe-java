// File generated from our OpenAPI spec
package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiMode;
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
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public StripeCollection<File> list(FileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }
  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public StripeCollection<File> list(RequestOptions options) throws StripeException {
    return list((FileListParams) null, options);
  }
  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public StripeCollection<File> list() throws StripeException {
    return list((FileListParams) null, (RequestOptions) null);
  }
  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public StripeCollection<File> list(FileListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            new TypeToken<StripeCollection<File>>() {}.getType(),
            options,
            ApiMode.V1);
  }
  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries should have support for sending {@code
   * multipart/form-data}.
   */
  public File create(FileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }
  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries should have support for sending {@code
   * multipart/form-data}.
   */
  public File create(FileCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/files";
    return getResponseGetter()
        .request(
            BaseAddress.FILES,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            File.class,
            options,
            ApiMode.V1);
  }
  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public File retrieve(String file, FileRetrieveParams params) throws StripeException {
    return retrieve(file, params, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public File retrieve(String file, RequestOptions options) throws StripeException {
    return retrieve(file, (FileRetrieveParams) null, options);
  }
  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public File retrieve(String file) throws StripeException {
    return retrieve(file, (FileRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public File retrieve(String file, FileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            File.class,
            options,
            ApiMode.V1);
  }
}
