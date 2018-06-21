package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
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

  // <editor-fold desc="delete">
  /**
   * Delete a bank account.
   */
  @Override
  public DeletedBankAccount delete()
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return delete(null);
  }

  /**
   * Delete a bank account.
   */
  @Override
  public DeletedBankAccount delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return request(RequestMethod.DELETE, this.getInstanceUrl(), null, DeletedBankAccount.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a bank account.
   */
  @Override
  public BankAccount update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return update(params, null);
  }

  /**
   * Update a bank account.
   */
  @Override
  public BankAccount update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException, ApiConnectionException,
      CardException, ApiException {
    return request(RequestMethod.POST, this.getInstanceUrl(), params, BankAccount.class, options);
  }
  // </editor-fold>
}
