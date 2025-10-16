// File generated from our OpenAPI spec
package com.stripe.model.delegatedcheckout;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.delegatedcheckout.RequestedSessionConfirmParams;
import com.stripe.param.delegatedcheckout.RequestedSessionCreateParams;
import com.stripe.param.delegatedcheckout.RequestedSessionExpireParams;
import com.stripe.param.delegatedcheckout.RequestedSessionRetrieveParams;
import com.stripe.param.delegatedcheckout.RequestedSessionUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A requested session is a session that has been requested by a customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RequestedSession extends ApiResource implements HasId {
  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** The customer for this requested session. */
  @SerializedName("customer")
  String customer;

  @SerializedName("fulfillment_details")
  FulfillmentDetails fulfillmentDetails;

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
   * <p>Equal to {@code delegated_checkout.requested_session}.
   */
  @SerializedName("object")
  String object;

  /** Confirms a requested session. */
  public RequestedSession confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestedSessionConfirmParams params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /** Confirms a requested session. */
  public RequestedSession confirm(RequestedSessionConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/confirm",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Creates a requested session. */
  public static RequestedSession create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a requested session. */
  public static RequestedSession create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/delegated_checkout/requested_sessions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Creates a requested session. */
  public static RequestedSession create(RequestedSessionCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a requested session. */
  public static RequestedSession create(RequestedSessionCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/delegated_checkout/requested_sessions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Expires a requested session. */
  public RequestedSession expire() throws StripeException {
    return expire((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestOptions options) throws StripeException {
    return expire((Map<String, Object>) null, options);
  }

  /** Expires a requested session. */
  public RequestedSession expire(Map<String, Object> params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire",
            ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestedSessionExpireParams params) throws StripeException {
    return expire(params, (RequestOptions) null);
  }

  /** Expires a requested session. */
  public RequestedSession expire(RequestedSessionExpireParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s/expire",
            ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(String requestedSession) throws StripeException {
    return retrieve(requestedSession, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(String requestedSession, RequestOptions options)
      throws StripeException {
    return retrieve(requestedSession, (Map<String, Object>) null, options);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(
      String requestedSession, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Retrieves a requested session. */
  public static RequestedSession retrieve(
      String requestedSession, RequestedSessionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s",
            ApiResource.urlEncodeId(requestedSession));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, RequestedSession.class);
  }

  /** Updates a requested session. */
  public RequestedSession update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a requested session. */
  public RequestedSession update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /** Updates a requested session. */
  public RequestedSession update(RequestedSessionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a requested session. */
  public RequestedSession update(RequestedSessionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/delegated_checkout/requested_sessions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, RequestedSession.class);
  }

  /**
   * For more details about FulfillmentDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FulfillmentDetails extends StripeObject {}

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(fulfillmentDetails, responseGetter);
  }
}
