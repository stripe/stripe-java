package com.stripe.functional.identity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.identity.VerificationReport;
import com.stripe.model.identity.VerificationReportCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class VerificationReportTest extends BaseStripeTest {
  public static final String VERIFICATION_REPORT_ID = "vr_123";

  @Test
  public void testRetrieve() throws StripeException {
    final VerificationReport verificationReport =
        VerificationReport.retrieve(VERIFICATION_REPORT_ID);

    assertNotNull(verificationReport);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/identity/verification_reports/%s", VERIFICATION_REPORT_ID));
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    VerificationReportCollection verificationReports = VerificationReport.list(params);

    assertNotNull(verificationReports);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/identity/verification_reports"), params);
  }
}
