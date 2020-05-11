package com.stripe.functional.checkout;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.LineItemCollection;
import com.stripe.model.checkout.Session;
import com.stripe.net.ApiResource;
import com.stripe.param.checkout.SessionListLineItemsParams;
import org.junit.jupiter.api.Test;

public class SessionTest extends BaseStripeTest {
  public static final String SESSION_ID = "cs_123";

  @Test
  public void testListLineItems() throws StripeException {

    Session session = Session.retrieve(SESSION_ID);

    SessionListLineItemsParams params = SessionListLineItemsParams.builder().build();

    final LineItemCollection lineItems = session.listLineItems(params);

    assertNotNull(lineItems);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/checkout/sessions/cs_123/line_items"),
        params.toMap());
  }
}
