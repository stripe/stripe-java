package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Reversal;
import com.stripe.model.Transfer;
import com.stripe.model.TransferReversalCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ReversalTest extends BaseStripeTest {
  public static final String TRANSFER_ID = "tr_123";
  public static final String REVERSAL_ID = "trr_123";

  private Transfer getTransferFixture() throws StripeException {
    final Transfer transfer = Transfer.retrieve(TRANSFER_ID);
    resetNetworkSpy();
    return transfer;
  }

  private Reversal getReversalFixture(Transfer transfer) throws StripeException {
    final Reversal reversal = transfer.getReversals().retrieve(REVERSAL_ID);
    resetNetworkSpy();
    return reversal;
  }

  @Test
  public void testCreate() throws StripeException {
    final Transfer transfer = getTransferFixture();

    Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 100);

    final Reversal reversal = transfer.getReversals().create(params);

    assertNotNull(reversal);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/transfers/%s/reversals", transfer.getId()),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Transfer transfer = getTransferFixture();

    final Reversal reversal = transfer.getReversals().retrieve(REVERSAL_ID);

    assertNotNull(reversal);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/transfers/%s/reversals/%s", transfer.getId(), REVERSAL_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Transfer transfer = getTransferFixture();
    final Reversal reversal = getReversalFixture(transfer);

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Reversal updatedReversal = reversal.update(params);

    assertNotNull(updatedReversal);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/transfers/%s/reversals/%s", transfer.getId(), reversal.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Transfer transfer = getTransferFixture();

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final TransferReversalCollection reversals = transfer.getReversals().list(params);

    assertNotNull(reversals);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/transfers/%s/reversals", transfer.getId()),
        params
    );
  }
}
