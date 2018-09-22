package com.stripe.functional.issuing;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Dispute;
import com.stripe.model.issuing.DisputeCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class DisputeTest extends BaseStripeTest {
  public static final String DISPUTE_ID = "idp_123";

  @Test
  public void testCreate() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("reason", "fraudulent");
    params.put("disputed_transaction", "ipi_123");

    final Dispute dispute = Dispute.create(params);

    assertNotNull(dispute);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/disputes"),
        params
    );
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);

    assertNotNull(dispute);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/disputes/%s", DISPUTE_ID)
    );
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Dispute updatedDispute = dispute.update(params);

    assertNotNull(updatedDispute);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/disputes/%s", dispute.getId()),
        params
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    DisputeCollection disputes = Dispute.list(params);

    assertNotNull(disputes);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/disputes"),
        params
    );
  }
}
