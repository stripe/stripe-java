package com.stripe.service;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.File;
import com.stripe.model.StripeCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import com.stripe.util.StringUtils;
import java.lang.reflect.Type;

public class FileService extends Service<File> {
  public FileService(StripeClient client) {
    super(client);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   *
   * @param params the request parameters
   * @return the created file
   * @throws StripeException if the request fails
   */
  public File create(FileCreateParams params) throws StripeException {
    return this.create(params, null);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the created file
   * @throws StripeException if the request fails
   */
  public File create(FileCreateParams params, RequestOptions options) throws StripeException {
    options = this.setupRequestOptionsForFilesRequest(options);
    return this.request(File.class, ApiResource.RequestMethod.POST, "/v1/files", params, options);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   *
   * @return the list of files
   * @throws StripeException if the request fails
   */
  public StripeCollection<File> list() throws StripeException {
    return this.list(null, null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   *
   * @param params the request parameters
   * @return the list of files
   * @throws StripeException if the request fails
   */
  public StripeCollection<File> list(FileListParams params) throws StripeException {
    return this.list(params, null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   *
   * @param params the request parameters
   * @param options the special options for the request
   * @return the list of files
   * @throws StripeException if the request fails
   */
  public StripeCollection<File> list(FileListParams params, RequestOptions options)
      throws StripeException {
    Type type = new TypeToken<StripeCollection<File>>() {}.getType();
    return this.request(type, ApiResource.RequestMethod.GET, "/v1/files", params, options);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   *
   * @param id the ID of the file to retrieve
   * @return the retrieved file
   * @throws StripeException if the request fails
   */
  public File retrieve(String id) throws StripeException {
    return this.retrieve(id, null);
  }

  // TODO we should have a FileRetrieveParams class even if there are no parameters
  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   *
   * @param id the ID of the file to retrieve
   * @param options the special options for the request
   * @return the retrieved file
   * @throws StripeException if the request fails
   */
  public File retrieve(String id, RequestOptions options) throws StripeException {
    return this.request(
        File.class,
        ApiResource.RequestMethod.GET,
        String.format("/v1/files/%s", StringUtils.urlEncode(id)),
        null,
        options);
  }

  private RequestOptions setupRequestOptionsForFilesRequest(RequestOptions options) {
    if (options == null) {
      options =
          RequestOptions.builder()
              .setApiKey(this.getClient().getApiKey())
              .setClientId(this.getClient().getClientId())
              .build();
    }

    if (options.getBaseUrl() == null) {
      options = options.withBaseUrl(this.getClient().getFilesBase());
    }

    return options;
  }
}
