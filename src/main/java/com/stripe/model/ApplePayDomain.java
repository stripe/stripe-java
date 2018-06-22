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
public class ApplePayDomain extends ApiResource implements HasId {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  Long created;
  String domainName;
  Boolean livemode;

  // <editor-fold desc="create">
  /**
   * Create an Apple Pay domain.
   */
  public static ApplePayDomain create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Create an Apple Pay domain.
   */
  public static ApplePayDomain create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return request(RequestMethod.POST, getClassUrl(), params, ApplePayDomain.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Delete an Apple Pay domain.
   */
  public DeletedApplePayDomain delete() throws StripeException {
    return delete(null);
  }

  /**
   * Delete an Apple Pay domain.
   */
  public DeletedApplePayDomain delete(RequestOptions options) throws StripeException {
    return request(RequestMethod.DELETE, getInstanceUrl(id), null, DeletedApplePayDomain.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="list">
  /**
   * List all Apple Pay domains.
   */
  public static ApplePayDomainCollection list(Map<String, Object> params) throws StripeException {
    return list(params, null);
  }

  /**
   * List all Apple Pay domains.
   */
  public static ApplePayDomainCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    return requestCollection(getClassUrl(), params, ApplePayDomainCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve an Apple Pay domain.
   */
  public static ApplePayDomain retrieve(String id) throws StripeException {
    return retrieve(id, null);
  }

  /**
   * Retrieve an Apple Pay domain.
   */
  public static ApplePayDomain retrieve(String id, RequestOptions options) throws StripeException {
    return request(RequestMethod.GET, getInstanceUrl(id), null, ApplePayDomain.class, options);
  }
  // </editor-fold>

  private static String getClassUrl() {
    return String.format("%s/v1/%s", Stripe.getApiBase(), "apple_pay/domains");
  }

  private static String getInstanceUrl(String id) {
    if (id != null && !id.isEmpty()) {
      return String.format("%s/%s", getClassUrl(), id);
    }
    return null;
  }
}
