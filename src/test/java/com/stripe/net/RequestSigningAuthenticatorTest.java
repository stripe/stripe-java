package com.stripe.net;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;

public class RequestSigningAuthenticatorTest extends BaseStripeTest {
  Function<Long, RequestSigningAuthenticator.CurrentTimeInSecondsGetter> testCurrentTimeGetter =
      (l) -> {
        return new RequestSigningAuthenticator.CurrentTimeInSecondsGetter() {
          @Override
          public Long getCurrentTimeInSeconds() {
            return l;
          }
        };
      };

  @Test
  public void appliesSignatureToRequest() throws StripeException {
    List<byte[]> signatureBases = new ArrayList<>();

    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.POST,
            "http://example.com/get",
            ImmutableMap.of("string", "String!"),
            RequestOptions.builder()
                .setAuthenticator(
                    new RequestSigningAuthenticator("keyid") {
                      @Override
                      public byte[] sign(byte[] signatureBase) throws GeneralSecurityException {
                        signatureBases.add(signatureBase);
                        return new byte[] {1, 2, 3, 4, 5};
                      }
                    }.withCurrentTimeInSecondsGetter(testCurrentTimeGetter.apply(123456789L)))
                .build(),
            ApiMode.V2);

    assertEquals(
        "\"content-type\": application/json\n"
            + "\"content-digest\": sha-256=:HA3i38j+04ac71IzPtG1JK8o4q9sPK0fYPmJHmci5bg=:\n"
            + "\"stripe-context\": \n"
            + "\"stripe-account\": \n"
            + "\"authorization\": STRIPE-V2-SIG keyid\n"
            + "\"@signature-params\": (\"content-type\" \"content-digest\" \"stripe-context\" \"stripe-account\" \"authorization\");created=123456789",
        new String(signatureBases.get(0), StandardCharsets.UTF_8));
    assertEquals(
        "sig1=(\"content-type\" \"content-digest\" \"stripe-context\" \"stripe-account\" \"authorization\");"
            + "created=123456789",
        request.headers().firstValue("Signature-Input").get());
    assertEquals("sig1=:AQIDBAU=:", request.headers().firstValue("Signature").get());
    assertEquals(
        "sha-256=:HA3i38j+04ac71IzPtG1JK8o4q9sPK0fYPmJHmci5bg=:",
        request.headers().firstValue("Content-Digest").get());
    assertEquals("STRIPE-V2-SIG keyid", request.headers().firstValue("Authorization").get());
    assertEquals("application/json", request.headers().firstValue("Content-Type").get());
  }

  @Test
  public void appliesSignatureToGetRequest() throws StripeException {
    List<byte[]> signatureBases = new ArrayList<>();

    StripeRequest request =
        StripeRequest.create(
            ApiResource.RequestMethod.GET,
            "http://example.com/get",
            null,
            RequestOptions.builder()
                .setAuthenticator(
                    new RequestSigningAuthenticator("keyid") {
                      @Override
                      public byte[] sign(byte[] signatureBase) throws GeneralSecurityException {
                        signatureBases.add(signatureBase);
                        return new byte[] {1, 2, 3, 4, 5};
                      }
                    }.withCurrentTimeInSecondsGetter(testCurrentTimeGetter.apply(123456789L)))
                .build(),
            ApiMode.V2);

    assertEquals(
        "\"stripe-context\": \n"
            + "\"stripe-account\": \n"
            + "\"authorization\": STRIPE-V2-SIG keyid\n"
            + "\"@signature-params\": (\"stripe-context\" \"stripe-account\" \"authorization\");created=123456789",
        new String(signatureBases.get(0), StandardCharsets.UTF_8));
    assertEquals(
        "sig1=(\"stripe-context\" \"stripe-account\" \"authorization\");" + "created=123456789",
        request.headers().firstValue("Signature-Input").get());
    assertEquals("sig1=:AQIDBAU=:", request.headers().firstValue("Signature").get());
    assertEquals(false, request.headers().firstValue("Content-Digest").isPresent());
    assertEquals("STRIPE-V2-SIG keyid", request.headers().firstValue("Authorization").get());
  }

  @Test
  public void wrapsSecurityException() {
    StripeException exception =
        assertThrows(
            StripeException.class,
            () ->
                StripeRequest.create(
                    ApiResource.RequestMethod.POST,
                    "http://example.com/get",
                    ImmutableMap.of("string", "String!"),
                    RequestOptions.builder()
                        .setAuthenticator(
                            new RequestSigningAuthenticator("keyid") {
                              @Override
                              public byte[] sign(byte[] signatureBase)
                                  throws GeneralSecurityException {
                                throw new GeneralSecurityException("something bad happened");
                              }
                            })
                        .build(),
                    ApiMode.V2));

    assertEquals("Error calculating request signature.", exception.getMessage());
    assertEquals("something bad happened", exception.getCause().getMessage());
  }
}
