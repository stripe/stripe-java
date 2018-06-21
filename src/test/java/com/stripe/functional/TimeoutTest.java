package com.stripe.functional;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
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
  public void testReadTimeout() throws IOException, StripeException {
    // Create a local server that does nothing to trigger a read timeout
    try (final ServerSocket serverSocket =
        new ServerSocket(0, 1, Inet4Address.getByName("localhost"))) {
      Stripe.overrideApiBase(String.format("http://localhost:%d", serverSocket.getLocalPort()));

      thrown.expect(ApiConnectionException.class);
      thrown.expectMessage("Read timed out");

      final RequestOptions options = RequestOptions.builder().setReadTimeout(1).build();
      Balance.retrieve(options);
    }
  }
}
