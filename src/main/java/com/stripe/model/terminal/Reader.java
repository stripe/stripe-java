package com.stripe.model.terminal;

import com.stripe.Stripe;
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
  /** Always true for a deleted object. */
  Boolean deleted;

  /** The current software version of the reader. */
  String deviceSwVersion;

  /** Type of reader, e.g., `verifone_P400` or `bbpos_chipper2x`. */
  String deviceType;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /** The local IP address of the reader. */
  String ipAddress;

  /** Custom label given to the reader for easier identification. */
  String label;

  /** The location identifier of the reader. */
  String location;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** Serial number of the reader. */
  String serialNumber;

  /** The networking status of the reader. */
  String status;

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/terminal/readers/%s", this.getId()));
    return request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader, RequestOptions options) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/terminal/readers/%s", reader));
    return request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return requestCollection(url, params, ReaderCollection.class, options);
  }
}
