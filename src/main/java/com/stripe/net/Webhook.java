package com.stripe.net;

import com.stripe.exception.SignatureVerificationException;
import com.stripe.model.Event;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Webhook {
  private static final long DEFAULT_TOLERANCE = 300;

  /**
   * Returns an Event instance using the provided JSON payload. Throws a
   * JsonSyntaxException if the payload is not valid JSON, and a
   * SignatureVerificationException if the signature verification fails for
   * any reason.
   *
   * @param payload   the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret    secret used to generate the signature.
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public static Event constructEvent(String payload, String sigHeader, String secret)
      throws SignatureVerificationException {
    return constructEvent(payload, sigHeader, secret, DEFAULT_TOLERANCE);
  }

  /**
   * Returns an Event instance using the provided JSON payload. Throws a
   * JsonSyntaxException if the payload is not valid JSON, and a
   * SignatureVerificationException if the signature verification fails for
   * any reason.
   *
   * @param payload   the payload sent by Stripe.
   * @param sigHeader the contents of the signature header sent by Stripe.
   * @param secret    secret used to generate the signature.
   * @param tolerance maximum difference in seconds allowed between the header's
   *                  timestamp and the current time
   * @return the Event instance
   * @throws SignatureVerificationException if the verification fails.
   */
  public static Event constructEvent(String payload, String sigHeader, String secret,
      long tolerance) throws SignatureVerificationException {
    Event event = ApiResource.GSON.fromJson(payload, Event.class);
    Signature.verifyHeader(payload, sigHeader, secret, tolerance);
    return event;
  }

  public static final class Signature {
    public static final String EXPECTED_SCHEME = "v1";

    /**
     * Verifies the signature header sent by Stripe. Throws a
     * SignatureVerificationException if the verification fails for any reason.
     *
     * @param payload   the payload sent by Stripe.
     * @param sigHeader the contents of the signature header sent by Stripe.
     * @param secret    secret used to generate the signature.
     * @param tolerance maximum difference allowed between the header's
     *                  timestamp and the current time
     * @throws SignatureVerificationException if the verification fails.
     */
    public static boolean verifyHeader(String payload, String sigHeader, String secret,
        long tolerance) throws SignatureVerificationException {
      // Get timestamp and signatures from header
      long timestamp = getTimestamp(sigHeader);
      List<String> signatures = getSignatures(sigHeader, EXPECTED_SCHEME);
      if (timestamp <= 0) {
        throw new SignatureVerificationException(
            "Unable to extract timestamp and signatures from header", sigHeader);
      }
      if (signatures.size() == 0) {
        throw new SignatureVerificationException("No signatures found with expected scheme",
            sigHeader);
      }

      // Compute expected signature
      String signedPayload = String.format("%d.%s", timestamp, payload);
      String expectedSignature;
      try {
        expectedSignature = computeSignature(signedPayload, secret);
      } catch (Exception e) {
        throw new SignatureVerificationException("Unable to compute signature for payload",
            sigHeader);
      }

      // Check if expected signature is found in list of header's signatures
      Boolean signatureFound = false;
      for (String signature : signatures) {
        if (Util.secureCompare(expectedSignature, signature)) {
          signatureFound = true;
          break;
        }
      }
      if (!signatureFound) {
        throw new SignatureVerificationException(
            "No signatures found matching the expected signature for payload", sigHeader);
      }

      // Check tolerance
      if ((tolerance > 0) && (timestamp < (Util.getTimeNow() - tolerance))) {
        throw new SignatureVerificationException("Timestamp outside the tolerance zone", sigHeader);
      }

      return true;
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
     * @param scheme    the signature scheme to look for.
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

    /**
     * Computes the signature for a given payload and secret.
     *
     * <p>The current scheme used by Stripe ("v1") is HMAC/SHA-256.
     *
     * @param payload the payload to sign.
     * @param secret  the secret used to generate the signature.
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
     * @param key     the key used to generate the code.
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
     * Compares two strings for equality. The time taken is independent of the
     * number of characters that match.
     *
     * @param a one of the strings to compare.
     * @param b the other string to compare.
     * @return true if the strings are equal, false otherwise.
     */
    public static boolean secureCompare(String a, String b) {
      byte[] digesta = a.getBytes(StandardCharsets.UTF_8);
      byte[] digestb = b.getBytes(StandardCharsets.UTF_8);

      return MessageDigest.isEqual(digesta, digestb);
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
