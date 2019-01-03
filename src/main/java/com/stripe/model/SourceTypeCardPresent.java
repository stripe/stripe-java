package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeCardPresent extends StripeObject {
  String applicationCryptogram;

  String applicationPreferredName;

  String authorizationCode;

  String authorizationResponseCode;

  String brand;

  String country;

  String cvmType;

  String dataType;

  String dedicatedFileName;

  String emvAuthData;

  String evidenceCustomerSignature;

  String evidenceTransactionCertificate;

  Long expMonth;

  Long expYear;

  String fingerprint;

  String funding;

  String last4;

  String posDeviceId;

  String posEntryMode;

  String readMethod;

  String reader;

  String terminalVerificationResults;

  String transactionStatusInformation;
}
