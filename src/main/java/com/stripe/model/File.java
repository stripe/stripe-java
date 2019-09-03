package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.FileCreateParams;
import com.stripe.param.FileListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class File extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** A filename for the file, suitable for saving to a filesystem. */
  @SerializedName("filename")
  String filename;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("links")
  FileLinkCollection links;

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /**
   * The purpose of the file. Possible values are {@code business_icon}, {@code business_logo},
   * {@code customer_signature}, {@code dispute_evidence}, {@code finance_report_run}, {@code
   * identity_document}, {@code pci_document}, {@code sigma_scheduled_query}, or {@code
   * tax_document_user_upload}.
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
   */
  public static File create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   */
  public static File create(FileCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   */
  public static File create(FileCreateParams params, RequestOptions options)
      throws StripeException {
    checkNullTypedParams(classUrl(File.class, Stripe.getUploadBase()), params);
    return create(params.toMap(), options);
  }

  /**
   * To upload a file to Stripe, you’ll need to send a request of type {@code multipart/form-data}.
   * The request should contain the file you would like to upload, as well as the parameters for
   * creating a file.
   */
  public static File create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return multipartRequest(
        RequestMethod.POST,
        classUrl(File.class, Stripe.getUploadBase()),
        params,
        File.class,
        options);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * Returns a list of the files that your account has access to. The files are returned sorted by
   * creation date, with the most recently created files appearing first.
   */
  public static FileCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(File.class), params, FileCollection.class, options);
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
    return requestCollection(classUrl(File.class), params, FileCollection.class, options);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   */
  public static File retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   */
  public static File retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieves the details of an existing file object. Supply the unique file ID from a file, and
   * Stripe will return the corresponding file object.
   */
  public static File retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(File.class, id), params, File.class, options);
  }
}
