package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class EphemeralKeyTest extends BaseStripeTest {

  @Test
  public void testCreate() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.builder()
        .setStripeVersionOverride("2017-05-25").build();

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

  @Test
  public void testCreateWithoutApiVersionOverride() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.getDefault();
    assertNull(options.getStripeVersionOverride());

    assertThrows(IllegalArgumentException.class, () -> {
      EphemeralKey.create(params, options);
    });
  }

  @Test
  public void testDelete() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.builder()
        .setStripeVersionOverride("2017-05-25").build();

    final EphemeralKey key = EphemeralKey.create(params, options);

    final EphemeralKey deletedKey = key.delete();

    assertNotNull(deletedKey);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/ephemeral_keys/%s", key.getId())
    );
  }
}
