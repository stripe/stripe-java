package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class TopupTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/topups/tu_123");
    final Topup topup = ApiResource.GSON.fromJson(data, Topup.class);
    assertNotNull(topup);
    assertNotNull(topup.getId());
    assertEquals("topup", topup.getObject());
    assertNull(topup.getBalanceTransactionObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "balance_transaction",
    };
    final String data = getFixture("/v1/topups/tu_123", expansions);
    final Topup topup = ApiResource.GSON.fromJson(data, Topup.class);
    assertNotNull(topup);
    final BalanceTransaction balanceTransaction = topup.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(topup.getBalanceTransaction(), balanceTransaction.getId());
  }
}
