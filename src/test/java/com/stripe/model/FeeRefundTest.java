package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class FeeRefundTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/application_fees/fee_123/refunds/fr_123");
    final FeeRefund refund = ApiResource.GSON.fromJson(data, FeeRefund.class);
    assertNotNull(refund);
    assertNotNull(refund.getId());
    assertEquals("fee_refund", refund.getObject());
    assertNull(refund.getBalanceTransactionObject());
    assertNull(refund.getFeeObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "balance_transaction",
      "fee",
    };
    final String data = getFixture("/v1/application_fees/fee_123/refunds/fr_123", expansions);
    final FeeRefund refund = ApiResource.GSON.fromJson(data, FeeRefund.class);
    assertNotNull(refund);
    final BalanceTransaction balanceTransaction = refund.getBalanceTransactionObject();
    assertNotNull(balanceTransaction);
    assertNotNull(balanceTransaction.getId());
    assertEquals(refund.getBalanceTransaction(), balanceTransaction.getId());
    final ApplicationFee fee = refund.getFeeObject();
    assertNotNull(fee);
    assertNotNull(fee.getId());
    assertEquals(refund.getFee(), fee.getId());
  }
}
