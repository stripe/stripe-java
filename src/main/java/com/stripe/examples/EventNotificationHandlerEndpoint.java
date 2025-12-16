package com.stripe.examples;

import com.stripe.StripeClient;
import com.stripe.StripeEventNotificationHandler;
import com.stripe.StripeEventNotificationHandler.UnhandledNotificationDetails;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.model.v2.core.EventNotification;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

/**
 * Receive and process event notifications (AKA thin events) like
 * "v1.billing.meter.error_report_triggered" using EventNotificationHandler.
 *
 * <p>In this example, we:
 *
 * <ul>
 *   <li>write a fallback callback to handle unrecognized event notifications
 *   <li>create a StripeClient called client
 *   <li>Initialize an EventNotificationHandler with the client, webhook secret, and fallback
 *       callback
 *   <li>register a specific handler for the "v1.billing.meter.error_report_triggered" event
 *       notification type
 *   <li>use handler.handle() to process the received notification webhook body
 * </ul>
 */
public class EventNotificationHandlerEndpoint {
  private static final String API_KEY = System.getenv("STRIPE_API_KEY");
  private static final String WEBHOOK_SECRET = System.getenv("WEBHOOK_SECRET");

  private static final StripeClient client = new StripeClient(API_KEY);
  private static final StripeEventNotificationHandler handler =
      client.notificationHandler(
          WEBHOOK_SECRET, EventNotificationHandlerEndpoint::fallbackCallback);

  public static void main(String[] args) throws IOException {
    handler.onV1BillingMeterErrorReportTriggered(
        EventNotificationHandlerEndpoint::handleMeterErrors);

    HttpServer server = HttpServer.create(new InetSocketAddress(4242), 0);
    server.createContext("/webhook", new WebhookHandler());
    server.setExecutor(null);
    server.start();
  }

  private static void fallbackCallback(
      EventNotification notif, StripeClient client, UnhandledNotificationDetails details) {
    System.out.println("Received unhandled event notification type: " + notif.getType());
  }

  private static void handleMeterErrors(
      V1BillingMeterErrorReportTriggeredEventNotification notif, StripeClient client) {
    Meter meter;
    try {
      meter = notif.fetchRelatedObject();
    } catch (StripeException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return;
    }
    System.out.println("Handling meter error for meter: " + meter.getDisplayName());
  }

  static class WebhookHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      if ("POST".equals(exchange.getRequestMethod())) {
        InputStream requestBody = exchange.getRequestBody();
        String webhookBody = new String(requestBody.readAllBytes(), StandardCharsets.UTF_8);
        String sigHeader = exchange.getRequestHeaders().getFirst("Stripe-Signature");

        try {
          handler.handle(webhookBody, sigHeader);

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
