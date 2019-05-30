package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class SubscriptionScheduleRevisionTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data =
        getFixture("/v1/subscription_schedules/sub_sched_123/revisions/sub_sched_rev_123");
    final SubscriptionScheduleRevision resource =
        ApiResource.GSON.fromJson(data, SubscriptionScheduleRevision.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
