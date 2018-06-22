package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Account;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class AccountTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/accounts/acct_123");
    final Account resource = ApiResource.GSON.fromJson(data, Account.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
