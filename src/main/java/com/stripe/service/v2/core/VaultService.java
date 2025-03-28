// File generated from our OpenAPI spec
package com.stripe.service.v2.core;

import com.stripe.net.ApiService;
import com.stripe.net.StripeResponseGetter;

public final class VaultService extends ApiService {
  public VaultService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  public com.stripe.service.v2.core.vault.GbBankAccountService gbBankAccounts() {
    return new com.stripe.service.v2.core.vault.GbBankAccountService(this.getResponseGetter());
  }

  public com.stripe.service.v2.core.vault.UsBankAccountService usBankAccounts() {
    return new com.stripe.service.v2.core.vault.UsBankAccountService(this.getResponseGetter());
  }
}
