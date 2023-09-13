package com.stripe.model.issuing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class DisputeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/issuing/disputes/idp_123");
    final Dispute dispute = ApiResource.GSON.fromJson(data, Dispute.class);

    assertNotNull(dispute);
    assertNotNull(dispute.getId());
    assertEquals("issuing.dispute", dispute.getObject());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    // TODO: handle support for balance_transactions expansion as stripe-mock doesn't support this
    // well
    final String[] expansions = {
      "transaction",
    };
    final String data = getFixture("/v1/issuing/disputes/idp_123", expansions);
    final Dispute dispute = ApiResource.GSON.fromJson(data, Dispute.class);
    assertNotNull(dispute);
    final Transaction transaction = dispute.getTransactionObject();
    assertNotNull(transaction);
    assertNotNull(transaction.getId());
    assertEquals(dispute.getTransaction(), transaction.getId());
  }
}
