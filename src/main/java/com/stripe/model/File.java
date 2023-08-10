// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import com.stripe.param.FileRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This is an object representing a file hosted on Stripe's servers. The file may have been uploaded
 * by yourself using the <a href="https://stripe.com/docs/api#create_file">create file</a> request
 * (for example, when uploading dispute evidence) or it may have been created by Stripe (for
 * example, the results of a <a href="https://stripe.com/docs/api#scheduled_queries">Sigma scheduled
 * query</a>).
 *
 * <p>Related guide: <a href="https://stripe.com/docs/file-upload">File upload guide</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class File extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The time at which the file expires and is no longer available in epoch seconds. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** A filename for the file, suitable for saving to a filesystem. */
  @SerializedName("filename")
  String filename;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * A list of <a href="https://stripe.com/docs/api#file_links">file links</a> that point at this
   * file.
   */
  @SerializedName("links")
  FileLinkCollection links;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code file}.
   */
  @SerializedName("object")
  String object;

  /**
   * The <a href="https://stripe.com/docs/file-upload#uploading-a-file">purpose</a> of the uploaded
   * file.
   *
   * <p>One of {@code account_requirement}, {@code additional_verification}, {@code business_icon},
   * {@code business_logo}, {@code customer_signature}, {@code dispute_evidence}, {@code
   * document_provider_identity_document}, {@code finance_report_run}, {@code identity_document},
   * {@code identity_document_downloadable}, {@code pci_document}, {@code selfie}, {@code
   * sigma_scheduled_query}, {@code tax_document_user_upload}, or {@code
   * terminal_reader_splashscreen}.
   */
  @SerializedName("purpose")
  String purpose;

  /** The size in bytes of the file object. */
  @SerializedName("size")
  Long size;

  /** A user friendly title for the document. */
  @SerializedName("title")
  String title;

  /**
   * The type of the file returned (e.g., {@code csv}, {@code pdf}, {@code jpg}, or {@code png}).
   */
  @SerializedName("type")
  String type;

  /** The URL from which the file can be downloaded using your live secret API key. */
  @SerializedName("url")
  String url;

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries should have support for sending {@code
   * multipart/form-data}.
   */
  public static File create(Map<String, Object> params) throws StripeException {
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
  public static File create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.FILES,
            ApiResource.RequestMethod.POST,
            path,
            params,
            File.class,
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
  public static File create(FileCreateParams params) throws StripeException {
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
  public static File create(FileCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
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
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            FileCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(FileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(FileListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            FileCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public static File retrieve(String file) throws StripeException {
    return retrieve(file, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public static File retrieve(String file, RequestOptions options) throws StripeException {
    return retrieve(file, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public static File retrieve(String file, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            File.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object. To access file contents, see the <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">File Upload Guide</a>.
   */
  public static File retrieve(String file, FileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            File.class,
            options,
            ApiMode.V1);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(links, responseGetter);
  }
}
