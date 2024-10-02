package com.stripe.net;

import static org.junit.jupiter.api.Assertions.*;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import org.junit.jupiter.api.Test;

public class RequestOptionsTest extends BaseStripeTest {

  @Test
  public void testPersistentValuesInToBuilder() {
    Stripe.clientId = "other value";

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

    assertNull(optsRebuilt.getIdempotencyKey());
    assertNull(RequestOptions.unsafeGetStripeVersionOverride(optsRebuilt));
    assertNull(optsRebuilt.getClientId());
    assertNull(optsRebuilt.getConnectTimeout());
    assertNull(optsRebuilt.getReadTimeout());
    assertNull(optsRebuilt.getConnectionProxy());
    assertNull(optsRebuilt.getProxyCredential());
    assertNull(optsRebuilt.getBaseUrl());
  }

  @Test
  public void testUsesGlobalStripeVersionWithDefault() {
    String originalVersion = Stripe.stripeVersion;
    assertEquals(originalVersion, RequestOptions.getDefault().getStripeVersion());

    Stripe.stripeVersion = "2022-08-19";
    assertEquals("2022-08-19", RequestOptions.getDefault().getStripeVersion());
  }

  @Test
  public void testUsesGlobalStripeVersionWithBuilder() {
    String originalVersion = Stripe.stripeVersion;
    assertEquals(originalVersion, RequestOptions.builder().build().getStripeVersion());

    Stripe.stripeVersion = "2022-08-19";
    assertEquals("2022-08-19", RequestOptions.builder().build().getStripeVersion());
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
  public void mergeOverwritesClientOptions() {
    Proxy clientProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
    PasswordAuthentication clientProxyCred =
        new PasswordAuthentication("username", "password".toCharArray());

    Proxy requestProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
    PasswordAuthentication requestProxyCred =
        new PasswordAuthentication("username", "password".toCharArray());

    StripeResponseGetterOptions clientOptions =
        TestStripeResponseGetterOptions.builder()
            .setAuthenticator(new BearerTokenAuthenticator("key1"))
            .setConnectTimeout(1)
            .setMaxNetworkRetries(2)
            .setReadTimeout(3)
            .setClientId("1")
            .setConnectionProxy(clientProxy)
            .setProxyCredential(clientProxyCred)
            .setStripeContext("globalContext")
            .build();

    RequestOptions requestOptions =
        RequestOptions.builder()
            .setApiKey("key2")
            .setConnectTimeout(3)
            .setMaxNetworkRetries(4)
            .setReadTimeout(5)
            .setClientId("2")
            .setConnectionProxy(requestProxy)
            .setProxyCredential(requestProxyCred)
            .setIdempotencyKey("3")
            .setStripeAccount("4")
            .setStripeContext("5")
            .build();

    RequestOptions merged = RequestOptions.merge(clientOptions, requestOptions);
    assertEquals("key2", merged.getApiKey());
    assertEquals(3, merged.getConnectTimeout());
    assertEquals(4, merged.getMaxNetworkRetries());
    assertEquals(5, merged.getReadTimeout());
    assertEquals("2", merged.getClientId());
    assertEquals(requestProxy, merged.getConnectionProxy());
    assertEquals(requestProxyCred, merged.getProxyCredential());
    assertEquals("3", merged.getIdempotencyKey());
    assertEquals("4", merged.getStripeAccount());
    assertEquals("5", merged.getStripeContext());
  }

  @Test
  public void mergeFallsBackToClientOptions() {
    Proxy clientProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
    PasswordAuthentication clientProxyCred =
        new PasswordAuthentication("username", "password".toCharArray());

    StripeResponseGetterOptions clientOptions =
        TestStripeResponseGetterOptions.builder()
            .setAuthenticator(new BearerTokenAuthenticator("key1"))
            .setConnectTimeout(1)
            .setMaxNetworkRetries(1)
            .setReadTimeout(1)
            .setClientId("1")
            .setConnectionProxy(clientProxy)
            .setProxyCredential(clientProxyCred)
            .setStripeContext("global context")
            .build();

    RequestOptions requestOptions = RequestOptions.builder().build();

    RequestOptions merged = RequestOptions.merge(clientOptions, requestOptions);
    assertEquals("key1", merged.getApiKey());
    assertEquals(1, merged.getConnectTimeout());
    assertEquals(1, merged.getMaxNetworkRetries());
    assertEquals(1, merged.getReadTimeout());
    assertEquals("1", merged.getClientId());
    assertEquals(clientProxy, merged.getConnectionProxy());
    assertEquals(clientProxyCred, merged.getProxyCredential());
    assertEquals(null, merged.getIdempotencyKey());
    assertEquals(null, merged.getStripeAccount());
    assertEquals("global context", merged.getStripeContext());
  }

  @Test
  public void defaultsToAllNullValues() {
    RequestOptions merged = RequestOptions.getDefault();
    assertEquals(null, merged.getApiKey());
    assertEquals(null, merged.getConnectTimeout());
    assertEquals(null, merged.getMaxNetworkRetries());
    assertEquals(null, merged.getReadTimeout());
    assertEquals(null, merged.getClientId());
    assertEquals(null, merged.getConnectionProxy());
    assertEquals(null, merged.getProxyCredential());
    assertEquals(null, merged.getIdempotencyKey());
    assertEquals(null, merged.getStripeAccount());
  }
}
