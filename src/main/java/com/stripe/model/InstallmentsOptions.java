// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class InstallmentsOptions extends StripeObject {
  @SerializedName("enabled")
  Boolean enabled;

  @SerializedName("plan")
  PaymentIntent.PaymentMethodOptions.Card.Installments.Plan plan;
}
