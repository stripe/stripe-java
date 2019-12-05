package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.ThreeDSecureCreateParams;
import com.stripe.param.ThreeDSecureRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ThreeDSecure extends ApiResource implements HasId {
  @SerializedName("amount")
  Long amount;

  /**
   * True if the cardholder went through the authentication flow and their bank indicated that
   * authentication succeeded.
   */
  @SerializedName("authenticated")
  Boolean authenticated;

  @SerializedName("card")
  Card card;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `three_d_secure`.
   */
  @SerializedName("object")
  String object;

  /**
   * If present, this is the URL that you should send the cardholder to for authentication. If you
   * are going to use Stripe.js to display the authentication page in an iframe, you should use the
   * value "_callback".
   */
  @SerializedName("redirect_url")
  String redirectUrl;

  /**
   * Possible values are `redirect_pending`, `succeeded`, or `failed`. When the cardholder can be
   * authenticated, the object starts with status `redirect_pending`. When liability will be shifted
   * to the cardholder's bank (either because the cardholder was successfully authenticated, or
   * because the bank has not implemented 3D Secure, the object wlil be in status `succeeded`.
   * `failed` indicates that authentication was attempted unsuccessfully.
   */
  @SerializedName("status")
  String status;

  /** Retrieves a 3D Secure object. */
  public static ThreeDSecure retrieve(String threeDSecure) throws StripeException {
    return retrieve(threeDSecure, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a 3D Secure object. */
  public static ThreeDSecure retrieve(String threeDSecure, RequestOptions options)
      throws StripeException {
    return retrieve(threeDSecure, (Map<String, Object>) null, options);
  }

  /** Retrieves a 3D Secure object. */
  public static ThreeDSecure retrieve(
      String threeDSecure, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/3d_secure/%s", ApiResource.urlEncodeId(threeDSecure)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ThreeDSecure.class, options);
  }

  /** Retrieves a 3D Secure object. */
  public static ThreeDSecure retrieve(
      String threeDSecure, ThreeDSecureRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/3d_secure/%s", ApiResource.urlEncodeId(threeDSecure)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ThreeDSecure.class, options);
  }

  /** Initiate 3D Secure authentication. */
  public static ThreeDSecure create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Initiate 3D Secure authentication. */
  public static ThreeDSecure create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/3d_secure");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ThreeDSecure.class, options);
  }

  /** Initiate 3D Secure authentication. */
  public static ThreeDSecure create(ThreeDSecureCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Initiate 3D Secure authentication. */
  public static ThreeDSecure create(ThreeDSecureCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/3d_secure");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, ThreeDSecure.class, options);
  }
}
