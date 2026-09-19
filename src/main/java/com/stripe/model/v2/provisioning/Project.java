// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code Project} resource represents a container for provisioned resources and their
 * associated configuration.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Project extends StripeObject implements HasId {
  /**
   * Catalog partition the project belongs to.
   *
   * <p>One of {@code dev}, {@code prod}, or {@code testing}.
   */
  @SerializedName("catalog")
  String catalog;

  /** Time at which the project was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the project. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Human-readable name of the project. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.project}.
   */
  @SerializedName("object")
  String object;

  /** Use the /v2/provisioning/identity endpoint instead for IAM information. */
  @SerializedName("profile")
  Profile profile;

  /** Identifier of the developer profile associated with the project. */
  @SerializedName("project_profile")
  String projectProfile;

  /** Use the /v2/provisioning/identity endpoint instead for IAM information. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Profile extends StripeObject {
    /** Email address associated with the developer profile. */
    @SerializedName("email")
    String email;

    /** Fields of the developer profile that have been verified. */
    @SerializedName("verified_fields")
    List<String> verifiedFields;
  }
}
