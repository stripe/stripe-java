package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.ThreeDSecure;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ThreeDSecureTest extends BaseStripeTest {
  public static final String TDS_ID = "tds_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("amount", 1000);
    params.put("currency", "usd");
    params.put("customer", "cus_123");
    params.put("card", "card_123");
    params.put("return_url", "https://example.com");

    final ThreeDSecure threeDSecure = ThreeDSecure.create(params);

    assertNotNull(threeDSecure);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/3d_secure",
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final ThreeDSecure threeDSecure = ThreeDSecure.retrieve(TDS_ID);

    assertNotNull(threeDSecure);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/3d_secure/%s", TDS_ID)
    );
  }
}
