package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.UsageRecordSummaryCollection;
import com.stripe.net.ApiResource;

import java.util.Map;

import org.junit.Test;

public class UsageRecordSummaryTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String json = getResourceAsString("/api_fixtures/usage_record_summary.json");
    final UsageRecordSummary summary = ApiResource.GSON.fromJson(json,
        UsageRecordSummary.class);

    assertNotNull(summary);
    assertEquals("sis_123", summary.getId());
    assertEquals("usage_record_summary", summary.getObject());
    assertEquals(1494288000L, (long) summary.getPeriod().getStart());
  }
}
