package com.stripe.net;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

import org.junit.Test;

public class RequestOptionsTest {

  @Test
  public void testPersistentValuesInToBuilder() {
    RequestOptions opts = RequestOptions.builder()
        .setApiKey("sk_foo")
        .setClientId("123")
        .setIdempotencyKey("123")
        .setStripeAccount("acct_bar")
        .setStripeVersionOverride("2015-05-05")
        .setConnectTimeout(100)
        .setReadTimeout(100).build();

    RequestOptions optsRebuilt = opts.toBuilder().build();

    // only api keys and account should persist
    // assuming these are stable across a given stripe integration
    assertEquals("sk_foo", optsRebuilt.getApiKey());
    assertEquals("acct_bar", optsRebuilt.getStripeAccount());

    assertNull(optsRebuilt.getClientId());
    assertNull(optsRebuilt.getIdempotencyKey());
    assertNull(optsRebuilt.getStripeVersionOverride());
    assertEquals(0, optsRebuilt.getReadTimeout());
    assertEquals(0, optsRebuilt.getConnectTimeout());
  }

  @Test
  public void testStripeVersionOverride() {
    String stripeVersionOverride = "2015-05-05";

    RequestOptions.RequestOptionsBuilder builder = RequestOptions.builder()
        .setStripeVersionOverride(stripeVersionOverride);

    assertEquals(stripeVersionOverride, builder.getStripeVersionOverride());

    builder.clearStripeVersionOverride();
    assertNull(builder.getStripeVersionOverride());
  }

  @Test
  public void testHashCodeEqualOverride() {
    RequestOptions opts1 = RequestOptions.builder()
        .setApiKey("sk_foo")
        .setClientId("123")
        .setIdempotencyKey("123")
        .setStripeAccount("acct_bar")
        .setStripeVersionOverride("2015-05-05")
        .setConnectTimeout(100)
        .setReadTimeout(200).build();

    RequestOptions opts2 = RequestOptions.builder()
        .setApiKey("sk_foo")
        .setClientId("123")
        .setIdempotencyKey("123")
        .setStripeAccount("acct_bar")
        .setStripeVersionOverride("2015-05-05")
        .setConnectTimeout(100)
        .setReadTimeout(200).build();

    assertEquals(opts1, opts2);
    assertEquals(opts1.hashCode(), opts2.hashCode());
  }
}