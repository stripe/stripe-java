package com.stripe.functional.issuing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Authorization;
import com.stripe.model.issuing.AuthorizationCollection;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class AuthorizationTest extends BaseStripeTest {
  public static final String AUTHORIZATION_ID = "iauth_123";

  @Test
  public void testApprove() throws StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Authorization approvedAuthorization = authorization.approve((Map<String, Object>) null);

    assertNotNull(approvedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s/approve", authorization.getId()),
        null);
  }

  @Test
  public void testDecline() throws StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Authorization approvedAuthorization = authorization.decline((Map<String, Object>) null);

    assertNotNull(approvedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s/decline", authorization.getId()),
        null);
  }

  @Test
  public void testRetrieve() throws StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    assertNotNull(authorization);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/authorizations/%s", AUTHORIZATION_ID));
  }

  @Test
  public void testUpdate() throws StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final Authorization updatedAuthorization = authorization.update(params);

    assertNotNull(updatedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s", authorization.getId()),
        params);
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    AuthorizationCollection authorizations = Authorization.list(params);

    assertNotNull(authorizations);
    verifyRequest(
        ApiResource.RequestMethod.GET, String.format("/v1/issuing/authorizations"), params);
  }
}
