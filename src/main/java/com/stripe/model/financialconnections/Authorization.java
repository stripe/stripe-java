// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An Authorization represents the set of credentials used to connect a group of Financial
 * Connections Accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Authorization extends StripeObject implements HasId {
  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The name of the institution that this authorization belongs to. */
  @SerializedName("institution_name")
  String institutionName;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.authorization}.
   */
  @SerializedName("object")
  String object;

  /**
   * The status of the connection to the Authorization.
   *
   * <p>One of {@code active}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * For more details about StatusDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    @SerializedName("active")
    Active active;

    @SerializedName("inactive")
    Inactive inactive;

    /**
     * For more details about Active, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Active extends StripeObject {
      /**
       * The action (if any) to proactively relink the Authorization.
       *
       * <p>One of {@code none}, or {@code relink_required}.
       */
      @SerializedName("action")
      String action;

      /** When the Authorization is expected to become inactive, if applicable. */
      @SerializedName("expected_deactivation_date")
      Long expectedDeactivationDate;
    }

    /**
     * For more details about Inactive, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Inactive extends StripeObject {
      /**
       * The action (if any) to relink the inactive Authorization.
       *
       * <p>One of {@code none}, or {@code relink_required}.
       */
      @SerializedName("action")
      String action;
    }
  }
}
