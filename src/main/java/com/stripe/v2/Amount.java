// NOT codegenned
package com.stripe.v2;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.StripeObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public final class Amount extends StripeObject {
  public Amount(long value, String currency) {
    this.value = value;
    this.currency = currency;
  }

  @SerializedName("value")
  long value;

  @SerializedName("currency")
  String currency;
}
