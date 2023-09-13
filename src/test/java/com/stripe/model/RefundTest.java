package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class RefundTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/refunds/re_123");
    final Refund refund = ApiResource.GSON.fromJson(data, Refund.class);
    assertNotNull(refund);
    assertNotNull(refund.getId());
    assertEquals("refund", refund.getObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "balance_transaction",
      "charge",
      "failure_balance_transaction",
      "source_transfer_reversal",
      "transfer_reversal",
    };
    final String data = getFixture("/v1/refunds/re_123", expansions);
    final Refund refund = ApiResource.GSON.fromJson(data, Refund.class);
    assertNotNull(refund);
    final BalanceTransaction balanceTransaction = refund.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(refund.getBalanceTransaction(), balanceTransaction.getId());
    final Charge charge = refund.getChargeObject();
    assertNotNull(charge);
    assertNotNull(charge.getId());
    assertEquals(refund.getCharge(), charge.getId());
    final BalanceTransaction failureBalanceTransaction =
        refund.getFailureBalanceTransactionObject();
    assertNotNull(failureBalanceTransaction);
    assertNotNull(failureBalanceTransaction.getId());
    assertEquals(refund.getFailureBalanceTransaction(), failureBalanceTransaction.getId());
    final TransferReversal sourceTransferReversal = refund.getSourceTransferReversalObject();
    assertNotNull(sourceTransferReversal);
    assertNotNull(sourceTransferReversal.getId());
    assertEquals(refund.getSourceTransferReversal(), sourceTransferReversal.getId());
    final TransferReversal transferReversal = refund.getTransferReversalObject();
    assertNotNull(transferReversal);
    assertNotNull(transferReversal.getId());
    assertEquals(refund.getTransferReversal(), transferReversal.getId());
  }
}
