package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.JsonSyntaxException;
import com.stripe.BaseStripeTest;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
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
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
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
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
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
              Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10);
            });
    assertEquals("Timestamp outside the tolerance zone", exception.getMessage());
  }

  @Test
  public void testValidHeaderAndSignature()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10));
  }

  @Test
  public void testHeaderContainsValidSignature()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = String.format("%s,v1=bad_signature", generateSigHeader());

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10));
  }

  @Test
  public void testTimestampOffButNoTolerance()
      throws SignatureVerificationException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<>();
    options.put("timestamp", Long.valueOf(12345L));
    final String sigHeader = generateSigHeader(options);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0));
  }
}
