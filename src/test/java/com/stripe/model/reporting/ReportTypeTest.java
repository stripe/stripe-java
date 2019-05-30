package com.stripe.model.reporting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ReportTypeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/reporting/report_types/activity.summary.1");
    final ReportType reportType = ApiResource.GSON.fromJson(data, ReportType.class);

    assertNotNull(reportType);
    assertNotNull(reportType.getId());
    assertEquals("reporting.report_type", reportType.getObject());
  }
}
