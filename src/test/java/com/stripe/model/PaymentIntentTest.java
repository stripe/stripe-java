package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.PaymentIntent;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PaymentIntentTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final PaymentIntent resource = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    PaymentIntentSourceAction action =  resource.getNextSourceAction();
    assertNotNull(action);

    PaymentIntentSourceActionValueAuthorizeWithUrl actionValue =
        (PaymentIntentSourceActionValueAuthorizeWithUrl) action.getValue();
    assertNotNull(actionValue);
    assertEquals("https://stripe.com", actionValue.getUrl());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final PaymentIntent resource = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent_with_expansions.json"),
        PaymentIntent.class);

    assertNotNull(resource);
    assertNotNull(resource.getId());

    final Application application = resource.getApplicationObject();
    assertNotNull(application);
    assertNotNull(application.getId());
    assertEquals(resource.getApplication(), application.getId());
    final Customer customer = resource.getCustomerObject();
    assertNotNull(customer);
    assertNotNull(customer.getId());
    assertEquals(resource.getCustomer(), customer.getId());
    final ExternalAccount source = resource.getSourceObject();
    assertNotNull(source);
    assertNotNull(source.getId());
    assertEquals(resource.getSource(), source.getId());
  }
}
