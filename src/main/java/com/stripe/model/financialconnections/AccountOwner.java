// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountOwner extends StripeObject implements HasId {
  /**
   * The email address of the owner.
   */
  @SerializedName("email")
  String email;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * The full name of the owner.
   */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.account_owner}.
   */
  @SerializedName("object")
  String object;

  /**
   * The ownership object that this owner belongs to.
   */
  @SerializedName("ownership")
  String ownership;

  /**
   * The raw phone number of the owner.
   */
  @SerializedName("phone")
  String phone;

  /**
   * The raw physical address of the owner.
   */
  @SerializedName("raw_address")
  String rawAddress;

  /**
   * The timestamp of the refresh that updated this owner.
   */
  @SerializedName("refreshed_at")
  Long refreshedAt;
}