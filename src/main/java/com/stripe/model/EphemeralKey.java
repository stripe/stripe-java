package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EphemeralKey extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  Long expires;
  Boolean livemode;
  String secret;
  List<EphemeralKeyAssociatedObject> associatedObjects;
  transient String rawJson;

  // <editor-fold desc="create">
  /**
   * Creates an ephemeral key.
   *
   * @param params request parameters
   * @param options request options. {@code stripeVersion} is required when creating ephemeral
   *     keys.
   * @return the new ephemeral key
   */
  public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    if (options.getStripeVersion() == null) {
      throw new IllegalArgumentException("stripeVersion must be specified in RequestOptions");
    }

    return request(RequestMethod.POST, classUrl(EphemeralKey.class), params, EphemeralKey.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an ephemeral key.
   */
  public EphemeralKey delete()
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return delete(null);
  }

  /**
   * Delete an ephemeral key.
   */
  public EphemeralKey delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.DELETE, instanceUrl(EphemeralKey.class, this.id), null,
        EphemeralKey.class, options);
  }
  // </editor-fold>
}
