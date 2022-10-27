package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import com.stripe.param.EphemeralKeyCreateParams;
import java.util.HashMap;
import java.util.List;
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

  /** String representing the object's type. Objects of the same type share the same value. */
  @SerializedName("object")
  String object;

  /** The key's secret. You can use this value to make authorized requests to the Stripe API. */
  @SerializedName("secret")
  String secret;

  List<AssociatedObject> associatedObjects;

  transient String rawJson;

  /**
   * Creates an ephemeral API key for a given resource.
   *
   * @param params request parameters. Must include "api-version" equal to the stripe version of
   *     your mobile client.
   * @return the new ephemeral key
   */
  public static EphemeralKey create(Map<String, Object> params) throws StripeException {
    return create(params, null);
  }

  /**
   * Creates an ephemeral API key for a given resource.
   *
   * @param params request parameters. Use call {@link
   *     EphemeralKeyCreateParams.Builder#setStripeVersion(String)} with the stripe version of your
   *     mobile client.
   * @return the new ephemeral key
   */
  public static EphemeralKey create(EphemeralKeyCreateParams params) throws StripeException {
    return create(params, null);
  }

  /**
   * Creates an ephemeral API key for a given resource.
   *
   * @param params request parameters
   * @param options request options. {@code stripeVersion} is required when creating ephemeral keys.
   *     it must have non-null {@link RequestOptions#getStripeVersionOverride()}.
   * @return the new ephemeral key
   */
  public static EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    checkNullTypedParams(classUrl(EphemeralKey.class), params);

    Map<String, Object> paramMap = params.toMap();
    if (!paramMap.containsKey("stripe-version")) {
      throw new IllegalArgumentException(
          "You must .setStripeVersion on EphemeralKeyCreateParams.builder() with"
              + " the stripe version of your mobile client.");
    }
    return create(params.toMap(), options);
  }

  /**
   * Creates an ephemeral API key for a given resource.
   *
   * @param params request parameters
   * @param options request options. {@code stripeVersion} is required when creating ephemeral keys.
   *     it must have non-null {@link RequestOptions#getStripeVersionOverride()}.
   * @return the new ephemeral key
   */
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
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                options.toBuilderFullCopy(), versionOverride)
            .build();

    // Remove "stripe-version" from params so that it is not sent in the
    // request body.
    final Map<String, Object> overriddenParams = new HashMap<String, Object>(params);
    overriddenParams.remove("stripe-version");

    return request(
        RequestMethod.POST,
        classUrl(EphemeralKey.class),
        overriddenParams,
        EphemeralKey.class,
        overriddenOptions);
  }

  /** Invalidates an ephemeral API key for a given resource. */
  public EphemeralKey delete() throws StripeException {
    return delete(null);
  }

  /** Invalidates an ephemeral API key for a given resource. */
  public EphemeralKey delete(RequestOptions options) throws StripeException {
    return request(
        RequestMethod.DELETE,
        instanceUrl(EphemeralKey.class, this.id),
        (Map<String, Object>) null,
        EphemeralKey.class,
        options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AssociatedObject extends StripeObject implements HasId {
    @Getter(onMethod_ = {@Override})
    String id;

    String type;
  }
}
