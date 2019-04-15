package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.UsageRecord;
import com.stripe.net.ApiResource;
import com.stripe.param.UsageRecordCreateParams;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class UsageRecordServiceTest extends BaseStripeTest {
  private static final String SUBSCRIPTION_ITEM_ID = "si_123";

  private UsageRecordService usageRecordService = new UsageRecordService();

  @Test
  public void testCreate() throws StripeException {
    long timeStamp = System.currentTimeMillis() / 1000L;
    final Map<String, Object> params = new HashMap<>();
    params.put("timestamp", timeStamp);
    params.put("quantity", 10);

    final UsageRecord resource = usageRecordService.create(
        SUBSCRIPTION_ITEM_ID, UsageRecordCreateParams.builder()
            .setTimestamp(timeStamp)
            .setQuantity(10L)
            .build());

    assertNotNull(resource);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/subscription_items/%s/usage_records", SUBSCRIPTION_ITEM_ID),
        params
    );
  }
}