// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
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
  public static EphemeralKey create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    final String versionOverride;
    if (!params.containsKey("stripe-version")) {
      throw new IllegalArgumentException(
          "`stripe-version` must be explicitly specified in "
              + "`params` as the stripe version of your mobile client.");
    }
    try {
      versionOverride = (String) params.get("stripe-version");
    } catch (ClassCastException e) {
      throw new IllegalArgumentException(
          "`stripe-version` must be explicitly specified in " + "`params` as a string");
    }
    if (options == null) {
      options = RequestOptions.getDefault();
    }
    // Take "stripe-version" from params and plug it into RequestOptions
    // so it will be sent in the Stripe-Version header
    final RequestOptions overriddenOptions =
        com.stripe.net.RequestOptions.RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                options.toBuilderFullCopy(), versionOverride)
            .build();

    // Remove "stripe-version" from params so that it is not sent in the
    // request body.
    final Map<String, Object> overriddenParams = new java.util.HashMap<String, Object>(params);
    overriddenParams.remove("stripe-version");
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            "/v1/ephemeral_keys",
            overriddenParams,
            EphemeralKey.class,
            overriddenOptions,
            ApiMode.V1);
  }

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(EphemeralKeyCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a short-lived API key for a given resource. */
  public static EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    checkNullTypedParams("/v1/ephemeral_keys", params);
    Map<String, Object> paramMap = params.toMap();
    if (!paramMap.containsKey("stripe-version")) {
      throw new IllegalArgumentException(
          "You must .setStripeVersion on EphemeralKeyCreateParams.builder() with"
              + " the stripe version of your mobile client.");
    }
    return create(paramMap, options);
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
  public EphemeralKey delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/ephemeral_keys/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            params,
            EphemeralKey.class,
            options,
            ApiMode.V1);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(EphemeralKeyDeleteParams params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Invalidates a short-lived API key for a given resource. */
  public EphemeralKey delete(EphemeralKeyDeleteParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/ephemeral_keys/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            path,
            ApiRequestParams.paramsToMap(params),
            EphemeralKey.class,
            options,
            ApiMode.V1);
  }
}
