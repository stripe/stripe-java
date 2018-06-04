package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountTosAcceptance extends StripeObject {
  Long date;
  String ip;
  String userAgent;
}
