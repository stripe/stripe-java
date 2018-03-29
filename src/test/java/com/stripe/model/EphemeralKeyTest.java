package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.EphemeralKey;
import com.stripe.net.APIResource;
import com.stripe.net.LiveStripeResponseGetter;
import com.stripe.net.RequestOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EphemeralKeyTest extends BaseStripeTest {
  private String oldApiVersion;

  @Before
  public void mockStripeResponseGetter() {
    APIResource.setStripeResponseGetter(networkMock);
  }

  @After
  public void unmockStripeResponseGetter() {
    /* This needs to be done because tests aren't isolated in Java */
    APIResource.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

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

    EphemeralKey.create(params, options);

    verifyPost(EphemeralKey.class, "https://api.stripe.com/v1/ephemeral_keys", params, options);
    verifyNoMoreInteractions(networkMock);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testVersionlessCreate() throws StripeException {
    Stripe.apiVersion = null;

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("customer", "cus_123");

    final RequestOptions options = RequestOptions.getDefault();

    EphemeralKey.create(params, options);
  }

  @Test
  public void testDelete() throws StripeException {
    EphemeralKey key = new EphemeralKey();
    key.setId("ephkey_123");

    key.delete();

    verifyDelete(EphemeralKey.class, "https://api.stripe.com/v1/ephemeral_keys/ephkey_123");
    verifyNoMoreInteractions(networkMock);
  }

  @Test
  public void testDeserialize() throws StripeException, IOException {
    final String json = resource("ephemeral_key.json");
    EphemeralKey key = APIResource.GSON.fromJson(json, EphemeralKey.class);

    assertEquals(key.getId(), "ephkey_123");
    assertEquals(key.getObject(), "ephemeral_key");
    assertEquals(key.getCreated(), Long.valueOf(100));
    assertEquals(key.getExpires(), Long.valueOf(200));
    assertEquals(key.getLivemode(), false);
    assertEquals(key.getSecret(), "ek_test_hunter2");
    assertEquals(key.getAssociatedObjects().size(), 1);
    assertEquals(key.getAssociatedObjects().get(0).getType(), "customer");
    assertEquals(key.getAssociatedObjects().get(0).getId(), "cus_234");
  }

  @Test
  public void testJsonReserialization() throws StripeException {
    final String jsonString = "{\"foo\":5,\"bar\":[\"baz\",null]}";
    EphemeralKey key = APIResource.GSON.fromJson(jsonString, EphemeralKey.class);
    assertEquals(key.getRawJson(), jsonString);
  }
}
