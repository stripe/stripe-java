package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ReversalTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/transfers/tr_123/reversals/trr_123");
    final Reversal reversal = ApiResource.GSON.fromJson(data, Reversal.class);
    assertNotNull(reversal);
    assertNotNull(reversal.getId());
    assertEquals("transfer_reversal", reversal.getObject());
    assertNull(reversal.getBalanceTransactionObject());
    assertNull(reversal.getTransferObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "balance_transaction",
      "transfer",
    };
    final String data = getFixture("/v1/transfers/tr_123/reversals/trr_123", expansions);
    final Reversal reversal = ApiResource.GSON.fromJson(data, Reversal.class);
    assertNotNull(reversal);
    final BalanceTransaction balanceTransaction = reversal.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(reversal.getBalanceTransaction(), balanceTransaction.getId());
    final Transfer transfer = reversal.getTransferObject();
    assertNotNull(transfer);
    assertNotNull(transfer.getId());
    assertEquals(reversal.getTransfer(), transfer.getId());
  }
}
