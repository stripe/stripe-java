package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource.RequestMethod;

import org.junit.jupiter.api.Test;

public class RawApiRequestTest extends BaseStripeTest {
  @Test
  public void testAddUsage() {
    RawApiRequest req1 = new RawApiRequest(BaseAddress.API, RequestMethod.POST, "/v1/customers", "description=foo", null, ApiMode.V1);
    RawApiRequest req2 = req1.addUsage("foo");
    RawApiRequest req3 = req2.addUsage("bar");
    assertEquals(null, req1.getUsage());
    assertEquals(1, req2.getUsage().size());
    assertEquals(2, req3.getUsage().size());
    assertEquals("foo", req2.getUsage().get(0));
    assertEquals("bar", req3.getUsage().get(1));
  }
}
