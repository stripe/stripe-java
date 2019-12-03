package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.Stripe;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest {

  @Test
  public void testPersistentValuesInToBuilder() {
    RequestOptions opts =
        RequestOptions.builder()
            .setApiKey("sk_foo")
            .setClientId("123")
            .setIdempotencyKey("123")
            .setStripeAccount("acct_bar")
            .setStripeVersionOverride("2015-05-05")
            .setConnectTimeout(100)
            .setReadTimeout(100)
            .build();

    RequestOptions optsRebuilt = opts.toBuilder().build();

    // only api keys and account should persist
    // assuming these are stable across a given stripe integration
    assertEquals("sk_foo", optsRebuilt.getApiKey());
    assertEquals("acct_bar", optsRebuilt.getStripeAccount());

    assertNull(optsRebuilt.getClientId());
    assertNull(optsRebuilt.getIdempotencyKey());
    assertNull(optsRebuilt.getStripeVersionOverride());
    assertEquals(Stripe.DEFAULT_CONNECT_TIMEOUT, optsRebuilt.getConnectTimeout());
    assertEquals(Stripe.DEFAULT_READ_TIMEOUT, optsRebuilt.getReadTimeout());
  }

  @Test
  public void testStripeVersionOverride() {
    String stripeVersionOverride = "2015-05-05";

    RequestOptions.RequestOptionsBuilder builder =
        RequestOptions.builder().setStripeVersionOverride(stripeVersionOverride);

    assertEquals(stripeVersionOverride, builder.getStripeVersionOverride());

    builder.clearStripeVersionOverride();
    assertNull(builder.getStripeVersionOverride());
  }

  @Test
  public void testHashCodeEqualOverride() {
    RequestOptions opts1 =
        RequestOptions.builder()
            .setApiKey("sk_foo")
            .setClientId("123")
            .setIdempotencyKey("123")
            .setStripeAccount("acct_bar")
            .setStripeVersionOverride("2015-05-05")
            .setConnectTimeout(100)
            .setReadTimeout(200)
            .build();

    RequestOptions opts2 =
        RequestOptions.builder()
            .setApiKey("sk_foo")
            .setClientId("123")
            .setIdempotencyKey("123")
            .setStripeAccount("acct_bar")
            .setStripeVersionOverride("2015-05-05")
            .setConnectTimeout(100)
            .setReadTimeout(200)
            .build();

    assertEquals(opts1, opts2);
    assertEquals(opts1.hashCode(), opts2.hashCode());
  }

  @Test
  public void testTimeoutDefaultValues() {
    int origConnectTimeout = Stripe.getConnectTimeout();
    int origReadTimeout = Stripe.getReadTimeout();

    try {
      Stripe.setConnectTimeout(123);
      Stripe.setReadTimeout(234);

      RequestOptions opts = RequestOptions.builder().build();

      assertEquals(123, opts.getConnectTimeout());
      assertEquals(234, opts.getReadTimeout());
    } finally {
      Stripe.setConnectTimeout(origConnectTimeout);
      Stripe.setReadTimeout(origReadTimeout);
    }
  }
}
