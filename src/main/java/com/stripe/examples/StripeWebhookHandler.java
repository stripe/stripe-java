package com.stripe.examples;

public class StripeWebhookHandler {
  // private static final String API_KEY = System.getenv("STRIPE_API_KEY");
  // private static final String WEBHOOK_SECRET = System.getenv("WEBHOOK_SECRET");

  // private static final StripeClient client = new StripeClient(API_KEY);

  // public static void main(String[] args) throws IOException {

  //   HttpServer server = HttpServer.create(new InetSocketAddress(4242), 0);
  //   server.createContext("/webhook", new WebhookHandler());
  //   server.setExecutor(null);
  //   server.start();
  // }

  // static class WebhookHandler implements HttpHandler {
  //   @Override
  //   public void handle(HttpExchange exchange) throws IOException {
  // if ("POST".equals(exchange.getRequestMethod())) {
  //   InputStream requestBody = exchange.getRequestBody();
  //   String webhookBody = new String(requestBody.readAllBytes(), StandardCharsets.UTF_8);
  //   String sigHeader = exchange.getRequestHeaders().getFirst("Stripe-Signature");

  //   try {
  //     ThinEvent thinEvent = client.parseThinEvent(webhookBody, sigHeader, WEBHOOK_SECRET);

  //     // Fetch the event data to understand the failure
  //     Event baseEvent = client.v2().core().events().retrieve(thinEvent.getId());
  //     if (baseEvent instanceof V1BillingMeterErrorReportTriggeredEvent) {
  //       V1BillingMeterErrorReportTriggeredEvent event =
  //           (V1BillingMeterErrorReportTriggeredEvent) baseEvent;
  //       Meter meter = event.fetchRelatedObject();

  //       String meterId = meter.getId();
  //       System.out.println(meterId);

  //       // Record the failures and alert your team
  //       // Add your logic here
  //     }

  //     exchange.sendResponseHeaders(200, -1);
  //   } catch (StripeException e) {
  //     exchange.sendResponseHeaders(400, -1);
  //   }
  // } else {
  //   exchange.sendResponseHeaders(405, -1);
  // }
  // exchange.close();
  // }
  // }
}
