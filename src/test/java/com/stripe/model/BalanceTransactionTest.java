package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import java.util.List;

import org.junit.Test;

public class BalanceTransactionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/balance/history/txn_123");
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
    final String data = getResourceAsString(
        "/api_fixtures/balance_transaction_collection_with_source_expansion.json");
    final BalanceTransactionCollection btCollection =
        ApiResource.GSON.fromJson(data, BalanceTransactionCollection.class);

    assertNotNull(btCollection);
    final List<BalanceTransaction> bts = btCollection.getData();
    assertNotNull(bts);

    for (BalanceTransaction bt : bts) {
      String btId = bt.getId();

      if (btId.equals("txn_100")) {
        ApplicationFee btSource = (ApplicationFee) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("application_fee", btSource.getObject());
      } else if (btId.equals("txn_101")) {
        Charge btSource = (Charge) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("charge", btSource.getObject());
      } else if (btId.equals("txn_102")) {
        Dispute btSource = (Dispute) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("dispute", btSource.getObject());
      } else if (btId.equals("txn_103")) {
        Payout btSource = (Payout) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("payout", btSource.getObject());
      } else if (btId.equals("txn_104")) {
        Refund btSource = (Refund) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("refund", btSource.getObject());
      } else if (btId.equals("txn_105")) {
        Transfer btSource = (Transfer) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("transfer", btSource.getObject());
      } else if (btId.equals("txn_106")) {
        TransferReversal btSource = (TransferReversal) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("transfer_reversal", btSource.getObject());
      } else if (btId.equals("txn_107")) {
        Topup btSource = (Topup) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("topup", btSource.getObject());
      } else if (btId.equals("txn_108")) {
        com.stripe.model.issuing.Authorization btSource =
            (com.stripe.model.issuing.Authorization) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("issuing.authorization", btSource.getObject());
      } else if (btId.equals("txn_109")) {
        com.stripe.model.issuing.Transaction btSource =
            (com.stripe.model.issuing.Transaction ) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("issuing.transaction", btSource.getObject());
      } else if (btId.equals("txn_110")) {
        BalanceTransactionSourceTypeAdapterFactory.UnknownSubType btSource =
            (BalanceTransactionSourceTypeAdapterFactory.UnknownSubType) bt.getSourceObject();
        assertNotNull(btSource);
        assertEquals("foo_unknown_type", btSource.getObject());
      }
    }
  }
}
