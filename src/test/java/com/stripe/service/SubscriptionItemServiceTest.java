package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.UsageRecordSummaryCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.SubscriptionItemUsageRecordSummariesParams;

import org.junit.jupiter.api.Test;

class SubscriptionItemServiceTest extends BaseStripeTest {
  private static final String ITEM_ID = "si_123";

  private SubscriptionItemService subscriptionItemService = new SubscriptionItemService();

  @Test
  public void testUsageRecordSummaries() throws StripeException {
    final UsageRecordSummaryCollection summaries = subscriptionItemService.usageRecordSummaries(
        ITEM_ID,
        SubscriptionItemUsageRecordSummariesParams.builder()
            .setLimit(1L).build());

    assertNotNull(summaries);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/subscription_items/%s/usage_record_summaries", ITEM_ID),
        ImmutableMap.of("limit", 1)
    );
  }
}