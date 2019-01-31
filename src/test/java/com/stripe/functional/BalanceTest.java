package com.stripe.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.Stripe;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.ApiResource;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Test;

import java.io.IOException;

public class BalanceTest extends BaseStripeTest {
  @Test
  public void testRetrieve() throws StripeException {
    final Balance balance = Balance.retrieve();

    assertNotNull(balance);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/balance")
    );
  }
}
