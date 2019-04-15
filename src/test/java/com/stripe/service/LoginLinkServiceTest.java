package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.LoginLink;
import com.stripe.net.ApiResource;
import com.stripe.param.LoginLinkCreateParams;

import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.Test;

class LoginLinkServiceTest extends BaseStripeTest {
  private static final String ACCOUNT_ID = "acct_123";
  private LoginLinkService loginLinkService = new LoginLinkService();

  @Test
  public void testCreate() throws StripeException, IOException {
    Map<String, Object> params = ImmutableMap.of("redirect_url", "url");

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", ACCOUNT_ID),
        params,
        LoginLink.class,
        getResourceAsString("/api_fixtures/login_link.json")
    );

    LoginLink link = loginLinkService.create(
        ACCOUNT_ID,
        LoginLinkCreateParams.builder()
            .setRedirectUrl("url")
            .build());

    assertNotNull(link);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", ACCOUNT_ID),
        params
    );
  }
}