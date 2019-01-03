package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeSepaCreditTransfer extends StripeObject {
  String bankName;

  String bic;

  String iban;

  String refundAccountHolderAddressCity;

  String refundAccountHolderAddressCountry;

  String refundAccountHolderAddressLine1;

  String refundAccountHolderAddressLine2;

  String refundAccountHolderAddressPostalCode;

  String refundAccountHolderAddressState;

  String refundAccountHolderName;

  String refundIban;
}
