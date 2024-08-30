// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.AssociationFindParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Tax Association exposes the Tax Transactions that Stripe attempted to create on your behalf
 * based on the PaymentIntent input.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Association extends ApiResource implements HasId {
  /**
   * The <a href="https://stripe.com/docs/api/tax/calculations/object">Tax Calculation</a> that was
   * included in PaymentIntent.
   */
  @SerializedName("calculation")
  String calculation;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.association}.
   */
  @SerializedName("object")
  String object;

  /**
   * The <a href="https://stripe.com/docs/api/payment_intents/object">PaymentIntent</a> that this
   * Tax Association is tracking.
   */
  @SerializedName("payment_intent")
  String paymentIntent;

  /**
   * Status of the Tax Association.
   *
   * <p>One of {@code committed}, or {@code errored}.
   */
  @SerializedName("status")
  String status;

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(Map<String, Object> params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/associations/find";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Association.class);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(AssociationFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /** Finds a tax association object by PaymentIntent id. */
  public static Association find(AssociationFindParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/tax/associations/find";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Association.class);
  }
}
