// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Resource} resource represents a provider-managed resource provisioned on behalf of a
 * {@code Project}.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Resource extends StripeObject implements HasId {
  @SerializedName("catalog")
  String catalog;

  @SerializedName("created")
  Instant created;

  @SerializedName("environment")
  String environment;

  @SerializedName("error_message")
  String errorMessage;

  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Whether this resource uses Stripe live-mode objects. This is independent of the provider
   * catalog and is immutable for the lifetime of the resource.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("name")
  String name;

  @SerializedName("needs_information_schema")
  Map<String, Object> needsInformationSchema;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.resource}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("provider")
  String provider;

  @SerializedName("service_ref")
  String serviceRef;

  @SerializedName("status")
  String status;

  @SerializedName("user_message")
  UserMessage userMessage;

  /**
   * For more details about UserMessage, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserMessage extends StripeObject {
    @SerializedName("message")
    String message;

    @SerializedName("received_at")
    Instant receivedAt;
  }
}
