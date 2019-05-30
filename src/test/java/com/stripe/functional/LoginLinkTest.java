package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.LoginLink;
import com.stripe.net.ApiResource;
import java.io.IOException;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class LoginLinkTest extends BaseStripeTest {
  public static final String ACCOUNT_ID = "acct_123";

  @Test
  public void testCreate() throws IOException, StripeException {
    final Account account = Account.retrieve(ACCOUNT_ID, null);

    final LoginLink link = LoginLink.createOnAccount(ACCOUNT_ID, (Map<String, Object>) null, null);

    stubRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", account.getId()),
        null,
        LoginLink.class,
        getResourceAsString("/api_fixtures/login_link.json"));

    assertNotNull(link);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/accounts/%s/login_links", account.getId()));
  }
}
