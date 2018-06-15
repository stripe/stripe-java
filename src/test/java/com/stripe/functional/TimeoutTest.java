package com.stripe.functional;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.RequestOptions;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeoutTest extends BaseStripeTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testConnectTimeout() throws IOException, StripeException {
    // Kind of a hack, but we use the non-routable address 10.255.255.0 to trigger a connection
    // timeout
    Stripe.overrideApiBase(String.format("http://10.255.255.0"));

    thrown.expect(APIConnectionException.class);
    thrown.expectMessage("connect timed out");

    final RequestOptions options = RequestOptions.builder().setConnectTimeout(1).build();
    Balance.retrieve(options);
  }

  @Test
  public void testReadTimeout() throws IOException, StripeException {
    // Create a local server that does nothing to trigger a read timeout
    try (final ServerSocket serverSocket =
        new ServerSocket(0, 1, Inet4Address.getByName("localhost"))) {
      Stripe.overrideApiBase(String.format("http://localhost:%d", serverSocket.getLocalPort()));

      thrown.expect(APIConnectionException.class);
      thrown.expectMessage("Read timed out");

      final RequestOptions options = RequestOptions.builder().setReadTimeout(1).build();
      Balance.retrieve(options);
    }
  }
}
