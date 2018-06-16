package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApplePayDomain extends APIResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String domainName;
  Boolean livemode;

  // <editor-fold desc="create">
  /**
   * Create an Apple Pay domain.
   */
  public static ApplePayDomain create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  /**
   * Create an Apple Pay domain.
   */
  public static ApplePayDomain create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, getClassURL(), params, ApplePayDomain.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an Apple Pay domain.
   */
  public DeletedApplePayDomain delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return delete(null);
  }

  /**
   * Delete an Apple Pay domain.
   */
  public DeletedApplePayDomain delete(RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return request(RequestMethod.DELETE, getInstanceURL(id), null, DeletedApplePayDomain.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all Apple Pay domains.
   */
  public static ApplePayDomainCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  /**
   * List all Apple Pay domains.
   */
  public static ApplePayDomainCollection list(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return requestCollection(getClassURL(), params, ApplePayDomainCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an Apple Pay domain.
   */
  public static ApplePayDomain retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an Apple Pay domain.
   */
  public static ApplePayDomain retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, getInstanceURL(id), null, ApplePayDomain.class, options);
  }
  // </editor-fold>

  private static String getClassURL() {
    return String.format("%s/v1/%s", Stripe.getApiBase(), "apple_pay/domains");
  }

  private static String getInstanceURL(String id) {
    if (id != null && !id.isEmpty()) {
      return String.format("%s/%s", getClassURL(), id);
    }
    return null;
  }
}
