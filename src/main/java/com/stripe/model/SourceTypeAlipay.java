package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeAlipay extends StripeObject {
  String dataString;

  String nativeUrl;

  String statementDescriptor;
}
