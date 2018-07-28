package com.stripe.functional.sigma;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.model.sigma.ScheduledQueryRunCollection;
import com.stripe.net.APIResource;

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
    // stripe-mock doesn't handle this, so we stub the request
    stubRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs/%s", RUN_ID),
        null,
        ScheduledQueryRun.class,
        getResourceAsString("/api_fixtures/sigma/scheduled_query_run.json")
    );
    final ScheduledQueryRun run = ScheduledQueryRun.retrieve(RUN_ID);

    assertNotNull(run);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs/%s", RUN_ID)
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    // stripe-mock doesn't handle this, so we stub the request
    final ScheduledQueryRun stubbedRun = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/sigma/scheduled_query_run.json"),
        ScheduledQueryRun.class);
    final ScheduledQueryRunCollection stubbedCollection = new ScheduledQueryRunCollection();
    final List<ScheduledQueryRun> stubbedData = new ArrayList<ScheduledQueryRun>();
    stubbedData.add(stubbedRun);
    stubbedCollection.setData(stubbedData);
    stubRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs"),
        params,
        ScheduledQueryRunCollection.class,
        stubbedCollection.toJson()
    );


    ScheduledQueryRunCollection runs = ScheduledQueryRun.list(params);

    assertNotNull(runs);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/sigma/scheduled_query_runs"),
        params
    );
  }
}
