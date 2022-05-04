// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountOwner extends StripeObject {
  /** The email address of the owner. */
  @SerializedName("email")
  String email;

  /** The full name of the owner. */
  @SerializedName("name")
  String name;

  /** The ownership object that this owner belongs to. */
  @SerializedName("ownership")
  String ownership;

  /** The raw phone number of the owner. */
  @SerializedName("phone")
  String phone;

  /** The raw physical address of the owner. */
  @SerializedName("raw_address")
  String rawAddress;

  /** The timestamp of the refresh that updated this owner. */
  @SerializedName("refreshed_at")
  Long refreshedAt;
}
