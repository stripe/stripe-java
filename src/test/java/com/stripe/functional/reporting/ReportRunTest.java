package com.stripe.functional.reporting;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.reporting.ReportRun;
import com.stripe.model.reporting.ReportRunCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ReportRunTest extends BaseStripeTest {
  public static final String REPORT_RUN_ID = "frr_123";

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("report_type", "activity.summary.1");

    final ReportRun reportRun = ReportRun.create(params);

    assertNotNull(reportRun);
    verifyRequest(
        ApiResource.RequestMethod.POST, String.format("/v1/reporting/report_runs"), params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final ReportRun reportRun = ReportRun.retrieve(REPORT_RUN_ID);

    assertNotNull(reportRun);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/reporting/report_runs/%s", REPORT_RUN_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    ReportRunCollection reportRuns = ReportRun.list(params);

    assertNotNull(reportRuns);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/reporting/report_runs"), params);
  }
}
