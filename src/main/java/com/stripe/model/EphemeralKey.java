// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.EphemeralKeyCreateParams;
import com.stripe.param.EphemeralKeyDeleteParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EphemeralKey extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Time at which the key will expire. Measured in seconds since the Unix epoch. */
  @SerializedName("expires")
  Long expires;

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
   * <p>Equal to {@code ephemeral_key}.
   */
  @SerializedName("object")
  String object;

  /** The key's secret. You can use this value to make authorized requests to the Stripe API. */
  @SerializedName("secret")
  String secret;

  transient String rawJson;

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(EphemeralKeyCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(EphemeralKeyDeleteParams params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    validateStripeVersionOverride(options);
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/ephemeral_keys");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, EphemeralKey.class, options);
  }

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    validateStripeVersionOverride(options);
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/ephemeral_keys");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, EphemeralKey.class, options);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    validateStripeVersionOverride(options);

    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/ephemeral_keys/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, EphemeralKey.class, options);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(EphemeralKeyDeleteParams params, RequestOptions options)
      throws StripeException {
    validateStripeVersionOverride(options);

    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/ephemeral_keys/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, EphemeralKey.class, options);
  }

  private static void validateStripeVersionOverride(RequestOptions options)
      throws IllegalArgumentException {
    if (options.getStripeVersionOverride() == null) {
      throw new IllegalArgumentException(
          "`stripeVersionOverride` must be specified in RequestOptions with stripe version of your mobile client.");
    }
  }
}
