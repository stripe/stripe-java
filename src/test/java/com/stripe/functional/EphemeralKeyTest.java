package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EphemeralKeyTest extends BaseStripeTest {
  public static final String KEY_ID = "ephkey_123";

  private String oldApiVersion;

  @Before
  public void saveOldStripeVersion() {
    oldApiVersion = Stripe.apiVersion;
  }

  @After
  public void restoreOldStripeVersion() {
    Stripe.apiVersion = oldApiVersion;
  }

  @Test
  public void testCreate() throws StripeException {
    Stripe.apiVersion = "2016-06-05";

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.builder().setStripeVersion("2017-05-25").build();

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
  public void testCreateWithoutApiVersion() throws StripeException {
    Stripe.apiVersion = null;

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.getDefault();

    EphemeralKey.create(params, options);
  }

  @Test
  public void testDelete() throws StripeException {
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.builder().setStripeVersion("2017-05-25").build();

    final EphemeralKey key = EphemeralKey.create(params, options);

    final EphemeralKey deletedKey = key.delete();

    assertNotNull(deletedKey);
    verifyRequest(
        ApiResource.RequestMethod.DELETE,
        String.format("/v1/ephemeral_keys/%s", key.getId())
    );
  }
}
