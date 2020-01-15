package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponse;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest extends BaseStripeTest {
  @Test
  public void testApiVersion() throws StripeException {
    final RequestOptions options = RequestOptions.builder().build();
    assertEquals(Stripe.API_VERSION, options.getStripeVersion());
    assertNull(options.getStripeVersionOverride());

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    // stripe-mock doesn't send back a Stripe-Version header in the response.
    // assertEquals(Stripe.API_VERSION, response.headers().get("Stripe-Version"));
  }

  @Test
  public void testIdempotencyKey() throws StripeException {
    final String idempotencyKey = "824d3177-9a1c-4124-a888-2c2fbd5f953a";

    final RequestOptions options =
        RequestOptions.builder().setIdempotencyKey(idempotencyKey).build();

    final Balance balance = Balance.retrieve(options);
    final StripeResponse response = balance.getLastResponse();

    assertNotNull(response);
    assertEquals(idempotencyKey, response.idempotencyKey());
  }
}
