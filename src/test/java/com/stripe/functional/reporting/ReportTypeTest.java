package com.stripe.functional.reporting;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.reporting.ReportType;
import com.stripe.model.reporting.ReportTypeCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ReportTypeTest extends BaseStripeTest {
  public static final String REPORT_TYPE_ID = "activity.summary.1";

  @Test
  public void testRetrieve() throws StripeException {
    final ReportType reportType = ReportType.retrieve(REPORT_TYPE_ID);

    assertNotNull(reportType);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/reporting/report_types/%s", REPORT_TYPE_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();

    ReportTypeCollection reportTypes = ReportType.list(params);

    assertNotNull(reportTypes);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/reporting/report_types"), params);
  }
}
