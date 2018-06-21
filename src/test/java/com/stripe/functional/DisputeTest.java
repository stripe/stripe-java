package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Dispute;
import com.stripe.model.DisputeCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DisputeTest extends BaseStripeTest {
  public static final String DISPUTE_ID = "dp_123";

  private Dispute getDisputeFixture() throws StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);
    resetNetworkSpy();
    return dispute;
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);

    assertNotNull(dispute);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/disputes/%s", DISPUTE_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Dispute dispute = getDisputeFixture();

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Dispute updatedDispute = dispute.update(params);

    assertNotNull(updatedDispute);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/disputes/%s", dispute.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final DisputeCollection disputes = Dispute.list(params);

    assertNotNull(disputes);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/disputes"),
        params
    );
  }

  @Test
  public void testClose() throws StripeException {
    final Dispute dispute = getDisputeFixture();

    final Dispute closedDispute = dispute.close();

    assertNotNull(closedDispute);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/disputes/%s/close", dispute.getId())
    );
  }
}
