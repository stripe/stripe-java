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
public class File extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String filename;
  FileLinkCollection links;
  String purpose;
  Long size;
  String title;
  String type;
  String url;

  // <editor-fold desc="create">
  /**
   * Create a file.
   */
  public static File create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Create a file.
   */
  public static File create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return multipartRequest(RequestMethod.POST, classUrl(File.class, Stripe.getUploadBase()),
        params, File.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all files.
   */
  public static FileCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all files.
   */
  public static FileCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(classUrl(File.class), params, FileCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a file.
   */
  public static File retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }

  /**
   * Retrieve a file.
   */
  public static File retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a file.
   */
  public static File retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.GET, instanceUrl(File.class, id), params, File.class, options);
  }
  // </editor-fold>
}
