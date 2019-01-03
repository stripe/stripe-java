package com.stripe.functional;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentIntentCollection;
import com.stripe.net.ApiResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class PaymentIntentTest extends BaseStripeTest {
  public static final String PAYMENT_INTENT_ID = "pi_123";

  private PaymentIntent getPaymentIntentFixture() throws StripeException {
    final PaymentIntent paymentIntent = PaymentIntent.retrieve(PAYMENT_INTENT_ID);
    resetNetworkSpy();
    return paymentIntent;
  }

  @Test
  public void testCreate() throws StripeException {
    final List<String> allowedSourceTypes = new ArrayList<>();
    allowedSourceTypes.add("card");

    final Map<String, Object> params = new HashMap<>();
    params.put("allowed_source_types", allowedSourceTypes);
    params.put("amount", 1234);
    params.put("currency", "usd");

    final PaymentIntent paymentIntent = PaymentIntent.create(params);

    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents"),
        params
    );
  }

  @Test
  public void testRetrieve() throws StripeException {
    final PaymentIntent paymentIntent = PaymentIntent.retrieve(PAYMENT_INTENT_ID);

    assertNotNull(paymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/payment_intents/%s", PAYMENT_INTENT_ID)
    );
  }

  @Test
  public void testUpdate() throws StripeException {
    final PaymentIntent paymentIntent = getPaymentIntentFixture();

    final Map<String, String> metadata = new HashMap<>();
    metadata.put("key", "value");
    final Map<String, Object> params = new HashMap<>();
    params.put("metadata", metadata);

    final PaymentIntent updatedPaymentIntent = paymentIntent.update(params);

    assertNotNull(updatedPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s", paymentIntent.getId()),
        params
    );
  }

  @Test
  public void testList() throws StripeException {
    final Map<String, Object> params = new HashMap<>();
    params.put("limit", 1);

    final PaymentIntentCollection paymentIntents = PaymentIntent.list(params);

    assertNotNull(paymentIntents);
    verifyRequest(
        ApiResource.RequestMethod.GET,
        String.format("/v1/payment_intents"),
        params
    );
  }

  @Test
  public void testCancel() throws StripeException {
    final PaymentIntent paymentIntent = getPaymentIntentFixture();
    final PaymentIntent cancelledPaymentIntent = paymentIntent.cancel();

    assertNotNull(cancelledPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/cancel", paymentIntent.getId())
    );
  }

  @Test
  public void testCapture() throws StripeException {
    final PaymentIntent paymentIntent = getPaymentIntentFixture();
    final PaymentIntent capturedPaymentIntent = paymentIntent.capture();

    assertNotNull(capturedPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/capture", paymentIntent.getId())
    );
  }

  @Test
  public void testConfirm() throws StripeException {
    final PaymentIntent paymentIntent = getPaymentIntentFixture();
    final PaymentIntent confirmedPaymentIntent = paymentIntent.confirm();

    assertNotNull(confirmedPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/confirm", paymentIntent.getId())
    );
  }
}
