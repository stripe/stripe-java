// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The current provider-issued access configuration for a Provisioning Resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ResourceAccessConfiguration extends StripeObject {
  /** Provider-defined configuration names mapped to their secret string values. */
  @SerializedName("configuration")
  Map<String, String> configuration;

  /** Time at which this credential generation became current. */
  @SerializedName("created")
  Instant created;

  /** Time at which these credentials cease to be valid, when supplied by the Provider. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** Whether the referenced Resource uses Stripe live-mode objects. */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.resource_access_configuration}.
   */
  @SerializedName("object")
  String object;

  /** Provisioning Resource to which this access configuration belongs. */
  @SerializedName("resource")
  String resource;
}
