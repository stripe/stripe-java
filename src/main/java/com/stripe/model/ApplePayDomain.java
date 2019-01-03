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
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /** Always true for a deleted object. */
  Boolean deleted;

  String domainName;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apple_pay/domains");
    return requestCollection(url, params, ApplePayDomainCollection.class, options);
  }

  /** Create an apple pay domain. */
  public static ApplePayDomain create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an apple pay domain. */
  public static ApplePayDomain create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apple_pay/domains");
    return request(ApiResource.RequestMethod.POST, url, params, ApplePayDomain.class, options);
  }

  /** Retrieve an apple pay domain. */
  public static ApplePayDomain retrieve(String domain) throws StripeException {
    return retrieve(domain, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve an apple pay domain. */
  public static ApplePayDomain retrieve(String domain, RequestOptions options)
      throws StripeException {
    return retrieve(domain, (Map<String, Object>) null, options);
  }

  /** Retrieve an apple pay domain. */
  public static ApplePayDomain retrieve(
      String domain, Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/apple_pay/domains/%s", domain));
    return request(ApiResource.RequestMethod.GET, url, params, ApplePayDomain.class, options);
  }

  /** Delete an apple pay domain. */
  public ApplePayDomain delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Delete an apple pay domain. */
  public ApplePayDomain delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Delete an apple pay domain. */
  public ApplePayDomain delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Delete an apple pay domain. */
  public ApplePayDomain delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s", Stripe.getApiBase(), String.format("/v1/apple_pay/domains/%s", this.getId()));
    return request(ApiResource.RequestMethod.DELETE, url, params, ApplePayDomain.class, options);
  }
}
