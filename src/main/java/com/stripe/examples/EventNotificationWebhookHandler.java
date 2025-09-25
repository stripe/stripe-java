package com.stripe.examples;

import com.stripe.StripeClient;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEvent;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.model.v2.Event;
import com.stripe.model.v2.EventNotification;
import com.stripe.model.v2.UnknownEventNotification;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

/**
 * Receive and process EventNotifications like the v1.billing.meter.error_report_triggered event.
 *
 * <p>In this example, we:
 *
 * <ul>
 *   <li>use parseEventNotification to parse the received event notification webhook body
 *   <li>call StripeClient.v2.core.events.retrieve to retrieve the full event object
 *   <li>if it is a V1BillingMeterErrorReportTriggeredEvent event type, call fetchRelatedObject to
 *       retrieve the Billing Meter object associated with the event.
 * </ul>
 */
public class EventNotificationWebhookHandler {
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
          EventNotification eventNotif =
              client.parseEventNotification(webhookBody, sigHeader, WEBHOOK_SECRET);

          // determine what sort of event you have
          if (eventNotif instanceof V1BillingMeterErrorReportTriggeredEventNotification) {
            V1BillingMeterErrorReportTriggeredEventNotification eventNotification =
                (V1BillingMeterErrorReportTriggeredEventNotification) eventNotif;

            // after casting, can fetch the related object (which is correctly typed)
            Meter meter = eventNotification.fetchRelatedObject();
            System.out.println(meter.getId());

            V1BillingMeterErrorReportTriggeredEvent event = eventNotification.fetchEvent();
            System.out.println(event.getData().getDeveloperMessageSummary());

            // add additional logic
          }
          // ... check other event types you know about
          else if (eventNotif instanceof UnknownEventNotification) {
            UnknownEventNotification unknownEvent = (UnknownEventNotification) eventNotif;
            System.out.println("Received unknown event: " + unknownEvent.getId());
            // can keep matching on the "type" field
            // other helper methods still work, but you'll have to handle types yourself
            if (unknownEvent.getType().equals("some.new.event")) {
              Event event = unknownEvent.fetchEvent();
              System.out.println(event.getReason());
              // handle
            }
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
