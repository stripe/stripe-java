package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponse;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RequestOptionsTest extends BaseStripeTest {
  @Ignore // stripe-mock doesn't send a Stripe-Version header
  @Test
  public void testApiVersion() throws StripeException {
    final String apiVersion = "2017-05-25";

    final RequestOptions options = RequestOptions.builder().setStripeVersion(apiVersion).build();

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    assertEquals(apiVersion, response.headers().get("Stripe-Version"));
  }

  @Test
  public void testIdempotencyKey() throws StripeException {
    final String idempotencyKey = "824d3177-9a1c-4124-a888-2c2fbd5f953a";

    final RequestOptions options =
        RequestOptions.builder().setIdempotencyKey(idempotencyKey).build();

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    assertEquals(idempotencyKey, response.headers().get("Idempotency-Key"));
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testConnectTimeout() throws IOException, StripeException {
    // Kind of terrible, but let's test connection timeouts with an external server and a super
    // short timeout.
    Stripe.overrideApiBase("https://api.stripe.com");

    thrown.expect(APIConnectionException.class);
    thrown.expectMessage("connect timed out");

    final RequestOptions options = RequestOptions.builder().setConnectTimeout(1).build();
    Balance.retrieve(options);
  }

  @Test
  public void testReadTimeout() throws IOException, StripeException {
    // Also kind of terrible, but let's test read connection timeouts with a valid external server
    // but a super short timeout.
    Stripe.overrideApiBase("https://api.stripe.com");

    thrown.expect(APIConnectionException.class);
    thrown.expectMessage("Read timed out");

    final RequestOptions options = RequestOptions.builder().setReadTimeout(1).build();
    Balance.retrieve(options);
  }
}
