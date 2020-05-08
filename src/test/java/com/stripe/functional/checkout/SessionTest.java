package com.stripe.functional.checkout;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.net.ApiResource;
import com.stripe.param.checkout.SessionLineItemCollectionListParams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SessionTest extends BaseStripeTest {
  @Test
  public void testListLineItemsWithMap() throws StripeException {
    Session session;
    {
      final Map<String, Object> params = new HashMap<String, Object>();
      params.put("cancel_url", "foo");
      params.put("payment_method_types", Arrays.asList("card"));
      params.put("success_url", "foo");
      session = Session.create(params);
      verifyRequest(ApiResource.RequestMethod.POST, "/v1/checkout/sessions");
      assertNotNull(session);
    }
    final Map<String, Object> params = new HashMap<String, Object>();
    session.listLineItems(params);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/checkout/sessions/%s/line_items", session.getId()));
  }

  @Test
  public void testListLineItemsWithParamClass() throws StripeException {
    Session session;
    {
      final Map<String, Object> params = new HashMap<String, Object>();
      params.put("cancel_url", "foo");
      params.put("payment_method_types", Arrays.asList("card"));
      params.put("success_url", "foo");
      session = Session.create(params);
      verifyRequest(ApiResource.RequestMethod.POST, "/v1/checkout/sessions");
      assertNotNull(session);
    }
    final SessionLineItemCollectionListParams params =
        SessionLineItemCollectionListParams.builder().build();
    session.listLineItems(params);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/checkout/sessions/%s/line_items", session.getId()));
  }
}
