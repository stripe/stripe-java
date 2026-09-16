// File generated from our OpenAPI spec
package com.stripe.model.v2.core.vault;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A NetworkToken object represents a network token provisioned for a card. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class NetworkToken extends StripeObject implements HasId {
  /** Created timestamp. */
  @SerializedName("created")
  Instant created;

  /**
   * This field is unset in create and retrieve responses. It is populated only after a successful
   * generate_cryptogram request.
   */
  @SerializedName("cryptogram")
  Cryptogram cryptogram;

  /** The month the network token expires. */
  @SerializedName("exp_month")
  String expMonth;

  /** The year the network token expires. */
  @SerializedName("exp_year")
  String expYear;

  /** ID of the NetworkToken object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Whether the object exists in live mode or in test mode. */
  @SerializedName("livemode")
  Boolean livemode;

  /** The network token number. */
  @SerializedName("number")
  String number;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.vault.network_token}.
   */
  @SerializedName("object")
  String object;

  /**
   * Closed Enum. The status of the network token.
   *
   * <p>One of {@code active}, {@code deactivated}, or {@code suspended}.
   */
  @SerializedName("status")
  String status;

  /**
   * This field is unset in create and retrieve responses. It is populated only after a successful
   * generate_cryptogram request.
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cryptogram extends StripeObject {
    /** The electronic commerce indicator associated with the cryptogram. */
    @SerializedName("eci")
    String eci;

    /** The cryptogram type. */
    @SerializedName("type")
    String type;

    /** The cryptogram value. */
    @SerializedName("value")
    String value;
  }
}
