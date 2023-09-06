package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableMap;
import com.stripe.BaseStripeTest;
import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.RequestOptions.RequestOptionsBuilder;
import com.stripe.param.EphemeralKeyCreateParams;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class EphemeralKeyTest extends BaseStripeTest {

  @Test
  public void testCreateUntypedParamsSuccess() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");
    params.put("stripe-version", "foobar");

    final Map<String, Object> expectedParams = new HashMap<>();
    expectedParams.put("customer", "cus_123");

    final EphemeralKey key = EphemeralKey.create(params);

    assertNotNull(key);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/ephemeral_keys",
        expectedParams,
        RequestOptionsBuilder.unsafeSetStripeVersionOverride(RequestOptions.builder(), "foobar")
            .build());
  }

  @Test
  public void testCreateTypedParamsSuccess() throws StripeException {
    final EphemeralKeyCreateParams params =
            EphemeralKeyCreateParams.builder()
                    .setCustomer("cus_123")
                    .setStripeVersion("foobar")
                    .build();

    final Map<String, Object> expectedParams = new HashMap<>();
    expectedParams.put("customer", "cus_123");

    final EphemeralKey key = EphemeralKey.create(params);

    assertNotNull(key);
    verifyRequest(
            ApiResource.RequestMethod.POST,
            "/v1/ephemeral_keys",
            expectedParams,
            RequestOptionsBuilder.unsafeSetStripeVersionOverride(RequestOptions.builder(), "foobar")
                    .build());
  }

  @Test
  public void testCreateTypedParamsServiceSuccess() throws StripeException {
    final EphemeralKeyCreateParams params =
            EphemeralKeyCreateParams.builder()
                    .setCustomer("cus_123")
                    .setStripeVersion("foobar")
                    .build();

    final Map<String, Object> expectedParams = new HashMap<>();
    expectedParams.put("customer", "cus_123");

    final EphemeralKey key = new StripeClient(networkSpy).ephemeralKeys().create(params);

    assertNotNull(key);
    verifyRequest(
            ApiResource.RequestMethod.POST,
            "/v1/ephemeral_keys",
            expectedParams,
            RequestOptionsBuilder.unsafeSetStripeVersionOverride(RequestOptions.builder(), "foobar")
                    .build());
  }

  @Test
  public void testThrowExceptionCreateWithNullTypedParams() {
    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              EphemeralKey.create((EphemeralKeyCreateParams) null, RequestOptions.getDefault());
            });
    assertTrue(exception.getMessage().contains("Found null params"));
  }

  @Test
  public void testThrowExceptionWithBadTypedParams() throws StripeException {
    EphemeralKeyCreateParams createParams =
        EphemeralKeyCreateParams.builder()
            .setCustomer("cust_123")
            .setIssuingCard("card_123")
            .build();

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          EphemeralKey.create(createParams);
        });

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          EphemeralKey.create(createParams, RequestOptions.builder().build());
        });
  }

  @Test
  public void testThrowExceptionWithBadUntypedParams() throws StripeException {
    Map<String, Object> createParams = new HashMap<>();
    createParams.put("customer", "cust_123");
    createParams.put("issuing_card", "card_123");

    assertThrows(
            IllegalArgumentException.class,
            () -> {
              EphemeralKey.create(createParams);
            });

    assertThrows(
            IllegalArgumentException.class,
            () -> {
              EphemeralKey.create(createParams, RequestOptions.builder().build());
            });
  }

  @Test
  public void testThrowExceptionWithBadTypedParamsService() throws StripeException {
    StripeClient client = new StripeClient(networkSpy);
    assertThrows(
            IllegalArgumentException.class,
            () -> {
              EphemeralKeyCreateParams createParams =
                    EphemeralKeyCreateParams.builder().build();

              client.ephemeralKeys().create(createParams);
            });

    assertThrows(
            IllegalArgumentException.class,
            () -> {
              EphemeralKeyCreateParams createParams =
                      EphemeralKeyCreateParams.builder().putExtraParam("stripe-version", 5).build();

              client.ephemeralKeys().create(createParams, RequestOptions.builder().build());
            });
  }

  @Test
  public void testCreateWithTypedParamsAndExtraParam() throws IOException, StripeException {
    EphemeralKeyCreateParams createParams =
        EphemeralKeyCreateParams.builder()
            .setStripeVersion("foobarbaz")
            .putExtraParam("my_secret_parameter", "my_secret_value")
            .build();

    final Map<String, Object> paramsMap = new HashMap<>();
    paramsMap.put("my_secret_parameter", "my_secret_value");

    // stripe-mock doesn't handle extra parameters so we stub the request
    stubRequest(
        ApiResource.RequestMethod.POST,
        "/v1/ephemeral_keys",
        paramsMap,
        EphemeralKey.class,
        getResourceAsString("/api_fixtures/ephemeral_key.json"));

    final EphemeralKey key = EphemeralKey.create(createParams);

    assertNotNull(key);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/ephemeral_keys",
        ImmutableMap.of("my_secret_parameter", "my_secret_value"));
  }

  @Test
  public void testDelete() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");
    params.put("stripe-version", "foobar");

    final EphemeralKey key = EphemeralKey.create(params);

    final EphemeralKey deletedKey = key.delete();

    assertNotNull(deletedKey);
    verifyRequest(
        ApiResource.RequestMethod.DELETE, String.format("/v1/ephemeral_keys/%s", key.getId()));
  }
}
