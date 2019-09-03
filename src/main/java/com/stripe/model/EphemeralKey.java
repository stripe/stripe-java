package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.EphemeralKeyCreateParams;
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
   * @param params request parameters
   * @param options request options. {@code stripeVersion} is required when creating ephemeral keys.
   *     it must have non-null {@link RequestOptions#getStripeVersionOverride()}.
   * @return the new ephemeral key
   */
  public static EphemeralKey create(EphemeralKeyCreateParams params, RequestOptions options)
      throws StripeException {
    checkNullTypedParams(classUrl(EphemeralKey.class), params);
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
    if (options.getStripeVersionOverride() == null) {
      throw new IllegalArgumentException(
          "`stripeVersionOverride` must be specified in "
              + "RequestOptions with stripe version of your mobile client.");
    }

    return request(
        RequestMethod.POST, classUrl(EphemeralKey.class), params, EphemeralKey.class, options);
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
