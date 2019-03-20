package com.stripe.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class EphemeralKeyTest extends BaseStripeTest {

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    // In actual usage, version override is likely different from the pinned API version.
    // Passing the same API version here to comply with stripe-mock `-strict-version-check`
    // flag--it errors on passing API version different from that in OpenAPI spec.
    final RequestOptions options = RequestOptions.builder()
        .setStripeVersionOverride(Stripe.API_VERSION).build();

    final EphemeralKey key = EphemeralKey.create(params, options);

    assertNotNull(key);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        "/v1/ephemeral_keys",
        params,
        null,
        options
    );
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreateWithoutApiVersionOverride() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.getDefault();
    assertNull(options.getStripeVersionOverride());

    EphemeralKey.create(params, options);
  }

  @Test
  public void testDelete() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    // Passing the same API version here to comply with stripe-mock `-strict-version-check`
    // flag--it errors on passing API version different from that in OpenAPI spec.
    final RequestOptions options = RequestOptions.builder()
        .setStripeVersionOverride(Stripe.API_VERSION).build();

    final EphemeralKey key = EphemeralKey.create(params, options);

    final EphemeralKey deletedKey = key.delete();

    assertNotNull(deletedKey);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/ephemeral_keys/%s", key.getId())
    );
  }
}
