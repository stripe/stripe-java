package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.UsageRecord;
import com.stripe.net.ApiResource;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UsageRecordTest extends BaseStripeTest {
  private static final String SUBCRIPTION_ITEM_ID = "si_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("quantity", 10);
    params.put("subscription_item", SUBCRIPTION_ITEM_ID);
    params.put("timestamp", System.currentTimeMillis() / 1000L);

    final UsageRecord resource = UsageRecord.create(params, null);

    // UsageRecord.create() has a non-standard behavior: it uses the `subscription_item` element
    // in the params map to form the endpoint's URL. We need to remove it from the map because
    // it won't be sent as a URL-encoded parameter.
    params.remove("subscription_item");

    assertNotNull(resource);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/subscription_items/%s/usage_records", SUBCRIPTION_ITEM_ID),
        params
    );
  }
}
