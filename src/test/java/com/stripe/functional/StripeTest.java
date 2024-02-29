package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import org.junit.jupiter.api.Test;

public class StripeTest extends BaseStripeTest {

  @Test
  public void testAddBetaVersion() {
    Stripe.stripeVersion = "2024-02-23";
    Stripe.addBetaVersion("super_cool_beta", "v1");
    assertEquals(Stripe.stripeVersion, "2024-02-23; super_cool_beta=v1");
    assertThrows(
        RuntimeException.class,
        () -> {
          Stripe.addBetaVersion("super_cool_beta", "v1");
        });
  }
}
