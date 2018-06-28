package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentIntentCollection;
import com.stripe.net.APIResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PaymentIntentTest extends BaseStripeTest {
  public static final String PAYMENT_INTENT_ID = "po_123";

  @Test
  public void testCreate() throws  IOException, StripeException {
    final List<String> allowedSourcetypes = new ArrayList<String>();
    allowedSourcetypes.add("card");

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("allowed_source_types", allowedSourcetypes);
    params.put("amount", 1234);
    params.put("currency", "usd");

    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents"),
        params,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent paymentIntent = PaymentIntent.create(params);

    assertNotNull(paymentIntent);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents"),
        params
    );
  }

  @Test
  public void testRetrieve() throws  IOException, StripeException {
    stubRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/payment_intents/%s", PAYMENT_INTENT_ID),
        null,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent paymentIntent = PaymentIntent.retrieve(PAYMENT_INTENT_ID);

    assertNotNull(paymentIntent);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/payment_intents/%s", PAYMENT_INTENT_ID)
    );
  }

  @Test
  public void testUpdate() throws  IOException, StripeException {
    final PaymentIntent paymentIntent = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);

    final Map<String, String> metadata = new HashMap<String, String>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("metadata", metadata);

    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s", paymentIntent.getId()),
        params,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent updatedPaymentIntent = paymentIntent.update(params);

    assertNotNull(updatedPaymentIntent);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s", paymentIntent.getId()),
        params
    );
  }

  @Test
  public void testList() throws  IOException, StripeException {
    final PaymentIntent stubbedPaymentIntent = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);
    final PaymentIntentCollection stubbedCollection = new PaymentIntentCollection();
    final List<PaymentIntent> stubbedData = new ArrayList<PaymentIntent>();
    stubbedData.add(stubbedPaymentIntent);
    stubbedCollection.setData(stubbedData);

    final Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 1);

    stubRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/payment_intents"),
        params,
        PaymentIntentCollection.class,
        stubbedCollection.toJson()
    );

    final PaymentIntentCollection paymentIntents = PaymentIntent.list(params);

    assertNotNull(paymentIntents);
    verifyRequest(
        APIResource.RequestMethod.GET,
        String.format("/v1/payment_intents"),
        params
    );
  }

  @Test
  public void testCancel() throws  IOException, StripeException {
    final PaymentIntent paymentIntent = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);

    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/cancel", paymentIntent.getId()),
        null,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent cancelledPaymentIntent = paymentIntent.cancel();

    assertNotNull(cancelledPaymentIntent);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/cancel", paymentIntent.getId())
    );
  }

  @Test
  public void testCapture() throws  IOException, StripeException {
    final PaymentIntent paymentIntent = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);

    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/capture", paymentIntent.getId()),
        null,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent captureledPaymentIntent = paymentIntent.capture();

    assertNotNull(captureledPaymentIntent);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/capture", paymentIntent.getId())
    );
  }

  @Test
  public void testConfirm() throws  IOException, StripeException {
    final PaymentIntent paymentIntent = APIResource.GSON.fromJson(
        getResourceAsString("/api_fixtures/payment_intent.json"), PaymentIntent.class);

    stubRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/confirm", paymentIntent.getId()),
        null,
        PaymentIntent.class,
        getResourceAsString("/api_fixtures/payment_intent.json")
    );

    final PaymentIntent confirmledPaymentIntent = paymentIntent.confirm();

    assertNotNull(confirmledPaymentIntent);
    verifyRequest(
        APIResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/confirm", paymentIntent.getId())
    );
  }
}
