package com.stripe.functional.identity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.identity.VerificationSession;
import com.stripe.model.identity.VerificationSessionCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class VerificationSessionTest extends BaseStripeTest {
  public static final String VERIFICATION_SESSION_ID = "vs_123";

  @Test
  public void testCancel() throws StripeException {
    final VerificationSession verificationSession =
        VerificationSession.retrieve(VERIFICATION_SESSION_ID);

    final VerificationSession cancelledVerificationSession =
        verificationSession.cancel((Map<String, Object>) null);

    assertNotNull(cancelledVerificationSession);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/identity/verification_sessions/%s/cancel", verificationSession.getId()),
        null);
  }

  @Test
  public void testRedact() throws StripeException {
    final VerificationSession verificationSession =
        VerificationSession.retrieve(VERIFICATION_SESSION_ID);

    final VerificationSession redactedVerificationSession =
        verificationSession.redact((Map<String, Object>) null);

    assertNotNull(redactedVerificationSession);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/identity/verification_sessions/%s/redact", verificationSession.getId()),
        null);
  }

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("type", "id_number");

    final VerificationSession verificationSession = VerificationSession.create(params);

    assertNotNull(verificationSession);
    verifyRequest(ApiResource.RequestMethod.POST, "/v1/identity/verification_sessions", params);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final VerificationSession verificationSession =
        VerificationSession.retrieve(VERIFICATION_SESSION_ID);

    assertNotNull(verificationSession);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/identity/verification_sessions/%s", VERIFICATION_SESSION_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final VerificationSession verificationSession =
        VerificationSession.retrieve(VERIFICATION_SESSION_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final VerificationSession updatedVerificationSession = verificationSession.update(params);

    assertNotNull(updatedVerificationSession);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/identity/verification_sessions/%s", verificationSession.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    VerificationSessionCollection verificationSessions = VerificationSession.list(params);

    assertNotNull(verificationSessions);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/identity/verification_sessions"), params);
  }
}
