package com.stripe.net;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonObject;
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

  public static String generateSigHeader() throws NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    return generateSigHeader(options);
  }

  /**
   * Generates a {@code Stripe-Signature} header.
   *
   * @param options Options map to override default values
   * @return The contents of the generated header
   */
  public static String generateSigHeader(Map<String, Object> options)
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

    String header = String.format("t=%d,%s=%s", timestamp, scheme, signature);
    if (options.get("debugMetadata") != null) {
      header += "," + options.get("debugMetadata");
    }
    return header;
  }

  @Test
  public void testValidJsonAndHeader()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

    final Event event = Webhook.constructEvent(payload, sigHeader, secret);

    assertEquals("evt_test_webhook", event.getId());
  }

  @Test
  public void testValidJsonAndHeaderButOutsideTimeTolerance()
      throws NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret, 1L);
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

    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

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
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

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
  public void testEmptySecret()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, "", 0, null);
            });
    assertEquals(
        "No webhook secret value was provided. It should start with `whsec_`",
        exception.getMessage());
  }

  @Test
  public void testNullSecret()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    Throwable exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> {
              Webhook.Signature.verifyHeader(payload, sigHeader, null, 0, null);
            });
    assertEquals(
        "No webhook secret value was provided. It should start with `whsec_`",
        exception.getMessage());
  }

  @Test
  public void testWhitespaceOnlySecrets() throws NoSuchAlgorithmException, InvalidKeyException {
    String[] blankSecrets = {" ", "\t", "\r", "\n", "\f", "\u000B", " \t\r\n\f\u000B"};

    for (String blankSecret : blankSecrets) {
      final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, blankSecret);
      Throwable exception =
          assertThrows(
              SignatureVerificationException.class,
              () -> Webhook.Signature.verifyHeader(payload, sigHeader, blankSecret, 0, null));
      assertEquals(
          "No webhook secret value was provided. It should start with `whsec_`",
          exception.getMessage());
    }
  }

  @Test
  public void testSecretWithSurroundingWhitespaceIsNotNormalized()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    final String secretWithWhitespace = " \twhsec_test_secret\r\n";
    final String sigHeader =
        Webhook.Signature.generateSignatureHeader(payload, secretWithWhitespace);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secretWithWhitespace, 0, null));
  }

  @Test
  public void testNonBreakingSpaceOnlySecretIsNotBlank()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    final String nonBreakingSpaceSecret = "\u00A0";
    final String sigHeader =
        Webhook.Signature.generateSignatureHeader(payload, nonBreakingSpaceSecret);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, nonBreakingSpaceSecret, 0, null));
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
  public void testSigningSecretMismatchDiagnostics()
      throws NoSuchAlgorithmException, InvalidKeyException {
    String[][] cases = {
      // A mismatched secret links to the supplied destination.
      {
        "whsec_abcdefghijklmnopqrstuvwxyz",
        "whsec_****************************1q84",
        "we_123",
        "wxyz",
        "/we_123"
      },
      // A missing destination uses the bare Dashboard URL.
      {
        "whsec_abcdefghijklmnopqrstuvwxyz", "whsec_****************************1q84", "", "wxyz", ""
      },
      // A matching suffix is not enough if the lengths differ.
      {"short1q84", "whsec_****************************1q84", "", "1q84", ""},
      // A mostly unmasked value still reveals only the last four secret characters.
      {"whsec_abcdefghijklmnopqrstuvwxyz", "whsec_*bcdefghijklmnopqrstuvwxyZ", "", "wxyz", ""},
      // A secret shorter than four characters is shown in full.
      {"abc", "*", "", "abc", ""}
    };
    for (String[] testCase : cases) {
      Map<String, Object> options = new HashMap<>();
      options.put("signature", "bad_signature");
      options.put("debugMetadata", "secret=" + testCase[1] + ",destination=" + testCase[2]);
      String sigHeader = generateSigHeader(options);

      SignatureVerificationException exception =
          assertThrows(
              SignatureVerificationException.class,
              () -> Webhook.Signature.verifyHeader(payload, sigHeader, testCase[0], 0));
      assertEquals(
          "Webhook signature verification failed. This request may not have originated from Stripe.\n\n"
              + "The signing secret you provided is "
              + testCase[0].length()
              + " characters long and ends in `"
              + testCase[3]
              + "`. However, the signing secret for this destination is "
              + testCase[1].length()
              + " characters long and looks like `"
              + testCase[1]
              + "`. Ensure you're using the signing secret for this destination, as shown on the Dashboard: "
              + "https://dashboard.stripe.com/webhooks"
              + testCase[4]
              + "\n\nLearn more: https://docs.stripe.com/webhooks/signature",
          exception.getMessage());
    }
  }

  @Test
  public void testPayloadMismatchDiagnostics()
      throws NoSuchAlgorithmException, InvalidKeyException {
    Map<String, Object> options = new HashMap<>();
    options.put("payload", "hello");
    options.put("debugMetadata", "secret=whsec_*******cret,payload=938B9824");
    String sigHeader = generateSigHeader(options);

    // User supplies the original body with an extra trailing space.
    SignatureVerificationException exception =
        assertThrows(
            SignatureVerificationException.class,
            () -> Webhook.Signature.verifyHeader("hello ", sigHeader, secret, 0));
    assertEquals(
        "Webhook signature verification failed.\n\n"
            + "The request body you passed to this function differs from the request body sent by Stripe "
            + "to this webhook destination.\n"
            + "The SHA-256 hash of the body should end in `938b9824`. However, "
            + "the SHA-256 hash of the body you provided ends in `64dfc461`.\n\n"
            + "Make sure your code does not reformat or otherwise alter the raw HTTP request body "
            + "before passing it to this function.\n\n"
            + "Learn more: https://docs.stripe.com/webhooks/signature",
        exception.getMessage());
  }

  @Test
  public void testUnusablePayloadMetadataFallsBackToGenericError()
      throws NoSuchAlgorithmException, InvalidKeyException {
    String[] cases = {
      "payload=",
      "payload,payload=00000000",
      "payload=not-hex,payload=00000000",
      "payload=1234567",
      "payload=123456789",
      "payload=1234567g",
      "payload=1234567\n",
      "payload=" + new String(new char[101]).replace('\0', 'a') + ",payload=00000000"
    };
    for (String metadata : cases) {
      Map<String, Object> options = new HashMap<>();
      options.put("signature", "bad_signature");
      options.put("debugMetadata", metadata);
      String sigHeader = generateSigHeader(options);

      SignatureVerificationException exception =
          assertThrows(
              SignatureVerificationException.class,
              () -> Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0));
      assertEquals(
          "No signatures found matching the expected signature for payload",
          exception.getMessage());
    }
  }

  @Test
  public void testMatchingMetadataFallsBackToGenericError()
      throws NoSuchAlgorithmException, InvalidKeyException {
    String[] cases = {
      "payload=938B9824",
      "secret=whsec_*******cret",
      "secret=other*xxxx_secret",
      "secret=other_*******cret,payload=938b9824",
      "secret=whsec_*******cret,secret=*wrong,payload=938b9824,payload=00000000"
    };
    for (String metadata : cases) {
      Map<String, Object> options = new HashMap<>();
      options.put("signature", "bad_signature");
      options.put("debugMetadata", metadata);
      String sigHeader = generateSigHeader(options);

      SignatureVerificationException exception =
          assertThrows(
              SignatureVerificationException.class,
              () -> Webhook.Signature.verifyHeader("hello", sigHeader, secret, 0));
      assertEquals(
          "No signatures found matching the expected signature for payload",
          exception.getMessage());
    }
  }

  @Test
  public void testValidSignatureIgnoresConflictingMetadata()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    Map<String, Object> options = new HashMap<>();
    options.put("debugMetadata", "secret=*wrong,destination=arbitrary,payload=00000000");
    String sigHeader = generateSigHeader(options);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10));
  }

  @Test
  public void testTimestampOutsideTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader =
        Webhook.Signature.generateSignatureHeader(payload, secret, Webhook.Util.getTimeNow() - 15);

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
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, null));
  }

  @Test
  public void testHeaderContainsValidSignature()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader =
        String.format(
            "%s,v1=bad_signature", Webhook.Signature.generateSignatureHeader(payload, secret));

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, null));
  }

  @Test
  public void testTimestampOffButNoTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret, 12345L);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0, null));
  }

  @Test
  public void testTimestampWithClock()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret, 11L);
    final Clock clock = Clock.fixed(Instant.ofEpochMilli(1), ZoneId.of("UTC"));

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10, clock));
  }

  @Test
  public void testTimestampWithClockOutsideTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret, 11L);
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

    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

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

    final String sigHeader = Webhook.Signature.generateSignatureHeader(payload, secret);

    final Event event = client.constructEvent(payload, sigHeader, secret, 500);

    final Reader reader = (Reader) event.getDataObjectDeserializer().getObject().get();
    reader.delete();

    Mockito.verify(responseGetter).request(Mockito.any(), Mockito.any());
  }

  @Test
  public void testConstructEventWithRawJson()
      throws StripeException, NoSuchAlgorithmException, InvalidKeyException {

    final Event event =
        Webhook.constructEvent(
            payload, Webhook.Signature.generateSignatureHeader(payload, secret), secret);

    assertNotNull(event.getRawJsonObject());
  }

  @Test
  public void testGenerateSignatureHeaderWithTimestamp()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    final long timestamp = 1609459200L;
    final String header = Webhook.Signature.generateSignatureHeader(payload, secret, timestamp);

    assertTrue(Webhook.Signature.verifyHeader(payload, header, secret, 0, null));
    assertTrue(header.startsWith(String.format("t=%d,v1=", timestamp)));
  }

  @Test
  public void testGenerateSignatureHeaderWithCurrentTimestamp()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    final String header = Webhook.Signature.generateSignatureHeader(payload, secret);

    assertTrue(Webhook.Signature.verifyHeader(payload, header, secret, 10, null));
  }

  @Test
  public void testGenerateSignatureHeaderRoundtrip()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    String payload = "test_payload";
    String secret = "whsec_test_secret";
    String header = Webhook.Signature.generateSignatureHeader(payload, secret);
    // Should not throw:
    assertTrue(Webhook.Signature.verifyHeader(payload, header, secret, 300));
  }

  @Test
  public void testParseEventNotification()
      throws NoSuchAlgorithmException, InvalidKeyException, SignatureVerificationException {
    StripeClient client = new StripeClient(new LiveStripeResponseGetter());

    final String v2Payload =
        "{\n"
            + "  \"id\": \"evt_test_webhook\",\n"
            + "  \"object\": \"v2.core.event\",\n"
            + "  \"type\": \"v1.billing.meter.no_meter_found\",\n"
            + "  \"livemode\": false,\n"
            + "  \"created\": \"2022-02-15T00:27:45.330Z\"\n"
            + "}";

    final String header = Webhook.Signature.generateSignatureHeader(v2Payload, secret);

    final com.stripe.model.v2.core.EventNotification notification =
        client.parseEventNotification(v2Payload, header, secret);

    assertNotNull(notification);
    assertEquals("evt_test_webhook", notification.getId());
  }

  @Test
  public void testMaybeExtractPassesThroughV1Event() {
    final String v1Payload = "{\"id\": \"evt_test_webhook\", \"object\": \"event\"}";
    final JsonObject result = Webhook.maybeExtractFromCloudProviderEnvelope(v1Payload);
    assertEquals("event", result.get("object").getAsString());
  }

  @Test
  public void testMaybeExtractPassesThroughV2Event() {
    final String v2Payload = "{\"id\": \"evt_test_webhook\", \"object\": \"v2.core.event\"}";
    final JsonObject result = Webhook.maybeExtractFromCloudProviderEnvelope(v2Payload);
    assertEquals("v2.core.event", result.get("object").getAsString());
  }

  @Test
  public void testMaybeExtractThrowsForUnrecognizedFormat() {
    final String unknownPayload = "{\"id\": \"evt_test_webhook\", \"object\": \"something_else\"}";
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          Webhook.maybeExtractFromCloudProviderEnvelope(unknownPayload);
        });
  }

  @Test
  public void testConstructEventWithoutVerification() {
    final Event event = Webhook.constructEventWithoutVerification(payload);

    assertNotNull(event);
    assertEquals("evt_test_webhook", event.getId());
  }

  @Test
  public void testConstructEventWithoutVerificationRejectsV2Payload() {
    final String v2Payload =
        "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"v2.core.event\"\n}";

    Throwable exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              Webhook.constructEventWithoutVerification(v2Payload);
            });
    assertTrue(exception.getMessage().contains("parseEventNotification"));
  }

  @Test
  public void testConstructEventRejectsV2Payload()
      throws NoSuchAlgorithmException, InvalidKeyException {
    final String v2Payload =
        "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"v2.core.event\"\n}";
    final String sigHeader = Webhook.Signature.generateSignatureHeader(v2Payload, secret);

    Throwable exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              Webhook.constructEvent(v2Payload, sigHeader, secret);
            });
    assertTrue(exception.getMessage().contains("parseEventNotification"));
  }

  @Test
  public void testClientConstructEventRejectsV2Payload()
      throws NoSuchAlgorithmException, InvalidKeyException {
    StripeClient client = new StripeClient(new LiveStripeResponseGetter());

    final String v2Payload =
        "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"v2.core.event\"\n}";
    final String sigHeader = Webhook.Signature.generateSignatureHeader(v2Payload, secret);

    Throwable exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              client.constructEvent(v2Payload, sigHeader, secret);
            });
    assertTrue(exception.getMessage().contains("parseEventNotification"));
  }
}
