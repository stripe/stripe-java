package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Payout;
import com.stripe.model.PayoutCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PayoutTest extends BaseStripeTest {
  public static final String PAYOUT_ID = "po_123";

  private Payout getPayoutFixture() throws StripeException {
    final Payout payout = Payout.retrieve(PAYOUT_ID);
    resetNetworkSpy();
    return payout;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", "10000");
    params.put("currency", "usd");

    final Payout payout = Payout.create(params);

    assertNotNull(payout);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payouts"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Payout payout = Payout.retrieve(PAYOUT_ID);

    assertNotNull(payout);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/payouts/%s", PAYOUT_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Payout payout = getPayoutFixture();

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Payout updatedPayout = payout.update(params);

    assertNotNull(updatedPayout);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payouts/%s", payout.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final PayoutCollection payouts = Payout.list(params);

    assertNotNull(payouts);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/payouts"),
        params
    );
  }

  @Test
  public void testCancel() throws StripeException {
    final Payout resource = getPayoutFixture();

    final Payout cancelledPayout = resource.cancel();

    assertNotNull(cancelledPayout);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payouts/%s/cancel", resource.getId())
    );
  }
}
