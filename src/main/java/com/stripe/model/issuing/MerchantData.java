package com.stripe.model.issuing;

import com.stripe.model.StripeObject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class MerchantData extends StripeObject {
  String category;
  String city;
  String country;
  String name;
  String networkId;
  String postalCode;
  String state;
}