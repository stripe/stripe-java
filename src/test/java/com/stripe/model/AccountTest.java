package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.Account;
import com.stripe.net.APIResource;

import org.junit.Test;

public class AccountTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/accounts/acct_123");
    final Account resource = APIResource.GSON.fromJson(data, Account.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
