package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.StripeClient;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import com.stripe.model.Event;
import com.stripe.model.terminal.Reader;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

public class WebhookTest extends BaseStripeTest {
  public static String secret = null;
  public static String payload = null;

  @BeforeEach
  public void setUpFixtures() {
    secret = "whsec_test_secret";
    payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
  }

  public String generateSigHeader() throws NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    return generateSigHeader(options);
  }

  /**
   * Generates a {@code Stripe-Signature} header.
   *
   * @param options Options map to override default values
   * @return The contents of the generated header
   */
  public String generateSigHeader(Map<String, Object> options)
      throws NoSuchAlgorithmException, InvalidKeyException {
    final long timestamp =
        (options.get("timestamp") != null)
            ? ((Long) options.get("timestamp")).longValue()
            : Webhook.Util.getTimeNow();
    final String payload =
        (options.get("payload") != null) ? (String) options.get("payload") : WebhookTest.payload;
    final String secret =
        (options.get("secret") != null) ? (String) options.get("secret") : WebhookTest.secret;
    final String scheme =
        (options.get("scheme") != null)
            ? (String) options.get("scheme")
            : Webhook.Signature.EXPECTED_SCHEME;
    String signature = (String) options.get("signature");

    if (signature == null) {
      final String payloadToSign = String.format("%d.%s", timestamp, payload);
      signature = Webhook.Util.computeHmacSha256(secret, payloadToSign);
    }

    final String header = String.format("t=%d,%s=%s", timestamp, scheme, signature);
    return header;
  }

  @Test
  public void testValidJsonAndHeader()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    final Event event = Webhook.constructEvent(payload, sigHeader, secret);

    assertEquals("evt_test_webhook", event.getId());
  }

  @Test
  public void testValidJsonAndHeaderButOutsideTimeTolerance()
      throws NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", 1L);

    final String sigHeader = generateSigHeader(options);
    final Clock clock = Clock.fixed(Instant.ofEpochMilli(12000), ZoneId.of("UTC"));

    assertThrows(
        SignatureVerificationException.class,
        () -> {
          Webhook.constructEvent(payload, sigHeader, secret, 10, clock);
        });
  }

  @Test
  @SuppressWarnings("deprecation")
  public void testValidJsonAndHeaderCanMakeRequestsOnDataObject()
      throws StripeException, NoSuchAlgorithmException, InvalidKeyException {
    final String payload =
        "{\"id\": \"evt_test_webhook\",\"api_version\":\""
            + Stripe.API_VERSION
            + "\","
            + "\"object\": \"event\",\"data\": {\"object\": {\"id\": \"acct_123\",\"object\": \"account\"}}}";

    final Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    final String sigHeader = generateSigHeader(options);

    final Event event = Webhook.constructEvent(payload, sigHeader, secret);
    Account modelViaData = ((Account) event.getData().getObject());
    modelViaData.delete();

    Account modelViaDOD = ((Account) event.getDataObjectDeserializer().getObject().get());
    modelViaDOD.delete();
  }

  @Test
  public void testInvalidJson()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String payload = "this is not valid JSON";
    final Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    final String sigHeader = generateSigHeader(options);

    assertThrows(
        JsonSyntaxException.class,
        () -> {
          Webhook.constructEvent(payload, sigHeader, secret);
        });
  }

  @Test
  public void testValidJsonAndInvalidHeader() throws SignatureVerificationException {
    final String sigHeader = "bad_header";

    assertThrows(
        SignatureVerificationException.class,
        () -> {
          Webhook.constructEvent(payload, sigHeader, secret);
        });
  }

  @Test
  public void testMalformedHeader() throws SignatureVerificationException {
    final String sigHeader = "i'm not even a real signature header";

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0, null);
            });
    assertEquals("Unable to extract timestamp and signatures from header", exception.getMessage());
  }

  @Test
  public void testNoSignaturesWithExpectedScheme()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("scheme", "v0");
    final String sigHeader = generateSigHeader(options);

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0, null);
            });
    assertEquals("No signatures found with expected scheme", exception.getMessage());
  }

  @Test
  public void testNoValidSignatureForPayload()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("signature", "bad_signature");
    final String sigHeader = generateSigHeader(options);

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0, null);
            });
    assertEquals(
        "No signatures found matching the expected signature for payload", exception.getMessage());
  }

  @Test
  public void testTimestampOutsideTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", Webhook.Util.getTimeNow() - 15);
    final String sigHeader = generateSigHeader(options);

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, null);
            });
    assertEquals("Timestamp outside the tolerance zone", exception.getMessage());
  }

  @Test
  public void testValidHeaderAndSignature()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, null));
  }

  @Test
  public void testHeaderContainsValidSignature()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = String.format("%s,v1=bad_signature", generateSigHeader());

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, null));
  }

  @Test
  public void testTimestampOffButNoTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", Long.valueOf(12345L));
    final String sigHeader = generateSigHeader(options);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0, null));
  }

  @Test
  public void testTimestampWithClock()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {

    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", 11L);

    final String sigHeader = generateSigHeader(options);
    final Clock clock = Clock.fixed(Instant.ofEpochMilli(1), ZoneId.of("UTC"));

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, clock));
  }

  @Test
  public void testTimestampWithClockOutsideTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {

    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", 11L);

    final String sigHeader = generateSigHeader(options);
    final Clock clock = Clock.fixed(Instant.ofEpochMilli(12), ZoneId.of("UTC"));

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, clock));
  }

  @Test
  public void testStripeClientConstructEvent()
      throws StripeException, NoSuchAlgorithmException, InvalidKeyException {
    StripeResponseGetter responseGetter = Mockito.spy(new LiveStripeResponseGetter());
    StripeClient client = new StripeClient(responseGetter);

    Mockito.doAnswer((Answer<Reader>) invocation -> new Reader())
        .when(responseGetter)
        .request(
            Mockito.<ApiRequest>argThat(
                (req) ->
                    req.getMethod().equals(ApiResource.RequestMethod.DELETE)
                        && req.getPath().equals("/v1/terminal/readers/rdr_123")),
            Mockito.<Type>any());

    final String payload =
        "{\"id\": \"evt_test_webhook\",\"api_version\":\""
            + Stripe.API_VERSION
            + "\","
            + "\"object\": \"event\",\"data\": {\"object\": {\"id\": \"rdr_123\",\"object\": \"terminal.reader\"}}}";

    final Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    final String sigHeader = generateSigHeader(options);

    final Event event = client.constructEvent(payload, sigHeader, secret);

    final Reader reader = (Reader) event.getDataObjectDeserializer().getObject().get();
    reader.delete();

    Mockito.verify(responseGetter).request(Mockito.any(), Mockito.any());
  }

  @Test
  public void testStripeClientConstructEventWithTolerance()
      throws StripeException, NoSuchAlgorithmException, InvalidKeyException {
    StripeResponseGetter responseGetter = Mockito.spy(new LiveStripeResponseGetter());
    StripeClient client = new StripeClient(responseGetter);

    Mockito.doAnswer((Answer<Reader>) invocation -> new Reader())
        .when(responseGetter)
        .request(
            Mockito.argThat(
                (req) ->
                    req.getMethod().equals(ApiResource.RequestMethod.DELETE)
                        && req.getPath().equals("/v1/terminal/readers/rdr_123")),
            Mockito.any());

    final String payload =
        "{\"id\": \"evt_test_webhook\",\"api_version\":\""
            + Stripe.API_VERSION
            + "\","
            + "\"object\": \"event\",\"data\": {\"object\": {\"id\": \"rdr_123\",\"object\": \"terminal.reader\"}}}";

    final Map<String, Object> options = new HashMap<>();
    options.put("payload", payload);
    final String sigHeader = generateSigHeader(options);

    final Event event = client.constructEvent(payload, sigHeader, secret, 500);

    final Reader reader = (Reader) event.getDataObjectDeserializer().getObject().get();
    reader.delete();

    Mockito.verify(responseGetter).request(Mockito.any(), Mockito.any());
  }
}
