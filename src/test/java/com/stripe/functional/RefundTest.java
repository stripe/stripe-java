package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Refund;
import com.stripe.model.RefundCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class RefundTest extends BaseStripeTest {
  public static final String REFUND_ID = "re_123";

  private Refund getRefundFixture() throws StripeException {
    final Refund refund = Refund.retrieve(REFUND_ID);
    resetNetworkSpy();
    return refund;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("charge", "ch_123");

    final Refund refund = Refund.create(params);

    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/refunds"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Refund refund = Refund.retrieve(REFUND_ID);

    assertNotNull(refund);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/refunds/%s", REFUND_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Refund refund = getRefundFixture();

    Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Refund updatedRefund = refund.update(params);

    assertNotNull(updatedRefund);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/refunds/%s", refund.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final RefundCollection refunds = Refund.list(params);

    assertNotNull(refunds);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/refunds"),
        params
    );
  }
}
