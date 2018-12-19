package com.stripe.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.CheckoutSession;
import com.stripe.net.ApiResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CheckoutSessionTest extends BaseStripeTest {
  @Test
  public void testCreate() throws StripeException {
    final List<String> allowedSourcetypes = new ArrayList<String>();
    allowedSourcetypes.add("card");

    final Map<String, Object> item = new HashMap<String, Object>();
    item.put("amount", 1234);
    item.put("currency", "usd");
    item.put("name", "item name");
    item.put("quantity", 2);

    final List<Object> items = new ArrayList<Object>();
    items.add(item);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("allowed_source_types", allowedSourcetypes);
    params.put("cancel_url", "https://stripe.com/cancel");
    params.put("line_items", items);
    params.put("success_url", "https://stripe.com/success");

    final CheckoutSession session = CheckoutSession.create(params);

    assertNotNull(session);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/checkout_sessions"),
        params
    );
  }
}
