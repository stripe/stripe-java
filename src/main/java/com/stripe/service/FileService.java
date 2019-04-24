package com.stripe.service;

import static com.stripe.net.ApiResource.multipartRequest;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.FileCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import com.stripe.param.FileRetrieveParams;
import java.util.Optional;

public class FileService extends ApiService {
  /**
   * To upload a file to Stripe, you’ll need to send a request of type <code>multipart/form-data
   * </code>. The request should contain the file you would like to upload, as well as the
   * parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported API libraries should have support for sending <code>
   * multipart/form-data</code>.
   */
  public File create(FileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type <code>multipart/form-data
   * </code>. The request should contain the file you would like to upload, as well as the
   * parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported API libraries should have support for sending <code>
   * multipart/form-data</code>.
   */
  public File create(FileCreateParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getUploadBase(), "/v1/files");
    return multipartRequest(
        ApiResource.RequestMethod.POST,
        url,
        Optional.ofNullable(params).orElse(FileCreateParams.builder().build()).toMap(),
        File.class,
        options);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public FileCollection list(FileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public FileCollection list(FileListParams params, RequestOptions options) throws StripeException {
    String url = resourceUrl("/v1/files");
    return requestCollection(url, params, FileCollection.class, options);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   */
  public File retrieve(String file, FileRetrieveParams params) throws StripeException {
    return retrieve(file, params, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   */
  public File retrieve(String file, FileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/files/%s", file);
    return request(ApiResource.RequestMethod.GET, url, params, File.class, options);
  }
}
