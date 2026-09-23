// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Provider} resource represents a third-party provider available in the provisioning
 * catalog.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Provider extends StripeObject implements HasId {
  /** Capabilities supported by the provider. */
  @SerializedName("capabilities")
  List<String> capabilities;

  /** Categories the provider belongs to. */
  @SerializedName("categories")
  List<String> categories;

  /** Schema describing the configuration accepted by this provider. */
  @SerializedName("configuration_schema")
  Map<String, Object> configurationSchema;

  /** Time at which the provider was created. */
  @SerializedName("created")
  Instant created;

  /** Deep-link purposes supported by the provider. */
  @SerializedName("deep_link_purposes")
  List<String> deepLinkPurposes;

  /** Description of the provider. */
  @SerializedName("description")
  String description;

  /** proto3 scalar defaults apply: if unset, this value is {@code false}. */
  @SerializedName("development")
  Boolean development;

  /** Unique identifier for the provider. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** URL of additional context about the provider intended for LLM consumption. */
  @SerializedName("llm_context")
  String llmContext;

  /** Human-readable name of the provider. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.provider}.
   */
  @SerializedName("object")
  String object;

  /** URL of the provider's privacy policy. */
  @SerializedName("privacy_policy_url")
  String privacyPolicyUrl;

  /** URL of the provider's terms of service. */
  @SerializedName("tos_url")
  String tosUrl;

  /** URL of the provider's website. */
  @SerializedName("website_url")
  String websiteUrl;
}
