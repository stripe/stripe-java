package com.stripe.functional.issuing;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.issuing.Authorization;
import com.stripe.model.issuing.AuthorizationCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class AuthorizationTest extends BaseStripeTest {
  public static final String AUTHORIZATION_ID = "iauth_123";

  @Test
  public void testApprove() throws IOException, StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Authorization approvedAuthorization = authorization.approve(null);

    assertNotNull(approvedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s/approve", authorization.getId()),
        null
    );
  }

  @Test
  public void testDecline() throws IOException, StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Authorization approvedAuthorization = authorization.decline(null);

    assertNotNull(approvedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s/decline", authorization.getId()),
        null
    );
  }

  @Test
  public void testRetrieve() throws IOException, StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    assertNotNull(authorization);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/authorizations/%s", AUTHORIZATION_ID)
    );
  }

  @Test
  public void testUpdate() throws IOException, StripeException {
    final Authorization authorization = Authorization.retrieve(AUTHORIZATION_ID);

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    final Authorization updatedAuthorization = authorization.update(params);

    assertNotNull(updatedAuthorization);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/issuing/authorizations/%s", authorization.getId()),
        params
    );
  }

  @Test
  public void testList() throws IOException, StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    AuthorizationCollection authorizations = Authorization.list(params);

    assertNotNull(authorizations);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/issuing/authorizations"),
        params
    );
  }
}
