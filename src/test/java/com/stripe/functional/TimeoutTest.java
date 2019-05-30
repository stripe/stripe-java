package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.RequestOptions;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.ServerSocket;
import org.junit.jupiter.api.Test;

public class TimeoutTest extends BaseStripeTest {
  @Test
  public void testReadTimeout() throws IOException, StripeException {
    // Create a local server that does nothing to trigger a read timeout
    try (final ServerSocket serverSocket =
        new ServerSocket(0, 1, Inet4Address.getByName("localhost"))) {
      Stripe.overrideApiBase(String.format("http://localhost:%d", serverSocket.getLocalPort()));

      final RequestOptions options = RequestOptions.builder().setReadTimeout(1).build();

      Throwable exception =
          assertThrows(
              ApiConnectionException.class,
              () -> {
                Balance.retrieve(options);
              });
      assertTrue(exception.getMessage().contains("Read timed out"));
    }
  }
}
