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
 * A ProviderConnectionRequest represents an in-progress account-linking workflow. Once the workflow
 * completes, {@code provider_connection} is populated with the resulting ProviderConnection.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProviderConnectionRequest extends StripeObject implements HasId {
  /** Time at which the provider connection request was created. */
  @SerializedName("created")
  Instant created;

  /** Error from the account-linking workflow, set when request_status is ERROR. */
  @SerializedName("error")
  Errors error;

  /** Unique identifier for the provider connection request. */
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
   * Schema describing the information the provider still needs, set when request_status is
   * NEEDS_INFORMATION.
   */
  @SerializedName("needs_information_schema")
  Map<String, Object> needsInformationSchema;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.provider_connection_request}.
   */
  @SerializedName("object")
  String object;

  /** Identifier of the provider this connection request is linked to. */
  @SerializedName("provider")
  String provider;

  /**
   * A ProviderConnection represents a link between a project and a provider account that resources
   * can be created against; unlinking it prevents further resource creation.
   */
  @SerializedName("provider_connection")
  ProviderConnection providerConnection;

  /** URL the caller should redirect to in order to continue the account-linking workflow. */
  @SerializedName("redirect_url")
  String redirectUrl;

  /**
   * Status of the underlying account-linking workflow. Unset once the workflow completes; see
   * provider_connection for the resulting connection's status.
   *
   * <p>One of {@code complete}, {@code error}, {@code needs_information}, {@code pending_auth}, or
   * {@code requested}.
   */
  @SerializedName("request_status")
  String requestStatus;

  /** Scopes requested for the account-linking workflow. */
  @SerializedName("scopes")
  List<String> scopes;

  /** Error from the account-linking workflow, set when request_status is ERROR. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Errors extends StripeObject {
    /** Machine-readable error code. */
    @SerializedName("code")
    String code;

    /** Human-readable error message. */
    @SerializedName("message")
    String message;
  }
}
