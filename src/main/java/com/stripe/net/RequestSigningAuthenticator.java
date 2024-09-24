package com.stripe.net;

import com.stripe.exception.AuthenticationException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;

public abstract class RequestSigningAuthenticator implements Authenticator {
  @FunctionalInterface
  interface CurrentTimeInSecondsGetter {
    Long getCurrentTimeInSeconds();
  }

  private CurrentTimeInSecondsGetter currentTimeInSecondsGetter =
      new CurrentTimeInSecondsGetter() {
        @Override
        public Long getCurrentTimeInSeconds() {
          return java.time.Clock.systemUTC().millis() / 1000;
        }
      };
  private static final String authorizationHeaderName = "Authorization";
  private static final String stripeContextHeaderName = "Stripe-Context";
  private static final String stripeAccountHeaderName = "Stripe-Account";
  private static final String contentDigestHeaderName = "Content-Digest";
  private static final String signatureInputHeaderName = "Signature-Input";
  private static final String signatureHeaderName = "Signature";
  private static final String[] coveredHeaders =
      new String[] {
        "Content-Type",
        contentDigestHeaderName,
        stripeContextHeaderName,
        stripeAccountHeaderName,
        authorizationHeaderName
      };

  private static final String[] coveredHeadersGet =
      new String[] {stripeContextHeaderName, stripeAccountHeaderName, authorizationHeaderName};

  private static final String coveredHeaderFormatted;
  private static final String coveredHeaderGetFormatted;

  static {
    coveredHeaderFormatted = formatCoveredHeaders(coveredHeaders);
    coveredHeaderGetFormatted = formatCoveredHeaders(coveredHeadersGet);
  }

  private final String keyId;

  public RequestSigningAuthenticator(String keyId) {
    this.keyId = keyId;
  }

  @Override
  public final StripeRequest authenticate(StripeRequest request) throws AuthenticationException {
    if (request.content() != null) {
      request =
          request.withAdditionalHeader(
              contentDigestHeaderName, calculateDigestHeader(request.content()));
    }

    final Long created = this.currentTimeInSecondsGetter.getCurrentTimeInSeconds();
    request =
        request
            .withAdditionalHeader(authorizationHeaderName, String.format("STRIPE-V2-SIG %s", keyId))
            .withAdditionalHeader(
                signatureInputHeaderName,
                String.format("sig1=%s", calculateSignatureInput(request.method(), created)));

    final byte[] signatureBase = calculateSignatureBase(request, created);
    String signature;

    try {
      signature = Base64.getEncoder().encodeToString(sign(signatureBase));
    } catch (GeneralSecurityException e) {
      throw new AuthenticationException("Error calculating request signature.", null, null, 0, e);
    }
    request =
        request.withAdditionalHeader(signatureHeaderName, String.format("sig1=:%s:", signature));

    return request;
  }

  public abstract byte[] sign(byte[] signatureBase) throws GeneralSecurityException;

  RequestSigningAuthenticator withCurrentTimeInSecondsGetter(CurrentTimeInSecondsGetter getter) {
    this.currentTimeInSecondsGetter = getter;
    return this;
  }

  private String calculateDigestHeader(HttpContent content) {
    MessageDigest messageDigest;
    try {
      messageDigest = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException(
          "Error calculating request digest: your Java installation does not provide the SHA-256 digest algorithm, which is necessary for sending secure requests to Stripe.",
          e);
    }

    String digest =
        Base64.getEncoder().encodeToString(messageDigest.digest(content.byteArrayContent()));
    return String.format("sha-256=:%s:", digest);
  }

  private byte[] calculateSignatureBase(StripeRequest request, Long created) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] headers =
        request.method() == ApiResource.RequestMethod.GET ? coveredHeadersGet : coveredHeaders;
    for (String header : headers) {
      List<String> values = request.headers().allValues(header);

      stringBuilder.append('"').append(header.toLowerCase()).append("\": ");
      boolean firstValue = true;
      for (String value : values) {
        if (firstValue) {
          firstValue = false;
        } else {
          stringBuilder.append(",");
        }
        stringBuilder.append(value);
      }

      stringBuilder.append('\n');
    }

    stringBuilder.append("\"@signature-params\": ");
    appendSignatureInput(stringBuilder, request.method(), created);

    return stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
  }

  private String calculateSignatureInput(ApiResource.RequestMethod method, Long created) {
    StringBuilder stringBuilder = new StringBuilder();
    appendSignatureInput(stringBuilder, method, created);
    return stringBuilder.toString();
  }

  private void appendSignatureInput(
      StringBuilder stringBuilder, ApiResource.RequestMethod method, Long created) {
    stringBuilder
        .append(
            method == ApiResource.RequestMethod.GET
                ? coveredHeaderGetFormatted
                : coveredHeaderFormatted)
        .append(";created=")
        .append(created);
  }

  private static String formatCoveredHeaders(String[] headers) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('(');
    boolean first = true;
    for (String header : headers) {
      if (first) {
        first = false;
      } else {
        stringBuilder.append(' ');
      }
      stringBuilder.append('"').append(header.toLowerCase()).append('"');
    }
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}
