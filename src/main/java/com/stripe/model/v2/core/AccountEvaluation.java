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

/** Account Evaluation resource. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountEvaluation extends StripeObject implements HasId {
  /** The account ID if this evaluation is for an existing account. */
  @SerializedName("account")
  String account;

  /** Account data if this evaluation is for an account without an existing Stripe entity. */
  @SerializedName("account_data")
  AccountData accountData;

  /** Timestamp at which the evaluation was created. */
  @SerializedName("created")
  Instant created;

  /** List of signals that were triggered for evaluation. */
  @SerializedName("evaluations_triggered")
  List<String> evaluationsTriggered;

  /** Unique identifier for the account evaluation. */
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
   * <p>Equal to {@code v2.core.account_evaluation}.
   */
  @SerializedName("object")
  String object;

  /** Account data if this evaluation is for an account without an existing Stripe entity. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AccountData extends StripeObject {
    /** Default account settings. */
    @SerializedName("defaults")
    Defaults defaults;

    /** Identity data. */
    @SerializedName("identity")
    Identity identity;

    /** Default account settings. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Defaults extends StripeObject {
      /** Account profile data. */
      @SerializedName("profile")
      Profile profile;

      /** Account profile data. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Profile extends StripeObject {
        /** The business URL. */
        @SerializedName("business_url")
        String businessUrl;

        /** Doing business as (DBA) name. */
        @SerializedName("doing_business_as")
        String doingBusinessAs;

        /** Description of the account's product or service. */
        @SerializedName("product_description")
        String productDescription;
      }
    }

    /** Identity data. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Identity extends StripeObject {
      /** Business details for identity data. */
      @SerializedName("business_details")
      BusinessDetails businessDetails;

      /** Business details for identity data. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class BusinessDetails extends StripeObject {
        /** Registered business name. */
        @SerializedName("registered_name")
        String registeredName;
      }
    }
  }
}
