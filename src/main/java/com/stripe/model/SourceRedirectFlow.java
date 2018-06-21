package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public final class SourceRedirectFlow extends StripeObject {
  String failureReason;
  String returnUrl;
  String status;
  String url;
}
