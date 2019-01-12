package com.stripe.net;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

import org.junit.Test;

public class RequestOptionsTest {
  @Test
  public void testPersistentValuesInToBuilder() {
    RequestOptions opts = RequestOptions.builder()
        .setApiKey("sk_foo")
        .setStripeAccount("acct_bar")
        .setClientId("123")
        .setIdempotencyKey("123")
        .setStripeVersionOnBehalfOf("2015-05-05")
        .setConnectTimeout(100)
        .setReadTimeout(100).build();

    RequestOptions optsRebuilt = opts.toBuilder().build();

    assertEquals("sk_foo", optsRebuilt.getApiKey());
    assertEquals("acct_bar", optsRebuilt.getStripeAccount());

    assertNull(optsRebuilt.getClientId());
    assertNull(optsRebuilt.getIdempotencyKey());
    assertNull(optsRebuilt.getStripeVersionOnBehalfOf());
    assertEquals(0, optsRebuilt.getReadTimeout());
    assertEquals(0, optsRebuilt.getConnectTimeout());
  }
}