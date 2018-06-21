package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.LoginLink;
import com.stripe.model.LoginLinkCollection;
import com.stripe.net.ApiResource;

import java.io.IOException;

import org.junit.Test;

public class LoginLinkTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "acct_123";

  @Test
  public void testCreate() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);

    // stripe-mock doesn't support this
    final LoginLinkCollection stubbedCollection = new LoginLinkCollection();
    stubbedCollection.setUrl(String.format("/v1/accounts/%s/login_links", account.getId()));
    account.setLoginLinks(stubbedCollection);

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", account.getId()),
        null,
        LoginLink.class,
        getResourceAsString("/api_fixtures/login_link.json")
    );

    final LoginLink link = account.getLoginLinks().create();

    assertNotNull(link);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", account.getId())
    );
  }
}
