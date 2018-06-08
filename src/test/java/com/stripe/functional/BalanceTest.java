package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.APIResource;

import org.junit.Test;

public class BalanceTest extends BaseStripeTest {
  @Test
  public void testRetrieve() throws StripeException {
    final Balance balance = Balance.retrieve();

    assertNotNull(balance);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/balance")
    );
  }
}
