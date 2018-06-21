package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class BankAccountTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/customers/cus_123/bank_accounts/ba_123");
    final BankAccount bankAccount = ApiResource.GSON.fromJson(data, BankAccount.class);
    assertNotNull(bankAccount);
    assertNotNull(bankAccount.getId());
  }
}
