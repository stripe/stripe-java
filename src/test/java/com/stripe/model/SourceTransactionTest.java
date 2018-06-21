package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.SourceTransactionCollection;
import com.stripe.net.ApiResource;

import java.util.Map;

import org.junit.Test;

public class SourceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/source_transactions.json");
    final SourceTransactionCollection transactions = ApiResource.GSON.fromJson(json,
        SourceTransactionCollection.class);

    assertNotNull(transactions);
    assertEquals("/v1/sources/src_123/source_transactions", transactions.getUrl());
    assertEquals(1, transactions.getData().size());

    final SourceTransaction transaction = transactions.getData().get(0);
    final Map<String, String> typeData = transaction.getTypeData();

    assertEquals("srctxn_123", transaction.getId());
    assertEquals("source_transaction", transaction.getObject());
    assertEquals(1000L, (long) transaction.getAmount());
    assertEquals(1506086518L, (long) transaction.getCreated());
    assertEquals("usd", transaction.getCurrency());
    assertEquals(false, transaction.getLivemode());
    assertEquals("src_123", transaction.getSource());
    assertEquals("ach_credit_transfer", transaction.getType());

    assertEquals("db67", typeData.get("last4"));
    assertEquals("110000000", typeData.get("routing_number"));
    assertEquals("U9AqfhJoSWCOImOv", typeData.get("fingerprint"));
  }
}
