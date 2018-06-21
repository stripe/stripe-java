package com.stripe.net;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.JsonSyntaxException;

import com.stripe.BaseStripeTest;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;
import com.stripe.net.Webhook;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WebhookTest extends BaseStripeTest {
  public static String secret = null;
  public static String payload = null;

  @Before
  public void setUpFixtures() throws IOException {
    secret = "whsec_test_secret";
    payload = "{\n  \"id\": \"evt_test_webhook\",\n  \"object\": \"event\"\n}";
  }

  public String generateSigHeader() throws UnsupportedEncodingException, NoSuchAlgorithmException,
      InvalidKeyException {
    final Map<String, Object> options = new HashMap<String, Object>();
    return generateSigHeader(options);
  }

  /**
   * Generates a {@code Stripe-Signature} header.
   *
   * @param options Options map to override default values
   * @return The contents of the generated header
   */
  public String generateSigHeader(Map<String, Object> options) throws UnsupportedEncodingException,
      NoSuchAlgorithmException, InvalidKeyException {
    final long timestamp = (options.get("timestamp") != null)
        ? ((Long) options.get("timestamp")).longValue() : Webhook.Util.getTimeNow();
    final String payload = (options.get("payload") != null)
        ? (String) options.get("payload") : WebhookTest.payload;
    final String secret = (options.get("secret") != null)
        ? (String) options.get("secret") : WebhookTest.secret;
    final String scheme = (options.get("scheme") != null)
        ? (String) options.get("scheme") : Webhook.Signature.EXPECTED_SCHEME;
    String signature = (String) options.get("signature");

    if (signature == null) {
      final String payloadToSign = String.format("%d.%s", timestamp, payload);
      signature = Webhook.Util.computeHmacSha256(secret, payloadToSign);
    }

    final String header = String.format("t=%d,%s=%s", timestamp, scheme, signature);
    return header;
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testValidJsonAndHeader() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    final Event event = Webhook.constructEvent(payload, sigHeader, secret);

    assertEquals("evt_test_webhook", event.getId());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testInvalidJson() throws SignatureVerificationException, UnsupportedEncodingException,
      NoSuchAlgorithmException, InvalidKeyException {
    final String payload = "this is not valid JSON";
    final Map<String, Object> options = new HashMap<String, Object>();
    options.put("payload", payload);
    final String sigHeader = generateSigHeader(options);

    Webhook.constructEvent(payload, sigHeader, secret);
  }

  @Test(expected = SignatureVerificationException.class)
  public void testValidJsonAndInvalidHeader() throws SignatureVerificationException {
    final String sigHeader = "bad_header";

    Webhook.constructEvent(payload, sigHeader, secret);
  }

  @Test
  public void testMalformedHeader() throws SignatureVerificationException {
    final String sigHeader = "i'm not even a real signature header";

    thrown.expect(SignatureVerificationException.class);
    thrown.expectMessage("Unable to extract timestamp and signatures from header");

    Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
  }

  @Test
  public void testNoSignaturesWithExpectedScheme() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<String, Object>();
    options.put("scheme", "v0");
    final String sigHeader = generateSigHeader(options);

    thrown.expect(SignatureVerificationException.class);
    thrown.expectMessage("No signatures found with expected scheme");

    Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
  }

  @Test
  public void testNoValidSignatureForPayload() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<String, Object>();
    options.put("signature", "bad_signature");
    final String sigHeader = generateSigHeader(options);

    thrown.expect(SignatureVerificationException.class);
    thrown.expectMessage("No signatures found matching the expected signature for payload");

    Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0);
  }

  @Test
  public void testTimestampOutsideTolerance() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<String, Object>();
    options.put("timestamp", Webhook.Util.getTimeNow() - 15);
    final String sigHeader = generateSigHeader(options);

    thrown.expect(SignatureVerificationException.class);
    thrown.expectMessage("Timestamp outside the tolerance zone");

    Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10);
  }

  @Test
  public void testValidHeaderAndSignature() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = generateSigHeader();

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10));
  }

  @Test
  public void testHeaderContainsValidSignature() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final String sigHeader = String.format("%s,v1=bad_signature", generateSigHeader());

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 10));
  }

  @Test
  public void testTimestampOffButNoTolerance() throws SignatureVerificationException,
      UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
    final Map<String, Object> options = new HashMap<String, Object>();
    options.put("timestamp", Long.valueOf(12345L));
    final String sigHeader = generateSigHeader(options);

    assertTrue(Webhook.Signature.verifyHeader(payload, sigHeader, secret, 0));
  }
}
