// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** The ConnectionSession resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ConnectionSession extends StripeObject implements HasId {
  /** The Account this Connection Session was created for. */
  @SerializedName("account")
  String account;

  /** The Connection types that the Connection Session is allowed to establish. */
  @SerializedName("allowed_connection_types")
  List<String> allowedConnectionTypes;

  /**
   * The client secret of this Connection Session. Used on the client to set up secure access to the
   * given Account.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** The Connection created by the ConnectionSession. */
  @SerializedName("connection")
  Connection connection;

  /** Time at which the ConnectionSession was created. */
  @SerializedName("created")
  Instant created;

  /** The unique identifier for this ConnectionSession. */
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
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.connection_session}.
   */
  @SerializedName("object")
  String object;

  /** The access that is collected with the Connection Session. */
  @SerializedName("requested_access")
  List<String> requestedAccess;

  /** The Connection created by the ConnectionSession. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Connection extends StripeObject {
    /** The access granted to the Account by the Connection. */
    @SerializedName("granted_access")
    List<String> grantedAccess;

    /**
     * The type of the Connection.
     *
     * <p>Equal to {@code link}.
     */
    @SerializedName("type")
    String type;
  }
}
