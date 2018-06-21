package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.BalanceTransaction;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class BalanceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/balance/history/txn_123");
    final BalanceTransaction resource = ApiResource.GSON.fromJson(data, BalanceTransaction.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeExpansions() throws Exception {
    // TODO: Figure out why stripe-mock does not expand source when asked
    final String data = getResourceAsString("/api_fixtures/balance_transaction_expansion.json");
    final BalanceTransaction resource = ApiResource.GSON.fromJson(data, BalanceTransaction.class);
    assertNotNull(resource);
    final HasId source = resource.getSourceObject();
    assertNotNull(source);
    assertNotNull(source.getId());
  }
}
