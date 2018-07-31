package com.stripe.functional.sigma;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.model.sigma.ScheduledQueryRunCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class ScheduledQueryRunTest extends BaseStripeTest {
  public static final String RUN_ID = "sqr_123";

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final ScheduledQueryRun run = ScheduledQueryRun.retrieve(RUN_ID);

    assertNotNull(run);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs/%s", RUN_ID)
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    ScheduledQueryRunCollection runs = ScheduledQueryRun.list(params);

    assertNotNull(runs);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs"),
        params
    );
  }
}
