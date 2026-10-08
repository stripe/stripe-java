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
  /**
   * Catalog partition containing the resource's provider service.
   *
   * <p>One of {@code dev}, {@code prod}, or {@code testing}.
   */
  @SerializedName("catalog")
  String catalog;

  /** Time at which the resource was created. */
  @SerializedName("created")
  Instant created;

  /**
   * Provider environment in which the resource runs.
   *
   * <p>One of {@code dev}, or {@code prod}.
   */
  @SerializedName("environment")
  String environment;

  /** Error reported when provisioning the resource fails. */
  @SerializedName("error_message")
  String errorMessage;

  /** Unique identifier for the resource. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Whether this resource uses Stripe live-mode objects. This is independent of the provider
   * catalog and is immutable for the lifetime of the resource.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Human-readable name of the resource. */
  @SerializedName("name")
  String name;

  /** Schema describing additional information the provider requires to finish provisioning. */
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

  /** Identifier of the provider that manages the resource. */
  @SerializedName("provider")
  String provider;

  /** Identifier of the provider service used to provision the resource. */
  @SerializedName("service_ref")
  String serviceRef;

  /**
   * Current provisioning status of the resource.
   *
   * <p>One of {@code complete}, {@code errored}, {@code needs_information}, {@code pending}, or
   * {@code removed}.
   */
  @SerializedName("status")
  String status;

  /** Message supplied by the provider when the resource becomes ready. */
  @SerializedName("user_message")
  UserMessage userMessage;

  /** Message supplied by the provider when the resource becomes ready. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UserMessage extends StripeObject {
    /** Message from the provider to display to the user. */
    @SerializedName("message")
    String message;

    /** Time at which Stripe received the message from the provider. */
    @SerializedName("received_at")
    Instant receivedAt;
  }
}
