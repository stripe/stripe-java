package com.stripe.service.checkout;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.model.LineItemCollection;
import com.stripe.model.StripeCollection;
import com.stripe.model.checkout.Session;
import com.stripe.net.ApiResource;
import com.stripe.param.checkout.SessionListLineItemsParams;

import com.stripe.service.BaseServiceTest;
import org.junit.jupiter.api.Test;

public class SessionServiceTest extends BaseServiceTest {
  @Test
  public void testRetrieve() throws StripeException {
    Session session = this.client.checkout().sessions().retrieve("cs_123");
    assertNotNull(session);
    assertEquals("checkout.session", session.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/checkout/sessions/cs_123");
  }

  @Test
  public void testListLineItems() throws StripeException {
    LineItemCollection collection = this.client.checkout().sessions().listLineItems(
      "cs_123",
      SessionListLineItemsParams.builder().setLimit(5L).build()
    );
    assertNotNull(collection);
    assertEquals("list", collection.getObject());
    this.verifyRequest(ApiResource.RequestMethod.GET, "/v1/checkout/sessions/cs_123/line_items");
  }
}
