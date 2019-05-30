package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class PayoutTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/payouts/po_123");
    final Payout resource = ApiResource.GSON.fromJson(data, Payout.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeWithExpandedDeletedBankAccount() throws IOException {
    final String data =
        getResourceAsString("/api_fixtures/payout_with_del_ext_bank_acct_expansion.json");
    final Payout resource = ApiResource.GSON.fromJson(data, Payout.class);
    final BankAccount bankAccount = (BankAccount) resource.getDestinationObject();

    assertNotNull(bankAccount);
    assertTrue(bankAccount.getDeleted());
  }
}
