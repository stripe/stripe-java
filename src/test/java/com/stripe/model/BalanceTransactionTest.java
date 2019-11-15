package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BalanceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/balance_transactions/txn_123");
    final BalanceTransaction resource = ApiResource.GSON.fromJson(data, BalanceTransaction.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }

  @Test
  public void testDeserializeExpansions() throws Exception {
    // TODO: Figure out why stripe-mock does not expand source when asked
    final String data = getResourceAsString("/api_fixtures/balance_transaction_expansion.json");
    final BalanceTransaction resource = ApiResource.GSON.fromJson(data, BalanceTransaction.class);
    assertNotNull(resource);
    final HasId source = resource.getSourceObject();
    assertNotNull(source);
    assertNotNull(source.getId());
  }

  @Test
  public void testDeserializeCollectionWithSourceExpansions() throws Exception {
    final String data =
        getResourceAsString(
            "/api_fixtures/balance_transaction_collection_with_source_expansion.json");
    final BalanceTransactionCollection btCollection =
        ApiResource.GSON.fromJson(data, BalanceTransactionCollection.class);

    assertNotNull(btCollection);
    final List<BalanceTransaction> bts = btCollection.getData();
    assertNotNull(bts);

    for (BalanceTransaction bt : bts) {
      String btId = bt.getId();

      if ("txn_100".equals(btId)) {
        ApplicationFee btSource = (ApplicationFee) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("application_fee", btSource.getObject());
      } else if ("txn_101".equals(btId)) {
        Charge btSource = (Charge) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("charge", btSource.getObject());
      } else if ("txn_102".equals(btId)) {
        Dispute btSource = (Dispute) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("dispute", btSource.getObject());
      } else if ("txn_103".equals(btId)) {
        Payout btSource = (Payout) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("payout", btSource.getObject());
      } else if ("txn_104".equals(btId)) {
        Refund btSource = (Refund) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("refund", btSource.getObject());
      } else if ("txn_105".equals(btId)) {
        Transfer btSource = (Transfer) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("transfer", btSource.getObject());
      } else if ("txn_106".equals(btId)) {
        TransferReversal btSource = (TransferReversal) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("transfer_reversal", btSource.getObject());
      } else if ("txn_107".equals(btId)) {
        Topup btSource = (Topup) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("topup", btSource.getObject());
      } else if ("txn_108".equals(btId)) {
        com.stripe.model.issuing.Authorization btSource =
            (com.stripe.model.issuing.Authorization) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("issuing.authorization", btSource.getObject());
      } else if ("txn_109".equals(btId)) {
        com.stripe.model.issuing.Transaction btSource =
            (com.stripe.model.issuing.Transaction) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("issuing.transaction", btSource.getObject());
      } else if ("txn_110".equals(btId)) {
        BalanceTransactionSourceTypeAdapterFactory.UnknownSubType btSource =
            (BalanceTransactionSourceTypeAdapterFactory.UnknownSubType) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("foo_unknown_type", btSource.getObject());
      }
    }
  }
}
