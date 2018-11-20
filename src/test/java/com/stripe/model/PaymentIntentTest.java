package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class PaymentIntentTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    // Keep the fixture to have `action` deserialize properly
    final PaymentIntent resource = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    PaymentIntentSourceAction action =  resource.getNextSourceAction();
    assertNotNull(action);

    assertEquals("authorize_with_url", action.getType());
    PaymentIntentSourceActionValueAuthorizeWithUrl actionAuthorize = action.getAuthorizeWithUrl();
    assertNotNull(actionAuthorize);
    assertEquals("https://stripe.com", actionAuthorize.getUrl());
    assertEquals("https://stripe.com/return", actionAuthorize.getReturnUrl());
  }

  @Test
  public void testDeserializeLastPaymentError() throws Exception {
    final PaymentIntent resource = ApiResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent_last_payment_error.json"),
        PaymentIntent.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());

    StripeError error =  resource.getLastPaymentError();
    assertNotNull(error);

    assertEquals("ch_123", error.getCharge());
    assertEquals("generic_decline", error.getDeclineCode());

    final PaymentSource source = error.getSource();
    assertNotNull(source);
    assertNotNull(source.getId());
  }

  @Test
  public void testDeserializeWithExpansions() throws Exception {
    final String[] expansions = {
      "application",
      "customer",
      "on_behalf_of",
      "review",
      "source",
      "transfer_data.destination",
    };

    final String data = getFixture("/v1/payment_intents/pi_123", expansions);
    final PaymentIntent resource = ApiResource.GSON.fromJson(data, PaymentIntent.class);

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
    final Account account = resource.getOnBehalfOfObject();
    assertNotNull(account);
    assertNotNull(account.getId());
    assertEquals(resource.getOnBehalfOf(), account.getId());
    final Review review = resource.getReviewObject();
    assertNotNull(review);
    assertNotNull(review.getId());
    assertEquals(resource.getReview(), review.getId());
    final PaymentSource source = resource.getSourceObject();
    assertNotNull(source);
    assertNotNull(source.getId());
    assertEquals(resource.getSource(), source.getId());

    final Account transferDestination = resource.getTransferData().getDestinationObject();
    assertNotNull(transferDestination);
    assertNotNull(transferDestination.getId());
    assertEquals(resource.getTransferData().getDestination(), transferDestination.getId());
  }
}
