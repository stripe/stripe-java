package com.stripe.model.terminal;

import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Reader extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Boolean deleted;
  String deviceSwVersion;
  String deviceType;
  String ipAddress;
  String label;
  String location;
  String serialNumber;
  String status;

  // <editor-fold desc="create">
  /**
   * Create a reader.
   */
  public static Reader create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create a reader.
   */
  public static Reader create(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.POST, classUrl(Reader.class), params,
            Reader.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete a reader.
   */
  public Reader delete() throws StripeException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a reader.
   */
  public Reader delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, instanceUrl(Reader.class, this.id), null,
        Reader.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all readers.
   */
  public static ReaderCollection list(Map<String, Object> params)
          throws StripeException {
    return list(params, null);
  }

  /**
   * List all readers.
   */
  public static ReaderCollection list(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return requestCollection(classUrl(Reader.class), params,
            ReaderCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a reader.
   */
  public static Reader retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a reader.
   */
  public static Reader retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, null, options);
  }

  /**
   * Retrieve a reader.
   */
  public static Reader retrieve(String id, Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.GET, instanceUrl(Reader.class, id), params, Reader.class,
            options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a reader.
   */
  public Reader update(Map<String, Object> params) throws StripeException {
    return update(params, null);
  }

  /**
   * Update a reader.
   */
  public Reader update(Map<String, Object> params, RequestOptions options)
          throws StripeException {
    return request(RequestMethod.POST, instanceUrl(Reader.class, this.id), params,
            Reader.class, options);
  }
  // </editor-fold>
}
