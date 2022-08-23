// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An error response from the Stripe API. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class StripeErrorResponse extends StripeObject {
  @SerializedName("error")
  StripeError error;
}
