package com.stripe.model;

import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethod extends StripeObject implements PaymentIntentSource {
  PaymentFlowsPaymentMethodResourceBillingDetails billingDetails;

  PaymentFlowsPrivatePaymentMethodsCard card;

  Long created;

  @Getter(onMethod = @__({@Override}))
  String id;

  PaymentFlowsPrivatePaymentMethodsIdeal ideal;

  Boolean livemode;

  Map<String, String> metadata;

  String object;

  PaymentFlowsPrivatePaymentMethodsSepaDebit sepaDebit;

  String type;
}
