package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class SourceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/source_transactions.json");
    final SourceTransactionCollection transactions =
        ApiResource.GSON.fromJson(json, SourceTransactionCollection.class);

    assertNotNull(transactions);
    assertEquals("/v1/sources/src_123/source_transactions", transactions.getUrl());
    assertEquals(1, transactions.getData().size());

    final SourceTransaction transaction = transactions.getData().get(0);

    assertEquals("srctxn_123", transaction.getId());
    assertEquals("source_transaction", transaction.getObject());
    assertEquals(1000L, (long) transaction.getAmount());
    assertEquals(1506086518L, (long) transaction.getCreated());
    assertEquals("usd", transaction.getCurrency());
    assertEquals(false, transaction.getLivemode());
    assertEquals("src_123", transaction.getSource());
    assertEquals("ach_credit_transfer", transaction.getType());

    final SourceTransaction.AchCreditTransferData typeData = transaction.getAchCreditTransfer();
    assertEquals("110000000", typeData.getRoutingNumber());
    assertEquals("U9AqfhJoSWCOImOv", typeData.getFingerprint());
  }
}
