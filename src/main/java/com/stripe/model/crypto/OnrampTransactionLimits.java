// File generated from our OpenAPI spec
package com.stripe.model.crypto;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.crypto.OnrampTransactionLimitsRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This object represents the limit for the remaining amount that the crypto customer can onramp.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class OnrampTransactionLimits extends ApiResource {
  /** The ID of the crypto customer. */
  @SerializedName("crypto_customer_id")
  String cryptoCustomerId;

  /**
   * The remaining onramp limit for the crypto customer, separated by currency, payment method, and
   * settlement speed.
   *
   * <p>Limits are shown for currencies that correspond to the regions where the customer previously
   * transacted. If the customer has no prior transactions, we return limits for all supported
   * currencies.
   */
  @SerializedName("limits")
  Map<String, Object> limits;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code crypto.onramp_transaction_limits}.
   */
  @SerializedName("object")
  String object;

  /** Retrieves the remaining onramp limit for a crypto customer. */
  public static OnrampTransactionLimits retrieve() throws StripeException {
    return retrieve((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the remaining onramp limit for a crypto customer. */
  public static OnrampTransactionLimits retrieve(RequestOptions options) throws StripeException {
    return retrieve((Map<String, Object>) null, options);
  }

  /** Retrieves the remaining onramp limit for a crypto customer. */
  public static OnrampTransactionLimits retrieve(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/crypto/onramp_transaction_limits";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, OnrampTransactionLimits.class);
  }

  /** Retrieves the remaining onramp limit for a crypto customer. */
  public static OnrampTransactionLimits retrieve(
      OnrampTransactionLimitsRetrieveParams params, RequestOptions options) throws StripeException {
    String path = "/v1/crypto/onramp_transaction_limits";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, OnrampTransactionLimits.class);
  }
}
