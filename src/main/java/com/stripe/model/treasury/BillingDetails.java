// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.Address;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BillingDetails extends StripeObject {
  @SerializedName("address")
  Address address;

  /** Email address. */
  @SerializedName("email")
  String email;

  /** Full name. */
  @SerializedName("name")
  String name;
}
