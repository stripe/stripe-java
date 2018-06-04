package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Discount extends StripeObject {
  String id;
  String object;
  Coupon coupon;
  String customer;
  Long end;
  Long start;
  String subscription;
}
