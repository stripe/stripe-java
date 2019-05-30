package com.stripe.model.issuing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.BalanceTransaction;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class TransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/issuing/transactions/ipi_123");
    final Transaction transaction = ApiResource.GSON.fromJson(data, Transaction.class);

    assertNotNull(transaction);
    assertNotNull(transaction.getId());
    assertEquals("issuing.transaction", transaction.getObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "authorization", "balance_transaction", "card", "cardholder",
    };
    final String data = getFixture("/v1/issuing/transactions/ipi_123", expansions);
    final Transaction transaction = ApiResource.GSON.fromJson(data, Transaction.class);

    assertNotNull(transaction);
    assertNotNull(transaction.getId());
    assertEquals("issuing.transaction", transaction.getObject());
    assertEquals("issuing.card", transaction.getCardObject().getObject());

    final Authorization authorization = transaction.getAuthorizationObject();
    assertNotNull(authorization);
    assertNotNull(authorization.getId());
    assertEquals(transaction.getAuthorization(), authorization.getId());

    final BalanceTransaction bt = transaction.getBalanceTransactionObject();
    assertNotNull(bt);
    assertNotNull(bt.getId());
    assertEquals(transaction.getBalanceTransaction(), bt.getId());

    final Card card = transaction.getCardObject();
    assertNotNull(card);
    assertNotNull(card.getId());
    assertEquals(transaction.getCard(), card.getId());

    final Cardholder cardholder = transaction.getCardholderObject();
    assertNotNull(cardholder);
    assertNotNull(cardholder.getId());
    assertEquals(transaction.getCardholder(), cardholder.getId());
  }
}
