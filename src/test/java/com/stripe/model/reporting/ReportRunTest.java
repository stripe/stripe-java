package com.stripe.model.reporting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ReportRunTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/reporting/report_runs/frr_123");
    final ReportRun reportRun = ApiResource.GSON.fromJson(data, ReportRun.class);

    assertNotNull(reportRun);
    assertNotNull(reportRun.getId());
    assertEquals("reporting.report_run", reportRun.getObject());
  }
}
