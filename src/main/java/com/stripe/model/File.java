// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
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
 * This object represents files hosted on Stripe's servers. You can upload files with the <a
 * href="https://stripe.com/docs/api#create_file">create file</a> request (for example, when
 * uploading dispute evidence). Stripe also creates files independently (for example, the results of
 * a <a href="https://stripe.com/docs/api#scheduled_queries">Sigma scheduled query</a>).
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

  /** The file expires and isn't available at this time in epoch seconds. */
  @SerializedName("expires_at")
  Long expiresAt;

  /** The suitable name for saving the file to a filesystem. */
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

  /** The size of the file object in bytes. */
  @SerializedName("size")
  Long size;

  /** A suitable title for the document. */
  @SerializedName("title")
  String title;

  /**
   * The returned file type (for example, {@code csv}, {@code pdf}, {@code jpg}, or {@code png}).
   */
  @SerializedName("type")
  String type;

  /** Use your live secret API key to download the file from this URL. */
  @SerializedName("url")
  String url;

  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public static File create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public static File create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiRequest request =
        new ApiRequest(BaseAddress.FILES, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, File.class);
  }

  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public static File create(FileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To upload a file to Stripe, you need to send a request of type {@code multipart/form-data}.
   * Include the file you want to upload in the request, and the parameters for creating a file.
   *
   * <p>All of Stripe’s officially supported Client libraries support sending {@code
   * multipart/form-data}.
   */
  public static File create(FileCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.FILES,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, File.class);
  }

  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public static FileCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public static FileCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, FileCollection.class);
  }

  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public static FileCollection list(FileListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of the files that your account has access to. Stripe sorts and returns the files
   * by their creation dates, placing the most recently created files at the top.
   */
  public static FileCollection list(FileListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/files";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, FileCollection.class);
  }

  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public static File retrieve(String file) throws StripeException {
    return retrieve(file, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public static File retrieve(String file, RequestOptions options) throws StripeException {
    return retrieve(file, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public static File retrieve(String file, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, File.class);
  }

  /**
   * Retrieves the details of an existing file object. After you supply a unique file ID, Stripe
   * returns the corresponding file object. Learn how to <a
   * href="https://stripe.com/docs/file-upload#download-file-contents">access file contents</a>.
   */
  public static File retrieve(String file, FileRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/files/%s", ApiResource.urlEncodeId(file));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, File.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(links, responseGetter);
  }
}
