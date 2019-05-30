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
    final String[] expansions = {
      "disputed_transaction",
    };
    final String data = getFixture("/v1/issuing/disputes/idp_123", expansions);
    final Dispute dispute = ApiResource.GSON.fromJson(data, Dispute.class);

    assertNotNull(dispute);
    assertNotNull(dispute.getId());
    assertEquals("issuing.dispute", dispute.getObject());

    final Transaction disputedTransaction = dispute.getDisputedTransactionObject();
    assertNotNull(disputedTransaction);
    assertNotNull(disputedTransaction.getId());
    assertEquals(dispute.getDisputedTransaction(), disputedTransaction.getId());
  }
}
