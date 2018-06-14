package com.stripe.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponse;

import org.junit.Ignore;
import org.junit.Test;

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
}
