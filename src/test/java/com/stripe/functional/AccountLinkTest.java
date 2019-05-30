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
    params.put("failure_url", "https://stripe.com/failure");
    params.put("success_url", "https://stripe.com/success");
    params.put("type", "custom_account_verification");

    final AccountLink accountLink = AccountLink.create(params);

    assertNotNull(accountLink);
    verifyRequest(ApiResource.RequestMethod.POST, String.format("/v1/account_links"), params);
  }
}
