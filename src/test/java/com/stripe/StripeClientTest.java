package com.stripe;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.ThinEvent;
import com.stripe.model.terminal.Reader;
import com.stripe.net.*;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
  public void checksWebhookSignature()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);

    ThinEvent e = client.parseThinEvent(payload, signature, secret);
    assertEquals(e.getId(), "evt_test_webhook");
  }

  @Test
  public void failsWebhookVerification()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {
    StripeClient client = new StripeClient("sk_123");

    String payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
    String secret = "whsec_test_secret";
    String signature = "bad signature";

    assertThrows(
        SignatureVerificationException.class,
        () -> {
          client.parseThinEvent(payload, signature, secret);
        });
  }

  static final String v2PushEventWithRelatedObject =
      "{\n"
          + "  \"id\": \"evt_234\",\n"
          + "  \"object\": \"event\",\n"
          + "  \"type\": \"financial_account.balance.opened\",\n"
          + "  \"livemode\": false,\n"
          + "  \"created\": \"2022-02-15T00:27:45.330Z\",\n"
          + "  \"context\": \"context 123\",\n"
          + "  \"related_object\": {\n"
          + "    \"id\": \"fa_123\",\n"
          + "    \"type\": \"financial_account\",\n"
          + "    \"url\": \"/v2/financial_accounts/fa_123\",\n"
          + "    \"stripe_context\": \"acct_123\"\n"
          + "  }\n"
          + "}";

  static final String v2PushEventWithoutRelatedObject =
      "{\n"
          + "  \"id\": \"evt_234\",\n"
          + "  \"object\": \"event\",\n"
          + "  \"type\": \"financial_account.balance.opened\",\n"
          + "  \"livemode\": false,\n"
          + "  \"created\": \"2022-02-15T00:27:45.330Z\"\n"
          + "}";

  @Test
  public void parsesThinEventWithoutRelatedObject()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {

    StripeClient client = new StripeClient("sk_123");

    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", v2PushEventWithoutRelatedObject);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);
    ThinEvent baseThinEvent =
        client.parseThinEvent(v2PushEventWithoutRelatedObject, signature, secret);
    assertNotNull(baseThinEvent);
    assertEquals("evt_234", baseThinEvent.getId());
    assertEquals("financial_account.balance.opened", baseThinEvent.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), baseThinEvent.created);
    assertNull(baseThinEvent.context);
    assertNull(baseThinEvent.relatedObject);
  }

  @Test
  public void parsesThinEventWithRelatedObject()
      throws InvalidKeyException, NoSuchAlgorithmException, SignatureVerificationException {

    StripeClient client = new StripeClient("sk_123");

    String secret = "whsec_test_secret";

    Map<String, Object> options = new HashMap<>();
    options.put("payload", v2PushEventWithRelatedObject);
    options.put("secret", secret);

    String signature = WebhookTest.generateSigHeader(options);
    ThinEvent baseThinEvent =
        client.parseThinEvent(v2PushEventWithRelatedObject, signature, secret);
    assertNotNull(baseThinEvent);
    assertEquals("evt_234", baseThinEvent.getId());
    assertEquals("financial_account.balance.opened", baseThinEvent.getType());
    assertEquals(Instant.parse("2022-02-15T00:27:45.330Z"), baseThinEvent.created);
    assertEquals("context 123", baseThinEvent.context);
    assertNotNull(baseThinEvent.relatedObject);
    assertEquals("fa_123", baseThinEvent.relatedObject.id);
    assertEquals("financial_account", baseThinEvent.relatedObject.type);
    assertEquals("/v2/financial_accounts/fa_123", baseThinEvent.relatedObject.url);
  }
}
