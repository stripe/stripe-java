package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class BankAccount extends ExternalAccount {
  String accountHolderName;
  String accountHolderType;
  String bankName;
  String country;
  String currency;
  Boolean defaultForCurrency;
  String fingerprint;
  String last4;
  String routingNumber;
  String status;
  Boolean validated;

  public BankAccount update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return update(params, null);
  }

  public BankAccount update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, BankAccount.class, options);
  }

  public DeletedBankAccount delete()
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return delete(null);
  }

  public DeletedBankAccount delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBankAccount.class,
        options);
  }
}
