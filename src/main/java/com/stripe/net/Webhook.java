package com.stripe.net;

import com.google.gson.JsonObject;
import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;
import com.stripe.model.StripeObject;
import com.stripe.util.StringUtils;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Webhook {
  public static final long DEFAULT_TOLERANCE = 300;

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public static Event constructEvent(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    return constructEvent(payload, sigHeader, secret, DEFAULT_TOLERANCE);
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a JsonSyntaxException if the
   * payload is not valid JSON, and a SignatureVerificationException if the signature verification
   * fails for any reason.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance maximum difference in seconds allowed between the header's timestamp and the
   *     current time
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public static Event constructEvent(
      String payload, String sigHeader, String secret, long tolerance)
      throws SignatureVerificationException {
    return constructEvent(payload, sigHeader, secret, tolerance, null);
  }

  /**
   * Constructs a <a href="https://docs.stripe.com/event-destinations#snapshot-payload">snapshot
   * event</a> from an incoming webhook after verifying its authenticity. To work with a webhook
   * that has already been verified (i.e. one from a cloud provider, an asynchronous queue, or
   * during testing), see {@code constructEventWithoutVerification}.
   *
   * @param payload the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret secret used to generate the signature.
   * @param tolerance maximum difference in seconds allowed between the header's timestamp and the
   *     current time
   * @param clock instance of clock if you want to use custom time instance
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public static Event constructEvent(
      String payload, String sigHeader, String secret, long tolerance, Clock clock)
      throws SignatureVerificationException {
    Signature.verifyHeader(payload, sigHeader, secret, tolerance, clock);

    return buildV1Event(payload);
  }

  /**
   * Constructs a <a href="https://docs.stripe.com/event-destinations#snapshot-payload">snapshot
   * event</a> from an incoming webhook without first verifying its authenticity. Should be used
   * after calling {@code Webhook.Signature.verifyHeader(...)} or with input from a trusted source
   * (such as <a href="https://docs.stripe.com/event-destinations/eventbridge">AWS EventBridge</a>,
   * or <a href="https://docs.stripe.com/event-destinations/eventgrid">Azure Event Grid</a>
   * payload). Or, to verify &amp; construct in a single call, use {@code
   * Webhook.constructEvent(...)} instead.
   *
   * @param payload the payload sent by Stripe, or a cloud provider envelope wrapping it.
   * @return the Event instance
   * @throws IllegalArgumentException if the payload is a v2 thin event notification.
   */
  public static Event constructEventWithoutVerification(String payload) {
    return buildV1Event(maybeExtractFromCloudProviderEnvelope(payload));
  }

  private static Event buildV1Event(String payload) {
    return buildV1Event(ApiResource.GSON.fromJson(payload, JsonObject.class));
  }

  private static Event buildV1Event(JsonObject jsonObject) {
    if (jsonObject.has("object")
        && "v2.core.event".equals(jsonObject.get("object").getAsString())) {
      throw new IllegalArgumentException(
          "You passed an event notification to Webhook method, which expects a webhook payload. Use the corresponding parseEventNotification method instead.");
    }

    Event event =
        StripeObject.deserializeStripeObject(
            jsonObject, Event.class, ApiResource.getGlobalResponseGetter());

    // StripeObjects source their raw JSON object from their last response, but constructed webhooks
    // don't have that
    // in order to make the raw object available on parsed events, we fake the response.
    if (event.getLastResponse() == null) {
      event.setLastResponse(
          new StripeResponse(200, HttpHeaders.of(Collections.emptyMap()), jsonObject.toString()));
    }

    return event;
  }

  /**
   * Parses a JSON payload (or cloud provider envelope) and returns the inner Stripe event JSON
   * object. If the payload is already a raw Stripe event (object is "event" or "v2.core.event"), it
   * is returned as-is. If it is an AWS EventBridge or Azure Event Grid envelope, the inner event is
   * extracted. Throws {@link IllegalArgumentException} for unrecognized formats.
   *
   * @param payload the raw JSON string.
   * @return the inner event as a {@link JsonObject}.
   */
  public static JsonObject maybeExtractFromCloudProviderEnvelope(String payload) {
    JsonObject root = ApiResource.GSON.fromJson(payload, JsonObject.class);

    // AWS
    // https://docs.stripe.com/event-destinations/eventbridge#event-structure
    if (root.has("detail")) {
      return root.get("detail").getAsJsonObject();
    }

    // Azure
    // https://docs.stripe.com/event-destinations/eventgrid#event-structure
    if (root.has("specversion") && root.has("data")) {
      return root.get("data").getAsJsonObject();
    }

    // Raw Stripe event passed directly: pass through as-is
    if (root.has("object") && root.get("object").isJsonPrimitive()) {
      String object = root.get("object").getAsString();
      if ("event".equals(object) || "v2.core.event".equals(object)) {
        return root;
      }
    }

    throw new IllegalArgumentException(
        "Unrecognized event format. The payload must be an AWS EventBridge/Azure Event Grid event envelope or a Stripe webhook (thin event notification or snapshot).");
  }

  public static final class Signature {
    public static final String EXPECTED_SCHEME = "v1";

    /**
     * Verifies the signature header sent by Stripe. Throws a SignatureVerificationException if the
     * verification fails for any reason.
     *
     * @param payload the payload sent by Stripe.
     * @param sigHeader the contents of the signature header sent by Stripe.
     * @param secret secret used to generate the signature.
     * @param tolerance maximum difference allowed between the header's timestamp and the current
     *     time
     * @throws SignatureVerificationException if the verification fails.
     */
    public static boolean verifyHeader(
        String payload, String sigHeader, String secret, long tolerance)
        throws SignatureVerificationException {
      return verifyHeader(payload, sigHeader, secret, tolerance, null);
    }

    /**
     * Verifies the authenticity (and recency) of a webhook, throwing a {@code
     * SignatureVerificationException} if there's a mismatch. Useful for quickly validating incoming
     * webhooks before storing them for later processing (at which time you can use the {@code
     * *WithoutVerification} methods for parsing).
     *
     * @param payload the payload sent by Stripe.
     * @param sigHeader the contents of the signature header sent by Stripe.
     * @param secret secret used to generate the signature.
     * @param tolerance maximum difference allowed between the header's timestamp and the current
     *     time
     * @param clock instance of clock if you want to use custom time instance
     * @throws SignatureVerificationException if the verification fails.
     */
    public static boolean verifyHeader(
        String payload, String sigHeader, String secret, long tolerance, Clock clock)
        throws SignatureVerificationException {
      // Get timestamp and signatures from header
      long timestamp = getTimestamp(sigHeader);
      List<String> signatures = getSignatures(sigHeader, EXPECTED_SCHEME);
      if (timestamp <= 0) {
        throw new SignatureVerificationException(
            "Unable to extract timestamp and signatures from header", sigHeader);
      }
      if (signatures.size() == 0) {
        throw new SignatureVerificationException(
            "No signatures found with expected scheme", sigHeader);
      }

      if (isBlankWebhookSecret(secret)) {
        throw new SignatureVerificationException(
            "No webhook secret value was provided. It should start with `whsec_`", sigHeader);
      }

      // Compute expected signature
      String signedPayload = String.format("%d.%s", timestamp, payload);
      String expectedSignature;
      try {
        expectedSignature = computeSignature(signedPayload, secret);
      } catch (Exception e) {
        throw new SignatureVerificationException(
            "Unable to compute signature for payload", sigHeader);
      }

      // Check if expected signature is found in list of header's signatures
      boolean signatureFound = false;
      for (String signature : signatures) {
        if (StringUtils.secureCompare(expectedSignature, signature)) {
          signatureFound = true;
          break;
        }
      }
      if (!signatureFound) {
        throw new SignatureVerificationException(
            getSignatureErrorMessage(sigHeader, payload, secret), sigHeader);
      }

      long currentTime = clock == null ? Util.getTimeNow() : clock.millis() / 1000;

      // Check tolerance
      if ((tolerance > 0) && (timestamp < (currentTime - tolerance))) {
        throw new SignatureVerificationException("Timestamp outside the tolerance zone", sigHeader);
      }

      return true;
    }

    /**
     * Builds a signature verification error message using header metadata.
     *
     * @param sigHeader signature header value passed in by the user.
     * @param payload the payload passed in by the user.
     * @param secret signing secret passed in by the user.
     * @return the diagnostic or generic error message.
     */
    private static String getSignatureErrorMessage(
        String sigHeader, String payload, String secret) {
      DebugMetadata metadata = DebugMetadata.fromSignatureHeader(sigHeader);

      // If metadata has an asterisk-masked secret, compare only its length and last four characters
      String maskedSecret = metadata.secret == null ? "" : metadata.secret;
      int maskedLength = maskedSecret.length();
      int secretLength = secret.length();
      String maskedSuffix = maskedSecret.substring(Math.max(0, maskedLength - 4));
      String secretSuffix = secret.substring(Math.max(0, secretLength - 4));
      if (maskedSecret.contains("*")
          && (secretLength != maskedLength || !secretSuffix.equals(maskedSuffix))) {
        String dashboardUrl = "https://dashboard.stripe.com/webhooks";
        if (metadata.destination != null) {
          dashboardUrl += "/" + ApiResource.urlEncode(metadata.destination);
        }

        return String.format(
            Locale.ROOT,
            "Webhook signature verification failed. This request may not have originated from Stripe.\n\n"
                + "The signing secret you provided is %d characters long and ends in `%s`. "
                + "However, the signing secret for this destination is %d characters long and looks like `%s`. "
                + "Ensure you're using the signing secret for this destination, as shown on the Dashboard: %s\n\n"
                + "Learn more: https://docs.stripe.com/webhooks/signature",
            secretLength,
            secretSuffix,
            maskedLength,
            maskedSecret,
            dashboardUrl);
      }

      // If metadata includes the truncated payload hash, compare with the payload passed in
      if (metadata.payload != null && metadata.payload.matches("[0-9a-fA-F]{8}")) {
        String expectedHash = metadata.payload.toLowerCase(Locale.ROOT);
        byte[] hash;
        try {
          hash =
              MessageDigest.getInstance("SHA-256")
                  .digest(String.valueOf(payload).getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
          throw new AssertionError("SHA-256 is unavailable", e);
        }
        StringBuilder actualHash = new StringBuilder(8);
        for (int i = hash.length - 4; i < hash.length; i++) {
          actualHash.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        if (!expectedHash.contentEquals(actualHash)) {
          return String.format(
              Locale.ROOT,
              "Webhook signature verification failed.\n\n"
                  + "The request body you passed to this function differs from the request body sent by Stripe "
                  + "to this webhook destination.\n"
                  + "The SHA-256 hash of the body should end in `%s`. "
                  + "However, the SHA-256 hash of the body you provided ends in `%s`.\n\n"
                  + "Make sure your code does not reformat or otherwise alter the raw HTTP request body "
                  + "before passing it to this function.\n\n"
                  + "Learn more: https://docs.stripe.com/webhooks/signature",
              expectedHash,
              actualHash);
        }
      }

      // Fall back to the generic message if no debug metadata is available
      return "No signatures found matching the expected signature for payload";
    }

    private static final class DebugMetadata {
      private final String secret;
      private final String destination;
      private final String payload;

      private DebugMetadata(String secret, String destination, String payload) {
        this.secret = secret;
        this.destination = destination;
        this.payload = payload;
      }

      /**
       * Extracts metadata from the signature header to help debug verification failures.
       *
       * @param value signature header value passed in by the user.
       * @return recognized fields, with unusable values set to null.
       */
      private static DebugMetadata fromSignatureHeader(String value) {
        // For each metadata key, extract the first value found in the header.
        Map<String, String> metadata = new HashMap<>();
        for (String item : value.split(",\\s*", -1)) {
          String[] parts = item.split("=", 2);
          String key = parts[0];
          if ((key.equals("secret") || key.equals("destination") || key.equals("payload"))
              && !metadata.containsKey(key)) {
            String metadataValue = parts.length == 2 ? parts[1] : null;
            metadataValue = isSafeMetadataValue(metadataValue) ? metadataValue.trim() : null;
            metadata.put(
                key, metadataValue == null || metadataValue.isEmpty() ? null : metadataValue);
          }
        }
        return new DebugMetadata(
            metadata.get("secret"), metadata.get("destination"), metadata.get("payload"));
      }

      /**
       * @param value an optional header metadata value.
       * @return whether the value is usable for diagnostics.
       */
      private static boolean isSafeMetadataValue(String value) {
        // Ignore overly long, potentially attacker-provided metadata values.
        return value != null && value.length() <= 100;
      }
    }

    /**
     * Generates a {@code Stripe-Signature} header for the given payload and secret using the
     * current timestamp.
     *
     * @param payload the payload to sign.
     * @param secret the webhook secret.
     * @return the generated signature header string.
     */
    public static String generateSignatureHeader(String payload, String secret)
        throws NoSuchAlgorithmException, InvalidKeyException {
      return generateSignatureHeader(payload, secret, Util.getTimeNow());
    }

    /**
     * Compute the {@code Stripe-Signature} header for a given webhook body &amp; secret. Useful for
     * signing payloads in unit tests.
     *
     * @param payload the payload to sign.
     * @param secret the webhook secret.
     * @param timestamp the timestamp to use (seconds since epoch).
     * @return the generated signature header string.
     */
    public static String generateSignatureHeader(String payload, String secret, long timestamp)
        throws NoSuchAlgorithmException, InvalidKeyException {
      String payloadToSign = String.format("%d.%s", timestamp, payload);
      String signature = computeSignature(payloadToSign, secret);
      return String.format("t=%d,%s=%s", timestamp, EXPECTED_SCHEME, signature);
    }

    /**
     * Extracts the timestamp in a signature header.
     *
     * @param sigHeader the signature header
     * @return the timestamp contained in the header.
     */
    private static long getTimestamp(String sigHeader) {
      String[] items = sigHeader.split(",", -1);

      for (String item : items) {
        String[] itemParts = item.split("=", 2);
        if (itemParts[0].equals("t")) {
          return Long.parseLong(itemParts[1]);
        }
      }

      return -1;
    }

    /**
     * Extracts the signatures matching a given scheme in a signature header.
     *
     * @param sigHeader the signature header
     * @param scheme the signature scheme to look for.
     * @return the list of signatures matching the provided scheme.
     */
    private static List<String> getSignatures(String sigHeader, String scheme) {
      List<String> signatures = new ArrayList<String>();
      String[] items = sigHeader.split(",", -1);

      for (String item : items) {
        String[] itemParts = item.split("=", 2);
        if (itemParts[0].equals(scheme)) {
          signatures.add(itemParts[1]);
        }
      }

      return signatures;
    }

    private static boolean isBlankWebhookSecret(String secret) {
      if (secret == null || secret.isEmpty()) {
        return true;
      }

      for (int i = 0; i < secret.length(); i++) {
        char character = secret.charAt(i);
        if (character != ' '
            && character != '\t'
            && character != '\r'
            && character != '\n'
            && character != '\f'
            && character != '\u000B') {
          return false;
        }
      }
      return true;
    }

    /**
     * Computes the signature for a given payload and secret.
     *
     * <p>The current scheme used by Stripe ("v1") is HMAC/SHA-256.
     *
     * @param payload the payload to sign.
     * @param secret the secret used to generate the signature.
     * @return the signature as a string.
     */
    private static String computeSignature(String payload, String secret)
        throws NoSuchAlgorithmException, InvalidKeyException {
      return Util.computeHmacSha256(secret, payload);
    }
  }

  public static final class Util {
    /**
     * Computes the HMAC/SHA-256 code for a given key and message.
     *
     * @param key the key used to generate the code.
     * @param message the message.
     * @return the code as a string.
     */
    public static String computeHmacSha256(String key, String message)
        throws NoSuchAlgorithmException, InvalidKeyException {
      Mac hasher = Mac.getInstance("HmacSHA256");
      hasher.init(new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
      byte[] hash = hasher.doFinal(message.getBytes(StandardCharsets.UTF_8));
      String result = "";
      for (byte b : hash) {
        result += Integer.toString((b & 0xff) + 0x100, 16).substring(1);
      }
      return result;
    }

    /**
     * Returns the current UTC timestamp in seconds.
     *
     * @return the timestamp as a long.
     */
    public static long getTimeNow() {
      long time = System.currentTimeMillis() / 1000L;
      return time;
    }
  }
}
