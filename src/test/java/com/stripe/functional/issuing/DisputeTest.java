package com.stripe.functional.issuing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Dispute;
import com.stripe.model.issuing.DisputeCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class DisputeTest extends BaseStripeTest {
  public static final String DISPUTE_ID = "idp_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("reason", "fraudulent");
    params.put("disputed_transaction", "ipi_123");

    final Dispute dispute = Dispute.create(params);

    assertNotNull(dispute);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/issuing/disputes"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);

    assertNotNull(dispute);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/issuing/disputes/%s", DISPUTE_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Dispute dispute = Dispute.retrieve(DISPUTE_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Dispute updatedDispute = dispute.update(params);

    assertNotNull(updatedDispute);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/disputes/%s", dispute.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    DisputeCollection disputes = Dispute.list(params);

    assertNotNull(disputes);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/issuing/disputes"), params);
  }
}
