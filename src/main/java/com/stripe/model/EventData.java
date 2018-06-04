package com.stripe.model;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class EventData extends StripeObject {
  StripeObject object;
  Map<String, Object> previousAttributes;
}
