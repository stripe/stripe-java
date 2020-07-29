package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.AccountLink;
import com.stripe.net.ApiResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class AccountLinkTest extends BaseStripeTest {
  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("account", "acct_123");
    params.put("refresh_url", "https://stripe.com/refresh");
    params.put("return_url", "https://stripe.com/return");
    params.put("type", "account_onboarding");

    final AccountLink accountLink = AccountLink.create(params);

    assertNotNull(accountLink);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/account_links"), params);
  }
}
