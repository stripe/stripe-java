package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class BalanceTest extends BaseStripeTest {
  @Test
  public void testRetrieve() throws StripeException {
    final Balance balance = Balance.retrieve();

    assertNotNull(balance);
    verifyRequest(ApiResource.RequestMethod.GET, String.format("/v1/balance"));
  }
}
