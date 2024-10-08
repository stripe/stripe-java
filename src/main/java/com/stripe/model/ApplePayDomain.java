// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.ApplePayDomainCreateParams;
import com.stripe.param.ApplePayDomainListParams;
import com.stripe.param.ApplePayDomainRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApplePayDomain extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  @SerializedName("domain_name")
  String domainName;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code apple_pay_domain}.
   */
  @SerializedName("object")
  String object;

  /** Create an apple pay domain. */
  public static ApplePayDomain create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an apple pay domain. */
  public static ApplePayDomain create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apple_pay/domains";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, ApplePayDomain.class);
  }

  /** Create an apple pay domain. */
  public static ApplePayDomain create(ApplePayDomainCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Create an apple pay domain. */
  public static ApplePayDomain create(ApplePayDomainCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apple_pay/domains";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ApplePayDomain.class);
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
    String path = String.format("/v1/apple_pay/domains/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, path, params, options);
    return getResponseGetter().request(request, ApplePayDomain.class);
  }

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/apple_pay/domains";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ApplePayDomainCollection.class);
  }

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(ApplePayDomainListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List apple pay domains. */
  public static ApplePayDomainCollection list(
      ApplePayDomainListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/apple_pay/domains";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ApplePayDomainCollection.class);
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
    String path = String.format("/v1/apple_pay/domains/%s", ApiResource.urlEncodeId(domain));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, ApplePayDomain.class);
  }

  /** Retrieve an apple pay domain. */
  public static ApplePayDomain retrieve(
      String domain, ApplePayDomainRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/apple_pay/domains/%s", ApiResource.urlEncodeId(domain));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, ApplePayDomain.class);
  }
}
