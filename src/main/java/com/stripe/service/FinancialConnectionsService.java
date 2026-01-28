// File generated from our OpenAPI spec
package com.stripe.service;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class FinancialConnectionsService extends ApiService {
  public FinancialConnectionsService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.financialconnections.AccountService accounts() {
    return new com.stripe.service.financialconnections.AccountService(this.getResponseGetter());
  }

  public com.stripe.service.financialconnections.AuthorizationService authorizations() {
    return new com.stripe.service.financialconnections.AuthorizationService(
        this.getResponseGetter());
  }

  public com.stripe.service.financialconnections.InstitutionService institutions() {
    return new com.stripe.service.financialconnections.InstitutionService(this.getResponseGetter());
  }

  public com.stripe.service.financialconnections.SessionService sessions() {
    return new com.stripe.service.financialconnections.SessionService(this.getResponseGetter());
  }

  public com.stripe.service.financialconnections.TransactionService transactions() {
    return new com.stripe.service.financialconnections.TransactionService(this.getResponseGetter());
  }
}
