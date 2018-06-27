package com.stripe.model.sigma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class ScheduledQueryRunTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/sigma/scheduled_query_run.json");
    final ScheduledQueryRun run = ApiResource.GSON.fromJson(data, ScheduledQueryRun.class);

    assertNotNull(run);
    assertNotNull(run.getId());
    assertEquals("scheduled_query_run", run.getObject());
    assertNotNull(run.getFile());
    assertEquals("file", run.getFile().getObject());
  }
}
