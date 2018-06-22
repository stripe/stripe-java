package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FileUpload extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String purpose;
  Long size;
  String type;
  String url;

  // <editor-fold desc="create">
  /**
   * Create a file upload.
   */
  public static FileUpload create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a file upload.
   */
  public static FileUpload create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return multipartRequest(RequestMethod.POST, classUrl(FileUpload.class, Stripe.getUploadBase()),
        params, FileUpload.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all file uploads.
   */
  public static FileUploadCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all file uploads.
   */
  public static FileUploadCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(FileUpload.class, Stripe.getUploadBase()),
        params, FileUploadCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a file upload.
   */
  public static FileUpload retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a file upload.
   */
  public static FileUpload retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, instanceUrl(FileUpload.class, id, Stripe.getUploadBase()),
        null, FileUpload.class, options);
  }
  // </editor-fold>
}
