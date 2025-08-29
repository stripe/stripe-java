package com.stripe;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEvent;
import com.stripe.events.V1BillingMeterErrorReportTriggeredEventNotification;
import com.stripe.events.V1BillingMeterNoMeterFoundEventNotification;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.billing.Meter;
import com.stripe.model.terminal.Reader;
import com.stripe.model.v2.EventNotification;
import com.stripe.model.v2.UnknownEventDelivery;
import com.stripe.net.*;
import com.stripe.net.ApiResource.RequestMethod;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class StripeClientTest extends BaseStripeTest {
  private Boolean originalTelemetry;

  @BeforeEach
  public void setUp() {
    this.originalTelemetry = Stripe.enableTelemetry;
    Stripe.enableTelemetry = true;
  }

  @AfterEach
  public void tearDown() {
    Stripe.enableTelemetry = originalTelemetry;
  }

  @Test
  public void testReportsStripeClientUsageTelemetry() throws StripeException {
    mockClient.customers().create();
    mockClient.customers().update("cus_xyz");
    verifyStripeRequest(
        (stripeRequest) -> {
          assert (stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").isPresent());
          String usage =
              new Gson()
                  .fromJson(
                      stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").get(),
                      JsonObject.class)
                  .get("last_request_metrics")
                  .getAsJsonObject()
                  .get("usage")
                  .getAsString();
          assertEquals("stripe_client", usage);
        });
  }

  @Test
  public void testReportsRawRequestUsageTelemetry() throws StripeException {
    mockClient.rawRequest(
        com.stripe.net.ApiResource.RequestMethod.POST, "/v1/customers", "description=foo", null);
    mockClient.rawRequest(
        com.stripe.net.ApiResource.RequestMethod.POST, "/v1/customers", "description=foo", null);
    verifyStripeRequest(
        (stripeRequest) -> {
          assert (stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").isPresent());
          JsonArray usage =
              new Gson()
                  .fromJson(
                      stripeRequest.headers().firstValue("X-Stripe-Client-Telemetry").get(),
                      JsonObject.class)
                  .get("last_request_metrics")
                  .getAsJsonObject()
                  .get("usage")
                  .getAsJsonArray();
          assertEquals(2, usage.size());
          assertEquals("stripe_client", usage.get(0).getAsString());
          assertEquals("raw_request", usage.get(1).getAsString());
        });
  }

  @Test
  public void testFlowsStripeResponseGetter() throws Exception {
    StripeResponseGetter responseGetter = Mockito.spy(new LiveStripeResponseGetter());
    StripeClient client = new StripeClient(responseGetter);

    Mockito.doAnswer((Answer<Reader>) invocation -> new Reader())
        .when(responseGetter)
        .request(Mockito.<ApiRequest>any(), Mockito.<Type>any());

    client.terminal().readers().retrieve("r_123");

    assertTrue(Mockito.mockingDetails(responseGetter).getInvocations().stream().count() > 0);
  }

  @Test
  public void clientOptionsDefaults() {
    StripeResponseGetterOptions options = StripeClient.builder().setApiKey("sk_123").buildOptions();

    assertEquals(Stripe.DEFAULT_CONNECT_TIMEOUT, options.getConnectTimeout());
    assertEquals(Stripe.DEFAULT_READ_TIMEOUT, options.getReadTimeout());
    assertEquals(Stripe.LIVE_API_BASE, options.getApiBase());
    assertEquals(Stripe.CONNECT_API_BASE, options.getConnectBase());
    assertEquals(Stripe.UPLOAD_API_BASE, options.getFilesBase());
    assertEquals(Stripe.METER_EVENTS_API_BASE, options.getMeterEventsBase());
    assertEquals(0, options.getMaxNetworkRetries());
  }

  @Test
  public void clientOptionsWithStripeContext() {
    StripeResponseGetterOptions options = StripeClient.builder().setApiKey("sk_123").buildOptions();

    assertEquals(Stripe.DEFAULT_CONNECT_TIMEOUT, options.getConnectTimeout());
    assertEquals(Stripe.DEFAULT_READ_TIMEOUT, options.getReadTimeout());
    assertEquals(Stripe.LIVE_API_BASE, options.getApiBase());
    assertEquals(Stripe.CONNECT_API_BASE, options.getConnectBase());
    assertEquals(Stripe.UPLOAD_API_BASE, options.getFilesBase());
    assertEquals(Stripe.METER_EVENTS_API_BASE, options.getMeterEventsBase());
    assertEquals(0, options.getMaxNetworkRetries());
  }

  @Test
  public void checksWebhookSignature()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload =
        "{\n  \"id\": \"evt_test_webhook\",\n \"type\": \"v1.whatever\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);

    EventNotification e = client.parseEventNotification(payload, signature, secret);
    assertEquals(e.getId(), "evt_test_webhook");
  }

  @Test
  public void failsWebhookVerification()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload =
        "{\n  \"id\": \"evt_test_webhook\",\n \"type\": \"v1.whatever\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";
    String signature = "bad signature";

    assertThrows(
        SignatureVerificationException.class,
        () -> {
          client.parseEventNotification(payload, signature, secret);
        });
  }

  static final String v2EventDeliveryWithRelatedObject =
      "{\n"
          + "  \"id\": \"evt_234\",\n"
          + "  \"object\": \"event\",\n"
          + "  \"type\": \"v1.billing.meter.error_report_triggered\",\n"
          + "  \"livemode\": false,\n"
          + "  \"context\": \"org_123\",\n"
          + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
          + "  \"related_object\": {\n"
          + "    \"id\": \"meter_123\",\n"
          + "    \"type\": \"billing.meter\",\n"
          + "    \"url\": \"/v1/billing/meter/meter_123\""
          + "  }\n"
          + "}";

  static final String v2EventDeliveryWithoutRelatedObject =
      "{\n"
          + "  \"id\": \"evt_234\",\n"
          + "  \"object\": \"event\",\n"
          + "  \"type\": \"v1.billing.meter.no_meter_found\",\n"
          + "  \"livemode\": false,\n"
          + "  \"created\": \"2022-02-15T00:27:45.330Z\"\n"
          + "}";

  static final String v2UnknownEventDelivery =
      "{\n"
          + "  \"id\": \"evt_234\",\n"
          + "  \"object\": \"event\",\n"
          + "  \"type\": \"v1.imaginary_event\",\n"
          + "  \"livemode\": false,\n"
          + "  \"created\": \"2022-02-15T00:27:45.330Z\"\n"
          + "}";

  @Test
  public void parsesEventNotificationWithoutRelatedObject()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {

    StripeClient client = new StripeClient("sk_123");

    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", v2EventDeliveryWithoutRelatedObject);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);
    EventNotification eventDelivery =
        client.parseEventNotification(v2EventDeliveryWithoutRelatedObject, signature, secret);
    assertNotNull(eventDelivery);
    assertEquals("evt_234", eventDelivery.getId());
    assertEquals("v1.billing.meter.no_meter_found", eventDelivery.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), eventDelivery.created);
    assertNull(eventDelivery.context);
    assertInstanceOf(V1BillingMeterNoMeterFoundEventNotification.class, eventDelivery);
  }

  @Test
  public void parsesEventNotificationWithRelatedObject()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {

    StripeClient client = new StripeClient("sk_123");

    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", v2EventDeliveryWithRelatedObject);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);
    EventNotification eventNotification =
        client.parseEventNotification(v2EventDeliveryWithRelatedObject, signature, secret);
    assertNotNull(eventNotification);
    assertEquals("evt_234", eventNotification.getId());
    assertEquals("v1.billing.meter.error_report_triggered", eventNotification.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), eventNotification.created);
    assertEquals("org_123", eventNotification.context);
    assertInstanceOf(V1BillingMeterErrorReportTriggeredEventNotification.class, eventNotification);

    V1BillingMeterErrorReportTriggeredEventNotification e =
        (V1BillingMeterErrorReportTriggeredEventNotification) eventNotification;

    assertNotNull(e.getRelatedObject());
    assertEquals("meter_123", e.getRelatedObject().getId());
    assertEquals("billing.meter", e.getRelatedObject().getType());
    assertEquals("/v1/billing/meter/meter_123", e.getRelatedObject().getUrl());
  }

  @Test
  public void parsesUnknownEventNotification()
      throws InvalidKeyException, NoSuchAlgorithmException, StripeException {

    StripeClient client = new StripeClient("sk_123");

    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", v2UnknownEventDelivery);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);
    EventNotification eventDelivery =
        client.parseEventNotification(v2UnknownEventDelivery, signature, secret);

    assertNotNull(eventDelivery);
    assertEquals("evt_234", eventDelivery.getId());
    assertEquals("v1.imaginary_event", eventDelivery.getType());
    assertInstanceOf(UnknownEventDelivery.class, eventDelivery);
    UnknownEventDelivery e = (UnknownEventDelivery) eventDelivery;

    assertNull(e.getRelatedObject());
    assertNull(e.fetchRelatedObject()); // doesn't throw
  }

  @Test
  public void stripeClientWithStripeAccount() throws StripeException {

    StripeResponseGetterOptions options =
        StripeClient.builder()
            .setStripeAccount("acct")
            .setApiKey(TEST_API_KEY)
            .setApiBase(getStripeMockUrl())
            .buildOptions();

    httpClientSpy = Mockito.spy(new HttpURLConnectionClient());
    networkSpy = Mockito.spy(new LiveStripeResponseGetter(options, httpClientSpy));
    mockClient = new StripeClient(networkSpy);

    mockClient.customers().create();

    verifyStripeRequest(
        (stripeRequest) -> {
          assert (stripeRequest.headers().firstValue("Stripe-Account").isPresent());
          assertEquals("acct", stripeRequest.headers().firstValue("Stripe-Account").get());
        });
  }

  @Test
  public void stripeClientWithStripeContextInV1Api() throws StripeException {

    StripeResponseGetterOptions options =
        StripeClient.builder()
            .setStripeContext("ctx")
            .setApiKey(TEST_API_KEY)
            .setApiBase(getStripeMockUrl())
            .buildOptions();

    httpClientSpy = Mockito.spy(new HttpURLConnectionClient());
    networkSpy = Mockito.spy(new LiveStripeResponseGetter(options, httpClientSpy));
    mockClient = new StripeClient(networkSpy);

    mockClient.customers().create();

    verifyStripeRequest(
        (stripeRequest) -> {
          assert (stripeRequest.headers().firstValue("Stripe-Context").isPresent());
          assertEquals("ctx", stripeRequest.headers().firstValue("Stripe-Context").get());
        });
  }

  @Test
  public void parseEventDeliveryAndPull()
      throws StripeException, InvalidKeyException, NoSuchAlgorithmException {
    StripeClient client = new StripeClient(networkSpy);

    // the existing stubRequest doesn't support rawRequest, so we'll stub manually here
    Mockito.doAnswer(
            invocation -> {
              RawApiRequest request = invocation.getArgument(0);
              String path = request.getPath();

              if (request.getMethod() == RequestMethod.GET) {
                if (path.equals("/v2/core/events/evt_234")) {
                  return new StripeResponse(
                      200,
                      HttpHeaders.of(Collections.emptyMap()),
                      "{\"id\": \"evt_234\", \"object\": \"v2.core.event\",\"type\": \"v1.billing.meter.error_report_triggered\",\"data\": {}}");
                } else if (path.equals("/v1/billing/meter/meter_123")) {
                  return new StripeResponse(
                      200,
                      HttpHeaders.of(Collections.emptyMap()),
                      "{\"id\": \"meter_123\", \"object\": \"billing.meter\", \"display_name\": \"Test Meter\"}");
                }
              }
              throw new Exception(
                  String.format(
                      "Unexpected rawRequest made: %s %s", request.getMethod(), request.getPath()));
            })
        .when(networkSpy)
        .rawRequest(Mockito.any());

    EventNotification eventNotification =
        EventNotification.fromJson(v2EventDeliveryWithRelatedObject, client);

    assertInstanceOf(V1BillingMeterErrorReportTriggeredEventNotification.class, eventNotification);

    V1BillingMeterErrorReportTriggeredEventNotification en =
        (V1BillingMeterErrorReportTriggeredEventNotification) eventNotification;

    assertInstanceOf(V1BillingMeterErrorReportTriggeredEvent.class, en.pull());
    assertInstanceOf(Meter.class, en.fetchRelatedObject());

    // we should have made 2 API requests
    ArgumentCaptor<RawApiRequest> requestCaptor = ArgumentCaptor.forClass(RawApiRequest.class);
    Mockito.verify(networkSpy, Mockito.times(2)).rawRequest(requestCaptor.capture());

    // and we should have included 'Stripe-Context' in both
    for (RawApiRequest v : requestCaptor.getAllValues()) {
      assertEquals("org_123", v.getOptions().getStripeContext());
    }
  }
}
