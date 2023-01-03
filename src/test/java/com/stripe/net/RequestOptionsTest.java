package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest {

  @Test
  public void testPersistentValuesInToBuilder() {
    RequestOptions opts =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                RequestOptions.builder()
                    .setApiKey("sk_foo")
                    .setClientId("123")
                    .setIdempotencyKey("123")
                    .setStripeAccount("acct_bar")
                    .setConnectTimeout(100)
                    .setReadTimeout(100)
                    .setConnectionProxy(
                        new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 1234)))
                    .setProxyCredential(
                        new PasswordAuthentication("username", "password".toCharArray())),
                "2015-05-05")
            .build();

    @SuppressWarnings("deprecation")
    RequestOptions optsRebuilt = opts.toBuilder().build();

    // only api keys and account should persist
    // assuming these are stable across a given stripe integration
    assertEquals("sk_foo", optsRebuilt.getApiKey());
    assertEquals("acct_bar", optsRebuilt.getStripeAccount());

    assertNull(optsRebuilt.getClientId());
    assertNull(optsRebuilt.getIdempotencyKey());
    assertNull(RequestOptions.unsafeGetStripeVersionOverride(optsRebuilt));
    assertEquals(Stripe.DEFAULT_CONNECT_TIMEOUT, optsRebuilt.getConnectTimeout());
    assertEquals(Stripe.DEFAULT_READ_TIMEOUT, optsRebuilt.getReadTimeout());
    assertEquals(Stripe.getConnectionProxy(), optsRebuilt.getConnectionProxy());
    assertEquals(Stripe.getProxyCredential(), optsRebuilt.getProxyCredential());
    assertEquals(null, optsRebuilt.getBaseUrl());
  }

  @Test
  public void testToBuilderFullCopy() {
    RequestOptions opts =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                RequestOptions.builder()
                    .setApiKey("sk_foo")
                    .setBaseUrl("http://example.com")
                    .setClientId("123")
                    .setIdempotencyKey("123")
                    .setStripeAccount("acct_bar")
                    .setConnectTimeout(100)
                    .setReadTimeout(100)
                    .setConnectionProxy(
                        new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 1234)))
                    .setProxyCredential(
                        new PasswordAuthentication("username", "password".toCharArray())),
                "2015-05-05")
            .build();

    RequestOptions optsRebuilt = opts.toBuilderFullCopy().build();

    assertEquals(opts, optsRebuilt);
  }

  @Test
  public void testStripeVersionOverride() {
    String stripeVersionOverride = "2015-05-05";

    RequestOptions.RequestOptionsBuilder builder =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
            RequestOptions.builder(), stripeVersionOverride);

    assertEquals(
        stripeVersionOverride, RequestOptions.unsafeGetStripeVersionOverride(builder.build()));
  }

  @Test
  public void testHashCodeEqualOverride() {
    Proxy connectionProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
    PasswordAuthentication proxyCredential =
        new PasswordAuthentication("username", "password".toCharArray());

    RequestOptions opts1 =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                RequestOptions.builder()
                    .setApiKey("sk_foo")
                    .setClientId("123")
                    .setIdempotencyKey("123")
                    .setStripeAccount("acct_bar")
                    .setConnectTimeout(100)
                    .setReadTimeout(200)
                    .setConnectionProxy(connectionProxy)
                    .setProxyCredential(proxyCredential),
                "2015-05-05")
            .build();

    RequestOptions opts2 =
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(
                RequestOptions.builder()
                    .setApiKey("sk_foo")
                    .setClientId("123")
                    .setIdempotencyKey("123")
                    .setStripeAccount("acct_bar")
                    .setConnectTimeout(100)
                    .setReadTimeout(200)
                    .setConnectionProxy(connectionProxy)
                    .setProxyCredential(proxyCredential),
                "2015-05-05")
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

  @Test
  public void testProxyDefaultValues() {
    Proxy origConnectionProxy = Stripe.getConnectionProxy();
    PasswordAuthentication origProxyCredential = Stripe.getProxyCredential();

    try {
      Proxy newConnectionProxy =
          new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
      PasswordAuthentication newProxyCredential =
          new PasswordAuthentication("username", "password".toCharArray());

      Stripe.setConnectionProxy(newConnectionProxy);
      Stripe.setProxyCredential(newProxyCredential);

      RequestOptions opts = RequestOptions.builder().build();

      assertEquals(newConnectionProxy, opts.getConnectionProxy());
      assertEquals(newProxyCredential, opts.getProxyCredential());
    } finally {
      Stripe.setConnectionProxy(origConnectionProxy);
      Stripe.setProxyCredential(origProxyCredential);
    }
  }
}
