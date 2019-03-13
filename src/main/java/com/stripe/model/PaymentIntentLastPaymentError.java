package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class PaymentIntentLastPaymentError extends StripeObject {
  String charge;
  String code;
  String declineCode;
  String docUrl;
  String message;
  String param;
  PaymentIntent paymentIntent;
  PaymentMethod paymentMethod;
  ExternalAccount source;
  String type;
}
