// File generated from our OpenAPI spec
package com.stripe.model.v2.extend;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a user-defined object definition that models a custom object. Object definitions
 * enable the object records API to create and manage records of that object.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ObjectDefinition extends StripeObject implements HasId {
  /**
   * The plural API name used in this definition's object record API paths. Immutable across
   * versions.
   */
  @SerializedName("api_name_plural")
  String apiNamePlural;

  /**
   * The singular API name used in the object tag of this definition's records. Immutable across
   * versions.
   */
  @SerializedName("api_name_singular")
  String apiNameSingular;

  /** Time at which the object definition was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the object definition. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The ID of the latest object definition version. */
  @SerializedName("latest_version")
  String latestVersion;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.extend.object_definition}.
   */
  @SerializedName("object")
  String object;
}
