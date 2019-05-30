package com.stripe.functional.sigma;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.model.sigma.ScheduledQueryRunCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ScheduledQueryRunTest extends BaseStripeTest {
  public static final String RUN_ID = "sqr_123";

  @Test
  public void testRetrieve() throws StripeException {
    final ScheduledQueryRun run = ScheduledQueryRun.retrieve(RUN_ID);

    assertNotNull(run);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/sigma/scheduled_query_runs/%s", RUN_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    ScheduledQueryRunCollection runs = ScheduledQueryRun.list(params);

    assertNotNull(runs);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/sigma/scheduled_query_runs"), params);
  }
}
