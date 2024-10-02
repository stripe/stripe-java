package com.stripe.examples;

import com.stripe.StripeClient;
import com.stripe.model.v2.billing.MeterEventSession;
import com.stripe.param.v2.billing.MeterEventStreamCreateParams;
import java.time.Instant;

public class MeterEventManager {

  private String apiKey;
  private MeterEventSession meterEventSession;

  public MeterEventManager(String apiKey) {
    this.apiKey = apiKey;
  }

  @SuppressWarnings("CatchAndPrintStackTrace")
  private void refreshMeterEventSession() {
    if (meterEventSession == null || meterEventSession.getExpiresAt().isBefore(Instant.now())) {
      // Create a new meter event session in case the existing session expired
      try {
        StripeClient client = new StripeClient(apiKey);
        meterEventSession = client.v2().billing().meterEventSession().create();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  @SuppressWarnings("CatchAndPrintStackTrace")
  public void sendMeterEvent(String eventName, String stripeCustomerId, String value) {
    // Refresh the meter event session, if necessary
    refreshMeterEventSession();

    // Create a meter event

    MeterEventStreamCreateParams.Event eventParams =
        MeterEventStreamCreateParams.Event.builder()
            .setEventName(eventName)
            .putPayload("stripe_customer_id", stripeCustomerId)
            .putPayload("value", value)
            .build();
    MeterEventStreamCreateParams params =
        MeterEventStreamCreateParams.builder().addEvent(eventParams).build();

    try {
      StripeClient client = new StripeClient(meterEventSession.getAuthenticationToken());
      client.v2().billing().meterEventStream().create(params);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String apiKey = "{{API_KEY}}";
    String customerId = "{{CUSTOMER_ID}}"; // Replace with actual customer ID

    MeterEventManager manager = new MeterEventManager(apiKey);
    manager.sendMeterEvent("alpaca_ai_tokens", customerId, "28");
  }
}
