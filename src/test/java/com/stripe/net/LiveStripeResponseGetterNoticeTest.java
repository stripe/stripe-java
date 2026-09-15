package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import org.junit.jupiter.api.Test;

public class LiveStripeResponseGetterNoticeTest {
  private static final HttpHeaders NOTICE_HEADERS =
      HttpHeaders.of(
          Collections.singletonMap("Stripe-Notice", Collections.singletonList("test notice")));

  @Test
  public void testTellsHumansHowToSuppressNotices() {
    assertEquals(
        Optional.of(
            "test notice\nTo suppress Stripe notices in test and sandbox environments, set the STRIPE_SUPPRESS_NOTICES environment variable to true."),
        LiveStripeResponseGetter.buildStripeNoticeMessage(NOTICE_HEADERS, key -> null));
  }

  @Test
  public void testSuppressesNoticesForHumans() {
    for (String value : new String[] {"true", "TRUE"}) {
      assertEquals(
          Optional.empty(),
          LiveStripeResponseGetter.buildStripeNoticeMessage(
              NOTICE_HEADERS, environmentWith("STRIPE_SUPPRESS_NOTICES", value)));
    }
  }

  @Test
  public void testDoesNotSuppressNoticesForOtherValues() {
    for (String value : new String[] {"", "false", "1", "invalid"}) {
      assertEquals(
          Optional.of(
              "test notice\nTo suppress Stripe notices in test and sandbox environments, set the STRIPE_SUPPRESS_NOTICES environment variable to true."),
          LiveStripeResponseGetter.buildStripeNoticeMessage(
              NOTICE_HEADERS, environmentWith("STRIPE_SUPPRESS_NOTICES", value)));
    }
  }

  @Test
  public void testDoesNotSuppressNoticesForAIAgents() {
    Map<String, String> environment = new HashMap<>();
    environment.put("STRIPE_SUPPRESS_NOTICES", "true");
    environment.put("CODEX_SANDBOX", "1");

    assertEquals(
        Optional.of("test notice"),
        LiveStripeResponseGetter.buildStripeNoticeMessage(NOTICE_HEADERS, environment::get));
  }

  private static Function<String, String> environmentWith(String key, String value) {
    return requestedKey -> requestedKey.equals(key) ? value : null;
  }
}
