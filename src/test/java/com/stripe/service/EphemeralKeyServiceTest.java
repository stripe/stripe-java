package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.google.common.collect.ImmutableMap;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.EphemeralKeyCreateParams;

import org.junit.jupiter.api.Test;

class EphemeralKeyServiceTest extends BaseStripeTest {
  private static final String EPHEMERAL_KEY_ID = "ephkey_123";

  private EphemeralKeyService service = new EphemeralKeyService();

  @Test
  public void testCreate() throws StripeException {
    EphemeralKeyCreateParams createParams = EphemeralKeyCreateParams
        .builder()
        .setCustomer("cust_123")
        .setIssuingCard("card_123")
        .build();

    // In actual usage, version override is likely different from the pinned API version.
    // Passing the same API version here to comply with stripe-mock `-strict-version-check`
    // flag--it errors on passing API version different from that in OpenAPI spec.
    final RequestOptions options = RequestOptions.builder()
        .setStripeVersionOverride(Stripe.API_VERSION).build();

    final EphemeralKey key = service.create(createParams, options);

    assertNotNull(key);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/ephemeral_keys",
        ImmutableMap.of(
            "customer", "cust_123",
            "issuing_card", "card_123"
        ),
        null,
        options
    );
  }

  @Test
  public void testCreateWithoutApiVersionOverride() {
    final RequestOptions options = RequestOptions.getDefault();
    assertNull(options.getStripeVersionOverride());

    EphemeralKeyCreateParams createParams = EphemeralKeyCreateParams.builder()
        .setCustomer("cust_123")
        .build();
    assertThrows(IllegalArgumentException.class, () -> {
      service.create(createParams, options);
    });
  }

  @Test
  public void testDelete() throws StripeException {
    final EphemeralKey deletedKey = service.delete(EPHEMERAL_KEY_ID, null);

    assertNotNull(deletedKey);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/ephemeral_keys/%s", deletedKey.getId()));
  }
}