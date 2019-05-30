package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.UsageRecord;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class UsageRecordTest extends BaseStripeTest {
  private static final String SUBSCRIPTION_ITEM_ID = "si_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("quantity", 10);
    params.put("timestamp", System.currentTimeMillis() / 1000L);

    final UsageRecord resource =
        UsageRecord.createOnSubscriptionItem(SUBSCRIPTION_ITEM_ID, params, null);

    assertNotNull(resource);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/subscription_items/%s/usage_records", SUBSCRIPTION_ITEM_ID),
        params);
  }
}
