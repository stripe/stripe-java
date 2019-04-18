package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.net.ApiResource;
import com.stripe.param.PaymentIntentCaptureParams;
import com.stripe.param.PaymentIntentConfirmParams;

import org.junit.jupiter.api.Test;

class PaymentIntentServiceTest extends BaseStripeTest {
  private static final String PAYMENT_INTENT_ID = "pi_123";

  private PaymentIntentService paymentIntentService = new PaymentIntentService();

  @Test
  public void testCapture() throws StripeException {
    final PaymentIntent capturedPaymentIntent = paymentIntentService
        .capture(PAYMENT_INTENT_ID, PaymentIntentCaptureParams.builder().build());

    assertNotNull(capturedPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/capture", PAYMENT_INTENT_ID)
    );
  }

  @Test
  public void testConfirm() throws StripeException {
    final PaymentIntent confirmedPaymentIntent = paymentIntentService
        .confirm(PAYMENT_INTENT_ID, PaymentIntentConfirmParams.builder().build());

    assertNotNull(confirmedPaymentIntent);
    verifyRequest(
        ApiResource.RequestMethod.POST,
        String.format("/v1/payment_intents/%s/confirm", PAYMENT_INTENT_ID)
    );
  }
}