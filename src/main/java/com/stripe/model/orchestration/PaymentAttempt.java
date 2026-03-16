// File generated from our OpenAPI spec
package com.stripe.model.orchestration;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.orchestration.PaymentAttemptRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** Represents orchestration information for a payment attempt record (e.g. return url). */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentAttempt extends ApiResource implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code orchestration.payment_attempt}.
   */
  @SerializedName("object")
  String object;

  /** If present, the return URL for this payment attempt. */
  @SerializedName("return_url")
  String returnUrl;

  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public static PaymentAttempt retrieve(String paymentAttemptRecord) throws StripeException {
    return retrieve(paymentAttemptRecord, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public static PaymentAttempt retrieve(String paymentAttemptRecord, RequestOptions options)
      throws StripeException {
    return retrieve(paymentAttemptRecord, (Map<String, Object>) null, options);
  }

  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public static PaymentAttempt retrieve(
      String paymentAttemptRecord, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/orchestration/payment_attempts/%s", ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentAttempt.class);
  }

  /** Retrieves orchestration information for the given payment attempt record (e.g. return url). */
  public static PaymentAttempt retrieve(
      String paymentAttemptRecord, PaymentAttemptRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/orchestration/payment_attempts/%s", ApiResource.urlEncodeId(paymentAttemptRecord));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentAttempt.class);
  }
}
