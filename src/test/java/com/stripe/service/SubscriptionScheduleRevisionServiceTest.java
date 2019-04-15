package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.SubscriptionScheduleRevision;
import com.stripe.model.SubscriptionScheduleRevisionCollection;
import com.stripe.net.ApiResource;
import com.stripe.param.SubscriptionScheduleRevisionListParams;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class SubscriptionScheduleRevisionServiceTest extends BaseStripeTest {
  public static final String SCHEDULE_ID = "sub_sched_123";
  public static final String REVISION_ID = "sub_sched_rev_123";

  private SubscriptionScheduleRevisionService service = new SubscriptionScheduleRevisionService();

  @Test
  public void testList() throws StripeException {
    SubscriptionScheduleRevisionListParams params = SubscriptionScheduleRevisionListParams.builder()
        .setLimit(1L).build();
    SubscriptionScheduleRevisionCollection revisions = service.list(SCHEDULE_ID, params);

    assertNotNull(revisions);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/subscription_schedules/%s/revisions", SCHEDULE_ID),
        params.toMap()
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    SubscriptionScheduleRevision revision = service.retrieve(SCHEDULE_ID, REVISION_ID,null);
    assertNotNull(revision);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/subscription_schedules/%s/revisions/%s", SCHEDULE_ID, REVISION_ID),
        new HashMap<>()
    );
  }
}