package com.stripe.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
import org.junit.jupiter.api.Test;

public class StripeTest extends BaseStripeTest {

  @Test
  public void testAddBetaVersion() {
    Stripe.addBetaVersion("super_cool_beta", "v1");
    assertNotEquals(Stripe.stripeVersion, Stripe.API_VERSION + "; super_cool_beta=v1");
    assertEquals(
        Stripe.getStripeVersionWithBetaHeaders(), Stripe.API_VERSION + "; super_cool_beta=v1");
    assertThrows(
        RuntimeException.class,
        () -> {
          Stripe.addBetaVersion("super_cool_beta", "v1");
        });
  }

  @Test
  public void testAddSecondBetaVersion() {
    Stripe.addBetaVersion("super_cool_beta", "v1");
    assertNotEquals(Stripe.stripeVersion, Stripe.API_VERSION + "; super_cool_beta=v1");
    assertEquals(
        Stripe.API_VERSION + "; super_cool_beta=v1", Stripe.getStripeVersionWithBetaHeaders());

    Stripe.addBetaVersion("super_hot_beta", "v2");
    assertNotEquals(Stripe.stripeVersion, Stripe.API_VERSION + "; super_cool_beta=v1");
    assertEquals(
        Stripe.API_VERSION + "; super_cool_beta=v1; super_hot_beta=v2",
        Stripe.getStripeVersionWithBetaHeaders());
    assertThrows(
        RuntimeException.class,
        () -> {
          Stripe.addBetaVersion("super_hot_beta", "v1");
        });
  }
}
