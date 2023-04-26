package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.BaseStripeTest;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class RawRequestOptionsTest extends BaseStripeTest {

  @Test
  public void testRawRequestOptionsBuilder() {
    Map<String, String> additionalHeaders = new HashMap<>();
    additionalHeaders.put("foo", "bar");
    RawRequestOptions opts =
        RawRequestOptions.builder()
            .setApiKey("sk_foo")
            .setClientId("123")
            .setIdempotencyKey("123")
            .setStripeAccount("acct_bar")
            .setConnectTimeout(100)
            .setReadTimeout(100)
            .setConnectionProxy(
                new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 1234)))
            .setProxyCredential(new PasswordAuthentication("username", "password".toCharArray()))
            .setEncoding(RawRequestOptions.Encoding.JSON)
            .setAdditionalHeaders(additionalHeaders)
            .build();

    assertEquals(RawRequestOptions.Encoding.JSON, opts.getEncoding());
    assertEquals(additionalHeaders, opts.getAdditionalHeaders());
  }
}
