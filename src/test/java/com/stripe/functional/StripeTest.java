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

    // Add the same beta version again
    Stripe.addBetaVersion("super_cool_beta", "v1");
    assertEquals(
      Stripe.getStripeVersionWithBetaHeaders(), Stripe.API_VERSION + "; super_cool_beta=v1");

    // Add a higher beta version
    Stripe.addBetaVersion("super_cool_beta", "v3");
    assertEquals(
      Stripe.getStripeVersionWithBetaHeaders(), Stripe.API_VERSION + "; super_cool_beta=v3");

    // Add a lower beta version
    Stripe.addBetaVersion("super_cool_beta", "v2");
    assertEquals(
      Stripe.getStripeVersionWithBetaHeaders(), Stripe.API_VERSION + "; super_cool_beta=v3");
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

    Stripe.addBetaVersion("super_hot_beta", "v1");
    assertEquals(
      Stripe.API_VERSION + "; super_cool_beta=v1; super_hot_beta=v2",
      Stripe.getStripeVersionWithBetaHeaders());

    Stripe.addBetaVersion("super_cool_beta", "v11");
    assertEquals(
      Stripe.API_VERSION + "; super_hot_beta=v1; super_cool_beta=v11",
      Stripe.getStripeVersionWithBetaHeaders());
  }
}
