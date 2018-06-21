package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Transfer;
import com.stripe.model.TransferCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TransferTest extends BaseStripeTest {
  public static final String TRANSFER_ID = "tr_123";

  private Transfer getTransferFixture() throws StripeException {
    final Transfer transfer = Transfer.retrieve(TRANSFER_ID);
    resetNetworkSpy();
    return transfer;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 100);
    params.put("currency", "usd");
    params.put("destination", "acct_123");

    final Transfer transfer = Transfer.create(params);

    assertNotNull(transfer);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/transfers",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Transfer transfer = Transfer.retrieve(TRANSFER_ID);

    assertNotNull(transfer);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/transfers/%s", TRANSFER_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    Transfer transfer = getTransferFixture();

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Transfer updatedTransfer = transfer.update(params);

    assertNotNull(updatedTransfer);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/transfers/%s", transfer.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final TransferCollection transfers = Transfer.list(params);

    assertNotNull(transfers);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/transfers",
        params
    );
  }
}
