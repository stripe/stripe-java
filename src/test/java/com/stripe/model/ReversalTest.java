package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ReversalTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/transfers/tr_123/reversals/trr_123");
    final TransferReversal reversal = ApiResource.GSON.fromJson(data, TransferReversal.class);
    assertNotNull(reversal);
    assertNotNull(reversal.getId());
    assertEquals("transfer_reversal", reversal.getObject());
    assertNull(reversal.getBalanceTransactionObject());
    assertNull(reversal.getTransferObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "balance_transaction", "destination_payment_refund", "source_refund", "transfer",
    };
    final String data = getFixture("/v1/transfers/tr_123/reversals/trr_123", expansions);
    final TransferReversal reversal = ApiResource.GSON.fromJson(data, TransferReversal.class);
    assertNotNull(reversal);

    final BalanceTransaction balanceTransaction = reversal.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(reversal.getBalanceTransaction(), balanceTransaction.getId());

    final Refund destinationPaymentRefund = reversal.getDestinationPaymentRefundObject();
    assertNotNull(destinationPaymentRefund);
    assertNotNull(destinationPaymentRefund.getId());
    assertEquals(reversal.getDestinationPaymentRefund(), destinationPaymentRefund.getId());

    final Refund sourceRefund = reversal.getSourceRefundObject();
    assertNotNull(sourceRefund);
    assertNotNull(sourceRefund.getId());
    assertEquals(reversal.getSourceRefund(), sourceRefund.getId());

    final Transfer transfer = reversal.getTransferObject();
    assertNotNull(transfer);
    assertNotNull(transfer.getId());
    assertEquals(reversal.getTransfer(), transfer.getId());
  }
}
