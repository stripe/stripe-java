package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Topup;
import com.stripe.model.TopupCollection;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TopupTest extends BaseStripeTest {
  public static final String TOPUP_ID = "tu_123";

  private Topup getTopupFixture() throws StripeException {
    final Topup topup = Topup.retrieve(TOPUP_ID);
    resetNetworkSpy();
    return topup;
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 100);
    params.put("currency", "usd");
    params.put("source", "src_123");
    params.put("description", "creating a topup");
    params.put("statement_descriptor", "topup");

    final Topup topup = Topup.create(params);

    assertNotNull(topup);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/topups",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Topup topup = Topup.retrieve(TOPUP_ID);

    assertNotNull(topup);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/topups/%s", TOPUP_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final Topup topup = getTopupFixture();

    final Map<String, Object> metadata = new HashMap<String, Object>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Topup updatedTopup = topup.update(params);

    assertNotNull(updatedTopup);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/topups/%s", topup.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    final TopupCollection topups = Topup.list(params);

    assertNotNull(topups);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        "/v1/topups",
        params
    );
  }
}
