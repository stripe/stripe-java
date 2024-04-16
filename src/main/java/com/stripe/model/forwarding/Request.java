// File generated from our OpenAPI spec
package com.stripe.model.forwarding;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.forwarding.RequestCreateParams;
import com.stripe.param.forwarding.RequestListParams;
import com.stripe.param.forwarding.RequestRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Instructs Stripe to make a request on your behalf using the destination URL. The destination URL
 * is activated by Stripe at the time of onboarding. Stripe verifies requests with your credentials
 * provided during onboarding, and injects card details from the payment_method into the request.
 *
 * <p>Stripe redacts all sensitive fields and headers, including authentication credentials and card
 * numbers, before storing the request and response data in the forwarding Request object, which are
 * subject to a 30-day retention period.
 *
 * <p>You can provide a Stripe idempotency key to make sure that requests with the same key result
 * in only one outbound request. The Stripe idempotency key provided should be unique and different
 * from any idempotency keys provided on the underlying third-party request.
 *
 * <p>Forwarding Requests are synchronous requests that return a response or time out according to
 * Stripe’s limits.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/payments/forwarding">Forward card details to
 * third-party API endpoints</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Request extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

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
   * <p>Equal to {@code forwarding.request}.
   */
  @SerializedName("object")
  String object;

  /**
   * The PaymentMethod to insert into the forwarded request. Forwarding previously consumed
   * PaymentMethods is allowed.
   */
  @SerializedName("payment_method")
  String paymentMethod;

  /** The field kinds to be replaced in the forwarded request. */
  @SerializedName("replacements")
  List<String> replacements;

  /** Context about the request from Stripe's servers to the destination endpoint. */
  @SerializedName("request_context")
  RequestContext requestContext;

  /** The request that was sent to the destination endpoint. We redact any sensitive fields. */
  @SerializedName("request_details")
  RequestDetails requestDetails;

  /** The response that the destination endpoint returned to us. We redact any sensitive fields. */
  @SerializedName("response_details")
  ResponseDetails responseDetails;

  /** The destination URL for the forwarded request. Must be supported by the config. */
  @SerializedName("url")
  String url;

  /** Creates a ForwardingRequest object. */
  public static Request create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a ForwardingRequest object. */
  public static Request create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Request.class);
  }

  /** Creates a ForwardingRequest object. */
  public static Request create(RequestCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a ForwardingRequest object. */
  public static Request create(RequestCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Request.class);
  }

  /** Lists all ForwardingRequest objects. */
  public static RequestCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all ForwardingRequest objects. */
  public static RequestCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, RequestCollection.class);
  }

  /** Lists all ForwardingRequest objects. */
  public static RequestCollection list(RequestListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists all ForwardingRequest objects. */
  public static RequestCollection list(RequestListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/forwarding/requests";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, RequestCollection.class);
  }

  /** Retrieves a ForwardingRequest object. */
  public static Request retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a ForwardingRequest object. */
  public static Request retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a ForwardingRequest object. */
  public static Request retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/forwarding/requests/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getGlobalResponseGetter().request(request, Request.class);
  }

  /** Retrieves a ForwardingRequest object. */
  public static Request retrieve(String id, RequestRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/forwarding/requests/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getGlobalResponseGetter().request(request, Request.class);
  }

  /** Metadata about the forwarded request. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestContext extends StripeObject {
    /** The time it took in milliseconds for the destination endpoint to respond. */
    @SerializedName("destination_duration")
    Long destinationDuration;

    /** The IP address of the destination. */
    @SerializedName("destination_ip_address")
    String destinationIpAddress;
  }

  /** Details about the request forwarded to the destination endpoint. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class RequestDetails extends StripeObject {
    /** The body payload to send to the destination endpoint. */
    @SerializedName("body")
    String body;

    /**
     * The headers to include in the forwarded request. Can be omitted if no additional headers
     * (excluding Stripe-generated ones such as the Content-Type header) should be included.
     */
    @SerializedName("headers")
    List<Request.RequestDetails.Header> headers;

    /**
     * The HTTP method used to call the destination endpoint.
     *
     * <p>Equal to {@code POST}.
     */
    @SerializedName("http_method")
    String httpMethod;

    /** Header data. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Header extends StripeObject {
      /** The header name. */
      @SerializedName("name")
      String name;

      /** The header value. */
      @SerializedName("value")
      String value;
    }
  }

  /** Details about the response from the destination endpoint. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ResponseDetails extends StripeObject {
    /** The response body from the destination endpoint to Stripe. */
    @SerializedName("body")
    String body;

    /** HTTP headers that the destination endpoint returned. */
    @SerializedName("headers")
    List<Request.ResponseDetails.Header> headers;

    /** The HTTP status code that the destination endpoint returned. */
    @SerializedName("status")
    Long status;

    /** Header data. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Header extends StripeObject {
      /** The header name. */
      @SerializedName("name")
      String name;

      /** The header value. */
      @SerializedName("value")
      String value;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(requestContext, responseGetter);
    trySetResponseGetter(requestDetails, responseGetter);
    trySetResponseGetter(responseDetails, responseGetter);
  }
}
