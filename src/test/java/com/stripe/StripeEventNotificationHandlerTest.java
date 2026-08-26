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
import static org.mockito.Mockito.when;

import com.stripe.events.UnknownEventNotification;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V2CoreAccountCreatedEventNotification;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.v2.core.EventNotification;
import com.stripe.net.Webhook;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StripeEventNotificationHandlerTest {
  private static final String DUMMY_WEBHOOK_SECRET = "whsec_test_secret";

  private StripeClient stripeClient;
  private EventNotificationFallbackCallback fallbackCallback;
  private StripeEventNotificationHandler eventNotificationHandler;

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
    fallbackCallback = mock(EventNotificationFallbackCallback.class);

    // Create event router
    eventNotificationHandler =
        new StripeEventNotificationHandler(DUMMY_WEBHOOK_SECRET, stripeClient, fallbackCallback);

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
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(fallbackCallback, never())
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
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> billingHandler =
        mock(EventNotificationCallback.class);
    EventNotificationCallback<V2CoreAccountCreatedEventNotification> accountHandler =
        mock(EventNotificationCallback.class);

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(billingHandler);
    eventNotificationHandler.onV2CoreAccountCreated(accountHandler);

    String sigHeader1 = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader1);

    String sigHeader2 = generateSigHeader(v2AccountCreatedPayload);
    eventNotificationHandler.handle(v2AccountCreatedPayload, sigHeader2);

    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader1);

    verify(billingHandler, times(2))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(accountHandler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(fallbackCallback, never())
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

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedEvent.set(event);
          receivedClient.set(client);
        };

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

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
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () ->
                eventNotificationHandler.onV2CoreAccountCreated(
                    mock(EventNotificationCallback.class)));

    assertTrue(
        exception
            .getMessage()
            .contains(
                "Cannot register new callbacks after an event has been handled. This is indicative of a"
                    + " bug."));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testCannotRegisterDuplicateHandler() {
    // Test that registering the same event type twice raises IllegalArgumentException
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler1 =
        mock(EventNotificationCallback.class);
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler2 =
        mock(EventNotificationCallback.class);

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler1);

    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler2));

    assertTrue(
        exception
            .getMessage()
            .contains(
                "Callback for event type \"v1.billing.meter.error_report_triggered\" is already"
                    + " registered"));
  }

  @Test
  public void testHandlerUsesEventStripeContext()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that the handler receives a client with stripe_context from the event
    AtomicReference<String> receivedContext = new AtomicReference<>();

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("event_context_456", receivedContext.get());
  }

  @Test
  public void testStripeContextRestoredAfterHandlerSuccess()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that the original stripe_context is restored after successful handler execution
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          assertEquals("event_context_456", client.getContext());
        };

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testStripeContextRestoredAfterHandlerError()
      throws NoSuchAlgorithmException, InvalidKeyException {
    // Test that the original stripe_context is restored even when handler raises an exception
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          assertEquals("event_context_456", client.getContext());
          throw new RuntimeException("Handler error!");
        };

    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);

    RuntimeException exception =
        assertThrows(
            RuntimeException.class,
            () -> eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader));
    assertEquals("Handler error!", exception.getMessage());

    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testStripeContextSetToNullWhenEventHasNoContext()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that stripe_context is set to null when event context is null
    AtomicReference<String> receivedContext = new AtomicReference<>();

    EventNotificationCallback<V2CoreAccountCreatedEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    eventNotificationHandler.onV2CoreAccountCreated(handler);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v2AccountCreatedPayload);
    eventNotificationHandler.handle(v2AccountCreatedPayload, sigHeader);

    assertNull(receivedContext.get());
    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testUnknownEventRoutesToOnUnhandled()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test that events without SDK types rout handler
    String sigHeader = generateSigHeader(unknownEventPayload);
    eventNotificationHandler.handle(unknownEventPayload, sigHeader);

    verify(fallbackCallback, times(1))
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
    // Test that known event types without a registered handler rout
    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(fallbackCallback, times(1))
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
    // Test that registered events don't tri
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(fallbackCallback, never())
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

    StripeEventNotificationHandler customRouter =
        new StripeEventNotificationHandler(DUMMY_WEBHOOK_SECRET, customClient, fallbackCallback);

    AtomicReference<String> receivedContext = new AtomicReference<>();

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    customRouter.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    customRouter.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("event_context_456", receivedContext.get());
    assertEquals(originalContext, customClient.getContext());
  }

  @Test
  public void testOnUnhandledReceivesCorrectInfoForUnknown()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test  receives correct UnhandledNotificationDetails for unknown events
    String sigHeader = generateSigHeader(unknownEventPayload);
    eventNotificationHandler.handle(unknownEventPayload, sigHeader);

    verify(fallbackCallback, times(1))
        .process(
            org.mockito.ArgumentMatchers.any(EventNotification.class),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == false));
  }

  @Test
  public void testOnUnhandledReceivesCorrectInfoForKnownUnregistered()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Test  receives correct UnhandledNotificationDetails for known unregistered
    // events
    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(fallbackCallback, times(1))
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
        () -> eventNotificationHandler.handle(v1BillingMeterPayload, "invalid_signature"));
  }

  @Test
  public void testConstructor_rejectsNullSecret() {
    // Test that constructing with a null secret throws IllegalArgumentException
    assertThrows(
        IllegalArgumentException.class,
        () -> new StripeEventNotificationHandler(null, stripeClient, fallbackCallback));
  }

  @Test
  public void testConstructor_rejectsEmptySecret() {
    // Test that constructing with an empty secret throws IllegalArgumentException
    assertThrows(
        IllegalArgumentException.class,
        () -> new StripeEventNotificationHandler("", stripeClient, fallbackCallback));
  }

  @Test
  public void testWithoutVerification_staticFactory() {
    // Test that StripeEventNotificationHandler.withoutVerification(...) returns the correct type.
    // Declared as the concrete type: the handlers are siblings, so this is deliberately NOT
    // assignable to StripeEventNotificationHandler.
    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    assertInstanceOf(StripeEventNotificationHandlerWithoutVerification.class, handler);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testWithoutVerification_routesEventToHandler() {
    // Test that a registered event type is routed to the correct handler without sig verification
    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> callback =
        mock(EventNotificationCallback.class);
    handler.onV1BillingMeterErrorReportTriggered(callback);

    handler.handle(v1BillingMeterPayload);

    verify(callback, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(fallbackCallback, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }

  @Test
  public void testWithoutVerification_fallbackForUnregisteredEvent() {
    // Test that a known event type without a registered handler calls fallback with
    // isKnownEventType true
    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    handler.handle(v1BillingMeterPayload);

    verify(fallbackCallback, times(1))
        .process(
            org.mockito.ArgumentMatchers.argThat(
                event ->
                    event instanceof V1BillingMeterErrorReportTriggeredEventNotification
                        && event.getType().equals("v1.billing.meter.error_report_triggered")),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == true));
  }

  @Test
  public void testWithoutVerification_unknownEventType() {
    // Test that an unknown event type calls fallback with isKnownEventType false
    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    handler.handle(unknownEventPayload);

    verify(fallbackCallback, times(1))
        .process(
            org.mockito.ArgumentMatchers.argThat(
                event ->
                    event instanceof UnknownEventNotification
                        && event.getType().equals("llama.created")),
            org.mockito.ArgumentMatchers.any(StripeClient.class),
            org.mockito.ArgumentMatchers.argThat(info -> info.isKnownEventType() == false));
  }

  @Test
  public void testWithoutVerification_contextPropagation() {
    // Test that the client passed to callbacks has the event's stripe_context
    AtomicReference<String> receivedContext = new AtomicReference<>();

    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> callback =
        (event, client) -> {
          receivedContext.set(client.getContext());
        };

    handler.onV1BillingMeterErrorReportTriggered(callback);
    handler.handle(v1BillingMeterPayload);

    assertEquals("event_context_456", receivedContext.get());
  }

  @Test
  public void testWithoutVerification_doesNotExposeVerifyingHandle() {
    // The two handlers are siblings, so the signature-verifying handle(body, sig) isn't
    // inherited here at all -- passing a signature header is a compile error rather than a
    // runtime one. Assert on the declared methods so a refactor can't quietly reintroduce it.
    int handleMethods = 0;
    for (java.lang.reflect.Method method :
        StripeEventNotificationHandlerWithoutVerification.class.getMethods()) {
      if (method.getName().equals("handle")) {
        handleMethods += 1;
        assertEquals(1, method.getParameterCount());
      }
    }

    assertEquals(1, handleMethods);
  }

  @Test
  public void testRegisteredEventTypesEmpty() {
    // Test that registered_event_types returns empty list when no handlers are registered
    List<String> eventTypes = eventNotificationHandler.getRegisteredEventTypes();
    assertNotNull(eventTypes);
    assertTrue(eventTypes.isEmpty());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testRegisteredEventTypesSingle() {
    // Test that registered_event_types returns a single event type
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    List<String> eventTypes = eventNotificationHandler.getRegisteredEventTypes();
    assertEquals(1, eventTypes.size());
    assertEquals("v1.billing.meter.error_report_triggered", eventTypes.get(0));
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Test
  public void testRegisteredEventTypesMultipleAlphabetized() {
    // Test that registered_event_types returns multiple event types in alphabetical order
    EventNotificationCallback handler = mock(EventNotificationCallback.class);

    // Register in non-alphabetical order
    eventNotificationHandler.onV2CoreAccountUpdated(handler);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);
    eventNotificationHandler.onV2CoreAccountCreated(handler);

    List<String> expected =
        Arrays.asList(
            "v1.billing.meter.error_report_triggered",
            "v2.core.account.created",
            "v2.core.account.updated");

    List<String> eventTypes = eventNotificationHandler.getRegisteredEventTypes();
    assertEquals(expected, eventTypes);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testPreHandle_noHookRegistered_callbackStillRuns()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Regression: with no preHandle hook registered, behavior is unchanged.
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, times(1))
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testPreHandle_returnsTrue_runsFirstThenCallbackRuns()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    List<String> callOrder = new ArrayList<>();

    EventNotificationPreHandleCallback preHandleCallback =
        (event, client) -> {
          callOrder.add("preHandle");
          return true;
        };

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> callOrder.add("callback");

    eventNotificationHandler.preHandle(preHandleCallback);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    assertEquals(Arrays.asList("preHandle", "callback"), callOrder);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testPreHandle_returnsFalse_registeredCallbackDoesNotRun()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    EventNotificationPreHandleCallback preHandleCallback =
        mock(EventNotificationPreHandleCallback.class);
    when(preHandleCallback.process(
            org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any()))
        .thenReturn(false);

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        mock(EventNotificationCallback.class);

    eventNotificationHandler.preHandle(preHandleCallback);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    verify(handler, never())
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
  }

  @Test
  public void testPreHandle_returnsFalse_fallbackAlsoDoesNotRunForUnknownEvent()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // Unregistered/unknown event types normally fall through to the fallback callback. A
    // preHandle hook returning false should suppress that fallback too.
    EventNotificationPreHandleCallback preHandleCallback =
        mock(EventNotificationPreHandleCallback.class);
    when(preHandleCallback.process(
            org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any()))
        .thenReturn(false);

    eventNotificationHandler.preHandle(preHandleCallback);

    String sigHeader = generateSigHeader(unknownEventPayload);
    eventNotificationHandler.handle(unknownEventPayload, sigHeader);

    verify(fallbackCallback, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }

  @Test
  public void testPreHandle_receivesContextScopedClient()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    // The preHandle hook should receive the same event-context-scoped client that callbacks do,
    // and the handler's own client should be left unmutated.
    AtomicReference<String> receivedContext = new AtomicReference<>();

    EventNotificationPreHandleCallback preHandleCallback =
        (event, client) -> {
          receivedContext.set(client.getContext());
          return true;
        };

    eventNotificationHandler.preHandle(preHandleCallback);

    assertEquals("original_context_123", stripeClient.getContext());

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    assertEquals("event_context_456", receivedContext.get());
    assertEquals("original_context_123", stripeClient.getContext());
  }

  @Test
  public void testPreHandle_throwing_propagatesAndNoCallbackRuns()
      throws NoSuchAlgorithmException, InvalidKeyException {
    EventNotificationPreHandleCallback preHandleCallback =
        (event, client) -> {
          throw new RuntimeException("preHandle error!");
        };

    AtomicReference<Boolean> callbackRan = new AtomicReference<>(false);
    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> handler =
        (event, client) -> callbackRan.set(true);

    eventNotificationHandler.preHandle(preHandleCallback);
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(handler);

    String sigHeader = generateSigHeader(v1BillingMeterPayload);

    RuntimeException exception =
        assertThrows(
            RuntimeException.class,
            () -> eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader));
    assertEquals("preHandle error!", exception.getMessage());
    assertTrue(!callbackRan.get());
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testPreHandle_cannotRegisterAfterHandling()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    eventNotificationHandler.onV1BillingMeterErrorReportTriggered(
        mock(EventNotificationCallback.class));

    String sigHeader = generateSigHeader(v1BillingMeterPayload);
    eventNotificationHandler.handle(v1BillingMeterPayload, sigHeader);

    IllegalStateException exception =
        assertThrows(
            IllegalStateException.class,
            () ->
                eventNotificationHandler.preHandle(mock(EventNotificationPreHandleCallback.class)));

    assertTrue(
        exception
            .getMessage()
            .contains(
                "Cannot register new callbacks after an event has been handled. This is indicative of a"
                    + " bug."));
  }

  @Test
  public void testPreHandle_cannotRegisterTwice() {
    eventNotificationHandler.preHandle(mock(EventNotificationPreHandleCallback.class));

    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () ->
                eventNotificationHandler.preHandle(mock(EventNotificationPreHandleCallback.class)));

    assertTrue(exception.getMessage().contains("already registered"));
  }

  @Test
  public void testPreHandle_returnsConcreteHandlerType() {
    // preHandle should return the concrete handler type for chaining, just like the generated
    // on* methods.
    StripeEventNotificationHandler returned =
        eventNotificationHandler.preHandle((event, client) -> true);

    assertEquals(eventNotificationHandler, returned);
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testWithoutVerification_preHandleGatesCallback() {
    // The preHandle hook should also gate StripeEventNotificationHandlerWithoutVerification.
    StripeEventNotificationHandlerWithoutVerification handler =
        StripeEventNotificationHandler.withoutVerification(stripeClient, fallbackCallback);

    EventNotificationPreHandleCallback preHandleCallback =
        mock(EventNotificationPreHandleCallback.class);
    when(preHandleCallback.process(
            org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any()))
        .thenReturn(false);

    EventNotificationCallback<V1BillingMeterErrorReportTriggeredEventNotification> callback =
        mock(EventNotificationCallback.class);

    handler.preHandle(preHandleCallback);
    handler.onV1BillingMeterErrorReportTriggered(callback);

    handler.handle(v1BillingMeterPayload);

    verify(callback, never())
        .process(org.mockito.ArgumentMatchers.any(), org.mockito.ArgumentMatchers.any());
    verify(fallbackCallback, never())
        .process(
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any(),
            org.mockito.ArgumentMatchers.any());
  }
}
