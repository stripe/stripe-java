package com.stripe.examples;

import com.stripe.StripeClient;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEvent;
import com.stripe.exception.StripeException;
import com.stripe.model.ThinEvent;
import com.stripe.model.billing.Meter;
import com.stripe.model.v2.Event;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

/**
 * Receive and process thin events like the v1.billing.meter.error_report_triggered event.
 *
 * <p>In this example, we:
 *
 * <ul>
 *   <li>use parseThinEvent to parse the received thin event webhook body
 *   <li>call StripeClient.v2.core.events.retrieve to retrieve the flil event object
 *   <li>if it is a V1BillingMeterErrorReportTriggeredEvent event type, call fetchRelatedObject to
 *       retrieve the Billing Meter object associated with the event.
 * </ul>
 */
public class ThinEventWebhookHandler {
  private static final String API_KEY = System.getenv("STRIPE_API_KEY");
  private static final String WEBHOOK_SECRET = System.getenv("WEBHOOK_SECRET");

  private static final StripeClient client = new StripeClient(API_KEY);

  public static void main(String[] args) throws IOException {

    HttpServer server = HttpServer.create(new InetSocketAddress(4242), 0);
    server.createContext("/webhook", new WebhookHandler());
    server.setExecutor(null);
    server.start();
  }

  static class WebhookHandler implements HttpHandler {

    // For Java 1.8 compatibility
    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
      final int bufLen = 1024;
      byte[] buf = new byte[bufLen];
      int readLen;

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

      while ((readLen = inputStream.read(buf, 0, bufLen)) != -1)
        outputStream.write(buf, 0, readLen);

      return outputStream.toByteArray();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      if ("POST".equals(exchange.getRequestMethod())) {
        InputStream requestBody = exchange.getRequestBody();
        String webhookBody = new String(readAllBytes(requestBody), StandardCharsets.UTF_8);
        String sigHeader = exchange.getRequestHeaders().getFirst("Stripe-Signature");

        try {
          ThinEvent thinEvent = client.parseThinEvent(webhookBody, sigHeader, WEBHOOK_SECRET);

          // Fetch the event data to understand the failure
          Event baseEvent = client.v2().core().events().retrieve(thinEvent.getId());
          if (baseEvent instanceof V1BillingMeterErrorReportTriggeredEvent) {
            V1BillingMeterErrorReportTriggeredEvent event =
                (V1BillingMeterErrorReportTriggeredEvent) baseEvent;
            Meter meter = event.fetchRelatedObject();

            String meterId = meter.getId();
            System.out.println(meterId);

            // Record the failures and alert your team
            // Add your logic here
          }

          exchange.sendResponseHeaders(200, -1);
        } catch (StripeException e) {
          exchange.sendResponseHeaders(400, -1);
        }
      } else {
        exchange.sendResponseHeaders(405, -1);
      }
      exchange.close();
    }
  }
}
