package com.stripe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.stripe.events.UnknownEventNotification;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V2CoreAccountCreatedEventNotification;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import com.stripe.net.Webhook;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StripeEventRouterTest {
  private static final String DUMMY_WEBHOOK_SECRET = "whsec_test_secret";

  private StripeClient stripeClient;
  private StripeEventRouter.UnhandledEventHandler onUnhandledHandler;
  private StripeEventRouter eventRouter;

  private String v1BillingMeterPayload;
  private String v2AccountCreatedPayload;
  private String unknownEventPayload;

  @BeforeEach
  public void setUp() {
    // Create a StripeClient with context
    stripeClient =
        StripeClient.builder()
            .setApiKey("sk_test_1234")
            .setStripeContext("original_context_123")
            .build();

    // Create mock handler for unhandled events
    onUnhandledHandler = mock(StripeEventRouter.UnhandledEventHandler.class);

    // Create event router
    eventRouter = new StripeEventRouter(DUMMY_WEBHOOK_SECRET, stripeClient, onUnhandledHandler);

    // Set up test payloads
    v1BillingMeterPayload =
        "{"
            + "\"id\": \"evt_123\","
            + "\"object\": \"v2.core.event\","
            + "\"type\": \"v1.billing.meter.error_report_triggered\","
            + "\"livemode\": false,"
            + "\"created\": \"2022-02-15T00:27:45.330Z\","
            + "\"context\": \"event_context_456\","
            + "\"related_object\": {"
            + "\"id\": \"mtr_123\","
            + "\"type\": \"billing.meter\","
            + "\"url\": \"/v1/billing/meters/mtr_123\""
            + "}"
            + "}";

    v2AccountCreatedPayload =
        "{"
            + "\"id\": \"evt_789\","
            + "\"object\": \"v2.core.event\","
            + "\"type\": \"v2.core.account.created\","
            + "\"livemode\": false,"
            + "\"created\": \"2022-02-15T00:27:45.330Z\","
            + "\"context\": null,"
            + "\"related_object\": {"
            + "\"id\": \"acct_abc\","
            + "\"type\": \"account\","
            + "\"url\": \"/v2/core/accounts/acct_abc\""
            + "}"
            + "}";

    unknownEventPayload =
        "{"
            + "\"id\": \"evt_unknown\","
            + "\"object\": \"v2.core.event\","
            + "\"type\": \"llama.created\","
            + "\"livemode\": false,"
            + "\"created\": \"2022-02-15T00:27:45.330Z\","
            + "\"context\": \"event_context_unknown\","
            + "\"related_object\": {"
            + "\"id\": \"llama_123\","
            + "\"type\": \"llama\","
            + "\"url\": \"/v1/llamas/llama_123\""
            + "}"
            + "}";
  }

  private String generateSigHeader(String payload)
      throws NoSuchAlgorithmException, InvalidKeyException {
    Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    options.put("secret", DUMMY_WEBHOOK_SECRET);
    return generateSigHeader(options);
  }

  private String generateSigHeader(Map<String, Object> options)
      throws NoSuchAlgorithmException, InvalidKeyException {
    final long timestamp =
        (options.get("timestamp") != null)
            ? ((Long) options.get("timestamp")).longValue()
            : Webhook.Util.getTimeNow();
    final String payload = (String) options.get("payload");
    final String secret = (String) options.get("secret");
    final String scheme =
        (options.get("scheme") != null)
            ? (String) options.get("scheme")
            : Webhook.Signature.EXPECTED_SCHEME;
    String signature = (String) options.get("signature");

    if (signature == null) {
      final String payloadToSign = String.format("%d.%s", timestamp, payload);
      signature = Webhook.Util.computeHmacSha256(secret, payloadToSign);
    }

    return String.format("t=%d,%s=%s", timestamp, scheme, signature);
  }

  @Test
  public void testRoutesEventToRegisteredHandler()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that a registered event type is routed to the correct handler
    @SuppressWarnings("unchecked")
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(StripeEventRouter.EventHandler.class);
    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(onUnhandledHandler, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testRoutesDifferentEventsToCorrectHandlers()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that different event types route to their respective handlers
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification>
        billingHandler = mock(StripeEventRouter.EventHandler.class);
    StripeEventRouter.EventHandler<V2CoreAccountCreatedEventNotification> accountHandler =
        mock(StripeEventRouter.EventHandler.class);

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(billingHandler);
    eventRouter.on_V2CoreAccountCreatedEventNotification(accountHandler);

    String sigHeader1 = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader1);

    String sigHeader2 = generateSigHeader(v2AccountCreatedPayload);
    eventRouter.handle(v2AccountCreatedPayload, sigHeader2);

    eventRouter.handle(v1BillingMeterPayload, sigHeader1);

    verify(billingHandler, times(2))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(accountHandler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(onUnhandledHandler, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }

  @Test
  public void testHandlerReceivesCorrectRuntimeType()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that handlers receive the correctly typed event notification
    AtomicReference<EventNotification> receivedEvent = new AtomicReference<>();
    AtomicReference<StripeClient> receivedClient = new AtomicReference<>();

    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedEvent.set(event);
          receivedClient.set(client);
        };

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    assertInstanceOf(
        V1BillingMeterErrorReportTriggeredEventNotification.class, receivedEvent.get());
    V1BillingMeterErrorReportTriggeredEventNotification notification =
        (V1BillingMeterErrorReportTriggeredEventNotification) receivedEvent.get();
    assertEquals("v1.billing.meter.error_report_triggered", notification.getType());
    assertEquals("evt_123", notification.getId());
    assertEquals("mtr_123", notification.getRelatedObject().getId());
    assertNotNull(receivedClient.get());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testCannotRegisterHandlerAfterHandling()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that registering handlers after handle() raises IllegalStateException
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(StripeEventRouter.EventHandler.class);
    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () ->
                eventRouter.on_V2CoreAccountCreatedEventNotification(
                    mock(StripeEventRouter.EventHandler.class)));

    assertTrue(exception.getMessage().contains("Cannot register handlers after handling an event"));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testCannotRegisterDuplicateHandler() {
    // Test that registering the same event type twice raises IllegalArgumentException
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler1 =
        mock(StripeEventRouter.EventHandler.class);
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler2 =
        mock(StripeEventRouter.EventHandler.class);

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler1);

    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler2));

    assertTrue(
        exception
            .getMessage()
            .contains(
                "Handler already registered for event type: v1.billing.meter.error_report_triggered"));
  }

  @Test
  public void testHandlerUsesEventStripeContext()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that the handler receives a client with stripe_context from the event
    AtomicReference<String> receivedContext = new AtomicReference<>();

    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("event_context_456", receivedContext.get());
  }

  @Test
  public void testStripeContextRestoredAfterHandlerSuccess()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that the original stripe_context is restored after successful handler execution
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          assertEquals("event_context_456", client.getContext());
        };

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testStripeContextRestoredAfterHandlerError()
      throws NoSuchAlgorithmException, InvalidKeyException {
    // Test that the original stripe_context is restored even when handler raises an exception
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          assertEquals("event_context_456", client.getContext());
          throw new RuntimeException("Handler error!");
        };

    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);

    RuntimeException exception =
        assertThrows(
            RuntimeException.class, () -> eventRouter.handle(v1BillingMeterPayload, sigHeader));
    assertEquals("Handler error!", exception.getMessage());

    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testStripeContextSetToNullWhenEventHasNoContext()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that stripe_context is set to null when event context is null
    AtomicReference<String> receivedContext = new AtomicReference<>();

    StripeEventRouter.EventHandler<V2CoreAccountCreatedEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    eventRouter.on_V2CoreAccountCreatedEventNotification(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v2AccountCreatedPayload);
    eventRouter.handle(v2AccountCreatedPayload, sigHeader);

    assertNull(receivedContext.get());
    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testUnknownEventRoutesToOnUnhandled()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that events without SDK types route to on_unhandled handler
    String sigHeader = generateSigHeader(unknownEventPayload);
    eventRouter.handle(unknownEventPayload, sigHeader);

    verify(onUnhandledHandler, times(1))
        .process(
            org.mockito.ArgumentMatchers.argThat(
                event ->
                    event instanceof UnknownEventNotification
                        && event.getType().equals("llama.created")),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == false));
  }

  @Test
  public void testKnownUnregisteredEventRoutesToOnUnhandled()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that known event types without a registered handler route to on_unhandled
    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    verify(onUnhandledHandler, times(1))
        .process(
            org.mockito.ArgumentMatchers.argThat(
                event ->
                    event instanceof V1BillingMeterErrorReportTriggeredEventNotification
                        && event.getType().equals("v1.billing.meter.error_report_triggered")),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == true));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testRegisteredEventDoesNotCallOnUnhandled()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that registered events don't trigger on_unhandled
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(StripeEventRouter.EventHandler.class);
    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(onUnhandledHandler, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }

  @Test
  public void testHandlerClientRetainsConfiguration()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that the client passed to handlers retains all configuration except stripe_context
    String originalContext = "original_context_xyz";

    StripeClient customClient =
        StripeClient.builder()
            .setApiKey("sk_test_custom_key")
            .setStripeContext(originalContext)
            .build();

    StripeEventRouter customRouter =
        new StripeEventRouter(DUMMY_WEBHOOK_SECRET, customClient, onUnhandledHandler);

    AtomicReference<String> receivedContext = new AtomicReference<>();

    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    customRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    customRouter.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("event_context_456", receivedContext.get());
    assertEquals(originalContext, customClient.getContext());
  }

  @Test
  public void testOnUnhandledReceivesCorrectInfoForUnknown()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that on_unhandled receives correct UnhandledNotificationDetails for unknown events
    String sigHeader = generateSigHeader(unknownEventPayload);
    eventRouter.handle(unknownEventPayload, sigHeader);

    verify(onUnhandledHandler, times(1))
        .process(
            org.mockito.ArgumentMatchers.any(EventNotification.class),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == false));
  }

  @Test
  public void testOnUnhandledReceivesCorrectInfoForKnownUnregistered()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that on_unhandled receives correct UnhandledNotificationDetails for known unregistered
    // events
    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventRouter.handle(v1BillingMeterPayload, sigHeader);

    verify(onUnhandledHandler, times(1))
        .process(
            org.mockito.ArgumentMatchers.any(EventNotification.class),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == true));
  }

  @Test
  public void testValidatesWebhookSignature() {
    // Test that invalid webhook signatures are rejected
    assertThrows(
        SignatureVerificationException.class,
        () -> eventRouter.handle(v1BillingMeterPayload, "invalid_signature"));
  }

  @Test
  public void testRegisteredEventTypesEmpty() {
    // Test that registered_event_types returns empty list when no handlers are registered
    List<String> eventTypes = eventRouter.getRegisteredEventTypes();
    assertNotNull(eventTypes);
    assertTrue(eventTypes.isEmpty());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testRegisteredEventTypesSingle() {
    // Test that registered_event_types returns a single event type
    StripeEventRouter.EventHandler<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(StripeEventRouter.EventHandler.class);
    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);

    List<String> eventTypes = eventRouter.getRegisteredEventTypes();
    assertEquals(1, eventTypes.size());
    assertEquals("v1.billing.meter.error_report_triggered", eventTypes.get(0));
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Test
  public void testRegisteredEventTypesMultipleAlphabetized() {
    // Test that registered_event_types returns multiple event types in alphabetical order
    StripeEventRouter.EventHandler handler = mock(StripeEventRouter.EventHandler.class);

    // Register in non-alphabetical order
    eventRouter.on_V2CoreAccountUpdatedEventNotification(handler);
    eventRouter.on_V1BillingMeterErrorReportTriggeredEventNotification(handler);
    eventRouter.on_V2CoreAccountCreatedEventNotification(handler);

    List<String> expected =
        Arrays.asList(
            "v1.billing.meter.error_report_triggered",
            "v2.core.account.created",
            "v2.core.account.updated");

    List<String> eventTypes = eventRouter.getRegisteredEventTypes();
    assertEquals(expected, eventTypes);
  }
}
