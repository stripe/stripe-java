package com.stripe.model;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BalanceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws StripeException, IOException {
    String json = resource("balance_transaction.json");
    BalanceTransaction transaction = APIResource.GSON.fromJson(json, BalanceTransaction.class);
    assertEquals("txn_1AF5AmKac2qaDcCZm8tBQt6I", transaction.getId());
  }

  @Test
  public void testDeserializeExpansions() throws StripeException, IOException {
    String json = resource("balance_transaction_expansions.json");
    BalanceTransaction transaction = APIResource.GSON.fromJson(json, BalanceTransaction.class);
    assertEquals("txn_1AF5AmKac2qaDcCZm8tBQt6I", transaction.getId());

    Dispute dp = transaction.getSourceObjectAs();
    assertNotNull(dp);
    assertEquals("dp_1AF5AmKac2qaDcCZHvOjyrDo", dp.getId());
  }
}
