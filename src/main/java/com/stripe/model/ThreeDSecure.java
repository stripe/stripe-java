// File generated from our OpenAPI spec
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
  /**
   * Amount of the charge that you will create when authentication completes.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * True if the cardholder went through the authentication flow and their bank indicated that authentication succeeded.
   */
  @SerializedName("authenticated")
  Boolean authenticated;

  /**
   * You can store multiple cards on a customer in order to charge the customer later. You can also store multiple debit cards on a recipient in order to transfer to those cards later.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/sources/cards">Card Payments with Sources</a>.
   */
  @SerializedName("card")
  Card card;

  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code three_d_secure}.
   */
  @SerializedName("object")
  String object;

  /**
   * If present, this is the URL that you should send the cardholder to for authentication. If you are going to use Stripe.js to display the authentication page in an iframe, you should use the value &quot;_callback&quot;.
   */
  @SerializedName("redirect_url")
  String redirectUrl;

  /**
   * Possible values are {@code redirect_pending}, {@code succeeded}, or {@code failed}. When the cardholder can be authenticated, the object starts with status {@code redirect_pending}. When liability will be shifted to the cardholder's bank (either because the cardholder was successfully authenticated, or because the bank has not implemented 3D Secure, the object wlil be in status {@code succeeded}. {@code failed} indicates that authentication was attempted unsuccessfully.
   */
  @SerializedName("status")
  String status;

  /**
   * <p>Retrieves a 3D Secure object.</p>
   */
  public static ThreeDSecure retrieve(String threeDSecure) throws StripeException {
    return retrieve(threeDSecure, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * <p>Retrieves a 3D Secure object.</p>
   */
  public static ThreeDSecure retrieve(
      String threeDSecure,
      RequestOptions options) throws StripeException {
    return retrieve(threeDSecure, (Map<String, Object>) null, options);
  }

  /**
   * <p>Retrieves a 3D Secure object.</p>
   */
  public static ThreeDSecure retrieve(
      String threeDSecure,
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/3d_secure/%s", ApiResource.urlEncodeId(threeDSecure))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ThreeDSecure.class,
      options
    );
  }

  /**
   * <p>Retrieves a 3D Secure object.</p>
   */
  public static ThreeDSecure retrieve(
      String threeDSecure,
      ThreeDSecureRetrieveParams params,
      RequestOptions options) throws StripeException {
    String url =
      String.format(
        "%s%s",
        Stripe.getApiBase(),
        String.format("/v1/3d_secure/%s", ApiResource.urlEncodeId(threeDSecure))
      );
    return ApiResource.request(
      ApiResource.RequestMethod.GET,
      url,
      params,
      ThreeDSecure.class,
      options
    );
  }

  /**
   * <p>Initiate 3D Secure authentication.</p>
   */
  public static ThreeDSecure create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Initiate 3D Secure authentication.</p>
   */
  public static ThreeDSecure create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/3d_secure");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ThreeDSecure.class,
      options
    );
  }

  /**
   * <p>Initiate 3D Secure authentication.</p>
   */
  public static ThreeDSecure create(ThreeDSecureCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Initiate 3D Secure authentication.</p>
   */
  public static ThreeDSecure create(
      ThreeDSecureCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/3d_secure");
    return ApiResource.request(
      ApiResource.RequestMethod.POST,
      url,
      params,
      ThreeDSecure.class,
      options
    );
  }
}