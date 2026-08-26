package com.stripe.examples;

import com.stripe.StripeClient;
import com.stripe.StripeEventNotificationHandler;
import com.stripe.StripeEventNotificationHandlerWithoutVerification;
import com.stripe.UnhandledNotificationDetails;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.model.v2.core.EventNotification;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

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
 *   <li>register a preHandle hook that deduplicates events by id before any callback runs
 *   <li>register a specific handler for the "v1.billing.meter.error_report_triggered" event
 *       notification type
 *   <li>use handler.handle() to process the received notification webhook body
 * </ul>
 *
 * <p>We also expose a second endpoint for events that arrive through a pre-authenticated channel
 * (such as AWS EventBridge or Azure Event Grid). Those payloads carry no Stripe-Signature header
 * because the channel has already authenticated them, so they're routed through a handler created
 * with notificationHandlerWithoutVerification().
 */
public class EventNotificationHandlerEndpoint {
  private static final String API_KEY = System.getenv("STRIPE_API_KEY");
  private static final String WEBHOOK_SECRET = System.getenv("WEBHOOK_SECRET");

  // Webhooks can be delivered more than once, so we track ids we've already processed. In
  // production, back this with something durable and shared across processes (e.g. Redis or a
  // database table) instead of an in-memory Set.
  private static final Set<String> processedEventIds =
      Collections.synchronizedSet(new LinkedHashSet<>());

  private static final StripeClient client = new StripeClient(API_KEY);
  private static final StripeEventNotificationHandler handler =
      client.notificationHandler(
          WEBHOOK_SECRET, EventNotificationHandlerEndpoint::fallbackCallback);

  // Handles events that reach us through a channel which has already authenticated them, so there
  // is no signature to verify. Callbacks are registered separately from the verifying handler.
  private static final StripeEventNotificationHandlerWithoutVerification unverifiedHandler =
      client.notificationHandlerWithoutVerification(
          EventNotificationHandlerEndpoint::fallbackCallback);

  public static void main(String[] args) throws IOException {
    handler.preHandle(EventNotificationHandlerEndpoint::deduplicate);
    // can be anywhere in your codebase; registering on both handlers means either endpoint below
    // will route this event type
    handler.onV1BillingMeterErrorReportTriggered(
        EventNotificationHandlerEndpoint::handleMeterErrors);

    unverifiedHandler.preHandle(EventNotificationHandlerEndpoint::deduplicate);
    unverifiedHandler.onV1BillingMeterErrorReportTriggered(
        EventNotificationHandlerEndpoint::handleMeterErrors);

    HttpServer server = HttpServer.create(new InetSocketAddress(4242), 0);
    server.createContext("/webhook", new WebhookHandler());
    server.createContext("/webhook-from-cloud-provider", new UnverifiedWebhookHandler());
    server.setExecutor(null);
    server.start();
  }

  private static void fallbackCallback(
      EventNotification notif, StripeClient client, UnhandledNotificationDetails details) {
    System.out.println("Received unhandled event notification type: " + notif.getType());
  }

  /**
   * Runs before any registered callback. Returning {@code false} here skips handling entirely for
   * this delivery, which is useful for deduplicating webhooks.
   */
  private static boolean deduplicate(EventNotification notif, StripeClient client) {
    boolean isNewEvent = processedEventIds.add(notif.getId());
    if (!isNewEvent) {
      System.out.println("Skipping already-processed event: " + notif.getId());
    }
    return isNewEvent;
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

  /**
   * Receives events from a pre-authenticated channel, which deliver no Stripe-Signature header.
   * Note that handle() takes only the body here, and that it declares no
   * SignatureVerificationException because no signature is checked.
   */
  static class UnverifiedWebhookHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      if ("POST".equals(exchange.getRequestMethod())) {
        InputStream requestBody = exchange.getRequestBody();
        String webhookBody =
            new String(WebhookHandler.readAllBytes(requestBody), StandardCharsets.UTF_8);

        unverifiedHandler.handle(webhookBody);

        exchange.sendResponseHeaders(200, -1);
      } else {
        exchange.sendResponseHeaders(405, -1);
      }
      exchange.close();
    }
  }
}
